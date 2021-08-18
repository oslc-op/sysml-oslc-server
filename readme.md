# SysML OSLC Server

![CI](https://github.com/oslc-op/sysml-oslc-server/workflows/CI/badge.svg)
[![](https://img.shields.io/badge/talk-discourse-lightgrey.svg)](https://forum.open-services.net/)

Sample code to demonstrate how to use Lyo Designer to create an OSLC server for the SysML v2 REST API. 

## Installation
1. Install Apache Jena Fuseki https://jena.apache.org/download/index.cgi
1. Run Fuseki http://localhost:3030/dataset.html
1. Create a dataset named "sysml"

## Running the server
1. run `mvn install` on the project `org.oasis.oslcop.sysml.oslc-domain`
    1. this is necessary if changes are made to the classes in the sysml-domain, which the sysml-server depends on.
    1. This is also necessary when running for the first time.
1. run `mvn jetty:run-exploded` on the project `org.oasis.oslcop.sysml.oslc-server-model`
1. If the first time you are running the server, populate the database by calling http://localhost:8085/sysml_oslc_server/services/populate
1. Browse the data starting with the catalog http://localhost:8085/sysml_oslc_server/services/catalog/singleton

## Query

Example queries we can examplify with

https://aide.md.kth.se/sysml_oslc_server/services/projects/585a5a94-61a0-4a60-9731-c2be32b06f89/commits/7cbc0568-1f44-4725-ace0-e7d4e1c046c6/service1/subsettings/query
* `oslc.where   sysml:identifier="bd51aa62-e8df-474e-931c-f3cb60c17d6b"`
* `oslc.prefix  sysml=<http://omg.org/ns/sysml#>`

## Info

The domain-classes are based on the ecore file, located underhttps
* Repo: https://github.com/ModelDriven/SysML-v2-Pilot-Implementation.git
* filePath: org.omg.sysml\model\SysML.ecore

The Swagger Docs for the REST server has base: http://sysml2-dev.intercax.com:9000/ 

## Developer Info - Manual steps when re-generating model and code 

The SysML domain classes are generated, based on an Lyo model that is itself transformed from the Sysml EMF model.

There are currently 3 manual steps that need to be handled when regenerting the code. 
* The first can be automated in the future.
* The second is due to a limitation in LyoDesigner.
* The third is due to a bug that will hopefully be fixed in the future.

### 1. 
Before generating the java classes, the generated Lyo model is manually modified to:
1. Make Element a sub-class of OSLC_AM:Resource.
1. Configure the generator to NOT generate the AM classes (since these are already included as a maven dependency)

### 2. 
After generating the domain classes, we need to change the "toString()" method on each resource to make it print the resources better.

Tips: Use Notepad++ to search/replace on all *.java files.

* Find:        // Start of user code toString_finalize\n        // End of user code
* Replace:        // Start of user code toString_finalize\n        result = getShortTitle();\n        // End of user code

### 3. 
In the generated jsp pages, there are calls to getDctermsType(), getDctermsIdentifier() and getDctermsSource(), but these methods do not exist.
They would have existed if the OSLC AM resources were generated. But because we are including the library as it is previously generated, the methods should be really getType(), getIdentifier() and getSource()

# License

This work is licensed under the terms of Apache License 2.0.
