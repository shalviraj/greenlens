package p005b.p096l.p097a.p113c.p131e.p136e;

import java.nio.charset.Charset;

/* renamed from: b.l.a.c.e.e.um */
public final class C2533um {

    /* renamed from: a */
    public final C2509tm f4358a;

    public C2533um(C2509tm tmVar) {
        Charset charset = C2196h.f3910a;
        this.f4358a = tmVar;
        tmVar.f4331a = this;
    }

    /* renamed from: a */
    public final void mo13038a(int i, float f) {
        this.f4358a.mo12936l(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: b */
    public final void mo13039b(int i, double d) {
        this.f4358a.mo12938n(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: c */
    public final void mo13040c(int i, int i2) {
        this.f4358a.mo12935k(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: d */
    public final void mo13041d(int i, long j) {
        this.f4358a.mo12937m(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: e */
    public final void mo13042e(int i, Object obj, C2319m0 m0Var) {
        this.f4358a.mo12942r(i, (C2072c0) obj, m0Var);
    }

    /* renamed from: f */
    public final void mo13043f(int i, Object obj, C2319m0 m0Var) {
        C2509tm tmVar = this.f4358a;
        tmVar.mo12933i(i, 3);
        m0Var.mo12561h((C2072c0) obj, tmVar.f4331a);
        tmVar.mo12933i(i, 4);
    }
}
