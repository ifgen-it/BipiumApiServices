package org.app.bipium.models.responses;

public interface ResponseSendable {
    StringBuilder sendGet(String url);

    String sendPost(String url);
}
