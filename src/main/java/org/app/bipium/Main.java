package org.app.bipium;

import org.app.bipium.models.devices.AbstractDevice;
import org.app.bipium.services.BipiumApiServicesBuilder;

public class Main {
    public static void main(String[] args) {
        BipiumApiServicesBuilder builder = new BipiumApiServicesBuilder("пу");
        AbstractDevice device = builder.searchDevice("023230029700");
        System.out.println(device);
    }

}
