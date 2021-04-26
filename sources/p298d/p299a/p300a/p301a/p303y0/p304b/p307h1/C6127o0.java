package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6019a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6033c1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6213n0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;

/* renamed from: d.a.a.a.y0.b.h1.o0 */
public abstract class C6127o0 extends C6122n implements C6033c1 {

    /* renamed from: g */
    public C7452c0 f12105g;

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
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
            case 7:
            case 8:
            case 9:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6127o0(C6206k kVar, C6060h hVar, C6717d dVar, C7452c0 c0Var, C6234r0 r0Var) {
        super(kVar, hVar, dVar, r0Var);
        if (kVar == null) {
            $$$reportNull$$$0(0);
            throw null;
        } else if (hVar == null) {
            $$$reportNull$$$0(1);
            throw null;
        } else if (dVar == null) {
            $$$reportNull$$$0(2);
            throw null;
        } else if (r0Var != null) {
            this.f12105g = c0Var;
        } else {
            $$$reportNull$$$0(3);
            throw null;
        }
    }

    /* renamed from: a */
    public C7452c0 mo23093a() {
        C7452c0 c0Var = this.f12105g;
        if (c0Var != null) {
            return c0Var;
        }
        $$$reportNull$$$0(4);
        throw null;
    }

    public C6213n0 getDispatchReceiverParameter() {
        return null;
    }

    public C6213n0 getExtensionReceiverParameter() {
        return null;
    }

    public Collection<? extends C6019a> getOverriddenDescriptors() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        $$$reportNull$$$0(7);
        throw null;
    }

    public C7452c0 getReturnType() {
        C7452c0 a = mo23093a();
        if (a != null) {
            return a;
        }
        $$$reportNull$$$0(9);
        throw null;
    }

    public List<C6248w0> getTypeParameters() {
        List<C6248w0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        $$$reportNull$$$0(8);
        throw null;
    }

    public List<C6030b1> getValueParameters() {
        List<C6030b1> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        $$$reportNull$$$0(6);
        throw null;
    }

    public boolean hasSynthesizedParameterNames() {
        return false;
    }

    /* renamed from: x */
    public C6033c1 getOriginal() {
        C6033c1 c1Var = (C6033c1) super.getOriginal();
        if (c1Var != null) {
            return c1Var;
        }
        $$$reportNull$$$0(5);
        throw null;
    }
}
