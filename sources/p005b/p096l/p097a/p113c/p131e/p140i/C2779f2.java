package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.List;

/* renamed from: b.l.a.c.e.i.f2 */
public final class C2779f2 extends C2899o5<C2779f2, C2765e2> implements C2926q6 {
    /* access modifiers changed from: private */
    public static final C2779f2 zzg;
    private int zza;
    private int zze;
    private C2964t5 zzf = C2783f6.f4722j;

    static {
        C2779f2 f2Var = new C2779f2();
        zzg = f2Var;
        C2899o5.m5029q(C2779f2.class, f2Var);
    }

    /* renamed from: A */
    public static void m4737A(C2779f2 f2Var, Iterable iterable) {
        C2964t5 t5Var = f2Var.zzf;
        if (!((C2820i4) t5Var).f4835g) {
            f2Var.zzf = C2899o5.m5026k(t5Var);
        }
        C2807h4.m4807i(iterable, f2Var.zzf);
    }

    /* renamed from: x */
    public static C2765e2 m4738x() {
        return (C2765e2) zzg.mo13545m();
    }

    /* renamed from: z */
    public static /* synthetic */ void m4740z(C2779f2 f2Var, int i) {
        f2Var.zza |= 1;
        f2Var.zze = i;
    }

    /* renamed from: r */
    public final Object mo13245r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C3030y6(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zza", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C2779f2();
        } else {
            if (i2 == 4) {
                return new C2765e2((C2791g1) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }

    /* renamed from: s */
    public final boolean mo13312s() {
        return (this.zza & 1) != 0;
    }

    /* renamed from: t */
    public final int mo13313t() {
        return this.zze;
    }

    /* renamed from: u */
    public final List<Long> mo13314u() {
        return this.zzf;
    }

    /* renamed from: v */
    public final int mo13315v() {
        return ((C2783f6) this.zzf).size();
    }

    /* renamed from: w */
    public final long mo13316w(int i) {
        C2783f6 f6Var = (C2783f6) this.zzf;
        f6Var.mo13330q(i);
        return f6Var.f4723h[i];
    }
}
