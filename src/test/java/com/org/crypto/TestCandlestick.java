package com.org.crypto;

import com.org.crypto.basic.Candlestick;
import com.org.crypto.model.ApiResponse;
import com.org.crypto.model.CandlestickApiResponse;
import com.org.crypto.model.KLineResult;
import com.org.crypto.model.TradeInfo;
import okhttp3.OkHttpClient;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCandlestick {
    OkHttpClient okHttpClient;
    Candlestick candlestick;
    @BeforeClass
    void setUp(){
        okHttpClient = new OkHttpClient();
        candlestick = new Candlestick();
    }
    @Test(description = "TC001")
    void testGet() throws IOException {
        TradeInfo tradeInfo = new TradeInfo("BTCUSD-PERP");
        ApiResponse response = candlestick.getCandlestickByInstrumentName(tradeInfo.getInstrumentName());
        CandlestickApiResponse candlestickApiResponse = response.parseJson(CandlestickApiResponse.class);
        Assert.assertTrue(response.isSuccessful());
        Assert.assertEquals(response.getStatusCode(),200);
        Assert.assertEquals(candlestickApiResponse.getResult().getInstrumentName(),"BTCUSD-PERP");
        Assert.assertEquals(candlestickApiResponse.getResult().getDataList().size(),25);
        Assert.assertEquals(candlestickApiResponse.getResult().getInterval(),"1m");

    }

}
