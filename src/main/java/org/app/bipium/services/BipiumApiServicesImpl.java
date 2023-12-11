package org.app.bipium.services;

import java.util.HashMap;
import java.util.Map;

/**
 * Bipium Services Interface
 */
public class BipiumApiServicesImpl implements BipiumApiServices {

    @Override
    public Map<String, String> searchPersonalDeviceByNumber(String personalDeviceNumber) {
        Map<String, String> results = new HashMap<>();

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
}
