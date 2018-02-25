
# Build Tools Introduction

## Maven
1.  Maven
2.  The .m2 directory
3.  setting.xml file
4.  [pom.xml initial structure:](https://maven.apache.org/pom.html)
    *   [naming (groupId/artifact)](https://maven.apache.org/guides/mini/guide-naming-conventions.html)
    *   parent
    *   properties
    *   [dependencies (with scopes)](https://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html#Dependency_Scope)
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
8.  [The target directory](https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html)
9.  Packing the application
    ```
    mvn clean package
    ```  
    *Note:* The jar file
10. [Setting up a profile](https://docs.spring.io/spring-boot/docs/current/maven-plugin/examples/run-profiles.html)
    ```
    <configuration>
        <profiles>
            <profile>de</profile>
        </profiles>
    </configuration>
    ```
11. Enabling the profile using command line (without removing from the pom.xml file)
    ```
    mvn spring-boot:run -Drun.profiles=de
    ```
    *Note:* `-D` overrides configuration in the pom.xml
12. Creating a flag
    ```
    <my.custom.profile.flag>en</my.custom.profile.flag>
    ...
    <profile>${my.custom.profile.flag}</profile>
    ```
13. Overriding the flag
    ```
    mvn spring-boot:run -Dmy.custom.profile.flag=de
    ```
14. Configuring System Property
    ```
    export MY_CUSTOM_FLAG=de
    echo $MY_CUSTOM_FLAG
    ```
15. Checking the property
    ```
    export MY_CUSTOM_FLAG=dasdsad
    ```
    