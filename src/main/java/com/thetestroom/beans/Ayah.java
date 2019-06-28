package com.thetestroom.beans;

import com.thetestroom.beans.util.HttpConnection;

import java.io.IOException;
import java.net.URL;

public class Ayah {

    private HttpConnection httpConnection = new HttpConnection();

    final private String AYAH_API = "http://api.alquran.cloud/v1/ayah/";

    private String ayah;

    public void setAyah(String ayah) {
        this.ayah = ayah;
    }

    private String getAyah() {
        return this.ayah;
    }

    public String getAyahFromSurah() throws IOException {
        URL url = new URL(AYAH_API + this.getAyah() + "/en.asad");
        return httpConnection.performUrlConnection(url);
    }
}