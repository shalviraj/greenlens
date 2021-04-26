package p005b.p096l.p097a.p113c.p150j;

/* renamed from: b.l.a.c.j.o */
public final class C3436o implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3428h f6213g;

    /* renamed from: h */
    public final /* synthetic */ C3435n f6214h;

    public C3436o(C3435n nVar, C3428h hVar) {
        this.f6214h = nVar;
        this.f6213g = hVar;
    }

    public final void run() {
        if (this.f6213g.mo14690l()) {
            this.f6214h.f6212c.mo14696r();
            return;
        }
        try {
            this.f6214h.f6212c.mo14695q(this.f6214h.f6211b.mo14670a(this.f6213g));
        } catch (C3425f e) {
            if (e.getCause() instanceof Exception) {
                this.f6214h.f6212c.mo14694p((Exception) e.getCause());
            } else {
                this.f6214h.f6212c.mo14694p(e);
            }
        } catch (Exception e2) {
            this.f6214h.f6212c.mo14694p(e2);
        }
    }
}
