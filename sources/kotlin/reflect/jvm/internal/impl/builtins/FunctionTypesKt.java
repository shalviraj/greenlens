package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import p005b.p291q.p292a.C5266a;
import p298d.C6768j;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6055c;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6064j;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6715c;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7249w;
import p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7455d0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7580w0;
import p298d.p334t.C6790h;
import p298d.p334t.C6799q;
import p298d.p344x.p346c.C6888i;

public final class FunctionTypesKt {
    public static final C7489j0 createFunctionType(KotlinBuiltIns kotlinBuiltIns, C6060h hVar, C7452c0 c0Var, List<? extends C7452c0> list, List<C6717d> list2, C7452c0 c0Var2, boolean z) {
        C6888i.m12438e(kotlinBuiltIns, "builtIns");
        C6888i.m12438e(hVar, "annotations");
        C6888i.m12438e(list, "parameterTypes");
        C6888i.m12438e(c0Var2, "returnType");
        List<C7580w0> functionTypeArgumentProjections = getFunctionTypeArgumentProjections(c0Var, list, list2, c0Var2, kotlinBuiltIns);
        int size = list.size();
        if (c0Var != null) {
            size++;
        }
        C6046e functionDescriptor = getFunctionDescriptor(kotlinBuiltIns, size, z);
        if (c0Var != null) {
            hVar = withExtensionFunctionAnnotation(hVar, kotlinBuiltIns);
        }
        C7455d0 d0Var = C7455d0.f14869a;
        return C7455d0.m13430e(hVar, functionDescriptor, functionTypeArgumentProjections);
    }

    public static /* synthetic */ C7489j0 createFunctionType$default(KotlinBuiltIns kotlinBuiltIns, C6060h hVar, C7452c0 c0Var, List list, List list2, C7452c0 c0Var2, boolean z, int i, Object obj) {
        if ((i & 64) != 0) {
            z = false;
        }
        return createFunctionType(kotlinBuiltIns, hVar, c0Var, list, list2, c0Var2, z);
    }

    public static final C6717d extractParameterNameFromFunctionTypeArgument(C7452c0 c0Var) {
        String str;
        C6888i.m12438e(c0Var, "<this>");
        C6055c j = c0Var.getAnnotations().mo23168j(StandardNames.FqNames.parameterName);
        if (j == null) {
            return null;
        }
        Object Q = C6790h.m12330Q(j.mo23163b().values());
        C7249w wVar = Q instanceof C7249w ? (C7249w) Q : null;
        if (wVar == null || (str = (String) wVar.f14459a) == null || !C6717d.m12271n(str)) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        return C6717d.m12270l(str);
    }

    public static final C6046e getFunctionDescriptor(KotlinBuiltIns kotlinBuiltIns, int i, boolean z) {
        C6888i.m12438e(kotlinBuiltIns, "builtIns");
        C6046e suspendFunction = z ? kotlinBuiltIns.getSuspendFunction(i) : kotlinBuiltIns.getFunction(i);
        C6888i.m12437d(suspendFunction, "if (isSuspendFunction) builtIns.getSuspendFunction(parameterCount) else builtIns.getFunction(parameterCount)");
        return suspendFunction;
    }

    public static final List<C7580w0> getFunctionTypeArgumentProjections(C7452c0 c0Var, List<? extends C7452c0> list, List<C6717d> list2, C7452c0 c0Var2, KotlinBuiltIns kotlinBuiltIns) {
        C6717d dVar;
        C6888i.m12438e(list, "parameterTypes");
        C6888i.m12438e(c0Var2, "returnType");
        C6888i.m12438e(kotlinBuiltIns, "builtIns");
        int i = 0;
        ArrayList arrayList = new ArrayList(list.size() + (c0Var != null ? 1 : 0) + 1);
        C5266a.m10001o(arrayList, c0Var == null ? null : C5266a.m9794E(c0Var));
        for (T next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C7452c0 c0Var3 = (C7452c0) next;
                if (list2 == null || (dVar = list2.get(i)) == null || dVar.f13624h) {
                    dVar = null;
                }
                if (dVar != null) {
                    C6714b bVar = StandardNames.FqNames.parameterName;
                    C6717d l = C6717d.m12270l("name");
                    String e = dVar.mo23886e();
                    C6888i.m12437d(e, "name.asString()");
                    c0Var3 = C5266a.m9780B3(c0Var3, C6060h.f11920d.mo23170a(C6790h.m12321H(c0Var3.getAnnotations(), new C6064j(kotlinBuiltIns, bVar, C5266a.m9963h3(new C6768j(l, new C7249w(e)))))));
                }
                arrayList.add(C5266a.m9794E(c0Var3));
                i = i2;
            } else {
                C6790h.m12333T();
                throw null;
            }
        }
        arrayList.add(C5266a.m9794E(c0Var2));
        return arrayList;
    }

    public static final FunctionClassKind getFunctionalClassKind(C6206k kVar) {
        C6888i.m12438e(kVar, "<this>");
        if ((kVar instanceof C6046e) && KotlinBuiltIns.isUnderKotlinPackage(kVar)) {
            return getFunctionalClassKind(C7255a.m13136i(kVar));
        }
        return null;
    }

    private static final FunctionClassKind getFunctionalClassKind(C6715c cVar) {
        if (!cVar.mo23879f() || cVar.mo23877e()) {
            return null;
        }
        FunctionClassKind.Companion companion = FunctionClassKind.Companion;
        String e = cVar.mo23881h().mo23886e();
        C6888i.m12437d(e, "shortName().asString()");
        C6714b e2 = cVar.mo23883i().mo23865e();
        C6888i.m12437d(e2, "toSafe().parent()");
        return companion.getFunctionalClassKind(e, e2);
    }

    public static final C7452c0 getReceiverTypeFromFunctionType(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "<this>");
        isBuiltinFunctionalType(c0Var);
        if (isTypeAnnotatedWithExtensionFunctionType(c0Var)) {
            return ((C7580w0) C6790h.m12361o(c0Var.mo24886U())).mo25161a();
        }
        return null;
    }

    public static final C7452c0 getReturnTypeFromFunctionType(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "<this>");
        isBuiltinFunctionalType(c0Var);
        C7452c0 a = ((C7580w0) C6790h.m12371y(c0Var.mo24886U())).mo25161a();
        C6888i.m12437d(a, "arguments.last().type");
        return a;
    }

    public static final List<C7580w0> getValueParameterTypesFromFunctionType(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "<this>");
        isBuiltinFunctionalType(c0Var);
        List<C7580w0> U = c0Var.mo24886U();
        return U.subList(isBuiltinExtensionFunctionalType(c0Var) ? 1 : 0, U.size() - 1);
    }

    public static final boolean isBuiltinExtensionFunctionalType(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "<this>");
        return isBuiltinFunctionalType(c0Var) && isTypeAnnotatedWithExtensionFunctionType(c0Var);
    }

    public static final boolean isBuiltinFunctionalClassDescriptor(C6206k kVar) {
        C6888i.m12438e(kVar, "<this>");
        FunctionClassKind functionalClassKind = getFunctionalClassKind(kVar);
        return functionalClassKind == FunctionClassKind.Function || functionalClassKind == FunctionClassKind.SuspendFunction;
    }

    public static final boolean isBuiltinFunctionalType(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "<this>");
        C6083h declarationDescriptor = c0Var.mo24887V().getDeclarationDescriptor();
        return C6888i.m12434a(declarationDescriptor == null ? null : Boolean.valueOf(isBuiltinFunctionalClassDescriptor(declarationDescriptor)), Boolean.TRUE);
    }

    public static final boolean isFunctionType(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "<this>");
        C6083h declarationDescriptor = c0Var.mo24887V().getDeclarationDescriptor();
        return (declarationDescriptor == null ? null : getFunctionalClassKind((C6206k) declarationDescriptor)) == FunctionClassKind.Function;
    }

    public static final boolean isSuspendFunctionType(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "<this>");
        C6083h declarationDescriptor = c0Var.mo24887V().getDeclarationDescriptor();
        return (declarationDescriptor == null ? null : getFunctionalClassKind((C6206k) declarationDescriptor)) == FunctionClassKind.SuspendFunction;
    }

    private static final boolean isTypeAnnotatedWithExtensionFunctionType(C7452c0 c0Var) {
        return c0Var.getAnnotations().mo23168j(StandardNames.FqNames.extensionFunctionType) != null;
    }

    public static final C6060h withExtensionFunctionAnnotation(C6060h hVar, KotlinBuiltIns kotlinBuiltIns) {
        C6888i.m12438e(hVar, "<this>");
        C6888i.m12438e(kotlinBuiltIns, "builtIns");
        C6714b bVar = StandardNames.FqNames.extensionFunctionType;
        return hVar.mo23169v(bVar) ? hVar : C6060h.f11920d.mo23170a(C6790h.m12321H(hVar, new C6064j(kotlinBuiltIns, bVar, C6799q.f13714g)));
    }
}
