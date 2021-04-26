package p005b.p096l.p097a.p113c.p131e.p136e;

/* renamed from: b.l.a.c.e.e.u7 */
public final class C2518u7 extends C2071c<C2518u7, C2494t7> implements C2097d0 {
    /* access modifiers changed from: private */
    public static final C2518u7 zze;
    private C2181g9 zzb;

    static {
        C2518u7 u7Var = new C2518u7();
        zze = u7Var;
        C2071c.m3083r(C2518u7.class, u7Var);
    }

    /* renamed from: t */
    public static C2494t7 m4238t() {
        return (C2494t7) zze.mo12447i();
    }

    /* renamed from: u */
    public static C2518u7 m4239u() {
        return zze;
    }

    /* renamed from: w */
    public static /* synthetic */ void m4241w(C2518u7 u7Var, C2181g9 g9Var) {
        g9Var.getClass();
        u7Var.zzb = g9Var;
    }

    /* renamed from: h */
    public final Object mo12376h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C2295l0(zze, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzb"});
        } else if (i2 == 3) {
            return new C2518u7();
        } else {
            if (i2 == 4) {
                return new C2494t7((C2470s7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }

    /* renamed from: s */
    public final C2181g9 mo13025s() {
        C2181g9 g9Var = this.zzb;
        return g9Var == null ? C2181g9.m3430w() : g9Var;
    }
}
