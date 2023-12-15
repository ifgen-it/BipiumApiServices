package org.app.bipium;

import org.app.bipium.models.catalogs.*;
import org.app.bipium.models.devices.AbstractDevice;
import org.app.bipium.services.BipiumApiServices;
import org.app.bipium.services.BipiumApiServicesImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AbstractDevice device = null;

        BipiumApiServices services = new BipiumApiServicesImpl("успд");
        String deviceNumber = "31888".strip();

        if (deviceNumber.length() == 8 || deviceNumber.length() == 12 || deviceNumber.length() == 13 || deviceNumber.length() == 11 || deviceNumber.length() == 6 || deviceNumber.length() == 5) {
            device = services.searchDeviceByNumber(deviceNumber);
        } else if (deviceNumber.matches("^[0-9A-Fa-f]{16}$")) {
            device = services.searchDeviceByMac(deviceNumber);
        }

        Map<String, String> deviceValues = device.getValues();

        List<String> keys = new ArrayList<>(deviceValues.keySet());

        for(int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = deviceValues.get(key);
            System.out.println(key + ": " + value);
        }
    }

}
