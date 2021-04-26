package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.List;

/* renamed from: b.l.a.c.e.i.l0 */
public final class C2855l0 extends C2899o5<C2855l0, C2842k0> implements C2926q6 {
    /* access modifiers changed from: private */
    public static final C2855l0 zzm;
    private int zza;
    private int zze;
    private String zzf = "";
    private C2977u5<C2881n0> zzg = C3017x6.f5138j;
    private boolean zzh;
    private C2946s0 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        C2855l0 l0Var = new C2855l0();
        zzm = l0Var;
        C2899o5.m5029q(C2855l0.class, l0Var);
    }

    /* renamed from: E */
    public static C2842k0 m4910E() {
        return (C2842k0) zzm.mo13545m();
    }

    /* renamed from: G */
    public static /* synthetic */ void m4912G(C2855l0 l0Var, String str) {
        l0Var.zza |= 2;
        l0Var.zzf = str;
    }

    /* renamed from: H */
    public static /* synthetic */ void m4913H(C2855l0 l0Var, int i, C2881n0 n0Var) {
        n0Var.getClass();
        C2977u5<C2881n0> u5Var = l0Var.zzg;
        if (!u5Var.mo13385a()) {
            l0Var.zzg = C2899o5.m5027l(u5Var);
        }
        l0Var.zzg.set(i, n0Var);
    }

    /* renamed from: A */
    public final boolean mo13460A() {
        return this.zzj;
    }

    /* renamed from: B */
    public final boolean mo13461B() {
        return this.zzk;
    }

    /* renamed from: C */
    public final boolean mo13462C() {
        return (this.zza & 64) != 0;
    }

    /* renamed from: D */
    public final boolean mo13463D() {
        return this.zzl;
    }

    /* renamed from: r */
    public final Object mo13245r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C3030y6(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zza", "zze", "zzf", "zzg", C2881n0.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new C2855l0();
        } else {
            if (i2 == 4) {
                return new C2842k0((C2803h0) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzm;
        }
    }

    /* renamed from: s */
    public final boolean mo13464s() {
        return (this.zza & 1) != 0;
    }

    /* renamed from: t */
    public final int mo13465t() {
        return this.zze;
    }

    /* renamed from: u */
    public final String mo13466u() {
        return this.zzf;
    }

    /* renamed from: v */
    public final List<C2881n0> mo13467v() {
        return this.zzg;
    }

    /* renamed from: w */
    public final int mo13468w() {
        return this.zzg.size();
    }

    /* renamed from: x */
    public final C2881n0 mo13469x(int i) {
        return this.zzg.get(i);
    }

    /* renamed from: y */
    public final boolean mo13470y() {
        return (this.zza & 8) != 0;
    }

    /* renamed from: z */
    public final C2946s0 mo13471z() {
        C2946s0 s0Var = this.zzi;
        return s0Var == null ? C2946s0.m5190C() : s0Var;
    }
}
