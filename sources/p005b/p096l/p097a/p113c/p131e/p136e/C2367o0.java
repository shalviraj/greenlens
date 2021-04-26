package p005b.p096l.p097a.p113c.p131e.p136e;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* renamed from: b.l.a.c.e.e.o0 */
public final class C2367o0 {

    /* renamed from: a */
    public static final Class<?> f4133a;

    /* renamed from: b */
    public static final C2023a1<?, ?> f4134b = m3900v(false);

    /* renamed from: c */
    public static final C2023a1<?, ?> f4135c = m3900v(true);

    /* renamed from: d */
    public static final C2023a1<?, ?> f4136d = new C2073c1();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f4133a = cls;
    }

    /* renamed from: A */
    public static int m3859A(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2438r) {
            C2438r rVar = (C2438r) list;
            i = 0;
            while (i2 < size) {
                long e = rVar.mo12951e(i2);
                i += C2509tm.m4204c((e >> 63) ^ (e + e));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = list.get(i2).longValue();
                i3 = i + C2509tm.m4204c((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: B */
    public static int m3860B(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C2509tm.m4209y(i) * size) + m3859A(list);
    }

    /* renamed from: C */
    public static int m3861C(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2096d) {
            C2096d dVar = (C2096d) list;
            i = 0;
            while (i2 < size) {
                i += C2509tm.m4210z(dVar.mo12492e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C2509tm.m4210z(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: D */
    public static int m3862D(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C2509tm.m4209y(i) * size) + m3861C(list);
    }

    /* renamed from: E */
    public static int m3863E(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2096d) {
            C2096d dVar = (C2096d) list;
            i = 0;
            while (i2 < size) {
                i += C2509tm.m4210z(dVar.mo12492e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C2509tm.m4210z(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: F */
    public static int m3864F(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C2509tm.m4209y(i) * size) + m3863E(list);
    }

    /* renamed from: G */
    public static int m3865G(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2096d) {
            C2096d dVar = (C2096d) list;
            i = 0;
            while (i2 < size) {
                i += C2509tm.m4203b(dVar.mo12492e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C2509tm.m4203b(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    public static int m3866H(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C2509tm.m4209y(i) * size) + m3865G(list);
    }

    /* renamed from: I */
    public static int m3867I(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2096d) {
            C2096d dVar = (C2096d) list;
            i = 0;
            while (i2 < size) {
                int e = dVar.mo12492e(i2);
                i += C2509tm.m4203b((e >> 31) ^ (e + e));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = list.get(i2).intValue();
                i3 = i + C2509tm.m4203b((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: J */
    public static int m3868J(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C2509tm.m4209y(i) * size) + m3867I(list);
    }

    /* renamed from: K */
    public static int m3869K(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: L */
    public static int m3870L(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C2509tm.m4203b(i << 3) + 4) * size;
    }

    /* renamed from: M */
    public static int m3871M(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: N */
    public static int m3872N(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C2509tm.m4203b(i << 3) + 8) * size;
    }

    /* renamed from: O */
    public static int m3873O(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C2509tm.m4203b(i << 3) + 1) * size;
    }

    /* renamed from: P */
    public static int m3874P(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int y = C2509tm.m4209y(i) * size;
        if (list instanceof C2342n) {
            C2342n nVar = (C2342n) list;
            while (i2 < size) {
                Object i3 = nVar.mo12629i(i2);
                y = (i3 instanceof C2317lm ? C2509tm.m4206e((C2317lm) i3) : C2509tm.m4205d((String) i3)) + y;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                y = (obj instanceof C2317lm ? C2509tm.m4206e((C2317lm) obj) : C2509tm.m4205d((String) obj)) + y;
                i2++;
            }
        }
        return y;
    }

    /* renamed from: Q */
    public static int m3875Q(int i, Object obj, C2319m0 m0Var) {
        if (obj instanceof C2294l) {
            int b = C2509tm.m4203b(i << 3);
            int a = ((C2294l) obj).mo12779a();
            return C2509tm.m4203b(a) + a + b;
        }
        return C2509tm.m4207f((C2072c0) obj, m0Var) + C2509tm.m4203b(i << 3);
    }

    /* renamed from: R */
    public static int m3876R(int i, List<?> list, C2319m0 m0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = C2509tm.m4209y(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof C2294l) {
                int a = ((C2294l) obj).mo12779a();
                y += C2509tm.m4203b(a) + a;
            } else {
                y = C2509tm.m4207f((C2072c0) obj, m0Var) + y;
            }
        }
        return y;
    }

    /* renamed from: S */
    public static int m3877S(int i, List<C2317lm> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = C2509tm.m4209y(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            y += C2509tm.m4206e(list.get(i2));
        }
        return y;
    }

    /* renamed from: T */
    public static int m3878T(int i, List<C2072c0> list, C2319m0 m0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C2509tm.m4208h(i, list.get(i3), m0Var);
        }
        return i2;
    }

    /* renamed from: a */
    public static boolean m3879a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static <UT, UB> UB m3880b(int i, List<Integer> list, C2146f fVar, UB ub, C2023a1<UT, UB> a1Var) {
        if (fVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (fVar.mo12624a()) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    if (ub == null) {
                        ub = a1Var.mo12351g();
                    }
                    a1Var.mo12346b(ub, i, (long) intValue);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return ub;
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!fVar.mo12624a()) {
                    if (ub == null) {
                        ub = a1Var.mo12351g();
                    }
                    a1Var.mo12346b(ub, i, (long) intValue2);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: c */
    public static <UT, UB> UB m3881c(int i, int i2, UB ub, C2023a1<UT, UB> a1Var) {
        if (ub == null) {
            ub = a1Var.mo12351g();
        }
        a1Var.mo12346b(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: d */
    public static void m3882d(int i, List<Double> list, C2533um umVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(umVar);
            int i2 = 0;
            if (z) {
                umVar.f4358a.mo12933i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).doubleValue();
                    i3 += 8;
                }
                umVar.f4358a.mo12945u(i3);
                while (i2 < list.size()) {
                    umVar.f4358a.mo12948x(Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                umVar.f4358a.mo12938n(i, Double.doubleToRawLongBits(list.get(i2).doubleValue()));
                i2++;
            }
        }
    }

    /* renamed from: e */
    public static void m3883e(int i, List<Float> list, C2533um umVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(umVar);
            int i2 = 0;
            if (z) {
                umVar.f4358a.mo12933i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).floatValue();
                    i3 += 4;
                }
                umVar.f4358a.mo12945u(i3);
                while (i2 < list.size()) {
                    umVar.f4358a.mo12946v(Float.floatToRawIntBits(list.get(i2).floatValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                umVar.f4358a.mo12936l(i, Float.floatToRawIntBits(list.get(i2).floatValue()));
                i2++;
            }
        }
    }

    /* renamed from: f */
    public static void m3884f(int i, List<Long> list, C2533um umVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(umVar);
            int i2 = 0;
            if (z) {
                umVar.f4358a.mo12933i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C2509tm.m4204c(list.get(i4).longValue());
                }
                umVar.f4358a.mo12945u(i3);
                while (i2 < list.size()) {
                    umVar.f4358a.mo12947w(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                umVar.f4358a.mo12937m(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: g */
    public static void m3885g(int i, List<Long> list, C2533um umVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(umVar);
            int i2 = 0;
            if (z) {
                umVar.f4358a.mo12933i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C2509tm.m4204c(list.get(i4).longValue());
                }
                umVar.f4358a.mo12945u(i3);
                while (i2 < list.size()) {
                    umVar.f4358a.mo12947w(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                umVar.f4358a.mo12937m(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: h */
    public static void m3886h(int i, List<Long> list, C2533um umVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(umVar);
            int i2 = 0;
            if (z) {
                umVar.f4358a.mo12933i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = list.get(i4).longValue();
                    i3 += C2509tm.m4204c((longValue >> 63) ^ (longValue + longValue));
                }
                umVar.f4358a.mo12945u(i3);
                while (i2 < list.size()) {
                    C2509tm tmVar = umVar.f4358a;
                    long longValue2 = list.get(i2).longValue();
                    tmVar.mo12947w((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C2509tm tmVar2 = umVar.f4358a;
                long longValue3 = list.get(i2).longValue();
                tmVar2.mo12937m(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
        }
    }

    /* renamed from: i */
    public static void m3887i(int i, List<Long> list, C2533um umVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(umVar);
            int i2 = 0;
            if (z) {
                umVar.f4358a.mo12933i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).longValue();
                    i3 += 8;
                }
                umVar.f4358a.mo12945u(i3);
                while (i2 < list.size()) {
                    umVar.f4358a.mo12948x(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                umVar.f4358a.mo12938n(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: j */
    public static void m3888j(int i, List<Long> list, C2533um umVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(umVar);
            int i2 = 0;
            if (z) {
                umVar.f4358a.mo12933i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).longValue();
                    i3 += 8;
                }
                umVar.f4358a.mo12945u(i3);
                while (i2 < list.size()) {
                    umVar.f4358a.mo12948x(list.get(i2).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                umVar.f4358a.mo12938n(i, list.get(i2).longValue());
                i2++;
            }
        }
    }

    /* renamed from: k */
    public static void m3889k(int i, List<Integer> list, C2533um umVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(umVar);
            int i2 = 0;
            if (z) {
                umVar.f4358a.mo12933i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C2509tm.m4210z(list.get(i4).intValue());
                }
                umVar.f4358a.mo12945u(i3);
                while (i2 < list.size()) {
                    umVar.f4358a.mo12944t(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                umVar.f4358a.mo12934j(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: l */
    public static void m3890l(int i, List<Integer> list, C2533um umVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(umVar);
            int i2 = 0;
            if (z) {
                umVar.f4358a.mo12933i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C2509tm.m4203b(list.get(i4).intValue());
                }
                umVar.f4358a.mo12945u(i3);
                while (i2 < list.size()) {
                    umVar.f4358a.mo12945u(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                umVar.f4358a.mo12935k(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: m */
    public static void m3891m(int i, List<Integer> list, C2533um umVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(umVar);
            int i2 = 0;
            if (z) {
                umVar.f4358a.mo12933i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue = list.get(i4).intValue();
                    i3 += C2509tm.m4203b((intValue >> 31) ^ (intValue + intValue));
                }
                umVar.f4358a.mo12945u(i3);
                while (i2 < list.size()) {
                    C2509tm tmVar = umVar.f4358a;
                    int intValue2 = list.get(i2).intValue();
                    tmVar.mo12945u((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                C2509tm tmVar2 = umVar.f4358a;
                int intValue3 = list.get(i2).intValue();
                tmVar2.mo12935k(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
        }
    }

    /* renamed from: n */
    public static void m3892n(int i, List<Integer> list, C2533um umVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(umVar);
            int i2 = 0;
            if (z) {
                umVar.f4358a.mo12933i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).intValue();
                    i3 += 4;
                }
                umVar.f4358a.mo12945u(i3);
                while (i2 < list.size()) {
                    umVar.f4358a.mo12946v(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                umVar.f4358a.mo12936l(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: o */
    public static void m3893o(int i, List<Integer> list, C2533um umVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(umVar);
            int i2 = 0;
            if (z) {
                umVar.f4358a.mo12933i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).intValue();
                    i3 += 4;
                }
                umVar.f4358a.mo12945u(i3);
                while (i2 < list.size()) {
                    umVar.f4358a.mo12946v(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                umVar.f4358a.mo12936l(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: p */
    public static void m3894p(int i, List<Integer> list, C2533um umVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(umVar);
            int i2 = 0;
            if (z) {
                umVar.f4358a.mo12933i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += C2509tm.m4210z(list.get(i4).intValue());
                }
                umVar.f4358a.mo12945u(i3);
                while (i2 < list.size()) {
                    umVar.f4358a.mo12944t(list.get(i2).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                umVar.f4358a.mo12934j(i, list.get(i2).intValue());
                i2++;
            }
        }
    }

    /* renamed from: q */
    public static void m3895q(int i, List<Boolean> list, C2533um umVar, boolean z) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(umVar);
            int i2 = 0;
            if (z) {
                umVar.f4358a.mo12933i(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    list.get(i4).booleanValue();
                    i3++;
                }
                umVar.f4358a.mo12945u(i3);
                while (i2 < list.size()) {
                    umVar.f4358a.mo12943s(list.get(i2).booleanValue() ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                umVar.f4358a.mo12939o(i, list.get(i2).booleanValue());
                i2++;
            }
        }
    }

    /* renamed from: r */
    public static void m3896r(int i, List<String> list, C2533um umVar) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(umVar);
            int i2 = 0;
            if (list instanceof C2342n) {
                C2342n nVar = (C2342n) list;
                while (i2 < list.size()) {
                    Object i3 = nVar.mo12629i(i2);
                    if (i3 instanceof String) {
                        umVar.f4358a.mo12940p(i, (String) i3);
                    } else {
                        umVar.f4358a.mo12941q(i, (C2317lm) i3);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                umVar.f4358a.mo12940p(i, list.get(i2));
                i2++;
            }
        }
    }

    /* renamed from: s */
    public static void m3897s(int i, List<C2317lm> list, C2533um umVar) {
        if (list != null && !list.isEmpty()) {
            Objects.requireNonNull(umVar);
            for (int i2 = 0; i2 < list.size(); i2++) {
                umVar.f4358a.mo12941q(i, list.get(i2));
            }
        }
    }

    /* renamed from: t */
    public static void m3898t(int i, List<?> list, C2533um umVar, C2319m0 m0Var) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                umVar.f4358a.mo12942r(i, (C2072c0) list.get(i2), m0Var);
            }
        }
    }

    /* renamed from: u */
    public static void m3899u(int i, List<?> list, C2533um umVar, C2319m0 m0Var) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                umVar.mo13043f(i, list.get(i2), m0Var);
            }
        }
    }

    /* renamed from: v */
    public static C2023a1<?, ?> m3900v(boolean z) {
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
            return (C2023a1) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: w */
    public static int m3901w(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2438r) {
            C2438r rVar = (C2438r) list;
            i = 0;
            while (i2 < size) {
                i += C2509tm.m4204c(rVar.mo12951e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C2509tm.m4204c(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: x */
    public static int m3902x(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C2509tm.m4209y(i) * list.size()) + m3901w(list);
    }

    /* renamed from: y */
    public static int m3903y(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2438r) {
            C2438r rVar = (C2438r) list;
            i = 0;
            while (i2 < size) {
                i += C2509tm.m4204c(rVar.mo12951e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C2509tm.m4204c(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: z */
    public static int m3904z(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C2509tm.m4209y(i) * size) + m3903y(list);
    }
}
