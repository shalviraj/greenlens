package p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p317g0;

import java.util.List;
import java.util.Objects;
import p005b.p291q.p292a.C5266a;
import p298d.C6768j;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6019a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6213n0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6244v;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6110i;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;

/* renamed from: d.a.a.a.y0.d.a.g0.c */
public class C6306c extends C6110i implements C6305b {

    /* renamed from: i */
    public Boolean f12405i;

    /* renamed from: j */
    public Boolean f12406j;

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 11 || i == 18) ? 2 : 3)];
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 11 || i == 18) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6306c(C6046e eVar, C6306c cVar, C6060h hVar, boolean z, C6023b.C6024a aVar, C6234r0 r0Var) {
        super(eVar, cVar, hVar, z, aVar, r0Var);
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
            this.f12405i = null;
            this.f12406j = null;
        } else {
            $$$reportNull$$$0(3);
            throw null;
        }
    }

    /* renamed from: U */
    public static C6306c m11292U(C6046e eVar, C6060h hVar, boolean z, C6234r0 r0Var) {
        if (eVar == null) {
            $$$reportNull$$$0(4);
            throw null;
        } else if (hVar == null) {
            $$$reportNull$$$0(5);
            throw null;
        } else if (r0Var != null) {
            return new C6306c(eVar, (C6306c) null, hVar, z, C6023b.C6024a.DECLARATION, r0Var);
        } else {
            $$$reportNull$$$0(6);
            throw null;
        }
    }

    /* renamed from: V */
    public C6306c mo23250x(C6206k kVar, C6244v vVar, C6023b.C6024a aVar, C6717d dVar, C6060h hVar, C6234r0 r0Var) {
        if (kVar == null) {
            $$$reportNull$$$0(7);
            throw null;
        } else if (aVar == null) {
            $$$reportNull$$$0(8);
            throw null;
        } else if (hVar == null) {
            $$$reportNull$$$0(9);
            throw null;
        } else if (r0Var == null) {
            $$$reportNull$$$0(10);
            throw null;
        } else if (aVar == C6023b.C6024a.DECLARATION || aVar == C6023b.C6024a.SYNTHESIZED) {
            C6046e eVar = (C6046e) kVar;
            C6306c cVar = (C6306c) vVar;
            if (eVar == null) {
                $$$reportNull$$$0(12);
                throw null;
            } else if (aVar == null) {
                $$$reportNull$$$0(13);
                throw null;
            } else if (r0Var == null) {
                $$$reportNull$$$0(14);
                throw null;
            } else if (hVar != null) {
                C6306c cVar2 = new C6306c(eVar, cVar, hVar, this.f12074g, aVar, r0Var);
                cVar2.setHasStableParameterNames(hasStableParameterNames());
                cVar2.setHasSynthesizedParameterNames(hasSynthesizedParameterNames());
                return cVar2;
            } else {
                $$$reportNull$$$0(15);
                throw null;
            }
        } else {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\n" + "newOwner: " + kVar + "\n" + "kind: " + aVar);
        }
    }

    public boolean hasStableParameterNames() {
        return this.f12405i.booleanValue();
    }

    public boolean hasSynthesizedParameterNames() {
        return this.f12406j.booleanValue();
    }

    /* renamed from: i */
    public C6305b mo23461i(C7452c0 c0Var, List list, C7452c0 c0Var2, C6768j jVar) {
        C7452c0 c0Var3 = c0Var;
        C6768j jVar2 = jVar;
        C6213n0 n0Var = null;
        if (c0Var2 != null) {
            C6306c V = mo23250x(getContainingDeclaration(), (C6244v) null, getKind(), (C6717d) null, getAnnotations(), getSource());
            if (c0Var3 != null) {
                Objects.requireNonNull(C6060h.f11920d);
                n0Var = C5266a.m10032t0(V, c0Var, C6060h.C6061a.f11922b);
            }
            List list2 = list;
            V.initialize(n0Var, getDispatchReceiverParameter(), getTypeParameters(), C5266a.m9978k0(list, getValueParameters(), V), c0Var2, getModality(), getVisibility());
            if (jVar2 != null) {
                V.putInUserDataMap((C6019a.C6020a) jVar2.f13681g, jVar2.f13682h);
            }
            return V;
        }
        $$$reportNull$$$0(17);
        throw null;
    }

    public void setHasStableParameterNames(boolean z) {
        this.f12405i = Boolean.valueOf(z);
    }

    public void setHasSynthesizedParameterNames(boolean z) {
        this.f12406j = Boolean.valueOf(z);
    }
}
