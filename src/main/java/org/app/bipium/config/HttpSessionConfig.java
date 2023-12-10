package org.app.bipium.config;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpSessionConfig {
    public static String getSession(String urlPath) throws IOException {
        HttpClient httpClient = HttpClients.createDefault();
        HttpPost post = new HttpPost(urlPath);
        StringEntity params = new StringEntity("email=" + Credentials.login + "&" + "password=" + Credentials.password);
        post.setEntity(params);
        post.addHeader("Content-Type", "application/x-www-form-urlencoded");
        // send request and get response
        HttpResponse response = httpClient.execute(post);

        if (response.getStatusLine().getStatusCode() == 200) {
            System.out.println("Connection succeeded");
        } else {
            System.out.println("Connection error");
            System.out.println(response.getStatusLine().getStatusCode());
        }
        String session = EntityUtils.toString(response.getEntity());

        return session;
    }
}
