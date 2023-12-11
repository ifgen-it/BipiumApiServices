package org.app.bipium.services;

import java.util.Map;

public class BipiumApiServicesImpl implements BipiumApiServices {
    @Override
    public Map<String, String> searchPersonDeviceByNumber(String personalDeviceNumber) {
        return null;
    }

    @Override
    public Map<String, String> searchPersonalDeviceByMac(String personalDeviceMacAddress) {
        return null;
    }

    @Override
    public Map<String, String> searchBackBoneDeviceByNumber(String backboneDeviceNumber) {
        return null;
    }

    @Override
    public Map<String, String> searchBackboneDeviceByMac(String backboneDeviceMacAddresses) {
        return null;
    }

    public static void main(String[] args) {
        BipiumApiServices services = new BipiumApiServicesImpl();
        Map<String, String> deviceInformation = services.searchPersonalDeviceByMac("");
    }
}
