# Installation
1. Install Apache Jena Fuseki https://jena.apache.org/download/index.cgi
1. Run Fuseki http://localhost:3030/dataset.html
1. Create a dataset named "sysml"

# Running the server
1. run `mvn install` on the project `org.oasis.oslcop.sysml.oslc-domain`
    1. this is necessary if changes are made to the classes in the sysml-domain, which the sysml-server depends on.
    1. This is also necessary when running for the first time.
1. run `mvn jetty:run-exploded` on the project `org.oasis.oslcop.sysml.oslc-server-model`
1. If the first time you are running the server, populate the database by calling http://localhost:8085/sysml_oslc_server/services/populate
1. Browse the data starting with the catalog http://localhost:8085/sysml_oslc_server/services/catalog/singleton

# Info

The domain-classes are based on the ecore file, located underhttps
* Repo: https://github.com/ModelDriven/SysML-v2-Pilot-Implementation.git
* filePath: org.omg.sysml\model\SysML.ecore