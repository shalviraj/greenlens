package p005b.p096l.p097a.p113c.p131e.p140i;

/* renamed from: b.l.a.c.e.i.n0 */
public final class C2881n0 extends C2899o5<C2881n0, C2868m0> implements C2926q6 {
    /* access modifiers changed from: private */
    public static final C2881n0 zzi;
    private int zza;
    private C3024y0 zze;
    private C2946s0 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        C2881n0 n0Var = new C2881n0();
        zzi = n0Var;
        C2899o5.m5029q(C2881n0.class, n0Var);
    }

    /* renamed from: A */
    public static C2881n0 m4969A() {
        return zzi;
    }

    /* renamed from: C */
    public static /* synthetic */ void m4971C(C2881n0 n0Var, String str) {
        n0Var.zza |= 8;
        n0Var.zzh = str;
    }

    /* renamed from: r */
    public final Object mo13245r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C3030y6(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zza", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C2881n0();
        } else {
            if (i2 == 4) {
                return new C2868m0((C2803h0) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzi;
        }
    }

    /* renamed from: s */
    public final boolean mo13503s() {
        return (this.zza & 1) != 0;
    }

    /* renamed from: t */
    public final C3024y0 mo13504t() {
        C3024y0 y0Var = this.zze;
        return y0Var == null ? C3024y0.m5696A() : y0Var;
    }

    /* renamed from: u */
    public final boolean mo13505u() {
        return (this.zza & 2) != 0;
    }

    /* renamed from: v */
    public final C2946s0 mo13506v() {
        C2946s0 s0Var = this.zzf;
        return s0Var == null ? C2946s0.m5190C() : s0Var;
    }

    /* renamed from: w */
    public final boolean mo13507w() {
        return (this.zza & 4) != 0;
    }

    /* renamed from: x */
    public final boolean mo13508x() {
        return this.zzg;
    }

    /* renamed from: y */
    public final boolean mo13509y() {
        return (this.zza & 8) != 0;
    }

    /* renamed from: z */
    public final String mo13510z() {
        return this.zzh;
    }
}
