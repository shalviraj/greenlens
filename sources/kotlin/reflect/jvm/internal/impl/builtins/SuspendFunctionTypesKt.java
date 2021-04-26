package kotlin.reflect.jvm.internal.impl.builtins;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6051f;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6219q;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6233r;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6251y;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6091b0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6121m0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6126o;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7417e;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7455d0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7484h1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7567t0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7570v;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7580w0;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;

public final class SuspendFunctionTypesKt {
    private static final C6091b0 FAKE_CONTINUATION_CLASS_DESCRIPTOR_EXPERIMENTAL;
    private static final C6091b0 FAKE_CONTINUATION_CLASS_DESCRIPTOR_RELEASE;

    static {
        C6021a0 i = C7570v.m13788i();
        C6888i.m12437d(i, "getErrorModule()");
        C6126o oVar = new C6126o(i, StandardNames.COROUTINES_PACKAGE_FQ_NAME_EXPERIMENTAL);
        C6051f fVar = C6051f.INTERFACE;
        C6717d g = StandardNames.CONTINUATION_INTERFACE_FQ_NAME_EXPERIMENTAL.mo23868g();
        C6234r0 r0Var = C6234r0.f12257a;
        C7441m mVar = C7417e.f14830e;
        C6091b0 b0Var = new C6091b0(oVar, fVar, false, false, g, r0Var, mVar);
        C6251y yVar = C6251y.ABSTRACT;
        b0Var.f12002l = yVar;
        C6233r rVar = C6219q.f12245e;
        if (rVar != null) {
            b0Var.f12003m = rVar;
            Objects.requireNonNull(C6060h.f11920d);
            C6060h hVar = C6060h.C6061a.f11922b;
            C7484h1 h1Var = C7484h1.IN_VARIANCE;
            b0Var.mo23198z(C5266a.m9910Y2(C6121m0.m10978W(b0Var, hVar, false, h1Var, C6717d.m12270l(ExifInterface.GPS_DIRECTION_TRUE), 0, mVar)));
            b0Var.mo23197x();
            FAKE_CONTINUATION_CLASS_DESCRIPTOR_EXPERIMENTAL = b0Var;
            C6021a0 i2 = C7570v.m13788i();
            C6888i.m12437d(i2, "getErrorModule()");
            C6091b0 b0Var2 = new C6091b0(new C6126o(i2, StandardNames.COROUTINES_PACKAGE_FQ_NAME_RELEASE), fVar, false, false, StandardNames.CONTINUATION_INTERFACE_FQ_NAME_RELEASE.mo23868g(), r0Var, mVar);
            b0Var2.f12002l = yVar;
            b0Var2.f12003m = rVar;
            b0Var2.mo23198z(C5266a.m9910Y2(C6121m0.m10978W(b0Var2, hVar, false, h1Var, C6717d.m12270l(ExifInterface.GPS_DIRECTION_TRUE), 0, mVar)));
            b0Var2.mo23197x();
            FAKE_CONTINUATION_CLASS_DESCRIPTOR_RELEASE = b0Var2;
            return;
        }
        C6091b0.$$$reportNull$$$0(9);
        throw null;
    }

    public static final boolean isContinuation(C6714b bVar, boolean z) {
        return C6888i.m12434a(bVar, z ? StandardNames.CONTINUATION_INTERFACE_FQ_NAME_RELEASE : StandardNames.CONTINUATION_INTERFACE_FQ_NAME_EXPERIMENTAL);
    }

    public static final C7489j0 transformSuspendFunctionToRuntimeFunctionType(C7452c0 c0Var, boolean z) {
        C6888i.m12438e(c0Var, "suspendFunType");
        FunctionTypesKt.isSuspendFunctionType(c0Var);
        KotlinBuiltIns g1 = C5266a.m9955g1(c0Var);
        C6060h annotations = c0Var.getAnnotations();
        C7452c0 receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(c0Var);
        List<C7580w0> valueParameterTypesFromFunctionType = FunctionTypesKt.getValueParameterTypesFromFunctionType(c0Var);
        ArrayList arrayList = new ArrayList(C5266a.m9892V(valueParameterTypesFromFunctionType, 10));
        for (C7580w0 a : valueParameterTypesFromFunctionType) {
            arrayList.add(a.mo25161a());
        }
        C7455d0 d0Var = C7455d0.f14869a;
        Objects.requireNonNull(C6060h.f11920d);
        C6060h hVar = C6060h.C6061a.f11922b;
        C7567t0 typeConstructor = (z ? FAKE_CONTINUATION_CLASS_DESCRIPTOR_RELEASE : FAKE_CONTINUATION_CLASS_DESCRIPTOR_EXPERIMENTAL).getTypeConstructor();
        C6888i.m12437d(typeConstructor, "if (isReleaseCoroutines) FAKE_CONTINUATION_CLASS_DESCRIPTOR_RELEASE.typeConstructor\n                    else FAKE_CONTINUATION_CLASS_DESCRIPTOR_EXPERIMENTAL.typeConstructor");
        List J = C6790h.m12323J(arrayList, C7455d0.m13432g(hVar, typeConstructor, C5266a.m9910Y2(C5266a.m9794E(FunctionTypesKt.getReturnTypeFromFunctionType(c0Var))), false, (C7495e) null, 16));
        C7489j0 nullableAnyType = C5266a.m9955g1(c0Var).getNullableAnyType();
        C6888i.m12437d(nullableAnyType, "suspendFunType.builtIns.nullableAnyType");
        return FunctionTypesKt.createFunctionType$default(g1, annotations, receiverTypeFromFunctionType, J, (List) null, nullableAnyType, false, 64, (Object) null).mo23545Z(c0Var.mo23566W());
    }
}
