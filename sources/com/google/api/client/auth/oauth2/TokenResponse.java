package com.google.api.client.auth.oauth2;

import p005b.p096l.p164b.p165a.p171c.C3699b;
import p005b.p096l.p164b.p165a.p173d.C3736n;

public class TokenResponse extends C3699b {
    @C3736n("access_token")
    private String accessToken;
    @C3736n("expires_in")
    private Long expiresInSeconds;
    @C3736n("refresh_token")
    private String refreshToken;
    @C3736n
    private String scope;
    @C3736n("token_type")
    private String tokenType;

    /* renamed from: a */
    public TokenResponse clone() {
        return (TokenResponse) super.clone();
    }

    /* renamed from: b */
    public String mo22115b() {
        return this.refreshToken;
    }

    /* renamed from: c */
    public TokenResponse set(String str, Object obj) {
        return (TokenResponse) super.set(str, obj);
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public Long getExpiresInSeconds() {
        return this.expiresInSeconds;
    }
}
