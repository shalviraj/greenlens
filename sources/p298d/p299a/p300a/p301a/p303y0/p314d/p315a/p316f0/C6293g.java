package p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p316f0;

import p298d.p299a.p300a.p301a.p303y0.p304b.C6157j;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6425l;

/* renamed from: d.a.a.a.y0.d.a.f0.g */
public interface C6293g {

    /* renamed from: a */
    public static final C6293g f12393a = new C6294a();

    /* renamed from: d.a.a.a.y0.d.a.f0.g$a */
    public static class C6294a implements C6293g {
        /* renamed from: a */
        public static /* synthetic */ void m11285a(int i) {
            Object[] objArr = new Object[3];
            switch (i) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: b */
        public void mo23460b(C6425l lVar, C6157j jVar) {
            if (lVar == null) {
                m11285a(3);
                throw null;
            }
        }
    }
}
