package com.wuman.android.auth;

import com.google.api.client.auth.oauth2.AuthorizationCodeTokenRequest;
import com.google.api.client.http.HttpTransport;
import com.wuman.android.auth.oauth2.explicit.LenientAuthorizationCodeTokenRequest;
import com.wuman.android.auth.oauth2.implicit.ImplicitResponseUrl;
import java.util.Objects;
import java.util.logging.Logger;
import p005b.p096l.p164b.p165a.p166a.p168b.C3656a;
import p005b.p096l.p164b.p165a.p166a.p168b.C3663f;
import p005b.p096l.p164b.p165a.p166a.p168b.C3667h;
import p005b.p096l.p164b.p165a.p166a.p168b.C3668i;
import p005b.p096l.p164b.p165a.p169b.C3674c;
import p005b.p096l.p164b.p165a.p169b.C3675d;
import p005b.p096l.p164b.p165a.p169b.C3677f;
import p005b.p096l.p164b.p165a.p169b.C3678g;
import p005b.p096l.p164b.p165a.p171c.C3700c;
import p005b.p096l.p164b.p165a.p173d.C3721f;

public class AuthorizationFlow extends C3656a {

    public static class Builder extends C3656a.C3657a {
        public Builder(C3663f.C3664a aVar, HttpTransport httpTransport, C3700c cVar, C3674c cVar2, C3675d dVar, String str, String str2) {
            super(aVar, httpTransport, cVar, cVar2, dVar, str, str2);
        }
    }

    static {
        Logger.getLogger("OAuthAndroid");
    }

    public AuthorizationFlow(Builder builder) {
        super(builder);
    }

    public C3663f createAndStoreCredential(ImplicitResponseUrl implicitResponseUrl, String str) {
        C3674c cVar;
        C3663f.C3665b bVar = new C3663f.C3665b(this.method);
        bVar.transport = this.transport;
        bVar.jsonFactory = this.jsonFactory;
        String str2 = this.tokenServerEncodedUrl;
        if (str2 == null) {
            cVar = null;
        } else {
            cVar = new C3674c(str2);
        }
        bVar.tokenServerUrl = cVar;
        bVar.clientAuthentication = this.clientAuthentication;
        bVar.requestInitializer = this.requestInitializer;
        C3721f fVar = this.clock;
        Objects.requireNonNull(fVar);
        bVar.clock = fVar;
        C3667h hVar = this.credentialStore;
        if (hVar != null) {
            bVar.refreshListeners.add(new C3668i(str, hVar));
        }
        bVar.refreshListeners.addAll(this.refreshListeners);
        C3663f fVar2 = new C3663f(bVar);
        fVar2.setAccessToken(implicitResponseUrl.getAccessToken());
        C3663f expiresInSeconds = fVar2.setExpiresInSeconds(implicitResponseUrl.getExpiresInSeconds());
        C3667h hVar2 = this.credentialStore;
        if (hVar2 != null) {
            hVar2.store(str, expiresInSeconds);
        }
        return expiresInSeconds;
    }

    public AuthorizationCodeTokenRequest newTokenRequest(String str) {
        LenientAuthorizationCodeTokenRequest lenientAuthorizationCodeTokenRequest = new LenientAuthorizationCodeTokenRequest(this.transport, this.jsonFactory, new C3674c(this.tokenServerEncodedUrl), str);
        lenientAuthorizationCodeTokenRequest.clientAuthentication = this.clientAuthentication;
        lenientAuthorizationCodeTokenRequest.setScopes(this.scopes);
        lenientAuthorizationCodeTokenRequest.requestInitializer = new C3678g() {
            public void initialize(C3677f fVar) {
                C3678g gVar = AuthorizationFlow.this.requestInitializer;
                if (gVar != null) {
                    gVar.initialize(fVar);
                }
                fVar.f6766b.mo22142n("application/json");
            }
        };
        return lenientAuthorizationCodeTokenRequest;
    }
}
