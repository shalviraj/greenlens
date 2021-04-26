package p005b.p096l.p097a.p113c.p131e.p140i;

import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.util.List;

/* renamed from: b.l.a.c.e.i.t1 */
public final class C2960t1 extends C2899o5<C2960t1, C2947s1> implements C2926q6 {
    /* access modifiers changed from: private */
    public static final C2960t1 zzk;
    private int zza;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;
    private C2977u5<C2960t1> zzj = C3017x6.f5138j;

    static {
        C2960t1 t1Var = new C2960t1();
        zzk = t1Var;
        C2899o5.m5029q(C2960t1.class, t1Var);
    }

    /* renamed from: E */
    public static C2947s1 m5263E() {
        return (C2947s1) zzk.mo13545m();
    }

    /* renamed from: G */
    public static /* synthetic */ void m5265G(C2960t1 t1Var, String str) {
        str.getClass();
        t1Var.zza |= 1;
        t1Var.zze = str;
    }

    /* renamed from: H */
    public static /* synthetic */ void m5266H(C2960t1 t1Var, String str) {
        str.getClass();
        t1Var.zza |= 2;
        t1Var.zzf = str;
    }

    /* renamed from: I */
    public static /* synthetic */ void m5267I(C2960t1 t1Var) {
        t1Var.zza &= -3;
        t1Var.zzf = zzk.zzf;
    }

    /* renamed from: J */
    public static /* synthetic */ void m5268J(C2960t1 t1Var, long j) {
        t1Var.zza |= 4;
        t1Var.zzg = j;
    }

    /* renamed from: K */
    public static /* synthetic */ void m5269K(C2960t1 t1Var) {
        t1Var.zza &= -5;
        t1Var.zzg = 0;
    }

    /* renamed from: L */
    public static /* synthetic */ void m5270L(C2960t1 t1Var, double d) {
        t1Var.zza |= 16;
        t1Var.zzi = d;
    }

    /* renamed from: M */
    public static /* synthetic */ void m5271M(C2960t1 t1Var) {
        t1Var.zza &= -17;
        t1Var.zzi = ShadowDrawableWrapper.COS_45;
    }

    /* renamed from: N */
    public static void m5272N(C2960t1 t1Var, C2960t1 t1Var2) {
        C2977u5<C2960t1> u5Var = t1Var.zzj;
        if (!u5Var.mo13385a()) {
            t1Var.zzj = C2899o5.m5027l(u5Var);
        }
        t1Var.zzj.add(t1Var2);
    }

    /* renamed from: O */
    public static void m5273O(C2960t1 t1Var, Iterable iterable) {
        C2977u5<C2960t1> u5Var = t1Var.zzj;
        if (!u5Var.mo13385a()) {
            t1Var.zzj = C2899o5.m5027l(u5Var);
        }
        C2807h4.m4807i(iterable, t1Var.zzj);
    }

    /* renamed from: P */
    public static void m5274P(C2960t1 t1Var) {
        t1Var.zzj = C3017x6.f5138j;
    }

    /* renamed from: A */
    public final boolean mo13732A() {
        return (this.zza & 16) != 0;
    }

    /* renamed from: B */
    public final double mo13733B() {
        return this.zzi;
    }

    /* renamed from: C */
    public final List<C2960t1> mo13734C() {
        return this.zzj;
    }

    /* renamed from: D */
    public final int mo13735D() {
        return this.zzj.size();
    }

    /* renamed from: r */
    public final Object mo13245r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C3030y6(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", C2960t1.class});
        } else if (i2 == 3) {
            return new C2960t1();
        } else {
            if (i2 == 4) {
                return new C2947s1((C2791g1) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzk;
        }
    }

    /* renamed from: s */
    public final boolean mo13736s() {
        return (this.zza & 1) != 0;
    }

    /* renamed from: t */
    public final String mo13737t() {
        return this.zze;
    }

    /* renamed from: u */
    public final boolean mo13738u() {
        return (this.zza & 2) != 0;
    }

    /* renamed from: v */
    public final String mo13739v() {
        return this.zzf;
    }

    /* renamed from: w */
    public final boolean mo13740w() {
        return (this.zza & 4) != 0;
    }

    /* renamed from: x */
    public final long mo13741x() {
        return this.zzg;
    }

    /* renamed from: y */
    public final boolean mo13742y() {
        return (this.zza & 8) != 0;
    }

    /* renamed from: z */
    public final float mo13743z() {
        return this.zzh;
    }
}
