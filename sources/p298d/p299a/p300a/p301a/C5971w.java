package p298d.p299a.p300a.p301a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Objects;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.C6734k;
import p298d.p299a.C6736l;
import p298d.p299a.C6741n;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6084h0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6213n0;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;
import p298d.p344x.p346c.C6896q;
import p298d.p344x.p346c.C6902w;

/* renamed from: d.a.a.a.w */
public final class C5971w implements C6734k {

    /* renamed from: l */
    public static final /* synthetic */ C6736l[] f11794l;

    /* renamed from: g */
    public final C5939n0 f11795g;

    /* renamed from: h */
    public final C5939n0 f11796h = C5266a.m9905X2(new C5972a(this));

    /* renamed from: i */
    public final C5913g<?> f11797i;

    /* renamed from: j */
    public final int f11798j;

    /* renamed from: k */
    public final C6734k.C6735a f11799k;

    /* renamed from: d.a.a.a.w$a */
    public static final class C5972a extends C6890k implements C6851a<List<? extends Annotation>> {

        /* renamed from: g */
        public final /* synthetic */ C5971w f11800g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5972a(C5971w wVar) {
            super(0);
            this.f11800g = wVar;
        }

        public Object invoke() {
            return C5970v0.m10809d(this.f11800g.mo23062j());
        }
    }

    /* renamed from: d.a.a.a.w$b */
    public static final class C5973b extends C6890k implements C6851a<Type> {

        /* renamed from: g */
        public final /* synthetic */ C5971w f11801g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5973b(C5971w wVar) {
            super(0);
            this.f11801g = wVar;
        }

        public Object invoke() {
            C6084h0 j = this.f11801g.mo23062j();
            if (!(j instanceof C6213n0) || !C6888i.m12434a(C5970v0.m10812g(this.f11801g.f11797i.mo22976x()), j) || this.f11801g.f11797i.mo22976x().getKind() != C6023b.C6024a.FAKE_OVERRIDE) {
                return this.f11801g.f11797i.mo22973u().mo23069a().get(this.f11801g.f11798j);
            }
            C6206k containingDeclaration = this.f11801g.f11797i.mo22976x().getContainingDeclaration();
            Objects.requireNonNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class<?> j2 = C5970v0.m10815j((C6046e) containingDeclaration);
            if (j2 != null) {
                return j2;
            }
            throw new C5931l0("Cannot determine receiver Java type of inherited declaration: " + j);
        }
    }

    static {
        Class<C5971w> cls = C5971w.class;
        f11794l = new C6736l[]{C6902w.m12462c(new C6896q(C6902w.m12460a(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), C6902w.m12462c(new C6896q(C6902w.m12460a(cls), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public C5971w(C5913g<?> gVar, int i, C6734k.C6735a aVar, C6851a<? extends C6084h0> aVar2) {
        C6888i.m12438e(gVar, "callable");
        C6888i.m12438e(aVar, "kind");
        C6888i.m12438e(aVar2, "computeDescriptor");
        this.f11797i = gVar;
        this.f11798j = i;
        this.f11799k = aVar;
        this.f11795g = C5266a.m9905X2(aVar2);
    }

    /* renamed from: a */
    public C6741n mo23055a() {
        C7452c0 a = mo23062j().mo23093a();
        C6888i.m12437d(a, "descriptor.type");
        return new C5922i0(a, new C5973b(this));
    }

    /* renamed from: d */
    public int mo23056d() {
        return this.f11798j;
    }

    /* renamed from: e */
    public boolean mo23057e() {
        C6084h0 j = mo23062j();
        return (j instanceof C6030b1) && ((C6030b1) j).mo23130p() != null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5971w) {
            C5971w wVar = (C5971w) obj;
            return C6888i.m12434a(this.f11797i, wVar.f11797i) && this.f11798j == wVar.f11798j;
        }
    }

    public List<Annotation> getAnnotations() {
        C5939n0 n0Var = this.f11796h;
        C6736l lVar = f11794l[1];
        return (List) n0Var.invoke();
    }

    public C6734k.C6735a getKind() {
        return this.f11799k;
    }

    public String getName() {
        C6084h0 j = mo23062j();
        if (!(j instanceof C6030b1)) {
            j = null;
        }
        C6030b1 b1Var = (C6030b1) j;
        if (b1Var == null || b1Var.getContainingDeclaration().hasSynthesizedParameterNames()) {
            return null;
        }
        C6717d name = b1Var.getName();
        C6888i.m12437d(name, "valueParameter.name");
        if (name.f13624h) {
            return null;
        }
        return name.mo23886e();
    }

    public int hashCode() {
        return Integer.valueOf(this.f11798j).hashCode() + (this.f11797i.hashCode() * 31);
    }

    /* renamed from: j */
    public final C6084h0 mo23062j() {
        C5939n0 n0Var = this.f11795g;
        C6736l lVar = f11794l[0];
        return (C6084h0) n0Var.invoke();
    }

    /* renamed from: s */
    public boolean mo23063s() {
        C6084h0 j = mo23062j();
        if (!(j instanceof C6030b1)) {
            j = null;
        }
        C6030b1 b1Var = (C6030b1) j;
        if (b1Var != null) {
            return C7255a.m13128a(b1Var);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r3 = this;
            d.a.a.a.r0 r0 = p298d.p299a.p300a.p301a.C5949r0.f11765b
            java.lang.String r0 = "parameter"
            p298d.p344x.p346c.C6888i.m12438e(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            d.a.k$a r1 = r3.f11799k
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x003a
            r2 = 1
            if (r1 == r2) goto L_0x0037
            r2 = 2
            if (r1 == r2) goto L_0x001b
            goto L_0x003f
        L_0x001b:
            java.lang.String r1 = "parameter #"
            java.lang.StringBuilder r1 = p005b.p035e.p036a.p037a.C0843a.m460u(r1)
            int r2 = r3.f11798j
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            java.lang.String r2 = r3.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L_0x003c
        L_0x0037:
            java.lang.String r1 = "extension receiver parameter"
            goto L_0x003c
        L_0x003a:
            java.lang.String r1 = "instance parameter"
        L_0x003c:
            r0.append(r1)
        L_0x003f:
            java.lang.String r1 = " of "
            r0.append(r1)
            d.a.a.a.g<?> r1 = r3.f11797i
            d.a.a.a.y0.b.b r1 = r1.mo22976x()
            boolean r2 = r1 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0
            if (r2 == 0) goto L_0x0055
            d.a.a.a.y0.b.k0 r1 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6207k0) r1
            java.lang.String r1 = p298d.p299a.p300a.p301a.C5949r0.m10780d(r1)
            goto L_0x005f
        L_0x0055:
            boolean r2 = r1 instanceof p298d.p299a.p300a.p301a.p303y0.p304b.C6244v
            if (r2 == 0) goto L_0x006c
            d.a.a.a.y0.b.v r1 = (p298d.p299a.p300a.p301a.p303y0.p304b.C6244v) r1
            java.lang.String r1 = p298d.p299a.p300a.p301a.C5949r0.m10779c(r1)
        L_0x005f:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            p298d.p344x.p346c.C6888i.m12437d(r0, r1)
            return r0
        L_0x006c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Illegal callable: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.C5971w.toString():java.lang.String");
    }
}
