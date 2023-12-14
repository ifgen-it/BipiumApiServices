package org.app.bipium.services;

import org.app.bipium.models.devices.AbstractDevice;

import java.util.Map;

public interface BipiumApiServices {
    AbstractDevice searchDeviceByNumber(String number);

    AbstractDevice searchDeviceByMac(String mac);
}
