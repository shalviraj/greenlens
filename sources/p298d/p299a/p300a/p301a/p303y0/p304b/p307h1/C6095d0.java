package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6019a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6158j0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6213n0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6233r;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6251y;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7448b1;

/* renamed from: d.a.a.a.y0.b.h1.d0 */
public abstract class C6095d0 extends C6122n implements C6158j0 {

    /* renamed from: g */
    public boolean f12009g;

    /* renamed from: h */
    public final boolean f12010h;

    /* renamed from: i */
    public final C6251y f12011i;

    /* renamed from: j */
    public final C6207k0 f12012j;

    /* renamed from: k */
    public final boolean f12013k;

    /* renamed from: l */
    public final C6023b.C6024a f12014l;

    /* renamed from: m */
    public C6233r f12015m;

    /* renamed from: n */
    public C6244v f12016n;

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 14:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getModality";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 12:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 13:
                objArr[1] = "getOverriddenDescriptors";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 14:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6095d0(C6251y yVar, C6233r rVar, C6207k0 k0Var, C6060h hVar, C6717d dVar, boolean z, boolean z2, boolean z3, C6023b.C6024a aVar, C6234r0 r0Var) {
        super(k0Var.getContainingDeclaration(), hVar, dVar, r0Var);
        if (yVar == null) {
            $$$reportNull$$$0(0);
            throw null;
        } else if (rVar == null) {
            $$$reportNull$$$0(1);
            throw null;
        } else if (hVar == null) {
            $$$reportNull$$$0(3);
            throw null;
        } else if (r0Var != null) {
            this.f12016n = null;
            this.f12011i = yVar;
            this.f12015m = rVar;
            this.f12012j = k0Var;
            this.f12009g = z;
            this.f12010h = z2;
            this.f12013k = z3;
            this.f12014l = aVar;
        } else {
            $$$reportNull$$$0(5);
            throw null;
        }
    }

    /* renamed from: I */
    public C6207k0 mo23200I() {
        C6207k0 k0Var = this.f12012j;
        if (k0Var != null) {
            return k0Var;
        }
        $$$reportNull$$$0(12);
        throw null;
    }

    /* renamed from: K */
    public boolean mo23201K() {
        return this.f12009g;
    }

    public C6023b copy(C6206k kVar, C6251y yVar, C6233r rVar, C6023b.C6024a aVar, boolean z) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    public C6213n0 getDispatchReceiverParameter() {
        return mo23200I().getDispatchReceiverParameter();
    }

    public C6213n0 getExtensionReceiverParameter() {
        return mo23200I().getExtensionReceiverParameter();
    }

    public C6244v getInitialSignatureDescriptor() {
        return this.f12016n;
    }

    public C6023b.C6024a getKind() {
        C6023b.C6024a aVar = this.f12014l;
        if (aVar != null) {
            return aVar;
        }
        $$$reportNull$$$0(6);
        throw null;
    }

    public C6251y getModality() {
        C6251y yVar = this.f12011i;
        if (yVar != null) {
            return yVar;
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

    public <V> V getUserData(C6019a.C6020a<V> aVar) {
        return null;
    }

    public C6233r getVisibility() {
        C6233r rVar = this.f12015m;
        if (rVar != null) {
            return rVar;
        }
        $$$reportNull$$$0(10);
        throw null;
    }

    public boolean hasSynthesizedParameterNames() {
        return false;
    }

    public boolean isActual() {
        return false;
    }

    public boolean isExpect() {
        return false;
    }

    public boolean isExternal() {
        return this.f12010h;
    }

    public boolean isHiddenForResolutionEverywhereBesideSupercalls() {
        return false;
    }

    public boolean isHiddenToOvercomeSignatureClash() {
        return false;
    }

    public boolean isInfix() {
        return false;
    }

    public boolean isInline() {
        return this.f12013k;
    }

    public boolean isOperator() {
        return false;
    }

    public boolean isSuspend() {
        return false;
    }

    public boolean isTailrec() {
        return false;
    }

    public void setOverriddenDescriptors(Collection<? extends C6023b> collection) {
    }

    public C6244v substitute(C7448b1 b1Var) {
        if (b1Var == null) {
            $$$reportNull$$$0(7);
            throw null;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: x */
    public abstract C6158j0 getOriginal();

    /* renamed from: z */
    public Collection<C6158j0> mo23211z(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (C6207k0 k0Var : mo23200I().getOverriddenDescriptors()) {
            Object b = z ? k0Var.mo23216b() : k0Var.mo23217c();
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }
}
