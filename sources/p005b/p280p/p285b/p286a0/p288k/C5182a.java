package p005b.p280p.p285b.p286a0.p288k;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import p005b.p280p.p285b.C5219b;
import p005b.p280p.p285b.C5245o;

/* renamed from: b.p.b.a0.k.a */
public final class C5182a implements C5219b {

    /* renamed from: a */
    public static final C5219b f10133a = new C5182a();

    /* renamed from: a */
    public final InetAddress mo17070a(Proxy proxy, C5245o oVar) {
        if (proxy == null || proxy.type() == Proxy.Type.DIRECT) {
            return InetAddress.getByName(oVar.f10423d);
        }
        return ((InetSocketAddress) proxy.address()).getAddress();
    }
}
