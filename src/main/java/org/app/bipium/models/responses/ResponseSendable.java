package org.app.bipium.models.responses;

import org.app.bipium.models.catalogs.Catalog;

import java.util.Map;

public interface ResponseSendable {
    Map<String, String> getRequest(int catalogID, String searchValue);
    void postRequest(String searchValue);

}
