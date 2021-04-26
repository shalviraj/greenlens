package p298d.p299a.p300a.p301a.p303y0.p314d.p315a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.C6768j;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p334t.C6790h;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.d.a.e0 */
public class C6275e0 {

    /* renamed from: a */
    public static final C6276a f12342a = new C6276a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final List<C6276a.C6277a> f12343b;

    /* renamed from: c */
    public static final List<String> f12344c;

    /* renamed from: d */
    public static final Map<C6276a.C6277a, C6279c> f12345d;

    /* renamed from: e */
    public static final Map<String, C6279c> f12346e;

    /* renamed from: f */
    public static final Set<C6717d> f12347f;

    /* renamed from: g */
    public static final Set<String> f12348g;

    /* renamed from: h */
    public static final C6276a.C6277a f12349h;

    /* renamed from: i */
    public static final Map<C6276a.C6277a, C6717d> f12350i;

    /* renamed from: j */
    public static final Map<String, C6717d> f12351j;

    /* renamed from: k */
    public static final List<C6717d> f12352k;

    /* renamed from: l */
    public static final Map<C6717d, List<C6717d>> f12353l;

    /* renamed from: d.a.a.a.y0.d.a.e0$a */
    public static final class C6276a {

        /* renamed from: d.a.a.a.y0.d.a.e0$a$a */
        public static final class C6277a {

            /* renamed from: a */
            public final C6717d f12354a;

            /* renamed from: b */
            public final String f12355b;

            public C6277a(C6717d dVar, String str) {
                C6888i.m12438e(dVar, "name");
                C6888i.m12438e(str, "signature");
                this.f12354a = dVar;
                this.f12355b = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C6277a)) {
                    return false;
                }
                C6277a aVar = (C6277a) obj;
                return C6888i.m12434a(this.f12354a, aVar.f12354a) && C6888i.m12434a(this.f12355b, aVar.f12355b);
            }

            public int hashCode() {
                return this.f12355b.hashCode() + (this.f12354a.hashCode() * 31);
            }

            public String toString() {
                StringBuilder u = C0843a.m460u("NameAndSignature(name=");
                u.append(this.f12354a);
                u.append(", signature=");
                return C0843a.m454o(u, this.f12355b, ')');
            }
        }

        public C6276a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* renamed from: a */
        public static final C6277a m11271a(C6276a aVar, String str, String str2, String str3, String str4) {
            Objects.requireNonNull(aVar);
            C6717d l = C6717d.m12270l(str2);
            C6888i.m12437d(l, "identifier(name)");
            String str5 = str2 + '(' + str3 + ')' + str4;
            C6888i.m12438e(str, "internalName");
            C6888i.m12438e(str5, "jvmDescriptor");
            return new C6277a(l, str + '.' + str5);
        }
    }

    /* renamed from: d.a.a.a.y0.d.a.e0$b */
    public enum C6278b {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC((String) null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);

        /* access modifiers changed from: public */
        C6278b(String str, boolean z) {
        }
    }

    /* renamed from: d.a.a.a.y0.d.a.e0$c */
    public enum C6279c {
        NULL((String) null),
        INDEX(-1),
        FALSE(Boolean.FALSE);
        

        /* renamed from: g */
        public final Object f12365g;

        /* renamed from: d.a.a.a.y0.d.a.e0$c$a */
        public static final class C6280a extends C6279c {
            public C6280a(String str, int i) {
                super(str, i, (Object) null, (DefaultConstructorMarker) null);
            }
        }

        /* access modifiers changed from: public */
        C6279c(Object obj) {
            this.f12365g = obj;
        }

        /* access modifiers changed from: public */
        C6279c(Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Set<String> N = C6790h.m12327N("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(C5266a.m9892V(N, 10));
        for (String str : N) {
            String desc = JvmPrimitiveType.BOOLEAN.getDesc();
            C6888i.m12437d(desc, "BOOLEAN.desc");
            C6717d l = C6717d.m12270l(str);
            C6888i.m12437d(l, "identifier(name)");
            String str2 = str + '(' + "Ljava/util/Collection;" + ')' + desc;
            C6888i.m12438e("java/util/Collection", "internalName");
            C6888i.m12438e(str2, "jvmDescriptor");
            arrayList.add(new C6276a.C6277a(l, "java/util/Collection" + '.' + str2));
        }
        f12343b = arrayList;
        ArrayList arrayList2 = new ArrayList(C5266a.m9892V(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C6276a.C6277a) it.next()).f12355b);
        }
        f12344c = arrayList2;
        List<C6276a.C6277a> list = f12343b;
        ArrayList arrayList3 = new ArrayList(C5266a.m9892V(list, 10));
        for (C6276a.C6277a aVar : list) {
            arrayList3.add(aVar.f12354a.mo23886e());
        }
        C6276a aVar2 = f12342a;
        C6888i.m12438e("Collection", "name");
        String k = C6888i.m12444k("java/util/", "Collection");
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        String desc2 = jvmPrimitiveType.getDesc();
        C6888i.m12437d(desc2, "BOOLEAN.desc");
        C6276a.C6277a a = C6276a.m11271a(aVar2, k, "contains", "Ljava/lang/Object;", desc2);
        C6279c cVar = C6279c.FALSE;
        C6888i.m12438e("Collection", "name");
        String k2 = C6888i.m12444k("java/util/", "Collection");
        String desc3 = jvmPrimitiveType.getDesc();
        C6888i.m12437d(desc3, "BOOLEAN.desc");
        C6888i.m12438e("Map", "name");
        String k3 = C6888i.m12444k("java/util/", "Map");
        String desc4 = jvmPrimitiveType.getDesc();
        C6888i.m12437d(desc4, "BOOLEAN.desc");
        C6888i.m12438e("Map", "name");
        String k4 = C6888i.m12444k("java/util/", "Map");
        String desc5 = jvmPrimitiveType.getDesc();
        C6888i.m12437d(desc5, "BOOLEAN.desc");
        C6888i.m12438e("Map", "name");
        String k5 = C6888i.m12444k("java/util/", "Map");
        String desc6 = jvmPrimitiveType.getDesc();
        C6888i.m12437d(desc6, "BOOLEAN.desc");
        C6888i.m12438e("Map", "name");
        C6888i.m12438e("Map", "name");
        C6276a.C6277a a2 = C6276a.m11271a(aVar2, C6888i.m12444k("java/util/", "Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        C6279c cVar2 = C6279c.NULL;
        C6888i.m12438e("Map", "name");
        C6888i.m12438e("List", "name");
        String k6 = C6888i.m12444k("java/util/", "List");
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.INT;
        String desc7 = jvmPrimitiveType2.getDesc();
        C6888i.m12437d(desc7, "INT.desc");
        C6276a.C6277a a3 = C6276a.m11271a(aVar2, k6, "indexOf", "Ljava/lang/Object;", desc7);
        C6279c cVar3 = C6279c.INDEX;
        C6888i.m12438e("List", "name");
        String k7 = C6888i.m12444k("java/util/", "List");
        String desc8 = jvmPrimitiveType2.getDesc();
        C6888i.m12437d(desc8, "INT.desc");
        Map<C6276a.C6277a, C6279c> D = C6790h.m12317D(new C6768j(a, cVar), new C6768j(C6276a.m11271a(aVar2, k2, "remove", "Ljava/lang/Object;", desc3), cVar), new C6768j(C6276a.m11271a(aVar2, k3, "containsKey", "Ljava/lang/Object;", desc4), cVar), new C6768j(C6276a.m11271a(aVar2, k4, "containsValue", "Ljava/lang/Object;", desc5), cVar), new C6768j(C6276a.m11271a(aVar2, k5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", desc6), cVar), new C6768j(C6276a.m11271a(aVar2, C6888i.m12444k("java/util/", "Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), C6279c.f12363k), new C6768j(a2, cVar2), new C6768j(C6276a.m11271a(aVar2, C6888i.m12444k("java/util/", "Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), cVar2), new C6768j(a3, cVar3), new C6768j(C6276a.m11271a(aVar2, k7, "lastIndexOf", "Ljava/lang/Object;", desc8), cVar3));
        f12345d = D;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5266a.m9957g3(D.size()));
        for (Map.Entry entry : D.entrySet()) {
            linkedHashMap.put(((C6276a.C6277a) entry.getKey()).f12355b, entry.getValue());
        }
        f12346e = linkedHashMap;
        Set<T> K = C6790h.m12324K(f12345d.keySet(), f12343b);
        ArrayList arrayList4 = new ArrayList(C5266a.m9892V(K, 10));
        for (T t : K) {
            arrayList4.add(t.f12354a);
        }
        f12347f = C6790h.m12349e0(arrayList4);
        ArrayList arrayList5 = new ArrayList(C5266a.m9892V(K, 10));
        for (T t2 : K) {
            arrayList5.add(t2.f12355b);
        }
        f12348g = C6790h.m12349e0(arrayList5);
        C6276a aVar3 = f12342a;
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.INT;
        String desc9 = jvmPrimitiveType3.getDesc();
        C6888i.m12437d(desc9, "INT.desc");
        C6276a.C6277a a4 = C6276a.m11271a(aVar3, "java/util/List", "removeAt", desc9, "Ljava/lang/Object;");
        f12349h = a4;
        C6888i.m12438e("Number", "name");
        String k8 = C6888i.m12444k("java/lang/", "Number");
        String desc10 = JvmPrimitiveType.BYTE.getDesc();
        C6888i.m12437d(desc10, "BYTE.desc");
        C6888i.m12438e("Number", "name");
        String k9 = C6888i.m12444k("java/lang/", "Number");
        String desc11 = JvmPrimitiveType.SHORT.getDesc();
        C6888i.m12437d(desc11, "SHORT.desc");
        C6888i.m12438e("Number", "name");
        String k10 = C6888i.m12444k("java/lang/", "Number");
        String desc12 = jvmPrimitiveType3.getDesc();
        C6888i.m12437d(desc12, "INT.desc");
        C6888i.m12438e("Number", "name");
        String k11 = C6888i.m12444k("java/lang/", "Number");
        String desc13 = JvmPrimitiveType.LONG.getDesc();
        C6888i.m12437d(desc13, "LONG.desc");
        C6888i.m12438e("Number", "name");
        String k12 = C6888i.m12444k("java/lang/", "Number");
        String desc14 = JvmPrimitiveType.FLOAT.getDesc();
        C6888i.m12437d(desc14, "FLOAT.desc");
        C6888i.m12438e("Number", "name");
        String k13 = C6888i.m12444k("java/lang/", "Number");
        String desc15 = JvmPrimitiveType.DOUBLE.getDesc();
        C6888i.m12437d(desc15, "DOUBLE.desc");
        C6888i.m12438e("CharSequence", "name");
        String k14 = C6888i.m12444k("java/lang/", "CharSequence");
        String desc16 = jvmPrimitiveType3.getDesc();
        C6888i.m12437d(desc16, "INT.desc");
        String desc17 = JvmPrimitiveType.CHAR.getDesc();
        C6888i.m12437d(desc17, "CHAR.desc");
        Map<C6276a.C6277a, C6717d> D2 = C6790h.m12317D(new C6768j(C6276a.m11271a(aVar3, k8, "toByte", "", desc10), C6717d.m12270l("byteValue")), new C6768j(C6276a.m11271a(aVar3, k9, "toShort", "", desc11), C6717d.m12270l("shortValue")), new C6768j(C6276a.m11271a(aVar3, k10, "toInt", "", desc12), C6717d.m12270l("intValue")), new C6768j(C6276a.m11271a(aVar3, k11, "toLong", "", desc13), C6717d.m12270l("longValue")), new C6768j(C6276a.m11271a(aVar3, k12, "toFloat", "", desc14), C6717d.m12270l("floatValue")), new C6768j(C6276a.m11271a(aVar3, k13, "toDouble", "", desc15), C6717d.m12270l("doubleValue")), new C6768j(a4, C6717d.m12270l("remove")), new C6768j(C6276a.m11271a(aVar3, k14, "get", desc16, desc17), C6717d.m12270l("charAt")));
        f12350i = D2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C5266a.m9957g3(D2.size()));
        for (Map.Entry entry2 : D2.entrySet()) {
            linkedHashMap2.put(((C6276a.C6277a) entry2.getKey()).f12355b, entry2.getValue());
        }
        f12351j = linkedHashMap2;
        Set<C6276a.C6277a> keySet = f12350i.keySet();
        ArrayList arrayList6 = new ArrayList(C5266a.m9892V(keySet, 10));
        for (C6276a.C6277a aVar4 : keySet) {
            arrayList6.add(aVar4.f12354a);
        }
        f12352k = arrayList6;
        Set<Map.Entry<C6276a.C6277a, C6717d>> entrySet = f12350i.entrySet();
        ArrayList arrayList7 = new ArrayList(C5266a.m9892V(entrySet, 10));
        for (Map.Entry entry3 : entrySet) {
            arrayList7.add(new C6768j(((C6276a.C6277a) entry3.getKey()).f12354a, entry3.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator it2 = arrayList7.iterator();
        while (it2.hasNext()) {
            C6768j jVar = (C6768j) it2.next();
            C6717d dVar = (C6717d) jVar.f13682h;
            Object obj = linkedHashMap3.get(dVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap3.put(dVar, obj);
            }
            ((List) obj).add((C6717d) jVar.f13681g);
        }
        f12353l = linkedHashMap3;
    }
}
