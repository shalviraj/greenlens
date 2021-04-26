package p005b.p096l.p097a.p113c.p131e.p140i;

/* renamed from: b.l.a.c.e.i.n1 */
public final class C2882n1 extends C2899o5<C2882n1, C2856l1> implements C2926q6 {
    /* access modifiers changed from: private */
    public static final C2882n1 zzg;
    private int zza;
    private int zze;
    private long zzf;

    static {
        C2882n1 n1Var = new C2882n1();
        zzg = n1Var;
        C2899o5.m5029q(C2882n1.class, n1Var);
    }

    /* renamed from: w */
    public static C2856l1 m4981w() {
        return (C2856l1) zzg.mo13545m();
    }

    /* renamed from: y */
    public static /* synthetic */ void m4983y(C2882n1 n1Var, int i) {
        n1Var.zza |= 1;
        n1Var.zze = i;
    }

    /* renamed from: z */
    public static /* synthetic */ void m4984z(C2882n1 n1Var, long j) {
        n1Var.zza |= 2;
        n1Var.zzf = j;
    }

    /* renamed from: r */
    public final Object mo13245r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C3030y6(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zza", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C2882n1();
        } else {
            if (i2 == 4) {
                return new C2856l1((C2791g1) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }

    /* renamed from: s */
    public final boolean mo13511s() {
        return (this.zza & 1) != 0;
    }

    /* renamed from: t */
    public final int mo13512t() {
        return this.zze;
    }

    /* renamed from: u */
    public final boolean mo13513u() {
        return (this.zza & 2) != 0;
    }

    /* renamed from: v */
    public final long mo13514v() {
        return this.zzf;
    }
}
