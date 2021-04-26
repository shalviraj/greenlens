package p298d.p299a.p300a.p301a.p303y0.p304b.p305f1;

/* renamed from: d.a.a.a.y0.b.f1.b */
public class C6054b implements C6053a {
    private final C6060h annotations;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 1 ? 3 : 2)];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw (i != 1 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public C6054b(C6060h hVar) {
        if (hVar == null) {
            $$$reportNull$$$0(0);
        }
        this.annotations = hVar;
    }

    public C6060h getAnnotations() {
        C6060h hVar = this.annotations;
        if (hVar == null) {
            $$$reportNull$$$0(1);
        }
        return hVar;
    }
}
