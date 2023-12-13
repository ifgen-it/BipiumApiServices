package org.app.bipium.services;

import org.app.bipium.models.devices.AbstractDevice;

import java.util.Map;

public interface BipiumApiServices {
    AbstractDevice searchPersonalDeviceByNumber(String personalDeviceNumber);

    AbstractDevice searchPersonalDeviceByMac(String personalDeviceMacAddress);

    AbstractDevice searchBackBoneDeviceByNumber(String backboneDeviceNumber);

    AbstractDevice searchBackboneDeviceByMac(String backboneDeviceMacAddresses);

}
