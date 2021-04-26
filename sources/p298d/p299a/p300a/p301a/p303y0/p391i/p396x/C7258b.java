package p298d.p299a.p300a.p301a.p303y0.p391i.p396x;

import java.util.Collection;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7624c;
import p298d.p334t.C6798p;

/* renamed from: d.a.a.a.y0.i.x.b */
public final class C7258b implements C7624c<C6023b> {

    /* renamed from: a */
    public final /* synthetic */ boolean f14478a;

    public C7258b(boolean z) {
        this.f14478a = z;
    }

    public Iterable getNeighbors(Object obj) {
        C6023b bVar = (C6023b) obj;
        Collection<? extends C6023b> collection = null;
        if (this.f14478a) {
            bVar = bVar == null ? null : bVar.getOriginal();
        }
        if (bVar != null) {
            collection = bVar.getOverriddenDescriptors();
        }
        return collection == null ? C6798p.f13713g : collection;
    }
}
