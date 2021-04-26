package p005b.p096l.p097a.p113c.p145h.p147b;

/* renamed from: b.l.a.c.h.b.a4 */
public abstract class C3111a4 extends C3122b3 {

    /* renamed from: b */
    public boolean f5256b;

    public C3111a4(C3281p4 p4Var) {
        super(p4Var);
        this.f5638a.f5839F++;
    }

    /* renamed from: i */
    public final void mo14065i() {
        if (!this.f5256b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: j */
    public final void mo14066j() {
        if (this.f5256b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo14067k()) {
            this.f5638a.f5840G.incrementAndGet();
            this.f5256b = true;
        }
    }

    /* renamed from: k */
    public abstract boolean mo14067k();
}
