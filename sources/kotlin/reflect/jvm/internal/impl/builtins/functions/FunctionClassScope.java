package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.List;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7271e;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p334t.C6798p;
import p298d.p344x.p346c.C6888i;

public final class FunctionClassScope extends C7271e {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            FunctionClassKind.values();
            int[] iArr = new int[4];
            FunctionClassKind functionClassKind = FunctionClassKind.Function;
            iArr[0] = 1;
            FunctionClassKind functionClassKind2 = FunctionClassKind.SuspendFunction;
            iArr[1] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunctionClassScope(C7441m mVar, FunctionClassDescriptor functionClassDescriptor) {
        super(mVar, functionClassDescriptor);
        C6888i.m12438e(mVar, "storageManager");
        C6888i.m12438e(functionClassDescriptor, "containingClass");
    }

    public List<C6244v> computeDeclaredFunctions() {
        FunctionInvokeDescriptor functionInvokeDescriptor;
        int ordinal = ((FunctionClassDescriptor) getContainingClass()).getFunctionKind().ordinal();
        if (ordinal == 0) {
            functionInvokeDescriptor = FunctionInvokeDescriptor.Factory.create((FunctionClassDescriptor) getContainingClass(), false);
        } else if (ordinal != 1) {
            return C6798p.f13713g;
        } else {
            functionInvokeDescriptor = FunctionInvokeDescriptor.Factory.create((FunctionClassDescriptor) getContainingClass(), true);
        }
        return C5266a.m9910Y2(functionInvokeDescriptor);
    }
}
