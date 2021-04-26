package p298d.p299a.p300a.p301a.p303y0.p391i.p398z;

import java.util.Collection;
import java.util.List;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.C6736l;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0;
import p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6257b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7437i;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7639l;
import p298d.p334t.C6790h;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;
import p298d.p344x.p346c.C6896q;
import p298d.p344x.p346c.C6902w;

/* renamed from: d.a.a.a.y0.i.z.k */
public final class C7283k extends C7281i {

    /* renamed from: d */
    public static final /* synthetic */ C6736l<Object>[] f14522d = {C6902w.m12462c(new C6896q(C6902w.m12460a(C7283k.class), "functions", "getFunctions()Ljava/util/List;"))};

    /* renamed from: b */
    public final C6046e f14523b;

    /* renamed from: c */
    public final C7437i f14524c;

    /* renamed from: d.a.a.a.y0.i.z.k$a */
    public static final class C7284a extends C6890k implements C6851a<List<? extends C6232q0>> {

        /* renamed from: g */
        public final /* synthetic */ C7283k f14525g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7284a(C7283k kVar) {
            super(0);
            this.f14525g = kVar;
        }

        public Object invoke() {
            return C6790h.m12314A(C5266a.m10020r0(this.f14525g.f14523b), C5266a.m10026s0(this.f14525g.f14523b));
        }
    }

    public C7283k(C7441m mVar, C6046e eVar) {
        C6888i.m12438e(mVar, "storageManager");
        C6888i.m12438e(eVar, "containingClass");
        this.f14523b = eVar;
        this.f14524c = mVar.mo25018a(new C7284a(this));
    }

    public C6083h getContributedClassifier(C6717d dVar, C6257b bVar) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        return null;
    }

    public Collection getContributedDescriptors(C7268d dVar, C6862l lVar) {
        C6888i.m12438e(dVar, "kindFilter");
        C6888i.m12438e(lVar, "nameFilter");
        return (List) C5266a.m9884T1(this.f14524c, f14522d[0]);
    }

    public Collection getContributedFunctions(C6717d dVar, C6257b bVar) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        C7639l lVar = new C7639l();
        for (Object next : (List) C5266a.m9884T1(this.f14524c, f14522d[0])) {
            if (C6888i.m12434a(((C6232q0) next).getName(), dVar)) {
                lVar.add(next);
            }
        }
        return lVar;
    }
}
