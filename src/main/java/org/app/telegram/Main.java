package org.app.telegram;

import org.app.bipium.models.devices.AbstractDevice;
import org.app.bipium.services.BipiumApiServicesBuilder;

public class Main {
    public static void main(String[] args) {
        BipiumApiServicesBuilder builder = new BipiumApiServicesBuilder("пу");
        AbstractDevice device = builder.searchDevice("1220289909969");
        System.out.println(device);
    }
}
