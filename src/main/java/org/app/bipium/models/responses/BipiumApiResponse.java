package org.app.bipium.models.responses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class BipiumApiResponse implements ResponseSendable{
    @Override
    public StringBuilder sendGet(String url) {

        HttpURLConnection connection = null;
        BufferedReader in = null;
        StringBuilder response = null;

        try {
            URL getResponse = new URL(url);
            connection = (HttpURLConnection) getResponse.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            }

            String inputLine;
            response = new StringBuilder();

            if (in != null) {
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
            }

            if (in != null) {
                in.close();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return response;
    }

    @Override
    public String sendPost(String url) {
        return "";
    }

    public static void main(String[] args) {
        ResponseSendable sendable = new BipiumApiResponse();
        String url = "";
    }
}
