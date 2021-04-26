package p005b.p096l.p097a.p113c.p131e.p136e;

import java.util.Objects;

/* renamed from: b.l.a.c.e.e.c9 */
public final class C2081c9 extends C2071c<C2081c9, C2639z8> implements C2097d0 {
    /* access modifiers changed from: private */
    public static final C2081c9 zzg;
    /* access modifiers changed from: private */
    public String zzb = "";
    /* access modifiers changed from: private */
    public C2317lm zze = C2317lm.f4051h;
    private int zzf;

    static {
        C2081c9 c9Var = new C2081c9();
        zzg = c9Var;
        C2071c.m3083r(C2081c9.class, c9Var);
    }

    /* renamed from: A */
    public static void m3126A(C2081c9 c9Var, C2056b9 b9Var) {
        Objects.requireNonNull(b9Var);
        if (b9Var != C2056b9.UNRECOGNIZED) {
            c9Var.zzf = b9Var.f3633g;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: v */
    public static C2639z8 m3127v() {
        return (C2639z8) zzg.mo12447i();
    }

    /* renamed from: w */
    public static C2081c9 m3128w() {
        return zzg;
    }

    /* renamed from: h */
    public final Object mo12376h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C2295l0(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzb", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C2081c9();
        } else {
            if (i2 == 4) {
                return new C2639z8((C2615y8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }

    /* renamed from: s */
    public final String mo12457s() {
        return this.zzb;
    }

    /* renamed from: t */
    public final C2317lm mo12458t() {
        return this.zze;
    }

    /* renamed from: u */
    public final C2056b9 mo12459u() {
        int i = this.zzf;
        C2056b9 b9Var = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : C2056b9.REMOTE : C2056b9.ASYMMETRIC_PUBLIC : C2056b9.ASYMMETRIC_PRIVATE : C2056b9.SYMMETRIC : C2056b9.UNKNOWN_KEYMATERIAL;
        return b9Var == null ? C2056b9.UNRECOGNIZED : b9Var;
    }
}
