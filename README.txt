What I did so far:


installed eclipse for java

installed maven (need to check if I have to do it again after installing eclipse)

created Calc app with tests

created the pom file

which works only with selected junit versions (e.g., >=4.1)

mvn clean package

it cleans and create the jar.. but we can not run it direcly, but can use it as a library

in order to create a executable jar (java -jar testJar.jar)

we need to do two things:

1) need a main

2) need a plugin where we specify Main class and add descriptor Ref 


Example of the pom.xml



<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>shaiful-maven</groupId>
  <artifactId>Calculator</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <packaging>jar</packaging>

  <name>Calculator</name>
  <url>http://maven.apache.org</url>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  </properties>
  
 
  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.3</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
  
  <build>
        <plugins>
            <plugin>
                <artifactId>maven-assembly-plugin</artifactId>
                <configuration>
                    <archive>
                        <manifest>
                            <mainClass>shaiful_maven.Calculator.App</mainClass>
                        </manifest>
                    </archive>
                    <descriptorRefs>
                        <descriptorRef>jar-with-dependencies</descriptorRef>
                    </descriptorRefs>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>


we can show the students how to create executable jar for the tictactoe


Different maven commands:

mvn clean: will clean everything (i.e., remove target)
mvn compile: will compile only the source code (see the class file)
mvn test-compile: will compile the test file as well. 
mvn package: will create the jar file
mvn install: will install the package (e.g., jar) into the local repository, for use as a dependency in other projects locally.


INSTALLING AN EXECUTABLE JAR FILE:
mvn clean package assembly:single



    validate: validate the project is correct and all necessary information is available
    compile: compile the source code of the project
    test: test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
    package: take the compiled code and package it in its distributable format, such as a JAR.
    integration-test: process and deploy the package if necessary into an environment where integration tests can be run
    verify: run any checks to verify the package is valid and meets quality criteria
    install: install the package into the local repository, for use as a dependency in other projects locally
    deploy: done in an integration or release environment, copies the final package to the remote repository for sharing with other developers and projects.






