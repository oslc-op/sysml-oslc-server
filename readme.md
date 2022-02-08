# SysML OSLC Server

![CI](https://github.com/oslc-op/sysml-oslc-server/workflows/CI/badge.svg)
[![Discourse users](https://img.shields.io/discourse/users?color=28bd84&server=https%3A%2F%2Fforum.open-services.net%2F)](https://forum.open-services.net/)

Sample code to demonstrate how to use Lyo Designer to create an OSLC server for the SysML v2 REST API.

## Prerequisites

Run Fuseki triplestore using Docker:

```
docker run --rm -p 3030:3030 atomgraph/fuseki --mem /ds
```

Alternatively, do a manual install:

1. Install Apache Jena Fuseki https://jena.apache.org/download/index.cgi
1. Run Fuseki http://localhost:3030/dataset.html
1. Create a dataset named "ds"

## Running the server

1. run `mvn install` on the project `org.oasis.oslcop.sysml.oslc-domain`
   1. this is necessary if changes are made to the classes in the sysml-domain, which the sysml-server depends on.
   1. This is also necessary when running for the first time.
2. run `mvn jetty:run-exploded` on the project `org.oasis.oslcop.sysml.oslc-server-model`
3. If the first time you are running the server, populate the database by calling http://localhost:8085/sysml_oslc_server/services/populate
   1. If you already have the data in the triplestore, **make sure to select active version via http://localhost:8085/sysml_oslc_server/services/store/projectCommits** (WARN: the page will take quite a long time to load).
4. Browse the data starting with the catalog http://localhost:8085/sysml_oslc_server/services/catalog/singleton

## Query

Example queries we can execute (if you chose version `11609e2b-a4df-4a64-9e61-a45660c28542`):

http://localhost:8085/sysml_oslc_server/services/projects/23561420-ef88-4249-bf99-651670ff438f/service6/features/query

- `oslc.where sysml:identifier="5bc41f66-4d42-41da-b7a3-92af54dab320"`
- `oslc.prefix sysml=<http://omg.org/ns/sysml#>`

## Info

The domain-classes are based on the ecore file, located underhttps

- Repo: https://github.com/ModelDriven/SysML-v2-Pilot-Implementation.git
- filePath: org.omg.sysml\model\SysML.ecore

The Swagger Docs for the REST server has base: http://sysml2-dev.intercax.com:9000/

## Developer Info - Manual steps when re-generating model and code

The SysML domain classes are generated, based on an Lyo model that is itself transformed from the Sysml EMF model.

There are currently 3 manual steps that need to be handled when regenerting the code.

- The first can be automated in the future.
- The second is due to a limitation in LyoDesigner.
- The third is due to a bug that will hopefully be fixed in the future.

### 1.

Before generating the java classes, the generated Lyo model is manually modified to:

1. Make Element a sub-class of OSLC_AM:Resource.
1. Configure the generator to NOT generate the AM classes (since these are already included as a maven dependency)

### 2.

After generating the domain classes, we need to change the "toString()" method on each resource to make it print the resources better.

Tips: Use Notepad++ to search/replace on all \*.java files.

- Find: // Start of user code toString_finalize\n // End of user code
- Replace: // Start of user code toString_finalize\n result = getShortTitle();\n // End of user code

### 3.

In the generated jsp pages, there are calls to getDctermsType(), getDctermsIdentifier() and getDctermsSource(), but these methods do not exist.
They would have existed if the OSLC AM resources were generated. But because we are including the library as it is previously generated, the methods should be really getType(), getIdentifier() and getSource()

# License

This work is licensed under the terms of Apache License 2.0.
