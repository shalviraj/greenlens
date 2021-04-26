package p298d.p299a.p300a.p301a.p303y0.p314d.p315a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6714b;

/* renamed from: d.a.a.a.y0.d.a.p */
public final class C6508p {

    /* renamed from: a */
    public static final C6508p f12753a = null;

    /* renamed from: b */
    public static final HashMap<C6714b, C6714b> f12754b = new HashMap<>();

    static {
        m11528b(StandardNames.FqNames.mutableList, m11527a("java.util.ArrayList", "java.util.LinkedList"));
        m11528b(StandardNames.FqNames.mutableSet, m11527a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        m11528b(StandardNames.FqNames.mutableMap, m11527a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        m11528b(new C6714b("java.util.function.Function"), m11527a("java.util.function.UnaryOperator"));
        m11528b(new C6714b("java.util.function.BiFunction"), m11527a("java.util.function.BinaryOperator"));
    }

    /* renamed from: a */
    public static final List<C6714b> m11527a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String bVar : strArr) {
            arrayList.add(new C6714b(bVar));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final void m11528b(C6714b bVar, List<C6714b> list) {
        HashMap<C6714b, C6714b> hashMap = f12754b;
        for (T next : list) {
            C6714b bVar2 = (C6714b) next;
            hashMap.put(next, bVar);
        }
    }
}
