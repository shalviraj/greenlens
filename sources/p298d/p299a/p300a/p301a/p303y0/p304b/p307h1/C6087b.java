package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6210m;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6213n0;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7193g;
import p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7274f;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7285l;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7437i;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7448b1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7460d1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7586z0;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e;
import p298d.p344x.p345b.C6851a;

/* renamed from: d.a.a.a.y0.b.h1.b */
public abstract class C6087b extends C6146v {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public final C7437i<C7489j0> defaultType;
    private final C6717d name;
    private final C7437i<C6213n0> thisAsReceiverParameter;
    private final C7437i<C7277h> unsubstitutedInnerClassesScope;

    /* renamed from: d.a.a.a.y0.b.h1.b$a */
    public class C6088a implements C6851a<C7489j0> {
        public C6088a() {
        }

        public Object invoke() {
            C6087b bVar = C6087b.this;
            return C7460d1.m13448n(bVar, bVar.getUnsubstitutedMemberScope(), new C6085a(this));
        }
    }

    /* renamed from: d.a.a.a.y0.b.h1.b$b */
    public class C6089b implements C6851a<C7277h> {
        public C6089b() {
        }

        public Object invoke() {
            return new C7274f(C6087b.this.getUnsubstitutedMemberScope());
        }
    }

    /* renamed from: d.a.a.a.y0.b.h1.b$c */
    public class C6090c implements C6851a<C6213n0> {
        public C6090c() {
        }

        public Object invoke() {
            return new C6140s(C6087b.this);
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        int i2 = i;
        String str = (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 8 || i2 == 11 || i2 == 13 || i2 == 15 || i2 == 16 || i2 == 18 || i2 == 19) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 8 || i2 == 11 || i2 == 13 || i2 == 15 || i2 == 16 || i2 == 18 || i2 == 19) ? 2 : 3)];
        switch (i2) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 6:
            case 12:
                objArr[0] = "typeArguments";
                break;
            case 7:
            case 10:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 9:
            case 14:
                objArr[0] = "typeSubstitution";
                break;
            case 17:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i2 == 2) {
            objArr[1] = "getName";
        } else if (i2 == 3) {
            objArr[1] = "getOriginal";
        } else if (i2 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i2 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i2 == 8 || i2 == 11 || i2 == 13 || i2 == 15) {
            objArr[1] = "getMemberScope";
        } else if (i2 == 16) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i2 == 18) {
            objArr[1] = "substitute";
        } else if (i2 != 19) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 19:
                break;
            case 6:
            case 7:
            case 9:
            case 10:
            case 12:
            case 14:
                objArr[2] = "getMemberScope";
                break;
            case 17:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 8 || i2 == 11 || i2 == 13 || i2 == 15 || i2 == 16 || i2 == 18 || i2 == 19) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public C6087b(C7441m mVar, C6717d dVar) {
        if (mVar == null) {
            $$$reportNull$$$0(0);
        }
        if (dVar == null) {
            $$$reportNull$$$0(1);
        }
        this.name = dVar;
        this.defaultType = mVar.mo25018a(new C6088a());
        this.unsubstitutedInnerClassesScope = mVar.mo25018a(new C6089b());
        this.thisAsReceiverParameter = mVar.mo25018a(new C6090c());
    }

    public <R, D> R accept(C6210m<R, D> mVar, D d) {
        return mVar.mo22980a(this, d);
    }

    public C7489j0 getDefaultType() {
        C7489j0 j0Var = (C7489j0) this.defaultType.invoke();
        if (j0Var == null) {
            $$$reportNull$$$0(19);
        }
        return j0Var;
    }

    public C7277h getMemberScope(C7586z0 z0Var) {
        if (z0Var == null) {
            $$$reportNull$$$0(14);
        }
        C7277h memberScope = getMemberScope(z0Var, C7255a.m13137j(C7193g.m13024d(this)));
        if (memberScope == null) {
            $$$reportNull$$$0(15);
        }
        return memberScope;
    }

    public C7277h getMemberScope(C7586z0 z0Var, C7495e eVar) {
        if (z0Var == null) {
            $$$reportNull$$$0(9);
        }
        if (eVar == null) {
            $$$reportNull$$$0(10);
        }
        if (z0Var.mo23540f()) {
            C7277h unsubstitutedMemberScope = getUnsubstitutedMemberScope(eVar);
            if (unsubstitutedMemberScope == null) {
                $$$reportNull$$$0(11);
            }
            return unsubstitutedMemberScope;
        }
        return new C7285l(getUnsubstitutedMemberScope(eVar), C7448b1.m13403e(z0Var));
    }

    public C6717d getName() {
        C6717d dVar = this.name;
        if (dVar == null) {
            $$$reportNull$$$0(2);
        }
        return dVar;
    }

    public C6046e getOriginal() {
        return this;
    }

    public C6213n0 getThisAsReceiverParameter() {
        C6213n0 n0Var = (C6213n0) this.thisAsReceiverParameter.invoke();
        if (n0Var == null) {
            $$$reportNull$$$0(5);
        }
        return n0Var;
    }

    public C7277h getUnsubstitutedInnerClassesScope() {
        C7277h hVar = (C7277h) this.unsubstitutedInnerClassesScope.invoke();
        if (hVar == null) {
            $$$reportNull$$$0(4);
        }
        return hVar;
    }

    public C7277h getUnsubstitutedMemberScope() {
        C7277h unsubstitutedMemberScope = getUnsubstitutedMemberScope(C7255a.m13137j(C7193g.m13024d(this)));
        if (unsubstitutedMemberScope == null) {
            $$$reportNull$$$0(16);
        }
        return unsubstitutedMemberScope;
    }

    public C6046e substitute(C7448b1 b1Var) {
        if (b1Var == null) {
            $$$reportNull$$$0(17);
        }
        return b1Var.mo25051h() ? this : new C6144u(this, b1Var);
    }
}
