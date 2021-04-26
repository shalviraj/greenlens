package kotlin.reflect.jvm.internal.impl.builtins.functions;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6213n0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6219q;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6251y;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6111i0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6123n0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6136r;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7448b1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7484h1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p299a.p300a.p301a.p303y0.p411m.C7609m;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p334t.C6801s;
import p298d.p334t.C6802t;
import p298d.p334t.C6803u;
import p298d.p344x.p346c.C6888i;

public final class FunctionInvokeDescriptor extends C6111i0 {
    public static final Factory Factory = new Factory((DefaultConstructorMarker) null);

    public static final class Factory {
        private Factory() {
        }

        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final C6030b1 createValueParameter(FunctionInvokeDescriptor functionInvokeDescriptor, int i, C6248w0 w0Var) {
            String str;
            String e = w0Var.getName().mo23886e();
            C6888i.m12437d(e, "typeParameter.name.asString()");
            if (C6888i.m12434a(e, ExifInterface.GPS_DIRECTION_TRUE)) {
                str = "instance";
            } else if (C6888i.m12434a(e, ExifInterface.LONGITUDE_EAST)) {
                str = "receiver";
            } else {
                str = e.toLowerCase();
                C6888i.m12437d(str, "(this as java.lang.String).toLowerCase()");
            }
            Objects.requireNonNull(C6060h.f11920d);
            C6060h hVar = C6060h.C6061a.f11922b;
            C6717d l = C6717d.m12270l(str);
            C6888i.m12437d(l, "identifier(name)");
            C7489j0 defaultType = w0Var.getDefaultType();
            C6888i.m12437d(defaultType, "typeParameter.defaultType");
            C6234r0 r0Var = C6234r0.f12257a;
            C6888i.m12437d(r0Var, "NO_SOURCE");
            return new C6123n0(functionInvokeDescriptor, (C6030b1) null, i, hVar, l, defaultType, false, false, false, (C7452c0) null, r0Var);
        }

        public final FunctionInvokeDescriptor create(FunctionClassDescriptor functionClassDescriptor, boolean z) {
            C6888i.m12438e(functionClassDescriptor, "functionClass");
            List<C6248w0> declaredTypeParameters = functionClassDescriptor.getDeclaredTypeParameters();
            FunctionInvokeDescriptor functionInvokeDescriptor = new FunctionInvokeDescriptor(functionClassDescriptor, (FunctionInvokeDescriptor) null, C6023b.C6024a.DECLARATION, z, (DefaultConstructorMarker) null);
            C6213n0 thisAsReceiverParameter = functionClassDescriptor.getThisAsReceiverParameter();
            C6798p pVar = C6798p.f13713g;
            ArrayList arrayList = new ArrayList();
            for (T next : declaredTypeParameters) {
                if (!(((C6248w0) next).mo23137j() == C7484h1.IN_VARIANCE)) {
                    break;
                }
                arrayList.add(next);
            }
            Iterable f0 = C6790h.m12351f0(arrayList);
            ArrayList arrayList2 = new ArrayList(C5266a.m9892V(f0, 10));
            Iterator it = ((C6802t) f0).iterator();
            while (true) {
                C6803u uVar = (C6803u) it;
                if (uVar.hasNext()) {
                    C6801s sVar = (C6801s) uVar.next();
                    arrayList2.add(createValueParameter(functionInvokeDescriptor, sVar.f13716a, (C6248w0) sVar.f13717b));
                } else {
                    functionInvokeDescriptor.initialize((C6213n0) null, thisAsReceiverParameter, (List<? extends C6248w0>) pVar, (List<C6030b1>) arrayList2, (C7452c0) ((C6248w0) C6790h.m12371y(declaredTypeParameters)).getDefaultType(), C6251y.ABSTRACT, C6219q.f12245e);
                    functionInvokeDescriptor.setHasSynthesizedParameterNames(true);
                    return functionInvokeDescriptor;
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FunctionInvokeDescriptor(C6206k kVar, FunctionInvokeDescriptor functionInvokeDescriptor, C6023b.C6024a aVar, boolean z) {
        super(kVar, functionInvokeDescriptor, C6060h.C6061a.f11922b, C7609m.f15075g, aVar, C6234r0.f12257a);
        Objects.requireNonNull(C6060h.f11920d);
        setOperator(true);
        setSuspend(z);
        setHasStableParameterNames(false);
    }

    public /* synthetic */ FunctionInvokeDescriptor(C6206k kVar, FunctionInvokeDescriptor functionInvokeDescriptor, C6023b.C6024a aVar, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, functionInvokeDescriptor, aVar, z);
    }

    private final C6244v replaceParameterNames(List<C6717d> list) {
        boolean z;
        C6717d dVar;
        int size = getValueParameters().size() - list.size();
        List<C6030b1> valueParameters = getValueParameters();
        C6888i.m12437d(valueParameters, "valueParameters");
        ArrayList arrayList = new ArrayList(C5266a.m9892V(valueParameters, 10));
        for (C6030b1 b1Var : valueParameters) {
            C6717d name = b1Var.getName();
            C6888i.m12437d(name, "it.name");
            int d = b1Var.mo23128d();
            int i = d - size;
            if (i >= 0 && (dVar = list.get(i)) != null) {
                name = dVar;
            }
            arrayList.add(b1Var.mo23127Q(this, name, d));
        }
        C6136r.C6139c newCopyBuilder = newCopyBuilder(C7448b1.f14862b);
        boolean z2 = false;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C6717d) it.next()) == null) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        newCopyBuilder.f12144u = Boolean.valueOf(z2);
        newCopyBuilder.f12130g = arrayList;
        newCopyBuilder.f12128e = getOriginal();
        C6888i.m12437d(newCopyBuilder, "newCopyBuilder(TypeSubstitutor.EMPTY)\n                .setHasSynthesizedParameterNames(parameterNames.any { it == null })\n                .setValueParameters(newValueParameters)\n                .setOriginal(original)");
        C6244v doSubstitute = super.doSubstitute(newCopyBuilder);
        C6888i.m12436c(doSubstitute);
        return doSubstitute;
    }

    public C6136r createSubstitutedCopy(C6206k kVar, C6244v vVar, C6023b.C6024a aVar, C6717d dVar, C6060h hVar, C6234r0 r0Var) {
        C6888i.m12438e(kVar, "newOwner");
        C6888i.m12438e(aVar, "kind");
        C6888i.m12438e(hVar, "annotations");
        C6888i.m12438e(r0Var, "source");
        return new FunctionInvokeDescriptor(kVar, (FunctionInvokeDescriptor) vVar, aVar, isSuspend());
    }

    public C6244v doSubstitute(C6136r.C6139c cVar) {
        boolean z;
        C6888i.m12438e(cVar, "configuration");
        FunctionInvokeDescriptor functionInvokeDescriptor = (FunctionInvokeDescriptor) super.doSubstitute(cVar);
        if (functionInvokeDescriptor == null) {
            return null;
        }
        List<C6030b1> valueParameters = functionInvokeDescriptor.getValueParameters();
        C6888i.m12437d(valueParameters, "substituted.valueParameters");
        boolean z2 = false;
        if (!valueParameters.isEmpty()) {
            Iterator<T> it = valueParameters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C7452c0 a = ((C6030b1) it.next()).mo23093a();
                C6888i.m12437d(a, "it.type");
                if (FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(a) != null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
        }
        z2 = true;
        if (z2) {
            return functionInvokeDescriptor;
        }
        List<C6030b1> valueParameters2 = functionInvokeDescriptor.getValueParameters();
        C6888i.m12437d(valueParameters2, "substituted.valueParameters");
        ArrayList arrayList = new ArrayList(C5266a.m9892V(valueParameters2, 10));
        for (C6030b1 a2 : valueParameters2) {
            C7452c0 a3 = a2.mo23093a();
            C6888i.m12437d(a3, "it.type");
            arrayList.add(FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(a3));
        }
        return functionInvokeDescriptor.replaceParameterNames(arrayList);
    }

    public boolean isExternal() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    public boolean isTailrec() {
        return false;
    }
}
