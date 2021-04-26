package com.google.api.client.auth.oauth2;

import com.google.api.client.http.HttpTransport;
import java.util.Collection;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p164b.p165a.p166a.p168b.C3669j;
import p005b.p096l.p164b.p165a.p166a.p168b.C3671k;
import p005b.p096l.p164b.p165a.p169b.C3674c;
import p005b.p096l.p164b.p165a.p169b.C3675d;
import p005b.p096l.p164b.p165a.p169b.C3677f;
import p005b.p096l.p164b.p165a.p169b.C3678g;
import p005b.p096l.p164b.p165a.p169b.C3679h;
import p005b.p096l.p164b.p165a.p169b.C3687n;
import p005b.p096l.p164b.p165a.p171c.C3698a;
import p005b.p096l.p164b.p165a.p171c.C3700c;
import p005b.p096l.p164b.p165a.p171c.C3702e;
import p005b.p096l.p164b.p165a.p171c.C3703f;
import p005b.p096l.p164b.p165a.p173d.C3730k;
import p005b.p096l.p164b.p165a.p173d.C3735m;
import p005b.p096l.p164b.p165a.p173d.C3736n;

public class TokenRequest extends C3730k {
    public C3675d clientAuthentication;
    @C3736n("grant_type")
    private String grantType;
    public final C3700c jsonFactory;
    public C3678g requestInitializer;
    public Class<? extends TokenResponse> responseClass;
    @C3736n("scope")
    private String scopes;
    public C3674c tokenServerUrl;
    public final HttpTransport transport;

    public TokenRequest(HttpTransport httpTransport, C3700c cVar, C3674c cVar2, String str) {
        Objects.requireNonNull(httpTransport);
        this.transport = httpTransport;
        Objects.requireNonNull(cVar);
        this.jsonFactory = cVar;
        setTokenServerUrl(cVar2);
        setGrantType(str);
        setResponseClass(TokenResponse.class);
    }

    public TokenResponse execute() {
        HttpTransport httpTransport = this.transport;
        C3669j jVar = new C3669j(this);
        Objects.requireNonNull(httpTransport);
        C3674c cVar = this.tokenServerUrl;
        C3687n nVar = new C3687n(this);
        Object obj = null;
        C3677f fVar = new C3677f(httpTransport, (String) null);
        jVar.initialize(fVar);
        fVar.mo14992d("POST");
        if (cVar != null) {
            fVar.f6775k = cVar;
        }
        fVar.f6772h = nVar;
        fVar.f6779o = new C3702e(this.jsonFactory);
        boolean z = false;
        fVar.f6781q = false;
        C3679h b = fVar.mo14990b();
        if (b.mo14997e()) {
            Class<? extends TokenResponse> cls = this.responseClass;
            int i = b.f6789f;
            if (b.f6791h.f6774j.equals("HEAD") || i / 100 == 1 || i == 204 || i == 304) {
                b.mo14996d();
            } else {
                z = true;
            }
            if (z) {
                C3702e eVar = (C3702e) b.f6791h.f6779o;
                C3703f b2 = eVar.f6829a.mo15025b(b.mo14994b(), b.mo14995c());
                eVar.mo15030a(b2);
                obj = b2.mo15032H(cls, true, (C3698a) null);
            }
            return (TokenResponse) obj;
        }
        throw C3671k.m6921a(this.jsonFactory, b);
    }

    public TokenRequest set(String str, Object obj) {
        super.set(str, obj);
        return this;
    }

    public TokenRequest setGrantType(String str) {
        Objects.requireNonNull(str);
        this.grantType = str;
        return this;
    }

    public TokenRequest setResponseClass(Class<? extends TokenResponse> cls) {
        this.responseClass = cls;
        return this;
    }

    public TokenRequest setScopes(Collection<String> collection) {
        this.scopes = collection == null ? null : C3735m.m7052b(' ').mo15114a(collection);
        return this;
    }

    public TokenRequest setTokenServerUrl(C3674c cVar) {
        this.tokenServerUrl = cVar;
        C1960d.m2849t(cVar.fragment == null);
        return this;
    }
}
