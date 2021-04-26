package p005b.p096l.p097a.p113c.p131e.p140i;

/* renamed from: b.l.a.c.e.i.k1 */
public final class C2843k1 extends C2899o5<C2843k1, C2830j1> implements C2926q6 {
    /* access modifiers changed from: private */
    public static final C2843k1 zzi;
    private int zza;
    private int zze;
    private C2751d2 zzf;
    private C2751d2 zzg;
    private boolean zzh;

    static {
        C2843k1 k1Var = new C2843k1();
        zzi = k1Var;
        C2899o5.m5029q(C2843k1.class, k1Var);
    }

    /* renamed from: B */
    public static /* synthetic */ void m4881B(C2843k1 k1Var, int i) {
        k1Var.zza |= 1;
        k1Var.zze = i;
    }

    /* renamed from: C */
    public static /* synthetic */ void m4882C(C2843k1 k1Var, C2751d2 d2Var) {
        k1Var.zzf = d2Var;
        k1Var.zza |= 2;
    }

    /* renamed from: D */
    public static /* synthetic */ void m4883D(C2843k1 k1Var, C2751d2 d2Var) {
        k1Var.zzg = d2Var;
        k1Var.zza |= 4;
    }

    /* renamed from: E */
    public static /* synthetic */ void m4884E(C2843k1 k1Var, boolean z) {
        k1Var.zza |= 8;
        k1Var.zzh = z;
    }

    /* renamed from: z */
    public static C2830j1 m4885z() {
        return (C2830j1) zzi.mo13545m();
    }

    /* renamed from: r */
    public final Object mo13245r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C3030y6(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zza", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C2843k1();
        } else {
            if (i2 == 4) {
                return new C2830j1((C2791g1) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzi;
        }
    }

    /* renamed from: s */
    public final boolean mo13440s() {
        return (this.zza & 1) != 0;
    }

    /* renamed from: t */
    public final int mo13441t() {
        return this.zze;
    }

    /* renamed from: u */
    public final C2751d2 mo13442u() {
        C2751d2 d2Var = this.zzf;
        return d2Var == null ? C2751d2.m4686D() : d2Var;
    }

    /* renamed from: v */
    public final boolean mo13443v() {
        return (this.zza & 4) != 0;
    }

    /* renamed from: w */
    public final C2751d2 mo13444w() {
        C2751d2 d2Var = this.zzg;
        return d2Var == null ? C2751d2.m4686D() : d2Var;
    }

    /* renamed from: x */
    public final boolean mo13445x() {
        return (this.zza & 8) != 0;
    }

    /* renamed from: y */
    public final boolean mo13446y() {
        return this.zzh;
    }
}
