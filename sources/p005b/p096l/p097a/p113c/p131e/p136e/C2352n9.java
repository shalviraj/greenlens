package p005b.p096l.p097a.p113c.p131e.p136e;

import java.util.List;

/* renamed from: b.l.a.c.e.e.n9 */
public final class C2352n9 extends C2071c<C2352n9, C2280k9> implements C2097d0 {
    /* access modifiers changed from: private */
    public static final C2352n9 zzf;
    /* access modifiers changed from: private */
    public int zzb;
    private C2171g<C2328m9> zze = C2271k0.f3988j;

    static {
        C2352n9 n9Var = new C2352n9();
        zzf = n9Var;
        C2071c.m3083r(C2352n9.class, n9Var);
    }

    /* renamed from: A */
    public static void m3808A(C2352n9 n9Var, C2328m9 m9Var) {
        m9Var.getClass();
        C2171g<C2328m9> gVar = n9Var.zze;
        if (!gVar.mo12473a()) {
            int size = gVar.size();
            n9Var.zze = gVar.mo12494h(size == 0 ? 10 : size + size);
        }
        n9Var.zze.add(m9Var);
    }

    /* renamed from: w */
    public static C2352n9 m3809w(byte[] bArr, C2605xm xmVar) {
        return (C2352n9) C2071c.m3080f(zzf, bArr, xmVar);
    }

    /* renamed from: x */
    public static C2280k9 m3810x() {
        return (C2280k9) zzf.mo12447i();
    }

    /* renamed from: h */
    public final Object mo12376h(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new C2295l0(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzb", "zze", C2328m9.class});
        } else if (i2 == 3) {
            return new C2352n9();
        } else {
            if (i2 == 4) {
                return new C2280k9((C2256j9) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzf;
        }
    }

    /* renamed from: s */
    public final int mo12825s() {
        return this.zzb;
    }

    /* renamed from: t */
    public final List<C2328m9> mo12826t() {
        return this.zze;
    }

    /* renamed from: u */
    public final int mo12827u() {
        return this.zze.size();
    }

    /* renamed from: v */
    public final C2328m9 mo12828v(int i) {
        return this.zze.get(i);
    }
}
