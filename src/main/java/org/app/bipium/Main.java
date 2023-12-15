package org.app.bipium;

import org.app.bipium.models.catalogs.*;
import org.app.bipium.models.devices.AbstractDevice;
import org.app.bipium.services.BipiumApiServices;
import org.app.bipium.services.BipiumApiServicesBuilder;
import org.app.bipium.services.BipiumApiServicesImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        BipiumApiServicesBuilder builder = new BipiumApiServicesBuilder("пу");
        AbstractDevice device = builder.searchDevice("023230029700");
        System.out.println(device);
    }

}
