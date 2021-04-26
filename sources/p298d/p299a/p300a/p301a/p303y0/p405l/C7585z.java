package p298d.p299a.p300a.p301a.p303y0.p405l;

import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.l.z */
public final class C7585z extends C7586z0 {

    /* renamed from: b */
    public final C6248w0[] f15035b;

    /* renamed from: c */
    public final C7580w0[] f15036c;

    /* renamed from: d */
    public final boolean f15037d;

    public C7585z(C6248w0[] w0VarArr, C7580w0[] w0VarArr2, boolean z) {
        C6888i.m12438e(w0VarArr, "parameters");
        C6888i.m12438e(w0VarArr2, "arguments");
        this.f15035b = w0VarArr;
        this.f15036c = w0VarArr2;
        this.f15037d = z;
        int length = w0VarArr.length;
        int length2 = w0VarArr2.length;
    }

    /* renamed from: b */
    public boolean mo24892b() {
        return this.f15037d;
    }

    /* renamed from: e */
    public C7580w0 mo23539e(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "key");
        C6083h declarationDescriptor = c0Var.mo24887V().getDeclarationDescriptor();
        C6248w0 w0Var = declarationDescriptor instanceof C6248w0 ? (C6248w0) declarationDescriptor : null;
        if (w0Var == null) {
            return null;
        }
        int d = w0Var.mo23132d();
        C6248w0[] w0VarArr = this.f15035b;
        if (d >= w0VarArr.length || !C6888i.m12434a(w0VarArr[d].getTypeConstructor(), w0Var.getTypeConstructor())) {
            return null;
        }
        return this.f15036c[d];
    }

    /* renamed from: f */
    public boolean mo23540f() {
        return this.f15036c.length == 0;
    }
}
