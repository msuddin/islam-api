package com.thetestroom.beans;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PrayerTime {

    final private String ALADHAN_API = "https://api.aladhan.com/timingsByAddress/";
    final private String ADDRESS = "Dagenham";
    final private String METHOD = "4";

    final private int IMSAK = 0;
    final private int FAJR = 16;
    final private int SUNRISE = -1;
    final private int DHUHR = 6;
    final private int ASR = 2;
    final private int MAGHRIB = 4;
    final private int SUNSET = 0;
    final private int ISHA = -9;
    final private int MIDNIGHT = 0;

    private String day;
    private String month;
    private String year;

    public void setDay(String day) {
        this.day = day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(String year) {
        this.year = year;
    }

    private String getDay() {
        return this.day;
    }

    private String getMonth() {
        return this.month;
    }

    private String getYear() {
        return this.year;
    }

    public String getPrayerTimes() throws IOException {
        URL url = new URL(
                ALADHAN_API +
                        this.getDay() + "-" +
                        this.getMonth() + "-" +
                        this.getYear() +
                        "?address=" + ADDRESS +
                        "&method=" + METHOD +
                        "&tune=" +
                            IMSAK + "," +
                            FAJR +"," +
                            SUNRISE + "," +
                            DHUHR + "," +
                            ASR + "," +
                            MAGHRIB + "," +
                            SUNSET + "," +
                            ISHA + "," +
                            MIDNIGHT);
        HttpURLConnection httpUrlConection = (HttpURLConnection) url.openConnection();
        httpUrlConection.setRequestMethod("GET");
        httpUrlConection.setRequestProperty("Accept", "application/json");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((httpUrlConection.getInputStream())));
        String output;
        StringBuilder sb = new StringBuilder();
        while ((output = bufferedReader.readLine()) != null) {
            sb.append(output);
        }
        httpUrlConection.disconnect();
        return sb.toString();
    }
}