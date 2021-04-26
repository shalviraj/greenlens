package p005b.p096l.p097a.p113c.p131e.p136e;

/* renamed from: b.l.a.c.e.e.aa */
public final class C2032aa extends C2071c<C2032aa, C2640z9> implements C2097d0 {
    /* access modifiers changed from: private */
    public static final C2032aa zzf;
    /* access modifiers changed from: private */
    public int zzb;
    private C2082ca zze;

    static {
        C2032aa aaVar = new C2032aa();
        zzf = aaVar;
        C2071c.m3083r(C2032aa.class, aaVar);
    }

    /* renamed from: u */
    public static C2032aa m3000u(C2317lm lmVar, C2605xm xmVar) {
        return (C2032aa) C2071c.m3079e(zzf, lmVar, xmVar);
    }

    /* renamed from: v */
    public static C2640z9 m3001v() {
        return (C2640z9) zzf.mo12447i();
    }

    /* renamed from: y */
    public static /* synthetic */ void m3004y(C2032aa aaVar, C2082ca caVar) {
        caVar.getClass();
        aaVar.zze = caVar;
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
            return new C2032aa();
        } else {
            if (i2 == 4) {
                return new C2640z9((C2616y9) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzf;
        }
    }

    /* renamed from: s */
    public final int mo12383s() {
        return this.zzb;
    }

    /* renamed from: t */
    public final C2082ca mo12384t() {
        C2082ca caVar = this.zze;
        return caVar == null ? C2082ca.m3137w() : caVar;
    }
}
