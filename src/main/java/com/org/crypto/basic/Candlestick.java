package com.org.crypto.basic;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.org.crypto.model.ApiResponse;
import com.org.crypto.model.TradeInfo;
import okhttp3.*;

import java.io.IOException;

public class Candlestick {
    private static final String BASE_URL = System.getProperty("crypto.base.url", "https://uat-api.3ona.co/exchange/v1");
    OkHttpClient okHttpClient = new OkHttpClient();
    private static final MediaType JSON_MEDIA_TYPE = MediaType.parse("application/json");
    ObjectMapper objectMapper = new ObjectMapper();


    public ApiResponse getCandlestickByInstrumentName(String instrumentName) throws IOException {
        HttpUrl.Builder urlBuilder = HttpUrl.parse(BASE_URL + "/public/get-candlestick").newBuilder();
        urlBuilder.addQueryParameter("instrument_name", instrumentName);
        System.out.println(urlBuilder);
        Request request = new Request.Builder()
                .url(urlBuilder.build())
                .get()
                .addHeader("Content-Type", "application/json")
                .build();
        return executeRequest(request);
    }

    private ApiResponse executeRequest(Request request) throws IOException {
        try (Response response = okHttpClient.newCall(request).execute()) {
            return ApiResponse.fromResponse(response);
        }
    }


    public static void main(String[] args) throws IOException {
        TradeInfo trade = new TradeInfo("BTCUSD-PERP");
        Candlestick candlestick = new Candlestick();
        ApiResponse response = candlestick.getCandlestickByInstrumentName(trade.getInstrumentName());
        System.out.println("status code is "+response.getStatusCode());
        System.out.println("return body is "+response.getBody());
    }
}
