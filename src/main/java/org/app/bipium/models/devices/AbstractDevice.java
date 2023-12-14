package org.app.bipium.models.devices;

import java.util.Map;

public abstract class AbstractDevice {
    private Map<String, String> values;

    public AbstractDevice(Map<String, String> values) {
        this.values = values;
    }

    public Map<String, String> getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "AbstractDevice{" +
                "values=" + values +
                '}';
    }
}
