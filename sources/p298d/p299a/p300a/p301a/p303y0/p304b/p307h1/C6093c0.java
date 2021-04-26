package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import java.util.Objects;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6032c0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6210m;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.h1.c0 */
public abstract class C6093c0 extends C6122n implements C6032c0 {
    private final C6714b fqName;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6093c0(C6021a0 a0Var, C6714b bVar) {
        super(a0Var, C6060h.C6061a.f11922b, bVar.mo23869h(), C6234r0.f12257a);
        C6888i.m12438e(a0Var, "module");
        C6888i.m12438e(bVar, "fqName");
        Objects.requireNonNull(C6060h.f11920d);
        this.fqName = bVar;
    }

    public <R, D> R accept(C6210m<R, D> mVar, D d) {
        C6888i.m12438e(mVar, "visitor");
        return mVar.mo22992m(this, d);
    }

    public C6021a0 getContainingDeclaration() {
        return (C6021a0) super.getContainingDeclaration();
    }

    public final C6714b getFqName() {
        return this.fqName;
    }

    public C6234r0 getSource() {
        C6234r0 r0Var = C6234r0.f12257a;
        C6888i.m12437d(r0Var, "NO_SOURCE");
        return r0Var;
    }

    public String toString() {
        return C6888i.m12444k("package ", this.fqName);
    }
}
