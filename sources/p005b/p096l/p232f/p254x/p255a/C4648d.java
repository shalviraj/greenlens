package p005b.p096l.p232f.p254x.p255a;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import p005b.p096l.p232f.C4484a;

/* renamed from: b.l.f.x.a.d */
public final class C4648d {

    /* renamed from: a */
    public static final Pattern f8761a = Pattern.compile(",");

    /* renamed from: b */
    public static final Set<C4484a> f8762b;

    /* renamed from: c */
    public static final Set<C4484a> f8763c;

    /* renamed from: d */
    public static final Set<C4484a> f8764d;

    /* renamed from: e */
    public static final Set<C4484a> f8765e;

    /* renamed from: f */
    public static final Set<C4484a> f8766f;

    /* renamed from: g */
    public static final Set<C4484a> f8767g;

    /* renamed from: h */
    public static final Set<C4484a> f8768h;

    /* renamed from: i */
    public static final Map<String, Set<C4484a>> f8769i;

    static {
        EnumSet of = EnumSet.of(C4484a.QR_CODE);
        f8765e = of;
        EnumSet of2 = EnumSet.of(C4484a.DATA_MATRIX);
        f8766f = of2;
        EnumSet of3 = EnumSet.of(C4484a.AZTEC);
        f8767g = of3;
        EnumSet of4 = EnumSet.of(C4484a.PDF_417);
        f8768h = of4;
        EnumSet of5 = EnumSet.of(C4484a.UPC_A, new C4484a[]{C4484a.UPC_E, C4484a.EAN_13, C4484a.EAN_8, C4484a.RSS_14, C4484a.RSS_EXPANDED});
        f8762b = of5;
        EnumSet of6 = EnumSet.of(C4484a.CODE_39, C4484a.CODE_93, C4484a.CODE_128, C4484a.ITF, C4484a.CODABAR);
        f8763c = of6;
        EnumSet copyOf = EnumSet.copyOf(of5);
        f8764d = copyOf;
        copyOf.addAll(of6);
        HashMap hashMap = new HashMap();
        f8769i = hashMap;
        hashMap.put("ONE_D_MODE", copyOf);
        hashMap.put("PRODUCT_MODE", of5);
        hashMap.put("QR_CODE_MODE", of);
        hashMap.put("DATA_MATRIX_MODE", of2);
        hashMap.put("AZTEC_MODE", of3);
        hashMap.put("PDF417_MODE", of4);
    }
}
