package p298d.p344x.p346c;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.C6768j;
import p298d.p299a.C6726e;
import p298d.p334t.C6790h;
import p298d.p344x.C6850a;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p345b.C6852b;
import p298d.p344x.p345b.C6853c;
import p298d.p344x.p345b.C6854d;
import p298d.p344x.p345b.C6855e;
import p298d.p344x.p345b.C6856f;
import p298d.p344x.p345b.C6857g;
import p298d.p344x.p345b.C6858h;
import p298d.p344x.p345b.C6859i;
import p298d.p344x.p345b.C6860j;
import p298d.p344x.p345b.C6861k;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p345b.C6863m;
import p298d.p344x.p345b.C6864n;
import p298d.p344x.p345b.C6865o;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p345b.C6867q;
import p298d.p344x.p345b.C6868r;
import p298d.p344x.p345b.C6869s;
import p298d.p344x.p345b.C6870t;
import p298d.p344x.p345b.C6871u;
import p298d.p344x.p345b.C6872v;
import p298d.p344x.p345b.C6873w;
import p298d.p415c0.C7694h;

/* renamed from: d.x.c.d */
public final class C6882d implements C6726e<Object>, C6881c {

    /* renamed from: h */
    public static final Map<Class<? extends Object<?>>, Integer> f13788h;

    /* renamed from: i */
    public static final HashMap<String, String> f13789i;

    /* renamed from: j */
    public static final HashMap<String, String> f13790j;

    /* renamed from: k */
    public static final HashMap<String, String> f13791k;

    /* renamed from: l */
    public static final C6883a f13792l = new C6883a((DefaultConstructorMarker) null);

    /* renamed from: g */
    public final Class<?> f13793g;

    /* renamed from: d.x.c.d$a */
    public static final class C6883a {
        public C6883a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        int i = 0;
        List A = C6790h.m12314A(C6851a.class, C6862l.class, C6866p.class, C6867q.class, C6868r.class, C6869s.class, C6870t.class, C6871u.class, C6872v.class, C6873w.class, C6852b.class, C6853c.class, C6854d.class, C6855e.class, C6856f.class, C6857g.class, C6858h.class, C6859i.class, C6860j.class, C6861k.class, C6863m.class, C6864n.class, C6865o.class);
        ArrayList arrayList = new ArrayList(C5266a.m9892V(A, 10));
        for (Object next : A) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new C6768j((Class) next, Integer.valueOf(i)));
                i = i2;
            } else {
                C6790h.m12333T();
                throw null;
            }
        }
        f13788h = C6790h.m12338Y(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f13789i = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f13790j = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C6888i.m12437d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            C6888i.m12437d(str, "kotlinName");
            sb.append(C7694h.m13915F(str, '.', (String) null, 2));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            hashMap3.put(sb2, str + ".Companion");
        }
        for (Map.Entry next2 : f13788h.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f13791k = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5266a.m9957g3(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), C7694h.m13915F((String) entry.getValue(), '.', (String) null, 2));
        }
    }

    public C6882d(Class<?> cls) {
        C6888i.m12438e(cls, "jClass");
        this.f13793g = cls;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6882d) && C6888i.m12434a(C5266a.m10051w1(this), C5266a.m10051w1((C6726e) obj));
    }

    /* renamed from: f */
    public boolean mo22943f() {
        throw new C6850a();
    }

    public List<Annotation> getAnnotations() {
        throw new C6850a();
    }

    public int hashCode() {
        return C5266a.m10051w1(this).hashCode();
    }

    /* renamed from: i */
    public boolean mo22946i() {
        throw new C6850a();
    }

    public boolean isInner() {
        throw new C6850a();
    }

    /* renamed from: m */
    public String mo22948m() {
        String str;
        Class<?> cls = this.f13793g;
        C6888i.m12438e(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            C6888i.m12437d(componentType, "componentType");
            if (componentType.isPrimitive() && (str = f13791k.get(componentType.getName())) != null) {
                str2 = C0843a.m451l(str, "Array");
            }
            if (str2 != null) {
                return str2;
            }
            return "kotlin.Array";
        }
        String str3 = f13791k.get(cls.getName());
        return str3 != null ? str3 : cls.getCanonicalName();
    }

    /* renamed from: n */
    public Class<?> mo22949n() {
        return this.f13793g;
    }

    /* renamed from: q */
    public Object mo22950q() {
        throw new C6850a();
    }

    public String toString() {
        return this.f13793g.toString() + " (Kotlin reflection is not available)";
    }
}
