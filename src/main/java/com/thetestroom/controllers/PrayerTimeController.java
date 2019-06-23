package com.thetestroom.controllers;

import com.thetestroom.beans.PrayerTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class PrayerTimeController {

    @Autowired
    private PrayerTime prayerTime;

    @RequestMapping(value = "/prayertime/{day}/{month}/{year}", method = RequestMethod.GET, produces = "application/json")
    public String prayertime(
            @PathVariable("day") String day,
            @PathVariable("month") String month,
            @PathVariable("year") String year)
            throws IOException {

        prayerTime.setDay(day);
        prayerTime.setMonth(month);
        prayerTime.setYear(year);

        return prayerTime.getPrayerTimes();
    }
}
