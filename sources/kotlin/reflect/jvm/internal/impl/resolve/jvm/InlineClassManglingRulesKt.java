package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6034d;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6219q;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7193g;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7197i;
import p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p344x.p346c.C6888i;

public final class InlineClassManglingRulesKt {
    private static final boolean isDontMangleClass(C6046e eVar) {
        return C6888i.m12434a(C7255a.m13135h(eVar), StandardNames.RESULT_FQ_NAME);
    }

    public static final boolean isInlineClassThatRequiresMangling(C6206k kVar) {
        C6888i.m12438e(kVar, "<this>");
        return C7197i.m13050b(kVar) && !isDontMangleClass((C6046e) kVar);
    }

    public static final boolean isInlineClassThatRequiresMangling(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "<this>");
        C6083h declarationDescriptor = c0Var.mo24887V().getDeclarationDescriptor();
        return C6888i.m12434a(declarationDescriptor == null ? null : Boolean.valueOf(isInlineClassThatRequiresMangling((C6206k) declarationDescriptor)), Boolean.TRUE);
    }

    private static final boolean isTypeParameterWithUpperBoundThatRequiresMangling(C7452c0 c0Var) {
        C6083h declarationDescriptor = c0Var.mo24887V().getDeclarationDescriptor();
        C6248w0 w0Var = declarationDescriptor instanceof C6248w0 ? (C6248w0) declarationDescriptor : null;
        if (w0Var == null) {
            return false;
        }
        return requiresFunctionNameManglingInParameterTypes(C5266a.m9850N1(w0Var));
    }

    private static final boolean requiresFunctionNameManglingInParameterTypes(C7452c0 c0Var) {
        return isInlineClassThatRequiresMangling(c0Var) || isTypeParameterWithUpperBoundThatRequiresMangling(c0Var);
    }

    public static final boolean shouldHideConstructorDueToInlineClassTypeValueParameters(C6023b bVar) {
        C6888i.m12438e(bVar, "descriptor");
        C6034d dVar = bVar instanceof C6034d ? (C6034d) bVar : null;
        if (dVar == null || C6219q.m11193e(dVar.getVisibility())) {
            return false;
        }
        C6046e r = dVar.mo23249r();
        C6888i.m12437d(r, "constructorDescriptor.constructedClass");
        if (C7197i.m13050b(r) || C7193g.m13042v(dVar.mo23249r())) {
            return false;
        }
        List<C6030b1> valueParameters = dVar.getValueParameters();
        C6888i.m12437d(valueParameters, "constructorDescriptor.valueParameters");
        if (valueParameters.isEmpty()) {
            return false;
        }
        for (C6030b1 a : valueParameters) {
            C7452c0 a2 = a.mo23093a();
            C6888i.m12437d(a2, "it.type");
            if (requiresFunctionNameManglingInParameterTypes(a2)) {
                return true;
            }
        }
        return false;
    }
}
