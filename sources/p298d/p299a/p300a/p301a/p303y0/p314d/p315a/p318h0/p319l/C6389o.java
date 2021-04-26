package p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p319l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0;
import p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6257b;
import p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6260d;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.C6321c;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.C6328g;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6420g;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7268d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p334t.C6790h;
import p298d.p334t.C6800r;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.d.a.h0.l.o */
public final class C6389o extends C6395s {

    /* renamed from: n */
    public final C6420g f12595n;

    /* renamed from: o */
    public final C6345e f12596o;

    /* renamed from: d.a.a.a.y0.d.a.h0.l.o$a */
    public static final class C6390a extends C6890k implements C6862l<C7277h, Collection<? extends C6207k0>> {

        /* renamed from: g */
        public final /* synthetic */ C6717d f12597g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6390a(C6717d dVar) {
            super(1);
            this.f12597g = dVar;
        }

        public Object invoke(Object obj) {
            C7277h hVar = (C7277h) obj;
            C6888i.m12438e(hVar, "it");
            return hVar.getContributedVariables(this.f12597g, C6260d.WHEN_GET_SUPER_MEMBERS);
        }
    }

    /* renamed from: d.a.a.a.y0.d.a.h0.l.o$b */
    public static final class C6391b extends C6890k implements C6862l<C7277h, Collection<? extends C6717d>> {

        /* renamed from: g */
        public static final C6391b f12598g = new C6391b();

        public C6391b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C7277h hVar = (C7277h) obj;
            C6888i.m12438e(hVar, "it");
            return hVar.getVariableNames();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6389o(C6328g gVar, C6420g gVar2, C6345e eVar) {
        super(gVar);
        C6888i.m12438e(gVar, "c");
        C6888i.m12438e(gVar2, "jClass");
        C6888i.m12438e(eVar, "ownerDescriptor");
        this.f12595n = gVar2;
        this.f12596o = eVar;
    }

    /* renamed from: a */
    public Set<C6717d> mo23495a(C7268d dVar, C6862l<? super C6717d, Boolean> lVar) {
        C6888i.m12438e(dVar, "kindFilter");
        return C6800r.f13715g;
    }

    /* renamed from: b */
    public Set<C6717d> mo23496b(C7268d dVar, C6862l<? super C6717d, Boolean> lVar) {
        C6888i.m12438e(dVar, "kindFilter");
        Set<C6717d> d0 = C6790h.m12347d0(((C6337b) this.f12565e.invoke()).mo23474b());
        C6389o J1 = C5266a.m9826J1(this.f12596o);
        Collection functionNames = J1 == null ? null : J1.getFunctionNames();
        if (functionNames == null) {
            functionNames = C6800r.f13715g;
        }
        d0.addAll(functionNames);
        if (this.f12595n.mo23396n()) {
            d0.addAll(C6790h.m12314A(StandardNames.ENUM_VALUE_OF, StandardNames.ENUM_VALUES));
        }
        return d0;
    }

    /* renamed from: d */
    public C6337b mo23498d() {
        return new C6335a(this.f12595n, C6388n.f12594g);
    }

    /* renamed from: f */
    public void mo23499f(Collection<C6232q0> collection, C6717d dVar) {
        C6232q0 q0Var;
        String str;
        C6888i.m12438e(collection, "result");
        C6888i.m12438e(dVar, "name");
        C6389o J1 = C5266a.m9826J1(this.f12596o);
        Set<T> e0 = J1 == null ? C6800r.f13715g : C6790h.m12349e0(J1.getContributedFunctions(dVar, C6260d.WHEN_GET_SUPER_MEMBERS));
        C6345e eVar = this.f12596o;
        C6321c cVar = this.f12562b.f12460a;
        Collection<D> K3 = C5266a.m9834K3(dVar, e0, collection, eVar, cVar.f12433f, cVar.f12448u.mo25143a());
        C6888i.m12437d(K3, "resolveOverridesForStaticMembers(\n            name,\n            functionsFromSupertypes,\n            result,\n            ownerDescriptor,\n            c.components.errorReporter,\n            c.components.kotlinTypeChecker.overridingUtil\n        )");
        collection.addAll(K3);
        if (this.f12595n.mo23396n()) {
            if (C6888i.m12434a(dVar, StandardNames.ENUM_VALUE_OF)) {
                q0Var = C5266a.m10020r0(this.f12596o);
                str = "createEnumValueOfMethod(ownerDescriptor)";
            } else if (C6888i.m12434a(dVar, StandardNames.ENUM_VALUES)) {
                q0Var = C5266a.m10026s0(this.f12596o);
                str = "createEnumValuesMethod(ownerDescriptor)";
            } else {
                return;
            }
            C6888i.m12437d(q0Var, str);
            collection.add(q0Var);
        }
    }

    /* renamed from: g */
    public void mo23500g(C6717d dVar, Collection<C6207k0> collection) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(collection, "result");
        C6345e eVar = this.f12596o;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C5266a.m9807G0(C5266a.m9910Y2(eVar), C6393q.f12600a, new C6394r(eVar, linkedHashSet, new C6390a(dVar)));
        if (!collection.isEmpty()) {
            C6345e eVar2 = this.f12596o;
            C6321c cVar = this.f12562b.f12460a;
            Collection<D> K3 = C5266a.m9834K3(dVar, linkedHashSet, collection, eVar2, cVar.f12433f, cVar.f12448u.mo25143a());
            C6888i.m12437d(K3, "resolveOverridesForStaticMembers(\n                    name,\n                    propertiesFromSupertypes,\n                    result,\n                    ownerDescriptor,\n                    c.components.errorReporter,\n                    c.components.kotlinTypeChecker.overridingUtil\n                )");
            collection.addAll(K3);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : linkedHashSet) {
            C6207k0 o = mo23527o((C6207k0) next);
            Object obj = linkedHashMap.get(o);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(o, obj);
            }
            ((List) obj).add(next);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry value : linkedHashMap.entrySet()) {
            C6345e eVar3 = this.f12596o;
            C6321c cVar2 = this.f12562b.f12460a;
            Collection<D> K32 = C5266a.m9834K3(dVar, (Collection) value.getValue(), collection, eVar3, cVar2.f12433f, cVar2.f12448u.mo25143a());
            C6888i.m12437d(K32, "resolveOverridesForStaticMembers(\n                    name, it.value, result, ownerDescriptor, c.components.errorReporter,\n                    c.components.kotlinTypeChecker.overridingUtil\n                )");
            C6790h.m12342b(arrayList, K32);
        }
        collection.addAll(arrayList);
    }

    public C6083h getContributedClassifier(C6717d dVar, C6257b bVar) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        return null;
    }

    /* renamed from: h */
    public Set<C6717d> mo23501h(C7268d dVar, C6862l<? super C6717d, Boolean> lVar) {
        C6888i.m12438e(dVar, "kindFilter");
        Set<C6717d> d0 = C6790h.m12347d0(((C6337b) this.f12565e.invoke()).mo23477e());
        C6345e eVar = this.f12596o;
        C5266a.m9807G0(C5266a.m9910Y2(eVar), C6393q.f12600a, new C6394r(eVar, d0, C6391b.f12598g));
        return d0;
    }

    /* renamed from: j */
    public C6206k mo23503j() {
        return this.f12596o;
    }

    /* renamed from: o */
    public final C6207k0 mo23527o(C6207k0 k0Var) {
        if (k0Var.getKind().mo23098d()) {
            return k0Var;
        }
        Collection<? extends C6207k0> overriddenDescriptors = k0Var.getOverriddenDescriptors();
        C6888i.m12437d(overriddenDescriptors, "this.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C5266a.m9892V(overriddenDescriptors, 10));
        for (C6207k0 k0Var2 : overriddenDescriptors) {
            C6888i.m12437d(k0Var2, "it");
            arrayList.add(mo23527o(k0Var2));
        }
        return (C6207k0) C6790h.m12329P(C6790h.m12356j(arrayList));
    }
}
