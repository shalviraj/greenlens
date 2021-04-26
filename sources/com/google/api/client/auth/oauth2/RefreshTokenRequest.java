package com.google.api.client.auth.oauth2;

import com.google.api.client.http.HttpTransport;
import java.util.Objects;
import p005b.p096l.p164b.p165a.p169b.C3674c;
import p005b.p096l.p164b.p165a.p171c.C3700c;
import p005b.p096l.p164b.p165a.p173d.C3730k;
import p005b.p096l.p164b.p165a.p173d.C3736n;

public class RefreshTokenRequest extends TokenRequest {
    @C3736n("refresh_token")
    private String refreshToken;

    public RefreshTokenRequest(HttpTransport httpTransport, C3700c cVar, C3674c cVar2, String str) {
        super(httpTransport, cVar, cVar2, "refresh_token");
        Objects.requireNonNull(str);
        this.refreshToken = str;
    }

    /* renamed from: set  reason: collision with other method in class */
    public TokenRequest m14996set(String str, Object obj) {
        return (RefreshTokenRequest) super.set(str, obj);
    }

    public TokenRequest setGrantType(String str) {
        super.setGrantType(str);
        return this;
    }

    public TokenRequest setResponseClass(Class cls) {
        this.responseClass = cls;
        return this;
    }

    public TokenRequest setTokenServerUrl(C3674c cVar) {
        super.setTokenServerUrl(cVar);
        return this;
    }

    public C3730k set(String str, Object obj) {
        return (RefreshTokenRequest) super.set(str, obj);
    }
}
