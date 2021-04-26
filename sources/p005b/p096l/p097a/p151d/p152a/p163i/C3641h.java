package p005b.p096l.p097a.p151d.p152a.p163i;

/* renamed from: b.l.a.d.a.i.h */
public final class C3641h implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C3651r f6709g;

    /* renamed from: h */
    public final /* synthetic */ C3642i f6710h;

    public C3641h(C3642i iVar, C3651r rVar) {
        this.f6710h = iVar;
        this.f6709g = rVar;
    }

    public final void run() {
        Exception exc;
        synchronized (this.f6710h.f6712b) {
            C3635b bVar = this.f6710h.f6713c;
            if (bVar != null) {
                C3651r rVar = this.f6709g;
                synchronized (rVar.f6724a) {
                    exc = rVar.f6728e;
                }
                bVar.mo10469b(exc);
            }
        }
    }
}
