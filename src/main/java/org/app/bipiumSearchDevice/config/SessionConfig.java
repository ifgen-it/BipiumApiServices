package org.app.bipiumSearchDevice.config;

import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class SessionConfig {
    public static String getSession(String domain) {
        CloseableHttpClient client = HttpClientBuilder.create()
                .setDefaultRequestConfig(RequestConfig.custom().setCookieSpec(CookieSpecs.STANDARD).build())
                .build();
        HttpPost httpPost = new HttpPost(domain + "/auth/login");
        HttpResponse response = null;
        StringEntity params = null;

        try {
            params = new StringEntity("email=" + Credentials.LOGIN + "&" + "password=" + Credentials.PASSWORD);
            httpPost.setEntity(params);
            httpPost.addHeader("Content-Type", "application/x-www-form-urlencoded");
            response = client.execute(httpPost);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int statusCode = response.getStatusLine().getStatusCode();

        if (statusCode == 200) {
            //System.out.println("Connection succeded");
        } else {
            //System.out.println("Connection error" + statusCode);
        }


        List<Header> headerElements = Arrays.asList(response.getAllHeaders());

        HeaderElement[] elements = null;

        for (Header headerElement : headerElements) {
            if (headerElement.getName().equals("Set-Cookie")) {
                elements = headerElement.getElements();
            }
        }

        String session = null;

        for (HeaderElement element : elements) {
            if (element.getName().equals("connect.sid")) {
                session = element.getValue();
                break;
            }
        }

        return session;
    }
}
