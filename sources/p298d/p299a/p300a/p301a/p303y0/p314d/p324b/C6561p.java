package p298d.p299a.p300a.p301a.p303y0.p314d.p324b;

import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6019a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7193g;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7628g;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.d.b.p */
public final class C6561p {
    /* renamed from: a */
    public static final void m11652a(StringBuilder sb, C7452c0 c0Var) {
        sb.append(m11655d(c0Var));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        if ((r3 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6209l0) == false) goto L_0x0098;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m11653b(p298d.p299a.p300a.p301a.p303y0.p304b.C6244v r3, boolean r4, boolean r5, int r6) {
        /*
            r0 = r6 & 1
            r1 = 1
            if (r0 == 0) goto L_0x0006
            r4 = r1
        L_0x0006:
            r6 = r6 & 2
            if (r6 == 0) goto L_0x000b
            r5 = r1
        L_0x000b:
            java.lang.String r6 = "<this>"
            p298d.p344x.p346c.C6888i.m12438e(r3, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            if (r5 == 0) goto L_0x002e
            boolean r5 = r3 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6157j
            if (r5 == 0) goto L_0x001e
            java.lang.String r5 = "<init>"
            goto L_0x002b
        L_0x001e:
            d.a.a.a.y0.f.d r5 = r3.getName()
            java.lang.String r5 = r5.mo23886e()
            java.lang.String r0 = "name.asString()"
            p298d.p344x.p346c.C6888i.m12437d(r5, r0)
        L_0x002b:
            r6.append(r5)
        L_0x002e:
            java.lang.String r5 = "("
            r6.append(r5)
            d.a.a.a.y0.b.n0 r5 = r3.getExtensionReceiverParameter()
            if (r5 != 0) goto L_0x003a
            goto L_0x0046
        L_0x003a:
            d.a.a.a.y0.l.c0 r5 = r5.mo23093a()
            java.lang.String r0 = "it.type"
            p298d.p344x.p346c.C6888i.m12437d(r5, r0)
            m11652a(r6, r5)
        L_0x0046:
            java.util.List r5 = r3.getValueParameters()
            java.util.Iterator r5 = r5.iterator()
        L_0x004e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0067
            java.lang.Object r0 = r5.next()
            d.a.a.a.y0.b.b1 r0 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1) r0
            d.a.a.a.y0.l.c0 r0 = r0.mo23093a()
            java.lang.String r2 = "parameter.type"
            p298d.p344x.p346c.C6888i.m12437d(r0, r2)
            m11652a(r6, r0)
            goto L_0x004e
        L_0x0067:
            java.lang.String r5 = ")"
            r6.append(r5)
            if (r4 == 0) goto L_0x00aa
            java.lang.String r4 = "descriptor"
            p298d.p344x.p346c.C6888i.m12438e(r3, r4)
            boolean r4 = r3 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6157j
            if (r4 == 0) goto L_0x0078
            goto L_0x0098
        L_0x0078:
            d.a.a.a.y0.l.c0 r4 = r3.getReturnType()
            p298d.p344x.p346c.C6888i.m12436c(r4)
            boolean r4 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isUnit(r4)
            if (r4 == 0) goto L_0x0097
            d.a.a.a.y0.l.c0 r4 = r3.getReturnType()
            p298d.p344x.p346c.C6888i.m12436c(r4)
            boolean r4 = p298d.p299a.p300a.p301a.p303y0.p405l.C7460d1.m13441g(r4)
            if (r4 != 0) goto L_0x0097
            boolean r4 = r3 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6209l0
            if (r4 != 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r1 = 0
        L_0x0098:
            if (r1 == 0) goto L_0x00a0
            java.lang.String r3 = "V"
            r6.append(r3)
            goto L_0x00aa
        L_0x00a0:
            d.a.a.a.y0.l.c0 r3 = r3.getReturnType()
            p298d.p344x.p346c.C6888i.m12436c(r3)
            m11652a(r6, r3)
        L_0x00aa:
            java.lang.String r3 = r6.toString()
            java.lang.String r4 = "StringBuilder().apply(builderAction).toString()"
            p298d.p344x.p346c.C6888i.m12437d(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6561p.m11653b(d.a.a.a.y0.b.v, boolean, boolean, int):java.lang.String");
    }

    /* renamed from: c */
    public static final String m11654c(C6019a aVar) {
        C6888i.m12438e(aVar, "<this>");
        C6565s sVar = C6565s.f12856a;
        if (C7193g.m13040t(aVar)) {
            return null;
        }
        C6206k containingDeclaration = aVar.getContainingDeclaration();
        C6046e eVar = containingDeclaration instanceof C6046e ? (C6046e) containingDeclaration : null;
        if (eVar == null || eVar.getName().f13624h) {
            return null;
        }
        C6019a original = aVar.getOriginal();
        C6232q0 q0Var = original instanceof C6232q0 ? (C6232q0) original : null;
        if (q0Var == null) {
            return null;
        }
        return C5266a.m9901W3(sVar, eVar, m11653b(q0Var, false, false, 3));
    }

    /* renamed from: d */
    public static final C6542h m11655d(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "<this>");
        return (C6542h) C5266a.m9969i3(c0Var, C6547j.f12849a, C6568v.f12860m, C6567u.f12857a, C7628g.f15113b);
    }
}
