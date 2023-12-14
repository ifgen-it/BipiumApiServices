package org.app.bipium.services;

import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import org.app.bipium.config.Credentials;
import org.app.bipium.models.catalogs.BackboneDeviceCatalogList;
import org.app.bipium.models.catalogs.Catalog;
import org.app.bipium.models.catalogs.CatalogListInterface;
import org.app.bipium.models.catalogs.PersonalDeviceCatalogList;
import org.app.bipium.models.devices.AbstractDevice;
import org.app.bipium.models.devices.BackboneDevice;
import org.app.bipium.models.devices.PersonalDevice;
import org.app.bipium.models.responses.BipiumApiResponse;
import org.app.bipium.models.responses.ResponseSendable;

import java.io.Serializable;
import java.util.*;

/**
 * Bipium Services Interface
 */
public class BipiumApiServicesImpl implements BipiumApiServices, Serializable {

    private String select;
    private CatalogListInterface catalogListInterface;

    public BipiumApiServicesImpl(String select) {
        if (select.equals("пу")) {
            catalogListInterface = new PersonalDeviceCatalogList();
        } else if (select.equals("успд")) {
            catalogListInterface = new BackboneDeviceCatalogList();
        }
    }

    @Override
    public AbstractDevice searchDeviceByNumber(String searchValue) {
        List<Catalog> catalogs = this.catalogListInterface.initial();

        Map<String, String> requestHashmap = null;
        Map<String, String> catalogHashMap = null;

        for (Catalog catalog : catalogs) {
            ResponseSendable responseSendable = new BipiumApiResponse(Credentials.DOMAIN);

            if (responseSendable.getRequest(catalog.getId(), searchValue) != null) {
                requestHashmap = responseSendable.getRequest(catalog.getId(), searchValue);
                System.out.println(catalog.getName());
                catalogHashMap = catalog.getFieldsValues();
            }
        }

        System.out.println(catalogHashMap);
        System.out.println(requestHashmap);
        assert catalogHashMap != null;

        Map<String, String> result = requestDataMapSynchronization(catalogHashMap, requestHashmap);
        return null;
    }


    @Override
    public AbstractDevice searchDeviceByMac(String mac) {
        return null;
    }

    private Map<String, String> requestDataMapSynchronization(Map<String, String> sourceMap, Map<String, String> destinationMap) {
        Set<String> keySet = sourceMap.keySet();

        return null;
    }


    public static void main(String[] args) {
        BipiumApiServices services = new BipiumApiServicesImpl("пу");
        AbstractDevice device = services.searchDeviceByNumber("023230079086");
        System.out.println(device);
    }
}
