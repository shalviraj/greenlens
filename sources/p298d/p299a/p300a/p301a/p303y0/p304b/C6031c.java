package p298d.p299a.p300a.p301a.p303y0.p304b;

import java.util.List;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7484h1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7567t0;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.c */
public final class C6031c implements C6248w0 {

    /* renamed from: g */
    public final C6248w0 f11874g;

    /* renamed from: h */
    public final C6206k f11875h;

    /* renamed from: i */
    public final int f11876i;

    public C6031c(C6248w0 w0Var, C6206k kVar, int i) {
        C6888i.m12438e(w0Var, "originalDescriptor");
        C6888i.m12438e(kVar, "declarationDescriptor");
        this.f11874g = w0Var;
        this.f11875h = kVar;
        this.f11876i = i;
    }

    public <R, D> R accept(C6210m<R, D> mVar, D d) {
        return this.f11874g.accept(mVar, d);
    }

    /* renamed from: d */
    public int mo23132d() {
        return this.f11874g.mo23132d() + this.f11876i;
    }

    public C6060h getAnnotations() {
        return this.f11874g.getAnnotations();
    }

    public C6206k getContainingDeclaration() {
        return this.f11875h;
    }

    public C7489j0 getDefaultType() {
        return this.f11874g.getDefaultType();
    }

    public C6717d getName() {
        return this.f11874g.getName();
    }

    public C6248w0 getOriginal() {
        C6248w0 original = this.f11874g.getOriginal();
        C6888i.m12437d(original, "originalDescriptor.original");
        return original;
    }

    public C6234r0 getSource() {
        return this.f11874g.getSource();
    }

    public C7567t0 getTypeConstructor() {
        return this.f11874g.getTypeConstructor();
    }

    public List<C7452c0> getUpperBounds() {
        return this.f11874g.getUpperBounds();
    }

    /* renamed from: j */
    public C7484h1 mo23137j() {
        return this.f11874g.mo23137j();
    }

    /* renamed from: m */
    public C7441m mo23138m() {
        return this.f11874g.mo23138m();
    }

    public String toString() {
        return this.f11874g + "[inner-copy]";
    }

    /* renamed from: u */
    public boolean mo23140u() {
        return true;
    }

    /* renamed from: v */
    public boolean mo23141v() {
        return this.f11874g.mo23141v();
    }
}
