package p298d.p299a.p300a.p301a.p303y0.p304b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p334t.C6790h;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;
import p298d.p414b0.C7679s;

/* renamed from: d.a.a.a.y0.b.e0 */
public final class C6047e0 implements C6052f0 {

    /* renamed from: a */
    public final Collection<C6032c0> f11888a;

    /* renamed from: d.a.a.a.y0.b.e0$a */
    public static final class C6048a extends C6890k implements C6862l<C6032c0, C6714b> {

        /* renamed from: g */
        public static final C6048a f11889g = new C6048a();

        public C6048a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C6032c0 c0Var = (C6032c0) obj;
            C6888i.m12438e(c0Var, "it");
            return c0Var.getFqName();
        }
    }

    /* renamed from: d.a.a.a.y0.b.e0$b */
    public static final class C6049b extends C6890k implements C6862l<C6714b, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ C6714b f11890g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6049b(C6714b bVar) {
            super(1);
            this.f11890g = bVar;
        }

        public Object invoke(Object obj) {
            C6714b bVar = (C6714b) obj;
            C6888i.m12438e(bVar, "it");
            return Boolean.valueOf(!bVar.mo23864d() && C6888i.m12434a(bVar.mo23865e(), this.f11890g));
        }
    }

    public C6047e0(Collection<? extends C6032c0> collection) {
        C6888i.m12438e(collection, "packageFragments");
        this.f11888a = collection;
    }

    public void collectPackageFragments(C6714b bVar, Collection<C6032c0> collection) {
        C6888i.m12438e(bVar, "fqName");
        C6888i.m12438e(collection, "packageFragments");
        for (T next : this.f11888a) {
            if (C6888i.m12434a(((C6032c0) next).getFqName(), bVar)) {
                collection.add(next);
            }
        }
    }

    public List<C6032c0> getPackageFragments(C6714b bVar) {
        C6888i.m12438e(bVar, "fqName");
        Collection<C6032c0> collection = this.f11888a;
        ArrayList arrayList = new ArrayList();
        for (T next : collection) {
            if (C6888i.m12434a(((C6032c0) next).getFqName(), bVar)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public Collection<C6714b> getSubPackagesOf(C6714b bVar, C6862l<? super C6717d, Boolean> lVar) {
        C6888i.m12438e(bVar, "fqName");
        C6888i.m12438e(lVar, "nameFilter");
        return C7679s.m13901i(C7679s.m13895c(C7679s.m13898f(C6790h.m12346d(this.f11888a), C6048a.f11889g), new C6049b(bVar)));
    }
}
