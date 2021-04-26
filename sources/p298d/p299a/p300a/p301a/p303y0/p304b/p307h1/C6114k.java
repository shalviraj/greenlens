package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6034d;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6051f;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6219q;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6233r;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6251y;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7543m;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7567t0;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e;

/* renamed from: d.a.a.a.y0.b.h1.k */
public class C6114k extends C6112j {

    /* renamed from: j */
    public final C6251y f12080j;

    /* renamed from: k */
    public final C6051f f12081k;

    /* renamed from: l */
    public final C7567t0 f12082l;

    /* renamed from: m */
    public C7277h f12083m;

    /* renamed from: n */
    public Set<C6034d> f12084n;

    /* renamed from: o */
    public C6034d f12085o;

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6114k(C6206k kVar, C6717d dVar, C6251y yVar, C6051f fVar, Collection<C7452c0> collection, C6234r0 r0Var, boolean z, C7441m mVar) {
        super(mVar, kVar, dVar, r0Var, z);
        if (kVar == null) {
            $$$reportNull$$$0(0);
            throw null;
        } else if (dVar == null) {
            $$$reportNull$$$0(1);
            throw null;
        } else if (collection == null) {
            $$$reportNull$$$0(4);
            throw null;
        } else if (mVar != null) {
            this.f12080j = yVar;
            this.f12081k = fVar;
            this.f12082l = new C7543m(this, Collections.emptyList(), collection, mVar);
        } else {
            $$$reportNull$$$0(6);
            throw null;
        }
    }

    public C6060h getAnnotations() {
        Objects.requireNonNull(C6060h.f11920d);
        C6060h hVar = C6060h.C6061a.f11922b;
        if (hVar != null) {
            return hVar;
        }
        $$$reportNull$$$0(9);
        throw null;
    }

    public C6046e getCompanionObjectDescriptor() {
        return null;
    }

    public Collection<C6034d> getConstructors() {
        Set<C6034d> set = this.f12084n;
        if (set != null) {
            return set;
        }
        $$$reportNull$$$0(11);
        throw null;
    }

    public List<C6248w0> getDeclaredTypeParameters() {
        List<C6248w0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        $$$reportNull$$$0(18);
        throw null;
    }

    public C6051f getKind() {
        C6051f fVar = this.f12081k;
        if (fVar != null) {
            return fVar;
        }
        $$$reportNull$$$0(15);
        throw null;
    }

    public C6251y getModality() {
        C6251y yVar = this.f12080j;
        if (yVar != null) {
            return yVar;
        }
        $$$reportNull$$$0(16);
        throw null;
    }

    public Collection<C6046e> getSealedSubclasses() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        $$$reportNull$$$0(19);
        throw null;
    }

    public C7277h getStaticScope() {
        C7277h.C7280b bVar = C7277h.C7280b.f14521b;
        if (bVar != null) {
            return bVar;
        }
        $$$reportNull$$$0(14);
        throw null;
    }

    public C7567t0 getTypeConstructor() {
        C7567t0 t0Var = this.f12082l;
        if (t0Var != null) {
            return t0Var;
        }
        $$$reportNull$$$0(10);
        throw null;
    }

    public C7277h getUnsubstitutedMemberScope(C7495e eVar) {
        if (eVar != null) {
            C7277h hVar = this.f12083m;
            if (hVar != null) {
                return hVar;
            }
            $$$reportNull$$$0(13);
            throw null;
        }
        $$$reportNull$$$0(12);
        throw null;
    }

    public C6034d getUnsubstitutedPrimaryConstructor() {
        return this.f12085o;
    }

    public C6233r getVisibility() {
        C6233r rVar = C6219q.f12245e;
        if (rVar != null) {
            return rVar;
        }
        $$$reportNull$$$0(17);
        throw null;
    }

    public boolean isActual() {
        return false;
    }

    public boolean isCompanionObject() {
        return false;
    }

    public boolean isData() {
        return false;
    }

    public boolean isExpect() {
        return false;
    }

    public boolean isFun() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    public boolean isInner() {
        return false;
    }

    public boolean isValue() {
        return false;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("class ");
        u.append(getName());
        return u.toString();
    }

    /* renamed from: x */
    public final void mo23258x(C7277h hVar, Set<C6034d> set, C6034d dVar) {
        if (hVar == null) {
            $$$reportNull$$$0(7);
            throw null;
        } else if (set != null) {
            this.f12083m = hVar;
            this.f12084n = set;
            this.f12085o = dVar;
        } else {
            $$$reportNull$$$0(8);
            throw null;
        }
    }
}
