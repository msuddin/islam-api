# sample-java-spring-boot-web-api

## Purpose

Question:
What is the purpose of this project?

Answer:
* Main application that boots itself as a spring boot web app
* As it's a spring application, it automatically finds all rest controllers
* Rest controller takes in a parameter
* Rest controller is using a bean to create an account and then prints the name
* Have used bean configuration annotation instead of XML configuration
* Have created test that runs as part of build
* Build also build's a jar and puts it in /build path
* Using spring boot plugin in gradle file - when jar is built, all additional dependencies are added to the jar when using this plugin
* build.gradle file also supplies start class (bootJar - get's executed as part of gradle build task)


## Instructions
Navigate to the root directory of this project and run the command below to run all the tests and build the jar:
```
./gradlew clean build
```
Now run the command below to run the application:
```
java -jar build/libs/<name_of_jar>.jar
```
The application should be accessible on the following url:
```
http://localhost:8080/
```
You can pass in a name on the url which should display the same name on the browser:
```
// Set in the browser URL window:
http://localhost:8080/hello/batman

// Should see diplayed in the browser window:
hello batman
```
