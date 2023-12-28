package org.app.bipiumSearchDevice.models.responses;

import java.util.Map;

public interface ResponseSendable {
    Map<String, String> getRequest(int catalogID, String searchValue);
    void postRequest(String searchValue);

}
