package org.app.bipium.models.responses;

import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpResponse;
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
import java.util.Arrays;
import java.util.List;


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
    public void getRequest(int catalogID, String searchValue) {
        String requestUrl = domain + "/api/v1/catalogs/" + catalogID + "/records?searchText=" + searchValue;
        HttpGet httpGet = new HttpGet(requestUrl);
        httpGet.addHeader("Cookie", "session=" + this.session);

        HttpResponse response = null;

        try {
            response = client.execute(httpGet);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int responseStatus = response.getStatusLine().getStatusCode();

        if (responseStatus == 200) {
            System.out.println("Completed request");
        } else {
            switch (responseStatus) {
                case 404:
                    System.out.println("Resource not found");
                    break;
                default:
                    System.out.println("Unknown error" + responseStatus);
                    break;
            }
        }
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
        System.out.println(catalog.getName());
        responseSendable.getRequest(catalog.getId(), "ЦЭ6803В1");
    }


}
