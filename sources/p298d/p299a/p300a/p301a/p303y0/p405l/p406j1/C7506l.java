package p298d.p299a.p300a.p301a.p303y0.p405l.p406j1;

import p005b.p291q.p292a.C5266a;
import p298d.C6766h;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7201m;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7455d0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7462e;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7481g1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7579w;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.l.j1.l */
public final class C7506l implements C7504k {

    /* renamed from: c */
    public final C7495e f14948c;

    /* renamed from: d */
    public final C7201m f14949d;

    public C7506l(C7495e eVar) {
        C6888i.m12438e(eVar, "kotlinTypeRefiner");
        this.f14948c = eVar;
        if (eVar != null) {
            C7201m mVar = new C7201m(C7201m.f14432e, eVar);
            C6888i.m12437d(mVar, "createWithTypeRefiner(kotlinTypeRefiner)");
            this.f14949d = mVar;
            return;
        }
        C7201m.m13062a(1);
        throw null;
    }

    /* renamed from: a */
    public C7201m mo25143a() {
        return this.f14949d;
    }

    /* renamed from: b */
    public boolean mo25127b(C7452c0 c0Var, C7452c0 c0Var2) {
        C6888i.m12438e(c0Var, "a");
        C6888i.m12438e(c0Var2, "b");
        return mo25145e(new C7491b(false, false, false, this.f14948c, 6), c0Var.mo25056Y(), c0Var2.mo25056Y());
    }

    /* renamed from: c */
    public C7495e mo25144c() {
        return this.f14948c;
    }

    /* renamed from: d */
    public boolean mo25128d(C7452c0 c0Var, C7452c0 c0Var2) {
        C6888i.m12438e(c0Var, "subtype");
        C6888i.m12438e(c0Var2, "supertype");
        return mo25146f(new C7491b(true, false, false, this.f14948c, 6), c0Var.mo25056Y(), c0Var2.mo25056Y());
    }

    /* renamed from: e */
    public final boolean mo25145e(C7491b bVar, C7481g1 g1Var, C7481g1 g1Var2) {
        C6888i.m12438e(bVar, "<this>");
        C6888i.m12438e(g1Var, "a");
        C6888i.m12438e(g1Var2, "b");
        return C7462e.f14887a.mo25067d(bVar, g1Var, g1Var2);
    }

    /* renamed from: f */
    public final boolean mo25146f(C7491b bVar, C7481g1 g1Var, C7481g1 g1Var2) {
        C6888i.m12438e(bVar, "<this>");
        C6888i.m12438e(g1Var, "subType");
        C6888i.m12438e(g1Var2, "superType");
        return C7462e.m13463g(C7462e.f14887a, bVar, g1Var, g1Var2, false, 8);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Iterable] */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r6v2, types: [d.a.a.a.y0.l.c0] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0 mo25147g(p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0 r18) {
        /*
            r17 = this;
            java.lang.String r0 = "type"
            r1 = r18
            p298d.p344x.p346c.C6888i.m12438e(r1, r0)
            d.a.a.a.y0.l.t0 r0 = r18.mo24887V()
            boolean r2 = r0 instanceof p298d.p299a.p300a.p301a.p303y0.p391i.p392u.p393a.C7216c
            r3 = 1
            r4 = 0
            r5 = 10
            r6 = 0
            if (r2 == 0) goto L_0x0095
            d.a.a.a.y0.i.u.a.c r0 = (p298d.p299a.p300a.p301a.p303y0.p391i.p392u.p393a.C7216c) r0
            d.a.a.a.y0.l.w0 r2 = r0.f14452a
            d.a.a.a.y0.l.h1 r7 = r2.mo25162b()
            d.a.a.a.y0.l.h1 r8 = p298d.p299a.p300a.p301a.p303y0.p405l.C7484h1.IN_VARIANCE
            if (r7 != r8) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r3 = r4
        L_0x0022:
            if (r3 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = r6
        L_0x0026:
            if (r2 != 0) goto L_0x0029
            goto L_0x002f
        L_0x0029:
            d.a.a.a.y0.l.c0 r2 = r2.mo25161a()
            if (r2 != 0) goto L_0x0031
        L_0x002f:
            r10 = r6
            goto L_0x0036
        L_0x0031:
            d.a.a.a.y0.l.g1 r6 = r2.mo25056Y()
            goto L_0x002f
        L_0x0036:
            d.a.a.a.y0.l.j1.i r2 = r0.f14453b
            if (r2 != 0) goto L_0x007c
            d.a.a.a.y0.l.w0 r12 = r0.f14452a
            java.util.Collection r2 = r0.getSupertypes()
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = p005b.p291q.p292a.C5266a.m9892V(r2, r5)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x004d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0061
            java.lang.Object r4 = r2.next()
            d.a.a.a.y0.l.c0 r4 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0) r4
            d.a.a.a.y0.l.g1 r4 = r4.mo25056Y()
            r3.add(r4)
            goto L_0x004d
        L_0x0061:
            d.a.a.a.y0.l.j1.i r2 = new d.a.a.a.y0.l.j1.i
            r14 = 0
            java.lang.String r4 = "projection"
            p298d.p344x.p346c.C6888i.m12438e(r12, r4)
            java.lang.String r4 = "supertypes"
            p298d.p344x.p346c.C6888i.m12438e(r3, r4)
            d.a.a.a.y0.l.j1.h r13 = new d.a.a.a.y0.l.j1.h
            r13.<init>(r3)
            r15 = 0
            r16 = 8
            r11 = r2
            r11.<init>(r12, r13, r14, r15, r16)
            r0.f14453b = r2
        L_0x007c:
            d.a.a.a.y0.l.j1.g r2 = new d.a.a.a.y0.l.j1.g
            d.a.a.a.y0.l.l1.b r8 = p298d.p299a.p300a.p301a.p303y0.p405l.p408l1.C7528b.FOR_SUBTYPING
            d.a.a.a.y0.l.j1.i r9 = r0.f14453b
            p298d.p344x.p346c.C6888i.m12436c(r9)
            d.a.a.a.y0.b.f1.h r11 = r18.getAnnotations()
            boolean r12 = r18.mo23566W()
            r13 = 0
            r14 = 32
            r7 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return r2
        L_0x0095:
            boolean r2 = r0 instanceof p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7241r
            if (r2 == 0) goto L_0x00de
            d.a.a.a.y0.i.v.r r0 = (p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7241r) r0
            java.util.Objects.requireNonNull(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = p005b.p291q.p292a.C5266a.m9892V(r6, r5)
            r0.<init>(r2)
            java.util.Iterator r2 = r6.iterator()
        L_0x00ab:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00c8
            java.lang.Object r3 = r2.next()
            d.a.a.a.y0.l.c0 r3 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0) r3
            boolean r5 = r18.mo23566W()
            d.a.a.a.y0.l.c0 r3 = p298d.p299a.p300a.p301a.p303y0.p405l.C7460d1.m13444j(r3, r5)
            java.lang.String r5 = "makeNullableAsSpecified(it, type.isMarkedNullable)"
            p298d.p344x.p346c.C6888i.m12437d(r3, r5)
            r0.add(r3)
            goto L_0x00ab
        L_0x00c8:
            d.a.a.a.y0.l.a0 r2 = new d.a.a.a.y0.l.a0
            r2.<init>(r0)
            d.a.a.a.y0.l.d0 r0 = p298d.p299a.p300a.p301a.p303y0.p405l.C7455d0.f14869a
            d.a.a.a.y0.b.f1.h r0 = r18.getAnnotations()
            d.t.p r3 = p298d.p334t.C6798p.f13713g
            d.a.a.a.y0.i.z.h r1 = r18.getMemberScope()
            d.a.a.a.y0.l.j0 r0 = p298d.p299a.p300a.p301a.p303y0.p405l.C7455d0.m13433h(r0, r2, r3, r4, r1)
            return r0
        L_0x00de:
            boolean r2 = r0 instanceof p298d.p299a.p300a.p301a.p303y0.p405l.C7443a0
            if (r2 == 0) goto L_0x013b
            boolean r2 = r18.mo23566W()
            if (r2 == 0) goto L_0x013b
            d.a.a.a.y0.l.a0 r0 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7443a0) r0
            java.util.LinkedHashSet<d.a.a.a.y0.l.c0> r1 = r0.f14859b
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = p005b.p291q.p292a.C5266a.m9892V(r1, r5)
            r2.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L_0x00f9:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x010e
            java.lang.Object r4 = r1.next()
            d.a.a.a.y0.l.c0 r4 = (p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0) r4
            d.a.a.a.y0.l.c0 r4 = p005b.p291q.p292a.C5266a.m9945e3(r4)
            r2.add(r4)
            r4 = r3
            goto L_0x00f9
        L_0x010e:
            if (r4 != 0) goto L_0x0111
            goto L_0x0132
        L_0x0111:
            d.a.a.a.y0.l.c0 r1 = r0.f14858a
            if (r1 != 0) goto L_0x0116
            goto L_0x011a
        L_0x0116:
            d.a.a.a.y0.l.c0 r6 = p005b.p291q.p292a.C5266a.m9945e3(r1)
        L_0x011a:
            java.lang.String r1 = "typesToIntersect"
            p298d.p344x.p346c.C6888i.m12438e(r2, r1)
            r2.isEmpty()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>(r2)
            r1.hashCode()
            d.a.a.a.y0.l.a0 r2 = new d.a.a.a.y0.l.a0
            r2.<init>(r1)
            r2.f14858a = r6
            r6 = r2
        L_0x0132:
            if (r6 != 0) goto L_0x0135
            goto L_0x0136
        L_0x0135:
            r0 = r6
        L_0x0136:
            d.a.a.a.y0.l.j0 r0 = r0.mo25041b()
            goto L_0x013c
        L_0x013b:
            r0 = r1
        L_0x013c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7506l.mo25147g(d.a.a.a.y0.l.j0):d.a.a.a.y0.l.j0");
    }

    /* renamed from: h */
    public C7481g1 mo25148h(C7481g1 g1Var) {
        C7481g1 g1Var2;
        C6888i.m12438e(g1Var, "type");
        if (g1Var instanceof C7489j0) {
            g1Var2 = mo25147g((C7489j0) g1Var);
        } else if (g1Var instanceof C7579w) {
            C7579w wVar = (C7579w) g1Var;
            C7489j0 g = mo25147g(wVar.f15029h);
            C7489j0 g2 = mo25147g(wVar.f15030i);
            if (g == wVar.f15029h && g2 == wVar.f15030i) {
                g1Var2 = g1Var;
            } else {
                C7455d0 d0Var = C7455d0.f14869a;
                g1Var2 = C7455d0.m13428c(g, g2);
            }
        } else {
            throw new C6766h();
        }
        return C5266a.m9980k2(g1Var2, g1Var);
    }
}
