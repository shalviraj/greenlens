package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import java.util.ArrayList;
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

/* renamed from: d.a.a.a.y0.b.h1.b0 */
public class C6091b0 extends C6112j {

    /* renamed from: j */
    public final C6051f f12000j;

    /* renamed from: k */
    public final boolean f12001k;

    /* renamed from: l */
    public C6251y f12002l;

    /* renamed from: m */
    public C6233r f12003m;

    /* renamed from: n */
    public C7567t0 f12004n;

    /* renamed from: o */
    public List<C6248w0> f12005o;

    /* renamed from: p */
    public final Collection<C7452c0> f12006p;

    /* renamed from: q */
    public final C7441m f12007q;

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
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
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
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
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
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
    public C6091b0(C6206k kVar, C6051f fVar, boolean z, boolean z2, C6717d dVar, C6234r0 r0Var, C7441m mVar) {
        super(mVar, kVar, dVar, r0Var, z2);
        if (dVar == null) {
            $$$reportNull$$$0(2);
            throw null;
        } else if (mVar != null) {
            this.f12006p = new ArrayList();
            this.f12007q = mVar;
            this.f12000j = fVar;
            this.f12001k = z;
        } else {
            $$$reportNull$$$0(4);
            throw null;
        }
    }

    public C6060h getAnnotations() {
        Objects.requireNonNull(C6060h.f11920d);
        C6060h hVar = C6060h.C6061a.f11922b;
        if (hVar != null) {
            return hVar;
        }
        $$$reportNull$$$0(5);
        throw null;
    }

    public C6046e getCompanionObjectDescriptor() {
        return null;
    }

    public Collection getConstructors() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        $$$reportNull$$$0(13);
        throw null;
    }

    public List<C6248w0> getDeclaredTypeParameters() {
        List<C6248w0> list = this.f12005o;
        if (list != null) {
            return list;
        }
        $$$reportNull$$$0(15);
        throw null;
    }

    public C6051f getKind() {
        C6051f fVar = this.f12000j;
        if (fVar != null) {
            return fVar;
        }
        $$$reportNull$$$0(8);
        throw null;
    }

    public C6251y getModality() {
        C6251y yVar = this.f12002l;
        if (yVar != null) {
            return yVar;
        }
        $$$reportNull$$$0(7);
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
        $$$reportNull$$$0(18);
        throw null;
    }

    public C7567t0 getTypeConstructor() {
        C7567t0 t0Var = this.f12004n;
        if (t0Var != null) {
            return t0Var;
        }
        $$$reportNull$$$0(11);
        throw null;
    }

    public C7277h getUnsubstitutedMemberScope(C7495e eVar) {
        if (eVar != null) {
            C7277h.C7280b bVar = C7277h.C7280b.f14521b;
            if (bVar != null) {
                return bVar;
            }
            $$$reportNull$$$0(17);
            throw null;
        }
        $$$reportNull$$$0(16);
        throw null;
    }

    public C6034d getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    public C6233r getVisibility() {
        C6233r rVar = this.f12003m;
        if (rVar != null) {
            return rVar;
        }
        $$$reportNull$$$0(10);
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
        return this.f12001k;
    }

    public boolean isValue() {
        return false;
    }

    public String toString() {
        return C6120m.toString(this);
    }

    /* renamed from: x */
    public void mo23197x() {
        this.f12004n = new C7543m(this, this.f12005o, this.f12006p, this.f12007q);
        Set<C6034d> emptySet = Collections.emptySet();
        if (emptySet != null) {
            for (C6034d dVar : emptySet) {
                ((C6110i) dVar).setReturnType(getDefaultType());
            }
            return;
        }
        $$$reportNull$$$0(13);
        throw null;
    }

    /* renamed from: z */
    public void mo23198z(List<C6248w0> list) {
        if (this.f12005o == null) {
            this.f12005o = new ArrayList(list);
            return;
        }
        StringBuilder u = C0843a.m460u("Type parameters are already set for ");
        u.append(getName());
        throw new IllegalStateException(u.toString());
    }
}
