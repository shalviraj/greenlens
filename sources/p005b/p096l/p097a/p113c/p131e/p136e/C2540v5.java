package p005b.p096l.p097a.p113c.p131e.p136e;

/* renamed from: b.l.a.c.e.e.v5 */
public final class C2540v5 extends C2071c<C2540v5, C2516u5> implements C2097d0 {
    /* access modifiers changed from: private */
    public static final C2540v5 zzf;
    private int zzb;
    private C2588x5 zze;

    static {
        C2540v5 v5Var = new C2540v5();
        zzf = v5Var;
        C2071c.m3083r(C2540v5.class, v5Var);
    }

    /* renamed from: u */
    public static C2540v5 m4292u(C2317lm lmVar, C2605xm xmVar) {
        return (C2540v5) C2071c.m3079e(zzf, lmVar, xmVar);
    }

    /* renamed from: h */
    public final Object mo12376h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C2295l0(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzb", "zze"});
        } else if (i2 == 3) {
            return new C2540v5();
        } else {
            if (i2 == 4) {
                return new C2516u5();
            }
            if (i2 != 5) {
                return null;
            }
            return zzf;
        }
    }

    /* renamed from: s */
    public final int mo13050s() {
        return this.zzb;
    }

    /* renamed from: t */
    public final C2588x5 mo13051t() {
        C2588x5 x5Var = this.zze;
        return x5Var == null ? C2588x5.m4371t() : x5Var;
    }
}
