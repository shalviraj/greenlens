package p005b.p096l.p097a.p151d.p152a.p154b;

import java.util.concurrent.Executor;
import p005b.p096l.p097a.p151d.p152a.p156c.C3567c;
import p005b.p096l.p097a.p151d.p152a.p159e.C3583e0;
import p005b.p096l.p097a.p151d.p152a.p159e.C3585f0;

/* renamed from: b.l.a.d.a.b.w0 */
public final class C3554w0 implements C3585f0<C3551v0> {

    /* renamed from: a */
    public final C3585f0 f6594a;

    /* renamed from: b */
    public final C3585f0 f6595b;

    /* renamed from: c */
    public final C3585f0 f6596c;

    /* renamed from: d */
    public final C3585f0 f6597d;

    /* renamed from: e */
    public final /* synthetic */ int f6598e = 0;

    public C3554w0(C3585f0<C3544t> f0Var, C3585f0<C3525n2> f0Var2, C3585f0<C3511k0> f0Var3, C3585f0<Executor> f0Var4) {
        this.f6594a = f0Var;
        this.f6595b = f0Var2;
        this.f6596c = f0Var3;
        this.f6597d = f0Var4;
    }

    public C3554w0(C3585f0<C3544t> f0Var, C3585f0<C3525n2> f0Var2, C3585f0<C3534q> f0Var3, C3585f0<C3511k0> f0Var4, byte[] bArr) {
        this.f6594a = f0Var;
        this.f6595b = f0Var2;
        this.f6596c = f0Var3;
        this.f6597d = f0Var4;
    }

    public C3554w0(C3585f0<C3551v0> f0Var, C3585f0<C3544t> f0Var2, C3585f0<C3562z> f0Var3, C3585f0<C3567c> f0Var4, char[] cArr) {
        this.f6596c = f0Var;
        this.f6595b = f0Var2;
        this.f6594a = f0Var3;
        this.f6597d = f0Var4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14735a() {
        int i = this.f6598e;
        if (i == 0) {
            Object a = this.f6594a.mo14735a();
            return new C3551v0((C3544t) a, C3583e0.m6802b(this.f6595b), (C3511k0) this.f6596c.mo14735a(), C3583e0.m6802b(this.f6597d));
        } else if (i != 1) {
            Object a2 = this.f6596c.mo14735a();
            Object a3 = this.f6595b.mo14735a();
            return new C3560y0((C3551v0) a2, (C3544t) a3, (C3562z) this.f6594a.mo14735a(), (C3567c) this.f6597d.mo14735a());
        } else {
            return new C3491f0((C3544t) this.f6594a.mo14735a(), C3583e0.m6802b(this.f6595b), C3583e0.m6802b(this.f6596c), (C3511k0) this.f6597d.mo14735a());
        }
    }
}
