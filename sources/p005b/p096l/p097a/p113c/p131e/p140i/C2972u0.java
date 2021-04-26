package p005b.p096l.p097a.p113c.p131e.p140i;

/* renamed from: b.l.a.c.e.i.u0 */
public final class C2972u0 extends C2899o5<C2972u0, C2959t0> implements C2926q6 {
    /* access modifiers changed from: private */
    public static final C2972u0 zzk;
    private int zza;
    private int zze;
    private String zzf = "";
    private C2881n0 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        C2972u0 u0Var = new C2972u0();
        zzk = u0Var;
        C2899o5.m5029q(C2972u0.class, u0Var);
    }

    /* renamed from: A */
    public static C2959t0 m5340A() {
        return (C2959t0) zzk.mo13545m();
    }

    /* renamed from: C */
    public static /* synthetic */ void m5342C(C2972u0 u0Var, String str) {
        u0Var.zza |= 2;
        u0Var.zzf = str;
    }

    /* renamed from: r */
    public final Object mo13245r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C3030y6(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C2972u0();
        } else {
            if (i2 == 4) {
                return new C2959t0((C2803h0) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzk;
        }
    }

    /* renamed from: s */
    public final boolean mo13760s() {
        return (this.zza & 1) != 0;
    }

    /* renamed from: t */
    public final int mo13761t() {
        return this.zze;
    }

    /* renamed from: u */
    public final String mo13762u() {
        return this.zzf;
    }

    /* renamed from: v */
    public final C2881n0 mo13763v() {
        C2881n0 n0Var = this.zzg;
        return n0Var == null ? C2881n0.m4969A() : n0Var;
    }

    /* renamed from: w */
    public final boolean mo13764w() {
        return this.zzh;
    }

    /* renamed from: x */
    public final boolean mo13765x() {
        return this.zzi;
    }

    /* renamed from: y */
    public final boolean mo13766y() {
        return (this.zza & 32) != 0;
    }

    /* renamed from: z */
    public final boolean mo13767z() {
        return this.zzj;
    }
}
