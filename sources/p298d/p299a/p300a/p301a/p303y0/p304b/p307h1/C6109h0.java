package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.p399n.C7295d;

/* renamed from: d.a.a.a.y0.b.h1.h0 */
public class C6109h0 extends C6094d {

    /* renamed from: h */
    public final C6206k f12071h;

    /* renamed from: i */
    public final C7295d f12072i;

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 4) ? 2 : 3)];
        if (i == 1) {
            objArr[0] = "value";
        } else if (i == 2) {
            objArr[0] = "annotations";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else if (i != 5) {
            objArr[0] = "containingDeclaration";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 3) {
            objArr[1] = "getValue";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (!(i == 3 || i == 4)) {
            if (i != 5) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 3 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6109h0(C6206k kVar, C7295d dVar, C6060h hVar) {
        super(hVar);
        if (kVar == null) {
            $$$reportNull$$$0(0);
            throw null;
        } else if (hVar != null) {
            this.f12071h = kVar;
            this.f12072i = dVar;
        } else {
            $$$reportNull$$$0(2);
            throw null;
        }
    }

    public C6206k getContainingDeclaration() {
        C6206k kVar = this.f12071h;
        if (kVar != null) {
            return kVar;
        }
        $$$reportNull$$$0(4);
        throw null;
    }

    public C7295d getValue() {
        C7295d dVar = this.f12072i;
        if (dVar != null) {
            return dVar;
        }
        $$$reportNull$$$0(3);
        throw null;
    }
}
