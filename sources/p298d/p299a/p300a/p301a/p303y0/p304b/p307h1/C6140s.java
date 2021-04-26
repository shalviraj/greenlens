package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.p399n.C7294c;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.p399n.C7295d;

/* renamed from: d.a.a.a.y0.b.h1.s */
public class C6140s extends C6094d {

    /* renamed from: h */
    public final C6046e f12147h;

    /* renamed from: i */
    public final C7294c f12148i;

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2) ? 2 : 3)];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (!(i == 1 || i == 2)) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 2) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6140s(C6046e eVar) {
        super(C6060h.C6061a.f11922b);
        if (eVar != null) {
            Objects.requireNonNull(C6060h.f11920d);
            this.f12147h = eVar;
            this.f12148i = new C7294c(eVar, (C7294c) null);
            return;
        }
        $$$reportNull$$$0(0);
        throw null;
    }

    public C6206k getContainingDeclaration() {
        C6046e eVar = this.f12147h;
        if (eVar != null) {
            return eVar;
        }
        $$$reportNull$$$0(2);
        throw null;
    }

    public C7295d getValue() {
        C7294c cVar = this.f12148i;
        if (cVar != null) {
            return cVar;
        }
        $$$reportNull$$$0(1);
        throw null;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("class ");
        u.append(this.f12147h.getName());
        u.append("::this");
        return u.toString();
    }
}
