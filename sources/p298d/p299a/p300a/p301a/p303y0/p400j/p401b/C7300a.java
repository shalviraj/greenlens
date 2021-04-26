package p298d.p299a.p300a.p301a.p303y0.p400j.p401b;

import java.util.Collection;
import java.util.List;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6032c0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6052f0;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7436h;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p334t.C6790h;
import p298d.p334t.C6800r;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.j.b.a */
public abstract class C7300a implements C6052f0 {
    public C7382j components;
    private final C7396s finder;
    private final C7436h<C6714b, C6032c0> fragments;
    private final C6021a0 moduleDescriptor;
    private final C7441m storageManager;

    /* renamed from: d.a.a.a.y0.j.b.a$a */
    public static final class C7301a extends C6890k implements C6862l<C6714b, C6032c0> {

        /* renamed from: g */
        public final /* synthetic */ C7300a f14553g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7301a(C7300a aVar) {
            super(1);
            this.f14553g = aVar;
        }

        public Object invoke(Object obj) {
            C6714b bVar = (C6714b) obj;
            C6888i.m12438e(bVar, "fqName");
            C7387n findPackage = this.f14553g.findPackage(bVar);
            if (findPackage == null) {
                return null;
            }
            findPackage.mo24995z(this.f14553g.getComponents());
            return findPackage;
        }
    }

    public C7300a(C7441m mVar, C7396s sVar, C6021a0 a0Var) {
        C6888i.m12438e(mVar, "storageManager");
        C6888i.m12438e(sVar, "finder");
        C6888i.m12438e(a0Var, "moduleDescriptor");
        this.storageManager = mVar;
        this.finder = sVar;
        this.moduleDescriptor = a0Var;
        this.fragments = mVar.mo25026i(new C7301a(this));
    }

    public void collectPackageFragments(C6714b bVar, Collection<C6032c0> collection) {
        C6888i.m12438e(bVar, "fqName");
        C6888i.m12438e(collection, "packageFragments");
        C5266a.m10001o(collection, this.fragments.invoke(bVar));
    }

    public abstract C7387n findPackage(C6714b bVar);

    public final C7382j getComponents() {
        C7382j jVar = this.components;
        if (jVar != null) {
            return jVar;
        }
        C6888i.m12446m("components");
        throw null;
    }

    public final C7396s getFinder() {
        return this.finder;
    }

    public final C6021a0 getModuleDescriptor() {
        return this.moduleDescriptor;
    }

    public List<C6032c0> getPackageFragments(C6714b bVar) {
        C6888i.m12438e(bVar, "fqName");
        return C6790h.m12315B(this.fragments.invoke(bVar));
    }

    public final C7441m getStorageManager() {
        return this.storageManager;
    }

    public Collection<C6714b> getSubPackagesOf(C6714b bVar, C6862l<? super C6717d, Boolean> lVar) {
        C6888i.m12438e(bVar, "fqName");
        C6888i.m12438e(lVar, "nameFilter");
        return C6800r.f13715g;
    }

    public final void setComponents(C7382j jVar) {
        C6888i.m12438e(jVar, "<set-?>");
        this.components = jVar;
    }
}
