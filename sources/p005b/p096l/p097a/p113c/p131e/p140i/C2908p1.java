package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.List;

/* renamed from: b.l.a.c.e.i.p1 */
public final class C2908p1 extends C2899o5<C2908p1, C2895o1> implements C2926q6 {
    /* access modifiers changed from: private */
    public static final C2908p1 zzj;
    private int zza;
    private C2977u5<C2960t1> zze = C3017x6.f5138j;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        C2908p1 p1Var = new C2908p1();
        zzj = p1Var;
        C2899o5.m5029q(C2908p1.class, p1Var);
    }

    /* renamed from: C */
    public static C2895o1 m5058C() {
        return (C2895o1) zzj.mo13545m();
    }

    /* renamed from: E */
    public static /* synthetic */ void m5060E(C2908p1 p1Var, int i, C2960t1 t1Var) {
        t1Var.getClass();
        p1Var.mo13553M();
        p1Var.zze.set(i, t1Var);
    }

    /* renamed from: F */
    public static /* synthetic */ void m5061F(C2908p1 p1Var, C2960t1 t1Var) {
        t1Var.getClass();
        p1Var.mo13553M();
        p1Var.zze.add(t1Var);
    }

    /* renamed from: G */
    public static /* synthetic */ void m5062G(C2908p1 p1Var, Iterable iterable) {
        p1Var.mo13553M();
        C2807h4.m4807i(iterable, p1Var.zze);
    }

    /* renamed from: H */
    public static void m5063H(C2908p1 p1Var) {
        p1Var.zze = C3017x6.f5138j;
    }

    /* renamed from: I */
    public static /* synthetic */ void m5064I(C2908p1 p1Var, int i) {
        p1Var.mo13553M();
        p1Var.zze.remove(i);
    }

    /* renamed from: J */
    public static /* synthetic */ void m5065J(C2908p1 p1Var, String str) {
        str.getClass();
        p1Var.zza |= 1;
        p1Var.zzf = str;
    }

    /* renamed from: K */
    public static /* synthetic */ void m5066K(C2908p1 p1Var, long j) {
        p1Var.zza |= 2;
        p1Var.zzg = j;
    }

    /* renamed from: L */
    public static /* synthetic */ void m5067L(C2908p1 p1Var, long j) {
        p1Var.zza |= 4;
        p1Var.zzh = j;
    }

    /* renamed from: A */
    public final boolean mo13551A() {
        return (this.zza & 8) != 0;
    }

    /* renamed from: B */
    public final int mo13552B() {
        return this.zzi;
    }

    /* renamed from: M */
    public final void mo13553M() {
        C2977u5<C2960t1> u5Var = this.zze;
        if (!u5Var.mo13385a()) {
            this.zze = C2899o5.m5027l(u5Var);
        }
    }

    /* renamed from: r */
    public final Object mo13245r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C3030y6(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zza", "zze", C2960t1.class, "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C2908p1();
        } else {
            if (i2 == 4) {
                return new C2895o1((C2791g1) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzj;
        }
    }

    /* renamed from: s */
    public final List<C2960t1> mo13554s() {
        return this.zze;
    }

    /* renamed from: t */
    public final int mo13555t() {
        return this.zze.size();
    }

    /* renamed from: u */
    public final C2960t1 mo13556u(int i) {
        return this.zze.get(i);
    }

    /* renamed from: v */
    public final String mo13557v() {
        return this.zzf;
    }

    /* renamed from: w */
    public final boolean mo13558w() {
        return (this.zza & 2) != 0;
    }

    /* renamed from: x */
    public final long mo13559x() {
        return this.zzg;
    }

    /* renamed from: y */
    public final boolean mo13560y() {
        return (this.zza & 4) != 0;
    }

    /* renamed from: z */
    public final long mo13561z() {
        return this.zzh;
    }
}
