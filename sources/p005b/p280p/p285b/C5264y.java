package p005b.p280p.p285b;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Objects;

/* renamed from: b.p.b.y */
public final class C5264y {

    /* renamed from: a */
    public final C5121a f10517a;

    /* renamed from: b */
    public final Proxy f10518b;

    /* renamed from: c */
    public final InetSocketAddress f10519c;

    public C5264y(C5121a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        Objects.requireNonNull(aVar, "address == null");
        Objects.requireNonNull(proxy, "proxy == null");
        Objects.requireNonNull(inetSocketAddress, "inetSocketAddress == null");
        this.f10517a = aVar;
        this.f10518b = proxy;
        this.f10519c = inetSocketAddress;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5264y)) {
            return false;
        }
        C5264y yVar = (C5264y) obj;
        return this.f10517a.equals(yVar.f10517a) && this.f10518b.equals(yVar.f10518b) && this.f10519c.equals(yVar.f10519c);
    }

    public int hashCode() {
        int hashCode = this.f10518b.hashCode();
        return this.f10519c.hashCode() + ((hashCode + ((this.f10517a.hashCode() + 527) * 31)) * 31);
    }
}
