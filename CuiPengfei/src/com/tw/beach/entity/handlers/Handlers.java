package com.tw.beach.entity.handlers;

import com.tw.beach.entity.requests.RequestType;

import java.util.HashMap;

public final class Handlers {
    private static final HashMap<RequestType, RequestHandler> handlers = new HashMap<RequestType, RequestHandler>() {{
        put(RequestType.Deposit, new DepositHandler());
        put(RequestType.WithDraw, new WithdrawHandler());
    }};

    public static RequestHandler findHandler(RequestType requestType) {
        return handlers.get(requestType);
    }
}
