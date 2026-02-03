package com.org.crypto.model;

import java.util.ArrayList;

public class TradeInfo {
    private String instrumentName;
    private String timeframe;
    private int count;
    private long startTs;
    private long endTs;

    // 构造方法
    public TradeInfo() {

    }
    public TradeInfo(String instrumentName) {
        this.instrumentName = instrumentName;

    }

    public TradeInfo(String instrumentName, String timeframe, int count, long startTs, long endTs) {
        this.instrumentName = instrumentName;
        this.timeframe = timeframe;
        this.count = count;
        this.startTs = startTs;
        this.endTs = endTs;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public String getTimeframe() {
        return timeframe;
    }

    public void setTimeframe(String timeframe) {
        this.timeframe = timeframe;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public long getStartTs() {
        return startTs;
    }

    public void setStartTs(long startTs) {
        this.startTs = startTs;
    }

    public long getEndTs() {
        return endTs;
    }

    public void setEndTs(long endTs) {
        this.endTs = endTs;
    }
}
