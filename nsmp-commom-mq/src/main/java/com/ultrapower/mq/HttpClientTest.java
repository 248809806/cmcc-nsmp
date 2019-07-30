package com.ultrapower.mq;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;

public class HttpClientTest {

    public static void main(String[] args) {
        String url = "http://localhost:8888/es/nsmp/clearnES?index=nsmp";
        HttpGet httpGet = new HttpGet(url);

        HttpClient httpClient = new DefaultHttpClient();

        try {
            HttpResponse response = httpClient.execute(httpGet);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
