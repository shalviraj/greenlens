package p005b.p096l.p097a.p113c.p131e.p136e;

/* renamed from: b.l.a.c.e.e.m9 */
public final class C2328m9 extends C2071c<C2328m9, C2304l9> implements C2097d0 {
    /* access modifiers changed from: private */
    public static final C2328m9 zzh;
    private C2081c9 zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        C2328m9 m9Var = new C2328m9();
        zzh = m9Var;
        C2071c.m3083r(C2328m9.class, m9Var);
    }

    /* renamed from: x */
    public static C2304l9 m3758x() {
        return (C2304l9) zzh.mo12447i();
    }

    /* renamed from: z */
    public static /* synthetic */ void m3760z(C2328m9 m9Var, C2081c9 c9Var) {
        c9Var.getClass();
        m9Var.zzb = c9Var;
    }

    /* renamed from: h */
    public final Object mo12376h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C2295l0(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzb", "zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C2328m9();
        } else {
            if (i2 == 4) {
                return new C2304l9((C2256j9) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzh;
        }
    }

    /* renamed from: s */
    public final boolean mo12811s() {
        return this.zzb != null;
    }

    /* renamed from: t */
    public final C2081c9 mo12812t() {
        C2081c9 c9Var = this.zzb;
        return c9Var == null ? C2081c9.m3128w() : c9Var;
    }

    /* renamed from: u */
    public final C2106d9 mo12813u() {
        int i = this.zze;
        C2106d9 d9Var = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : C2106d9.DESTROYED : C2106d9.DISABLED : C2106d9.ENABLED : C2106d9.UNKNOWN_STATUS;
        return d9Var == null ? C2106d9.UNRECOGNIZED : d9Var;
    }

    /* renamed from: v */
    public final int mo12814v() {
        return this.zzf;
    }

    /* renamed from: w */
    public final C2107da mo12815w() {
        C2107da d = C2107da.m3210d(this.zzg);
        return d == null ? C2107da.UNRECOGNIZED : d;
    }
}
