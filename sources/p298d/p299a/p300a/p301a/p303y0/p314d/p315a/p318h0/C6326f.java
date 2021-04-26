package p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0;

import java.util.Collection;
import java.util.List;
import p005b.p291q.p292a.C5266a;
import p298d.C6761c;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6032c0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6052f0;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.C6333k;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p319l.C6362i;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6433t;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7413a;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7417e;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.d.a.h0.f */
public final class C6326f implements C6052f0 {

    /* renamed from: a */
    public final C6328g f12456a;

    /* renamed from: b */
    public final C7413a<C6714b, C6362i> f12457b;

    /* renamed from: d.a.a.a.y0.d.a.h0.f$a */
    public static final class C6327a extends C6890k implements C6851a<C6362i> {

        /* renamed from: g */
        public final /* synthetic */ C6326f f12458g;

        /* renamed from: h */
        public final /* synthetic */ C6433t f12459h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6327a(C6326f fVar, C6433t tVar) {
            super(0);
            this.f12458g = fVar;
            this.f12459h = tVar;
        }

        public Object invoke() {
            return new C6362i(this.f12458g.f12456a, this.f12459h);
        }
    }

    public C6326f(C6321c cVar) {
        C6888i.m12438e(cVar, "components");
        C6328g gVar = new C6328g(cVar, C6333k.C6334a.f12472a, new C6761c(null));
        this.f12456a = gVar;
        this.f12457b = gVar.f12460a.f12428a.mo25023f();
    }

    /* renamed from: a */
    public final C6362i mo23469a(C6714b bVar) {
        C6433t a = this.f12456a.f12460a.f12429b.mo23319a(bVar);
        if (a == null) {
            return null;
        }
        return (C6362i) ((C7417e.C7421d) this.f12457b).mo25030e(bVar, new C6327a(this, a));
    }

    public void collectPackageFragments(C6714b bVar, Collection<C6032c0> collection) {
        C6888i.m12438e(bVar, "fqName");
        C6888i.m12438e(collection, "packageFragments");
        C5266a.m10001o(collection, mo23469a(bVar));
    }

    public List<C6362i> getPackageFragments(C6714b bVar) {
        C6888i.m12438e(bVar, "fqName");
        return C6790h.m12315B(mo23469a(bVar));
    }

    public Collection getSubPackagesOf(C6714b bVar, C6862l lVar) {
        List list;
        C6888i.m12438e(bVar, "fqName");
        C6888i.m12438e(lVar, "nameFilter");
        C6362i a = mo23469a(bVar);
        if (a == null) {
            list = null;
        } else {
            list = (List) a.f12543k.invoke();
        }
        return list != null ? list : C6798p.f13713g;
    }
}
