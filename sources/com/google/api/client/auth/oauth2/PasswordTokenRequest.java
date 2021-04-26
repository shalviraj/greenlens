package com.google.api.client.auth.oauth2;

import p005b.p096l.p164b.p165a.p169b.C3674c;
import p005b.p096l.p164b.p165a.p173d.C3730k;
import p005b.p096l.p164b.p165a.p173d.C3736n;

public class PasswordTokenRequest extends TokenRequest {
    @C3736n
    private String password;
    @C3736n
    private String username;

    /* renamed from: set  reason: collision with other method in class */
    public TokenRequest m14995set(String str, Object obj) {
        return (PasswordTokenRequest) super.set(str, obj);
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
        return (PasswordTokenRequest) super.set(str, obj);
    }
}
