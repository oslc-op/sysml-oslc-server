import urllib
import httplib2
from xml.dom.minidom import parse, parseString
import xml.etree.ElementTree as ET
from xml.etree.ElementTree import QName
import json
import getpass

# Read the SysML.uml metamodel resource
headers = {}
#headers['Accept'] = 'application/xml'
http = httplib2.Http(".cache", disable_ssl_certificate_validation=True)
http.follow_redirects = True

"""
userId = input("Input your jazz.net credentials...\nUser ID: ")
password = getpass.getpass()
http.add_credentials(userId, password)
url = 'https://raw.githubusercontent.com/ModelDriven/SysML-v2-Pilot-Implementation/master/org.omg.sysml/model/SysML.uml?token=AAIQFKWYK5EQ2NY7VHRH2RK6STF4A'
resp, content = http.request(url, 'GET', headers=headers)
assert (resp.status == 200), f"Unable to access resource SysML metamodel, status: {resp.status}"
"""
# Namespaces used in the .uml file
ns = {
	'xmi': 'http://www.omg.org/spec/XMI/20131001',
	'uml': 'http://www.eclipse.org/uml2/5.0.0/UML'
}

jsonld = """
{
  "@context": {
	  "xsd": {"@id": "http://www.w3.org/2001/XMLSchema#", "@prefix": true},
	  "rdf":   {"@id": "http://www.w3.org/1999/02/22-rdf-syntax-ns#", "@prefix": true}, 
	  "dcterms": {"@id": "http://purl.org/dc/terms/", "@prefix": true},
	  "oslc":  {"@id": "http://open-services.net/ns/core#", "@prefix": true},
	  "oslc_am": {"@id": "http://open-services.net/ns/am#", "@prefix": true},
	  "sysml": {"@id": "http://omg.org/ns/sysml#", "@prefix": true},

"""
model = ET.parse('SysML.uml.xml').getroot()
# Classes
allClasses = {}
for packagedElement in model.findall('packagedElement[@xmi:type="uml:Class"]', ns):
	jsonld += f'    "{packagedElement.get("name")}": "sysml:{packagedElement.get("name")}",\n'
	allClasses[packagedElement.get('{http://www.omg.org/spec/XMI/20131001}id')] = packagedElement.get("name")
jsonld += '\n'
# ownedAttributes
visited = [] # for removing duplicates
first = True
for ownedAttribute in model.findall('.//ownedAttribute'):
	name = ownedAttribute.get("name")
	if name not in visited: 
		visited.append(name)
		if first:
			first = False
		else:
			jsonld += ',\n'
		type = None
		umltype = ownedAttribute.find('type')
		if umltype != None and umltype.get('{http://www.omg.org/spec/XMI/20131001}type') == 'uml:PrimitiveType':
			type = umltype.get('href').split('#')[1].lower()
			jsonld += f'    "{name}": {{"@id": "sysml:{name}", "@type":"xsd:{type}"}}'
		else: # its non-primitive
			jsonld += f'    "{name}": {{"@id": "sysml:{name}", "@type":"@id"}}'

jsonld +="""
  }
 }
 """
f = open('SysML.json', 'wt')
f.write(jsonld)


