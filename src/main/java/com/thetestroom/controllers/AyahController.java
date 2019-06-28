package com.thetestroom.controllers;

import com.thetestroom.beans.Ayah;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class AyahController {

    @Autowired
    private Ayah ayah;

    @RequestMapping(value = "/ayah/{surahNumber}/{ayahNumber}", method = RequestMethod.GET, produces = "application/json")
    public String dailyPrayerTime(
            @PathVariable("surahNumber") String surahNumber,
            @PathVariable("ayahNumber") String ayahNumber)
            throws IOException {
        ayah.setSurah(surahNumber);
        ayah.setAyah(ayahNumber);

        return ayah.getAyahFromSurah();
    }
}
