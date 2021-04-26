package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.List;

/* renamed from: b.l.a.c.e.i.d1 */
public final class C2750d1 extends C2899o5<C2750d1, C2736c1> implements C2926q6 {
    /* access modifiers changed from: private */
    public static final C2750d1 zzn;
    private int zza;
    private long zze;
    private String zzf = "";
    private int zzg;
    private C2977u5<C2778f1> zzh;
    private C2977u5<C2722b1> zzi;
    private C2977u5<C2829j0> zzj;
    private String zzk;
    private boolean zzl;
    private C2977u5<C2896o2> zzm;

    static {
        C2750d1 d1Var = new C2750d1();
        zzn = d1Var;
        C2899o5.m5029q(C2750d1.class, d1Var);
    }

    public C2750d1() {
        C3017x6<Object> x6Var = C3017x6.f5138j;
        this.zzh = x6Var;
        this.zzi = x6Var;
        this.zzj = x6Var;
        this.zzk = "";
        this.zzm = x6Var;
    }

    /* renamed from: B */
    public static C2736c1 m4670B() {
        return (C2736c1) zzn.mo13545m();
    }

    /* renamed from: C */
    public static C2750d1 m4671C() {
        return zzn;
    }

    /* renamed from: E */
    public static /* synthetic */ void m4673E(C2750d1 d1Var, int i, C2722b1 b1Var) {
        C2977u5<C2722b1> u5Var = d1Var.zzi;
        if (!u5Var.mo13385a()) {
            d1Var.zzi = C2899o5.m5027l(u5Var);
        }
        d1Var.zzi.set(i, b1Var);
    }

    /* renamed from: F */
    public static void m4674F(C2750d1 d1Var) {
        d1Var.zzj = C3017x6.f5138j;
    }

    /* renamed from: A */
    public final boolean mo13271A() {
        return this.zzl;
    }

    /* renamed from: r */
    public final Object mo13245r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C3030y6(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", C2778f1.class, "zzi", C2722b1.class, "zzj", C2829j0.class, "zzk", "zzl", "zzm", C2896o2.class});
        } else if (i2 == 3) {
            return new C2750d1();
        } else {
            if (i2 == 4) {
                return new C2736c1((C3037z0) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzn;
        }
    }

    /* renamed from: s */
    public final boolean mo13272s() {
        return (this.zza & 1) != 0;
    }

    /* renamed from: t */
    public final long mo13273t() {
        return this.zze;
    }

    /* renamed from: u */
    public final boolean mo13274u() {
        return (this.zza & 2) != 0;
    }

    /* renamed from: v */
    public final String mo13275v() {
        return this.zzf;
    }

    /* renamed from: w */
    public final List<C2778f1> mo13276w() {
        return this.zzh;
    }

    /* renamed from: x */
    public final int mo13277x() {
        return this.zzi.size();
    }

    /* renamed from: y */
    public final C2722b1 mo13278y(int i) {
        return this.zzi.get(i);
    }

    /* renamed from: z */
    public final List<C2829j0> mo13279z() {
        return this.zzj;
    }
}
