package p005b.p096l.p232f.p237c0;

import java.util.Map;
import p005b.p096l.p232f.C4484a;
import p005b.p096l.p232f.C4613g;
import p005b.p096l.p232f.C4627u;
import p005b.p096l.p232f.p258y.C4658b;

/* renamed from: b.l.f.c0.u */
public final class C4544u implements C4627u {

    /* renamed from: a */
    public final C4533j f8474a = new C4533j();

    /* renamed from: a */
    public C4658b mo16167a(String str, C4484a aVar, int i, int i2, Map<C4613g, ?> map) {
        if (aVar == C4484a.UPC_A) {
            return this.f8474a.mo16167a("0".concat(String.valueOf(str)), C4484a.EAN_13, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(aVar)));
    }
}
