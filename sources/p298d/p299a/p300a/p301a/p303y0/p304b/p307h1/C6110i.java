package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6030b1;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6034d;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6157j;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6210m;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6213n0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6233r;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6251y;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7448b1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;

/* renamed from: d.a.a.a.y0.b.h1.i */
public class C6110i extends C6136r implements C6034d {

    /* renamed from: h */
    public static final C6717d f12073h = C6717d.m12272p("<init>");

    /* renamed from: g */
    public final boolean f12074g;

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 19 || i == 25)) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 19 || i == 25)) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 23:
                objArr[0] = "annotations";
                break;
            case 2:
            case 22:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 24:
                objArr[0] = "source";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 19:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 18:
                objArr[0] = "originalSubstitutor";
                break;
            case 20:
                objArr[0] = "overriddenDescriptors";
                break;
            case 21:
                objArr[0] = "newOwner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 19) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 25) {
            switch (i) {
                case 15:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 16:
                    objArr[1] = "getConstructedClass";
                    break;
                case 17:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case 17:
            case 19:
            case 25:
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            case 20:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 19 || i == 25)) {
            switch (i) {
                case 15:
                case 16:
                case 17:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6110i(C6046e eVar, C6157j jVar, C6060h hVar, boolean z, C6023b.C6024a aVar, C6234r0 r0Var) {
        super(eVar, jVar, hVar, f12073h, aVar, r0Var);
        if (eVar == null) {
            $$$reportNull$$$0(0);
            throw null;
        } else if (hVar == null) {
            $$$reportNull$$$0(1);
            throw null;
        } else if (aVar == null) {
            $$$reportNull$$$0(2);
            throw null;
        } else if (r0Var != null) {
            this.f12074g = z;
        } else {
            $$$reportNull$$$0(3);
            throw null;
        }
    }

    /* renamed from: D */
    public C6110i mo23245D(List<C6030b1> list, C6233r rVar) {
        if (list == null) {
            $$$reportNull$$$0(13);
            throw null;
        } else if (rVar != null) {
            mo23246O(list, rVar, getContainingDeclaration().getDeclaredTypeParameters());
            return this;
        } else {
            $$$reportNull$$$0(14);
            throw null;
        }
    }

    /* renamed from: O */
    public C6110i mo23246O(List<C6030b1> list, C6233r rVar, List<C6248w0> list2) {
        C6213n0 n0Var = null;
        if (list == null) {
            $$$reportNull$$$0(10);
            throw null;
        } else if (rVar == null) {
            $$$reportNull$$$0(11);
            throw null;
        } else if (list2 != null) {
            C6046e z = getContainingDeclaration();
            if (z.isInner()) {
                C6206k containingDeclaration = z.getContainingDeclaration();
                if (containingDeclaration instanceof C6046e) {
                    n0Var = ((C6046e) containingDeclaration).getThisAsReceiverParameter();
                }
            }
            initialize((C6213n0) null, n0Var, list2, list, (C7452c0) null, C6251y.FINAL, rVar);
            return this;
        } else {
            $$$reportNull$$$0(12);
            throw null;
        }
    }

    public <R, D> R accept(C6210m<R, D> mVar, D d) {
        return mVar.mo22984e(this, d);
    }

    public C6023b copy(C6206k kVar, C6251y yVar, C6233r rVar, C6023b.C6024a aVar, boolean z) {
        C6034d dVar = (C6034d) super.copy(kVar, yVar, rVar, aVar, z);
        if (dVar != null) {
            return dVar;
        }
        $$$reportNull$$$0(25);
        throw null;
    }

    public C6034d getOriginal() {
        C6034d dVar = (C6034d) super.getOriginal();
        if (dVar != null) {
            return dVar;
        }
        $$$reportNull$$$0(17);
        throw null;
    }

    public Collection<? extends C6244v> getOverriddenDescriptors() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        $$$reportNull$$$0(19);
        throw null;
    }

    /* renamed from: q */
    public boolean mo23248q() {
        return this.f12074g;
    }

    /* renamed from: r */
    public C6046e mo23249r() {
        C6046e z = getContainingDeclaration();
        if (z != null) {
            return z;
        }
        $$$reportNull$$$0(16);
        throw null;
    }

    public void setOverriddenDescriptors(Collection<? extends C6023b> collection) {
        if (collection == null) {
            $$$reportNull$$$0(20);
            throw null;
        }
    }

    public C6034d substitute(C7448b1 b1Var) {
        if (b1Var != null) {
            return (C6034d) super.substitute(b1Var);
        }
        $$$reportNull$$$0(18);
        throw null;
    }

    /* renamed from: x */
    public C6110i createSubstitutedCopy(C6206k kVar, C6244v vVar, C6023b.C6024a aVar, C6717d dVar, C6060h hVar, C6234r0 r0Var) {
        if (kVar == null) {
            $$$reportNull$$$0(21);
            throw null;
        } else if (aVar == null) {
            $$$reportNull$$$0(22);
            throw null;
        } else if (hVar == null) {
            $$$reportNull$$$0(23);
            throw null;
        } else if (r0Var != null) {
            C6023b.C6024a aVar2 = C6023b.C6024a.DECLARATION;
            if (aVar == aVar2 || aVar == C6023b.C6024a.SYNTHESIZED) {
                return new C6110i((C6046e) kVar, this, hVar, this.f12074g, aVar2, r0Var);
            }
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\n" + "newOwner: " + kVar + "\n" + "kind: " + aVar);
        } else {
            $$$reportNull$$$0(24);
            throw null;
        }
    }

    /* renamed from: z */
    public C6046e getContainingDeclaration() {
        C6046e eVar = (C6046e) super.getContainingDeclaration();
        if (eVar != null) {
            return eVar;
        }
        $$$reportNull$$$0(15);
        throw null;
    }

    /* renamed from: copy  reason: collision with other method in class */
    public C6244v m15016copy(C6206k kVar, C6251y yVar, C6233r rVar, C6023b.C6024a aVar, boolean z) {
        C6034d dVar = (C6034d) super.copy(kVar, yVar, rVar, aVar, z);
        if (dVar != null) {
            return dVar;
        }
        $$$reportNull$$$0(25);
        throw null;
    }
}
