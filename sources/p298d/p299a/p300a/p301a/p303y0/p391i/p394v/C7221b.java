package p298d.p299a.p300a.p301a.p303y0.p391i.p394v;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.i.v.b */
public final class C7221b extends C7227g<List<? extends C7227g<?>>> {

    /* renamed from: b */
    public final C6862l<C6021a0, C7452c0> f14456b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7221b(List<? extends C7227g<?>> list, C6862l<? super C6021a0, ? extends C7452c0> lVar) {
        super(list);
        C6888i.m12438e(list, "value");
        C6888i.m12438e(lVar, "computeType");
        this.f14456b = lVar;
    }

    /* renamed from: a */
    public C7452c0 mo24893a(C6021a0 a0Var) {
        C6888i.m12438e(a0Var, "module");
        C7452c0 invoke = this.f14456b.invoke(a0Var);
        if (!KotlinBuiltIns.isArray(invoke) && !KotlinBuiltIns.isPrimitiveArray(invoke)) {
            boolean isUnsignedArrayType = KotlinBuiltIns.isUnsignedArrayType(invoke);
        }
        return invoke;
    }
}
