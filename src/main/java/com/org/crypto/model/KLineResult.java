package com.org.crypto.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class KLineResult {
    @JsonProperty("instrument_name")
    private String instrumentName;
    @JsonProperty("interval")
    private String interval;
    @JsonProperty("data")
    private List<KLineData> dataList;

    public KLineResult(){

    }

    public KLineResult(String instrumentName, String interval, List<KLineData> dataList) {
        this.instrumentName = instrumentName;
        this.interval = interval;
        this.dataList = dataList;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public List<KLineData> getDataList() {
        return dataList;
    }

    public void setData(List<KLineData> data) { this.dataList = data; }
}
