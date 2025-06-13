import xml.etree.ElementTree as ET
import re

# Paths (update if needed)
import os
BASE_DIR = os.path.dirname(os.path.abspath(__file__))
TOOLCHAIN_PATH = os.path.join(BASE_DIR, 'toolchain.xml')
SPEC_PATH = os.path.join(BASE_DIR, '..', 'org.oasis.oslcop.sysml.oslc-domain-model', 'sysmlDomainSpecification.xml')

# 1. Parse sysmlDomainSpecification.xml and build a label->id map
def build_label_id_map(spec_path):
    tree = ET.parse(spec_path)
    root = tree.getroot()
    label_id = {}
    for elem in root.iter():
        id_ = elem.attrib.get('id')
        name = elem.attrib.get('name')
        title = elem.attrib.get('title')
        if id_:
            if name:
                label_id[name] = id_
            if title:
                label_id[title] = id_
    print(f"Label->ID map: {label_id}")
    return label_id

# 2. Update toolchain.xml references
def fix_references(toolchain_path, label_id_map):
    with open(toolchain_path, encoding='utf-8') as f:
        xml = f.read()
    print("--- ORIGINAL XML (first 500 chars) ---")
    print(xml[:500])


    # Print all lines containing sysmlDomainSpecification.xml#_
    print("--- Lines with sysmlDomainSpecification.xml#_ ---")
    for line in xml.splitlines():
        if 'sysmlDomainSpecification.xml#_' in line:
            print(line)

    # Simpler regex: match any sysmlDomainSpecification.xml# followed by the full id (including dashes, etc)
    pattern = re.compile(r'(sysmlDomainSpecification\.xml#)([^"\s<]+)')

    # Print all matches for debugging
    matches = list(pattern.finditer(xml))
    print(f"Found {len(matches)} matches:")
    for m in matches:
        print(f"  At pos {m.start()}: {m.group(0)}")

    def extract_domain_class(label):
        """
        Extracts the likely domain class/entity from a label, title, or name string.
        Handles common patterns like:
          - 'Servive Provider for Components' -> 'Component'
          - 'Component QueryCapability' -> 'Component'
          - 'RelationshipService' -> 'Relationship'
          - 'Element SelectionDialog' -> 'Element'
          - 'ClassService' -> 'Class'
        """
        import re
        if not label:
            return None
        # Remove common suffixes/prefixes
        patterns = [
            r'Servive Provider for (.+?)s?$',
            r'(.+?) QueryCapability',
            r'(.+?) SelectionDialog',
            r'(.+?)Service',
            r'(.+?) Dialog',
            r'(.+?)s$',  # Plural to singular
            r'(.+?)$',   # Fallback: use as is
        ]
        for pat in patterns:
            m = re.match(pat, label)
            if m:
                # Return the first group, capitalized
                return m.group(1).strip().rstrip('s').capitalize()
        return label.capitalize()

    def find_label_before(pos):
        # Look backwards for a label/title/name attribute in the previous 500 chars
        window = xml[max(0, pos-500):pos]
        m = re.search(r'(label|title|name)="([^\"]+)",?', window)
        if m:
            print(f"Found label/title/name before pos {pos}: {m.group(2)}")
            return m.group(2)
        # Try to infer from webServices/serviceProviders block
        block = window[-200:]
        m2 = re.search(r'<webServices[^>]*name="([^\"]+)"', block)
        if m2:
            print(f"Inferred from webServices name: {m2.group(1)}")
            return m2.group(1)
        m3 = re.search(r'<serviceProviders[^>]*title="([^\"]+)"', block)
        if m3:
            print(f"Inferred from serviceProviders title: {m3.group(1)}")
            return m3.group(1)
        print(f"No label/title/name found before pos {pos}")
        return None

    def replacer(match):
        prefix, old_id = match.groups()
        pos = match.start()
        label = find_label_before(pos)
        domain_class = extract_domain_class(label) if label else None
        print(f"Reference found at pos {pos}: old_id={old_id}, label={label}, domain_class={domain_class}")
        new_id = None
        if domain_class:
            # Try exact match first (case-insensitive)
            for k, v in label_id_map.items():
                if k.lower() == domain_class.lower():
                    new_id = v
                    break
            if not new_id:
                # Try partial/fuzzy match: look for any key in domain_class (case-insensitive)
                matches = [k for k in label_id_map if k.lower() in domain_class.lower() or domain_class.lower() in k.lower()]
                if matches:
                    best = max(matches, key=len)
                    new_id = label_id_map[best]
                    print(f"Partial match: '{best}' in '{domain_class}' -> {new_id}")
        if new_id:
            print(f"Replacing {old_id} with {new_id} for domain_class {domain_class}")
            return f'{prefix}{new_id}'
        else:
            print(f"No replacement for {old_id} (domain_class: {domain_class})")
            return match.group(0)

    new_xml = pattern.sub(replacer, xml)
    print("--- MODIFIED XML (first 500 chars) ---")
    print(new_xml[:500])
    if new_xml != xml:
        print("Changes detected, writing to file.")
    else:
        print("No changes detected, file will not be updated.")
    with open(toolchain_path, 'w', encoding='utf-8') as f:
        f.write(new_xml)

if __name__ == '__main__':
    label_id_map = build_label_id_map(SPEC_PATH)
    fix_references(TOOLCHAIN_PATH, label_id_map)
    print("References updated successfully.")