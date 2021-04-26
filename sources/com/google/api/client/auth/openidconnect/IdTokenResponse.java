package com.google.api.client.auth.openidconnect;

import com.google.api.client.auth.oauth2.TokenResponse;
import p005b.p096l.p164b.p165a.p171c.C3699b;
import p005b.p096l.p164b.p165a.p173d.C3730k;
import p005b.p096l.p164b.p165a.p173d.C3736n;

public class IdTokenResponse extends TokenResponse {
    @C3736n("id_token")
    private String idToken;

    /* renamed from: c */
    public TokenResponse mo22116c(String str, Object obj) {
        return (IdTokenResponse) super.set(str, obj);
    }

    /* renamed from: f */
    public IdTokenResponse clone() {
        return (IdTokenResponse) super.clone();
    }

    public C3699b set(String str, Object obj) {
        return (IdTokenResponse) super.set(str, obj);
    }

    /* renamed from: set  reason: collision with other method in class */
    public C3730k m14998set(String str, Object obj) {
        return (IdTokenResponse) super.set(str, obj);
    }
}
