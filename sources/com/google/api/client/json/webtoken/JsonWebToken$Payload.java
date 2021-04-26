package com.google.api.client.json.webtoken;

import p005b.p096l.p164b.p165a.p171c.C3699b;
import p005b.p096l.p164b.p165a.p173d.C3736n;

public class JsonWebToken$Payload extends C3699b {
    @C3736n("aud")
    private Object audience;
    @C3736n("exp")
    private Long expirationTimeSeconds;
    @C3736n("iat")
    private Long issuedAtTimeSeconds;
    @C3736n("iss")
    private String issuer;
    @C3736n("jti")
    private String jwtId;
    @C3736n("nbf")
    private Long notBeforeTimeSeconds;
    @C3736n("sub")
    private String subject;
    @C3736n("typ")
    private String type;

    /* renamed from: a */
    public JsonWebToken$Payload clone() {
        return (JsonWebToken$Payload) super.clone();
    }

    /* renamed from: b */
    public JsonWebToken$Payload set(String str, Object obj) {
        return (JsonWebToken$Payload) super.set(str, obj);
    }
}
