package org.app.bipium.services;

import java.util.Map;

public interface BipiumApiServices {
    Map<String, String> searchPersonDeviceByNumber(String personalDeviceNumber);

    Map<String, String> searchPersonalDeviceByMac(String personalDeviceMacAddress);

    Map<String, String> searchBackBoneDeviceByNumber(String backboneDeviceNumber);

    Map<String, String> searchBackboneDeviceByMac(String backboneDeviceMacAddresses);

}
