package com.org.crypto.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class KLineData {
    @JsonProperty("t")
    private long startTime;
    @JsonProperty("o")
    private BigDecimal openPrice;
    @JsonProperty("h")
    private BigDecimal highPrice;
    @JsonProperty("l")
    private BigDecimal lowPrice;

    @JsonProperty("c")
    private BigDecimal closePrice;
    @JsonProperty("v")
    private BigDecimal volume;

    public KLineData() {

    }

    public KLineData(long startTime, BigDecimal openPrice, BigDecimal highPrice, BigDecimal lowPrice, BigDecimal volume) {
        this.startTime = startTime;
        this.openPrice = openPrice;
        this.highPrice = highPrice;
        this.lowPrice = lowPrice;
        this.volume = volume;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public BigDecimal getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(BigDecimal openPrice) {
        this.openPrice = openPrice;
    }

    public BigDecimal getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(BigDecimal highPrice) {
        this.highPrice = highPrice;
    }

    public BigDecimal getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(BigDecimal lowPrice) {
        this.lowPrice = lowPrice;
    }


    public BigDecimal getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(BigDecimal closePrice) {
        this.closePrice = closePrice;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }
}
