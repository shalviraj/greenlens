package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p298d.p299a.C6736l;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6034d;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6152i;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6213n0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6233r;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6246v0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6251y;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7448b1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;
import p298d.p344x.p346c.C6896q;
import p298d.p344x.p346c.C6902w;

/* renamed from: d.a.a.a.y0.b.h1.l0 */
public final class C6117l0 extends C6136r implements C6115k0 {

    /* renamed from: j */
    public static final C6118a f12087j = new C6118a((DefaultConstructorMarker) null);

    /* renamed from: k */
    public static final /* synthetic */ C6736l<Object>[] f12088k = {C6902w.m12462c(new C6896q(C6902w.m12460a(C6117l0.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};

    /* renamed from: g */
    public final C7441m f12089g;

    /* renamed from: h */
    public final C6246v0 f12090h;

    /* renamed from: i */
    public C6034d f12091i;

    /* renamed from: d.a.a.a.y0.b.h1.l0$a */
    public static final class C6118a {
        public C6118a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* renamed from: d.a.a.a.y0.b.h1.l0$b */
    public static final class C6119b extends C6890k implements C6851a<C6117l0> {

        /* renamed from: g */
        public final /* synthetic */ C6117l0 f12092g;

        /* renamed from: h */
        public final /* synthetic */ C6034d f12093h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6119b(C6117l0 l0Var, C6034d dVar) {
            super(0);
            this.f12092g = l0Var;
            this.f12093h = dVar;
        }

        public Object invoke() {
            C6117l0 l0Var = this.f12092g;
            C7441m mVar = l0Var.f12089g;
            C6246v0 v0Var = l0Var.f12090h;
            C6034d dVar = this.f12093h;
            C6060h annotations = dVar.getAnnotations();
            C6023b.C6024a kind = this.f12093h.getKind();
            C6888i.m12437d(kind, "underlyingConstructorDescriptor.kind");
            C6234r0 source = this.f12092g.f12090h.getSource();
            C6888i.m12437d(source, "typeAliasDescriptor.source");
            C6117l0 l0Var2 = new C6117l0(mVar, v0Var, dVar, l0Var, annotations, kind, source);
            C6117l0 l0Var3 = this.f12092g;
            C6034d dVar2 = this.f12093h;
            C6118a aVar = C6117l0.f12087j;
            C6246v0 v0Var2 = l0Var3.f12090h;
            C7448b1 d = v0Var2.mo23435e() == null ? null : C7448b1.m13402d(v0Var2.mo23434L());
            if (d == null) {
                return null;
            }
            C6213n0 dispatchReceiverParameter = dVar2.getDispatchReceiverParameter();
            l0Var2.initialize((C6213n0) null, dispatchReceiverParameter == null ? null : dispatchReceiverParameter.substitute(d), l0Var3.f12090h.getDeclaredTypeParameters(), l0Var3.getValueParameters(), l0Var3.getReturnType(), C6251y.FINAL, l0Var3.f12090h.getVisibility());
            return l0Var2;
        }
    }

    public C6117l0(C7441m mVar, C6246v0 v0Var, C6034d dVar, C6115k0 k0Var, C6060h hVar, C6023b.C6024a aVar, C6234r0 r0Var) {
        super(v0Var, k0Var, hVar, C6717d.m12272p("<init>"), aVar, r0Var);
        this.f12089g = mVar;
        this.f12090h = v0Var;
        setActual(v0Var.isActual());
        mVar.mo25021d(new C6119b(this, dVar));
        this.f12091i = dVar;
    }

    /* renamed from: D */
    public C6115k0 substitute(C7448b1 b1Var) {
        C6888i.m12438e(b1Var, "substitutor");
        C6244v substitute = super.substitute(b1Var);
        Objects.requireNonNull(substitute, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        C6117l0 l0Var = (C6117l0) substitute;
        C7448b1 d = C7448b1.m13402d(l0Var.getReturnType());
        C6888i.m12437d(d, "create(substitutedTypeAliasConstructor.returnType)");
        C6034d substitute2 = this.f12091i.getOriginal().substitute(d);
        if (substitute2 == null) {
            return null;
        }
        l0Var.f12091i = substitute2;
        return l0Var;
    }

    public C6136r createSubstitutedCopy(C6206k kVar, C6244v vVar, C6023b.C6024a aVar, C6717d dVar, C6060h hVar, C6234r0 r0Var) {
        C6888i.m12438e(kVar, "newOwner");
        C6888i.m12438e(aVar, "kind");
        C6888i.m12438e(hVar, "annotations");
        C6888i.m12438e(r0Var, "source");
        return new C6117l0(this.f12089g, this.f12090h, this.f12091i, this, hVar, C6023b.C6024a.DECLARATION, r0Var);
    }

    public C6152i getContainingDeclaration() {
        return this.f12090h;
    }

    public C7452c0 getReturnType() {
        C7452c0 returnType = super.getReturnType();
        C6888i.m12436c(returnType);
        return returnType;
    }

    /* renamed from: q */
    public boolean mo23248q() {
        return this.f12091i.mo23248q();
    }

    /* renamed from: r */
    public C6046e mo23249r() {
        C6046e r = this.f12091i.mo23249r();
        C6888i.m12437d(r, "underlyingConstructorDescriptor.constructedClass");
        return r;
    }

    /* renamed from: w */
    public C6034d mo23259w() {
        return this.f12091i;
    }

    /* renamed from: x */
    public C6115k0 copy(C6206k kVar, C6251y yVar, C6233r rVar, C6023b.C6024a aVar, boolean z) {
        C6888i.m12438e(kVar, "newOwner");
        C6888i.m12438e(yVar, "modality");
        C6888i.m12438e(rVar, "visibility");
        C6888i.m12438e(aVar, "kind");
        Object e = newCopyBuilder().mo23298k(kVar).mo23300m(yVar).mo23297j(rVar).mo23301n(aVar).mo23309v(z).mo23292e();
        Objects.requireNonNull(e, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (C6115k0) e;
    }

    /* renamed from: z */
    public C6115k0 getOriginal() {
        return (C6115k0) super.getOriginal();
    }

    /* renamed from: getContainingDeclaration  reason: collision with other method in class */
    public C6206k m15017getContainingDeclaration() {
        return this.f12090h;
    }
}
