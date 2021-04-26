package p005b.p096l.p097a.p151d.p152a.p159e;

import p005b.p096l.p097a.p151d.p152a.p163i.C3647n;

/* renamed from: b.l.a.d.a.e.i */
public final class C3590i extends C3586g {

    /* renamed from: h */
    public final /* synthetic */ C3586g f6653h;

    /* renamed from: i */
    public final /* synthetic */ C3604p f6654i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3590i(C3604p pVar, C3647n nVar, C3586g gVar) {
        super(nVar);
        this.f6654i = pVar;
        this.f6653h = gVar;
    }

    /* renamed from: a */
    public final void mo14738a() {
        C3604p pVar = this.f6654i;
        C3586g gVar = this.f6653h;
        if (pVar.f6673k == null && !pVar.f6667e) {
            pVar.f6664b.mo14884b(4, "Initiate binding to the service.", new Object[0]);
            pVar.f6666d.add(gVar);
            C3602o oVar = new C3602o(pVar);
            pVar.f6672j = oVar;
            pVar.f6667e = true;
            if (!pVar.f6663a.bindService(pVar.f6668f, oVar, 1)) {
                pVar.f6664b.mo14884b(4, "Failed to bind to the service.", new Object[0]);
                pVar.f6667e = false;
                for (C3586g gVar2 : pVar.f6666d) {
                    C3606q qVar = new C3606q();
                    C3647n<?> nVar = gVar2.f6649g;
                    if (nVar != null) {
                        nVar.mo14928a(qVar);
                    }
                }
                pVar.f6666d.clear();
            }
        } else if (pVar.f6667e) {
            pVar.f6664b.mo14884b(4, "Waiting to bind to the service.", new Object[0]);
            pVar.f6666d.add(gVar);
        } else {
            gVar.run();
        }
    }
}
