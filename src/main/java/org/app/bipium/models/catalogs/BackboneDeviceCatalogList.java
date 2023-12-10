package org.app.bipium.models.catalogs;

import java.util.List;

public class BackboneDeviceCatalogList extends AbstractCatalogList implements CatalogInitialized{
    public BackboneDeviceCatalogList(List<Catalog> catalogList) {
        super(catalogList);
    }

    @Override
    public void initial() {

    }
}
