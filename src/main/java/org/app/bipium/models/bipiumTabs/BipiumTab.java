package org.app.bipium.models.bipiumTabs;

import java.util.HashMap;
import java.util.Map;

public abstract class BipiumTab {
    private Map<String, Integer> apiValues;

    public BipiumTab(Map<String, Integer> apiValues) {
        this.apiValues = apiValues;
    }

    public Map<String, Integer> getApiValues() {
        return apiValues;
    }
}
