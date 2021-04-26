package p005b.p096l.p097a.p113c.p131e.p136e;

/* renamed from: b.l.a.c.e.e.s9 */
public final class C2472s9 extends C2071c<C2472s9, C2400p9> implements C2097d0 {
    /* access modifiers changed from: private */
    public static final C2472s9 zzf;
    /* access modifiers changed from: private */
    public int zzb;
    private C2171g<C2448r9> zze = C2271k0.f3988j;

    static {
        C2472s9 s9Var = new C2472s9();
        zzf = s9Var;
        C2071c.m3083r(C2472s9.class, s9Var);
    }

    /* renamed from: t */
    public static C2400p9 m4128t() {
        return (C2400p9) zzf.mo12447i();
    }

    /* renamed from: w */
    public static void m4131w(C2472s9 s9Var, C2448r9 r9Var) {
        r9Var.getClass();
        C2171g<C2448r9> gVar = s9Var.zze;
        if (!gVar.mo12473a()) {
            int size = gVar.size();
            s9Var.zze = gVar.mo12494h(size == 0 ? 10 : size + size);
        }
        s9Var.zze.add(r9Var);
    }

    /* renamed from: h */
    public final Object mo12376h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C2295l0(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzb", "zze", C2448r9.class});
        } else if (i2 == 3) {
            return new C2472s9();
        } else {
            if (i2 == 4) {
                return new C2400p9((C2376o9) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzf;
        }
    }

    /* renamed from: s */
    public final C2448r9 mo12984s() {
        return this.zze.get(0);
    }
}
