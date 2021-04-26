package p298d.p334t;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.C6768j;
import p298d.p333a0.C6758d;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p414b0.C7668h;

/* renamed from: d.t.h */
public class C6790h extends C6788f {
    /* renamed from: A */
    public static final <T> List<T> m12314A(T... tArr) {
        C6888i.m12438e(tArr, "elements");
        return tArr.length > 0 ? m12344c(tArr) : C6798p.f13713g;
    }

    /* renamed from: B */
    public static final <T> List<T> m12315B(T t) {
        return t != null ? C5266a.m9910Y2(t) : C6798p.f13713g;
    }

    /* renamed from: C */
    public static final <T> List<T> m12316C(T... tArr) {
        C6888i.m12438e(tArr, "elements");
        C6888i.m12438e(tArr, "$this$filterNotNull");
        ArrayList arrayList = new ArrayList();
        C6888i.m12438e(tArr, "$this$filterNotNullTo");
        C6888i.m12438e(arrayList, "destination");
        for (T t : tArr) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: D */
    public static final <K, V> Map<K, V> m12317D(C6768j<? extends K, ? extends V>... jVarArr) {
        C6888i.m12438e(jVarArr, "pairs");
        if (jVarArr.length <= 0) {
            return C6799q.f13714g;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5266a.m9957g3(jVarArr.length));
        C6888i.m12438e(jVarArr, "$this$toMap");
        C6888i.m12438e(linkedHashMap, "destination");
        m12326M(linkedHashMap, jVarArr);
        return linkedHashMap;
    }

    /* renamed from: E */
    public static final <T> List<T> m12318E(T... tArr) {
        C6888i.m12438e(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new C6787e(tArr, true));
    }

    /* renamed from: F */
    public static final <T> List<T> m12319F(List<? extends T> list) {
        C6888i.m12438e(list, "$this$optimizeReadOnlyList");
        int size = list.size();
        return size != 0 ? size != 1 ? list : C5266a.m9910Y2(list.get(0)) : C6798p.f13713g;
    }

    /* renamed from: G */
    public static final <T> List<T> m12320G(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        C6888i.m12438e(iterable, "$this$plus");
        C6888i.m12438e(iterable2, "elements");
        if (iterable instanceof Collection) {
            return m12322I((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        m12342b(arrayList, iterable);
        m12342b(arrayList, iterable2);
        return arrayList;
    }

    /* renamed from: H */
    public static final <T> List<T> m12321H(Iterable<? extends T> iterable, T t) {
        C6888i.m12438e(iterable, "$this$plus");
        if (iterable instanceof Collection) {
            return m12323J((Collection) iterable, t);
        }
        ArrayList arrayList = new ArrayList();
        m12342b(arrayList, iterable);
        arrayList.add(t);
        return arrayList;
    }

    /* renamed from: I */
    public static final <T> List<T> m12322I(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        C6888i.m12438e(collection, "$this$plus");
        C6888i.m12438e(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        m12342b(arrayList2, iterable);
        return arrayList2;
    }

    /* renamed from: J */
    public static final <T> List<T> m12323J(Collection<? extends T> collection, T t) {
        C6888i.m12438e(collection, "$this$plus");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    /* renamed from: K */
    public static final <T> Set<T> m12324K(Set<? extends T> set, Iterable<? extends T> iterable) {
        C6888i.m12438e(set, "$this$plus");
        C6888i.m12438e(iterable, "elements");
        C6888i.m12438e(iterable, "$this$collectionSizeOrNull");
        Integer valueOf = iterable instanceof Collection ? Integer.valueOf(((Collection) iterable).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(C5266a.m9957g3(valueOf != null ? set.size() + valueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        m12342b(linkedHashSet, iterable);
        return linkedHashSet;
    }

    /* renamed from: L */
    public static final <T> Set<T> m12325L(Set<? extends T> set, T t) {
        C6888i.m12438e(set, "$this$plus");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C5266a.m9957g3(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }

    /* renamed from: M */
    public static final <K, V> void m12326M(Map<? super K, ? super V> map, C6768j<? extends K, ? extends V>[] jVarArr) {
        C6888i.m12438e(map, "$this$putAll");
        C6888i.m12438e(jVarArr, "pairs");
        for (C6768j<? extends K, ? extends V> jVar : jVarArr) {
            map.put(jVar.f13681g, jVar.f13682h);
        }
    }

    /* renamed from: N */
    public static final <T> Set<T> m12327N(T... tArr) {
        C6888i.m12438e(tArr, "elements");
        return tArr.length > 0 ? C5266a.m9781B4(tArr) : C6800r.f13715g;
    }

    /* renamed from: O */
    public static final <T> T m12328O(Iterable<? extends T> iterable) {
        C6888i.m12438e(iterable, "$this$single");
        if (iterable instanceof List) {
            return m12329P((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: P */
    public static final <T> T m12329P(List<? extends T> list) {
        C6888i.m12438e(list, "$this$single");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    /* renamed from: Q */
    public static final <T> T m12330Q(Iterable<? extends T> iterable) {
        C6888i.m12438e(iterable, "$this$singleOrNull");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    /* renamed from: R */
    public static final <T> T m12331R(List<? extends T> list) {
        C6888i.m12438e(list, "$this$singleOrNull");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* renamed from: S */
    public static final <T> List<T> m12332S(Iterable<? extends T> iterable, int i) {
        C6888i.m12438e(iterable, "$this$take");
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(C0843a.m445f("Requested element count ", i, " is less than zero.").toString());
        } else if (i == 0) {
            return C6798p.f13713g;
        } else {
            if (i >= ((Collection) iterable).size()) {
                return m12337X(iterable);
            }
            if (i == 1) {
                return C5266a.m9910Y2(m12360n(iterable));
            }
            ArrayList arrayList = new ArrayList(i);
            for (Object add : iterable) {
                arrayList.add(add);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return m12319F(arrayList);
        }
    }

    /* renamed from: T */
    public static final void m12333T() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* renamed from: U */
    public static final <T, C extends Collection<? super T>> C m12334U(Iterable<? extends T> iterable, C c) {
        C6888i.m12438e(iterable, "$this$toCollection");
        C6888i.m12438e(c, "destination");
        for (Object add : iterable) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: V */
    public static final <T> HashSet<T> m12335V(Iterable<? extends T> iterable) {
        C6888i.m12438e(iterable, "$this$toHashSet");
        HashSet<T> hashSet = new HashSet<>(C5266a.m9957g3(C5266a.m9892V(iterable, 12)));
        m12334U(iterable, hashSet);
        return hashSet;
    }

    /* renamed from: W */
    public static final int[] m12336W(Collection<Integer> collection) {
        C6888i.m12438e(collection, "$this$toIntArray");
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Integer intValue : collection) {
            iArr[i] = intValue.intValue();
            i++;
        }
        return iArr;
    }

    /* renamed from: X */
    public static final <T> List<T> m12337X(Iterable<? extends T> iterable) {
        C6888i.m12438e(iterable, "$this$toList");
        if (!(iterable instanceof Collection)) {
            return m12319F(m12341a0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C6798p.f13713g;
        }
        if (size != 1) {
            return m12343b0(collection);
        }
        return C5266a.m9910Y2(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* renamed from: Y */
    public static final <K, V> Map<K, V> m12338Y(Iterable<? extends C6768j<? extends K, ? extends V>> iterable) {
        C6888i.m12438e(iterable, "$this$toMap");
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C6799q.f13714g;
        }
        if (size == 1) {
            return C5266a.m9963h3((C6768j) ((List) iterable).get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5266a.m9957g3(collection.size()));
        m12339Z(iterable, linkedHashMap);
        return linkedHashMap;
    }

    /* renamed from: Z */
    public static final <K, V, M extends Map<? super K, ? super V>> M m12339Z(Iterable<? extends C6768j<? extends K, ? extends V>> iterable, M m) {
        C6888i.m12438e(iterable, "$this$toMap");
        C6888i.m12438e(m, "destination");
        C6888i.m12438e(m, "$this$putAll");
        C6888i.m12438e(iterable, "pairs");
        for (C6768j jVar : iterable) {
            m.put(jVar.f13681g, jVar.f13682h);
        }
        return m;
    }

    /* renamed from: a */
    public static final int m12340a(List list, int i) {
        int r = m12364r(list);
        if (i >= 0 && r >= i) {
            return m12364r(list) - i;
        }
        StringBuilder v = C0843a.m461v("Element index ", i, " must be in range [");
        v.append(new C6758d(0, m12364r(list)));
        v.append("].");
        throw new IndexOutOfBoundsException(v.toString());
    }

    /* renamed from: a0 */
    public static final <T> List<T> m12341a0(Iterable<? extends T> iterable) {
        C6888i.m12438e(iterable, "$this$toMutableList");
        if (iterable instanceof Collection) {
            return m12343b0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m12334U(iterable, arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public static final <T> boolean m12342b(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C6888i.m12438e(collection, "$this$addAll");
        C6888i.m12438e(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b0 */
    public static final <T> List<T> m12343b0(Collection<? extends T> collection) {
        C6888i.m12438e(collection, "$this$toMutableList");
        return new ArrayList(collection);
    }

    /* renamed from: c */
    public static final <T> List<T> m12344c(T[] tArr) {
        C6888i.m12438e(tArr, "$this$asList");
        List<T> asList = Arrays.asList(tArr);
        C6888i.m12437d(asList, "ArraysUtilJVM.asList(this)");
        return asList;
    }

    /* renamed from: c0 */
    public static final <K, V> Map<K, V> m12345c0(Map<? extends K, ? extends V> map) {
        C6888i.m12438e(map, "$this$toMutableMap");
        return new LinkedHashMap(map);
    }

    /* renamed from: d */
    public static final <T> C7668h<T> m12346d(Iterable<? extends T> iterable) {
        C6888i.m12438e(iterable, "$this$asSequence");
        return new C6795m(iterable);
    }

    /* renamed from: d0 */
    public static final <T> Set<T> m12347d0(Iterable<? extends T> iterable) {
        C6888i.m12438e(iterable, "$this$toMutableSet");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m12334U(iterable, linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: e */
    public static final <T> boolean m12348e(Iterable<? extends T> iterable, T t) {
        int i;
        C6888i.m12438e(iterable, "$this$contains");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        C6888i.m12438e(iterable, "$this$indexOf");
        if (!(iterable instanceof List)) {
            Iterator<? extends T> it = iterable.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if (i2 < 0) {
                    m12333T();
                    throw null;
                } else if (C6888i.m12434a(t, next)) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
        } else {
            i = ((List) iterable).indexOf(t);
        }
        return i >= 0;
    }

    /* renamed from: e0 */
    public static final <T> Set<T> m12349e0(Iterable<? extends T> iterable) {
        C6888i.m12438e(iterable, "$this$toSet");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return C6800r.f13715g;
            }
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(C5266a.m9957g3(collection.size()));
                m12334U(iterable, linkedHashSet);
                return linkedHashSet;
            }
            return C5266a.m9891U3(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        m12334U(iterable, linkedHashSet2);
        Set<T> set = linkedHashSet2;
        C6888i.m12438e(set, "$this$optimizeReadOnlySet");
        int size2 = set.size();
        if (size2 != 0) {
            return size2 != 1 ? set : C5266a.m9891U3(set.iterator().next());
        }
        return C6800r.f13715g;
    }

    /* renamed from: f */
    public static final byte[] m12350f(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        C6888i.m12438e(bArr, "$this$copyInto");
        C6888i.m12438e(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    /* renamed from: f0 */
    public static final <T> Iterable<C6801s<T>> m12351f0(Iterable<? extends T> iterable) {
        C6888i.m12438e(iterable, "$this$withIndex");
        return new C6802t(new C6796n(iterable));
    }

    /* renamed from: g */
    public static /* synthetic */ byte[] m12352g(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = bArr.length;
        }
        m12350f(bArr, bArr2, i, i2, i3);
        return bArr2;
    }

    /* renamed from: g0 */
    public static final <T, R> List<C6768j<T, R>> m12353g0(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        C6888i.m12438e(iterable, "$this$zip");
        C6888i.m12438e(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C5266a.m9892V(iterable, 10), C5266a.m9892V(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new C6768j(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* renamed from: h */
    public static Object[] m12354h(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        C6888i.m12438e(objArr, "$this$copyInto");
        C6888i.m12438e(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
        return objArr2;
    }

    /* renamed from: i */
    public static final <T> T[] m12355i(T[] tArr, int i, int i2) {
        C6888i.m12438e(tArr, "$this$copyOfRangeImpl");
        C5266a.m9966i0(i2, tArr.length);
        T[] copyOfRange = Arrays.copyOfRange(tArr, i, i2);
        C6888i.m12437d(copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
        return copyOfRange;
    }

    /* renamed from: j */
    public static final <T> List<T> m12356j(Iterable<? extends T> iterable) {
        C6888i.m12438e(iterable, "$this$distinct");
        return m12337X(m12347d0(iterable));
    }

    /* renamed from: k */
    public static final <T> List<T> m12357k(Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        C6888i.m12438e(iterable, "$this$drop");
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(C0843a.m445f("Requested element count ", i, " is less than zero.").toString());
        } else if (i == 0) {
            return m12337X(iterable);
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i;
                if (size <= 0) {
                    return C6798p.f13713g;
                }
                if (size == 1) {
                    return C5266a.m9910Y2(m12370x(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        int size2 = collection.size();
                        while (i < size2) {
                            arrayList.add(((List) iterable).get(i));
                            i++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            for (Object next : iterable) {
                if (i2 >= i) {
                    arrayList.add(next);
                } else {
                    i2++;
                }
            }
            return m12319F(arrayList);
        }
    }

    /* renamed from: l */
    public static final <T> List<T> m12358l(List<? extends T> list, int i) {
        C6888i.m12438e(list, "$this$dropLast");
        int i2 = 0;
        if (i >= 0) {
            int size = list.size() - i;
            if (size >= 0) {
                i2 = size;
            }
            return m12332S(list, i2);
        }
        throw new IllegalArgumentException(C0843a.m445f("Requested element count ", i, " is less than zero.").toString());
    }

    /* renamed from: m */
    public static final <T> List<T> m12359m(Iterable<? extends T> iterable, C6862l<? super T, Boolean> lVar) {
        C6888i.m12438e(iterable, "$this$filter");
        C6888i.m12438e(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (lVar.invoke(next).booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: n */
    public static final <T> T m12360n(Iterable<? extends T> iterable) {
        C6888i.m12438e(iterable, "$this$first");
        if (iterable instanceof List) {
            return m12361o((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: o */
    public static final <T> T m12361o(List<? extends T> list) {
        C6888i.m12438e(list, "$this$first");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: p */
    public static final <T> T m12362p(Iterable<? extends T> iterable) {
        C6888i.m12438e(iterable, "$this$firstOrNull");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    /* renamed from: q */
    public static final <T> T m12363q(List<? extends T> list) {
        C6888i.m12438e(list, "$this$firstOrNull");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: r */
    public static final <T> int m12364r(List<? extends T> list) {
        C6888i.m12438e(list, "$this$lastIndex");
        return list.size() - 1;
    }

    /* renamed from: s */
    public static final <T> T m12365s(List<? extends T> list, int i) {
        C6888i.m12438e(list, "$this$getOrNull");
        if (i < 0 || i > m12364r(list)) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: t */
    public static final <T, A extends Appendable> A m12366t(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C6862l<? super T, ? extends CharSequence> lVar) {
        C6888i.m12438e(iterable, "$this$joinTo");
        C6888i.m12438e(a, "buffer");
        C6888i.m12438e(charSequence, "separator");
        C6888i.m12438e(charSequence2, "prefix");
        C6888i.m12438e(charSequence3, "postfix");
        C6888i.m12438e(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C5266a.m10013q(a, next, lVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: u */
    public static /* synthetic */ Appendable m12367u(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C6862l lVar, int i2) {
        m12366t(iterable, appendable, (i2 & 2) != 0 ? ", " : charSequence, (i2 & 4) != 0 ? "" : charSequence2, (i2 & 8) != 0 ? "" : charSequence3, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? "..." : null, (i2 & 64) != 0 ? null : lVar);
        return appendable;
    }

    /* renamed from: v */
    public static final <T> String m12368v(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C6862l<? super T, ? extends CharSequence> lVar) {
        C6888i.m12438e(iterable, "$this$joinToString");
        C6888i.m12438e(charSequence, "separator");
        C6888i.m12438e(charSequence2, "prefix");
        C6888i.m12438e(charSequence3, "postfix");
        C6888i.m12438e(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        m12366t(iterable, sb, charSequence, charSequence2, charSequence3, i, charSequence4, lVar);
        String sb2 = sb.toString();
        C6888i.m12437d(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: w */
    public static /* synthetic */ String m12369w(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C6862l lVar, int i2) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = charSequence;
        String str = (i2 & 2) != 0 ? "" : charSequence2;
        String str2 = (i2 & 4) != 0 ? "" : charSequence3;
        if ((i2 & 8) != 0) {
            i = -1;
        }
        return m12368v(iterable, charSequence5, str, str2, i, (i2 & 16) != 0 ? "..." : null, (i2 & 32) != 0 ? null : lVar);
    }

    /* renamed from: x */
    public static final <T> T m12370x(Iterable<? extends T> iterable) {
        T next;
        C6888i.m12438e(iterable, "$this$last");
        if (iterable instanceof List) {
            return m12371y((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: y */
    public static final <T> T m12371y(List<? extends T> list) {
        C6888i.m12438e(list, "$this$last");
        if (!list.isEmpty()) {
            return list.get(m12364r(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: z */
    public static final <T> T m12372z(List<? extends T> list) {
        C6888i.m12438e(list, "$this$lastOrNull");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }
}
