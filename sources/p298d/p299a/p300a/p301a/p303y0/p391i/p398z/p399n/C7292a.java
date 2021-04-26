package p298d.p299a.p300a.p301a.p303y0.p391i.p398z.p399n;

import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;

/* renamed from: d.a.a.a.y0.i.z.n.a */
public abstract class C7292a implements C7295d {

    /* renamed from: a */
    public final C7452c0 f14536a;

    /* renamed from: b */
    public final C7295d f14537b;

    public C7292a(C7452c0 c0Var, C7295d dVar) {
        if (c0Var != null) {
            this.f14536a = c0Var;
            this.f14537b = dVar == null ? this : dVar;
            return;
        }
        m13158c(0);
        throw null;
    }

    /* renamed from: c */
    public static /* synthetic */ void m13158c(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2) ? 2 : 3)];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (!(i == 1 || i == 2)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 2) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: a */
    public C7452c0 mo23429a() {
        C7452c0 c0Var = this.f14536a;
        if (c0Var != null) {
            return c0Var;
        }
        m13158c(1);
        throw null;
    }
}
