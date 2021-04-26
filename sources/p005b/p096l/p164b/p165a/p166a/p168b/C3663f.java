package p005b.p096l.p164b.p165a.p166a.p168b;

import com.google.api.client.auth.oauth2.RefreshTokenRequest;
import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.http.HttpTransport;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p164b.p165a.p169b.C3674c;
import p005b.p096l.p164b.p165a.p169b.C3675d;
import p005b.p096l.p164b.p165a.p169b.C3677f;
import p005b.p096l.p164b.p165a.p169b.C3678g;
import p005b.p096l.p164b.p165a.p169b.C3679h;
import p005b.p096l.p164b.p165a.p169b.C3682j;
import p005b.p096l.p164b.p165a.p171c.C3700c;
import p005b.p096l.p164b.p165a.p173d.C3721f;

/* renamed from: b.l.b.a.a.b.f */
public class C3663f implements C3675d, C3678g, C3682j {
    public static final Logger LOGGER = Logger.getLogger(C3663f.class.getName());
    public String accessToken;
    public final C3675d clientAuthentication;
    public final C3721f clock;
    public Long expirationTimeMilliseconds;
    public final C3700c jsonFactory;
    public final Lock lock = new ReentrantLock();
    public final C3664a method;
    public final Collection<C3666g> refreshListeners;
    public String refreshToken;
    public final C3678g requestInitializer;
    public final String tokenServerEncodedUrl;
    public final HttpTransport transport;

    /* renamed from: b.l.b.a.a.b.f$a */
    public interface C3664a {
        /* renamed from: a */
        void mo14956a(C3677f fVar, String str);

        /* renamed from: b */
        String mo14957b(C3677f fVar);
    }

    /* renamed from: b.l.b.a.a.b.f$b */
    public static class C3665b {
        public C3675d clientAuthentication;
        public C3721f clock = C3721f.f6871a;
        public C3700c jsonFactory;
        public final C3664a method;
        public Collection<C3666g> refreshListeners = new ArrayList();
        public C3678g requestInitializer;
        public C3674c tokenServerUrl;
        public HttpTransport transport;

        public C3665b(C3664a aVar) {
            Objects.requireNonNull(aVar);
            this.method = aVar;
        }
    }

    public C3663f(C3665b bVar) {
        C3664a aVar = bVar.method;
        Objects.requireNonNull(aVar);
        this.method = aVar;
        this.transport = bVar.transport;
        this.jsonFactory = bVar.jsonFactory;
        C3674c cVar = bVar.tokenServerUrl;
        this.tokenServerEncodedUrl = cVar == null ? null : cVar.build();
        this.clientAuthentication = bVar.clientAuthentication;
        this.requestInitializer = bVar.requestInitializer;
        this.refreshListeners = Collections.unmodifiableCollection(bVar.refreshListeners);
        C3721f fVar = bVar.clock;
        Objects.requireNonNull(fVar);
        this.clock = fVar;
    }

    public TokenResponse executeRefreshToken() {
        if (this.refreshToken == null) {
            return null;
        }
        RefreshTokenRequest refreshTokenRequest = new RefreshTokenRequest(this.transport, this.jsonFactory, new C3674c(this.tokenServerEncodedUrl), this.refreshToken);
        refreshTokenRequest.clientAuthentication = this.clientAuthentication;
        refreshTokenRequest.requestInitializer = this.requestInitializer;
        return refreshTokenRequest.execute();
    }

    public final String getAccessToken() {
        this.lock.lock();
        try {
            return this.accessToken;
        } finally {
            this.lock.unlock();
        }
    }

    public final Long getExpirationTimeMilliseconds() {
        this.lock.lock();
        try {
            return this.expirationTimeMilliseconds;
        } finally {
            this.lock.unlock();
        }
    }

    public final Long getExpiresInSeconds() {
        this.lock.lock();
        try {
            Long l = this.expirationTimeMilliseconds;
            return l == null ? null : Long.valueOf((l.longValue() - this.clock.mo15078a()) / 1000);
        } finally {
            this.lock.unlock();
        }
    }

    public final String getRefreshToken() {
        this.lock.lock();
        try {
            return this.refreshToken;
        } finally {
            this.lock.unlock();
        }
    }

    public boolean handleResponse(C3677f fVar, C3679h hVar, boolean z) {
        boolean z2;
        boolean z3;
        List<String> f = hVar.f6791h.f6767c.mo22135f();
        boolean z4 = true;
        if (f != null) {
            Iterator<String> it = f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (next.startsWith("Bearer ")) {
                    z2 = C3659c.f6743a.matcher(next).find();
                    z3 = true;
                    break;
                }
            }
        }
        z2 = false;
        z3 = false;
        if (!z3) {
            z2 = hVar.f6789f == 401;
        }
        if (z2) {
            try {
                this.lock.lock();
                if (C1960d.m2725K(this.accessToken, this.method.mo14957b(fVar)) && !refreshToken()) {
                    z4 = false;
                }
                this.lock.unlock();
                return z4;
            } catch (IOException e) {
                LOGGER.log(Level.SEVERE, "unable to refresh token", e);
            } catch (Throwable th) {
                this.lock.unlock();
                throw th;
            }
        }
        return false;
    }

    public void initialize(C3677f fVar) {
        fVar.f6765a = this;
        fVar.f6778n = this;
    }

    public void intercept(C3677f fVar) {
        this.lock.lock();
        try {
            Long expiresInSeconds = getExpiresInSeconds();
            if (this.accessToken == null || (expiresInSeconds != null && expiresInSeconds.longValue() <= 60)) {
                refreshToken();
                if (this.accessToken == null) {
                    return;
                }
            }
            this.method.mo14956a(fVar, this.accessToken);
            this.lock.unlock();
        } finally {
            this.lock.unlock();
        }
    }

    public final boolean refreshToken() {
        this.lock.lock();
        boolean z = true;
        try {
            TokenResponse executeRefreshToken = executeRefreshToken();
            if (executeRefreshToken != null) {
                setFromTokenResponse(executeRefreshToken);
                for (C3666g b : this.refreshListeners) {
                    b.mo10624b(this, executeRefreshToken);
                }
                this.lock.unlock();
                return true;
            }
        } catch (C3671k e) {
            int i = e.statusCode;
            if (400 > i || i >= 500) {
                z = false;
            }
            if (e.f6751g != null && z) {
                setAccessToken((String) null);
                setExpiresInSeconds((Long) null);
            }
            for (C3666g a : this.refreshListeners) {
                a.mo10623a(this, e.f6751g);
            }
            if (z) {
                throw e;
            }
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
        this.lock.unlock();
        return false;
    }

    public C3663f setAccessToken(String str) {
        this.lock.lock();
        try {
            this.accessToken = str;
            return this;
        } finally {
            this.lock.unlock();
        }
    }

    public C3663f setExpirationTimeMilliseconds(Long l) {
        this.lock.lock();
        try {
            this.expirationTimeMilliseconds = l;
            return this;
        } finally {
            this.lock.unlock();
        }
    }

    public C3663f setExpiresInSeconds(Long l) {
        Long l2;
        if (l == null) {
            l2 = null;
        } else {
            l2 = Long.valueOf((l.longValue() * 1000) + this.clock.mo15078a());
        }
        return setExpirationTimeMilliseconds(l2);
    }

    public C3663f setFromTokenResponse(TokenResponse tokenResponse) {
        setAccessToken(tokenResponse.getAccessToken());
        if (tokenResponse.mo22115b() != null) {
            setRefreshToken(tokenResponse.mo22115b());
        }
        setExpiresInSeconds(tokenResponse.getExpiresInSeconds());
        return this;
    }

    public C3663f setRefreshToken(String str) {
        this.lock.lock();
        if (str != null) {
            try {
                C1960d.m2833p((this.jsonFactory == null || this.transport == null || this.clientAuthentication == null || this.tokenServerEncodedUrl == null) ? false : true, "Please use the Builder and call setJsonFactory, setTransport, setClientAuthentication and setTokenServerUrl/setTokenServerEncodedUrl");
            } catch (Throwable th) {
                this.lock.unlock();
                throw th;
            }
        }
        this.refreshToken = str;
        this.lock.unlock();
        return this;
    }
}
