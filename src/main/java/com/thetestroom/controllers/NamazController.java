package com.thetestroom.controllers;

import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Logger;

// Annotation below used to allow cross origin requests
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class NamazController {

    static Logger log = Logger.getLogger(NamazController.class.getName());

    @RequestMapping(value = "/namaz/{day}/{month}/{year}", method = RequestMethod.GET, produces = "application/json")
    // Takes a long ID and returns an entity name
    public String namaz(@PathVariable("day") String day, @PathVariable("month") String month, @PathVariable("year") String year) throws IOException {
        URL url = new URL("https://api.aladhan.com/timingsByAddress/"+day+"-"+month+"-"+year+"?address=Dagenham&method=4&tune=0,16,-1,6,2,4,0,-9,0");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");
        BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
        String output;
        StringBuffer sb = new StringBuffer();
        while ((output = br.readLine()) != null) {
            sb.append(output);
        }
        conn.disconnect();
        return sb.toString();
    }
}
