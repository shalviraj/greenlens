package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.Objects;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6208l;
import p298d.p299a.p300a.p301a.p303y0.p312c.p313a.C6260d;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p316f0.C6293g;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.C6326f;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p319l.C6362i;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p319l.C6366j;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6415b0;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6420g;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;

public final class JavaDescriptorResolver {
    private final C6293g javaResolverCache;
    private final C6326f packageFragmentProvider;

    public JavaDescriptorResolver(C6326f fVar, C6293g gVar) {
        C6888i.m12438e(fVar, "packageFragmentProvider");
        C6888i.m12438e(gVar, "javaResolverCache");
        this.packageFragmentProvider = fVar;
        this.javaResolverCache = gVar;
    }

    public final C6326f getPackageFragmentProvider() {
        return this.packageFragmentProvider;
    }

    public final C6046e resolveClass(C6420g gVar) {
        C6888i.m12438e(gVar, "javaClass");
        C6714b fqName = gVar.getFqName();
        if (fqName == null || gVar.mo23379B() != C6415b0.SOURCE) {
            C6420g l = gVar.mo23395l();
            if (l != null) {
                C6046e resolveClass = resolveClass(l);
                C7277h unsubstitutedInnerClassesScope = resolveClass == null ? null : resolveClass.getUnsubstitutedInnerClassesScope();
                C6208l contributedClassifier = unsubstitutedInnerClassesScope == null ? null : unsubstitutedInnerClassesScope.getContributedClassifier(gVar.getName(), C6260d.FROM_JAVA_LOADER);
                if (contributedClassifier instanceof C6046e) {
                    return (C6046e) contributedClassifier;
                }
                return null;
            } else if (fqName == null) {
                return null;
            } else {
                C6326f fVar = this.packageFragmentProvider;
                C6714b e = fqName.mo23865e();
                C6888i.m12437d(e, "fqName.parent()");
                Objects.requireNonNull(fVar);
                C6888i.m12438e(e, "fqName");
                C6362i iVar = (C6362i) C6790h.m12363q(C6790h.m12315B(fVar.mo23469a(e)));
                if (iVar == null) {
                    return null;
                }
                C6888i.m12438e(gVar, "jClass");
                C6366j jVar = iVar.f12542j.f12484d;
                Objects.requireNonNull(jVar);
                C6888i.m12438e(gVar, "javaClass");
                return jVar.mo23518o(gVar.getName(), gVar);
            }
        } else {
            Objects.requireNonNull((C6293g.C6294a) this.javaResolverCache);
            return null;
        }
    }
}
