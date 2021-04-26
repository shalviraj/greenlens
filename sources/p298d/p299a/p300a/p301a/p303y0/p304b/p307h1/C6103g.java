package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6210m;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6242u0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7275g;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7417e;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7437i;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7455d0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7473g;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7484h1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7567t0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7570v;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.h1.g */
public abstract class C6103g extends C6122n implements C6248w0 {

    /* renamed from: g */
    public final C7484h1 f12055g;

    /* renamed from: h */
    public final boolean f12056h;

    /* renamed from: i */
    public final int f12057i;

    /* renamed from: j */
    public final C7437i<C7567t0> f12058j;

    /* renamed from: k */
    public final C7437i<C7489j0> f12059k;

    /* renamed from: l */
    public final C7441m f12060l;

    /* renamed from: d.a.a.a.y0.b.h1.g$a */
    public class C6104a implements C6851a<C7567t0> {

        /* renamed from: g */
        public final /* synthetic */ C7441m f12061g;

        /* renamed from: h */
        public final /* synthetic */ C6242u0 f12062h;

        public C6104a(C7441m mVar, C6242u0 u0Var) {
            this.f12061g = mVar;
            this.f12062h = u0Var;
        }

        public Object invoke() {
            return new C6106c(C6103g.this, this.f12061g, this.f12062h);
        }
    }

    /* renamed from: d.a.a.a.y0.b.h1.g$b */
    public class C6105b implements C6851a<C7489j0> {

        /* renamed from: g */
        public final /* synthetic */ C6717d f12064g;

        public C6105b(C6717d dVar) {
            this.f12064g = dVar;
        }

        public Object invoke() {
            Objects.requireNonNull(C6060h.f11920d);
            C6060h hVar = C6060h.C6061a.f11922b;
            C7567t0 typeConstructor = C6103g.this.getTypeConstructor();
            List emptyList = Collections.emptyList();
            C6108h hVar2 = new C6108h(this);
            C6888i.m12438e(hVar2, "getScope");
            C7441m mVar = C7417e.f14830e;
            C6888i.m12437d(mVar, "NO_LOCKS");
            return C7455d0.m13433h(hVar, typeConstructor, emptyList, false, new C7275g(mVar, hVar2));
        }
    }

    /* renamed from: d.a.a.a.y0.b.h1.g$c */
    public class C6106c extends C7473g {

        /* renamed from: a */
        public final C6242u0 f12066a;

        /* renamed from: b */
        public final /* synthetic */ C6103g f12067b;

        public static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3)];
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6106c(C6103g gVar, C7441m mVar, C6242u0 u0Var) {
            super(mVar);
            if (mVar != null) {
                this.f12067b = gVar;
                this.f12066a = u0Var;
                return;
            }
            $$$reportNull$$$0(0);
            throw null;
        }

        public Collection<C7452c0> computeSupertypes() {
            List<C7452c0> D = this.f12067b.mo23233D();
            if (D != null) {
                return D;
            }
            $$$reportNull$$$0(1);
            throw null;
        }

        public C7452c0 defaultSupertypeIfEmpty() {
            return C7570v.m13783d("Cyclic upper bounds");
        }

        public KotlinBuiltIns getBuiltIns() {
            KotlinBuiltIns f = C7255a.m13133f(this.f12067b);
            if (f != null) {
                return f;
            }
            $$$reportNull$$$0(4);
            throw null;
        }

        public C6083h getDeclarationDescriptor() {
            C6103g gVar = this.f12067b;
            if (gVar != null) {
                return gVar;
            }
            $$$reportNull$$$0(3);
            throw null;
        }

        public List<C6248w0> getParameters() {
            List<C6248w0> emptyList = Collections.emptyList();
            if (emptyList != null) {
                return emptyList;
            }
            $$$reportNull$$$0(2);
            throw null;
        }

        public C6242u0 getSupertypeLoopChecker() {
            C6242u0 u0Var = this.f12066a;
            if (u0Var != null) {
                return u0Var;
            }
            $$$reportNull$$$0(5);
            throw null;
        }

        public boolean isDenotable() {
            return true;
        }

        public List<C7452c0> processSupertypesWithoutCycles(List<C7452c0> list) {
            if (list != null) {
                List<C7452c0> x = this.f12067b.mo23234x(list);
                if (x != null) {
                    return x;
                }
                $$$reportNull$$$0(8);
                throw null;
            }
            $$$reportNull$$$0(7);
            throw null;
        }

        public void reportSupertypeLoopError(C7452c0 c0Var) {
            this.f12067b.mo23235z(c0Var);
        }

        public String toString() {
            return this.f12067b.getName().f13623g;
        }
    }

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6103g(C7441m mVar, C6206k kVar, C6060h hVar, C6717d dVar, C7484h1 h1Var, boolean z, int i, C6234r0 r0Var, C6242u0 u0Var) {
        super(kVar, hVar, dVar, r0Var);
        if (mVar == null) {
            $$$reportNull$$$0(0);
            throw null;
        } else if (kVar == null) {
            $$$reportNull$$$0(1);
            throw null;
        } else if (hVar == null) {
            $$$reportNull$$$0(2);
            throw null;
        } else if (dVar == null) {
            $$$reportNull$$$0(3);
            throw null;
        } else if (h1Var == null) {
            $$$reportNull$$$0(4);
            throw null;
        } else if (r0Var == null) {
            $$$reportNull$$$0(5);
            throw null;
        } else if (u0Var != null) {
            this.f12055g = h1Var;
            this.f12056h = z;
            this.f12057i = i;
            this.f12058j = mVar.mo25018a(new C6104a(mVar, u0Var));
            this.f12059k = mVar.mo25018a(new C6105b(dVar));
            this.f12060l = mVar;
        } else {
            $$$reportNull$$$0(6);
            throw null;
        }
    }

    /* renamed from: D */
    public abstract List<C7452c0> mo23233D();

    public <R, D> R accept(C6210m<R, D> mVar, D d) {
        return mVar.mo22991l(this, d);
    }

    /* renamed from: d */
    public int mo23132d() {
        return this.f12057i;
    }

    public C7489j0 getDefaultType() {
        C7489j0 j0Var = (C7489j0) this.f12059k.invoke();
        if (j0Var != null) {
            return j0Var;
        }
        $$$reportNull$$$0(10);
        throw null;
    }

    public C6248w0 getOriginal() {
        C6248w0 w0Var = (C6248w0) super.getOriginal();
        if (w0Var != null) {
            return w0Var;
        }
        $$$reportNull$$$0(11);
        throw null;
    }

    public final C7567t0 getTypeConstructor() {
        C7567t0 t0Var = (C7567t0) this.f12058j.invoke();
        if (t0Var != null) {
            return t0Var;
        }
        $$$reportNull$$$0(9);
        throw null;
    }

    public List<C7452c0> getUpperBounds() {
        List<C7452c0> supertypes = ((C6106c) getTypeConstructor()).getSupertypes();
        if (supertypes != null) {
            return supertypes;
        }
        $$$reportNull$$$0(8);
        throw null;
    }

    /* renamed from: j */
    public C7484h1 mo23137j() {
        C7484h1 h1Var = this.f12055g;
        if (h1Var != null) {
            return h1Var;
        }
        $$$reportNull$$$0(7);
        throw null;
    }

    /* renamed from: m */
    public C7441m mo23138m() {
        C7441m mVar = this.f12060l;
        if (mVar != null) {
            return mVar;
        }
        $$$reportNull$$$0(14);
        throw null;
    }

    /* renamed from: u */
    public boolean mo23140u() {
        return false;
    }

    /* renamed from: v */
    public boolean mo23141v() {
        return this.f12056h;
    }

    /* renamed from: x */
    public List<C7452c0> mo23234x(List<C7452c0> list) {
        if (list == null) {
            $$$reportNull$$$0(12);
            throw null;
        } else if (list != null) {
            return list;
        } else {
            $$$reportNull$$$0(13);
            throw null;
        }
    }

    /* renamed from: z */
    public abstract void mo23235z(C7452c0 c0Var);
}
