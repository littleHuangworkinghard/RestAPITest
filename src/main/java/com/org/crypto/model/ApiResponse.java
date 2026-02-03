package com.org.crypto.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.IOException;

public class ApiResponse {
    private final int statusCode;
    private final String statusMessage;
    private final Headers headers;
    private final String body;
    private final boolean isSuccessful;

    public ApiResponse(Response response) throws IOException {
        this.statusCode = response.code();
        this.statusMessage = response.message();
        this.headers = response.headers();
        this.isSuccessful = response.isSuccessful();
        ;
        ResponseBody responseBody = response.body();
        this.body = responseBody != null ? responseBody.string() : "";
    }

    public static ApiResponse fromResponse(Response response) throws IOException {
        return new ApiResponse(response);
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public Headers getHeaders() {
        return headers;
    }

    public String getBody() {
        return body;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }

    public String getHeader(String name) {
        return headers.get(name);
    }

    public <T> T parseJson(Class<T> clazz) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(body, clazz);
    }

    public ApiResponse orThrow(String message) throws IOException {
        if (isSuccessful) {
            throw new IOException(message + " (status code: " + statusCode + ")");
        }
        return this;
    }
}
