
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

## Gradle
1.  Gradle
2.  The .gradle directory
3.  The [gradle.properties](https://docs.gradle.org/current/userguide/build_environment.html#sec:gradle_configuration_properties) file
4.  [Gradle Wrapper](https://docs.gradle.org/current/userguide/gradle_wrapper.html)
5.  build.gradle initial structure:
    * [apply](https://guides.gradle.org/creating-new-gradle-builds/?_ga=2.79451668.1636325932.1519554111-2042327082.1517596084#apply_a_plugin)
    * [dependencies](https://docs.gradle.org/current/userguide/artifact_dependencies_tutorial.html#sec:external_dependencies_tutorial)
    * [repositories](https://docs.gradle.org/current/userguide/artifact_dependencies_tutorial.html#sec:repositories_tutorial)
    * [buildscript](https://docs.gradle.org/current/userguide/organizing_build_logic.html)
6. [Tasks](https://docs.gradle.org/current/userguide/tutorial_using_tasks.html)
7. Running a task
    ```
    gradle clean test
    ```
8. Running the application
    ```
    gradle bootRun
    ```
9. The build directory
    ```
    gradle jar
    ```
10. Creating a task
    ```
    task printMessage() {
        println "This is a message from the printMessage task"
    }
    ```
11. Parameterizing the task
    ```
    task printMessage() {
        println "Parameterized message: ${myMessage}"
    }
    ```
12. Creating ~/.gradle/gradle.properties
    ```
    myMessage=Message from gradle.properties
    ```
    ```
    gradle printMessage
    ```    
13. Overriding values from gradle.properties
    ```
    gradle printMessage -PmyMessage="Custom Message"
    ```
14. Using system properties
    ```
    def myMessageSystemProperty = System.getProperty("MESSAGE_SYSTEM_PROPERTY")
    println "Parameterized message: ${myMessageSystemProperty}"
    ...
    gradle printMessage -DMESSAGE_SYSTEM_PROPERTY="Message system property"
    ```
15. Configuring [system properties](https://docs.gradle.org/current/userguide/build_environment.html#sec:gradle_system_properties) in gradle.properties
    ```
    systemProp.MESSAGE_SYSTEM_PROPERTY="System property from gradle.properties"
    ```
16. Override the property
    ```
     gradle printMessage -DMESSAGE_SYSTEM_PROPERTY="Overriden system property"
    ```