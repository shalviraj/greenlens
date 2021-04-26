package p298d.p299a.p300a.p301a.p303y0.p405l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6242u0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7193g;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;

/* renamed from: d.a.a.a.y0.l.m */
public class C7543m extends C7446b implements C7567t0 {

    /* renamed from: a */
    public final C6046e f14980a;

    /* renamed from: b */
    public final List<C6248w0> f14981b;

    /* renamed from: c */
    public final Collection<C7452c0> f14982c;

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (!(i == 4 || i == 5 || i == 6 || i == 7)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5 || i == 6 || i == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7543m(C6046e eVar, List<? extends C6248w0> list, Collection<C7452c0> collection, C7441m mVar) {
        super(mVar);
        if (list == null) {
            $$$reportNull$$$0(1);
            throw null;
        } else if (collection == null) {
            $$$reportNull$$$0(2);
            throw null;
        } else if (mVar != null) {
            this.f14980a = eVar;
            this.f14981b = Collections.unmodifiableList(new ArrayList(list));
            this.f14982c = Collections.unmodifiableCollection(collection);
        } else {
            $$$reportNull$$$0(3);
            throw null;
        }
    }

    public Collection<C7452c0> computeSupertypes() {
        Collection<C7452c0> collection = this.f14982c;
        if (collection != null) {
            return collection;
        }
        $$$reportNull$$$0(6);
        throw null;
    }

    public C6046e getDeclarationDescriptor() {
        C6046e eVar = this.f14980a;
        if (eVar != null) {
            return eVar;
        }
        $$$reportNull$$$0(5);
        throw null;
    }

    public List<C6248w0> getParameters() {
        List<C6248w0> list = this.f14981b;
        if (list != null) {
            return list;
        }
        $$$reportNull$$$0(4);
        throw null;
    }

    public C6242u0 getSupertypeLoopChecker() {
        return C6242u0.C6243a.f12261a;
    }

    public boolean isDenotable() {
        return true;
    }

    public String toString() {
        return C7193g.m13027g(this.f14980a).mo23874b();
    }
}
