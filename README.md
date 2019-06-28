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

## Endpoints
```
http://localhost:8081/daily-prayer-time/{day}/{month}/{year}
http://localhost:8081/allah-name/{nameByNumber}
http://localhost:8081/ayah/{surahNumber}/{ayahNumber}
```
## Example Outputs
Prayer Times based on a date:
```
// Set in the browser URL window:
http://localhost:8081/daily-prayer-time/01/01/2000

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
Allah name based on 1-99
```
// Set in the browser URL window:
http://localhost:8081/allah-name/01

// Should see diplayed in the browser window:
{
    code: 200,
    status: "OK",
    data: [
        {
            name: "الرَّحْمَنُ",
            transliteration: "Ar Rahmaan",
            number: 1,
            en: {
                meaning: "The Beneficent"
            }
        }
    ]
}
```
Ayah example output:
```
// Set in the browser URL window:
http://localhost:8081/ayah/1

// Should see the following response:
{
    code: 200,
    status: "OK",
    data: {
        number: 1,
        text: "In the name of God, The Most Gracious, The Dispenser of Grace:",
        edition: {
            identifier: "en.asad",
            language: "en",
            name: "Asad",
            englishName: "Muhammad Asad",
            format: "text",
            type: "translation"
        },
        surah: {
            number: 1,
            name: "سُورَةُ ٱلْفَاتِحَةِ",
            englishName: "Al-Faatiha",
            englishNameTranslation: "The Opening",
            numberOfAyahs: 7,
            revelationType: "Meccan"
        },
        numberInSurah: 1,
        juz: 1,
        manzil: 1,
        page: 1,
        ruku: 1,
        hizbQuarter: 1,
        sajda: false
    }
}
```