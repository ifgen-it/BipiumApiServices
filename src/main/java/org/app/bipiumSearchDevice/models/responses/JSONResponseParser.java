package org.app.bipiumSearchDevice.models.responses;

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
            values = myObject.getValues();

        } catch (IOException exception) {
            return null; // плохо + нет логирования
        }

        return values;
    }
}
