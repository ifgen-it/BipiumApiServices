package org.app.bipiumSearchDevice.models.responses;

import org.apache.http.HttpResponse;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.app.bipiumSearchDevice.config.SessionConfig;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;


public class BipiumApiResponse implements ResponseSendable {
    private String domain;
    private String session;
    private CloseableHttpClient client;

    public BipiumApiResponse(String domain) {
        this.domain = domain;
        this.session = SessionConfig.getSession(domain);
        this.client = HttpClients.custom()
                        .setDefaultRequestConfig(RequestConfig.custom()
                        .setCookieSpec(CookieSpecs.STANDARD)
                        .build())
                        .build();
    }

    /**
     * Get response with session
     */
    @Override
    public Map<String, String> getRequest(int catalogID, String searchValue) {
        String requestUrl = domain + "/api/v1/catalogs/" + catalogID + "/records?searchText=" + searchValue;
        HttpGet httpGet = new HttpGet(requestUrl);
        httpGet.addHeader("Cookie", "connect.sid=" + this.session);

        HttpResponse response = null;

        try {
            response = client.execute(httpGet);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int responseStatus = response.getStatusLine().getStatusCode();

        if (responseStatus == 200) {

        } else {
            switch (responseStatus) {
                case 404:
                    System.out.println("Resource not found");
                    break;
                default:
                    System.out.println("Unknown error" + responseStatus);
                    break;
            }
            System.exit(-10);
        }
        String responseBody = null;

        try {
            responseBody = EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            return null;
        }

        if (responseBody != null) {
            responseBody = responseBody.replaceAll("\\[", "").replaceAll("]", "");
        }

        return JSONResponseParser.parse(responseBody);

    }

    /**
     * Post response with session
     *
     */
    @Override
    public void postRequest(String searchValue) {

    }
}
