package p298d.p299a.p300a.p301a.p303y0.p389g;

import java.util.Iterator;
import java.util.Map;

/* renamed from: d.a.a.a.y0.g.k */
public class C7107k extends C7111l {

    /* renamed from: d.a.a.a.y0.g.k$b */
    public static class C7109b<K> implements Map.Entry<K, Object> {

        /* renamed from: g */
        public Map.Entry<K, C7107k> f14210g;

        public C7109b(Map.Entry entry, C7108a aVar) {
            this.f14210g = entry;
        }

        public K getKey() {
            return this.f14210g.getKey();
        }

        public Object getValue() {
            C7107k value = this.f14210g.getValue();
            if (value == null) {
                return null;
            }
            return value.mo24693a();
        }

        public Object setValue(Object obj) {
            if (obj instanceof C7117p) {
                C7107k value = this.f14210g.getValue();
                C7117p pVar = value.f14213b;
                value.f14213b = (C7117p) obj;
                value.f14212a = true;
                return pVar;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* renamed from: d.a.a.a.y0.g.k$c */
    public static class C7110c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: g */
        public Iterator<Map.Entry<K, Object>> f14211g;

        public C7110c(Iterator<Map.Entry<K, Object>> it) {
            this.f14211g = it;
        }

        public boolean hasNext() {
            return this.f14211g.hasNext();
        }

        public Object next() {
            Map.Entry next = this.f14211g.next();
            return next.getValue() instanceof C7107k ? new C7109b(next, (C7108a) null) : next;
        }

        public void remove() {
            this.f14211g.remove();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:3|4|(3:6|7|8)|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x000e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p298d.p299a.p300a.p301a.p303y0.p389g.C7117p mo24693a() {
        /*
            r1 = this;
            d.a.a.a.y0.g.p r0 = r1.f14213b
            if (r0 == 0) goto L_0x0005
            goto L_0x000f
        L_0x0005:
            monitor-enter(r1)
            d.a.a.a.y0.g.p r0 = r1.f14213b     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x000b
            goto L_0x000e
        L_0x000b:
            r0 = 0
            r1.f14213b = r0     // Catch:{ IOException -> 0x000e }
        L_0x000e:
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
        L_0x000f:
            d.a.a.a.y0.g.p r0 = r1.f14213b
            return r0
        L_0x0012:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p389g.C7107k.mo24693a():d.a.a.a.y0.g.p");
    }

    public boolean equals(Object obj) {
        return mo24693a().equals(obj);
    }

    public int hashCode() {
        return mo24693a().hashCode();
    }

    public String toString() {
        return mo24693a().toString();
    }
}
