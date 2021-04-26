package p005b.p096l.p097a.p113c.p131e.p140i;

/* renamed from: b.l.a.c.e.i.b1 */
public final class C2722b1 extends C2899o5<C2722b1, C2708a1> implements C2926q6 {
    /* access modifiers changed from: private */
    public static final C2722b1 zzi;
    private int zza;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        C2722b1 b1Var = new C2722b1();
        zzi = b1Var;
        C2899o5.m5029q(C2722b1.class, b1Var);
    }

    /* renamed from: y */
    public static /* synthetic */ void m4578y(C2722b1 b1Var, String str) {
        str.getClass();
        b1Var.zza |= 1;
        b1Var.zze = str;
    }

    /* renamed from: r */
    public final Object mo13245r(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C3030y6(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zza", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C2722b1();
        } else {
            if (i2 == 4) {
                return new C2708a1((C3037z0) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzi;
        }
    }

    /* renamed from: s */
    public final String mo13246s() {
        return this.zze;
    }

    /* renamed from: t */
    public final boolean mo13247t() {
        return this.zzf;
    }

    /* renamed from: u */
    public final boolean mo13248u() {
        return this.zzg;
    }

    /* renamed from: v */
    public final boolean mo13249v() {
        return (this.zza & 8) != 0;
    }

    /* renamed from: w */
    public final int mo13250w() {
        return this.zzh;
    }
}
