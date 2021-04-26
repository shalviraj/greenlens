package com.google.api.client.json.webtoken;

import java.util.ArrayList;
import java.util.List;
import p005b.p096l.p164b.p165a.p171c.C3699b;
import p005b.p096l.p164b.p165a.p173d.C3730k;
import p005b.p096l.p164b.p165a.p173d.C3736n;

public class JsonWebSignature$Header extends JsonWebToken$Header {
    @C3736n("alg")
    private String algorithm;
    @C3736n("crit")
    private List<String> critical;
    @C3736n("jwk")
    private String jwk;
    @C3736n("jku")
    private String jwkUrl;
    @C3736n("kid")
    private String keyId;
    @C3736n("x5c")
    private ArrayList<String> x509Certificates;
    @C3736n("x5t")
    private String x509Thumbprint;
    @C3736n("x5u")
    private String x509Url;

    /* renamed from: b */
    public JsonWebToken$Header mo22151b(String str, Object obj) {
        return (JsonWebSignature$Header) super.set(str, obj);
    }

    /* renamed from: c */
    public JsonWebSignature$Header clone() {
        return (JsonWebSignature$Header) super.clone();
    }

    public C3699b set(String str, Object obj) {
        return (JsonWebSignature$Header) super.set(str, obj);
    }

    /* renamed from: set  reason: collision with other method in class */
    public C3730k m15010set(String str, Object obj) {
        return (JsonWebSignature$Header) super.set(str, obj);
    }
}
