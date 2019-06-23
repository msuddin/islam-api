package com.thetestroom.controllers;

import com.thetestroom.beans.AllahName;
import com.thetestroom.beans.DailyPrayerTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class AllahNameController {

    @Autowired
    private AllahName allahName;

    @RequestMapping(value = "/allah-name/{nameByNumber}", method = RequestMethod.GET, produces = "application/json")
    public String dailyPrayerTime(@PathVariable("nameByNumber") String nameByNumber) throws IOException {
        allahName.setAllNameByNumber(nameByNumber);
        return allahName.getAllahName();
    }
}
