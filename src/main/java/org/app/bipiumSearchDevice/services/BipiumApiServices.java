package org.app.bipiumSearchDevice.services;

import org.app.bipiumSearchDevice.models.devices.AbstractDevice;

public interface BipiumApiServices { // -> BipiumApiService множественное число не нужно по идее
    AbstractDevice searchDeviceByNumber(String number);

    AbstractDevice searchDeviceByMac(String mac);
}
