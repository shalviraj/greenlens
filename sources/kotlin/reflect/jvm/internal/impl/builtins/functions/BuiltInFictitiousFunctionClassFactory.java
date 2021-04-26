package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionInterfacePackageFragment;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6032c0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.p306g1.C6076b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p334t.C6790h;
import p298d.p334t.C6800r;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;

public final class BuiltInFictitiousFunctionClassFactory implements C6076b {
    private final C6021a0 module;
    private final C7441m storageManager;

    public BuiltInFictitiousFunctionClassFactory(C7441m mVar, C6021a0 a0Var) {
        C6888i.m12438e(mVar, "storageManager");
        C6888i.m12438e(a0Var, "module");
        this.storageManager = mVar;
        this.module = a0Var;
    }

    public C6046e createClass(C6713a aVar) {
        C6888i.m12438e(aVar, "classId");
        if (aVar.f13612c || aVar.mo23860k()) {
            return null;
        }
        String b = aVar.mo23858i().mo23862b();
        C6888i.m12437d(b, "classId.relativeClassName.asString()");
        if (!C7694h.m13926d(b, "Function", false, 2)) {
            return null;
        }
        C6714b h = aVar.mo23856h();
        C6888i.m12437d(h, "classId.packageFqName");
        FunctionClassKind.Companion.KindWithArity parseClassName = FunctionClassKind.Companion.parseClassName(b, h);
        if (parseClassName == null) {
            return null;
        }
        FunctionClassKind component1 = parseClassName.component1();
        int component2 = parseClassName.component2();
        List<C6032c0> A = this.module.mo23088G(h).mo23178A();
        ArrayList arrayList = new ArrayList();
        for (T next : A) {
            if (next instanceof BuiltInsPackageFragment) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : arrayList) {
            if (next2 instanceof FunctionInterfacePackageFragment) {
                arrayList2.add(next2);
            }
        }
        C6032c0 c0Var = (FunctionInterfacePackageFragment) C6790h.m12363q(arrayList2);
        if (c0Var == null) {
            c0Var = (BuiltInsPackageFragment) C6790h.m12361o(arrayList);
        }
        return new FunctionClassDescriptor(this.storageManager, c0Var, component1, component2);
    }

    public Collection<C6046e> getAllContributedClassesIfPossible(C6714b bVar) {
        C6888i.m12438e(bVar, "packageFqName");
        return C6800r.f13715g;
    }

    public boolean shouldCreateClass(C6714b bVar, C6717d dVar) {
        C6888i.m12438e(bVar, "packageFqName");
        C6888i.m12438e(dVar, "name");
        String e = dVar.mo23886e();
        C6888i.m12437d(e, "name.asString()");
        return (C7694h.m13910A(e, "Function", false, 2) || C7694h.m13910A(e, "KFunction", false, 2) || C7694h.m13910A(e, "SuspendFunction", false, 2) || C7694h.m13910A(e, "KSuspendFunction", false, 2)) && FunctionClassKind.Companion.parseClassName(e, bVar) != null;
    }
}
