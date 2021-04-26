package p298d.p299a.p300a.p301a;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.C6766h;
import p298d.C6777r;
import p298d.p299a.C6726e;
import p298d.p299a.C6736l;
import p298d.p299a.C6741n;
import p298d.p299a.C6742o;
import p298d.p299a.C6745q;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p309j1.p310a.C6163e;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6541g;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6552l;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p403f0.C7343g;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.p403f0.C7344h;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;
import p298d.p344x.p346c.C6896q;
import p298d.p344x.p346c.C6902w;

/* renamed from: d.a.a.a.j0 */
public final class C5926j0 implements C6742o {

    /* renamed from: j */
    public static final /* synthetic */ C6736l[] f11735j = {C6902w.m12462c(new C6896q(C6902w.m12460a(C5926j0.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* renamed from: g */
    public final C5939n0 f11736g = C5266a.m9905X2(new C5927a(this));

    /* renamed from: h */
    public final C5929k0 f11737h;

    /* renamed from: i */
    public final C6248w0 f11738i;

    /* renamed from: d.a.a.a.j0$a */
    public static final class C5927a extends C6890k implements C6851a<List<? extends C5922i0>> {

        /* renamed from: g */
        public final /* synthetic */ C5926j0 f11739g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5927a(C5926j0 j0Var) {
            super(0);
            this.f11739g = j0Var;
        }

        public Object invoke() {
            List<C7452c0> upperBounds = this.f11739g.f11738i.getUpperBounds();
            C6888i.m12437d(upperBounds, "descriptor.upperBounds");
            ArrayList arrayList = new ArrayList(C5266a.m9892V(upperBounds, 10));
            for (C7452c0 i0Var : upperBounds) {
                arrayList.add(new C5922i0(i0Var, (C6851a<? extends Type>) null));
            }
            return arrayList;
        }
    }

    public C5926j0(C5929k0 k0Var, C6248w0 w0Var) {
        Object obj;
        C5858a<?> aVar;
        Class<?> cls;
        C6888i.m12438e(w0Var, "descriptor");
        this.f11738i = w0Var;
        if (k0Var == null) {
            C6206k containingDeclaration = w0Var.getContainingDeclaration();
            C6888i.m12437d(containingDeclaration, "descriptor.containingDeclaration");
            if (containingDeclaration instanceof C6046e) {
                obj = mo23022a((C6046e) containingDeclaration);
            } else if (containingDeclaration instanceof C6023b) {
                C6206k containingDeclaration2 = ((C6023b) containingDeclaration).getContainingDeclaration();
                C6888i.m12437d(containingDeclaration2, "declaration.containingDeclaration");
                if (containingDeclaration2 instanceof C6046e) {
                    aVar = mo23022a((C6046e) containingDeclaration2);
                } else {
                    C6552l lVar = null;
                    C7344h hVar = (C7344h) (!(containingDeclaration instanceof C7344h) ? null : containingDeclaration);
                    if (hVar != null) {
                        C7343g h = hVar.mo24955h();
                        C6541g gVar = (C6541g) (!(h instanceof C6541g) ? null : h);
                        C6552l lVar2 = gVar != null ? gVar.f12836d : null;
                        C6163e eVar = (C6163e) (lVar2 instanceof C6163e ? lVar2 : lVar);
                        if (eVar == null || (cls = eVar.f12178a) == null) {
                            throw new C5931l0("Container of deserialized member is not resolved: " + hVar);
                        }
                        C6726e<?> C1 = C5266a.m9784C1(cls);
                        Objects.requireNonNull(C1, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                        aVar = (C5858a) C1;
                    } else {
                        throw new C5931l0("Non-class callable descriptor must be deserialized: " + containingDeclaration);
                    }
                }
                obj = containingDeclaration.accept(new C5884c(aVar), C6777r.f13694a);
            } else {
                throw new C5931l0("Unknown type parameter container: " + containingDeclaration);
            }
            C6888i.m12437d(obj, "when (val declaration = … $declaration\")\n        }");
            k0Var = (C5929k0) obj;
        }
        this.f11737h = k0Var;
    }

    /* renamed from: a */
    public final C5858a<?> mo23022a(C6046e eVar) {
        Class<?> j = C5970v0.m10815j(eVar);
        C5858a<?> aVar = (C5858a) (j != null ? C5266a.m9784C1(j) : null);
        if (aVar != null) {
            return aVar;
        }
        StringBuilder u = C0843a.m460u("Type parameter container is not resolved: ");
        u.append(eVar.getContainingDeclaration());
        throw new C5931l0(u.toString());
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5926j0) {
            C5926j0 j0Var = (C5926j0) obj;
            return C6888i.m12434a(this.f11737h, j0Var.f11737h) && C6888i.m12434a(getName(), j0Var.getName());
        }
    }

    public String getName() {
        String e = this.f11738i.getName().mo23886e();
        C6888i.m12437d(e, "descriptor.name.asString()");
        return e;
    }

    public List<C6741n> getUpperBounds() {
        C5939n0 n0Var = this.f11736g;
        C6736l lVar = f11735j[0];
        return (List) n0Var.invoke();
    }

    public int hashCode() {
        return getName().hashCode() + (this.f11737h.hashCode() * 31);
    }

    /* renamed from: j */
    public C6745q mo23027j() {
        int ordinal = this.f11738i.mo23137j().ordinal();
        if (ordinal == 0) {
            return C6745q.INVARIANT;
        }
        if (ordinal == 1) {
            return C6745q.IN;
        }
        if (ordinal == 2) {
            return C6745q.OUT;
        }
        throw new C6766h();
    }

    public String toString() {
        String str;
        C6888i.m12438e(this, "typeParameter");
        StringBuilder sb = new StringBuilder();
        int ordinal = mo23027j().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                str = "out ";
            }
            sb.append(getName());
            String sb2 = sb.toString();
            C6888i.m12437d(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        str = "in ";
        sb.append(str);
        sb.append(getName());
        String sb22 = sb.toString();
        C6888i.m12437d(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }
}
