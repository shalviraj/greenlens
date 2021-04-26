package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.List;

/* renamed from: b.l.a.c.e.i.v1 */
public final class C2986v1 extends C2899o5<C2986v1, C2973u1> implements C2926q6 {
    /* access modifiers changed from: private */
    public static final C2986v1 zze;
    private C2977u5<C3012x1> zza = C3017x6.f5138j;

    static {
        C2986v1 v1Var = new C2986v1();
        zze = v1Var;
        C2899o5.m5029q(C2986v1.class, v1Var);
    }

    /* renamed from: u */
    public static C2973u1 m5395u() {
        return (C2973u1) zze.mo13545m();
    }

    /* renamed from: w */
    public static /* synthetic */ void m5397w(C2986v1 v1Var, C3012x1 x1Var) {
        C2977u5<C3012x1> u5Var = v1Var.zza;
        if (!u5Var.mo13385a()) {
            v1Var.zza = C2899o5.m5027l(u5Var);
        }
        v1Var.zza.add(x1Var);
    }

    /* renamed from: r */
    public final Object mo13245r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C3030y6(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", C3012x1.class});
        } else if (i2 == 3) {
            return new C2986v1();
        } else {
            if (i2 == 4) {
                return new C2973u1((C2791g1) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }

    /* renamed from: s */
    public final List<C3012x1> mo13790s() {
        return this.zza;
    }

    /* renamed from: t */
    public final C3012x1 mo13791t() {
        return this.zza.get(0);
    }
}
