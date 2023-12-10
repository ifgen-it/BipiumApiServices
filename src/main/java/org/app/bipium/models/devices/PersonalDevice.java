package org.app.bipium.models.devices;

import java.util.Map;

public class PersonalDevice {
    private String filial;
    private String locality;
    private String deviceType;
    private String deviceNumber;
    private String macAddresses;
    private Map<String, String> coordinates;
    private String password;
    private String route;

    public PersonalDevice(String filial, String locality, String deviceType, String deviceNumber, String macAddresses, Map<String, String> coordinates, String password, String route) {
        this.filial = filial;
        this.locality = locality;
        this.deviceType = deviceType;
        this.deviceNumber = deviceNumber;
        this.macAddresses = macAddresses;
        this.coordinates = coordinates;
        this.password = password;
        this.route = route;
    }

    public String getFilial() {
        return filial;
    }

    public String getLocality() {
        return locality;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public String getDeviceNumber() {
        return deviceNumber;
    }

    public String getMacAddresses() {
        return macAddresses;
    }

    public Map<String, String> getCoordinates() {
        return coordinates;
    }

    public String getPassword() {
        return password;
    }

    public String getRoute() {
        return route;
    }
}
