package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6054b;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p390h.C7150c;

/* renamed from: d.a.a.a.y0.b.h1.m */
public abstract class C6120m extends C6054b implements C6206k {
    private final C6717d name;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (!(i == 2 || i == 3)) {
            if (i == 4) {
                objArr[2] = "toString";
            } else if (!(i == 5 || i == 6)) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 2 || i == 3 || i == 5 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6120m(C6060h hVar, C6717d dVar) {
        super(hVar);
        if (hVar == null) {
            $$$reportNull$$$0(0);
        }
        if (dVar == null) {
            $$$reportNull$$$0(1);
        }
        this.name = dVar;
    }

    public static String toString(C6206k kVar) {
        if (kVar == null) {
            $$$reportNull$$$0(4);
        }
        try {
            String str = C7150c.f14298b.mo24787q(kVar) + "[" + kVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(kVar)) + "]";
            if (str == null) {
                $$$reportNull$$$0(5);
            }
            return str;
        } catch (Throwable unused) {
            String str2 = kVar.getClass().getSimpleName() + " " + kVar.getName();
            if (str2 == null) {
                $$$reportNull$$$0(6);
            }
            return str2;
        }
    }

    public C6717d getName() {
        C6717d dVar = this.name;
        if (dVar == null) {
            $$$reportNull$$$0(2);
        }
        return dVar;
    }

    public C6206k getOriginal() {
        return this;
    }

    public String toString() {
        return toString(this);
    }
}
