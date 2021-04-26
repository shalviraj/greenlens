package com.wuman.android.auth.oauth;

import com.google.api.client.auth.oauth2.TokenResponse;
import java.util.Objects;
import p005b.p096l.p164b.p165a.p166a.p167a.C3653a;
import p005b.p096l.p164b.p165a.p166a.p167a.C3654b;
import p005b.p096l.p164b.p165a.p166a.p168b.C3663f;
import p005b.p096l.p164b.p165a.p169b.C3677f;
import p005b.p096l.p164b.p165a.p169b.C3679h;

public class OAuthHmacCredential extends C3663f {
    public C3654b authorizer;
    public String consumerKey;
    public String sharedSecret;
    public String tokenSharedSecret;

    public boolean handleResponse(C3677f fVar, C3679h hVar, boolean z) {
        if (hVar.f6789f != 401) {
            return false;
        }
        super.setAccessToken((String) null);
        postConstruct();
        return false;
    }

    public void initialize(C3677f fVar) {
        C3654b bVar = this.authorizer;
        Objects.requireNonNull(bVar);
        fVar.f6765a = bVar;
        fVar.f6765a = this;
        fVar.f6778n = this;
    }

    public void intercept(C3677f fVar) {
        super.intercept(fVar);
        this.authorizer.intercept(fVar);
    }

    public final void postConstruct() {
        C3653a aVar = new C3653a();
        aVar.f6730a = this.sharedSecret;
        aVar.f6731b = this.tokenSharedSecret;
        C3654b bVar = new C3654b();
        this.authorizer = bVar;
        bVar.f6735b = this.consumerKey;
        bVar.f6734a = aVar;
        bVar.f6740g = getAccessToken();
    }

    public C3663f setAccessToken(String str) {
        super.setAccessToken(str);
        postConstruct();
        return this;
    }

    public C3663f setExpirationTimeMilliseconds(Long l) {
        super.setExpirationTimeMilliseconds(l);
        return this;
    }

    public C3663f setExpiresInSeconds(Long l) {
        return (OAuthHmacCredential) super.setExpiresInSeconds(l);
    }

    public C3663f setFromTokenResponse(TokenResponse tokenResponse) {
        super.setFromTokenResponse(tokenResponse);
        return this;
    }

    public C3663f setRefreshToken(String str) {
        super.setRefreshToken(str);
        return this;
    }
}
