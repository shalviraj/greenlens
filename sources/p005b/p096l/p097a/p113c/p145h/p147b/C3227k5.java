package p005b.p096l.p097a.p113c.p145h.p147b;

/* renamed from: b.l.a.c.h.b.k5 */
public abstract class C3227k5 extends C3216j5 {

    /* renamed from: b */
    public boolean f5683b;

    public C3227k5(C3281p4 p4Var) {
        super(p4Var);
        this.f5638a.f5839F++;
    }

    /* renamed from: i */
    public abstract boolean mo14141i();

    /* renamed from: j */
    public void mo14142j() {
    }

    /* renamed from: k */
    public final boolean mo14376k() {
        return this.f5683b;
    }

    /* renamed from: l */
    public final void mo14377l() {
        if (!mo14376k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: m */
    public final void mo14378m() {
        if (this.f5683b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo14141i()) {
            this.f5638a.f5840G.incrementAndGet();
            this.f5683b = true;
        }
    }

    /* renamed from: n */
    public final void mo14379n() {
        if (!this.f5683b) {
            mo14142j();
            this.f5638a.f5840G.incrementAndGet();
            this.f5683b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
