# islam-prayer-times-api

## Purpose

Question:
What is the purpose of this project?

Answer:
* To display the prayer time in the UK

## Dependencies
* This project use the API endpoint at https://aladhan.com/prayer-times-api

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
http://localhost:8080/blah blah
```
You can pass in a name on the url which should display the same name on the browser:
```
// Set in the browser URL window:
http://localhost:8080/blha blah

// Should see diplayed in the browser window:
blah blah
```
