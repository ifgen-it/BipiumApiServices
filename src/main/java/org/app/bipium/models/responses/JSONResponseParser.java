package org.app.bipium.models.responses;

import org.app.bipium.models.catalogs.Catalog;
import org.app.bipium.models.catalogs.PersonalDeviceCatalogList;

import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * Json parser from string
 */
public class JSONResponseParser {


    public static Map<String, String> parse(String jsonStr) {
        ObjectMapper objectMapper = new ObjectMapper();

        Map<String, String> values = null;
        try {
            JsonObject myObject = objectMapper.readValue(jsonStr, JsonObject.class);
            System.out.println("id: " + myObject.getId());
            System.out.println("catalogId: " + myObject.getCatalogId());
            System.out.println("title: " + myObject.getTitle());

             values = myObject.getValues();
            for (Map.Entry<String, String> entry : values.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return values;
    }

    public static void main(String[] args) {
        ResponseSendable responseSendable = new BipiumApiResponse("https://avarkom12.bpium.ru");
        Catalog catalog = new PersonalDeviceCatalogList().initial().get(1);
        String responseBody = responseSendable.getRequest(catalog.getId(), "021220019094");
        JSONResponseParser.parse(responseBody);

    }
}
