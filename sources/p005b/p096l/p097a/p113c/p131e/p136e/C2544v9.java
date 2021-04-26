package p005b.p096l.p097a.p113c.p131e.p136e;

/* renamed from: b.l.a.c.e.e.v9 */
public final class C2544v9 extends C2071c<C2544v9, C2520u9> implements C2097d0 {
    /* access modifiers changed from: private */
    public static final C2544v9 zzf;
    /* access modifiers changed from: private */
    public int zzb;
    private C2592x9 zze;

    static {
        C2544v9 v9Var = new C2544v9();
        zzf = v9Var;
        C2071c.m3083r(C2544v9.class, v9Var);
    }

    /* renamed from: u */
    public static C2544v9 m4303u(C2317lm lmVar, C2605xm xmVar) {
        return (C2544v9) C2071c.m3079e(zzf, lmVar, xmVar);
    }

    /* renamed from: v */
    public static C2520u9 m4304v() {
        return (C2520u9) zzf.mo12447i();
    }

    /* renamed from: y */
    public static /* synthetic */ void m4307y(C2544v9 v9Var, C2592x9 x9Var) {
        x9Var.getClass();
        v9Var.zze = x9Var;
    }

    /* renamed from: h */
    public final Object mo12376h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C2295l0(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzb", "zze"});
        } else if (i2 == 3) {
            return new C2544v9();
        } else {
            if (i2 == 4) {
                return new C2520u9((C2496t9) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzf;
        }
    }

    /* renamed from: s */
    public final int mo13053s() {
        return this.zzb;
    }

    /* renamed from: t */
    public final C2592x9 mo13054t() {
        C2592x9 x9Var = this.zze;
        return x9Var == null ? C2592x9.m4390u() : x9Var;
    }
}
