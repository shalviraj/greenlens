package p005b.p096l.p164b.p165a.p166a.p168b;

import com.google.api.client.http.HttpTransport;
import com.wuman.android.auth.AuthorizationFlow;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p164b.p165a.p166a.p168b.C3663f;
import p005b.p096l.p164b.p165a.p169b.C3674c;
import p005b.p096l.p164b.p165a.p169b.C3675d;
import p005b.p096l.p164b.p165a.p169b.C3678g;
import p005b.p096l.p164b.p165a.p171c.C3700c;
import p005b.p096l.p164b.p165a.p173d.C3721f;

/* renamed from: b.l.b.a.a.b.a */
public class C3656a {
    public final String authorizationServerEncodedUrl;
    public final C3675d clientAuthentication;
    public final String clientId;
    public final C3721f clock;
    @Deprecated
    public final C3667h credentialStore;
    public final C3700c jsonFactory;
    public final C3663f.C3664a method;
    public final Collection<C3666g> refreshListeners;
    public final C3678g requestInitializer;
    public final Collection<String> scopes;
    public final String tokenServerEncodedUrl;
    public final HttpTransport transport;

    /* renamed from: b.l.b.a.a.b.a$a */
    public static class C3657a {
        public String authorizationServerEncodedUrl;
        public C3675d clientAuthentication;
        public String clientId;
        public C3721f clock = C3721f.f6871a;
        @Deprecated
        public C3667h credentialStore;
        public C3700c jsonFactory;
        public C3663f.C3664a method;
        public Collection<C3666g> refreshListeners = new ArrayList();
        public C3678g requestInitializer;
        public Collection<String> scopes = new ArrayList();
        public C3674c tokenServerUrl;
        public HttpTransport transport;

        public C3657a(C3663f.C3664a aVar, HttpTransport httpTransport, C3700c cVar, C3674c cVar2, C3675d dVar, String str, String str2) {
            AuthorizationFlow.Builder builder = (AuthorizationFlow.Builder) this;
            Objects.requireNonNull(aVar);
            builder.method = aVar;
            Objects.requireNonNull(httpTransport);
            builder.transport = httpTransport;
            Objects.requireNonNull(cVar);
            builder.jsonFactory = cVar;
            Objects.requireNonNull(cVar2);
            builder.tokenServerUrl = cVar2;
            builder.clientAuthentication = dVar;
            Objects.requireNonNull(str);
            builder.clientId = str;
            Objects.requireNonNull(str2);
            builder.authorizationServerEncodedUrl = str2;
        }
    }

    public C3656a(C3657a aVar) {
        C3663f.C3664a aVar2 = aVar.method;
        Objects.requireNonNull(aVar2);
        this.method = aVar2;
        HttpTransport httpTransport = aVar.transport;
        Objects.requireNonNull(httpTransport);
        this.transport = httpTransport;
        C3700c cVar = aVar.jsonFactory;
        Objects.requireNonNull(cVar);
        this.jsonFactory = cVar;
        C3674c cVar2 = aVar.tokenServerUrl;
        Objects.requireNonNull(cVar2);
        this.tokenServerEncodedUrl = cVar2.build();
        this.clientAuthentication = aVar.clientAuthentication;
        String str = aVar.clientId;
        Objects.requireNonNull(str);
        this.clientId = str;
        String str2 = aVar.authorizationServerEncodedUrl;
        Objects.requireNonNull(str2);
        this.authorizationServerEncodedUrl = str2;
        this.requestInitializer = aVar.requestInitializer;
        this.credentialStore = aVar.credentialStore;
        this.scopes = Collections.unmodifiableCollection(aVar.scopes);
        C3721f fVar = aVar.clock;
        Objects.requireNonNull(fVar);
        this.clock = fVar;
        this.refreshListeners = Collections.unmodifiableCollection(aVar.refreshListeners);
    }

    public C3663f loadCredential(String str) {
        if (C1960d.m2834p0(str) || this.credentialStore == null) {
            return null;
        }
        C3663f newCredential = newCredential(str);
        if (!this.credentialStore.load(str, newCredential)) {
            return null;
        }
        return newCredential;
    }

    public final C3663f newCredential(String str) {
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
        return new C3663f(bVar);
    }
}
