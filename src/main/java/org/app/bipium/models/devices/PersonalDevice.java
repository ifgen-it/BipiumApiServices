package org.app.bipium.models.devices;

import java.util.Map;

public class PersonalDevice extends AbstractDevice {

    public PersonalDevice(String filial, String locality, String deviceType, String deviceNumber, String macAddresses, String coordinates, String password, String route) {
        super(filial, locality, deviceType, deviceNumber, macAddresses, coordinates, password, route);
    }
}
