package p005b.p096l.p097a.p113c.p131e.p136e;

/* renamed from: b.l.a.c.e.e.ca */
public final class C2082ca extends C2071c<C2082ca, C2057ba> implements C2097d0 {
    /* access modifiers changed from: private */
    public static final C2082ca zzf;
    private String zzb = "";
    private C2181g9 zze;

    static {
        C2082ca caVar = new C2082ca();
        zzf = caVar;
        C2071c.m3083r(C2082ca.class, caVar);
    }

    /* renamed from: v */
    public static C2082ca m3136v(C2317lm lmVar, C2605xm xmVar) {
        return (C2082ca) C2071c.m3079e(zzf, lmVar, xmVar);
    }

    /* renamed from: w */
    public static C2082ca m3137w() {
        return zzf;
    }

    /* renamed from: h */
    public final Object mo12376h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C2295l0(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzb", "zze"});
        } else if (i2 == 3) {
            return new C2082ca();
        } else {
            if (i2 == 4) {
                return new C2057ba();
            }
            if (i2 != 5) {
                return null;
            }
            return zzf;
        }
    }

    /* renamed from: s */
    public final String mo12460s() {
        return this.zzb;
    }

    /* renamed from: t */
    public final boolean mo12461t() {
        return this.zze != null;
    }

    /* renamed from: u */
    public final C2181g9 mo12462u() {
        C2181g9 g9Var = this.zze;
        return g9Var == null ? C2181g9.m3430w() : g9Var;
    }
}
