package p005b.p096l.p097a.p151d.p152a.p163i;

/* renamed from: b.l.a.d.a.i.n */
public final class C3647n<ResultT> {

    /* renamed from: a */
    public final C3651r<ResultT> f6722a = new C3651r<>();

    /* renamed from: a */
    public final void mo14928a(Exception exc) {
        C3651r<ResultT> rVar = this.f6722a;
        synchronized (rVar.f6724a) {
            if (!rVar.f6726c) {
                rVar.f6726c = true;
                rVar.f6728e = exc;
                rVar.f6725b.mo14927b(rVar);
            }
        }
    }

    /* renamed from: b */
    public final void mo14929b(ResultT resultt) {
        C3651r<ResultT> rVar = this.f6722a;
        synchronized (rVar.f6724a) {
            if (!rVar.f6726c) {
                rVar.f6726c = true;
                rVar.f6727d = resultt;
                rVar.f6725b.mo14927b(rVar);
            }
        }
    }
}
