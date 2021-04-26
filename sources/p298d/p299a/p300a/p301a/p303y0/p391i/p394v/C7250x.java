package p298d.p299a.p300a.p301a.p303y0.p391i.p394v;

import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7570v;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.i.v.x */
public final class C7250x extends C7222b0<Byte> {
    public C7250x(byte b) {
        super(Byte.valueOf(b));
    }

    /* renamed from: a */
    public C7452c0 mo24893a(C6021a0 a0Var) {
        C6888i.m12438e(a0Var, "module");
        C6046e N0 = C5266a.m9849N0(a0Var, StandardNames.FqNames.uByte);
        C7489j0 defaultType = N0 == null ? null : N0.getDefaultType();
        if (defaultType != null) {
            return defaultType;
        }
        C7489j0 d = C7570v.m13783d("Unsigned type UByte not found");
        C6888i.m12437d(d, "createErrorType(\"Unsigned type UByte not found\")");
        return d;
    }

    public String toString() {
        return ((Number) this.f14459a).intValue() + ".toUByte()";
    }
}
