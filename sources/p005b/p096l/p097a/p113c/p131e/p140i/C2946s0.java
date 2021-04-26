package p005b.p096l.p097a.p113c.p131e.p140i;

/* renamed from: b.l.a.c.e.i.s0 */
public final class C2946s0 extends C2899o5<C2946s0, C2907p0> implements C2926q6 {
    /* access modifiers changed from: private */
    public static final C2946s0 zzj;
    private int zza;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        C2946s0 s0Var = new C2946s0();
        zzj = s0Var;
        C2899o5.m5029q(C2946s0.class, s0Var);
    }

    /* renamed from: C */
    public static C2946s0 m5190C() {
        return zzj;
    }

    /* renamed from: A */
    public final boolean mo13680A() {
        return (this.zza & 16) != 0;
    }

    /* renamed from: B */
    public final String mo13681B() {
        return this.zzi;
    }

    /* renamed from: r */
    public final Object mo13245r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C3030y6(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zza", "zze", C2920q0.f4946a, "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C2946s0();
        } else {
            if (i2 == 4) {
                return new C2907p0();
            }
            if (i2 != 5) {
                return null;
            }
            return zzj;
        }
    }

    /* renamed from: s */
    public final boolean mo13682s() {
        return (this.zza & 1) != 0;
    }

    /* renamed from: t */
    public final C2933r0 mo13683t() {
        C2933r0 d = C2933r0.m5123d(this.zze);
        return d == null ? C2933r0.UNKNOWN_COMPARISON_TYPE : d;
    }

    /* renamed from: u */
    public final boolean mo13684u() {
        return (this.zza & 2) != 0;
    }

    /* renamed from: v */
    public final boolean mo13685v() {
        return this.zzf;
    }

    /* renamed from: w */
    public final boolean mo13686w() {
        return (this.zza & 4) != 0;
    }

    /* renamed from: x */
    public final String mo13687x() {
        return this.zzg;
    }

    /* renamed from: y */
    public final boolean mo13688y() {
        return (this.zza & 8) != 0;
    }

    /* renamed from: z */
    public final String mo13689z() {
        return this.zzh;
    }
}
