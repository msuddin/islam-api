package com.thetestroom.beans;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class PrayerTime {

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
        URL url = new URL("https://api.aladhan.com/timingsByAddress/" + this.getDay() + "-" + this.getMonth() + "-" + this.getYear() + "?address=Dagenham&method=4&tune=0,16,-1,6,2,4,0,-9,0");
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