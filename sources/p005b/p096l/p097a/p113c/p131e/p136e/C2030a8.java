package p005b.p096l.p097a.p113c.p131e.p136e;

import java.util.Objects;

/* renamed from: b.l.a.c.e.e.a8 */
public final class C2030a8 extends C2071c<C2030a8, C2638z7> implements C2097d0 {
    /* access modifiers changed from: private */
    public static final C2030a8 zzg;
    private C2255j8 zzb;
    private C2518u7 zze;
    private int zzf;

    static {
        C2030a8 a8Var = new C2030a8();
        zzg = a8Var;
        C2071c.m3083r(C2030a8.class, a8Var);
    }

    /* renamed from: A */
    public static void m2990A(C2030a8 a8Var, C2446r7 r7Var) {
        Objects.requireNonNull(r7Var);
        if (r7Var != C2446r7.UNRECOGNIZED) {
            a8Var.zzf = r7Var.f4258g;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: v */
    public static C2638z7 m2991v() {
        return (C2638z7) zzg.mo12447i();
    }

    /* renamed from: w */
    public static C2030a8 m2992w() {
        return zzg;
    }

    /* renamed from: y */
    public static /* synthetic */ void m2994y(C2030a8 a8Var, C2255j8 j8Var) {
        j8Var.getClass();
        a8Var.zzb = j8Var;
    }

    /* renamed from: z */
    public static /* synthetic */ void m2995z(C2030a8 a8Var, C2518u7 u7Var) {
        u7Var.getClass();
        a8Var.zze = u7Var;
    }

    /* renamed from: h */
    public final Object mo12376h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C2295l0(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzb", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C2030a8();
        } else {
            if (i2 == 4) {
                return new C2638z7((C2614y7) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }

    /* renamed from: s */
    public final C2255j8 mo12380s() {
        C2255j8 j8Var = this.zzb;
        return j8Var == null ? C2255j8.m3576w() : j8Var;
    }

    /* renamed from: t */
    public final C2518u7 mo12381t() {
        C2518u7 u7Var = this.zze;
        return u7Var == null ? C2518u7.m4239u() : u7Var;
    }

    /* renamed from: u */
    public final C2446r7 mo12382u() {
        int i = this.zzf;
        C2446r7 r7Var = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : C2446r7.DO_NOT_USE_CRUNCHY_UNCOMPRESSED : C2446r7.COMPRESSED : C2446r7.UNCOMPRESSED : C2446r7.UNKNOWN_FORMAT;
        return r7Var == null ? C2446r7.UNRECOGNIZED : r7Var;
    }
}
