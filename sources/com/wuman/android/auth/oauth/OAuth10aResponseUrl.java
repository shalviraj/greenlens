package com.wuman.android.auth.oauth;

import p005b.p096l.p164b.p165a.p169b.C3674c;
import p005b.p096l.p164b.p165a.p173d.C3730k;
import p005b.p096l.p164b.p165a.p173d.C3736n;

public class OAuth10aResponseUrl extends C3674c {
    @C3736n("error")
    private String error;
    @C3736n("oauth_token")
    private String token;
    @C3736n("oauth_verifier")
    private String verifier;

    public OAuth10aResponseUrl() {
    }

    public OAuth10aResponseUrl(String str) {
        super(str);
    }

    public OAuth10aResponseUrl clone() {
        return (OAuth10aResponseUrl) super.clone();
    }

    public final String getError() {
        return this.error;
    }

    public final String getVerifier() {
        return this.verifier;
    }

    public C3674c set(String str, Object obj) {
        return (OAuth10aResponseUrl) super.set(str, obj);
    }

    /* renamed from: set  reason: collision with other method in class */
    public C3730k m15011set(String str, Object obj) {
        return (OAuth10aResponseUrl) super.set(str, obj);
    }
}
