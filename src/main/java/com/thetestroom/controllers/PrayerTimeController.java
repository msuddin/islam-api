package com.thetestroom.controllers;

import com.thetestroom.beans.PrayerTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class PrayerTimeController {

    static Logger log = Logger.getLogger(PrayerTimeController.class.getName());

    @Autowired
    private PrayerTime prayerTime;

    @RequestMapping("/hello/{name}")
    public String hi(@PathVariable("name") String name) {
        prayerTime.setName(name);
        log.info("/prayerTime/" + name + " has been called");
        return "hello " + prayerTime.getName();
    }

}
