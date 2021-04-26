package p005b.p051h.p052a.p055m.p064x.p065c;

import p005b.p051h.p052a.p055m.C0976o;

/* renamed from: b.h.a.m.x.c.l */
public abstract class C1239l {

    /* renamed from: a */
    public static final C1239l f1517a = new C1242c();

    /* renamed from: b */
    public static final C1239l f1518b = new C1240a();

    /* renamed from: c */
    public static final C1239l f1519c;

    /* renamed from: d */
    public static final C1239l f1520d = new C1243d();

    /* renamed from: e */
    public static final C1239l f1521e;

    /* renamed from: f */
    public static final C0976o<C1239l> f1522f;

    /* renamed from: g */
    public static final boolean f1523g = true;

    /* renamed from: b.h.a.m.x.c.l$a */
    public static class C1240a extends C1239l {
        /* renamed from: a */
        public C1244e mo11082a(int i, int i2, int i3, int i4) {
            C1244e eVar = C1244e.QUALITY;
            return (mo11083b(i, i2, i3, i4) != 1.0f && !C1239l.f1523g) ? C1244e.MEMORY : eVar;
        }

        /* renamed from: b */
        public float mo11083b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, C1239l.f1517a.mo11083b(i, i2, i3, i4));
        }
    }

    /* renamed from: b.h.a.m.x.c.l$b */
    public static class C1241b extends C1239l {
        /* renamed from: a */
        public C1244e mo11082a(int i, int i2, int i3, int i4) {
            return C1244e.QUALITY;
        }

        /* renamed from: b */
        public float mo11083b(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
    }

    /* renamed from: b.h.a.m.x.c.l$c */
    public static class C1242c extends C1239l {
        /* renamed from: a */
        public C1244e mo11082a(int i, int i2, int i3, int i4) {
            return C1239l.f1523g ? C1244e.QUALITY : C1244e.MEMORY;
        }

        /* renamed from: b */
        public float mo11083b(int i, int i2, int i3, int i4) {
            if (C1239l.f1523g) {
                return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
            }
            int max = Math.max(i2 / i4, i / i3);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    /* renamed from: b.h.a.m.x.c.l$d */
    public static class C1243d extends C1239l {
        /* renamed from: a */
        public C1244e mo11082a(int i, int i2, int i3, int i4) {
            return C1244e.QUALITY;
        }

        /* renamed from: b */
        public float mo11083b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* renamed from: b.h.a.m.x.c.l$e */
    public enum C1244e {
        MEMORY,
        QUALITY
    }

    static {
        C1241b bVar = new C1241b();
        f1519c = bVar;
        f1521e = bVar;
        f1522f = C0976o.m746a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", bVar);
    }

    /* renamed from: a */
    public abstract C1244e mo11082a(int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract float mo11083b(int i, int i2, int i3, int i4);
}
