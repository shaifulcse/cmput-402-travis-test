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

