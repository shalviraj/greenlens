package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6019a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6210m;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6213n0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6219q;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6233r;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.p399n.C7298g;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7448b1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7484h1;

/* renamed from: d.a.a.a.y0.b.h1.d */
public abstract class C6094d extends C6120m implements C6213n0 {

    /* renamed from: g */
    public static final C6717d f12008g = C6717d.m12272p("<this>");

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "substitutor";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 2:
                objArr[1] = "getTypeParameters";
                break;
            case 3:
                objArr[1] = "getType";
                break;
            case 4:
                objArr[1] = "getValueParameters";
                break;
            case 5:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 6:
                objArr[1] = "getVisibility";
                break;
            case 7:
                objArr[1] = "getOriginal";
                break;
            case 8:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "substitute";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6094d(C6060h hVar) {
        super(hVar, f12008g);
        if (hVar != null) {
        } else {
            $$$reportNull$$$0(0);
            throw null;
        }
    }

    /* renamed from: a */
    public C7452c0 mo23093a() {
        C7452c0 a = getValue().mo23429a();
        if (a != null) {
            return a;
        }
        $$$reportNull$$$0(3);
        throw null;
    }

    public <R, D> R accept(C6210m<R, D> mVar, D d) {
        return mVar.mo22990k(this, d);
    }

    public C6213n0 getDispatchReceiverParameter() {
        return null;
    }

    public C6213n0 getExtensionReceiverParameter() {
        return null;
    }

    public C6019a getOriginal() {
        return this;
    }

    /* renamed from: getOriginal  reason: collision with other method in class */
    public C6206k m15015getOriginal() {
        return this;
    }

    public Collection<? extends C6019a> getOverriddenDescriptors() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        $$$reportNull$$$0(5);
        throw null;
    }

    public C7452c0 getReturnType() {
        return mo23093a();
    }

    public C6234r0 getSource() {
        return C6234r0.f12257a;
    }

    public List<C6248w0> getTypeParameters() {
        List<C6248w0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        $$$reportNull$$$0(2);
        throw null;
    }

    public List<C6030b1> getValueParameters() {
        List<C6030b1> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        $$$reportNull$$$0(4);
        throw null;
    }

    public C6233r getVisibility() {
        C6233r rVar = C6219q.f12246f;
        if (rVar != null) {
            return rVar;
        }
        $$$reportNull$$$0(6);
        throw null;
    }

    public boolean hasSynthesizedParameterNames() {
        return false;
    }

    public C6213n0 substitute(C7448b1 b1Var) {
        C7484h1 h1Var;
        C7452c0 c0Var;
        if (b1Var == null) {
            $$$reportNull$$$0(1);
            throw null;
        } else if (b1Var.mo25051h()) {
            return this;
        } else {
            if (getContainingDeclaration() instanceof C6046e) {
                c0Var = mo23093a();
                h1Var = C7484h1.OUT_VARIANCE;
            } else {
                c0Var = mo23093a();
                h1Var = C7484h1.INVARIANT;
            }
            C7452c0 k = b1Var.mo25053k(c0Var, h1Var);
            if (k == null) {
                return null;
            }
            return k == mo23093a() ? this : new C6109h0(getContainingDeclaration(), new C7298g(k), getAnnotations());
        }
    }
}
