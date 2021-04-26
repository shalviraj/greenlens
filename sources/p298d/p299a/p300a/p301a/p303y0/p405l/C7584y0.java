package p298d.p299a.p300a.p301a.p303y0.p405l;

import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e;

/* renamed from: d.a.a.a.y0.l.y0 */
public class C7584y0 extends C7582x0 {

    /* renamed from: a */
    public final C7484h1 f15033a;

    /* renamed from: b */
    public final C7452c0 f15034b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C7584y0(C7452c0 c0Var) {
        this(C7484h1.INVARIANT, c0Var);
        if (c0Var != null) {
        } else {
            m13830d(2);
            throw null;
        }
    }

    public C7584y0(C7484h1 h1Var, C7452c0 c0Var) {
        if (h1Var == null) {
            m13830d(0);
            throw null;
        } else if (c0Var != null) {
            this.f15033a = h1Var;
            this.f15034b = c0Var;
        } else {
            m13830d(1);
            throw null;
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m13830d(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5) ? 2 : 3)];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (!(i == 4 || i == 5)) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: a */
    public C7452c0 mo25161a() {
        C7452c0 c0Var = this.f15034b;
        if (c0Var != null) {
            return c0Var;
        }
        m13830d(5);
        throw null;
    }

    /* renamed from: b */
    public C7484h1 mo25162b() {
        C7484h1 h1Var = this.f15033a;
        if (h1Var != null) {
            return h1Var;
        }
        m13830d(4);
        throw null;
    }

    /* renamed from: c */
    public boolean mo25163c() {
        return false;
    }

    public C7580w0 refine(C7495e eVar) {
        return new C7584y0(this.f15033a, eVar.mo25135g(this.f15034b));
    }
}
