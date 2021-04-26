package p005b.p280p.p281a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p273o.C4805c3;
import p005b.p280p.p281a.C5075l;
import p005b.p280p.p281a.C5081q;
import p005b.p280p.p281a.p284z.C5117b;

/* renamed from: b.p.a.y */
public final class C5103y {

    /* renamed from: a */
    public static final C5075l.C5076a f9882a = new C5105b();

    /* renamed from: b */
    public static final C5075l<Boolean> f9883b = new C5106c();

    /* renamed from: c */
    public static final C5075l<Byte> f9884c = new C5107d();

    /* renamed from: d */
    public static final C5075l<Character> f9885d = new C5108e();

    /* renamed from: e */
    public static final C5075l<Double> f9886e = new C5109f();

    /* renamed from: f */
    public static final C5075l<Float> f9887f = new C5110g();

    /* renamed from: g */
    public static final C5075l<Integer> f9888g = new C5111h();

    /* renamed from: h */
    public static final C5075l<Long> f9889h = new C5112i();

    /* renamed from: i */
    public static final C5075l<Short> f9890i = new C5113j();

    /* renamed from: j */
    public static final C5075l<String> f9891j = new C5104a();

    /* renamed from: b.p.a.y$a */
    public class C5104a extends C5075l<String> {
        /* renamed from: a */
        public Object mo16804a(C5081q qVar) {
            return qVar.mo16841f0();
        }

        /* renamed from: e */
        public void mo16805e(C5087u uVar, Object obj) {
            uVar.mo16874o0((String) obj);
        }

        public String toString() {
            return "JsonAdapter(String)";
        }
    }

    /* renamed from: b.p.a.y$b */
    public class C5105b implements C5075l.C5076a {
        /* renamed from: a */
        public C5075l<?> mo16807a(Type type, Set<? extends Annotation> set, C5099x xVar) {
            C5075l lVar;
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return C5103y.f9883b;
            }
            if (type == Byte.TYPE) {
                return C5103y.f9884c;
            }
            if (type == Character.TYPE) {
                return C5103y.f9885d;
            }
            if (type == Double.TYPE) {
                return C5103y.f9886e;
            }
            if (type == Float.TYPE) {
                return C5103y.f9887f;
            }
            if (type == Integer.TYPE) {
                return C5103y.f9888g;
            }
            if (type == Long.TYPE) {
                return C5103y.f9889h;
            }
            if (type == Short.TYPE) {
                return C5103y.f9890i;
            }
            if (type == Boolean.class) {
                lVar = C5103y.f9883b;
            } else if (type == Byte.class) {
                lVar = C5103y.f9884c;
            } else if (type == Character.class) {
                lVar = C5103y.f9885d;
            } else if (type == Double.class) {
                lVar = C5103y.f9886e;
            } else if (type == Float.class) {
                lVar = C5103y.f9887f;
            } else if (type == Integer.class) {
                lVar = C5103y.f9888g;
            } else if (type == Long.class) {
                lVar = C5103y.f9889h;
            } else if (type == Short.class) {
                lVar = C5103y.f9890i;
            } else if (type == String.class) {
                lVar = C5103y.f9891j;
            } else if (type == Object.class) {
                lVar = new C5115l(xVar);
            } else {
                Class<?> j = C4805c3.m8811j(type);
                C5075l<?> c = C5117b.m9416c(xVar, type, j);
                if (c != null) {
                    return c;
                }
                if (!j.isEnum()) {
                    return null;
                }
                lVar = new C5114k(j);
            }
            return lVar.mo16831c();
        }
    }

    /* renamed from: b.p.a.y$c */
    public class C5106c extends C5075l<Boolean> {
        /* renamed from: a */
        public Object mo16804a(C5081q qVar) {
            C5084r rVar = (C5084r) qVar;
            int i = rVar.f9822m;
            if (i == 0) {
                i = rVar.mo16855s0();
            }
            boolean z = false;
            if (i == 5) {
                rVar.f9822m = 0;
                int[] iArr = rVar.f9801j;
                int i2 = rVar.f9798g - 1;
                iArr[i2] = iArr[i2] + 1;
                z = true;
            } else if (i == 6) {
                rVar.f9822m = 0;
                int[] iArr2 = rVar.f9801j;
                int i3 = rVar.f9798g - 1;
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                StringBuilder u = C0843a.m460u("Expected a boolean but was ");
                u.append(rVar.mo16842h0());
                u.append(" at path ");
                u.append(rVar.mo16834H());
                throw new C5078n(u.toString());
            }
            return Boolean.valueOf(z);
        }

        /* renamed from: e */
        public void mo16805e(C5087u uVar, Object obj) {
            uVar.mo16875p0(((Boolean) obj).booleanValue());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    /* renamed from: b.p.a.y$d */
    public class C5107d extends C5075l<Byte> {
        /* renamed from: a */
        public Object mo16804a(C5081q qVar) {
            return Byte.valueOf((byte) C5103y.m9388a(qVar, "a byte", -128, 255));
        }

        /* renamed from: e */
        public void mo16805e(C5087u uVar, Object obj) {
            uVar.mo16872l0((long) (((Byte) obj).intValue() & 255));
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    /* renamed from: b.p.a.y$e */
    public class C5108e extends C5075l<Character> {
        /* renamed from: a */
        public Object mo16804a(C5081q qVar) {
            String f0 = qVar.mo16841f0();
            if (f0.length() <= 1) {
                return Character.valueOf(f0.charAt(0));
            }
            throw new C5078n(String.format("Expected %s but was %s at path %s", new Object[]{"a char", '\"' + f0 + '\"', qVar.mo16834H()}));
        }

        /* renamed from: e */
        public void mo16805e(C5087u uVar, Object obj) {
            uVar.mo16874o0(((Character) obj).toString());
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }
    }

    /* renamed from: b.p.a.y$f */
    public class C5109f extends C5075l<Double> {
        /* renamed from: a */
        public Object mo16804a(C5081q qVar) {
            return Double.valueOf(qVar.mo16836O());
        }

        /* renamed from: e */
        public void mo16805e(C5087u uVar, Object obj) {
            uVar.mo16871h0(((Double) obj).doubleValue());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }
    }

    /* renamed from: b.p.a.y$g */
    public class C5110g extends C5075l<Float> {
        /* renamed from: a */
        public Object mo16804a(C5081q qVar) {
            float O = (float) qVar.mo16836O();
            if (!Float.isInfinite(O)) {
                return Float.valueOf(O);
            }
            throw new C5078n("JSON forbids NaN and infinities: " + O + " at path " + qVar.mo16834H());
        }

        /* renamed from: e */
        public void mo16805e(C5087u uVar, Object obj) {
            Float f = (Float) obj;
            Objects.requireNonNull(f);
            uVar.mo16873n0(f);
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }
    }

    /* renamed from: b.p.a.y$h */
    public class C5111h extends C5075l<Integer> {
        /* renamed from: a */
        public Object mo16804a(C5081q qVar) {
            return Integer.valueOf(qVar.mo16837S());
        }

        /* renamed from: e */
        public void mo16805e(C5087u uVar, Object obj) {
            uVar.mo16872l0((long) ((Integer) obj).intValue());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    /* renamed from: b.p.a.y$i */
    public class C5112i extends C5075l<Long> {
        /* renamed from: a */
        public Object mo16804a(C5081q qVar) {
            long j;
            C5084r rVar = (C5084r) qVar;
            int i = rVar.f9822m;
            if (i == 0) {
                i = rVar.mo16855s0();
            }
            if (i == 16) {
                rVar.f9822m = 0;
                int[] iArr = rVar.f9801j;
                int i2 = rVar.f9798g - 1;
                iArr[i2] = iArr[i2] + 1;
                j = rVar.f9823n;
            } else {
                if (i == 17) {
                    rVar.f9825p = rVar.f9821l.mo25921o0((long) rVar.f9824o);
                } else if (i == 9 || i == 8) {
                    String y0 = rVar.mo16862y0(i == 9 ? C5084r.f9816r : C5084r.f9815q);
                    rVar.f9825p = y0;
                    try {
                        j = Long.parseLong(y0);
                        rVar.f9822m = 0;
                        int[] iArr2 = rVar.f9801j;
                        int i3 = rVar.f9798g - 1;
                        iArr2[i3] = iArr2[i3] + 1;
                    } catch (NumberFormatException unused) {
                    }
                } else if (i != 11) {
                    StringBuilder u = C0843a.m460u("Expected a long but was ");
                    u.append(rVar.mo16842h0());
                    u.append(" at path ");
                    u.append(rVar.mo16834H());
                    throw new C5078n(u.toString());
                }
                rVar.f9822m = 11;
                try {
                    j = new BigDecimal(rVar.f9825p).longValueExact();
                    rVar.f9825p = null;
                    rVar.f9822m = 0;
                    int[] iArr3 = rVar.f9801j;
                    int i4 = rVar.f9798g - 1;
                    iArr3[i4] = iArr3[i4] + 1;
                } catch (ArithmeticException | NumberFormatException unused2) {
                    StringBuilder u2 = C0843a.m460u("Expected a long but was ");
                    u2.append(rVar.f9825p);
                    u2.append(" at path ");
                    u2.append(rVar.mo16834H());
                    throw new C5078n(u2.toString());
                }
            }
            return Long.valueOf(j);
        }

        /* renamed from: e */
        public void mo16805e(C5087u uVar, Object obj) {
            uVar.mo16872l0(((Long) obj).longValue());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }
    }

    /* renamed from: b.p.a.y$j */
    public class C5113j extends C5075l<Short> {
        /* renamed from: a */
        public Object mo16804a(C5081q qVar) {
            return Short.valueOf((short) C5103y.m9388a(qVar, "a short", -32768, 32767));
        }

        /* renamed from: e */
        public void mo16805e(C5087u uVar, Object obj) {
            uVar.mo16872l0((long) ((Short) obj).intValue());
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }
    }

    /* renamed from: b.p.a.y$k */
    public static final class C5114k<T extends Enum<T>> extends C5075l<T> {

        /* renamed from: a */
        public final Class<T> f9892a;

        /* renamed from: b */
        public final String[] f9893b;

        /* renamed from: c */
        public final T[] f9894c;

        /* renamed from: d */
        public final C5081q.C5082a f9895d;

        public C5114k(Class<T> cls) {
            this.f9892a = cls;
            try {
                T[] tArr = (Enum[]) cls.getEnumConstants();
                this.f9894c = tArr;
                this.f9893b = new String[tArr.length];
                int i = 0;
                while (true) {
                    T[] tArr2 = this.f9894c;
                    if (i < tArr2.length) {
                        T t = tArr2[i];
                        C5074k kVar = (C5074k) cls.getField(t.name()).getAnnotation(C5074k.class);
                        this.f9893b[i] = kVar != null ? kVar.name() : t.name();
                        i++;
                    } else {
                        this.f9895d = C5081q.C5082a.m9296a(this.f9893b);
                        return;
                    }
                }
            } catch (NoSuchFieldException e) {
                StringBuilder u = C0843a.m460u("Missing field in ");
                u.append(cls.getName());
                throw new AssertionError(u.toString(), e);
            }
        }

        /* renamed from: a */
        public Object mo16804a(C5081q qVar) {
            int i;
            C5081q.C5082a aVar = this.f9895d;
            C5084r rVar = (C5084r) qVar;
            int i2 = rVar.f9822m;
            if (i2 == 0) {
                i2 = rVar.mo16855s0();
            }
            if (i2 < 8 || i2 > 11) {
                i = -1;
            } else if (i2 == 11) {
                i = rVar.mo16858u0(rVar.f9825p, aVar);
            } else {
                int m0 = rVar.f9820k.mo25917m0(aVar.f9803b);
                if (m0 != -1) {
                    rVar.f9822m = 0;
                    int[] iArr = rVar.f9801j;
                    int i3 = rVar.f9798g - 1;
                    iArr[i3] = iArr[i3] + 1;
                    i = m0;
                } else {
                    String f0 = rVar.mo16841f0();
                    i = rVar.mo16858u0(f0, aVar);
                    if (i == -1) {
                        rVar.f9822m = 11;
                        rVar.f9825p = f0;
                        int[] iArr2 = rVar.f9801j;
                        int i4 = rVar.f9798g - 1;
                        iArr2[i4] = iArr2[i4] - 1;
                    }
                }
            }
            if (i != -1) {
                return this.f9894c[i];
            }
            String H = qVar.mo16834H();
            String f02 = qVar.mo16841f0();
            StringBuilder u = C0843a.m460u("Expected one of ");
            u.append(Arrays.asList(this.f9893b));
            u.append(" but was ");
            u.append(f02);
            u.append(" at path ");
            u.append(H);
            throw new C5078n(u.toString());
        }

        /* renamed from: e */
        public void mo16805e(C5087u uVar, Object obj) {
            uVar.mo16874o0(this.f9893b[((Enum) obj).ordinal()]);
        }

        public String toString() {
            StringBuilder u = C0843a.m460u("JsonAdapter(");
            u.append(this.f9892a.getName());
            u.append(")");
            return u.toString();
        }
    }

    /* renamed from: b.p.a.y$l */
    public static final class C5115l extends C5075l<Object> {

        /* renamed from: a */
        public final C5099x f9896a;

        /* renamed from: b */
        public final C5075l<List> f9897b;

        /* renamed from: c */
        public final C5075l<Map> f9898c;

        /* renamed from: d */
        public final C5075l<String> f9899d;

        /* renamed from: e */
        public final C5075l<Double> f9900e;

        /* renamed from: f */
        public final C5075l<Boolean> f9901f;

        public C5115l(C5099x xVar) {
            this.f9896a = xVar;
            this.f9897b = xVar.mo16929a(List.class);
            this.f9898c = xVar.mo16929a(Map.class);
            this.f9899d = xVar.mo16929a(String.class);
            this.f9900e = xVar.mo16929a(Double.class);
            this.f9901f = xVar.mo16929a(Boolean.class);
        }

        /* renamed from: a */
        public Object mo16804a(C5081q qVar) {
            int ordinal = qVar.mo16842h0().ordinal();
            if (ordinal == 0) {
                return this.f9897b.mo16804a(qVar);
            }
            if (ordinal == 2) {
                return this.f9898c.mo16804a(qVar);
            }
            if (ordinal == 5) {
                return this.f9899d.mo16804a(qVar);
            }
            if (ordinal == 6) {
                return this.f9900e.mo16804a(qVar);
            }
            if (ordinal == 7) {
                return this.f9901f.mo16804a(qVar);
            }
            if (ordinal == 8) {
                qVar.mo16838Z();
                return null;
            }
            StringBuilder u = C0843a.m460u("Expected a value but was ");
            u.append(qVar.mo16842h0());
            u.append(" at path ");
            u.append(qVar.mo16834H());
            throw new IllegalStateException(u.toString());
        }

        /* renamed from: e */
        public void mo16805e(C5087u uVar, Object obj) {
            Class cls = obj.getClass();
            if (cls == Object.class) {
                uVar.mo16869e();
                uVar.mo16864H();
                return;
            }
            C5099x xVar = this.f9896a;
            if (Map.class.isAssignableFrom(cls)) {
                cls = Map.class;
            } else if (Collection.class.isAssignableFrom(cls)) {
                cls = Collection.class;
            }
            xVar.mo16931c(cls, C5117b.f9903a).mo16805e(uVar, obj);
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    /* renamed from: a */
    public static int m9388a(C5081q qVar, String str, int i, int i2) {
        int S = qVar.mo16837S();
        if (S >= i && S <= i2) {
            return S;
        }
        throw new C5078n(String.format("Expected %s but was %s at path %s", new Object[]{str, Integer.valueOf(S), qVar.mo16834H()}));
    }
}
