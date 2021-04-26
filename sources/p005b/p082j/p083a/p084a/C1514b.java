package p005b.p082j.p083a.p084a;

import java.io.Reader;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import p005b.p082j.p083a.p084a.C1517d;
import p005b.p082j.p083a.p084a.C1521g;
import p005b.p082j.p083a.p084a.p087q.C1537b;
import p005b.p082j.p083a.p084a.p088r.C1551f;
import p005b.p082j.p083a.p084a.p089s.C1554a;
import p005b.p082j.p083a.p084a.p089s.C1556b;
import p005b.p082j.p083a.p084a.p090t.C1559a;
import p005b.p082j.p083a.p084a.p090t.C1560b;
import p005b.p082j.p083a.p084a.p090t.C1563e;
import p005b.p082j.p083a.p084a.p090t.C1569i;

/* renamed from: b.j.a.a.b */
public class C1514b extends C1529n implements Serializable {

    /* renamed from: o */
    public static final int f2327o;

    /* renamed from: p */
    public static final int f2328p;

    /* renamed from: q */
    public static final int f2329q = C1517d.C1518a.m1784d();

    /* renamed from: r */
    public static final C1528m f2330r = C1563e.f2619m;

    /* renamed from: g */
    public final transient C1556b f2331g;

    /* renamed from: h */
    public final transient C1554a f2332h;

    /* renamed from: i */
    public int f2333i = f2327o;

    /* renamed from: j */
    public int f2334j = f2328p;

    /* renamed from: k */
    public int f2335k = f2329q;

    /* renamed from: l */
    public C1526k f2336l;

    /* renamed from: m */
    public C1528m f2337m = f2330r;

    /* renamed from: n */
    public final char f2338n;

    /* renamed from: b.j.a.a.b$a */
    public enum C1515a {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);
        

        /* renamed from: g */
        public final boolean f2344g;

        /* access modifiers changed from: public */
        C1515a(boolean z) {
            this.f2344g = z;
        }

        /* renamed from: d */
        public boolean mo11459d(int i) {
            return (i & (1 << ordinal())) != 0;
        }
    }

    static {
        C1515a[] values = C1515a.values();
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            C1515a aVar = values[i2];
            if (aVar.f2344g) {
                i |= 1 << aVar.ordinal();
            }
        }
        f2327o = i;
        C1521g.C1522a[] values2 = C1521g.C1522a.values();
        int i3 = 0;
        for (int i4 = 0; i4 < 14; i4++) {
            C1521g.C1522a aVar2 = values2[i4];
            if (aVar2.f2381g) {
                i3 |= aVar2.f2382h;
            }
        }
        f2328p = i3;
    }

    public C1514b(C1526k kVar) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f2331g = new C1556b((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
        long currentTimeMillis2 = System.currentTimeMillis();
        this.f2332h = new C1554a(64, true, (((int) currentTimeMillis2) + ((int) (currentTimeMillis2 >>> 32))) | 1, true);
        this.f2336l = kVar;
        this.f2338n = '\"';
    }

    /* renamed from: a */
    public C1537b mo11457a(Object obj, boolean z) {
        C1559a aVar;
        SoftReference softReference;
        if (C1515a.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.mo11459d(this.f2333i)) {
            SoftReference softReference2 = C1560b.f2608b.get();
            aVar = softReference2 == null ? null : (C1559a) softReference2.get();
            if (aVar == null) {
                aVar = new C1559a();
                C1569i iVar = C1560b.f2607a;
                if (iVar != null) {
                    softReference = new SoftReference(aVar, iVar.f2641b);
                    iVar.f2640a.put(softReference, Boolean.TRUE);
                    while (true) {
                        SoftReference softReference3 = (SoftReference) iVar.f2641b.poll();
                        if (softReference3 == null) {
                            break;
                        }
                        iVar.f2640a.remove(softReference3);
                    }
                } else {
                    softReference = new SoftReference(aVar);
                }
                C1560b.f2608b.set(softReference);
            }
        } else {
            aVar = new C1559a();
        }
        return new C1537b(aVar, obj, z);
    }

    /* renamed from: b */
    public C1521g mo11458b(Reader reader) {
        return new C1551f(mo11457a(reader, false), this.f2334j, reader, this.f2336l, this.f2331g.mo11682d(this.f2333i));
    }
}
