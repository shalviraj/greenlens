package p298d.p299a.p300a.p301a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.C6764f;
import p298d.C6765g;
import p298d.C6766h;
import p298d.C6767i;
import p298d.p299a.C6726e;
import p298d.p299a.C6727f;
import p298d.p299a.C6736l;
import p298d.p299a.C6743p;
import p298d.p299a.C6745q;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6246v0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p311b.C6173b;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7460d1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7580w0;
import p298d.p334t.C6790h;
import p298d.p334t.C6798p;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6889j;
import p298d.p344x.p346c.C6890k;
import p298d.p344x.p346c.C6896q;
import p298d.p344x.p346c.C6902w;

/* renamed from: d.a.a.a.i0 */
public final class C5922i0 implements C6889j {

    /* renamed from: k */
    public static final /* synthetic */ C6736l[] f11726k;

    /* renamed from: g */
    public final C5939n0<Type> f11727g;

    /* renamed from: h */
    public final C5939n0 f11728h;

    /* renamed from: i */
    public final C5939n0 f11729i;

    /* renamed from: j */
    public final C7452c0 f11730j;

    /* renamed from: d.a.a.a.i0$a */
    public static final class C5923a extends C6890k implements C6851a<List<? extends C6743p>> {

        /* renamed from: g */
        public final /* synthetic */ C5922i0 f11731g;

        /* renamed from: h */
        public final /* synthetic */ C6851a f11732h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5923a(C5922i0 i0Var, C6851a aVar) {
            super(0);
            this.f11731g = i0Var;
            this.f11732h = aVar;
        }

        public Object invoke() {
            C6743p pVar;
            List<C7580w0> U = this.f11731g.f11730j.mo24886U();
            if (U.isEmpty()) {
                return C6798p.f13713g;
            }
            C6764f T2 = C5266a.m9885T2(C6765g.PUBLICATION, new C5920h0(this));
            ArrayList arrayList = new ArrayList(C5266a.m9892V(U, 10));
            int i = 0;
            for (T next : U) {
                int i2 = i + 1;
                C5918g0 g0Var = null;
                if (i >= 0) {
                    C7580w0 w0Var = (C7580w0) next;
                    if (w0Var.mo25163c()) {
                        C6743p.C6744a aVar = C6743p.f13641d;
                        pVar = C6743p.f13640c;
                    } else {
                        C7452c0 a = w0Var.mo25161a();
                        C6888i.m12437d(a, "typeProjection.type");
                        if (this.f11732h != null) {
                            g0Var = new C5918g0(i, this, T2, (C6736l) null);
                        }
                        C5922i0 i0Var = new C5922i0(a, g0Var);
                        int ordinal = w0Var.mo25162b().ordinal();
                        if (ordinal == 0) {
                            C6743p.C6744a aVar2 = C6743p.f13641d;
                            C6888i.m12438e(i0Var, "type");
                            pVar = new C6743p(C6745q.INVARIANT, i0Var);
                        } else if (ordinal == 1) {
                            C6743p.C6744a aVar3 = C6743p.f13641d;
                            C6888i.m12438e(i0Var, "type");
                            pVar = new C6743p(C6745q.IN, i0Var);
                        } else if (ordinal == 2) {
                            C6743p.C6744a aVar4 = C6743p.f13641d;
                            C6888i.m12438e(i0Var, "type");
                            pVar = new C6743p(C6745q.OUT, i0Var);
                        } else {
                            throw new C6766h();
                        }
                    }
                    arrayList.add(pVar);
                    i = i2;
                } else {
                    C6790h.m12333T();
                    throw null;
                }
            }
            return arrayList;
        }
    }

    /* renamed from: d.a.a.a.i0$b */
    public static final class C5924b extends C6890k implements C6851a<C6727f> {

        /* renamed from: g */
        public final /* synthetic */ C5922i0 f11733g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5924b(C5922i0 i0Var) {
            super(0);
            this.f11733g = i0Var;
        }

        public Object invoke() {
            C5922i0 i0Var = this.f11733g;
            return i0Var.mo23018j(i0Var.f11730j);
        }
    }

    static {
        Class<C5922i0> cls = C5922i0.class;
        f11726k = new C6736l[]{C6902w.m12462c(new C6896q(C6902w.m12460a(cls), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), C6902w.m12462c(new C6896q(C6902w.m12460a(cls), "arguments", "getArguments()Ljava/util/List;"))};
    }

    public C5922i0(C7452c0 c0Var, C6851a<? extends Type> aVar) {
        C6888i.m12438e(c0Var, "type");
        this.f11730j = c0Var;
        C5939n0<Type> n0Var = null;
        C5939n0<Type> n0Var2 = !(aVar instanceof C5939n0) ? null : aVar;
        if (n0Var2 != null) {
            n0Var = n0Var2;
        } else if (aVar != null) {
            n0Var = C5266a.m9905X2(aVar);
        }
        this.f11727g = n0Var;
        this.f11728h = C5266a.m9905X2(new C5924b(this));
        this.f11729i = C5266a.m9905X2(new C5923a(this, aVar));
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5922i0) && C6888i.m12434a(this.f11730j, ((C5922i0) obj).f11730j);
    }

    /* renamed from: g */
    public List<C6743p> mo23015g() {
        C5939n0 n0Var = this.f11729i;
        C6736l lVar = f11726k[1];
        return (List) n0Var.invoke();
    }

    public List<Annotation> getAnnotations() {
        return C5970v0.m10809d(this.f11730j);
    }

    /* renamed from: h */
    public C6727f mo23016h() {
        C5939n0 n0Var = this.f11728h;
        C6736l lVar = f11726k[0];
        return (C6727f) n0Var.invoke();
    }

    public int hashCode() {
        return this.f11730j.hashCode();
    }

    /* renamed from: j */
    public final C6727f mo23018j(C7452c0 c0Var) {
        C7452c0 a;
        C6083h declarationDescriptor = c0Var.mo24887V().getDeclarationDescriptor();
        if (declarationDescriptor instanceof C6046e) {
            Class<?> j = C5970v0.m10815j((C6046e) declarationDescriptor);
            if (j == null) {
                return null;
            }
            if (j.isArray()) {
                C7580w0 w0Var = (C7580w0) C6790h.m12331R(c0Var.mo24886U());
                if (w0Var == null || (a = w0Var.mo25161a()) == null) {
                    return new C5858a(j);
                }
                C6888i.m12437d(a, "type.arguments.singleOrN…return KClassImpl(jClass)");
                C6727f j2 = mo23018j(a);
                if (j2 != null) {
                    return new C5858a(C6173b.m11072a(C5266a.m10033t1(C5266a.m10069z1(j2))));
                }
                throw new C5931l0("Cannot determine classifier for array element type: " + this);
            } else if (C7460d1.m13441g(c0Var)) {
                return new C5858a(j);
            } else {
                List<C6726e<? extends Object>> list = C6173b.f12191a;
                C6888i.m12438e(j, "<this>");
                Class<?> cls = C6173b.f12192b.get(j);
                if (cls != null) {
                    j = cls;
                }
                return new C5858a(j);
            }
        } else if (declarationDescriptor instanceof C6248w0) {
            return new C5926j0((C5929k0) null, (C6248w0) declarationDescriptor);
        } else {
            if (!(declarationDescriptor instanceof C6246v0)) {
                return null;
            }
            throw new C6767i(C0843a.m451l("An operation is not implemented: ", "Type alias classifiers are not yet supported"));
        }
    }

    /* renamed from: p */
    public boolean mo23019p() {
        return this.f11730j.mo23566W();
    }

    /* renamed from: t */
    public Type mo23020t() {
        C5939n0<Type> n0Var = this.f11727g;
        if (n0Var != null) {
            return n0Var.invoke();
        }
        return null;
    }

    public String toString() {
        C5949r0 r0Var = C5949r0.f11765b;
        return C5949r0.m10781e(this.f11730j);
    }
}
