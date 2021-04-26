package p005b.p096l.p097a.p113c.p145h.p147b;

import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import p005b.p096l.p097a.p113c.p131e.p140i.C2946s0;
import p005b.p096l.p097a.p113c.p131e.p140i.C3011x0;
import p005b.p096l.p097a.p113c.p131e.p140i.C3024y0;

/* renamed from: b.l.a.c.h.b.ba */
public abstract class C3129ba {

    /* renamed from: a */
    public final String f5329a;

    /* renamed from: b */
    public final int f5330b;

    /* renamed from: c */
    public Boolean f5331c;

    /* renamed from: d */
    public Boolean f5332d;

    /* renamed from: e */
    public Long f5333e;

    /* renamed from: f */
    public Long f5334f;

    public C3129ba(String str, int i) {
        this.f5329a = str;
        this.f5330b = i;
    }

    /* renamed from: d */
    public static Boolean m5860d(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* renamed from: e */
    public static Boolean m5861e(String str, C3024y0 y0Var, C3269o3 o3Var) {
        List<String> list;
        boolean z;
        C3011x0 x0Var = C3011x0.REGEXP;
        C3011x0 x0Var2 = C3011x0.IN_LIST;
        Objects.requireNonNull(y0Var, "null reference");
        if (str == null || !y0Var.mo13981s() || y0Var.mo13982t() == C3011x0.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        if (y0Var.mo13982t() == x0Var2) {
            if (y0Var.mo13988z() == 0) {
                return null;
            }
        } else if (!y0Var.mo13983u()) {
            return null;
        }
        C3011x0 t = y0Var.mo13982t();
        boolean x = y0Var.mo13986x();
        String v = (x || t == x0Var || t == x0Var2) ? y0Var.mo13984v() : y0Var.mo13984v().toUpperCase(Locale.ENGLISH);
        if (y0Var.mo13988z() == 0) {
            list = null;
        } else {
            list = y0Var.mo13987y();
            if (!x) {
                ArrayList arrayList = new ArrayList(list.size());
                for (String upperCase : list) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                list = Collections.unmodifiableList(arrayList);
            }
        }
        String str2 = t == x0Var ? v : null;
        if (t == x0Var2) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (v == null) {
            return null;
        }
        if (!x && t != x0Var) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (t.ordinal()) {
            case 1:
                if (str2 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str2, true != x ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (o3Var == null) {
                        return null;
                    }
                    o3Var.f5802i.mo14415b("Invalid regular expression in REGEXP audience filter. expression", str2);
                    return null;
                }
            case 2:
                z = str.startsWith(v);
                break;
            case 3:
                z = str.endsWith(v);
                break;
            case 4:
                z = str.contains(v);
                break;
            case 5:
                z = str.equals(v);
                break;
            case 6:
                if (list != null) {
                    z = list.contains(str);
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: f */
    public static Boolean m5862f(long j, C2946s0 s0Var) {
        try {
            return m5864h(new BigDecimal(j), s0Var, ShadowDrawableWrapper.COS_45);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static Boolean m5863g(String str, C2946s0 s0Var) {
        if (!C3242l9.m6204z(str)) {
            return null;
        }
        try {
            return m5864h(new BigDecimal(str), s0Var, ShadowDrawableWrapper.COS_45);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a6, code lost:
        if (r8.compareTo(r4) <= 0) goto L_0x00eb;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Boolean m5864h(java.math.BigDecimal r8, p005b.p096l.p097a.p113c.p131e.p140i.C2946s0 r9, double r10) {
        /*
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r9, r0)
            boolean r0 = r9.mo13682s()
            r1 = 0
            if (r0 == 0) goto L_0x0110
            b.l.a.c.e.i.r0 r0 = r9.mo13683t()
            b.l.a.c.e.i.r0 r2 = p005b.p096l.p097a.p113c.p131e.p140i.C2933r0.UNKNOWN_COMPARISON_TYPE
            if (r0 != r2) goto L_0x0016
            goto L_0x0110
        L_0x0016:
            b.l.a.c.e.i.r0 r0 = r9.mo13683t()
            b.l.a.c.e.i.r0 r2 = p005b.p096l.p097a.p113c.p131e.p140i.C2933r0.BETWEEN
            if (r0 != r2) goto L_0x002c
            boolean r0 = r9.mo13688y()
            if (r0 == 0) goto L_0x002b
            boolean r0 = r9.mo13680A()
            if (r0 == 0) goto L_0x002b
            goto L_0x0033
        L_0x002b:
            return r1
        L_0x002c:
            boolean r0 = r9.mo13686w()
            if (r0 != 0) goto L_0x0033
            return r1
        L_0x0033:
            b.l.a.c.e.i.r0 r0 = r9.mo13683t()
            b.l.a.c.e.i.r0 r3 = r9.mo13683t()
            if (r3 != r2) goto L_0x0068
            java.lang.String r3 = r9.mo13689z()
            boolean r3 = p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6204z(r3)
            if (r3 == 0) goto L_0x0067
            java.lang.String r3 = r9.mo13681B()
            boolean r3 = p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6204z(r3)
            if (r3 != 0) goto L_0x0052
            goto L_0x0067
        L_0x0052:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0067 }
            java.lang.String r4 = r9.mo13689z()     // Catch:{ NumberFormatException -> 0x0067 }
            r3.<init>(r4)     // Catch:{ NumberFormatException -> 0x0067 }
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0067 }
            java.lang.String r9 = r9.mo13681B()     // Catch:{ NumberFormatException -> 0x0067 }
            r4.<init>(r9)     // Catch:{ NumberFormatException -> 0x0067 }
            r9 = r3
            r3 = r1
            goto L_0x007e
        L_0x0067:
            return r1
        L_0x0068:
            java.lang.String r3 = r9.mo13687x()
            boolean r3 = p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.m6204z(r3)
            if (r3 != 0) goto L_0x0073
            return r1
        L_0x0073:
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0110 }
            java.lang.String r9 = r9.mo13687x()     // Catch:{ NumberFormatException -> 0x0110 }
            r3.<init>(r9)     // Catch:{ NumberFormatException -> 0x0110 }
            r9 = r1
            r4 = r9
        L_0x007e:
            if (r0 != r2) goto L_0x0083
            if (r9 == 0) goto L_0x0102
            goto L_0x0087
        L_0x0083:
            if (r3 != 0) goto L_0x0087
            goto L_0x0102
        L_0x0087:
            int r0 = r0.ordinal()
            r2 = 1
            r5 = 0
            if (r0 == r2) goto L_0x0100
            r6 = 2
            if (r0 == r6) goto L_0x00f0
            r7 = 3
            if (r0 == r7) goto L_0x00a9
            r10 = 4
            if (r0 == r10) goto L_0x009a
            goto L_0x0102
        L_0x009a:
            if (r9 == 0) goto L_0x0102
            int r9 = r8.compareTo(r9)
            if (r9 < 0) goto L_0x00ea
            int r8 = r8.compareTo(r4)
            if (r8 > 0) goto L_0x00ea
            goto L_0x00eb
        L_0x00a9:
            if (r3 != 0) goto L_0x00ac
            goto L_0x0102
        L_0x00ac:
            r0 = 0
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x00e3
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r0)
            java.math.BigDecimal r9 = r3.subtract(r9)
            int r9 = r8.compareTo(r9)
            if (r9 <= 0) goto L_0x00ea
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r9.<init>(r10)
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r6)
            java.math.BigDecimal r9 = r9.multiply(r10)
            java.math.BigDecimal r9 = r3.add(r9)
            int r8 = r8.compareTo(r9)
            if (r8 >= 0) goto L_0x00ea
            goto L_0x00eb
        L_0x00e3:
            int r8 = r8.compareTo(r3)
            if (r8 != 0) goto L_0x00ea
            goto L_0x00eb
        L_0x00ea:
            r2 = r5
        L_0x00eb:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            goto L_0x0102
        L_0x00f0:
            if (r3 != 0) goto L_0x00f3
            goto L_0x0102
        L_0x00f3:
            int r8 = r8.compareTo(r3)
            if (r8 <= 0) goto L_0x00fa
            goto L_0x00fb
        L_0x00fa:
            r2 = r5
        L_0x00fb:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x0100:
            if (r3 != 0) goto L_0x0103
        L_0x0102:
            return r1
        L_0x0103:
            int r8 = r8.compareTo(r3)
            if (r8 >= 0) goto L_0x010a
            goto L_0x010b
        L_0x010a:
            r2 = r5
        L_0x010b:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x0110:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3129ba.m5864h(java.math.BigDecimal, b.l.a.c.e.i.s0, double):java.lang.Boolean");
    }

    /* renamed from: a */
    public abstract int mo14120a();

    /* renamed from: b */
    public abstract boolean mo14121b();

    /* renamed from: c */
    public abstract boolean mo14122c();
}
