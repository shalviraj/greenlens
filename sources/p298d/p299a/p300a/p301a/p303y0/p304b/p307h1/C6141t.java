package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.C6736l;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6032c0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6073g0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6210m;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7264b;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7275g;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7437i;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p334t.C6790h;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;
import p298d.p344x.p346c.C6896q;
import p298d.p344x.p346c.C6902w;

/* renamed from: d.a.a.a.y0.b.h1.t */
public final class C6141t extends C6120m implements C6073g0 {

    /* renamed from: k */
    public static final /* synthetic */ C6736l<Object>[] f12149k = {C6902w.m12462c(new C6896q(C6902w.m12460a(C6141t.class), "fragments", "getFragments()Ljava/util/List;"))};

    /* renamed from: g */
    public final C6086a0 f12150g;

    /* renamed from: h */
    public final C6714b f12151h;

    /* renamed from: i */
    public final C7437i f12152i;

    /* renamed from: j */
    public final C7277h f12153j;

    /* renamed from: d.a.a.a.y0.b.h1.t$a */
    public static final class C6142a extends C6890k implements C6851a<List<? extends C6032c0>> {

        /* renamed from: g */
        public final /* synthetic */ C6141t f12154g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6142a(C6141t tVar) {
            super(0);
            this.f12154g = tVar;
        }

        public Object invoke() {
            C6086a0 a0Var = this.f12154g.f12150g;
            a0Var.mo23193x();
            return C5266a.m10005o3((C6116l) a0Var.f11996n.getValue(), this.f12154g.f12151h);
        }
    }

    /* renamed from: d.a.a.a.y0.b.h1.t$b */
    public static final class C6143b extends C6890k implements C6851a<C7277h> {

        /* renamed from: g */
        public final /* synthetic */ C6141t f12155g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6143b(C6141t tVar) {
            super(0);
            this.f12155g = tVar;
        }

        public Object invoke() {
            if (this.f12155g.mo23178A().isEmpty()) {
                return C7277h.C7280b.f14521b;
            }
            List<C6032c0> A = this.f12155g.mo23178A();
            ArrayList arrayList = new ArrayList(C5266a.m9892V(A, 10));
            for (C6032c0 memberScope : A) {
                arrayList.add(memberScope.getMemberScope());
            }
            C6141t tVar = this.f12155g;
            List J = C6790h.m12323J(arrayList, new C6113j0(tVar.f12150g, tVar.f12151h));
            StringBuilder u = C0843a.m460u("package view scope for ");
            u.append(this.f12155g.f12151h);
            u.append(" in ");
            u.append(this.f12155g.f12150g.getName());
            return C7264b.m13145a(u.toString(), J);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6141t(C6086a0 a0Var, C6714b bVar, C7441m mVar) {
        super(C6060h.C6061a.f11922b, bVar.mo23869h());
        C6888i.m12438e(a0Var, "module");
        C6888i.m12438e(bVar, "fqName");
        C6888i.m12438e(mVar, "storageManager");
        Objects.requireNonNull(C6060h.f11920d);
        this.f12150g = a0Var;
        this.f12151h = bVar;
        this.f12152i = mVar.mo25018a(new C6142a(this));
        this.f12153j = new C7275g(mVar, new C6143b(this));
    }

    /* renamed from: A */
    public List<C6032c0> mo23178A() {
        return (List) C5266a.m9884T1(this.f12152i, f12149k[0]);
    }

    /* renamed from: F */
    public C6021a0 mo23179F() {
        return this.f12150g;
    }

    public <R, D> R accept(C6210m<R, D> mVar, D d) {
        C6888i.m12438e(mVar, "visitor");
        return mVar.mo22983d(this, d);
    }

    public boolean equals(Object obj) {
        C6073g0 g0Var = obj instanceof C6073g0 ? (C6073g0) obj : null;
        if (g0Var != null && C6888i.m12434a(this.f12151h, g0Var.getFqName()) && C6888i.m12434a(this.f12150g, g0Var.mo23179F())) {
            return true;
        }
        return false;
    }

    public C6206k getContainingDeclaration() {
        if (this.f12151h.mo23864d()) {
            return null;
        }
        C6086a0 a0Var = this.f12150g;
        C6714b e = this.f12151h.mo23865e();
        C6888i.m12437d(e, "fqName.parent()");
        return a0Var.mo23088G(e);
    }

    public C6714b getFqName() {
        return this.f12151h;
    }

    public C7277h getMemberScope() {
        return this.f12153j;
    }

    public int hashCode() {
        return this.f12151h.hashCode() + (this.f12150g.hashCode() * 31);
    }

    public boolean isEmpty() {
        C6888i.m12438e(this, "this");
        return mo23178A().isEmpty();
    }
}
