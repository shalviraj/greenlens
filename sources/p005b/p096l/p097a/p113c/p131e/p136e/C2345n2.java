package p005b.p096l.p097a.p113c.p131e.p136e;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: b.l.a.c.e.e.n2 */
public final class C2345n2<P> {

    /* renamed from: a */
    public final ConcurrentMap<C2321m2, List<C2297l2<P>>> f4088a = new ConcurrentHashMap();

    /* renamed from: b */
    public final Class<P> f4089b;

    public C2345n2(Class<P> cls) {
        this.f4089b = cls;
    }

    /* renamed from: a */
    public final List<C2297l2<P>> mo12823a(byte[] bArr) {
        List<C2297l2<P>> list = (List) this.f4088a.get(new C2321m2(bArr));
        return list != null ? list : Collections.emptyList();
    }
}
