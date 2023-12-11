package org.app.bipium.models.responses;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.app.bipium.config.HttpSessionConfig;
import org.app.bipium.models.catalogs.Catalog;

import java.io.IOException;


public class BipiumApiResponse implements ResponseSendable {
    private String domain;
    private HttpClient httpClient;
    private String session;
    private String catalogID;

    public BipiumApiResponse(String domain, String catalogID) {
        this.domain = domain;
        this.catalogID = catalogID;
        this.session = HttpSessionConfig.getSession(domain);
        this.httpClient = HttpClients.createDefault();
    }

    /**
     * Get response with session
     */
    @Override
    public void getRequest(String searchValue) {
        String responseStr = domain + "/api/v1/catalogs/" + this.catalogID + "/records?" + "searchText=" + searchValue;
        HttpGet httpGet = new HttpGet(responseStr);
        httpGet.addHeader("Cookie", "session=" + this.session);

        String responseBody = "";

        try {
            HttpResponse response = this.httpClient.execute(httpGet);

            if (response.getStatusLine().getStatusCode() == 200) {
                responseBody = EntityUtils.toString(response.getEntity());
            } else {
                System.out.println("Response error, status code = " + response.getStatusLine().getStatusCode());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(responseBody);
    }

    /**
     * Post response with session
     */
    @Override
    public void postRequest(String searchValue) {

    }

    public static void main(String[] args) {
        ResponseSendable responseSendable = new BipiumApiResponse("https://avarkom12.bpium.ru/", "122");
        responseSendable.getRequest("21754691");
    }
}
