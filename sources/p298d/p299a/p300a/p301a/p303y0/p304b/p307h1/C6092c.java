package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import java.util.Objects;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6242u0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7484h1;

/* renamed from: d.a.a.a.y0.b.h1.c */
public abstract class C6092c extends C6103g {
    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "variance";
        } else if (i == 4) {
            objArr[0] = "source";
        } else if (i != 5) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "supertypeLoopChecker";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6092c(C7441m mVar, C6206k kVar, C6717d dVar, C7484h1 h1Var, boolean z, int i, C6234r0 r0Var, C6242u0 u0Var) {
        super(mVar, kVar, C6060h.C6061a.f11922b, dVar, h1Var, z, i, r0Var, u0Var);
        if (mVar == null) {
            $$$reportNull$$$0(0);
            throw null;
        } else if (kVar == null) {
            $$$reportNull$$$0(1);
            throw null;
        } else if (dVar == null) {
            $$$reportNull$$$0(2);
            throw null;
        } else if (u0Var != null) {
            Objects.requireNonNull(C6060h.f11920d);
        } else {
            $$$reportNull$$$0(5);
            throw null;
        }
    }

    public String toString() {
        Object[] objArr = new Object[3];
        String str = "";
        objArr[0] = this.f12056h ? "reified " : str;
        if (mo23137j() != C7484h1.INVARIANT) {
            str = mo23137j() + " ";
        }
        objArr[1] = str;
        objArr[2] = getName();
        return String.format("%s%s%s", objArr);
    }
}
