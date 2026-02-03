package com.org.crypto.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CandlestickApiResponse {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("method")
    private String method;
    @JsonProperty("code")
    private Integer code;
    @JsonProperty("result")
    private KLineResult result;

    public CandlestickApiResponse() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public KLineResult getResult() {
        return result;
    }

    public void setResult(KLineResult result) {
        this.result = result;
    }
    public boolean isSuccess() {
        return code != null && code == 0;
    }
}
