package p298d.p299a.p300a.p301a.p303y0.p314d.p315a;

import java.util.List;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6019a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6213n0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0.C6309f;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p320m.C6404h;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p320m.C6406i;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7194h;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7201m;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;
import p298d.p414b0.C7664f;
import p298d.p414b0.C7668h;
import p298d.p414b0.C7679s;

/* renamed from: d.a.a.a.y0.d.a.o */
public final class C6505o implements C7194h {

    /* renamed from: d.a.a.a.y0.d.a.o$a */
    public /* synthetic */ class C6506a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12751a;

        static {
            C7201m.C7204c.C7205a.values();
            int[] iArr = new int[3];
            iArr[0] = 1;
            f12751a = iArr;
        }
    }

    /* renamed from: d.a.a.a.y0.d.a.o$b */
    public static final class C6507b extends C6890k implements C6862l<C6030b1, C7452c0> {

        /* renamed from: g */
        public static final C6507b f12752g = new C6507b();

        public C6507b() {
            super(1);
        }

        public Object invoke(Object obj) {
            return ((C6030b1) obj).mo23093a();
        }
    }

    /* renamed from: a */
    public C7194h.C7196b mo23592a(C6019a aVar, C6019a aVar2, C6046e eVar) {
        boolean z;
        C6019a aVar3;
        boolean z2;
        C7194h.C7196b bVar = C7194h.C7196b.UNKNOWN;
        C6888i.m12438e(aVar, "superDescriptor");
        C6888i.m12438e(aVar2, "subDescriptor");
        if (!(aVar2 instanceof C6309f)) {
            return bVar;
        }
        C6309f fVar = (C6309f) aVar2;
        List<C6248w0> typeParameters = fVar.getTypeParameters();
        C6888i.m12437d(typeParameters, "subDescriptor.typeParameters");
        if (!typeParameters.isEmpty()) {
            return bVar;
        }
        C7201m.C7204c i = C7201m.m13067i(aVar, aVar2);
        C7452c0 c0Var = null;
        if ((i == null ? null : i.mo24883c()) != null) {
            return bVar;
        }
        List<C6030b1> valueParameters = fVar.getValueParameters();
        C6888i.m12437d(valueParameters, "subDescriptor.valueParameters");
        C7668h<R> f = C7679s.m13898f(C6790h.m12346d(valueParameters), C6507b.f12752g);
        C7452c0 returnType = fVar.getReturnType();
        C6888i.m12436c(returnType);
        C7668h<R> h = C7679s.m13900h(f, returnType);
        C6213n0 extensionReceiverParameter = fVar.getExtensionReceiverParameter();
        if (extensionReceiverParameter != null) {
            c0Var = extensionReceiverParameter.mo23093a();
        }
        List B = C6790h.m12315B(c0Var);
        C6888i.m12438e(h, "$this$plus");
        C6888i.m12438e(B, "elements");
        C7664f.C7665a aVar4 = new C7664f.C7665a((C7664f) C5266a.m9888U0(C5266a.m9881S3(h, C6790h.m12346d(B))));
        while (true) {
            if (!aVar4.mo25257b()) {
                z = false;
                break;
            }
            C7452c0 c0Var2 = (C7452c0) aVar4.next();
            if (!(!c0Var2.mo24886U().isEmpty()) || (c0Var2.mo25056Y() instanceof C6406i)) {
                z2 = false;
                continue;
            } else {
                z2 = true;
                continue;
            }
            if (z2) {
                z = true;
                break;
            }
        }
        if (z || (aVar3 = (C6019a) aVar.substitute(C6404h.f12623b.mo25194c())) == null) {
            return bVar;
        }
        if (aVar3 instanceof C6232q0) {
            C6232q0 q0Var = (C6232q0) aVar3;
            List<C6248w0> typeParameters2 = q0Var.getTypeParameters();
            C6888i.m12437d(typeParameters2, "erasedSuper.typeParameters");
            if (!typeParameters2.isEmpty()) {
                aVar3 = (C6232q0) q0Var.newCopyBuilder().mo23296i(C6798p.f13713g).mo23292e();
                C6888i.m12436c(aVar3);
            }
        }
        C7201m.C7204c.C7205a c = C7201m.f14431d.mo24882n(aVar3, aVar2, false).mo24883c();
        C6888i.m12437d(c, "DEFAULT.isOverridableByWithoutExternalConditions(erasedSuper, subDescriptor, false).result");
        return C6506a.f12751a[c.ordinal()] == 1 ? C7194h.C7196b.OVERRIDABLE : bVar;
    }

    /* renamed from: b */
    public C7194h.C7195a mo23593b() {
        return C7194h.C7195a.SUCCESS_ONLY;
    }
}
