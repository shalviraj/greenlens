package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;

/* renamed from: d.a.a.a.y0.b.h1.j */
public abstract class C6112j extends C6087b {

    /* renamed from: g */
    public final C6206k f12075g;

    /* renamed from: h */
    public final C6234r0 f12076h;

    /* renamed from: i */
    public final boolean f12077i;

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5) ? 2 : 3)];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 4 || i == 5)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6112j(C7441m mVar, C6206k kVar, C6717d dVar, C6234r0 r0Var, boolean z) {
        super(mVar, dVar);
        if (mVar == null) {
            $$$reportNull$$$0(0);
            throw null;
        } else if (kVar == null) {
            $$$reportNull$$$0(1);
            throw null;
        } else if (dVar == null) {
            $$$reportNull$$$0(2);
            throw null;
        } else if (r0Var != null) {
            this.f12075g = kVar;
            this.f12076h = r0Var;
            this.f12077i = z;
        } else {
            $$$reportNull$$$0(3);
            throw null;
        }
    }

    public C6206k getContainingDeclaration() {
        C6206k kVar = this.f12075g;
        if (kVar != null) {
            return kVar;
        }
        $$$reportNull$$$0(4);
        throw null;
    }

    public C6234r0 getSource() {
        C6234r0 r0Var = this.f12076h;
        if (r0Var != null) {
            return r0Var;
        }
        $$$reportNull$$$0(5);
        throw null;
    }

    public boolean isExternal() {
        return this.f12077i;
    }
}
