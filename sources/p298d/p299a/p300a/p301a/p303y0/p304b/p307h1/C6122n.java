package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6208l;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6212n;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;

/* renamed from: d.a.a.a.y0.b.h1.n */
public abstract class C6122n extends C6120m implements C6208l {
    private final C6206k containingDeclaration;
    private final C6234r0 source;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5 || i == 6) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 4 || i == 5 || i == 6)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6122n(C6206k kVar, C6060h hVar, C6717d dVar, C6234r0 r0Var) {
        super(hVar, dVar);
        if (kVar == null) {
            $$$reportNull$$$0(0);
        }
        if (hVar == null) {
            $$$reportNull$$$0(1);
        }
        if (dVar == null) {
            $$$reportNull$$$0(2);
        }
        if (r0Var == null) {
            $$$reportNull$$$0(3);
        }
        this.containingDeclaration = kVar;
        this.source = r0Var;
    }

    public C6206k getContainingDeclaration() {
        C6206k kVar = this.containingDeclaration;
        if (kVar == null) {
            $$$reportNull$$$0(5);
        }
        return kVar;
    }

    public C6212n getOriginal() {
        C6212n nVar = (C6212n) super.getOriginal();
        if (nVar == null) {
            $$$reportNull$$$0(4);
        }
        return nVar;
    }

    public C6234r0 getSource() {
        C6234r0 r0Var = this.source;
        if (r0Var == null) {
            $$$reportNull$$$0(6);
        }
        return r0Var;
    }
}
