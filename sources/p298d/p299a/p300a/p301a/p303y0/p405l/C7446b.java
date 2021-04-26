package p298d.p299a.p300a.p301a.p303y0.p405l;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6021a0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6032c0;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p391i.C7193g;
import p298d.p299a.p300a.p301a.p303y0.p391i.p396x.C7255a;
import p298d.p299a.p300a.p301a.p303y0.p404k.C7441m;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7639l;

/* renamed from: d.a.a.a.y0.l.b */
public abstract class C7446b extends C7473g implements C7567t0 {
    private int hashCode;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ void $$$reportNull$$$0(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto L_0x000c
            if (r9 == r1) goto L_0x000c
            if (r9 == r0) goto L_0x000c
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L_0x000e
        L_0x000c:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        L_0x000e:
            r4 = 2
            if (r9 == r2) goto L_0x0017
            if (r9 == r1) goto L_0x0017
            if (r9 == r0) goto L_0x0017
            r5 = r1
            goto L_0x0018
        L_0x0017:
            r5 = r4
        L_0x0018:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L_0x002f
            if (r9 == r4) goto L_0x002a
            if (r9 == r1) goto L_0x002f
            if (r9 == r0) goto L_0x002f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L_0x0031
        L_0x002a:
            java.lang.String r8 = "descriptor"
            r5[r7] = r8
            goto L_0x0031
        L_0x002f:
            r5[r7] = r6
        L_0x0031:
            if (r9 == r2) goto L_0x003f
            if (r9 == r1) goto L_0x003a
            if (r9 == r0) goto L_0x003a
            r5[r2] = r6
            goto L_0x0043
        L_0x003a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L_0x0043
        L_0x003f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L_0x0043:
            if (r9 == r2) goto L_0x0054
            if (r9 == r4) goto L_0x0050
            if (r9 == r1) goto L_0x0054
            if (r9 == r0) goto L_0x0054
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L_0x0054
        L_0x0050:
            java.lang.String r6 = "hasMeaningfulFqName"
            r5[r4] = r6
        L_0x0054:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L_0x0064
            if (r9 == r1) goto L_0x0064
            if (r9 == r0) goto L_0x0064
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L_0x0069
        L_0x0064:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L_0x0069:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p405l.C7446b.$$$reportNull$$$0(int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7446b(C7441m mVar) {
        super(mVar);
        if (mVar == null) {
            $$$reportNull$$$0(0);
        }
        this.hashCode = 0;
    }

    private static boolean areFqNamesEqual(C6046e eVar, C6046e eVar2) {
        if (!eVar.getName().equals(eVar2.getName())) {
            return false;
        }
        C6206k containingDeclaration = eVar.getContainingDeclaration();
        C6206k containingDeclaration2 = eVar2.getContainingDeclaration();
        while (containingDeclaration != null && containingDeclaration2 != null) {
            if (containingDeclaration instanceof C6021a0) {
                return containingDeclaration2 instanceof C6021a0;
            }
            if (containingDeclaration2 instanceof C6021a0) {
                return false;
            }
            if (containingDeclaration instanceof C6032c0) {
                return (containingDeclaration2 instanceof C6032c0) && ((C6032c0) containingDeclaration).getFqName().equals(((C6032c0) containingDeclaration2).getFqName());
            }
            if ((containingDeclaration2 instanceof C6032c0) || !containingDeclaration.getName().equals(containingDeclaration2.getName())) {
                return false;
            }
            containingDeclaration = containingDeclaration.getContainingDeclaration();
            containingDeclaration2 = containingDeclaration2.getContainingDeclaration();
        }
        return true;
    }

    private static boolean hasMeaningfulFqName(C6083h hVar) {
        if (hVar == null) {
            $$$reportNull$$$0(2);
        }
        return !C7570v.m13789j(hVar) && !C7193g.m13040t(hVar);
    }

    public C7452c0 defaultSupertypeIfEmpty() {
        if (KotlinBuiltIns.isSpecialClassWithNoSupertypes(getDeclarationDescriptor())) {
            return null;
        }
        return getBuiltIns().getAnyType();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7567t0) || obj.hashCode() != hashCode()) {
            return false;
        }
        C7567t0 t0Var = (C7567t0) obj;
        if (t0Var.getParameters().size() != getParameters().size()) {
            return false;
        }
        C6046e declarationDescriptor = getDeclarationDescriptor();
        C6083h declarationDescriptor2 = t0Var.getDeclarationDescriptor();
        if (!hasMeaningfulFqName(declarationDescriptor) || ((declarationDescriptor2 != null && !hasMeaningfulFqName(declarationDescriptor2)) || !(declarationDescriptor2 instanceof C6046e))) {
            return false;
        }
        return areFqNamesEqual(declarationDescriptor, (C6046e) declarationDescriptor2);
    }

    public Collection<C7452c0> getAdditionalNeighboursInSupertypeGraph(boolean z) {
        C6206k containingDeclaration = getDeclarationDescriptor().getContainingDeclaration();
        if (!(containingDeclaration instanceof C6046e)) {
            List emptyList = Collections.emptyList();
            if (emptyList == null) {
                $$$reportNull$$$0(3);
            }
            return emptyList;
        }
        C7639l lVar = new C7639l();
        C6046e eVar = (C6046e) containingDeclaration;
        lVar.add(eVar.getDefaultType());
        C6046e companionObjectDescriptor = eVar.getCompanionObjectDescriptor();
        if (z && companionObjectDescriptor != null) {
            lVar.add(companionObjectDescriptor.getDefaultType());
        }
        return lVar;
    }

    public KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns f = C7255a.m13133f(getDeclarationDescriptor());
        if (f == null) {
            $$$reportNull$$$0(1);
        }
        return f;
    }

    public abstract C6046e getDeclarationDescriptor();

    public abstract /* bridge */ /* synthetic */ C6083h getDeclarationDescriptor();

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        C6046e declarationDescriptor = getDeclarationDescriptor();
        int hashCode2 = hasMeaningfulFqName(declarationDescriptor) ? C7193g.m13027g(declarationDescriptor).hashCode() : System.identityHashCode(this);
        this.hashCode = hashCode2;
        return hashCode2;
    }
}
