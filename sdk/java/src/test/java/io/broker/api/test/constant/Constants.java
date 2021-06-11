package io.broker.api.test.constant;

public class Constants {

    // FIXME: change to a valid key and secret for test
    public final static String ACCESS_KEY = "";
    public final static String SECRET_KEY = "";

    // FIXME: please change to your valid api domain for test, for example: 5roi.com
    public static final String BASE_DOMAIN = "";

    // REST api url format: https://api.BASE_DOMAIN
    // for example: https://api.5roi.com
    public static final String API_BASE_URL = "https://api." + BASE_DOMAIN;

    // Websocket base api url format: wss://wsapi.BASE_DOMAIN/openapi/quote/ws/v1
    // for example: wss://wsapi.5roi.com/openapi/quote/ws/v1
    public static final String WS_API_BASE_URL =  "wss://wsapi." + BASE_DOMAIN +  "/openapi/quote/ws/v1";

    // Websocket user api url format: wss://wsapi.BASE_DOMAIN/openapi/ws
    // for example: wss://wsapi.5roi.com/openapi/ws
    public static final String WS_API_USER_URL = "wss://wsapi." + BASE_DOMAIN + "/openapi/ws";
}
