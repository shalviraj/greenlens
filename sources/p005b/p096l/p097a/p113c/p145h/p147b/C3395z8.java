package p005b.p096l.p097a.p113c.p145h.p147b;

/* renamed from: b.l.a.c.h.b.z8 */
public abstract class C3395z8 extends C3384y8 {

    /* renamed from: c */
    public boolean f6158c;

    public C3395z8(C3220j9 j9Var) {
        super(j9Var);
        this.f6128b.f5663p++;
    }

    /* renamed from: i */
    public final void mo14646i() {
        if (!this.f6158c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: j */
    public abstract boolean mo14178j();

    /* renamed from: k */
    public final void mo14647k() {
        if (!this.f6158c) {
            mo14178j();
            this.f6128b.f5664q++;
            this.f6158c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
