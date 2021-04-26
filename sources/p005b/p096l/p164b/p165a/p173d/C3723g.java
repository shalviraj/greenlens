package p005b.p096l.p164b.p165a.p173d;

import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p175c.p176a.C3757c;

/* renamed from: b.l.b.a.d.g */
public class C3723g {

    /* renamed from: a */
    public static final Boolean f6872a;

    /* renamed from: b */
    public static final String f6873b;

    /* renamed from: c */
    public static final Character f6874c;

    /* renamed from: d */
    public static final Byte f6875d;

    /* renamed from: e */
    public static final Short f6876e;

    /* renamed from: f */
    public static final Integer f6877f;

    /* renamed from: g */
    public static final Float f6878g;

    /* renamed from: h */
    public static final Long f6879h;

    /* renamed from: i */
    public static final Double f6880i;

    /* renamed from: j */
    public static final BigInteger f6881j;

    /* renamed from: k */
    public static final BigDecimal f6882k;

    /* renamed from: l */
    public static final C3728i f6883l;

    /* renamed from: m */
    public static final ConcurrentHashMap<Class<?>, Object> f6884m;

    static {
        Boolean bool = new Boolean(true);
        f6872a = bool;
        String str = new String();
        f6873b = str;
        Character ch = new Character(0);
        f6874c = ch;
        Byte b = new Byte((byte) 0);
        f6875d = b;
        Short sh = new Short(0);
        f6876e = sh;
        Integer num = new Integer(0);
        f6877f = num;
        Float f = new Float(0.0f);
        f6878g = f;
        Long l = new Long(0);
        f6879h = l;
        Double d = new Double(ShadowDrawableWrapper.COS_45);
        f6880i = d;
        BigInteger bigInteger = new BigInteger("0");
        f6881j = bigInteger;
        BigDecimal bigDecimal = new BigDecimal("0");
        f6882k = bigDecimal;
        C3728i iVar = new C3728i(false, 0, (Integer) null);
        f6883l = iVar;
        ConcurrentHashMap<Class<?>, Object> concurrentHashMap = new ConcurrentHashMap<>();
        f6884m = concurrentHashMap;
        concurrentHashMap.put(Boolean.class, bool);
        concurrentHashMap.put(String.class, str);
        concurrentHashMap.put(Character.class, ch);
        concurrentHashMap.put(Byte.class, b);
        concurrentHashMap.put(Short.class, sh);
        concurrentHashMap.put(Integer.class, num);
        concurrentHashMap.put(Float.class, f);
        concurrentHashMap.put(Long.class, l);
        concurrentHashMap.put(Double.class, d);
        concurrentHashMap.put(BigInteger.class, bigInteger);
        concurrentHashMap.put(BigDecimal.class, bigDecimal);
        concurrentHashMap.put(C3728i.class, iVar);
    }

    /* renamed from: a */
    public static <T> T m7018a(T t) {
        T t2;
        if (t == null || m7021d(t.getClass())) {
            return t;
        }
        if (t instanceof C3730k) {
            return ((C3730k) t).clone();
        }
        Class<?> cls = t.getClass();
        if (cls.isArray()) {
            t2 = Array.newInstance(cls.getComponentType(), Array.getLength(t));
        } else if (t instanceof C3711a) {
            t2 = ((C3711a) t).clone();
        } else if ("java.util.Arrays$ArrayList".equals(cls.getName())) {
            Object[] array = ((List) t).toArray();
            m7019b(array, array);
            return Arrays.asList(array);
        } else {
            t2 = C3734l.m7049m(cls);
        }
        m7019b(t, t2);
        return t2;
    }

    /* renamed from: b */
    public static void m7019b(Object obj, Object obj2) {
        Object b;
        Class<?> cls = obj.getClass();
        boolean z = true;
        int i = 0;
        C1960d.m2849t(cls == obj2.getClass());
        if (cls.isArray()) {
            if (Array.getLength(obj) != Array.getLength(obj2)) {
                z = false;
            }
            C1960d.m2849t(z);
            for (Object a : C3734l.m7048l(obj)) {
                Array.set(obj2, i, m7018a(a));
                i++;
            }
        } else if (Collection.class.isAssignableFrom(cls)) {
            Collection<Object> collection = (Collection) obj;
            if (ArrayList.class.isAssignableFrom(cls)) {
                ((ArrayList) obj2).ensureCapacity(collection.size());
            }
            Collection collection2 = (Collection) obj2;
            for (Object a2 : collection) {
                collection2.add(m7018a(a2));
            }
        } else {
            boolean isAssignableFrom = C3730k.class.isAssignableFrom(cls);
            if (isAssignableFrom || !Map.class.isAssignableFrom(cls)) {
                C3719e b2 = isAssignableFrom ? ((C3730k) obj).classInfo : C3719e.m7013b(cls);
                for (String a3 : b2.f6870c) {
                    C3729j a4 = b2.mo15076a(a3);
                    if (!Modifier.isFinal(a4.f6905b.getModifiers()) && ((!isAssignableFrom || !a4.f6904a) && (b = a4.mo15101b(obj)) != null)) {
                        a4.mo15102f(obj2, m7018a(b));
                    }
                }
            } else if (C3711a.class.isAssignableFrom(cls)) {
                C3711a aVar = (C3711a) obj2;
                C3711a aVar2 = (C3711a) obj;
                int i2 = aVar2.f6850g;
                while (i < i2) {
                    aVar.mo15056g(i, m7018a(aVar2.mo15049c(i)));
                    i++;
                }
            } else {
                Map map = (Map) obj2;
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    map.put(entry.getKey(), m7018a(entry.getValue()));
                }
            }
        }
    }

    /* renamed from: c */
    public static boolean m7020c(Object obj) {
        return obj == f6884m.get(obj.getClass());
    }

    /* renamed from: d */
    public static boolean m7021d(Type type) {
        if (type instanceof WildcardType) {
            type = C3734l.m7040d((WildcardType) type);
        }
        if (!(type instanceof Class)) {
            return false;
        }
        Class<Boolean> cls = (Class) type;
        return cls.isPrimitive() || cls == Character.class || cls == String.class || cls == Integer.class || cls == Long.class || cls == Short.class || cls == Byte.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == C3728i.class || cls == Boolean.class;
    }

    /* renamed from: e */
    public static Map<String, Object> m7022e(Object obj) {
        return (obj == null || m7020c(obj)) ? Collections.emptyMap() : obj instanceof Map ? (Map) obj : new C3724h(obj, false);
    }

    /* renamed from: f */
    public static Collection<Object> m7023f(Type type) {
        if (type instanceof WildcardType) {
            type = C3734l.m7040d((WildcardType) type);
        }
        if (type instanceof ParameterizedType) {
            type = ((ParameterizedType) type).getRawType();
        }
        Class cls = type instanceof Class ? (Class) type : null;
        if (type == null || (type instanceof GenericArrayType) || (cls != null && (cls.isArray() || cls.isAssignableFrom(ArrayList.class)))) {
            return new ArrayList();
        }
        if (cls != null) {
            return cls.isAssignableFrom(HashSet.class) ? new HashSet() : cls.isAssignableFrom(TreeSet.class) ? new TreeSet() : (Collection) C3734l.m7049m(cls);
        }
        throw new IllegalArgumentException("unable to create new instance of type: " + type);
    }

    /* renamed from: g */
    public static Map<String, Object> m7024g(Class<?> cls) {
        if (cls == null || cls.isAssignableFrom(C3711a.class)) {
            return new C3711a();
        }
        return cls.isAssignableFrom(TreeMap.class) ? new TreeMap() : (Map) C3734l.m7049m(cls);
    }

    /* renamed from: h */
    public static <T> T m7025h(Class<T> cls) {
        T t;
        T t2 = f6884m.get(cls);
        if (t2 != null) {
            return t2;
        }
        int i = 0;
        if (cls.isArray()) {
            Class cls2 = cls;
            do {
                cls2 = cls2.getComponentType();
                i++;
            } while (cls2.isArray());
            t = Array.newInstance(cls2, new int[i]);
        } else if (cls.isEnum()) {
            C3729j a = C3719e.m7013b(cls).mo15076a((String) null);
            Object[] objArr = {cls};
            if (a != null) {
                t = Enum.valueOf(a.f6905b.getDeclaringClass(), a.f6905b.getName());
            } else {
                throw new NullPointerException(C3757c.m7060a("enum missing constant with @NullValue annotation: %s", objArr));
            }
        } else {
            t = C3734l.m7049m(cls);
        }
        T putIfAbsent = f6884m.putIfAbsent(cls, t);
        return putIfAbsent == null ? t : putIfAbsent;
    }

    /* renamed from: i */
    public static Object m7026i(Type type, String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Class<BigDecimal> cls = type instanceof Class ? (Class) type : null;
        if (type == null || cls != null) {
            if (cls == Void.class) {
                return null;
            }
            if (str == null || cls == null || cls.isAssignableFrom(String.class)) {
                return str;
            }
            if (cls == Character.class || cls == Character.TYPE) {
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                throw new IllegalArgumentException("expected type Character/char but got " + cls);
            } else if (cls == Boolean.class || cls == Boolean.TYPE) {
                return Boolean.valueOf(str);
            } else {
                if (cls == Byte.class || cls == Byte.TYPE) {
                    return Byte.valueOf(str);
                }
                if (cls == Short.class || cls == Short.TYPE) {
                    return Short.valueOf(str);
                }
                if (cls == Integer.class || cls == Integer.TYPE) {
                    return Integer.valueOf(str);
                }
                if (cls == Long.class || cls == Long.TYPE) {
                    return Long.valueOf(str);
                }
                if (cls == Float.class || cls == Float.TYPE) {
                    return Float.valueOf(str);
                }
                if (cls == Double.class || cls == Double.TYPE) {
                    return Double.valueOf(str);
                }
                if (cls == C3728i.class) {
                    Matcher matcher = C3728i.f6899k.matcher(str);
                    if (matcher.matches()) {
                        int parseInt = Integer.parseInt(matcher.group(1));
                        int parseInt2 = Integer.parseInt(matcher.group(2)) - 1;
                        int parseInt3 = Integer.parseInt(matcher.group(3));
                        boolean z = matcher.group(4) != null;
                        String group = matcher.group(9);
                        boolean z2 = group != null;
                        if (!z2 || z) {
                            if (z) {
                                int parseInt4 = Integer.parseInt(matcher.group(5));
                                int parseInt5 = Integer.parseInt(matcher.group(6));
                                int parseInt6 = Integer.parseInt(matcher.group(7));
                                if (matcher.group(8) != null) {
                                    String substring = matcher.group(8).substring(1);
                                    Objects.requireNonNull(substring);
                                    if (substring.length() < 9) {
                                        StringBuilder sb = new StringBuilder(9);
                                        sb.append(substring);
                                        for (int length = substring.length(); length < 9; length++) {
                                            sb.append('0');
                                        }
                                        substring = sb.toString();
                                    }
                                    i4 = Integer.parseInt(substring);
                                } else {
                                    i4 = 0;
                                }
                                i2 = parseInt5;
                                i = parseInt6;
                                i3 = parseInt4;
                            } else {
                                i4 = 0;
                                i3 = 0;
                                i2 = 0;
                                i = 0;
                            }
                            GregorianCalendar gregorianCalendar = new GregorianCalendar(C3728i.f6898j);
                            gregorianCalendar.clear();
                            gregorianCalendar.set(parseInt, parseInt2, parseInt3, i3, i2, i);
                            long timeInMillis = gregorianCalendar.getTimeInMillis();
                            if (!z || !z2) {
                                i5 = null;
                            } else if (Character.toUpperCase(group.charAt(0)) != 'Z') {
                                int parseInt7 = Integer.parseInt(matcher.group(12)) + (Integer.parseInt(matcher.group(11)) * 60);
                                if (matcher.group(10).charAt(0) == '-') {
                                    parseInt7 = -parseInt7;
                                }
                                timeInMillis -= ((long) parseInt7) * 60000;
                                i5 = Integer.valueOf(parseInt7);
                            } else {
                                i5 = 0;
                            }
                            return new C3728i(!z, TimeUnit.SECONDS.toMillis(timeInMillis / 1000) + TimeUnit.NANOSECONDS.toMillis((long) i4), i5);
                        }
                        throw new NumberFormatException(C0843a.m451l("Invalid date/time format, cannot specify time zone shift without specifying time: ", str));
                    }
                    throw new NumberFormatException(C0843a.m451l("Invalid date/time format: ", str));
                } else if (cls == BigInteger.class) {
                    return new BigInteger(str);
                } else {
                    if (cls == BigDecimal.class) {
                        return new BigDecimal(str);
                    }
                    if (cls.isEnum()) {
                        if (C3719e.m7013b(cls).f6870c.contains(str)) {
                            C3729j a = C3719e.m7013b(cls).mo15076a(str);
                            return Enum.valueOf(a.f6905b.getDeclaringClass(), a.f6905b.getName());
                        }
                        throw new IllegalArgumentException(String.format("given enum name %s not part of enumeration", new Object[]{str}));
                    }
                }
            }
        }
        throw new IllegalArgumentException("expected primitive class, but got: " + type);
    }

    /* renamed from: j */
    public static Type m7027j(List<Type> list, Type type) {
        if (type instanceof WildcardType) {
            type = C3734l.m7040d((WildcardType) type);
        }
        while (type instanceof TypeVariable) {
            Type n = C3734l.m7050n(list, (TypeVariable) type);
            if (n != null) {
                type = n;
            }
            if (type instanceof TypeVariable) {
                type = ((TypeVariable) type).getBounds()[0];
            }
        }
        return type;
    }
}
