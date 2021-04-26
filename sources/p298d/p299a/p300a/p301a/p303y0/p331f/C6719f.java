package p298d.p299a.p300a.p301a.p303y0.p331f;

/* renamed from: d.a.a.a.y0.f.f */
public class C6719f {

    /* renamed from: a */
    public static final C6717d f13626a = C6717d.m12272p("<no name provided>");

    /* renamed from: b */
    public static final C6717d f13627b = C6717d.m12270l("Companion");

    /* renamed from: c */
    public static final C6717d f13628c = C6717d.m12270l("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");

    static {
        C6717d.m12272p("<root package>");
        C6717d.m12272p("<anonymous>");
    }

    /* renamed from: a */
    public static /* synthetic */ void m12275a(int i) {
        String str = i != 1 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i != 1 ? 2 : 3)];
        if (i != 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/SpecialNames";
        } else {
            objArr[0] = "name";
        }
        if (i != 1) {
            objArr[1] = "safeIdentifier";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/SpecialNames";
        }
        if (i == 1) {
            objArr[2] = "isSafeIdentifier";
        }
        String format = String.format(str, objArr);
        throw (i != 1 ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }
}
