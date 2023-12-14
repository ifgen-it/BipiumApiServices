package org.app.bipium.services;

import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import org.app.bipium.config.Credentials;
import org.app.bipium.models.catalogs.BackboneDeviceCatalogList;
import org.app.bipium.models.catalogs.Catalog;
import org.app.bipium.models.catalogs.CatalogListInterface;
import org.app.bipium.models.catalogs.PersonalDeviceCatalogList;
import org.app.bipium.models.devices.AbstractDevice;
import org.app.bipium.models.responses.BipiumApiResponse;
import org.app.bipium.models.responses.ResponseSendable;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public AbstractDevice searchDeviceByNumber(String deviceNumber) {

        List<Catalog> catalogs = this.catalogListInterface.initial();


        Catalog resultCatalog = null;
        for (Catalog catalog : catalogs) {
            ResponseSendable responseSendable = new BipiumApiResponse(Credentials.DOMAIN);

            Map<String, String> result = responseSendable.getRequest(catalog.getId(), deviceNumber);

            System.out.println(result);
        }

        return null;
    }

    @Override
    public AbstractDevice searchDeviceByMac(String mac) {
        return null;
    }

    public static void main(String[] args) {
        BipiumApiServices services = new BipiumApiServicesImpl("пу");
        services.searchDeviceByNumber("78323");
    }
}
