package p298d.p299a.p300a.p301a.p303y0.p391i.p398z.p399n;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;

/* renamed from: d.a.a.a.y0.i.z.n.g */
public class C7298g extends C7292a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7298g(C7452c0 c0Var) {
        super(c0Var, (C7295d) null);
        if (c0Var == null) {
            m13166c(0);
            throw null;
        } else if (c0Var != null) {
        } else {
            m13166c(1);
            throw null;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m13166c(int i) {
        Object[] objArr = new Object[3];
        if (i != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("{Transient} : ");
        u.append(mo23429a());
        return u.toString();
    }
}
