package org.app.bipium.models.responses;

import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.app.bipium.config.Credentials;
import org.app.bipium.config.SessionConfig;
import org.app.bipium.models.catalogs.Catalog;
import org.app.bipium.models.catalogs.PersonalDeviceCatalogList;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


public class BipiumApiResponse implements ResponseSendable {
    private String domain;
    private String session;
    private CloseableHttpClient client;

    public BipiumApiResponse(String domain) {
        this.domain = domain;
        this.session = SessionConfig.getSession(domain);
        this.client = HttpClients.createDefault();
    }

    /**
     * Get response with session
     */
    @Override
    public String getRequest(int catalogID, String searchValue) {
        String requestUrl = domain + "/api/v1/catalogs/" + catalogID + "/records?searchText=" + searchValue;
        System.out.println(requestUrl.strip());
        HttpGet httpGet = new HttpGet(requestUrl);
        httpGet.addHeader("Cookie", "connect.sid=" + this.session);

        HttpResponse response = null;

        try {
            response = client.execute(httpGet);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        StatusLine statusLine = response.getStatusLine();

        String responseBody = null;

        if (statusLine.getStatusCode() == 200) {
            try {
                responseBody = EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            switch (statusLine.getStatusCode()) {
                case 404:
                    System.out.println("Resource not found");
                    break;
                default:
                    System.out.println("Unknown error" + statusLine.getStatusCode());
                    break;
            }
            return null;
        }
        return responseBody;
    }

    /**
     * Post response with session
     */
    @Override
    public void postRequest(String searchValue) {

    }

    public static void main(String[] args) {
        //603120955
        ResponseSendable responseSendable = new BipiumApiResponse("https://avarkom12.bpium.ru");
        Catalog catalog = new PersonalDeviceCatalogList().initial().get(1);
        String responseBody = responseSendable.getRequest(catalog.getId(), "021220019094");
        JSONResponseParser.parse(responseBody);
        Map<String, String> values = JSONResponseParser.parse(responseBody);

        System.out.println(values);
    }


}
