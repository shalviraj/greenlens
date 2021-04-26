package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import java.util.ArrayList;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6242u0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7193g;
import p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7484h1;
import p298d.p344x.p345b.C6862l;

/* renamed from: d.a.a.a.y0.b.h1.m0 */
public class C6121m0 extends C6103g {

    /* renamed from: m */
    public final C6862l<C7452c0, Void> f12094m;

    /* renamed from: n */
    public final List<C7452c0> f12095n;

    /* renamed from: o */
    public boolean f12096o;

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 5 || i == 28) ? 2 : 3)];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 5 || i == 28) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6121m0(C6206k kVar, C6060h hVar, boolean z, C7484h1 h1Var, C6717d dVar, int i, C6234r0 r0Var, C6862l<C7452c0, Void> lVar, C6242u0 u0Var, C7441m mVar) {
        super(mVar, kVar, hVar, dVar, h1Var, z, i, r0Var, u0Var);
        if (kVar == null) {
            $$$reportNull$$$0(19);
            throw null;
        } else if (hVar == null) {
            $$$reportNull$$$0(20);
            throw null;
        } else if (h1Var == null) {
            $$$reportNull$$$0(21);
            throw null;
        } else if (dVar == null) {
            $$$reportNull$$$0(22);
            throw null;
        } else if (r0Var == null) {
            $$$reportNull$$$0(23);
            throw null;
        } else if (u0Var == null) {
            $$$reportNull$$$0(24);
            throw null;
        } else if (mVar != null) {
            this.f12095n = new ArrayList(1);
            this.f12096o = false;
            this.f12094m = lVar;
        } else {
            $$$reportNull$$$0(25);
            throw null;
        }
    }

    /* renamed from: V */
    public static C6121m0 m10977V(C6206k kVar, C6060h hVar, boolean z, C7484h1 h1Var, C6717d dVar, int i, C6234r0 r0Var, C7441m mVar) {
        if (kVar == null) {
            $$$reportNull$$$0(6);
            throw null;
        } else if (hVar == null) {
            $$$reportNull$$$0(7);
            throw null;
        } else if (h1Var == null) {
            $$$reportNull$$$0(8);
            throw null;
        } else if (dVar == null) {
            $$$reportNull$$$0(9);
            throw null;
        } else if (mVar != null) {
            return new C6121m0(kVar, hVar, z, h1Var, dVar, i, r0Var, (C6862l<C7452c0, Void>) null, C6242u0.C6243a.f12261a, mVar);
        } else {
            $$$reportNull$$$0(11);
            throw null;
        }
    }

    /* renamed from: W */
    public static C6248w0 m10978W(C6206k kVar, C6060h hVar, boolean z, C7484h1 h1Var, C6717d dVar, int i, C7441m mVar) {
        if (kVar == null) {
            $$$reportNull$$$0(0);
            throw null;
        } else if (hVar == null) {
            $$$reportNull$$$0(1);
            throw null;
        } else if (h1Var == null) {
            $$$reportNull$$$0(2);
            throw null;
        } else if (mVar != null) {
            C6121m0 V = m10977V(kVar, hVar, z, h1Var, dVar, i, C6234r0.f12257a, mVar);
            V.mo23263O(C7255a.m13133f(kVar).getDefaultBound());
            V.mo23264U();
            V.f12096o = true;
            return V;
        } else {
            $$$reportNull$$$0(4);
            throw null;
        }
    }

    /* renamed from: D */
    public List<C7452c0> mo23233D() {
        if (this.f12096o) {
            List<C7452c0> list = this.f12095n;
            if (list != null) {
                return list;
            }
            $$$reportNull$$$0(28);
            throw null;
        }
        StringBuilder u = C0843a.m460u("Type parameter descriptor is not initialized: ");
        u.append(mo23265X());
        throw new IllegalStateException(u.toString());
    }

    /* renamed from: O */
    public void mo23263O(C7452c0 c0Var) {
        if (c0Var != null) {
            mo23264U();
            if (!C5266a.m10046v2(c0Var)) {
                this.f12095n.add(c0Var);
                return;
            }
            return;
        }
        $$$reportNull$$$0(26);
        throw null;
    }

    /* renamed from: U */
    public final void mo23264U() {
        if (this.f12096o) {
            StringBuilder u = C0843a.m460u("Type parameter descriptor is already initialized: ");
            u.append(mo23265X());
            throw new IllegalStateException(u.toString());
        }
    }

    /* renamed from: X */
    public final String mo23265X() {
        return getName() + " declared in " + C7193g.m13027g(getContainingDeclaration());
    }

    /* renamed from: z */
    public void mo23235z(C7452c0 c0Var) {
        if (c0Var != null) {
            C6862l<C7452c0, Void> lVar = this.f12094m;
            if (lVar != null) {
                lVar.invoke(c0Var);
                return;
            }
            return;
        }
        $$$reportNull$$$0(27);
        throw null;
    }
}
