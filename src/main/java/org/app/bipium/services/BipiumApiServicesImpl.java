package org.app.bipium.services;

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
        List<Catalog> catalogs = catalogListInterface.initial();

        Map<String, String> requestHashmap = null;
        Map<String, String> resultCatalogHashMap = null;

        for (Catalog catalog : catalogs) {
            ResponseSendable responseSendable = new BipiumApiResponse(Credentials.DOMAIN);

            if (responseSendable.getRequest(catalog.getId(), searchValue) != null) {
                requestHashmap = responseSendable.getRequest(catalog.getId(), searchValue);
                resultCatalogHashMap = catalog.getFieldsValues();
            }
        }

        AbstractDevice resultDevice = null;

        if (catalogListInterface instanceof PersonalDeviceCatalogList) {
            resultDevice = new PersonalDevice();
        } else if (catalogListInterface instanceof BackboneDeviceCatalogList) {
            resultDevice = new BackboneDevice();
        }

        if (resultDevice != null) {
            if (resultCatalogHashMap != null) {
                resultDevice.setValues(resultCatalogHashMap, requestHashmap);
            } else {
                System.out.println("Data not found");
                System.exit(-10);
            }

        }
        return resultDevice;
    }


    @Override
    public AbstractDevice searchDeviceByMac(String macAddress) {
        List<Catalog> catalogs = catalogListInterface.initial();

        Map<String, String> requestHashmap = null;
        Map<String, String> resultCatalogHashMap = null;

        for (Catalog catalog : catalogs) {
            ResponseSendable responseSendable = new BipiumApiResponse(Credentials.DOMAIN);

            if (responseSendable.getRequest(catalog.getId(), macAddress) != null) {
                requestHashmap = responseSendable.getRequest(catalog.getId(), macAddress);
                resultCatalogHashMap = catalog.getFieldsValues();
            }
        }

        AbstractDevice resultDevice = null;

        if (catalogListInterface instanceof PersonalDeviceCatalogList) {
            resultDevice = new PersonalDevice();
        } else if (catalogListInterface instanceof BackboneDeviceCatalogList) {
            resultDevice = new BackboneDevice();
        }

        if (resultDevice != null) {
            if (resultCatalogHashMap != null) {
                resultDevice.setValues(resultCatalogHashMap, requestHashmap);
            } else {
                System.out.println("Data not found");
                System.exit(-10);
            }

        }


        return resultDevice;
    }



}
