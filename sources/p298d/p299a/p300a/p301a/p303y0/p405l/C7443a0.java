package p298d.p299a.p300a.p301a.p303y0.p405l;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7287m;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e;
import p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7533g;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.l.a0 */
public final class C7443a0 implements C7567t0, C7533g {

    /* renamed from: a */
    public C7452c0 f14858a;

    /* renamed from: b */
    public final LinkedHashSet<C7452c0> f14859b;

    /* renamed from: c */
    public final int f14860c;

    /* renamed from: d.a.a.a.y0.l.a0$a */
    public static final class C7444a extends C6890k implements C6862l<C7495e, C7489j0> {

        /* renamed from: g */
        public final /* synthetic */ C7443a0 f14861g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7444a(C7443a0 a0Var) {
            super(1);
            this.f14861g = a0Var;
        }

        public Object invoke(Object obj) {
            C7495e eVar = (C7495e) obj;
            C6888i.m12438e(eVar, "kotlinTypeRefiner");
            return this.f14861g.refine(eVar).mo25041b();
        }
    }

    public C7443a0(Collection<? extends C7452c0> collection) {
        C6888i.m12438e(collection, "typesToIntersect");
        collection.isEmpty();
        LinkedHashSet<C7452c0> linkedHashSet = new LinkedHashSet<>(collection);
        this.f14859b = linkedHashSet;
        this.f14860c = linkedHashSet.hashCode();
    }

    /* renamed from: b */
    public final C7489j0 mo25041b() {
        C7455d0 d0Var = C7455d0.f14869a;
        Objects.requireNonNull(C6060h.f11920d);
        return C7455d0.m13434i(C6060h.C6061a.f11922b, this, C6798p.f13713g, false, C7287m.C7288a.m13157a("member scope for intersection type", this.f14859b), new C7444a(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: d.a.a.a.y0.l.a0} */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v6, types: [d.a.a.a.y0.l.c0] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p298d.p299a.p300a.p301a.p303y0.p405l.C7443a0 refine(p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e r5) {
        /*
            r4 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            p298d.p344x.p346c.C6888i.m12438e(r5, r0)
            java.util.LinkedHashSet<d.a.a.a.y0.l.c0> r0 = r4.f14859b
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = p005b.p291q.p292a.C5266a.m9892V(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L_0x0017:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            d.a.a.a.y0.l.c0 r2 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0) r2
            d.a.a.a.y0.l.c0 r2 = r2.mo23544X(r5)
            r3 = 1
            r1.add(r2)
            r2 = r3
            goto L_0x0017
        L_0x002d:
            r0 = 0
            if (r2 != 0) goto L_0x0031
            goto L_0x0052
        L_0x0031:
            d.a.a.a.y0.l.c0 r2 = r4.f14858a
            if (r2 != 0) goto L_0x0036
            goto L_0x003a
        L_0x0036:
            d.a.a.a.y0.l.c0 r0 = r2.mo23544X(r5)
        L_0x003a:
            java.lang.String r5 = "typesToIntersect"
            p298d.p344x.p346c.C6888i.m12438e(r1, r5)
            r1.isEmpty()
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>(r1)
            r5.hashCode()
            d.a.a.a.y0.l.a0 r1 = new d.a.a.a.y0.l.a0
            r1.<init>(r5)
            r1.f14858a = r0
            r0 = r1
        L_0x0052:
            if (r0 != 0) goto L_0x0055
            r0 = r4
        L_0x0055:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p405l.C7443a0.refine(d.a.a.a.y0.l.j1.e):d.a.a.a.y0.l.a0");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7443a0)) {
            return false;
        }
        return C6888i.m12434a(this.f14859b, ((C7443a0) obj).f14859b);
    }

    public KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns builtIns = ((C7452c0) this.f14859b.iterator().next()).mo24887V().getBuiltIns();
        C6888i.m12437d(builtIns, "intersectedTypes.iterator().next().constructor.builtIns");
        return builtIns;
    }

    public C6083h getDeclarationDescriptor() {
        return null;
    }

    public List<C6248w0> getParameters() {
        return C6798p.f13713g;
    }

    public Collection<C7452c0> getSupertypes() {
        return this.f14859b;
    }

    public int hashCode() {
        return this.f14860c;
    }

    public boolean isDenotable() {
        return false;
    }

    public String toString() {
        List<T> c;
        LinkedHashSet<C7452c0> linkedHashSet = this.f14859b;
        C7447b0 b0Var = new C7447b0();
        C6888i.m12438e(linkedHashSet, "$this$sortedWith");
        C6888i.m12438e(b0Var, "comparator");
        if (linkedHashSet.size() <= 1) {
            c = C6790h.m12337X(linkedHashSet);
        } else {
            Object[] array = linkedHashSet.toArray(new Object[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            C6888i.m12438e(array, "$this$sortWith");
            C6888i.m12438e(b0Var, "comparator");
            if (array.length > 1) {
                Arrays.sort(array, b0Var);
            }
            c = C6790h.m12344c(array);
        }
        return C6790h.m12369w(c, " & ", "{", "}", 0, (CharSequence) null, (C6862l) null, 56);
    }
}
