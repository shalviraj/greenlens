package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p394v.C7227g;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7438j;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;

/* renamed from: d.a.a.a.y0.b.h1.p0 */
public abstract class C6134p0 extends C6127o0 {

    /* renamed from: h */
    public final boolean f12118h;

    /* renamed from: i */
    public C7438j<C7227g<?>> f12119i;

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "annotations";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i != 4) {
            objArr[0] = "containingDeclaration";
        } else {
            objArr[0] = "compileTimeInitializer";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i != 4) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6134p0(C6206k kVar, C6060h hVar, C6717d dVar, C7452c0 c0Var, boolean z, C6234r0 r0Var) {
        super(kVar, hVar, dVar, (C7452c0) null, r0Var);
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
            this.f12118h = z;
        } else {
            $$$reportNull$$$0(3);
            throw null;
        }
    }

    /* renamed from: M */
    public C7227g<?> mo23145M() {
        C7438j<C7227g<?>> jVar = this.f12119i;
        if (jVar != null) {
            return (C7227g) jVar.invoke();
        }
        return null;
    }

    /* renamed from: o */
    public boolean mo23147o() {
        return this.f12118h;
    }

    /* renamed from: z */
    public void mo23275z(C7438j<C7227g<?>> jVar) {
        if (jVar != null) {
            this.f12119i = jVar;
        } else {
            $$$reportNull$$$0(4);
            throw null;
        }
    }
}
