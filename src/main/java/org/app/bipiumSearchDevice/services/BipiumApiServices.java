package org.app.bipiumSearchDevice.services;

import org.app.bipiumSearchDevice.models.devices.AbstractDevice;

public interface BipiumApiServices {
    AbstractDevice searchDeviceByNumber(String number);

    AbstractDevice searchDeviceByMac(String mac);
}
