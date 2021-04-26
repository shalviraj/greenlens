package p005b.p096l.p164b.p165a.p166a.p168b;

import com.google.api.client.auth.oauth2.AuthorizationRequestUrl;
import com.segment.analytics.AnalyticsContext;
import java.util.Collection;
import java.util.Collections;

/* renamed from: b.l.b.a.a.b.d */
public class C3661d extends AuthorizationRequestUrl {
    public C3661d(String str, String str2) {
        super(str, str2, Collections.singleton(AnalyticsContext.Device.DEVICE_TOKEN_KEY));
    }

    /* renamed from: i */
    public C3661d clone() {
        return (C3661d) super.clone();
    }

    /* renamed from: j */
    public C3661d set(String str, Object obj) {
        return (C3661d) super.set(str, obj);
    }

    /* renamed from: k */
    public C3661d mo14948c(String str) {
        super.mo14948c(str);
        return this;
    }

    /* renamed from: l */
    public C3661d mo14950g(Collection<String> collection) {
        super.mo14950g(collection);
        return this;
    }
}
