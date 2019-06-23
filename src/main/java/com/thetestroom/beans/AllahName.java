package com.thetestroom.beans;

import com.thetestroom.beans.util.HttpConnection;

import java.io.IOException;
import java.net.URL;

public class AllahName {

    private HttpConnection httpConnection = new HttpConnection();

    private String allNameByNumber;

    public void setAllNameByNumber(String allNameByNumber) {
        this.allNameByNumber = allNameByNumber;
    }

    private String getAllahNameByNumber() {
        return this.allNameByNumber;
    }

    public String getAllahName() throws IOException {
        URL url = new URL("http://api.aladhan.com/asmaAlHusna/" + this.getAllahNameByNumber());
        return httpConnection.performUrlConnection(url);
    }

}
