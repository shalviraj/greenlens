package p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p319l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6420g;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6427n;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6429p;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6430q;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6432s;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6435v;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;
import p298d.p414b0.C7662e;
import p298d.p414b0.C7668h;
import p298d.p414b0.C7679s;

/* renamed from: d.a.a.a.y0.d.a.h0.l.a */
public class C6335a implements C6337b {

    /* renamed from: a */
    public final C6420g f12473a;

    /* renamed from: b */
    public final C6862l<C6429p, Boolean> f12474b;

    /* renamed from: c */
    public final C6862l<C6430q, Boolean> f12475c;

    /* renamed from: d */
    public final Map<C6717d, List<C6430q>> f12476d;

    /* renamed from: e */
    public final Map<C6717d, C6427n> f12477e;

    /* renamed from: f */
    public final Map<C6717d, C6435v> f12478f;

    /* renamed from: d.a.a.a.y0.d.a.h0.l.a$a */
    public static final class C6336a extends C6890k implements C6862l<C6430q, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ C6335a f12479g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6336a(C6335a aVar) {
            super(1);
            this.f12479g = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x004a, code lost:
            if (r0.equals("hashCode") == false) goto L_0x0099;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0097, code lost:
            if (r0.equals("toString") == false) goto L_0x0099;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
            r6 = r6.getValueParameters().isEmpty();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a8, code lost:
            if (r6 != false) goto L_0x00ab;
         */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r6) {
            /*
                r5 = this;
                d.a.a.a.y0.d.a.j0.q r6 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6430q) r6
                java.lang.String r0 = "m"
                p298d.p344x.p346c.C6888i.m12438e(r6, r0)
                d.a.a.a.y0.d.a.h0.l.a r0 = r5.f12479g
                d.x.b.l<d.a.a.a.y0.d.a.j0.p, java.lang.Boolean> r0 = r0.f12474b
                java.lang.Object r0 = r0.invoke(r6)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x00ab
                java.lang.String r0 = "<this>"
                p298d.p344x.p346c.C6888i.m12438e(r6, r0)
                d.a.a.a.y0.d.a.j0.g r0 = r6.mo23416K()
                boolean r0 = r0.mo23378A()
                if (r0 == 0) goto L_0x00a7
                d.a.a.a.y0.f.d r0 = r6.getName()
                java.lang.String r0 = r0.mo23886e()
                int r3 = r0.hashCode()
                r4 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
                if (r3 == r4) goto L_0x0091
                r4 = -1295482945(0xffffffffb2c87fbf, float:-2.3341157E-8)
                if (r3 == r4) goto L_0x004d
                r4 = 147696667(0x8cdac1b, float:1.23784505E-33)
                if (r3 == r4) goto L_0x0044
                goto L_0x0099
            L_0x0044:
                java.lang.String r3 = "hashCode"
                boolean r0 = r0.equals(r3)
                if (r0 != 0) goto L_0x009b
                goto L_0x0099
            L_0x004d:
                java.lang.String r3 = "equals"
                boolean r0 = r0.equals(r3)
                if (r0 != 0) goto L_0x0056
                goto L_0x0099
            L_0x0056:
                java.util.List r6 = r6.getValueParameters()
                java.lang.Object r6 = p298d.p334t.C6790h.m12331R(r6)
                d.a.a.a.y0.d.a.j0.z r6 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6439z) r6
                r0 = 0
                if (r6 != 0) goto L_0x0065
                r6 = r0
                goto L_0x0069
            L_0x0065:
                d.a.a.a.y0.d.a.j0.w r6 = r6.mo23370a()
            L_0x0069:
                boolean r3 = r6 instanceof p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6423j
                if (r3 == 0) goto L_0x0070
                r0 = r6
                d.a.a.a.y0.d.a.j0.j r0 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6423j) r0
            L_0x0070:
                if (r0 != 0) goto L_0x0073
                goto L_0x0099
            L_0x0073:
                d.a.a.a.y0.d.a.j0.i r6 = r0.mo23405h()
                boolean r0 = r6 instanceof p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6420g
                if (r0 == 0) goto L_0x0099
                d.a.a.a.y0.d.a.j0.g r6 = (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6420g) r6
                d.a.a.a.y0.f.b r6 = r6.getFqName()
                if (r6 == 0) goto L_0x0099
                java.lang.String r6 = r6.mo23862b()
                java.lang.String r0 = "java.lang.Object"
                boolean r6 = p298d.p344x.p346c.C6888i.m12434a(r6, r0)
                if (r6 == 0) goto L_0x0099
                r6 = r1
                goto L_0x00a3
            L_0x0091:
                java.lang.String r3 = "toString"
                boolean r0 = r0.equals(r3)
                if (r0 != 0) goto L_0x009b
            L_0x0099:
                r6 = r2
                goto L_0x00a3
            L_0x009b:
                java.util.List r6 = r6.getValueParameters()
                boolean r6 = r6.isEmpty()
            L_0x00a3:
                if (r6 == 0) goto L_0x00a7
                r6 = r1
                goto L_0x00a8
            L_0x00a7:
                r6 = r2
            L_0x00a8:
                if (r6 != 0) goto L_0x00ab
                goto L_0x00ac
            L_0x00ab:
                r1 = r2
            L_0x00ac:
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p319l.C6335a.C6336a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public C6335a(C6420g gVar, C6862l<? super C6429p, Boolean> lVar) {
        C6888i.m12438e(gVar, "jClass");
        C6888i.m12438e(lVar, "memberFilter");
        this.f12473a = gVar;
        this.f12474b = lVar;
        C6336a aVar = new C6336a(this);
        this.f12475c = aVar;
        C7668h<T> c = C7679s.m13895c(C6790h.m12346d(gVar.mo23382G()), aVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C7662e.C7663a aVar2 = new C7662e.C7663a((C7662e) c);
        while (aVar2.hasNext()) {
            Object next = aVar2.next();
            C6717d name = ((C6430q) next).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next);
        }
        this.f12476d = linkedHashMap;
        C7668h<T> c2 = C7679s.m13895c(C6790h.m12346d(this.f12473a.mo23398s()), this.f12474b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C7662e.C7663a aVar3 = new C7662e.C7663a((C7662e) c2);
        while (aVar3.hasNext()) {
            Object next2 = aVar3.next();
            linkedHashMap2.put(((C6427n) next2).getName(), next2);
        }
        this.f12477e = linkedHashMap2;
        Collection<C6435v> p = this.f12473a.mo23397p();
        C6862l<C6429p, Boolean> lVar2 = this.f12474b;
        ArrayList arrayList = new ArrayList();
        for (T next3 : p) {
            if (lVar2.invoke(next3).booleanValue()) {
                arrayList.add(next3);
            }
        }
        int g3 = C5266a.m9957g3(C5266a.m9892V(arrayList, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(g3 < 16 ? 16 : g3);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next4 = it.next();
            linkedHashMap3.put(((C6435v) next4).getName(), next4);
        }
        this.f12478f = linkedHashMap3;
    }

    /* renamed from: a */
    public C6435v mo23473a(C6717d dVar) {
        C6888i.m12438e(dVar, "name");
        return this.f12478f.get(dVar);
    }

    /* renamed from: b */
    public Set<C6717d> mo23474b() {
        C7668h<T> c = C7679s.m13895c(C6790h.m12346d(this.f12473a.mo23382G()), this.f12475c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C7662e.C7663a aVar = new C7662e.C7663a((C7662e) c);
        while (aVar.hasNext()) {
            linkedHashSet.add(((C6432s) aVar.next()).getName());
        }
        return linkedHashSet;
    }

    /* renamed from: c */
    public C6427n mo23475c(C6717d dVar) {
        C6888i.m12438e(dVar, "name");
        return this.f12477e.get(dVar);
    }

    /* renamed from: d */
    public Set<C6717d> mo23476d() {
        return this.f12478f.keySet();
    }

    /* renamed from: e */
    public Set<C6717d> mo23477e() {
        C7668h<T> c = C7679s.m13895c(C6790h.m12346d(this.f12473a.mo23398s()), this.f12474b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C7662e.C7663a aVar = new C7662e.C7663a((C7662e) c);
        while (aVar.hasNext()) {
            linkedHashSet.add(((C6432s) aVar.next()).getName());
        }
        return linkedHashSet;
    }

    /* renamed from: f */
    public Collection<C6430q> mo23478f(C6717d dVar) {
        C6888i.m12438e(dVar, "name");
        List list = this.f12476d.get(dVar);
        return list == null ? C6798p.f13713g : list;
    }
}
