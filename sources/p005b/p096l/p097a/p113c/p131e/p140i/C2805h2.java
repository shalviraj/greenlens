package p005b.p096l.p097a.p113c.p131e.p140i;

import com.google.android.material.shadow.ShadowDrawableWrapper;

/* renamed from: b.l.a.c.e.i.h2 */
public final class C2805h2 extends C2899o5<C2805h2, C2792g2> implements C2926q6 {
    /* access modifiers changed from: private */
    public static final C2805h2 zzk;
    private int zza;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        C2805h2 h2Var = new C2805h2();
        zzk = h2Var;
        C2899o5.m5029q(C2805h2.class, h2Var);
    }

    /* renamed from: B */
    public static C2792g2 m4786B() {
        return (C2792g2) zzk.mo13545m();
    }

    /* renamed from: D */
    public static /* synthetic */ void m4788D(C2805h2 h2Var, long j) {
        h2Var.zza |= 1;
        h2Var.zze = j;
    }

    /* renamed from: E */
    public static /* synthetic */ void m4789E(C2805h2 h2Var, String str) {
        str.getClass();
        h2Var.zza |= 2;
        h2Var.zzf = str;
    }

    /* renamed from: F */
    public static /* synthetic */ void m4790F(C2805h2 h2Var, String str) {
        str.getClass();
        h2Var.zza |= 4;
        h2Var.zzg = str;
    }

    /* renamed from: G */
    public static /* synthetic */ void m4791G(C2805h2 h2Var) {
        h2Var.zza &= -5;
        h2Var.zzg = zzk.zzg;
    }

    /* renamed from: H */
    public static /* synthetic */ void m4792H(C2805h2 h2Var, long j) {
        h2Var.zza |= 8;
        h2Var.zzh = j;
    }

    /* renamed from: I */
    public static /* synthetic */ void m4793I(C2805h2 h2Var) {
        h2Var.zza &= -9;
        h2Var.zzh = 0;
    }

    /* renamed from: J */
    public static /* synthetic */ void m4794J(C2805h2 h2Var, double d) {
        h2Var.zza |= 32;
        h2Var.zzj = d;
    }

    /* renamed from: K */
    public static /* synthetic */ void m4795K(C2805h2 h2Var) {
        h2Var.zza &= -33;
        h2Var.zzj = ShadowDrawableWrapper.COS_45;
    }

    /* renamed from: A */
    public final double mo13361A() {
        return this.zzj;
    }

    /* renamed from: r */
    public final Object mo13245r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C3030y6(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zza", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C2805h2();
        } else {
            if (i2 == 4) {
                return new C2792g2((C2791g1) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzk;
        }
    }

    /* renamed from: s */
    public final boolean mo13362s() {
        return (this.zza & 1) != 0;
    }

    /* renamed from: t */
    public final long mo13363t() {
        return this.zze;
    }

    /* renamed from: u */
    public final String mo13364u() {
        return this.zzf;
    }

    /* renamed from: v */
    public final boolean mo13365v() {
        return (this.zza & 4) != 0;
    }

    /* renamed from: w */
    public final String mo13366w() {
        return this.zzg;
    }

    /* renamed from: x */
    public final boolean mo13367x() {
        return (this.zza & 8) != 0;
    }

    /* renamed from: y */
    public final long mo13368y() {
        return this.zzh;
    }

    /* renamed from: z */
    public final boolean mo13369z() {
        return (this.zza & 32) != 0;
    }
}
