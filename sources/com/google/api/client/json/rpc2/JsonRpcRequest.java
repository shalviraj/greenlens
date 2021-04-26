package com.google.api.client.json.rpc2;

import p005b.p096l.p164b.p165a.p173d.C3730k;
import p005b.p096l.p164b.p165a.p173d.C3736n;

public class JsonRpcRequest extends C3730k {
    @C3736n

    /* renamed from: id */
    private Object f11412id;
    @C3736n
    private final String jsonrpc = "2.0";
    @C3736n
    private String method;
    @C3736n
    private Object params;

    public C3730k clone() {
        return (JsonRpcRequest) super.clone();
    }

    public C3730k set(String str, Object obj) {
        super.set(str, obj);
        return this;
    }

    /* renamed from: clone  reason: collision with other method in class */
    public Object m15009clone() {
        return (JsonRpcRequest) super.clone();
    }
}
