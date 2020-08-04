<xsl:stylesheet 
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"                    
    xmlns="http://www.w3.org/1999/xhtml"
    xmlns:xmi="http://www.omg.org/spec/XMI/20131001" 
    xmlns:uml="http://www.eclipse.org/uml2/5.0.0/UML"
    version="1.0">
 <xsl:output omit-xml-declaration="yes" indent="yes"/>
  
<!-- Document Root -->
<xsl:template match="/uml:Model">
{
  "@context": {
	<!-- Namespaces -->
	"xsd": {"@id": "http://www.w3.org/2001/XMLSchema#"", "@prefix": true},
	"rdf":   {"@id": "http://www.w3.org/1999/02/22-rdf-syntax-ns#", "@prefix": true}, 
	"dcterms": {"@id": "http://purl.org/dc/terms/", "@prefix": true},
	"oslc":  {"@id": "http://open-services.net/ns/core#", "@prefix": true},
	"oslc_am": {"@id": "http://open-services.net/ns/am#", "@prefix": true},
	"sysml": {"@id": "http://omg.org/ns/sysml#", "@prefix": true},
     
    <!-- Classes -->
    <xsl:for-each select="packagedElement[@xmi:type='uml:Class']">
        "<xsl:value-of select = "@name"/>": "sysml:<xsl:value-of select = "@name"/>",
	</xsl:for-each>
  
    <!-- ownedAttributes -->
    <xsl:for-each select="//ownedAttribute">
        "<xsl:value-of select = "@name"/>": "sysml:<xsl:value-of select = "@name"/>",
	</xsl:for-each>
  }
  
  
}
</xsl:template>
</xsl:stylesheet>