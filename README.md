
# Build Tools Introduction

1.  Maven - what is it?
2.  The .m2 directory
3.  setting.xml file
4.  [pom.xml initial structure:](https://maven.apache.org/pom.html)
    *   naming (groupId/artifact)
    *   parent
    *   properties
    *   dependencies (with scopes)
    *   plugins
5.  [Phases and goals](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html)
6.  Running a phase
    ```
    mvn clean test
    ```
7.  Running a goal
    ```
    mvn spring-boot:run
    ```
8.  [Setting up a profile](https://docs.spring.io/spring-boot/docs/current/maven-plugin/examples/run-profiles.html)
    ```
    <configuration>
        <profiles>
            <profile>de</profile>
        </profiles>
    </configuration>
    ```
9.  Enabling the profile using command line (without removing from the pom.xml file)
    ```
    mvn spring-boot:run -Drun.profiles=de
    ```
    *Note:* `-D` overrides configuration in the pom.xml
10. Creating a flag
    ```
    <my.custom.profile.flag>en</my.custom.profile.flag>
    ...
    <profile>${my.custom.profile.flag}</profile>
    ```
11. Overriding the flag
    ```
    mvn spring-boot:run -Dmy.custom.profile.flag=de
    ```
12. Configuring System Property
    ```
    export MY_CUSTOM_FLAG=de
    echo $MY_CUSTOM_FLAG
    ```
13. Checking the property
    ```
    export MY_CUSTOM_FLAG=dasdsad
    ```
14. 
    