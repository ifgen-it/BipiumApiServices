package org.app.bipium.services;

import org.app.bipium.models.devices.AbstractDevice;

import java.util.HashMap;
import java.util.Map;

/**
 * Bipium Services Interface
 */
public class BipiumApiServicesImpl implements BipiumApiServices {

    @Override
    public AbstractDevice searchPersonalDeviceByNumber(String personalDeviceNumber) {

        return null;
    }

    @Override
    public AbstractDevice searchPersonalDeviceByMac(String personalDeviceMacAddress) {
        return null;
    }

    @Override
    public AbstractDevice searchBackBoneDeviceByNumber(String backboneDeviceNumber) {
        return null;
    }

    @Override
    public AbstractDevice searchBackboneDeviceByMac(String backboneDeviceMacAddresses) {
        return null;
    }

    public static void main(String[] args) {

    }
}
