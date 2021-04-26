package p298d.p299a.p300a.p301a.p303y0.p391i;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6051f;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6157j;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6219q;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6233r;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6110i;

/* renamed from: d.a.a.a.y0.i.f */
public class C7192f extends C6110i {
    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "containingClass";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7192f(C6046e eVar, C6234r0 r0Var, boolean z) {
        super(eVar, (C6157j) null, C6060h.C6061a.f11922b, true, C6023b.C6024a.DECLARATION, r0Var);
        C6233r rVar;
        if (eVar == null) {
            $$$reportNull$$$0(0);
            throw null;
        } else if (r0Var != null) {
            Objects.requireNonNull(C6060h.f11920d);
            List emptyList = Collections.emptyList();
            int i = C7193g.f14418a;
            C6051f kind = eVar.getKind();
            if (kind == C6051f.ENUM_CLASS || kind.mo23161d()) {
                rVar = C6219q.f12241a;
                if (rVar == null) {
                    C7193g.m13021a(47);
                    throw null;
                }
            } else if (C7193g.m13042v(eVar)) {
                if (z) {
                    rVar = C6219q.f12244d;
                    if (rVar == null) {
                        C7193g.m13021a(48);
                        throw null;
                    }
                } else {
                    rVar = C6219q.f12241a;
                    if (rVar == null) {
                        C7193g.m13021a(49);
                        throw null;
                    }
                }
            } else if (C7193g.m13034n(eVar)) {
                rVar = C6219q.f12251k;
                if (rVar == null) {
                    C7193g.m13021a(50);
                    throw null;
                }
            } else {
                rVar = C6219q.f12245e;
                if (rVar == null) {
                    C7193g.m13021a(51);
                    throw null;
                }
            }
            mo23245D(emptyList, rVar);
        } else {
            $$$reportNull$$$0(1);
            throw null;
        }
    }
}
