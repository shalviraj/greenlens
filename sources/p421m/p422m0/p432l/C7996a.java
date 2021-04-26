package p421m.p422m0.p432l;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import p005b.p291q.p292a.C5266a;

/* renamed from: m.m0.l.a */
public final class C7996a extends ProxySelector {

    /* renamed from: a */
    public static final C7996a f16040a = new C7996a();

    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    public List<Proxy> select(URI uri) {
        if (uri != null) {
            return C5266a.m9910Y2(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}
