package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.List;
import java.util.Objects;

/* renamed from: b.l.a.c.e.i.b7 */
public final class C2728b7 {

    /* renamed from: a */
    public static final Class<?> f4645a;

    /* renamed from: b */
    public static final C2875m7<?, ?> f4646b = m4631t(false);

    /* renamed from: c */
    public static final C2875m7<?, ?> f4647c = m4631t(true);

    /* renamed from: d */
    public static final C2875m7<?, ?> f4648d = new C2901o7();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f4645a = cls;
    }

    /* renamed from: A */
    public static int m4594A(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2912p5) {
            C2912p5 p5Var = (C2912p5) list;
            i = 0;
            while (i2 < size) {
                i += C3002w4.m5505t(p5Var.mo13573l(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3002w4.m5505t(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: B */
    public static int m4595B(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C3002w4.m5504s(i) * size) + m4594A(list);
    }

    /* renamed from: C */
    public static int m4596C(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2912p5) {
            C2912p5 p5Var = (C2912p5) list;
            i = 0;
            while (i2 < size) {
                i += C3002w4.m5505t(p5Var.mo13573l(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3002w4.m5505t(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: D */
    public static int m4597D(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C3002w4.m5504s(i) * size) + m4596C(list);
    }

    /* renamed from: E */
    public static int m4598E(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2912p5) {
            C2912p5 p5Var = (C2912p5) list;
            i = 0;
            while (i2 < size) {
                i += C3002w4.m5506u(p5Var.mo13573l(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3002w4.m5506u(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: F */
    public static int m4599F(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C3002w4.m5504s(i) * size) + m4598E(list);
    }

    /* renamed from: G */
    public static int m4600G(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2912p5) {
            C2912p5 p5Var = (C2912p5) list;
            i = 0;
            while (i2 < size) {
                int l = p5Var.mo13573l(i2);
                i += C3002w4.m5506u((l >> 31) ^ (l + l));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i3 = i + C3002w4.m5506u((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    public static int m4601H(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C3002w4.m5504s(i) * size) + m4600G(list);
    }

    /* renamed from: I */
    public static int m4602I(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    public static int m4603J(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C3002w4.m5506u(i << 3) + 4) * size;
    }

    /* renamed from: K */
    public static int m4604K(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    public static int m4605L(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C3002w4.m5506u(i << 3) + 8) * size;
    }

    /* renamed from: M */
    public static int m4606M(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C3002w4.m5506u(i << 3) + 1) * size;
    }

    /* renamed from: N */
    public static int m4607N(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int s = C3002w4.m5504s(i) * size;
        if (list instanceof C2727b6) {
            C2727b6 b6Var = (C2727b6) list;
            while (i2 < size) {
                Object i3 = b6Var.mo13231i(i2);
                s = (i3 instanceof C2937r4 ? C3002w4.m5501a((C2937r4) i3) : C3002w4.m5508w((String) i3)) + s;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                s = (obj instanceof C2937r4 ? C3002w4.m5501a((C2937r4) obj) : C3002w4.m5508w((String) obj)) + s;
                i2++;
            }
        }
        return s;
    }

    /* renamed from: O */
    public static int m4608O(int i, Object obj, C3043z6 z6Var) {
        if (obj instanceof C3042z5) {
            int u = C3002w4.m5506u(i << 3);
            int a = ((C3042z5) obj).mo14004a();
            return C3002w4.m5506u(a) + a + u;
        }
        return C3002w4.m5502b((C2913p6) obj, z6Var) + C3002w4.m5506u(i << 3);
    }

    /* renamed from: P */
    public static int m4609P(int i, List<?> list, C3043z6 z6Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int s = C3002w4.m5504s(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof C3042z5) {
                int a = ((C3042z5) obj).mo14004a();
                s += C3002w4.m5506u(a) + a;
            } else {
                s = C3002w4.m5502b((C2913p6) obj, z6Var) + s;
            }
        }
        return s;
    }

    /* renamed from: Q */
    public static int m4610Q(int i, List<C2937r4> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int s = C3002w4.m5504s(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            s += C3002w4.m5501a(list.get(i2));
        }
        return s;
    }

    /* renamed from: R */
    public static int m4611R(int i, List<C2913p6> list, C3043z6 z6Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C3002w4.m5503c(i, list.get(i3), z6Var);
        }
        return i2;
    }

    /* renamed from: a */
    public static boolean m4612a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static void m4613b(int i, List<Double> list, C3015x4 x4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(x4Var);
            int i2 = 0;
            if (z) {
                x4Var.f5136a.mo13770d(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).doubleValue();
                    i3 += 8;
                }
                x4Var.f5136a.mo13781o(i3);
                while (i2 < list.size()) {
                    x4Var.f5136a.mo13784r(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                x4Var.f5136a.mo13775i(i, Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
        }
    }

    /* renamed from: c */
    public static void m4614c(int i, List<Float> list, C3015x4 x4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(x4Var);
            int i2 = 0;
            if (z) {
                x4Var.f5136a.mo13770d(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).floatValue();
                    i3 += 4;
                }
                x4Var.f5136a.mo13781o(i3);
                while (i2 < list.size()) {
                    x4Var.f5136a.mo13782p(Float.floatToRawIntBits(list.get(i2).floatValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                x4Var.f5136a.mo13773g(i, Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
        }
    }

    /* renamed from: d */
    public static void m4615d(int i, List<Long> list, C3015x4 x4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(x4Var);
            int i2 = 0;
            if (z) {
                x4Var.f5136a.mo13770d(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C3002w4.m5507v(list.get(i4).longValue());
                }
                x4Var.f5136a.mo13781o(i3);
                while (i2 < list.size()) {
                    x4Var.f5136a.mo13783q(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                x4Var.f5136a.mo13774h(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: e */
    public static void m4616e(int i, List<Long> list, C3015x4 x4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(x4Var);
            int i2 = 0;
            if (z) {
                x4Var.f5136a.mo13770d(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C3002w4.m5507v(list.get(i4).longValue());
                }
                x4Var.f5136a.mo13781o(i3);
                while (i2 < list.size()) {
                    x4Var.f5136a.mo13783q(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                x4Var.f5136a.mo13774h(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: f */
    public static void m4617f(int i, List<Long> list, C3015x4 x4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(x4Var);
            int i2 = 0;
            if (z) {
                x4Var.f5136a.mo13770d(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = list.get(i4).longValue();
                    i3 += C3002w4.m5507v((longValue >> 63) ^ (longValue + longValue));
                }
                x4Var.f5136a.mo13781o(i3);
                while (i2 < list.size()) {
                    C3002w4 w4Var = x4Var.f5136a;
                    long longValue2 = list.get(i2).longValue();
                    w4Var.mo13783q((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C3002w4 w4Var2 = x4Var.f5136a;
                long longValue3 = list.get(i2).longValue();
                w4Var2.mo13774h(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
        }
    }

    /* renamed from: g */
    public static void m4618g(int i, List<Long> list, C3015x4 x4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(x4Var);
            int i2 = 0;
            if (z) {
                x4Var.f5136a.mo13770d(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).longValue();
                    i3 += 8;
                }
                x4Var.f5136a.mo13781o(i3);
                while (i2 < list.size()) {
                    x4Var.f5136a.mo13784r(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                x4Var.f5136a.mo13775i(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: h */
    public static void m4619h(int i, List<Long> list, C3015x4 x4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(x4Var);
            int i2 = 0;
            if (z) {
                x4Var.f5136a.mo13770d(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).longValue();
                    i3 += 8;
                }
                x4Var.f5136a.mo13781o(i3);
                while (i2 < list.size()) {
                    x4Var.f5136a.mo13784r(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                x4Var.f5136a.mo13775i(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: i */
    public static void m4620i(int i, List<Integer> list, C3015x4 x4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(x4Var);
            int i2 = 0;
            if (z) {
                x4Var.f5136a.mo13770d(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C3002w4.m5505t(list.get(i4).intValue());
                }
                x4Var.f5136a.mo13781o(i3);
                while (i2 < list.size()) {
                    x4Var.f5136a.mo13780n(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                x4Var.f5136a.mo13771e(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: j */
    public static void m4621j(int i, List<Integer> list, C3015x4 x4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(x4Var);
            int i2 = 0;
            if (z) {
                x4Var.f5136a.mo13770d(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C3002w4.m5506u(list.get(i4).intValue());
                }
                x4Var.f5136a.mo13781o(i3);
                while (i2 < list.size()) {
                    x4Var.f5136a.mo13781o(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                x4Var.f5136a.mo13772f(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: k */
    public static void m4622k(int i, List<Integer> list, C3015x4 x4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(x4Var);
            int i2 = 0;
            if (z) {
                x4Var.f5136a.mo13770d(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue = list.get(i4).intValue();
                    i3 += C3002w4.m5506u((intValue >> 31) ^ (intValue + intValue));
                }
                x4Var.f5136a.mo13781o(i3);
                while (i2 < list.size()) {
                    C3002w4 w4Var = x4Var.f5136a;
                    int intValue2 = list.get(i2).intValue();
                    w4Var.mo13781o((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C3002w4 w4Var2 = x4Var.f5136a;
                int intValue3 = list.get(i2).intValue();
                w4Var2.mo13772f(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
        }
    }

    /* renamed from: l */
    public static void m4623l(int i, List<Integer> list, C3015x4 x4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(x4Var);
            int i2 = 0;
            if (z) {
                x4Var.f5136a.mo13770d(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).intValue();
                    i3 += 4;
                }
                x4Var.f5136a.mo13781o(i3);
                while (i2 < list.size()) {
                    x4Var.f5136a.mo13782p(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                x4Var.f5136a.mo13773g(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: m */
    public static void m4624m(int i, List<Integer> list, C3015x4 x4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(x4Var);
            int i2 = 0;
            if (z) {
                x4Var.f5136a.mo13770d(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).intValue();
                    i3 += 4;
                }
                x4Var.f5136a.mo13781o(i3);
                while (i2 < list.size()) {
                    x4Var.f5136a.mo13782p(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                x4Var.f5136a.mo13773g(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: n */
    public static void m4625n(int i, List<Integer> list, C3015x4 x4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(x4Var);
            int i2 = 0;
            if (z) {
                x4Var.f5136a.mo13770d(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C3002w4.m5505t(list.get(i4).intValue());
                }
                x4Var.f5136a.mo13781o(i3);
                while (i2 < list.size()) {
                    x4Var.f5136a.mo13780n(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                x4Var.f5136a.mo13771e(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: o */
    public static void m4626o(int i, List<Boolean> list, C3015x4 x4Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(x4Var);
            int i2 = 0;
            if (z) {
                x4Var.f5136a.mo13770d(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).booleanValue();
                    i3++;
                }
                x4Var.f5136a.mo13781o(i3);
                while (i2 < list.size()) {
                    x4Var.f5136a.mo13779m(list.get(i2).booleanValue() ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                x4Var.f5136a.mo13776j(i, list.get(i2).booleanValue());
                i2++;
            }
        }
    }

    /* renamed from: p */
    public static void m4627p(int i, List<String> list, C3015x4 x4Var) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(x4Var);
            int i2 = 0;
            if (list instanceof C2727b6) {
                C2727b6 b6Var = (C2727b6) list;
                while (i2 < list.size()) {
                    Object i3 = b6Var.mo13231i(i2);
                    if (i3 instanceof String) {
                        x4Var.f5136a.mo13777k(i, (String) i3);
                    } else {
                        x4Var.f5136a.mo13778l(i, (C2937r4) i3);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                x4Var.f5136a.mo13777k(i, list.get(i2));
                i2++;
            }
        }
    }

    /* renamed from: q */
    public static void m4628q(int i, List<C2937r4> list, C3015x4 x4Var) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(x4Var);
            for (int i2 = 0; i2 < list.size(); i2++) {
                x4Var.f5136a.mo13778l(i, list.get(i2));
            }
        }
    }

    /* renamed from: r */
    public static void m4629r(int i, List<?> list, C3015x4 x4Var, C3043z6 z6Var) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                x4Var.mo13970e(i, list.get(i2), z6Var);
            }
        }
    }

    /* renamed from: s */
    public static void m4630s(int i, List<?> list, C3015x4 x4Var, C3043z6 z6Var) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                x4Var.mo13971f(i, list.get(i2), z6Var);
            }
        }
    }

    /* renamed from: t */
    public static C2875m7<?, ?> m4631t(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (C2875m7) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: u */
    public static int m4632u(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2783f6) {
            C2783f6 f6Var = (C2783f6) list;
            i = 0;
            while (i2 < size) {
                i += C3002w4.m5507v(f6Var.mo13323e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3002w4.m5507v(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: v */
    public static int m4633v(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C3002w4.m5504s(i) * list.size()) + m4632u(list);
    }

    /* renamed from: w */
    public static int m4634w(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2783f6) {
            C2783f6 f6Var = (C2783f6) list;
            i = 0;
            while (i2 < size) {
                i += C3002w4.m5507v(f6Var.mo13323e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3002w4.m5507v(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: x */
    public static int m4635x(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C3002w4.m5504s(i) * size) + m4634w(list);
    }

    /* renamed from: y */
    public static int m4636y(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2783f6) {
            C2783f6 f6Var = (C2783f6) list;
            i = 0;
            while (i2 < size) {
                long e = f6Var.mo13323e(i2);
                i += C3002w4.m5507v((e >> 63) ^ (e + e));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i3 = i + C3002w4.m5507v((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: z */
    public static int m4637z(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C3002w4.m5504s(i) * size) + m4636y(list);
    }
}
