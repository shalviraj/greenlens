package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.List;

/* renamed from: b.l.a.c.e.i.y0 */
public final class C3024y0 extends C2899o5<C3024y0, C2985v0> implements C2926q6 {
    /* access modifiers changed from: private */
    public static final C3024y0 zzi;
    private int zza;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private C2977u5<String> zzh = C3017x6.f5138j;

    static {
        C3024y0 y0Var = new C3024y0();
        zzi = y0Var;
        C2899o5.m5029q(C3024y0.class, y0Var);
    }

    /* renamed from: A */
    public static C3024y0 m5696A() {
        return zzi;
    }

    /* renamed from: r */
    public final Object mo13245r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C3030y6(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zza", "zze", C2998w0.f5098a, "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C3024y0();
        } else {
            if (i2 == 4) {
                return new C2985v0();
            }
            if (i2 != 5) {
                return null;
            }
            return zzi;
        }
    }

    /* renamed from: s */
    public final boolean mo13981s() {
        return (this.zza & 1) != 0;
    }

    /* renamed from: t */
    public final C3011x0 mo13982t() {
        C3011x0 d = C3011x0.m5556d(this.zze);
        return d == null ? C3011x0.UNKNOWN_MATCH_TYPE : d;
    }

    /* renamed from: u */
    public final boolean mo13983u() {
        return (this.zza & 2) != 0;
    }

    /* renamed from: v */
    public final String mo13984v() {
        return this.zzf;
    }

    /* renamed from: w */
    public final boolean mo13985w() {
        return (this.zza & 4) != 0;
    }

    /* renamed from: x */
    public final boolean mo13986x() {
        return this.zzg;
    }

    /* renamed from: y */
    public final List<String> mo13987y() {
        return this.zzh;
    }

    /* renamed from: z */
    public final int mo13988z() {
        return this.zzh.size();
    }
}
