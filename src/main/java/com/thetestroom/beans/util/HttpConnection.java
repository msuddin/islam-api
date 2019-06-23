package com.thetestroom.beans.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpConnection {

    public String performUrlConnection(URL url) throws IOException {
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
