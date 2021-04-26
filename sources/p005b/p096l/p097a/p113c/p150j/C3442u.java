package p005b.p096l.p097a.p113c.p150j;

/* renamed from: b.l.a.c.j.u */
public final class C3442u implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3428h f6227g;

    /* renamed from: h */
    public final /* synthetic */ C3441t f6228h;

    public C3442u(C3441t tVar, C3428h hVar) {
        this.f6228h = tVar;
        this.f6227g = hVar;
    }

    public final void run() {
        synchronized (this.f6228h.f6225b) {
            C3418c<TResult> cVar = this.f6228h.f6226c;
            if (cVar != null) {
                cVar.mo10462c(this.f6227g);
            }
        }
    }
}
