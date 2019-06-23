package com.thetestroom.controllers;

import com.thetestroom.beans.DailyPrayerTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class DailyPrayerTimeController {

    @Autowired
    private DailyPrayerTime dailyPrayerTime;

    @RequestMapping(value = "/daily-prayer-time/{day}/{month}/{year}", method = RequestMethod.GET, produces = "application/json")
    public String dailyPrayerTime(
            @PathVariable("day") String day,
            @PathVariable("month") String month,
            @PathVariable("year") String year)
            throws IOException {

        dailyPrayerTime.setDay(day);
        dailyPrayerTime.setMonth(month);
        dailyPrayerTime.setYear(year);

        return dailyPrayerTime.getPrayerTimes();
    }
}
