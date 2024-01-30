package org.app.bipiumSearchDevice.services;

import org.app.bipiumSearchDevice.models.devices.AbstractDevice;

public class BipiumApiServicesBuilder {
    private BipiumApiServices bipiumApiServices;
    public BipiumApiServicesBuilder(String deviceType) {
        this.bipiumApiServices = new BipiumApiServicesImpl(deviceType.strip().toLowerCase());
    }

    public AbstractDevice searchDevice(String number) {
        AbstractDevice device = null;

        if (number.length() == 8 || number.length() == 12 || number.length() == 13 || number.length() == 11 || number.length() == 6 || number.length() == 5) {
            device = bipiumApiServices.searchDeviceByNumber(number);
        } else if (number.matches("^[0-9A-Fa-f]{16}$")) {
            device = bipiumApiServices.searchDeviceByMac(number);
        }

        if (device == null) {
            return null;
        } // null возвращать плохо, если надо показать отсутствие значение, то возвращай Optional<AbstractDevice>
        return device;
    }
}
