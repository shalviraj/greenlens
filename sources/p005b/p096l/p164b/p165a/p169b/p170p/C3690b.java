package p005b.p096l.p164b.p165a.p169b.p170p;

import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

/* renamed from: b.l.b.a.b.p.b */
public class C3690b implements C3689a {

    /* renamed from: a */
    public final Proxy f6813a;

    public C3690b() {
        this.f6813a = null;
    }

    public C3690b(Proxy proxy) {
        this.f6813a = proxy;
    }

    /* renamed from: a */
    public HttpURLConnection mo15015a(URL url) {
        Proxy proxy = this.f6813a;
        return (HttpURLConnection) (proxy == null ? url.openConnection() : url.openConnection(proxy));
    }
}
