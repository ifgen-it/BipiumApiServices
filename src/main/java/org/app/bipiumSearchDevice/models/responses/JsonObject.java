package org.app.bipiumSearchDevice.models.responses;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class JsonObject {
    private String id;
    private String catalogId;
    private String title;
    private Map<String, String> values;

    @JsonProperty("id")

    public String getId() {
        return id;
    }

    @JsonProperty("catalogId")

    public String getCatalogId() {
        return catalogId;
    }

    @JsonProperty("title")

    public String getTitle() {
        return title;
    }

    @JsonProperty("values")
    public Map<String, String> getValues() {
        return values;
    }
}
