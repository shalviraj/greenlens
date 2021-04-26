package p298d.p299a.p300a.p301a.p303y0.p391i.p398z;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6019a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0;
import p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6257b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7639l;
import p298d.p334t.C6790h;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.i.z.m */
public final class C7287m extends C7263a {

    /* renamed from: c */
    public static final /* synthetic */ int f14531c = 0;

    /* renamed from: b */
    public final C7277h f14532b;

    /* renamed from: d.a.a.a.y0.i.z.m$a */
    public static final class C7288a {
        /* renamed from: a */
        public static final C7277h m13157a(String str, Collection<? extends C7452c0> collection) {
            C6888i.m12438e(str, "message");
            C6888i.m12438e(collection, "types");
            ArrayList arrayList = new ArrayList(C5266a.m9892V(collection, 10));
            for (C7452c0 memberScope : collection) {
                arrayList.add(memberScope.getMemberScope());
            }
            C7639l<C7277h> Z2 = C5266a.m9915Z2(arrayList);
            C7277h b = C7264b.m13146b(str, Z2);
            if (Z2.f15137g <= 1) {
                return b;
            }
            return new C7287m(str, b, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: d.a.a.a.y0.i.z.m$b */
    public static final class C7289b extends C6890k implements C6862l<C6019a, C6019a> {

        /* renamed from: g */
        public static final C7289b f14533g = new C7289b();

        public C7289b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C6019a aVar = (C6019a) obj;
            C6888i.m12438e(aVar, "<this>");
            return aVar;
        }
    }

    /* renamed from: d.a.a.a.y0.i.z.m$c */
    public static final class C7290c extends C6890k implements C6862l<C6232q0, C6019a> {

        /* renamed from: g */
        public static final C7290c f14534g = new C7290c();

        public C7290c() {
            super(1);
        }

        public Object invoke(Object obj) {
            C6232q0 q0Var = (C6232q0) obj;
            C6888i.m12438e(q0Var, "<this>");
            return q0Var;
        }
    }

    /* renamed from: d.a.a.a.y0.i.z.m$d */
    public static final class C7291d extends C6890k implements C6862l<C6207k0, C6019a> {

        /* renamed from: g */
        public static final C7291d f14535g = new C7291d();

        public C7291d() {
            super(1);
        }

        public Object invoke(Object obj) {
            C6207k0 k0Var = (C6207k0) obj;
            C6888i.m12438e(k0Var, "<this>");
            return k0Var;
        }
    }

    public C7287m(String str, C7277h hVar, DefaultConstructorMarker defaultConstructorMarker) {
        this.f14532b = hVar;
    }

    /* renamed from: b */
    public C7277h mo24912b() {
        return this.f14532b;
    }

    public Collection<C6206k> getContributedDescriptors(C7268d dVar, C6862l<? super C6717d, Boolean> lVar) {
        C6888i.m12438e(dVar, "kindFilter");
        C6888i.m12438e(lVar, "nameFilter");
        Collection<C6206k> contributedDescriptors = super.getContributedDescriptors(dVar, lVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T next : contributedDescriptors) {
            if (((C6206k) next) instanceof C6019a) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        return C6790h.m12322I(C5266a.m9876R3(arrayList, C7289b.f14533g), arrayList2);
    }

    public Collection<C6232q0> getContributedFunctions(C6717d dVar, C6257b bVar) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        return C5266a.m9876R3(super.getContributedFunctions(dVar, bVar), C7290c.f14534g);
    }

    public Collection<C6207k0> getContributedVariables(C6717d dVar, C6257b bVar) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        return C5266a.m9876R3(super.getContributedVariables(dVar, bVar), C7291d.f14535g);
    }
}
