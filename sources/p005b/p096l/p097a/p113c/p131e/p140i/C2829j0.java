package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.List;

/* renamed from: b.l.a.c.e.i.j0 */
public final class C2829j0 extends C2899o5<C2829j0, C2816i0> implements C2926q6 {
    /* access modifiers changed from: private */
    public static final C2829j0 zzj;
    private int zza;
    private int zze;
    private C2977u5<C2972u0> zzf;
    private C2977u5<C2855l0> zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        C2829j0 j0Var = new C2829j0();
        zzj = j0Var;
        C2899o5.m5029q(C2829j0.class, j0Var);
    }

    public C2829j0() {
        C3017x6<Object> x6Var = C3017x6.f5138j;
        this.zzf = x6Var;
        this.zzg = x6Var;
    }

    /* renamed from: B */
    public static /* synthetic */ void m4846B(C2829j0 j0Var, int i, C2972u0 u0Var) {
        C2977u5<C2972u0> u5Var = j0Var.zzf;
        if (!u5Var.mo13385a()) {
            j0Var.zzf = C2899o5.m5027l(u5Var);
        }
        j0Var.zzf.set(i, u0Var);
    }

    /* renamed from: C */
    public static /* synthetic */ void m4847C(C2829j0 j0Var, int i, C2855l0 l0Var) {
        C2977u5<C2855l0> u5Var = j0Var.zzg;
        if (!u5Var.mo13385a()) {
            j0Var.zzg = C2899o5.m5027l(u5Var);
        }
        j0Var.zzg.set(i, l0Var);
    }

    /* renamed from: r */
    public final Object mo13245r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C3030y6(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zza", "zze", "zzf", C2972u0.class, "zzg", C2855l0.class, "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C2829j0();
        } else {
            if (i2 == 4) {
                return new C2816i0((C2803h0) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzj;
        }
    }

    /* renamed from: s */
    public final boolean mo13410s() {
        return (this.zza & 1) != 0;
    }

    /* renamed from: t */
    public final int mo13411t() {
        return this.zze;
    }

    /* renamed from: u */
    public final List<C2972u0> mo13412u() {
        return this.zzf;
    }

    /* renamed from: v */
    public final int mo13413v() {
        return this.zzf.size();
    }

    /* renamed from: w */
    public final C2972u0 mo13414w(int i) {
        return this.zzf.get(i);
    }

    /* renamed from: x */
    public final List<C2855l0> mo13415x() {
        return this.zzg;
    }

    /* renamed from: y */
    public final int mo13416y() {
        return this.zzg.size();
    }

    /* renamed from: z */
    public final C2855l0 mo13417z(int i) {
        return this.zzg.get(i);
    }
}
