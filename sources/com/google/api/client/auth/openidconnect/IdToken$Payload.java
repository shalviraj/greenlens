package com.google.api.client.auth.openidconnect;

import com.google.api.client.json.webtoken.JsonWebToken$Payload;
import java.util.List;
import p005b.p096l.p164b.p165a.p173d.C3736n;

public class IdToken$Payload extends JsonWebToken$Payload {
    @C3736n("at_hash")
    private String accessTokenHash;
    @C3736n("auth_time")
    private Long authorizationTimeSeconds;
    @C3736n("azp")
    private String authorizedParty;
    @C3736n("acr")
    private String classReference;
    @C3736n("amr")
    private List<String> methodsReferences;
    @C3736n
    private String nonce;

    /* renamed from: c */
    public IdToken$Payload clone() {
        return (IdToken$Payload) super.clone();
    }

    /* renamed from: f */
    public IdToken$Payload set(String str, Object obj) {
        return (IdToken$Payload) super.set(str, obj);
    }
}
