package org.app.bipium.models.responses;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.app.bipium.config.HttpSessionConfig;


public class BipiumApiResponse implements ResponseSendable {
    private String session;
    private HttpClient httpClient = HttpClients.createDefault();
    public BipiumApiResponse(String urlPath) {
        this.session = HttpSessionConfig.getSession(urlPath);
    }

    /**
     * Get response with session
     */
    @Override
    public void getRequest() {
        HttpGet httpGet = new HttpGet();
    }

    /**
     * Post response with session
     */
    @Override
    public void postRequest() {
        HttpPost httpPost = new HttpPost();
    }
}
