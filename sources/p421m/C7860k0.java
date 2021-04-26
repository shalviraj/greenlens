package p421m;

import java.net.InetSocketAddress;
import java.net.Proxy;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: m.k0 */
public final class C7860k0 {

    /* renamed from: a */
    public final C7825a f15604a;

    /* renamed from: b */
    public final Proxy f15605b;

    /* renamed from: c */
    public final InetSocketAddress f15606c;

    public C7860k0(C7825a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        C6888i.m12438e(aVar, "address");
        C6888i.m12438e(proxy, "proxy");
        C6888i.m12438e(inetSocketAddress, "socketAddress");
        this.f15604a = aVar;
        this.f15605b = proxy;
        this.f15606c = inetSocketAddress;
    }

    /* renamed from: a */
    public final boolean mo25577a() {
        return this.f15604a.f15440f != null && this.f15605b.type() == Proxy.Type.HTTP;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7860k0) {
            C7860k0 k0Var = (C7860k0) obj;
            return C6888i.m12434a(k0Var.f15604a, this.f15604a) && C6888i.m12434a(k0Var.f15605b, this.f15605b) && C6888i.m12434a(k0Var.f15606c, this.f15606c);
        }
    }

    public int hashCode() {
        int hashCode = this.f15605b.hashCode();
        return this.f15606c.hashCode() + ((hashCode + ((this.f15604a.hashCode() + 527) * 31)) * 31);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Route{");
        u.append(this.f15606c);
        u.append('}');
        return u.toString();
    }
}
