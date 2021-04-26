package p298d.p299a.p300a.p301a.p303y0.p391i;

import java.util.Collection;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6019a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p334t.C6790h;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.i.e */
public final class C7191e {

    /* renamed from: a */
    public static final C7191e f14417a = new C7191e();

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00da, code lost:
        if (r8.mo24881m(r7, r6, (p298d.p299a.p300a.p301a.p303y0.p304b.C6046e) null, true).mo24883c() == r2) goto L_0x00dc;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo24870a(p298d.p299a.p300a.p301a.p303y0.p304b.C6206k r6, p298d.p299a.p300a.p301a.p303y0.p304b.C6206k r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6046e
            if (r0 == 0) goto L_0x001a
            boolean r0 = r7 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6046e
            if (r0 == 0) goto L_0x001a
            d.a.a.a.y0.b.e r6 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6046e) r6
            d.a.a.a.y0.b.e r7 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6046e) r7
            d.a.a.a.y0.l.t0 r6 = r6.getTypeConstructor()
            d.a.a.a.y0.l.t0 r7 = r7.getTypeConstructor()
            boolean r6 = p298d.p344x.p346c.C6888i.m12434a(r6, r7)
            goto L_0x00f8
        L_0x001a:
            boolean r0 = r6 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0
            if (r0 == 0) goto L_0x002e
            boolean r0 = r7 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0
            if (r0 == 0) goto L_0x002e
            d.a.a.a.y0.b.w0 r6 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0) r6
            d.a.a.a.y0.b.w0 r7 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0) r7
            d.a.a.a.y0.i.d r9 = p298d.p299a.p300a.p301a.p303y0.p391i.C7190d.f14416g
            boolean r6 = r5.mo24871b(r6, r7, r8, r9)
            goto L_0x00f8
        L_0x002e:
            boolean r0 = r6 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6019a
            if (r0 == 0) goto L_0x00e0
            boolean r0 = r7 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6019a
            if (r0 == 0) goto L_0x00e0
            d.a.a.a.y0.b.a r6 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6019a) r6
            d.a.a.a.y0.b.a r7 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6019a) r7
            d.a.a.a.y0.l.j1.e$a r0 = p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e.C7496a.f14927a
            r1 = 0
            java.lang.String r2 = "a"
            p298d.p344x.p346c.C6888i.m12438e(r6, r2)
            java.lang.String r2 = "b"
            p298d.p344x.p346c.C6888i.m12438e(r7, r2)
            java.lang.String r2 = "kotlinTypeRefiner"
            p298d.p344x.p346c.C6888i.m12438e(r0, r2)
            boolean r2 = p298d.p344x.p346c.C6888i.m12434a(r6, r7)
            r3 = 1
            if (r2 == 0) goto L_0x0055
            goto L_0x00dc
        L_0x0055:
            d.a.a.a.y0.f.d r2 = r6.getName()
            d.a.a.a.y0.f.d r4 = r7.getName()
            boolean r2 = p298d.p344x.p346c.C6888i.m12434a(r2, r4)
            if (r2 != 0) goto L_0x0065
            goto L_0x00de
        L_0x0065:
            if (r9 == 0) goto L_0x0080
            boolean r9 = r6 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6249x
            if (r9 == 0) goto L_0x0080
            boolean r9 = r7 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6249x
            if (r9 == 0) goto L_0x0080
            r9 = r6
            d.a.a.a.y0.b.x r9 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6249x) r9
            boolean r9 = r9.isExpect()
            r2 = r7
            d.a.a.a.y0.b.x r2 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6249x) r2
            boolean r2 = r2.isExpect()
            if (r9 == r2) goto L_0x0080
            goto L_0x00de
        L_0x0080:
            d.a.a.a.y0.b.k r9 = r6.getContainingDeclaration()
            d.a.a.a.y0.b.k r2 = r7.getContainingDeclaration()
            boolean r9 = p298d.p344x.p346c.C6888i.m12434a(r9, r2)
            if (r9 == 0) goto L_0x00a0
            if (r8 != 0) goto L_0x0091
            goto L_0x00de
        L_0x0091:
            d.a.a.a.y0.b.r0 r9 = r5.mo24873d(r6)
            d.a.a.a.y0.b.r0 r2 = r5.mo24873d(r7)
            boolean r9 = p298d.p344x.p346c.C6888i.m12434a(r9, r2)
            if (r9 != 0) goto L_0x00a0
            goto L_0x00de
        L_0x00a0:
            boolean r9 = p298d.p299a.p300a.p301a.p303y0.p391i.C7193g.m13040t(r6)
            if (r9 != 0) goto L_0x00de
            boolean r9 = p298d.p299a.p300a.p301a.p303y0.p391i.C7193g.m13040t(r7)
            if (r9 == 0) goto L_0x00ad
            goto L_0x00de
        L_0x00ad:
            d.a.a.a.y0.i.b r9 = p298d.p299a.p300a.p301a.p303y0.p391i.C7187b.f14409g
            boolean r9 = r5.mo24872c(r6, r7, r9, r8)
            if (r9 != 0) goto L_0x00b6
            goto L_0x00de
        L_0x00b6:
            d.a.a.a.y0.i.c r9 = new d.a.a.a.y0.i.c
            r9.<init>(r5, r8, r6, r7)
            d.a.a.a.y0.i.m r8 = new d.a.a.a.y0.i.m
            r8.<init>(r9, r0)
            java.lang.String r9 = "fun areCallableDescriptorsEquivalent(\n        a: CallableDescriptor,\n        b: CallableDescriptor,\n        allowCopiesFromTheSameDeclaration: Boolean,\n        distinguishExpectsAndNonExpects: Boolean = true,\n        ignoreReturnType: Boolean = false,\n        kotlinTypeRefiner: KotlinTypeRefiner\n    ): Boolean {\n        if (a == b) return true\n        if (a.name != b.name) return false\n        if (distinguishExpectsAndNonExpects && a is MemberDescriptor && b is MemberDescriptor && a.isExpect != b.isExpect) return false\n        if (a.containingDeclaration == b.containingDeclaration) {\n            if (!allowCopiesFromTheSameDeclaration) return false\n            if (a.singleSource() != b.singleSource()) return false\n        }\n\n        // Distinct locals are not equivalent\n        if (DescriptorUtils.isLocal(a) || DescriptorUtils.isLocal(b)) return false\n\n        if (!ownersEquivalent(a, b, { _, _ -> false }, allowCopiesFromTheSameDeclaration)) return false\n\n        val overridingUtil = OverridingUtil.create(kotlinTypeRefiner) eq@{ c1, c2 ->\n            if (c1 == c2) return@eq true\n\n            val d1 = c1.declarationDescriptor\n            val d2 = c2.declarationDescriptor\n\n            if (d1 !is TypeParameterDescriptor || d2 !is TypeParameterDescriptor) return@eq false\n\n            areTypeParametersEquivalent(d1, d2, allowCopiesFromTheSameDeclaration) { x, y -> x == a && y == b }\n        }\n\n        return overridingUtil.isOverridableBy(a, b, null, !ignoreReturnType).result == OverrideCompatibilityInfo.Result.OVERRIDABLE\n                && overridingUtil.isOverridableBy(b, a, null, !ignoreReturnType).result == OverrideCompatibilityInfo.Result.OVERRIDABLE\n\n    }"
            p298d.p344x.p346c.C6888i.m12437d(r8, r9)
            r9 = 0
            d.a.a.a.y0.i.m$c r0 = r8.mo24881m(r6, r7, r9, r3)
            d.a.a.a.y0.i.m$c$a r0 = r0.mo24883c()
            d.a.a.a.y0.i.m$c$a r2 = p298d.p299a.p300a.p301a.p303y0.p391i.C7201m.C7204c.C7205a.OVERRIDABLE
            if (r0 != r2) goto L_0x00de
            d.a.a.a.y0.i.m$c r6 = r8.mo24881m(r7, r6, r9, r3)
            d.a.a.a.y0.i.m$c$a r6 = r6.mo24883c()
            if (r6 != r2) goto L_0x00de
        L_0x00dc:
            r6 = r3
            goto L_0x00f8
        L_0x00de:
            r6 = r1
            goto L_0x00f8
        L_0x00e0:
            boolean r8 = r6 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6032c0
            if (r8 == 0) goto L_0x00f4
            boolean r8 = r7 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6032c0
            if (r8 == 0) goto L_0x00f4
            d.a.a.a.y0.b.c0 r6 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6032c0) r6
            d.a.a.a.y0.f.b r6 = r6.getFqName()
            d.a.a.a.y0.b.c0 r7 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6032c0) r7
            d.a.a.a.y0.f.b r7 = r7.getFqName()
        L_0x00f4:
            boolean r6 = p298d.p344x.p346c.C6888i.m12434a(r6, r7)
        L_0x00f8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p391i.C7191e.mo24870a(d.a.a.a.y0.b.k, d.a.a.a.y0.b.k, boolean, boolean):boolean");
    }

    /* renamed from: b */
    public final boolean mo24871b(C6248w0 w0Var, C6248w0 w0Var2, boolean z, C6866p<? super C6206k, ? super C6206k, Boolean> pVar) {
        if (C6888i.m12434a(w0Var, w0Var2)) {
            return true;
        }
        if (!C6888i.m12434a(w0Var.getContainingDeclaration(), w0Var2.getContainingDeclaration()) && mo24872c(w0Var, w0Var2, pVar, z)) {
            return w0Var.mo23132d() == w0Var2.mo23132d();
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo24872c(C6206k kVar, C6206k kVar2, C6866p<? super C6206k, ? super C6206k, Boolean> pVar, boolean z) {
        C6206k containingDeclaration = kVar.getContainingDeclaration();
        C6206k containingDeclaration2 = kVar2.getContainingDeclaration();
        if ((containingDeclaration instanceof C6023b) || (containingDeclaration2 instanceof C6023b)) {
            return pVar.invoke(containingDeclaration, containingDeclaration2).booleanValue();
        }
        return mo24870a(containingDeclaration, containingDeclaration2, z, true);
    }

    /* renamed from: d */
    public final C6234r0 mo24873d(C6019a aVar) {
        while (aVar instanceof C6023b) {
            C6023b bVar = (C6023b) aVar;
            if (bVar.getKind() != C6023b.C6024a.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends C6023b> overriddenDescriptors = bVar.getOverriddenDescriptors();
            C6888i.m12437d(overriddenDescriptors, "overriddenDescriptors");
            aVar = (C6023b) C6790h.m12330Q(overriddenDescriptors);
            if (aVar == null) {
                return null;
            }
        }
        return aVar.getSource();
    }
}
