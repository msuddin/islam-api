# islam-prayer-times-api

## Purpose

Question:
What is the purpose of this project?

Answer:
* To display the prayer times in the UK

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
http://localhost:8080/prayertime/{day}/{month}/{year}
```
You can pass in a name on the url which should display the same name on the browser:
```
// Set in the browser URL window:
http://localhost:8080/prayertime/01/01/2000

// Should see diplayed in the browser window:
{
    code: 200,
    status: "OK",
    data: {
        timings: {
            Fajr: "06:14",
            Sunrise: "08:04",
            Dhuhr: "12:09",
            Asr: "13:45",
            Sunset: "16:00",
            Maghrib: "16:04",
            Isha: "18:00",
            Imsak: "05:48",
            Midnight: "00:03"
        },
        date: {
            readable: "01 Jan 2000",
            timestamp: "946684800"
        },
        meta: {
            latitude: 51.53889,
            longitude: 0.14743,
            timezone: "Europe/London",
            method: {
                id: 4,
                name: "Umm Al-Qura University, Makkah",
                params: {
                    Fajr: 18.5,
                    Isha: "90 min"
                }
            },
            latitudeAdjustmentMethod: "ANGLE_BASED",
            midnightMode: "STANDARD",
            school: "STANDARD",
            offset: {
                Imsak: 0,
                Fajr: "16",
                Sunrise: "-1",
                Dhuhr: "6",
                Asr: "2",
                Maghrib: "4",
                Sunset: 0,
                Isha: "30 min",
                Midnight: 0
            }
        }
    }
}
```
