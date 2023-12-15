package org.app.bipium.models.devices;

import java.util.*;

public abstract class AbstractDevice {
    private Map<String, String> values;

    public AbstractDevice() {
        this.values = new LinkedHashMap<>();
    }

    public Map<String, String> getValues() {
        return values;
    }

    public void setValues(Map<String, String> catalogValues, Map<String, String> bipiumApiValues) {
        Map<String, String> resultHashMap = new LinkedHashMap<>();

        List<String> catalogValuesKeys = new ArrayList<>(catalogValues.keySet());
        List<String> bipiumValuesKeys = new ArrayList<>(bipiumApiValues.keySet());

        for (int i = 0; i < catalogValuesKeys.size(); i++) {
            String catalogKey = catalogValuesKeys.get(i);
            String catalogValue = catalogValues.get(catalogValuesKeys.get(i));

            if (bipiumValuesKeys.contains(catalogKey)) {
                resultHashMap.put(catalogValue, bipiumApiValues.get(catalogKey));
            } else {
                continue;
            }
        }
        this.values = resultHashMap;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        List<String> keys = new ArrayList<String>(this.values.keySet());
        for(int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = this.values.get(key);

            builder.append(key).append(": ").append(value).append("\n");
        }
        return builder.toString();
    }
}
