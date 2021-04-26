package p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p319l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.C6736l;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6152i;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0;
import p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6257b;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.C6328g;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6420g;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6433t;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6552l;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7437i;
import p298d.p334t.C6790h;
import p298d.p334t.C6800r;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;
import p298d.p344x.p346c.C6896q;
import p298d.p344x.p346c.C6902w;

/* renamed from: d.a.a.a.y0.d.a.h0.l.c */
public final class C6339c implements C7277h {

    /* renamed from: f */
    public static final /* synthetic */ C6736l<Object>[] f12481f = {C6902w.m12462c(new C6896q(C6902w.m12460a(C6339c.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: b */
    public final C6328g f12482b;

    /* renamed from: c */
    public final C6362i f12483c;

    /* renamed from: d */
    public final C6366j f12484d;

    /* renamed from: e */
    public final C7437i f12485e;

    /* renamed from: d.a.a.a.y0.d.a.h0.l.c$a */
    public static final class C6340a extends C6890k implements C6851a<C7277h[]> {

        /* renamed from: g */
        public final /* synthetic */ C6339c f12486g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6340a(C6339c cVar) {
            super(0);
            this.f12486g = cVar;
        }

        public Object invoke() {
            Collection<C6552l> values = this.f12486g.f12483c.mo23517x().values();
            C6339c cVar = this.f12486g;
            ArrayList arrayList = new ArrayList();
            for (C6552l a : values) {
                C7277h a2 = cVar.f12482b.f12460a.f12431d.mo23634a(cVar.f12483c, a);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            Object[] array = C5266a.m9915Z2(arrayList).toArray(new C7277h[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return (C7277h[]) array;
        }
    }

    public C6339c(C6328g gVar, C6433t tVar, C6362i iVar) {
        C6888i.m12438e(gVar, "c");
        C6888i.m12438e(tVar, "jPackage");
        C6888i.m12438e(iVar, "packageFragment");
        this.f12482b = gVar;
        this.f12483c = iVar;
        this.f12484d = new C6366j(gVar, tVar, iVar);
        this.f12485e = gVar.f12460a.f12428a.mo25018a(new C6340a(this));
    }

    /* renamed from: a */
    public final C7277h[] mo23479a() {
        return (C7277h[]) C5266a.m9884T1(this.f12485e, f12481f[0]);
    }

    public Set<C6717d> getClassifierNames() {
        Set<C6717d> T0 = C5266a.m9883T0(C5266a.m10067z(mo23479a()));
        if (T0 == null) {
            return null;
        }
        T0.addAll(this.f12484d.getClassifierNames());
        return T0;
    }

    public C6083h getContributedClassifier(C6717d dVar, C6257b bVar) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        recordLookup(dVar, bVar);
        C6366j jVar = this.f12484d;
        Objects.requireNonNull(jVar);
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        C6083h hVar = null;
        C6046e o = jVar.mo23518o(dVar, (C6420g) null);
        if (o != null) {
            return o;
        }
        C7277h[] a = mo23479a();
        int i = 0;
        int length = a.length;
        while (i < length) {
            C7277h hVar2 = a[i];
            i++;
            C6083h contributedClassifier = hVar2.getContributedClassifier(dVar, bVar);
            if (contributedClassifier != null) {
                if (!(contributedClassifier instanceof C6152i) || !((C6152i) contributedClassifier).isExpect()) {
                    return contributedClassifier;
                }
                if (hVar == null) {
                    hVar = contributedClassifier;
                }
            }
        }
        return hVar;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [d.x.b.l<? super d.a.a.a.y0.f.d, java.lang.Boolean>, java.lang.Object, d.x.b.l] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<p298d.p299a.p300a.p301a.p303y0.p304b.C6206k> getContributedDescriptors(p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7268d r6, p298d.p344x.p345b.C6862l<? super p298d.p299a.p300a.p301a.p303y0.p331f.C6717d, java.lang.Boolean> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "kindFilter"
            p298d.p344x.p346c.C6888i.m12438e(r6, r0)
            java.lang.String r0 = "nameFilter"
            p298d.p344x.p346c.C6888i.m12438e(r7, r0)
            d.a.a.a.y0.d.a.h0.l.j r0 = r5.f12484d
            d.a.a.a.y0.i.z.h[] r1 = r5.mo23479a()
            java.util.Collection r0 = r0.getContributedDescriptors(r6, r7)
            int r2 = r1.length
            r3 = 0
        L_0x0016:
            if (r3 >= r2) goto L_0x0025
            r4 = r1[r3]
            int r3 = r3 + 1
            java.util.Collection r4 = r4.getContributedDescriptors(r6, r7)
            java.util.Collection r0 = p005b.p291q.p292a.C5266a.m9936d0(r0, r4)
            goto L_0x0016
        L_0x0025:
            if (r0 != 0) goto L_0x0029
            d.t.r r0 = p298d.p334t.C6800r.f13715g
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p319l.C6339c.getContributedDescriptors(d.a.a.a.y0.i.z.d, d.x.b.l):java.util.Collection");
    }

    public Collection<C6232q0> getContributedFunctions(C6717d dVar, C6257b bVar) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        recordLookup(dVar, bVar);
        C6366j jVar = this.f12484d;
        C7277h[] a = mo23479a();
        Collection contributedFunctions = jVar.getContributedFunctions(dVar, bVar);
        int length = a.length;
        int i = 0;
        while (i < length) {
            C7277h hVar = a[i];
            i++;
            contributedFunctions = C5266a.m9936d0(contributedFunctions, hVar.getContributedFunctions(dVar, bVar));
        }
        return contributedFunctions == null ? C6800r.f13715g : contributedFunctions;
    }

    public Collection<C6207k0> getContributedVariables(C6717d dVar, C6257b bVar) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        recordLookup(dVar, bVar);
        C6366j jVar = this.f12484d;
        C7277h[] a = mo23479a();
        Collection contributedVariables = jVar.getContributedVariables(dVar, bVar);
        int length = a.length;
        int i = 0;
        while (i < length) {
            C7277h hVar = a[i];
            i++;
            contributedVariables = C5266a.m9936d0(contributedVariables, hVar.getContributedVariables(dVar, bVar));
        }
        return contributedVariables == null ? C6800r.f13715g : contributedVariables;
    }

    public Set<C6717d> getFunctionNames() {
        C7277h[] a = mo23479a();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C7277h functionNames : a) {
            C6790h.m12342b(linkedHashSet, functionNames.getFunctionNames());
        }
        linkedHashSet.addAll(this.f12484d.getFunctionNames());
        return linkedHashSet;
    }

    public Set<C6717d> getVariableNames() {
        C7277h[] a = mo23479a();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C7277h variableNames : a) {
            C6790h.m12342b(linkedHashSet, variableNames.getVariableNames());
        }
        linkedHashSet.addAll(this.f12484d.getVariableNames());
        return linkedHashSet;
    }

    public void recordLookup(C6717d dVar, C6257b bVar) {
        C6888i.m12438e(dVar, "name");
        C6888i.m12438e(bVar, "location");
        C5266a.m10041u3(this.f12482b.f12460a.f12441n, bVar, this.f12483c, dVar);
    }
}
