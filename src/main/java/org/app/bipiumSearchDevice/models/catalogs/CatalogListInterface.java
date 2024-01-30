package org.app.bipiumSearchDevice.models.catalogs;

import org.app.bipiumSearchDevice.models.devices.AbstractDevice;

import java.util.List;

public interface CatalogListInterface {
    List<Catalog> initial();
    AbstractDevice createDevice();
}
