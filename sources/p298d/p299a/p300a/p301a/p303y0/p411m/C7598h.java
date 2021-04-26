package p298d.p299a.p300a.p301a.p303y0.p411m;

import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7493d;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.m.h */
public final class C7598h implements C7589b {

    /* renamed from: a */
    public static final C7598h f15050a = new C7598h();

    /* renamed from: a */
    public String mo25196a(C6244v vVar) {
        return C5266a.m9992m2(this, vVar);
    }

    /* renamed from: b */
    public boolean mo25197b(C6244v vVar) {
        C6888i.m12438e(vVar, "functionDescriptor");
        C6030b1 b1Var = vVar.getValueParameters().get(1);
        ReflectionTypes.Companion companion = ReflectionTypes.Companion;
        C6888i.m12437d(b1Var, "secondParameter");
        C7452c0 createKPropertyStarType = companion.createKPropertyStarType(C7255a.m13138k(b1Var));
        if (createKPropertyStarType == null) {
            return false;
        }
        C7452c0 a = b1Var.mo23093a();
        C6888i.m12437d(a, "secondParameter.type");
        C7452c0 d3 = C5266a.m9939d3(a);
        C6888i.m12438e(createKPropertyStarType, "<this>");
        C6888i.m12438e(d3, "superType");
        return C7493d.f14926a.mo25128d(createKPropertyStarType, d3);
    }

    public String getDescription() {
        return "second parameter must be of type KProperty<*> or its supertype";
    }
}
