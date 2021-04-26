package p298d.p299a.p300a.p301a.p303y0.p304b.p305f1;

import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7484h1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.b.f1.f */
public final class C6058f extends C6890k implements C6862l<C6021a0, C7452c0> {

    /* renamed from: g */
    public final /* synthetic */ KotlinBuiltIns f11914g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6058f(KotlinBuiltIns kotlinBuiltIns) {
        super(1);
        this.f11914g = kotlinBuiltIns;
    }

    public Object invoke(Object obj) {
        C6021a0 a0Var = (C6021a0) obj;
        C6888i.m12438e(a0Var, "module");
        C7489j0 arrayType = a0Var.getBuiltIns().getArrayType(C7484h1.INVARIANT, this.f11914g.getStringType());
        C6888i.m12437d(arrayType, "module.builtIns.getArrayType(Variance.INVARIANT, stringType)");
        return arrayType;
    }
}
