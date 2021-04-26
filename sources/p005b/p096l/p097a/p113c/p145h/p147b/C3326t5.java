package p005b.p096l.p097a.p113c.p145h.p147b;

/* renamed from: b.l.a.c.h.b.t5 */
public final class C3326t5 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ boolean f5973g;

    /* renamed from: h */
    public final /* synthetic */ C3294q6 f5974h;

    public C3326t5(C3294q6 q6Var, boolean z) {
        this.f5974h = q6Var;
        this.f5973g = z;
    }

    public final void run() {
        boolean j = this.f5974h.f5638a.mo14460j();
        boolean i = this.f5974h.f5638a.mo14459i();
        this.f5974h.f5638a.f5835B = Boolean.valueOf(this.f5973g);
        if (i == this.f5973g) {
            this.f5974h.f5638a.mo14329d().f5807n.mo14415b("Default data collection state already set to", Boolean.valueOf(this.f5973g));
        }
        if (this.f5974h.f5638a.mo14460j() == j || this.f5974h.f5638a.mo14460j() != this.f5974h.f5638a.mo14459i()) {
            this.f5974h.f5638a.mo14329d().f5804k.mo14416c("Default data collection is different than actual status", Boolean.valueOf(this.f5973g), Boolean.valueOf(j));
        }
        this.f5974h.mo14509v();
    }
}
