package p005b.p096l.p097a.p113c.p131e.p136e;

/* renamed from: b.l.a.c.e.e.g9 */
public final class C2181g9 extends C2071c<C2181g9, C2156f9> implements C2097d0 {
    /* access modifiers changed from: private */
    public static final C2181g9 zzg;
    private String zzb = "";
    /* access modifiers changed from: private */
    public C2317lm zze = C2317lm.f4051h;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        C2181g9 g9Var = new C2181g9();
        zzg = g9Var;
        C2071c.m3083r(C2181g9.class, g9Var);
    }

    /* renamed from: v */
    public static C2156f9 m3429v() {
        return (C2156f9) zzg.mo12447i();
    }

    /* renamed from: w */
    public static C2181g9 m3430w() {
        return zzg;
    }

    /* renamed from: y */
    public static /* synthetic */ void m3432y(C2181g9 g9Var, String str) {
        str.getClass();
        g9Var.zzb = str;
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
            return new C2181g9();
        } else {
            if (i2 == 4) {
                return new C2156f9((C2131e9) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }

    /* renamed from: s */
    public final String mo12674s() {
        return this.zzb;
    }

    /* renamed from: t */
    public final C2317lm mo12675t() {
        return this.zze;
    }

    /* renamed from: u */
    public final C2107da mo12676u() {
        C2107da d = C2107da.m3210d(this.zzf);
        return d == null ? C2107da.UNRECOGNIZED : d;
    }
}
