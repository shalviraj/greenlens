package p005b.p096l.p097a.p113c.p131e.p140i;

import java.nio.charset.Charset;

/* renamed from: b.l.a.c.e.i.x4 */
public final class C3015x4 {

    /* renamed from: a */
    public final C3002w4 f5136a;

    public C3015x4(C3002w4 w4Var) {
        Charset charset = C2990v5.f5088a;
        this.f5136a = w4Var;
        w4Var.f5105a = this;
    }

    /* renamed from: a */
    public final void mo13966a(int i, float f) {
        this.f5136a.mo13773g(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: b */
    public final void mo13967b(int i, double d) {
        this.f5136a.mo13775i(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: c */
    public final void mo13968c(int i, int i2) {
        this.f5136a.mo13772f(i, (i2 >> 31) ^ (i2 + i2));
    }

    /* renamed from: d */
    public final void mo13969d(int i, long j) {
        this.f5136a.mo13774h(i, (j >> 63) ^ (j + j));
    }

    /* renamed from: e */
    public final void mo13970e(int i, Object obj, C3043z6 z6Var) {
        C2913p6 p6Var = (C2913p6) obj;
        C2976u4 u4Var = (C2976u4) this.f5136a;
        u4Var.mo13781o((i << 3) | 2);
        C2807h4 h4Var = (C2807h4) p6Var;
        int g = h4Var.mo13372g();
        if (g == -1) {
            g = z6Var.mo13629c(h4Var);
            h4Var.mo13373h(g);
        }
        u4Var.mo13781o(g);
        z6Var.mo13635i(p6Var, u4Var.f5105a);
    }

    /* renamed from: f */
    public final void mo13971f(int i, Object obj, C3043z6 z6Var) {
        C3002w4 w4Var = this.f5136a;
        w4Var.mo13770d(i, 3);
        z6Var.mo13635i((C2913p6) obj, w4Var.f5105a);
        w4Var.mo13770d(i, 4);
    }
}
