package p298d.p299a.p300a.p301a.p303y0.p400j.p401b;

import java.util.List;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;

/* renamed from: d.a.a.a.y0.j.b.p */
public interface C7391p {

    /* renamed from: a */
    public static final C7391p f14779a = new C7392a();

    /* renamed from: d.a.a.a.y0.j.b.p$a */
    public static class C7392a implements C7391p {
        /* renamed from: c */
        public static /* synthetic */ void m13317c(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public void mo23334a(C6046e eVar, List<String> list) {
            if (eVar == null) {
                m13317c(0);
                throw null;
            }
        }

        /* renamed from: b */
        public void mo23335b(C6023b bVar) {
            if (bVar == null) {
                m13317c(2);
                throw null;
            }
        }
    }

    /* renamed from: a */
    void mo23334a(C6046e eVar, List<String> list);

    /* renamed from: b */
    void mo23335b(C6023b bVar);
}
