package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6019a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6213n0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6233r;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6251y;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;

/* renamed from: d.a.a.a.y0.b.h1.i0 */
public class C6111i0 extends C6136r implements C6232q0 {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 13 || i == 17 || i == 18 || i == 23 || i == 24) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 13 || i == 17 || i == 18 || i == 23 || i == 24) ? 2 : 3)];
        switch (i) {
            case 1:
            case 6:
            case 21:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 20:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 22:
                objArr[0] = "source";
                break;
            case 10:
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 15:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 16:
                objArr[0] = "visibility";
                break;
            case 13:
            case 17:
            case 18:
            case 23:
            case 24:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 19:
                objArr[0] = "newOwner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 13 || i == 17) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "getOriginal";
        } else if (i == 23) {
            objArr[1] = "copy";
        } else if (i != 24) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
                objArr[2] = "initialize";
                break;
            case 13:
            case 17:
            case 18:
            case 23:
            case 24:
                break;
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 13 || i == 17 || i == 18 || i == 23 || i == 24) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6111i0(C6206k kVar, C6232q0 q0Var, C6060h hVar, C6717d dVar, C6023b.C6024a aVar, C6234r0 r0Var) {
        super(kVar, q0Var, hVar, dVar, aVar, r0Var);
        if (kVar == null) {
            $$$reportNull$$$0(0);
        }
        if (hVar == null) {
            $$$reportNull$$$0(1);
        }
        if (dVar == null) {
            $$$reportNull$$$0(2);
        }
        if (aVar == null) {
            $$$reportNull$$$0(3);
        }
        if (r0Var == null) {
            $$$reportNull$$$0(4);
        }
    }

    public static C6111i0 create(C6206k kVar, C6060h hVar, C6717d dVar, C6023b.C6024a aVar, C6234r0 r0Var) {
        if (kVar == null) {
            $$$reportNull$$$0(5);
        }
        if (hVar == null) {
            $$$reportNull$$$0(6);
        }
        if (dVar == null) {
            $$$reportNull$$$0(7);
        }
        if (aVar == null) {
            $$$reportNull$$$0(8);
        }
        if (r0Var == null) {
            $$$reportNull$$$0(9);
        }
        return new C6111i0(kVar, (C6232q0) null, hVar, dVar, aVar, r0Var);
    }

    public C6232q0 copy(C6206k kVar, C6251y yVar, C6233r rVar, C6023b.C6024a aVar, boolean z) {
        C6232q0 q0Var = (C6232q0) super.copy(kVar, yVar, rVar, aVar, z);
        if (q0Var == null) {
            $$$reportNull$$$0(23);
        }
        return q0Var;
    }

    public C6136r createSubstitutedCopy(C6206k kVar, C6244v vVar, C6023b.C6024a aVar, C6717d dVar, C6060h hVar, C6234r0 r0Var) {
        if (kVar == null) {
            $$$reportNull$$$0(19);
        }
        if (aVar == null) {
            $$$reportNull$$$0(20);
        }
        if (hVar == null) {
            $$$reportNull$$$0(21);
        }
        if (r0Var == null) {
            $$$reportNull$$$0(22);
        }
        C6232q0 q0Var = (C6232q0) vVar;
        if (dVar == null) {
            dVar = getName();
        }
        return new C6111i0(kVar, q0Var, hVar, dVar, aVar, r0Var);
    }

    public C6232q0 getOriginal() {
        C6232q0 q0Var = (C6232q0) super.getOriginal();
        if (q0Var == null) {
            $$$reportNull$$$0(18);
        }
        return q0Var;
    }

    public C6111i0 initialize(C6213n0 n0Var, C6213n0 n0Var2, List<? extends C6248w0> list, List<C6030b1> list2, C7452c0 c0Var, C6251y yVar, C6233r rVar) {
        if (list == null) {
            $$$reportNull$$$0(10);
        }
        if (list2 == null) {
            $$$reportNull$$$0(11);
        }
        if (rVar == null) {
            $$$reportNull$$$0(12);
        }
        C6111i0 initialize = initialize(n0Var, n0Var2, list, list2, c0Var, yVar, rVar, (Map<? extends C6019a.C6020a<?>, ?>) null);
        if (initialize == null) {
            $$$reportNull$$$0(13);
        }
        return initialize;
    }

    public C6111i0 initialize(C6213n0 n0Var, C6213n0 n0Var2, List<? extends C6248w0> list, List<C6030b1> list2, C7452c0 c0Var, C6251y yVar, C6233r rVar, Map<? extends C6019a.C6020a<?>, ?> map) {
        if (list == null) {
            $$$reportNull$$$0(14);
        }
        if (list2 == null) {
            $$$reportNull$$$0(15);
        }
        if (rVar == null) {
            $$$reportNull$$$0(16);
        }
        super.initialize(n0Var, n0Var2, list, list2, c0Var, yVar, rVar);
        if (map != null && !map.isEmpty()) {
            this.userDataMap = new LinkedHashMap(map);
        }
        return this;
    }

    public C6244v.C6245a<? extends C6232q0> newCopyBuilder() {
        C6244v.C6245a<? extends C6244v> newCopyBuilder = super.newCopyBuilder();
        if (newCopyBuilder == null) {
            $$$reportNull$$$0(24);
        }
        return newCopyBuilder;
    }
}
