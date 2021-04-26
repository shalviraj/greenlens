package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.amplitude.api.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;
import java.util.zip.GZIPOutputStream;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1959c;
import p005b.p096l.p097a.p113c.p131e.p140i.C2726b5;
import p005b.p096l.p097a.p113c.p131e.p140i.C2751d2;
import p005b.p096l.p097a.p113c.p131e.p140i.C2779f2;
import p005b.p096l.p097a.p113c.p131e.p140i.C2783f6;
import p005b.p096l.p097a.p113c.p131e.p140i.C2792g2;
import p005b.p096l.p097a.p113c.p131e.p140i.C2794g4;
import p005b.p096l.p097a.p113c.p131e.p140i.C2805h2;
import p005b.p096l.p097a.p113c.p131e.p140i.C2834j5;
import p005b.p096l.p097a.p113c.p131e.p140i.C2843k1;
import p005b.p096l.p097a.p113c.p131e.p140i.C2860l5;
import p005b.p096l.p097a.p113c.p131e.p140i.C2881n0;
import p005b.p096l.p097a.p113c.p131e.p140i.C2882n1;
import p005b.p096l.p097a.p113c.p131e.p140i.C2895o1;
import p005b.p096l.p097a.p113c.p131e.p140i.C2908p1;
import p005b.p096l.p097a.p113c.p131e.p140i.C2946s0;
import p005b.p096l.p097a.p113c.p131e.p140i.C2947s1;
import p005b.p096l.p097a.p113c.p131e.p140i.C2960t1;
import p005b.p096l.p097a.p113c.p131e.p140i.C2972u0;
import p005b.p096l.p097a.p113c.p131e.p140i.C2986v1;
import p005b.p096l.p097a.p113c.p131e.p140i.C2999w1;
import p005b.p096l.p097a.p113c.p131e.p140i.C3012x1;
import p005b.p096l.p097a.p113c.p131e.p140i.C3024y0;

/* renamed from: b.l.a.c.h.b.l9 */
public final class C3242l9 extends C3395z8 {
    public C3242l9(C3220j9 j9Var) {
        super(j9Var);
    }

    /* renamed from: A */
    public static boolean m6190A(List<Long> list, int i) {
        if (i >= ((C2783f6) list).f4724i * 64) {
            return false;
        }
        return ((1 << (i % 64)) & ((Long) ((C2783f6) list).get(i / 64)).longValue()) != 0;
    }

    /* renamed from: B */
    public static List<Long> m6191B(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: G */
    public static <Builder extends C2794g4> Builder m6192G(Builder builder, byte[] bArr) {
        Class<C2726b5> cls = C2726b5.class;
        C2726b5 b5Var = C2726b5.f4642c;
        if (b5Var == null) {
            synchronized (cls) {
                b5Var = C2726b5.f4642c;
                if (b5Var == null) {
                    b5Var = C2834j5.m4861b(cls);
                    C2726b5.f4642c = b5Var;
                }
            }
        }
        if (b5Var != null) {
            Objects.requireNonNull(builder);
            Builder builder2 = (C2860l5) builder;
            builder2.mo13486i(bArr, 0, bArr.length, b5Var);
            return builder2;
        }
        Objects.requireNonNull(builder);
        Builder builder3 = (C2860l5) builder;
        builder3.mo13486i(bArr, 0, bArr.length, C2726b5.m4589a());
        return builder3;
    }

    /* renamed from: H */
    public static int m6193H(C2999w1 w1Var, String str) {
        for (int i = 0; i < ((C3012x1) w1Var.f4885h).mo13933m1(); i++) {
            if (str.equals(((C3012x1) w1Var.f4885h).mo13934n1(i).mo13364u())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: I */
    public static List<C2960t1> m6194I(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                C2947s1 E = C2960t1.m5263E();
                for (String str : bundle.keySet()) {
                    C2947s1 E2 = C2960t1.m5263E();
                    E2.mo13690m(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        E2.mo13692o(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        E2.mo13691n((String) obj);
                    } else if (obj instanceof Double) {
                        E2.mo13693p(((Double) obj).doubleValue());
                    }
                    if (E.f4886i) {
                        E.mo13487j();
                        E.f4886i = false;
                    }
                    C2960t1.m5272N((C2960t1) E.f4885h, (C2960t1) E2.mo13484g());
                }
                if (((C2960t1) E.f4885h).mo13735D() > 0) {
                    arrayList.add((C2960t1) E.mo13484g());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: J */
    public static final void m6195J(C2895o1 o1Var, String str, Object obj) {
        List<C2960t1> m = o1Var.mo13526m();
        int i = 0;
        while (true) {
            if (i >= m.size()) {
                i = -1;
                break;
            } else if (str.equals(m.get(i).mo13737t())) {
                break;
            } else {
                i++;
            }
        }
        C2947s1 E = C2960t1.m5263E();
        E.mo13690m(str);
        if (obj instanceof Long) {
            E.mo13692o(((Long) obj).longValue());
        } else if (obj instanceof String) {
            E.mo13691n((String) obj);
        } else if (obj instanceof Double) {
            E.mo13693p(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            List<C2960t1> I = m6194I((Bundle[]) obj);
            if (E.f4886i) {
                E.mo13487j();
                E.f4886i = false;
            }
            C2960t1.m5273O((C2960t1) E.f4885h, I);
        }
        if (i >= 0) {
            if (o1Var.f4886i) {
                o1Var.mo13487j();
                o1Var.f4886i = false;
            }
            C2908p1.m5060E((C2908p1) o1Var.f4885h, i, (C2960t1) E.mo13484g());
            return;
        }
        o1Var.mo13530q(E);
    }

    @WorkerThread
    /* renamed from: K */
    public static final boolean m6196K(C3309s sVar, C3352v9 v9Var) {
        Objects.requireNonNull(sVar, "null reference");
        return !TextUtils.isEmpty(v9Var.f6030h) || !TextUtils.isEmpty(v9Var.f6045w);
    }

    /* renamed from: L */
    public static final C2960t1 m6197L(C2908p1 p1Var, String str) {
        for (C2960t1 next : p1Var.mo13554s()) {
            if (next.mo13737t().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: l */
    public static final Object m6198l(C2908p1 p1Var, String str) {
        C2960t1 L = m6197L(p1Var, str);
        if (L == null) {
            return null;
        }
        if (L.mo13738u()) {
            return L.mo13739v();
        }
        if (L.mo13740w()) {
            return Long.valueOf(L.mo13741x());
        }
        if (L.mo13732A()) {
            return Double.valueOf(L.mo13733B());
        }
        if (L.mo13735D() <= 0) {
            return null;
        }
        List<C2960t1> C = L.mo13734C();
        ArrayList arrayList = new ArrayList();
        for (C2960t1 next : C) {
            if (next != null) {
                Bundle bundle = new Bundle();
                for (C2960t1 next2 : next.mo13734C()) {
                    if (next2.mo13738u()) {
                        bundle.putString(next2.mo13737t(), next2.mo13739v());
                    } else if (next2.mo13740w()) {
                        bundle.putLong(next2.mo13737t(), next2.mo13741x());
                    } else if (next2.mo13732A()) {
                        bundle.putDouble(next2.mo13737t(), next2.mo13733B());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* renamed from: o */
    public static final void m6199o(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: p */
    public static final String m6200p(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: q */
    public static final void m6201q(StringBuilder sb, int i, String str, C2751d2 d2Var) {
        if (d2Var != null) {
            m6199o(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (d2Var.mo13285v() != 0) {
                m6199o(sb, 4);
                sb.append("results: ");
                int i2 = 0;
                for (Long next : d2Var.mo13284u()) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next);
                    i2 = i3;
                }
                sb.append(10);
            }
            if (d2Var.mo13283t() != 0) {
                m6199o(sb, 4);
                sb.append("status: ");
                int i4 = 0;
                for (Long next2 : d2Var.mo13282s()) {
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next2);
                    i4 = i5;
                }
                sb.append(10);
            }
            if (d2Var.mo13287x() != 0) {
                m6199o(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i6 = 0;
                for (C2882n1 next3 : d2Var.mo13286w()) {
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next3.mo13511s() ? Integer.valueOf(next3.mo13512t()) : null);
                    sb.append(":");
                    sb.append(next3.mo13513u() ? Long.valueOf(next3.mo13514v()) : null);
                    i6 = i7;
                }
                sb.append("}\n");
            }
            if (d2Var.mo13280A() != 0) {
                m6199o(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i8 = 0;
                for (C2779f2 next4 : d2Var.mo13289z()) {
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next4.mo13312s() ? Integer.valueOf(next4.mo13313t()) : null);
                    sb.append(": [");
                    int i10 = 0;
                    for (Long longValue : next4.mo13314u()) {
                        long longValue2 = longValue.longValue();
                        int i11 = i10 + 1;
                        if (i10 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i10 = i11;
                    }
                    sb.append("]");
                    i8 = i9;
                }
                sb.append("}\n");
            }
            m6199o(sb, 3);
            sb.append("}\n");
        }
    }

    /* renamed from: r */
    public static final void m6202r(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            m6199o(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* renamed from: s */
    public static final void m6203s(StringBuilder sb, int i, String str, C2946s0 s0Var) {
        if (s0Var != null) {
            m6199o(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (s0Var.mo13682s()) {
                m6202r(sb, i, "comparison_type", s0Var.mo13683t().name());
            }
            if (s0Var.mo13684u()) {
                m6202r(sb, i, "match_as_float", Boolean.valueOf(s0Var.mo13685v()));
            }
            if (s0Var.mo13686w()) {
                m6202r(sb, i, "comparison_value", s0Var.mo13687x());
            }
            if (s0Var.mo13688y()) {
                m6202r(sb, i, "min_comparison_value", s0Var.mo13689z());
            }
            if (s0Var.mo13680A()) {
                m6202r(sb, i, "max_comparison_value", s0Var.mo13681B());
            }
            m6199o(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: z */
    public static boolean m6204z(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: C */
    public final List<Long> mo14398C(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer next : list2) {
            if (next.intValue() < 0) {
                this.f5638a.mo14329d().f5802i.mo14415b("Ignoring negative bit index to be cleared", next);
            } else {
                int intValue = next.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f5638a.mo14329d().f5802i.mo14416c("Ignoring bit index greater than bitSet size", next, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (next.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i);
    }

    /* renamed from: D */
    public final boolean mo14399D(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        Objects.requireNonNull((C1959c) this.f5638a.f5855n);
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    @WorkerThread
    /* renamed from: E */
    public final long mo14400E(byte[] bArr) {
        this.f5638a.mo14467t().mo14126h();
        MessageDigest B = C3297q9.m6335B();
        if (B != null) {
            return C3297q9.m6336C(B.digest(bArr));
        }
        this.f5638a.mo14329d().f5799f.mo14414a("Failed to get MD5");
        return 0;
    }

    /* renamed from: F */
    public final byte[] mo14401F(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.f5638a.mo14329d().f5799f.mo14415b("Failed to gzip content", e);
            throw e;
        }
    }

    /* renamed from: j */
    public final boolean mo14178j() {
        return false;
    }

    /* renamed from: m */
    public final void mo14402m(StringBuilder sb, int i, List<C2960t1> list) {
        if (list != null) {
            int i2 = i + 1;
            for (C2960t1 next : list) {
                if (next != null) {
                    m6199o(sb, i2);
                    sb.append("param {\n");
                    Double d = null;
                    m6202r(sb, i2, "name", next.mo13736s() ? this.f5638a.mo14468u().mo14322q(next.mo13737t()) : null);
                    m6202r(sb, i2, "string_value", next.mo13738u() ? next.mo13739v() : null);
                    m6202r(sb, i2, "int_value", next.mo13740w() ? Long.valueOf(next.mo13741x()) : null);
                    if (next.mo13732A()) {
                        d = Double.valueOf(next.mo13733B());
                    }
                    m6202r(sb, i2, "double_value", d);
                    if (next.mo13735D() > 0) {
                        mo14402m(sb, i2, next.mo13734C());
                    }
                    m6199o(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo14403n(StringBuilder sb, int i, C2881n0 n0Var) {
        if (n0Var != null) {
            m6199o(sb, i);
            sb.append("filter {\n");
            if (n0Var.mo13507w()) {
                m6202r(sb, i, "complement", Boolean.valueOf(n0Var.mo13508x()));
            }
            if (n0Var.mo13509y()) {
                m6202r(sb, i, "param_name", this.f5638a.mo14468u().mo14322q(n0Var.mo13510z()));
            }
            if (n0Var.mo13503s()) {
                int i2 = i + 1;
                C3024y0 t = n0Var.mo13504t();
                if (t != null) {
                    m6199o(sb, i2);
                    sb.append("string_filter {\n");
                    if (t.mo13981s()) {
                        m6202r(sb, i2, "match_type", t.mo13982t().name());
                    }
                    if (t.mo13983u()) {
                        m6202r(sb, i2, "expression", t.mo13984v());
                    }
                    if (t.mo13985w()) {
                        m6202r(sb, i2, "case_sensitive", Boolean.valueOf(t.mo13986x()));
                    }
                    if (t.mo13988z() > 0) {
                        m6199o(sb, i2 + 1);
                        sb.append("expression_list {\n");
                        for (String append : t.mo13987y()) {
                            m6199o(sb, i2 + 2);
                            sb.append(append);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    m6199o(sb, i2);
                    sb.append("}\n");
                }
            }
            if (n0Var.mo13505u()) {
                m6203s(sb, i + 1, "number_filter", n0Var.mo13506v());
            }
            m6199o(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: t */
    public final void mo14404t(C2792g2 g2Var, Object obj) {
        Objects.requireNonNull(obj, "null reference");
        if (g2Var.f4886i) {
            g2Var.mo13487j();
            g2Var.f4886i = false;
        }
        C2805h2.m4791G((C2805h2) g2Var.f4885h);
        if (g2Var.f4886i) {
            g2Var.mo13487j();
            g2Var.f4886i = false;
        }
        C2805h2.m4793I((C2805h2) g2Var.f4885h);
        if (g2Var.f4886i) {
            g2Var.mo13487j();
            g2Var.f4886i = false;
        }
        C2805h2.m4795K((C2805h2) g2Var.f4885h);
        if (obj instanceof String) {
            String str = (String) obj;
            if (g2Var.f4886i) {
                g2Var.mo13487j();
                g2Var.f4886i = false;
            }
            C2805h2.m4790F((C2805h2) g2Var.f4885h, str);
        } else if (obj instanceof Long) {
            g2Var.mo13341o(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (g2Var.f4886i) {
                g2Var.mo13487j();
                g2Var.f4886i = false;
            }
            C2805h2.m4794J((C2805h2) g2Var.f4885h, doubleValue);
        } else {
            this.f5638a.mo14329d().f5799f.mo14415b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* renamed from: u */
    public final void mo14405u(C2947s1 s1Var, Object obj) {
        if (s1Var.f4886i) {
            s1Var.mo13487j();
            s1Var.f4886i = false;
        }
        C2960t1.m5267I((C2960t1) s1Var.f4885h);
        if (s1Var.f4886i) {
            s1Var.mo13487j();
            s1Var.f4886i = false;
        }
        C2960t1.m5269K((C2960t1) s1Var.f4885h);
        if (s1Var.f4886i) {
            s1Var.mo13487j();
            s1Var.f4886i = false;
        }
        C2960t1.m5271M((C2960t1) s1Var.f4885h);
        if (s1Var.f4886i) {
            s1Var.mo13487j();
            s1Var.f4886i = false;
        }
        C2960t1.m5274P((C2960t1) s1Var.f4885h);
        if (obj instanceof String) {
            s1Var.mo13691n((String) obj);
        } else if (obj instanceof Long) {
            s1Var.mo13692o(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            s1Var.mo13693p(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            List<C2960t1> I = m6194I((Bundle[]) obj);
            if (s1Var.f4886i) {
                s1Var.mo13487j();
                s1Var.f4886i = false;
            }
            C2960t1.m5273O((C2960t1) s1Var.f4885h, I);
        } else {
            this.f5638a.mo14329d().f5799f.mo14415b("Ignoring invalid (type) event param value", obj);
        }
    }

    /* renamed from: v */
    public final C2908p1 mo14406v(C3254n nVar) {
        C2895o1 C = C2908p1.m5058C();
        long j = nVar.f5761e;
        if (C.f4886i) {
            C.mo13487j();
            C.f4886i = false;
        }
        C2908p1.m5067L((C2908p1) C.f4885h, j);
        for (String str : nVar.f5762f.f5876g.keySet()) {
            C2947s1 E = C2960t1.m5263E();
            E.mo13690m(str);
            Object V = nVar.f5762f.mo14484V(str);
            Objects.requireNonNull(V, "null reference");
            mo14405u(E, V);
            C.mo13530q(E);
        }
        return (C2908p1) C.mo13484g();
    }

    /* renamed from: w */
    public final String mo14407w(C2986v1 v1Var) {
        StringBuilder u = C0843a.m460u("\nbatch {\n");
        for (C3012x1 next : v1Var.mo13790s()) {
            if (next != null) {
                m6199o(u, 1);
                u.append("bundle {\n");
                if (next.mo13925S()) {
                    m6202r(u, 1, "protocol_version", Integer.valueOf(next.mo13926S0()));
                }
                m6202r(u, 1, Constants.AMP_TRACKING_OPTION_PLATFORM, next.mo13958y1());
                if (next.mo13944u()) {
                    m6202r(u, 1, "gmp_version", Long.valueOf(next.mo13947v()));
                }
                if (next.mo13950w()) {
                    m6202r(u, 1, "uploading_gmp_version", Long.valueOf(next.mo13953x()));
                }
                if (next.mo13954x0()) {
                    m6202r(u, 1, "dynamite_version", Long.valueOf(next.mo13957y0()));
                }
                if (next.mo13921O()) {
                    m6202r(u, 1, "config_version", Long.valueOf(next.mo13922P()));
                }
                m6202r(u, 1, "gmp_app_id", next.mo13914H());
                m6202r(u, 1, "admob_app_id", next.mo13951w0());
                m6202r(u, 1, "app_id", next.mo13939s());
                m6202r(u, 1, "app_version", next.mo13941t());
                if (next.mo13919M()) {
                    m6202r(u, 1, "app_version_major", Integer.valueOf(next.mo13920N()));
                }
                m6202r(u, 1, "firebase_instance_id", next.mo13918L());
                if (next.mo13906C()) {
                    m6202r(u, 1, "dev_cert_hash", Long.valueOf(next.mo13908D()));
                }
                m6202r(u, 1, "app_store", next.mo13911E1());
                if (next.mo13935o1()) {
                    m6202r(u, 1, "upload_timestamp_millis", Long.valueOf(next.mo13936p1()));
                }
                if (next.mo13937q1()) {
                    m6202r(u, 1, "start_timestamp_millis", Long.valueOf(next.mo13938r1()));
                }
                if (next.mo13940s1()) {
                    m6202r(u, 1, "end_timestamp_millis", Long.valueOf(next.mo13943t1()));
                }
                if (next.mo13946u1()) {
                    m6202r(u, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(next.mo13949v1()));
                }
                if (next.mo13952w1()) {
                    m6202r(u, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(next.mo13955x1()));
                }
                m6202r(u, 1, "app_instance_id", next.mo13903B());
                m6202r(u, 1, "resettable_device_id", next.mo13956y());
                m6202r(u, 1, "ds_id", next.mo13942t0());
                if (next.mo13959z()) {
                    m6202r(u, 1, "limited_ad_tracking", Boolean.valueOf(next.mo13900A()));
                }
                m6202r(u, 1, Constants.AMP_TRACKING_OPTION_OS_VERSION, next.mo13961z1());
                m6202r(u, 1, Constants.AMP_TRACKING_OPTION_DEVICE_MODEL, next.mo13902A1());
                m6202r(u, 1, "user_default_language", next.mo13905B1());
                if (next.mo13907C1()) {
                    m6202r(u, 1, "time_zone_offset_minutes", Integer.valueOf(next.mo13909D1()));
                }
                if (next.mo13910E()) {
                    m6202r(u, 1, "bundle_sequential_index", Integer.valueOf(next.mo13912F()));
                }
                if (next.mo13915I()) {
                    m6202r(u, 1, "service_upload", Boolean.valueOf(next.mo13916J()));
                }
                m6202r(u, 1, "health_monitor", next.mo13913G());
                if (!this.f5638a.f5848g.mo14197r((String) null, C3134c3.f5409t0) && next.mo13923Q() && next.mo13924R() != 0) {
                    m6202r(u, 1, "android_id", Long.valueOf(next.mo13924R()));
                }
                if (next.mo13945u0()) {
                    m6202r(u, 1, "retry_counter", Integer.valueOf(next.mo13948v0()));
                }
                if (next.mo13901A0()) {
                    m6202r(u, 1, "consent_signals", next.mo13904B0());
                }
                List<C2805h2> l1 = next.mo13932l1();
                if (l1 != null) {
                    for (C2805h2 next2 : l1) {
                        if (next2 != null) {
                            m6199o(u, 2);
                            u.append("user_property {\n");
                            m6202r(u, 2, "set_timestamp_millis", next2.mo13362s() ? Long.valueOf(next2.mo13363t()) : null);
                            m6202r(u, 2, "name", this.f5638a.mo14468u().mo14323r(next2.mo13364u()));
                            m6202r(u, 2, "string_value", next2.mo13366w());
                            m6202r(u, 2, "int_value", next2.mo13367x() ? Long.valueOf(next2.mo13368y()) : null);
                            m6202r(u, 2, "double_value", next2.mo13369z() ? Double.valueOf(next2.mo13361A()) : null);
                            m6199o(u, 2);
                            u.append("}\n");
                        }
                    }
                }
                List<C2843k1> K = next.mo13917K();
                if (K != null) {
                    for (C2843k1 next3 : K) {
                        if (next3 != null) {
                            m6199o(u, 2);
                            u.append("audience_membership {\n");
                            if (next3.mo13440s()) {
                                m6202r(u, 2, "audience_id", Integer.valueOf(next3.mo13441t()));
                            }
                            if (next3.mo13445x()) {
                                m6202r(u, 2, "new_audience", Boolean.valueOf(next3.mo13446y()));
                            }
                            m6201q(u, 2, "current_data", next3.mo13442u());
                            if (next3.mo13443v()) {
                                m6201q(u, 2, "previous_data", next3.mo13444w());
                            }
                            m6199o(u, 2);
                            u.append("}\n");
                        }
                    }
                }
                List<C2908p1> i1 = next.mo13929i1();
                if (i1 != null) {
                    for (C2908p1 next4 : i1) {
                        if (next4 != null) {
                            m6199o(u, 2);
                            u.append("event {\n");
                            m6202r(u, 2, "name", this.f5638a.mo14468u().mo14321p(next4.mo13557v()));
                            if (next4.mo13558w()) {
                                m6202r(u, 2, "timestamp_millis", Long.valueOf(next4.mo13559x()));
                            }
                            if (next4.mo13560y()) {
                                m6202r(u, 2, "previous_timestamp_millis", Long.valueOf(next4.mo13561z()));
                            }
                            if (next4.mo13551A()) {
                                m6202r(u, 2, "count", Integer.valueOf(next4.mo13552B()));
                            }
                            if (next4.mo13555t() != 0) {
                                mo14402m(u, 2, next4.mo13554s());
                            }
                            m6199o(u, 2);
                            u.append("}\n");
                        }
                    }
                }
                m6199o(u, 1);
                u.append("}\n");
            }
        }
        u.append("}\n");
        return u.toString();
    }

    /* renamed from: x */
    public final String mo14408x(C2972u0 u0Var) {
        StringBuilder u = C0843a.m460u("\nproperty_filter {\n");
        if (u0Var.mo13760s()) {
            m6202r(u, 0, "filter_id", Integer.valueOf(u0Var.mo13761t()));
        }
        m6202r(u, 0, "property_name", this.f5638a.mo14468u().mo14323r(u0Var.mo13762u()));
        String p = m6200p(u0Var.mo13764w(), u0Var.mo13765x(), u0Var.mo13767z());
        if (!p.isEmpty()) {
            m6202r(u, 0, "filter_type", p);
        }
        mo14403n(u, 1, u0Var.mo13763v());
        u.append("}\n");
        return u.toString();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.f5638a.mo14329d().f5799f.mo14414a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T mo14409y(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ b -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ b -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ b -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ b -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ b -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002d
        L_0x001c:
            b.l.a.c.h.b.p4 r5 = r4.f5638a     // Catch:{ all -> 0x001a }
            b.l.a.c.h.b.o3 r5 = r5.mo14329d()     // Catch:{ all -> 0x001a }
            b.l.a.c.h.b.m3 r5 = r5.f5799f     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.mo14414a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002d:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p097a.p113c.p145h.p147b.C3242l9.mo14409y(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }
}
