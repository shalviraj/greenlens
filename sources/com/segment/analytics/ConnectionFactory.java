package com.segment.analytics;

import android.util.Base64;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import p005b.p035e.p036a.p037a.C0843a;

public class ConnectionFactory {
    private static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 15000;
    private static final int DEFAULT_READ_TIMEOUT_MILLIS = 20000;
    public static final String USER_AGENT = "analytics-android/4.9.3";

    private String authorizationHeader(String str) {
        StringBuilder u = C0843a.m460u("Basic ");
        u.append(Base64.encodeToString((str + ":").getBytes(), 2));
        return u.toString();
    }

    public HttpURLConnection openConnection(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(DEFAULT_CONNECT_TIMEOUT_MILLIS);
            httpURLConnection.setReadTimeout(DEFAULT_READ_TIMEOUT_MILLIS);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("User-Agent", USER_AGENT);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        } catch (MalformedURLException e) {
            throw new IOException(C0843a.m451l("Attempted to use malformed url: ", str), e);
        }
    }

    public HttpURLConnection projectSettings(String str) {
        return openConnection("https://cdn-settings.segment.com/v1/projects/" + str + "/settings");
    }

    public HttpURLConnection upload(String str, String str2) {
        HttpURLConnection openConnection = openConnection(String.format("https://%s/import", new Object[]{str}));
        openConnection.setRequestProperty("Authorization", authorizationHeader(str2));
        openConnection.setRequestProperty("Content-Encoding", "gzip");
        openConnection.setDoOutput(true);
        openConnection.setChunkedStreamingMode(0);
        return openConnection;
    }
}
