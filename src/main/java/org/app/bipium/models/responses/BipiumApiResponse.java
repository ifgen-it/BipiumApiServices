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
import org.apache.http.util.EntityUtils;
import org.app.bipium.config.Credentials;
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
        this.client = HttpClientBuilder.create()
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
            System.out.println("Connection succeded");
        } else {
            System.out.println("Connection error" + statusCode);
        }


        List<Header> headerElements = Arrays.asList(response.getAllHeaders());

        HeaderElement[] elements = null;

        for (Header headerElement : headerElements) {
            if (headerElement.getName().equals("Set-Cookie")) {
                elements = headerElement.getElements();
            }
        }

        for (HeaderElement element : elements) {
            this.session = element.getValue();
        }

    }

    /**
     * Get response with session
     */
    @Override
    public void getRequest(int catalogID, String searchValue) {
        String requestUrl = domain + "/catalogs/" + catalogID + "/records?searchText=" + searchValue;
        HttpGet httpGet = new HttpGet(requestUrl);
        httpGet.addHeader("Cookie", "session=" + session);

        HttpResponse response = null;
        String responseBody = null;

        try {
            response = client.execute(httpGet);
            responseBody = EntityUtils.toString(response.getEntity());
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
                    System.out.println("Unknown error");
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
