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

        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return values;
    }
}
