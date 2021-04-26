package p298d.p299a.p300a.p301a.p303y0.p411m;

import java.util.List;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.m.k */
public final class C7604k implements C7589b {

    /* renamed from: a */
    public static final C7604k f15055a = new C7604k();

    /* renamed from: a */
    public String mo25196a(C6244v vVar) {
        return C5266a.m9992m2(this, vVar);
    }

    /* renamed from: b */
    public boolean mo25197b(C6244v vVar) {
        boolean z;
        C6888i.m12438e(vVar, "functionDescriptor");
        List<C6030b1> valueParameters = vVar.getValueParameters();
        C6888i.m12437d(valueParameters, "functionDescriptor.valueParameters");
        if (!valueParameters.isEmpty()) {
            for (C6030b1 b1Var : valueParameters) {
                C6888i.m12437d(b1Var, "it");
                if (C7255a.m13128a(b1Var) || b1Var.mo23130p() != null) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    public String getDescription() {
        return "should not have varargs or parameters with default values";
    }
}
