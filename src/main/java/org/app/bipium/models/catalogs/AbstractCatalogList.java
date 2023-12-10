package org.app.bipium.models.catalogs;

import java.util.List;

public class AbstractCatalogList {
    private List<Catalog> catalogList;

    public AbstractCatalogList(List<Catalog> catalogList) {
        this.catalogList = catalogList;
    }

    public List<Catalog> getCatalogList() {
        return catalogList;
    }

    public void addCatalog(Catalog catalog) {
        catalogList.add(catalog);
    }
}
