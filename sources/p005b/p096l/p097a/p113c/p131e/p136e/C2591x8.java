package p005b.p096l.p097a.p113c.p131e.p136e;

/* renamed from: b.l.a.c.e.e.x8 */
public final class C2591x8 extends C2071c<C2591x8, C2567w8> implements C2097d0 {
    /* access modifiers changed from: private */
    public static final C2591x8 zzf;
    /* access modifiers changed from: private */
    public int zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        C2591x8 x8Var = new C2591x8();
        zzf = x8Var;
        C2071c.m3083r(C2591x8.class, x8Var);
    }

    /* renamed from: u */
    public static C2567w8 m4381u() {
        return (C2567w8) zzf.mo12447i();
    }

    /* renamed from: v */
    public static C2591x8 m4382v() {
        return zzf;
    }

    /* renamed from: h */
    public final Object mo12376h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C2295l0(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzb", "zze"});
        } else if (i2 == 3) {
            return new C2591x8();
        } else {
            if (i2 == 4) {
                return new C2567w8((C2543v8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzf;
        }
    }

    /* renamed from: s */
    public final C2375o8 mo13106s() {
        C2375o8 d = C2375o8.m3921d(this.zzb);
        return d == null ? C2375o8.UNRECOGNIZED : d;
    }

    /* renamed from: t */
    public final int mo13107t() {
        return this.zze;
    }
}
