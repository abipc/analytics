#Analytics Service

Spring Maven Java based RESTful Analytics Service

### Integration with a Hadoop Based store 

### Click Stream Data Analytics

### Event Aggregation per user per session

### Provides data to recommendation service and search service to improve quality

###Dependencies
######For versions checkout pom.xml

Spring 

Apache Kafka

Apache Spark

Hadoop

Maven

Java

JUnit

Jackson

Apache HTTP Client




###How to build
#####This runs the Unit Tests as well

Install Maven - sudo apt-get install maven

mvn clean

If using eclipse - 'mvn eclipse:clean' followed by 'mvn eclipse:eclipse'

mvn install

###How to start 
Import project as existing project in your IDE.

Use 'mvn eclipse:clean' to clean and 'mvn eclipse:eclipse' to set up the project in eclipse

Download Apache Tomcat 7 (only binary) and untar it.


####How to do remote debugging

export JPDA_ADDRESS=8000 

export JPDA_TRANSPORT=dt_socket 

bin/catalina.sh jpda start


###Install Java

sudo apt-get update

Check if Java is already installed  - 'java -version'

sudo apt-get install python-software-properties

sudo add-apt-repository ppa:webupd8team/java

sudo apt-get update

sudo apt-get install oracle-java7-installer


###Set JAVA_HOME

sudo update-alternatives --config java

sudo vi /etc/environment

JAVA_HOME="/usr/lib/jvm/java-7-oracle"

source /etc/environment

###Check JAVA_HOME is configured

echo $JAVA_HOME


###How to import project in eclipse

File -> Import -> Maven -> Existing Maven Projects




