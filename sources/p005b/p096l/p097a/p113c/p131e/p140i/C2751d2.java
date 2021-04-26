package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.List;

/* renamed from: b.l.a.c.e.i.d2 */
public final class C2751d2 extends C2899o5<C2751d2, C2737c2> implements C2926q6 {
    /* access modifiers changed from: private */
    public static final C2751d2 zzh;
    private C2964t5 zza;
    private C2964t5 zze;
    private C2977u5<C2882n1> zzf;
    private C2977u5<C2779f2> zzg;

    static {
        C2751d2 d2Var = new C2751d2();
        zzh = d2Var;
        C2899o5.m5029q(C2751d2.class, d2Var);
    }

    public C2751d2() {
        C2783f6 f6Var = C2783f6.f4722j;
        this.zza = f6Var;
        this.zze = f6Var;
        C3017x6<Object> x6Var = C3017x6.f5138j;
        this.zzf = x6Var;
        this.zzg = x6Var;
    }

    /* renamed from: C */
    public static C2737c2 m4685C() {
        return (C2737c2) zzh.mo13545m();
    }

    /* renamed from: D */
    public static C2751d2 m4686D() {
        return zzh;
    }

    /* renamed from: F */
    public static void m4688F(C2751d2 d2Var, Iterable iterable) {
        C2964t5 t5Var = d2Var.zza;
        if (!((C2820i4) t5Var).f4835g) {
            d2Var.zza = C2899o5.m5026k(t5Var);
        }
        C2807h4.m4807i(iterable, d2Var.zza);
    }

    /* renamed from: G */
    public static void m4689G(C2751d2 d2Var) {
        d2Var.zza = C2783f6.f4722j;
    }

    /* renamed from: H */
    public static void m4690H(C2751d2 d2Var, Iterable iterable) {
        C2964t5 t5Var = d2Var.zze;
        if (!((C2820i4) t5Var).f4835g) {
            d2Var.zze = C2899o5.m5026k(t5Var);
        }
        C2807h4.m4807i(iterable, d2Var.zze);
    }

    /* renamed from: I */
    public static void m4691I(C2751d2 d2Var) {
        d2Var.zze = C2783f6.f4722j;
    }

    /* renamed from: J */
    public static void m4692J(C2751d2 d2Var, Iterable iterable) {
        C2977u5<C2882n1> u5Var = d2Var.zzf;
        if (!u5Var.mo13385a()) {
            d2Var.zzf = C2899o5.m5027l(u5Var);
        }
        C2807h4.m4807i(iterable, d2Var.zzf);
    }

    /* renamed from: K */
    public static void m4693K(C2751d2 d2Var, int i) {
        C2977u5<C2882n1> u5Var = d2Var.zzf;
        if (!u5Var.mo13385a()) {
            d2Var.zzf = C2899o5.m5027l(u5Var);
        }
        d2Var.zzf.remove(i);
    }

    /* renamed from: L */
    public static void m4694L(C2751d2 d2Var, Iterable iterable) {
        C2977u5<C2779f2> u5Var = d2Var.zzg;
        if (!u5Var.mo13385a()) {
            d2Var.zzg = C2899o5.m5027l(u5Var);
        }
        C2807h4.m4807i(iterable, d2Var.zzg);
    }

    /* renamed from: M */
    public static void m4695M(C2751d2 d2Var, int i) {
        C2977u5<C2779f2> u5Var = d2Var.zzg;
        if (!u5Var.mo13385a()) {
            d2Var.zzg = C2899o5.m5027l(u5Var);
        }
        d2Var.zzg.remove(i);
    }

    /* renamed from: A */
    public final int mo13280A() {
        return this.zzg.size();
    }

    /* renamed from: B */
    public final C2779f2 mo13281B(int i) {
        return this.zzg.get(i);
    }

    /* renamed from: r */
    public final Object mo13245r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C3030y6(zzh, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zza", "zze", "zzf", C2882n1.class, "zzg", C2779f2.class});
        } else if (i2 == 3) {
            return new C2751d2();
        } else {
            if (i2 == 4) {
                return new C2737c2((C2791g1) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzh;
        }
    }

    /* renamed from: s */
    public final List<Long> mo13282s() {
        return this.zza;
    }

    /* renamed from: t */
    public final int mo13283t() {
        return ((C2783f6) this.zza).size();
    }

    /* renamed from: u */
    public final List<Long> mo13284u() {
        return this.zze;
    }

    /* renamed from: v */
    public final int mo13285v() {
        return ((C2783f6) this.zze).size();
    }

    /* renamed from: w */
    public final List<C2882n1> mo13286w() {
        return this.zzf;
    }

    /* renamed from: x */
    public final int mo13287x() {
        return this.zzf.size();
    }

    /* renamed from: y */
    public final C2882n1 mo13288y(int i) {
        return this.zzf.get(i);
    }

    /* renamed from: z */
    public final List<C2779f2> mo13289z() {
        return this.zzg;
    }
}
