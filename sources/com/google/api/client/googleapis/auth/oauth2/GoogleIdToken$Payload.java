package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.openidconnect.IdToken$Payload;
import com.google.api.client.json.webtoken.JsonWebToken$Payload;
import p005b.p096l.p164b.p165a.p171c.C3699b;
import p005b.p096l.p164b.p165a.p173d.C3730k;
import p005b.p096l.p164b.p165a.p173d.C3736n;

public class GoogleIdToken$Payload extends IdToken$Payload {
    @C3736n("email")
    private String email;
    @C3736n("email_verified")
    private Object emailVerified;
    @C3736n("hd")
    private String hostedDomain;

    /* renamed from: b */
    public JsonWebToken$Payload mo22120b(String str, Object obj) {
        return (GoogleIdToken$Payload) super.set(str, obj);
    }

    /* renamed from: f */
    public IdToken$Payload mo22122f(String str, Object obj) {
        return (GoogleIdToken$Payload) super.set(str, obj);
    }

    /* renamed from: g */
    public GoogleIdToken$Payload clone() {
        return (GoogleIdToken$Payload) super.clone();
    }

    public C3699b set(String str, Object obj) {
        return (GoogleIdToken$Payload) super.set(str, obj);
    }

    /* renamed from: set  reason: collision with other method in class */
    public C3730k m15003set(String str, Object obj) {
        return (GoogleIdToken$Payload) super.set(str, obj);
    }
}
