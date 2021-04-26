package p005b.p096l.p097a.p151d.p152a.p154b;

import java.util.concurrent.atomic.AtomicBoolean;
import p005b.p096l.p097a.p151d.p152a.p159e.C3579c0;
import p005b.p096l.p097a.p151d.p152a.p159e.C3584f;

/* renamed from: b.l.a.d.a.b.h0 */
public final class C3499h0 {

    /* renamed from: j */
    public static final C3584f f6415j = new C3584f("ExtractorLooper");

    /* renamed from: a */
    public final C3551v0 f6416a;

    /* renamed from: b */
    public final C3491f0 f6417b;

    /* renamed from: c */
    public final C3555w1 f6418c;

    /* renamed from: d */
    public final C3500h1 f6419d;

    /* renamed from: e */
    public final C3520m1 f6420e;

    /* renamed from: f */
    public final C3536q1 f6421f;

    /* renamed from: g */
    public final C3579c0<C3525n2> f6422g;

    /* renamed from: h */
    public final C3560y0 f6423h;

    /* renamed from: i */
    public final AtomicBoolean f6424i = new AtomicBoolean(false);

    public C3499h0(C3551v0 v0Var, C3579c0<C3525n2> c0Var, C3491f0 f0Var, C3555w1 w1Var, C3500h1 h1Var, C3520m1 m1Var, C3536q1 q1Var, C3560y0 y0Var) {
        this.f6416a = v0Var;
        this.f6422g = c0Var;
        this.f6417b = f0Var;
        this.f6418c = w1Var;
        this.f6419d = h1Var;
        this.f6420e = m1Var;
        this.f6421f = q1Var;
        this.f6423h = y0Var;
    }

    /* renamed from: a */
    public final void mo14783a(int i, Exception exc) {
        try {
            C3551v0 v0Var = this.f6416a;
            v0Var.mo14843b(new C3527o0(v0Var, i, (byte[]) null));
            C3551v0 v0Var2 = this.f6416a;
            v0Var2.mo14843b(new C3527o0(v0Var2, i));
        } catch (C3495g0 unused) {
            f6415j.mo14884b(6, "Error during error handling: %s", new Object[]{exc.getMessage()});
        }
    }
}
