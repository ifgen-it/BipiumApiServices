package org.app.bipium.config;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class HttpSessionConfig {
    public static String getSession(String urlPath) {
        HttpClient httpClient = HttpClients.createDefault();
        HttpPost post = new HttpPost(urlPath);
        StringEntity params = null;
        try {
            params = new StringEntity("email=" + Credentials.LOGIN + "&" + "password=" + Credentials.PASSWORD);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        post.setEntity(params);
        post.addHeader("Content-Type", "application/x-www-form-urlencoded");
        // send request and get response
        HttpResponse response = null;
        try {
            response = httpClient.execute(post);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (response.getStatusLine().getStatusCode() == 200) {
            System.out.println("Connection succeeded");
        } else {
            System.out.println("Connection error");
            System.out.println(response.getStatusLine().getStatusCode());
        }
        String session = null;
        try {
            session = EntityUtils.toString(response.getEntity());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return session;
    }
}
