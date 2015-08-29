# Simple tests for Remote EJB3 beans

To generate all deployables, run `mvn package` from root directory. That will create:

* from `basicejb-ear` module, the EAR deployable (`basicejb-ear-1.0-SNAPSHOT.ear`)
* from `basicejb-ejb` module,
   * the bare EJB-JAR deployable (`basicejb-ejb-1.0-SNAPSHOT.jar`)
   * the client EJB-JAR containing the public interfaces (`basicejb-ejb-1.0-SNAPSHOT-client.jar`)
* from `basicejb-ejb-test` module,
   * a standalone client that will include WebLogic *full client* and the public interfaces defined in the EJB-JAR client (`basicejb-test-1.0-SNAPSHOT-jar-with-dependencies.jar`)
   * run with `java -jar` and override JNDI properties with Java system properties on the command line (`-Djava.naming.provider.url=t3://anotherhost:anotherport`)
