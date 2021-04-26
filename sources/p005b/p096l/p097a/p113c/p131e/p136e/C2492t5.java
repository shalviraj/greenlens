package p005b.p096l.p097a.p113c.p131e.p136e;

/* renamed from: b.l.a.c.e.e.t5 */
public final class C2492t5 extends C2071c<C2492t5, C2468s5> implements C2097d0 {
    /* access modifiers changed from: private */
    public static final C2492t5 zzg;
    /* access modifiers changed from: private */
    public int zzb;
    /* access modifiers changed from: private */
    public C2317lm zze = C2317lm.f4051h;
    private C2588x5 zzf;

    static {
        C2492t5 t5Var = new C2492t5();
        zzg = t5Var;
        C2071c.m3083r(C2492t5.class, t5Var);
    }

    /* renamed from: A */
    public static /* synthetic */ void m4181A(C2492t5 t5Var, C2588x5 x5Var) {
        x5Var.getClass();
        t5Var.zzf = x5Var;
    }

    /* renamed from: v */
    public static C2492t5 m4182v(C2317lm lmVar, C2605xm xmVar) {
        return (C2492t5) C2071c.m3079e(zzg, lmVar, xmVar);
    }

    /* renamed from: w */
    public static C2468s5 m4183w() {
        return (C2468s5) zzg.mo12447i();
    }

    /* renamed from: h */
    public final Object mo12376h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C2295l0(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzb", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C2492t5();
        } else {
            if (i2 == 4) {
                return new C2468s5((C2444r5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzg;
        }
    }

    /* renamed from: s */
    public final int mo13008s() {
        return this.zzb;
    }

    /* renamed from: t */
    public final C2317lm mo13009t() {
        return this.zze;
    }

    /* renamed from: u */
    public final C2588x5 mo13010u() {
        C2588x5 x5Var = this.zzf;
        return x5Var == null ? C2588x5.m4371t() : x5Var;
    }
}
