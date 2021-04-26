package p005b.p096l.p097a.p113c.p131e.p136e;

import java.util.Objects;

/* renamed from: b.l.a.c.e.e.j8 */
public final class C2255j8 extends C2071c<C2255j8, C2230i8> implements C2097d0 {
    /* access modifiers changed from: private */
    public static final C2255j8 zzg;
    private int zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public C2317lm zzf = C2317lm.f4051h;

    static {
        C2255j8 j8Var = new C2255j8();
        zzg = j8Var;
        C2071c.m3083r(C2255j8.class, j8Var);
    }

    /* renamed from: v */
    public static C2230i8 m3575v() {
        return (C2230i8) zzg.mo12447i();
    }

    /* renamed from: w */
    public static C2255j8 m3576w() {
        return zzg;
    }

    /* renamed from: y */
    public static void m3578y(C2255j8 j8Var, C2279k8 k8Var) {
        Objects.requireNonNull(k8Var);
        if (k8Var != C2279k8.UNRECOGNIZED) {
            j8Var.zzb = k8Var.f4011g;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: h */
    public final Object mo12376h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C2295l0(zzg, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzb", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C2255j8();
        } else {
            if (i2 == 4) {
                return new C2230i8((C2205h8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }

    /* renamed from: s */
    public final C2279k8 mo12738s() {
        int i = this.zzb;
        C2279k8 k8Var = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : C2279k8.CURVE25519 : C2279k8.NIST_P521 : C2279k8.NIST_P384 : C2279k8.NIST_P256 : C2279k8.UNKNOWN_CURVE;
        return k8Var == null ? C2279k8.UNRECOGNIZED : k8Var;
    }

    /* renamed from: t */
    public final C2375o8 mo12739t() {
        C2375o8 d = C2375o8.m3921d(this.zze);
        return d == null ? C2375o8.UNRECOGNIZED : d;
    }

    /* renamed from: u */
    public final C2317lm mo12740u() {
        return this.zzf;
    }
}
