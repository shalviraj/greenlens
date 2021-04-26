package p298d.p299a.p300a.p301a.p303y0.p314d.p315a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p298d.C6768j;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6019a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6309f;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6542h;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7194h;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.d.a.w */
public final class C6520w implements C7194h {
    /* renamed from: c */
    public static final boolean m11546c(C6019a aVar, C6019a aVar2) {
        C6888i.m12438e(aVar, "superDescriptor");
        C6888i.m12438e(aVar2, "subDescriptor");
        if (!(aVar2 instanceof C6309f) || !(aVar instanceof C6244v)) {
            return false;
        }
        C6309f fVar = (C6309f) aVar2;
        fVar.getValueParameters().size();
        C6244v vVar = (C6244v) aVar;
        vVar.getValueParameters().size();
        List<C6030b1> valueParameters = fVar.getOriginal().getValueParameters();
        C6888i.m12437d(valueParameters, "subDescriptor.original.valueParameters");
        List<C6030b1> valueParameters2 = vVar.getOriginal().getValueParameters();
        C6888i.m12437d(valueParameters2, "superDescriptor.original.valueParameters");
        Iterator it = ((ArrayList) C6790h.m12353g0(valueParameters, valueParameters2)).iterator();
        while (it.hasNext()) {
            C6768j jVar = (C6768j) it.next();
            C6030b1 b1Var = (C6030b1) jVar.f13681g;
            C6030b1 b1Var2 = (C6030b1) jVar.f13682h;
            C6888i.m12437d(b1Var, "subParameter");
            boolean z = m11547d((C6244v) aVar2, b1Var) instanceof C6542h.C6545c;
            C6888i.m12437d(b1Var2, "superParameter");
            if (z != (m11547d(vVar, b1Var2) instanceof C6542h.C6545c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r6v11, types: [d.a.a.a.y0.b.h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6542h m11547d(p298d.p299a.p300a.p301a.p303y0.p304b.C6244v r6, p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1 r7) {
        /*
            java.lang.String r0 = "f"
            p298d.p344x.p346c.C6888i.m12438e(r6, r0)
            d.a.a.a.y0.f.d r0 = r6.getName()
            java.lang.String r0 = r0.mo23886e()
            java.lang.String r1 = "remove"
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r0, r1)
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x00cb
            java.util.List r0 = r6.getValueParameters()
            int r0 = r0.size()
            if (r0 != r2) goto L_0x00cb
            java.lang.String r0 = "<this>"
            p298d.p344x.p346c.C6888i.m12438e(r6, r0)
            p298d.p344x.p346c.C6888i.m12438e(r6, r0)
            d.a.a.a.y0.b.b r0 = p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a.m13140m(r6)
            d.a.a.a.y0.b.k r0 = r0.getContainingDeclaration()
            boolean r0 = r0 instanceof p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6307d
            if (r0 != 0) goto L_0x003f
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isBuiltIn(r6)
            if (r0 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r0 = r3
            goto L_0x0040
        L_0x003f:
            r0 = r2
        L_0x0040:
            if (r0 == 0) goto L_0x0044
            goto L_0x00cb
        L_0x0044:
            d.a.a.a.y0.b.v r0 = r6.getOriginal()
            java.util.List r0 = r0.getValueParameters()
            java.lang.String r4 = "f.original.valueParameters"
            p298d.p344x.p346c.C6888i.m12437d(r0, r4)
            java.lang.Object r0 = p298d.p334t.C6790h.m12329P(r0)
            d.a.a.a.y0.b.b1 r0 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1) r0
            d.a.a.a.y0.l.c0 r0 = r0.mo23093a()
            java.lang.String r4 = "f.original.valueParameters.single().type"
            p298d.p344x.p346c.C6888i.m12437d(r0, r4)
            d.a.a.a.y0.d.b.h r0 = p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6561p.m11655d(r0)
            boolean r4 = r0 instanceof p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6542h.C6545c
            if (r4 == 0) goto L_0x006b
            d.a.a.a.y0.d.b.h$c r0 = (p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6542h.C6545c) r0
            goto L_0x006c
        L_0x006b:
            r0 = r1
        L_0x006c:
            if (r0 != 0) goto L_0x0070
            r0 = r1
            goto L_0x0072
        L_0x0070:
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r0 = r0.f12848j
        L_0x0072:
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r4 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.INT
            if (r0 == r4) goto L_0x0077
            goto L_0x00cb
        L_0x0077:
            d.a.a.a.y0.d.a.h r0 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6317h.f12423m
            d.a.a.a.y0.b.v r0 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6317h.m11304a(r6)
            if (r0 != 0) goto L_0x0080
            goto L_0x00cb
        L_0x0080:
            d.a.a.a.y0.b.v r4 = r0.getOriginal()
            java.util.List r4 = r4.getValueParameters()
            java.lang.String r5 = "overridden.original.valueParameters"
            p298d.p344x.p346c.C6888i.m12437d(r4, r5)
            java.lang.Object r4 = p298d.p334t.C6790h.m12329P(r4)
            d.a.a.a.y0.b.b1 r4 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1) r4
            d.a.a.a.y0.l.c0 r4 = r4.mo23093a()
            java.lang.String r5 = "overridden.original.valueParameters.single().type"
            p298d.p344x.p346c.C6888i.m12437d(r4, r5)
            d.a.a.a.y0.d.b.h r4 = p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6561p.m11655d(r4)
            d.a.a.a.y0.b.k r0 = r0.getContainingDeclaration()
            java.lang.String r5 = "overridden.containingDeclaration"
            p298d.p344x.p346c.C6888i.m12437d(r0, r5)
            d.a.a.a.y0.f.c r0 = p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a.m13136i(r0)
            d.a.a.a.y0.f.b r5 = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.mutableCollection
            d.a.a.a.y0.f.c r5 = r5.mo23872j()
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r0, r5)
            if (r0 == 0) goto L_0x00cb
            boolean r0 = r4 instanceof p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6542h.C6544b
            if (r0 == 0) goto L_0x00cb
            d.a.a.a.y0.d.b.h$b r4 = (p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6542h.C6544b) r4
            java.lang.String r0 = r4.f12847j
            java.lang.String r4 = "java/lang/Object"
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r0, r4)
            if (r0 == 0) goto L_0x00cb
            r0 = r2
            goto L_0x00cc
        L_0x00cb:
            r0 = r3
        L_0x00cc:
            java.lang.String r4 = "valueParameterDescriptor.type"
            if (r0 != 0) goto L_0x0131
            java.util.List r0 = r6.getValueParameters()
            int r0 = r0.size()
            if (r0 == r2) goto L_0x00db
            goto L_0x0126
        L_0x00db:
            d.a.a.a.y0.b.k r0 = r6.getContainingDeclaration()
            boolean r5 = r0 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6046e
            if (r5 == 0) goto L_0x00e6
            d.a.a.a.y0.b.e r0 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6046e) r0
            goto L_0x00e7
        L_0x00e6:
            r0 = r1
        L_0x00e7:
            if (r0 != 0) goto L_0x00ea
            goto L_0x0126
        L_0x00ea:
            java.util.List r6 = r6.getValueParameters()
            java.lang.String r5 = "f.valueParameters"
            p298d.p344x.p346c.C6888i.m12437d(r6, r5)
            java.lang.Object r6 = p298d.p334t.C6790h.m12329P(r6)
            d.a.a.a.y0.b.b1 r6 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1) r6
            d.a.a.a.y0.l.c0 r6 = r6.mo23093a()
            d.a.a.a.y0.l.t0 r6 = r6.mo24887V()
            d.a.a.a.y0.b.h r6 = r6.getDeclarationDescriptor()
            boolean r5 = r6 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6046e
            if (r5 == 0) goto L_0x010c
            r1 = r6
            d.a.a.a.y0.b.e r1 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6046e) r1
        L_0x010c:
            if (r1 != 0) goto L_0x010f
            goto L_0x0126
        L_0x010f:
            boolean r6 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isPrimitiveClass(r0)
            if (r6 == 0) goto L_0x0124
            d.a.a.a.y0.f.b r6 = p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a.m13135h(r0)
            d.a.a.a.y0.f.b r0 = p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a.m13135h(r1)
            boolean r6 = p298d.p344x.p346c.C6888i.m12434a(r6, r0)
            if (r6 == 0) goto L_0x0124
            goto L_0x0125
        L_0x0124:
            r2 = r3
        L_0x0125:
            r3 = r2
        L_0x0126:
            if (r3 == 0) goto L_0x0129
            goto L_0x0131
        L_0x0129:
            d.a.a.a.y0.l.c0 r6 = r7.mo23093a()
            p298d.p344x.p346c.C6888i.m12437d(r6, r4)
            goto L_0x013c
        L_0x0131:
            d.a.a.a.y0.l.c0 r6 = r7.mo23093a()
            p298d.p344x.p346c.C6888i.m12437d(r6, r4)
            d.a.a.a.y0.l.c0 r6 = p005b.p291q.p292a.C5266a.m9945e3(r6)
        L_0x013c:
            d.a.a.a.y0.d.b.h r6 = p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6561p.m11655d(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6520w.m11547d(d.a.a.a.y0.b.v, d.a.a.a.y0.b.b1):d.a.a.a.y0.d.b.h");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b9, code lost:
        if (p298d.p344x.p346c.C6888i.m12434a(r1, p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6561p.m11653b(r3, false, false, 2)) != false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0045, code lost:
        if (p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6275e0.f12352k.contains(r1) == false) goto L_0x00bd;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p298d.p299a.p300a.p301a.p303y0.p391i.C7194h.C7196b mo23592a(p298d.p299a.p300a.p301a.p303y0.p304b.C6019a r9, p298d.p299a.p300a.p301a.p303y0.p304b.C6019a r10, p298d.p299a.p300a.p301a.p303y0.p304b.C6046e r11) {
        /*
            r8 = this;
            d.a.a.a.y0.i.h$b r0 = p298d.p299a.p300a.p301a.p303y0.p391i.C7194h.C7196b.INCOMPATIBLE
            java.lang.String r1 = "superDescriptor"
            p298d.p344x.p346c.C6888i.m12438e(r9, r1)
            java.lang.String r1 = "subDescriptor"
            p298d.p344x.p346c.C6888i.m12438e(r10, r1)
            boolean r1 = r9 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6023b
            r2 = 0
            if (r1 == 0) goto L_0x00bd
            boolean r1 = r10 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6244v
            if (r1 == 0) goto L_0x00bd
            boolean r1 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isBuiltIn(r10)
            if (r1 == 0) goto L_0x001d
            goto L_0x00bd
        L_0x001d:
            d.a.a.a.y0.d.a.h r1 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6317h.f12423m
            r3 = r10
            d.a.a.a.y0.b.v r3 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6244v) r3
            d.a.a.a.y0.f.d r4 = r3.getName()
            java.lang.String r5 = "subDescriptor.name"
            p298d.p344x.p346c.C6888i.m12437d(r4, r5)
            boolean r1 = r1.mo23464b(r4)
            if (r1 != 0) goto L_0x0049
            d.a.a.a.y0.d.a.g r1 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6303g.f12404m
            d.a.a.a.y0.f.d r1 = r3.getName()
            p298d.p344x.p346c.C6888i.m12437d(r1, r5)
            java.lang.String r4 = "<this>"
            p298d.p344x.p346c.C6888i.m12438e(r1, r4)
            java.util.List<d.a.a.a.y0.f.d> r4 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6275e0.f12352k
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L_0x0049
            goto L_0x00bd
        L_0x0049:
            r1 = r9
            d.a.a.a.y0.b.b r1 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6023b) r1
            d.a.a.a.y0.b.b r1 = p005b.p291q.p292a.C5266a.m9820I1(r1)
            boolean r4 = r3.isHiddenToOvercomeSignatureClash()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r5 = r9 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6244v
            r6 = 0
            if (r5 == 0) goto L_0x0061
            r7 = r9
            d.a.a.a.y0.b.v r7 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6244v) r7
            goto L_0x0062
        L_0x0061:
            r7 = r6
        L_0x0062:
            if (r7 != 0) goto L_0x0065
            goto L_0x006d
        L_0x0065:
            boolean r6 = r7.isHiddenToOvercomeSignatureClash()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
        L_0x006d:
            boolean r4 = p298d.p344x.p346c.C6888i.m12434a(r4, r6)
            r6 = 1
            r4 = r4 ^ r6
            if (r4 == 0) goto L_0x007e
            if (r1 == 0) goto L_0x00bc
            boolean r4 = r3.isHiddenToOvercomeSignatureClash()
            if (r4 != 0) goto L_0x007e
            goto L_0x00bc
        L_0x007e:
            boolean r4 = r11 instanceof p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6307d
            if (r4 == 0) goto L_0x00bd
            d.a.a.a.y0.b.v r4 = r3.getInitialSignatureDescriptor()
            if (r4 == 0) goto L_0x0089
            goto L_0x00bd
        L_0x0089:
            if (r1 == 0) goto L_0x00bd
            boolean r11 = p005b.p291q.p292a.C5266a.m9920a2(r11, r1)
            if (r11 == 0) goto L_0x0092
            goto L_0x00bd
        L_0x0092:
            boolean r11 = r1 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6244v
            if (r11 == 0) goto L_0x00bc
            if (r5 == 0) goto L_0x00bc
            d.a.a.a.y0.b.v r1 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6244v) r1
            d.a.a.a.y0.b.v r11 = p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6317h.m11304a(r1)
            if (r11 == 0) goto L_0x00bc
            r11 = 2
            java.lang.String r1 = p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6561p.m11653b(r3, r2, r2, r11)
            r3 = r9
            d.a.a.a.y0.b.v r3 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6244v) r3
            d.a.a.a.y0.b.v r3 = r3.getOriginal()
            java.lang.String r4 = "superDescriptor.original"
            p298d.p344x.p346c.C6888i.m12437d(r3, r4)
            java.lang.String r11 = p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6561p.m11653b(r3, r2, r2, r11)
            boolean r11 = p298d.p344x.p346c.C6888i.m12434a(r1, r11)
            if (r11 == 0) goto L_0x00bc
            goto L_0x00bd
        L_0x00bc:
            r2 = r6
        L_0x00bd:
            if (r2 == 0) goto L_0x00c0
            return r0
        L_0x00c0:
            boolean r9 = m11546c(r9, r10)
            if (r9 == 0) goto L_0x00c7
            return r0
        L_0x00c7:
            d.a.a.a.y0.i.h$b r9 = p298d.p299a.p300a.p301a.p303y0.p391i.C7194h.C7196b.UNKNOWN
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6520w.mo23592a(d.a.a.a.y0.b.a, d.a.a.a.y0.b.a, d.a.a.a.y0.b.e):d.a.a.a.y0.i.h$b");
    }

    /* renamed from: b */
    public C7194h.C7195a mo23593b() {
        return C7194h.C7195a.CONFLICTS_ONLY;
    }
}
