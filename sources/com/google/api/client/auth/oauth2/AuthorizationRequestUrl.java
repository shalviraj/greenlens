package com.google.api.client.auth.oauth2;

import java.util.Collection;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p164b.p165a.p169b.C3674c;
import p005b.p096l.p164b.p165a.p173d.C3735m;
import p005b.p096l.p164b.p165a.p173d.C3736n;

public class AuthorizationRequestUrl extends C3674c {
    @C3736n("client_id")
    private String clientId;
    @C3736n("redirect_uri")
    private String redirectUri;
    @C3736n("response_type")
    private String responseTypes;
    @C3736n("scope")
    private String scopes;
    @C3736n
    private String state;

    public AuthorizationRequestUrl(String str, String str2, Collection<String> collection) {
        super(str);
        C1960d.m2849t(this.fragment == null);
        mo14948c(str2);
        mo14950g(collection);
    }

    /* renamed from: a */
    public AuthorizationRequestUrl clone() {
        return (AuthorizationRequestUrl) super.clone();
    }

    /* renamed from: b */
    public AuthorizationRequestUrl set(String str, Object obj) {
        return (AuthorizationRequestUrl) super.set(str, obj);
    }

    /* renamed from: c */
    public AuthorizationRequestUrl mo14948c(String str) {
        Objects.requireNonNull(str);
        this.clientId = str;
        return this;
    }

    /* renamed from: f */
    public AuthorizationRequestUrl mo22107f(String str) {
        this.redirectUri = str;
        return this;
    }

    /* renamed from: g */
    public AuthorizationRequestUrl mo14950g(Collection<String> collection) {
        this.responseTypes = C3735m.m7052b(' ').mo15114a(collection);
        return this;
    }

    /* renamed from: h */
    public AuthorizationRequestUrl mo22108h(Collection<String> collection) {
        this.scopes = (collection == null || !collection.iterator().hasNext()) ? null : C3735m.m7052b(' ').mo15114a(collection);
        return this;
    }
}
