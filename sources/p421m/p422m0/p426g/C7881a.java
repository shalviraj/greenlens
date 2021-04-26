package p421m.p422m0.p426g;

import java.io.IOException;
import java.util.Objects;
import p298d.p344x.p346c.C6888i;
import p421m.C7826a0;
import p421m.C7831c0;
import p421m.C7839e0;
import p421m.C7850h0;
import p421m.p422m0.p427h.C7909g;

/* renamed from: m.m0.g.a */
public final class C7881a implements C7826a0 {

    /* renamed from: a */
    public static final C7881a f15654a = new C7881a();

    /* renamed from: a */
    public C7850h0 mo18360a(C7826a0.C7827a aVar) {
        C6888i.m12438e(aVar, "chain");
        C7909g gVar = (C7909g) aVar;
        C7887e eVar = gVar.f15760b;
        Objects.requireNonNull(eVar);
        C6888i.m12438e(gVar, "chain");
        synchronized (eVar) {
            if (!eVar.f15697r) {
                throw new IllegalStateException("released".toString());
            } else if (!(!eVar.f15696q)) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!(!eVar.f15695p)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        C7886d dVar = eVar.f15691l;
        C6888i.m12436c(dVar);
        C7831c0 c0Var = eVar.f15701v;
        C6888i.m12438e(c0Var, "client");
        C6888i.m12438e(gVar, "chain");
        try {
            C7883c cVar = new C7883c(eVar, eVar.f15687h, dVar, dVar.mo25614a(gVar.f15765g, gVar.f15766h, gVar.f15767i, 0, c0Var.f15465l, !C6888i.m12434a(gVar.f15764f.f15529c, "GET")).mo25641k(c0Var, gVar));
            eVar.f15694o = cVar;
            eVar.f15699t = cVar;
            synchronized (eVar) {
                eVar.f15695p = true;
                eVar.f15696q = true;
            }
            if (!eVar.f15698s) {
                return C7909g.m14397b(gVar, 0, cVar, (C7839e0) null, 0, 0, 0, 61).mo25663c(gVar.f15764f);
            }
            throw new IOException("Canceled");
        } catch (C7898l e) {
            dVar.mo25616c(e.f15737g);
            throw e;
        } catch (IOException e2) {
            dVar.mo25616c(e2);
            throw new C7898l(e2);
        }
    }
}
