package org.app.bipium.models.devices;

public abstract class AbstractDevice {
    private final String filial;
    private final String locality;
    private final String deviceType;
    private final String deviceNumber;
    private final String macAddresses;
    private final String coordinates;
    private final String password;
    private final String route;

    public AbstractDevice(String filial, String locality, String deviceType, String deviceNumber, String macAddresses, String coordinates, String password, String route) {
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

    public String getCoordinates() {
        return coordinates;
    }

    public String getPassword() {
        return password;
    }

    public String getRoute() {
        return route;
    }
}
