package p298d.p299a.p300a.p301a;

import java.util.List;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6019a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6213n0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p390h.C7150c;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p334t.C6790h;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.r0 */
public final class C5949r0 {

    /* renamed from: a */
    public static final C7150c f11764a = C7150c.f14297a;

    /* renamed from: b */
    public static final C5949r0 f11765b = null;

    /* renamed from: d.a.a.a.r0$a */
    public static final class C5950a extends C6890k implements C6862l<C6030b1, CharSequence> {

        /* renamed from: g */
        public static final C5950a f11766g = new C5950a();

        public C5950a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C6030b1 b1Var = (C6030b1) obj;
            C5949r0 r0Var = C5949r0.f11765b;
            C6888i.m12437d(b1Var, "it");
            C7452c0 a = b1Var.mo23093a();
            C6888i.m12437d(a, "it.type");
            return C5949r0.m10781e(a);
        }
    }

    /* renamed from: a */
    public static final void m10777a(StringBuilder sb, C6213n0 n0Var) {
        if (n0Var != null) {
            C7452c0 a = n0Var.mo23093a();
            C6888i.m12437d(a, "receiver.type");
            sb.append(m10781e(a));
            sb.append(".");
        }
    }

    /* renamed from: b */
    public static final void m10778b(StringBuilder sb, C6019a aVar) {
        C6213n0 g = C5970v0.m10812g(aVar);
        C6213n0 extensionReceiverParameter = aVar.getExtensionReceiverParameter();
        m10777a(sb, g);
        boolean z = (g == null || extensionReceiverParameter == null) ? false : true;
        if (z) {
            sb.append("(");
        }
        m10777a(sb, extensionReceiverParameter);
        if (z) {
            sb.append(")");
        }
    }

    /* renamed from: c */
    public static final String m10779c(C6244v vVar) {
        C6888i.m12438e(vVar, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        m10778b(sb, vVar);
        C7150c cVar = f11764a;
        C6717d name = vVar.getName();
        C6888i.m12437d(name, "descriptor.name");
        sb.append(cVar.mo24791v(name, true));
        List<C6030b1> valueParameters = vVar.getValueParameters();
        C6888i.m12437d(valueParameters, "descriptor.valueParameters");
        C6790h.m12367u(valueParameters, sb, ", ", "(", ")", 0, (CharSequence) null, C5950a.f11766g, 48);
        sb.append(": ");
        C7452c0 returnType = vVar.getReturnType();
        C6888i.m12436c(returnType);
        C6888i.m12437d(returnType, "descriptor.returnType!!");
        sb.append(m10781e(returnType));
        String sb2 = sb.toString();
        C6888i.m12437d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: d */
    public static final String m10780d(C6207k0 k0Var) {
        C6888i.m12438e(k0Var, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append(k0Var.mo23147o() ? "var " : "val ");
        m10778b(sb, k0Var);
        C7150c cVar = f11764a;
        C6717d name = k0Var.getName();
        C6888i.m12437d(name, "descriptor.name");
        sb.append(cVar.mo24791v(name, true));
        sb.append(": ");
        C7452c0 a = k0Var.mo23093a();
        C6888i.m12437d(a, "descriptor.type");
        sb.append(m10781e(a));
        String sb2 = sb.toString();
        C6888i.m12437d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: e */
    public static final String m10781e(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "type");
        return f11764a.mo24792w(c0Var);
    }
}
