package p298d.p299a.p300a.p301a.p303y0.p391i.p398z.p399n;

import p298d.p299a.p300a.p301a.p303y0.p304b.C6019a;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;

/* renamed from: d.a.a.a.y0.i.z.n.b */
public class C7293b extends C7292a implements C7295d {

    /* renamed from: c */
    public final C6019a f14538c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7293b(C6019a aVar, C7452c0 c0Var, C7295d dVar) {
        super(c0Var, dVar);
        if (aVar != null) {
            this.f14538c = aVar;
            return;
        }
        m13160c(0);
        throw null;
    }

    /* renamed from: c */
    public static /* synthetic */ void m13160c(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 2 ? 3 : 2)];
        if (i == 1) {
            objArr[0] = "receiverType";
        } else if (i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String format = String.format(str, objArr);
        throw (i != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public String toString() {
        return mo23429a() + ": Ext {" + this.f14538c + "}";
    }
}
