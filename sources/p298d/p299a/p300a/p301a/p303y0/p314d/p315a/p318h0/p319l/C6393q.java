package p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p319l;

import java.util.Collection;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7624c;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;
import p298d.p414b0.C7668h;
import p298d.p414b0.C7677q;
import p298d.p414b0.C7679s;

/* renamed from: d.a.a.a.y0.d.a.h0.l.q */
public final class C6393q implements C7624c<C6046e> {

    /* renamed from: a */
    public static final C6393q f12600a = new C6393q();

    public Iterable getNeighbors(Object obj) {
        Collection<C7452c0> supertypes = ((C6046e) obj).getTypeConstructor().getSupertypes();
        C6888i.m12437d(supertypes, "it.typeConstructor.supertypes");
        C7668h<R> g = C7679s.m13899g(C6790h.m12346d(supertypes), C6392p.f12599g);
        C6888i.m12438e(g, "$this$asIterable");
        return new C7677q(g);
    }
}
