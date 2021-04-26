package com.google.api.client.auth.oauth2;

import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p164b.p165a.p169b.C3674c;
import p005b.p096l.p164b.p165a.p173d.C3730k;
import p005b.p096l.p164b.p165a.p173d.C3736n;

public class AuthorizationCodeResponseUrl extends C3674c {
    @C3736n
    private String code;
    @C3736n
    private String error;
    @C3736n("error_description")
    private String errorDescription;
    @C3736n("error_uri")
    private String errorUri;
    @C3736n
    private String state;

    public AuthorizationCodeResponseUrl(String str) {
        super(str);
        C1960d.m2849t((this.code == null) == (this.error == null) ? false : true);
    }

    /* renamed from: a */
    public AuthorizationCodeResponseUrl clone() {
        return (AuthorizationCodeResponseUrl) super.clone();
    }

    /* renamed from: b */
    public final String mo22100b() {
        return this.code;
    }

    public final String getError() {
        return this.error;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public C3674c set(String str, Object obj) {
        return (AuthorizationCodeResponseUrl) super.set(str, obj);
    }

    /* renamed from: set  reason: collision with other method in class */
    public C3730k m14993set(String str, Object obj) {
        return (AuthorizationCodeResponseUrl) super.set(str, obj);
    }
}
