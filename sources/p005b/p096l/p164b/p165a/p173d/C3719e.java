package p005b.p096l.p164b.p165a.p173d;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.b.a.d.e */
public final class C3719e {

    /* renamed from: d */
    public static final ConcurrentMap<Class<?>, C3719e> f6866d = new ConcurrentHashMap();

    /* renamed from: e */
    public static final ConcurrentMap<Class<?>, C3719e> f6867e = new ConcurrentHashMap();

    /* renamed from: a */
    public final boolean f6868a;

    /* renamed from: b */
    public final IdentityHashMap<String, C3729j> f6869b = new IdentityHashMap<>();

    /* renamed from: c */
    public final List<String> f6870c;

    /* renamed from: b.l.b.a.d.e$a */
    public class C3720a implements Comparator<String> {
        public C3720a(C3719e eVar) {
        }

        public int compare(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            if (C1960d.m2725K(str, str2)) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return str.compareTo(str2);
        }
    }

    public C3719e(Class<?> cls, boolean z) {
        Field field;
        this.f6868a = z;
        C1960d.m2833p(!z || !cls.isEnum(), "cannot ignore case on an enum: " + cls);
        TreeSet treeSet = new TreeSet(new C3720a(this));
        for (Field field2 : cls.getDeclaredFields()) {
            C3729j d = C3729j.m7032d(field2);
            if (d != null) {
                String str = d.f6907d;
                str = z ? str.toLowerCase(Locale.US).intern() : str;
                C3729j jVar = this.f6869b.get(str);
                boolean z2 = jVar == null;
                Object[] objArr = new Object[4];
                objArr[0] = z ? "case-insensitive " : "";
                objArr[1] = str;
                objArr[2] = field2;
                if (jVar == null) {
                    field = null;
                } else {
                    field = jVar.f6905b;
                }
                objArr[3] = field;
                C1960d.m2845s(z2, "two fields have the same %sname <%s>: %s and %s", objArr);
                this.f6869b.put(str, d);
                treeSet.add(str);
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            C3719e c = m7014c(superclass, z);
            treeSet.addAll(c.f6870c);
            for (Map.Entry next : c.f6869b.entrySet()) {
                String str2 = (String) next.getKey();
                if (!this.f6869b.containsKey(str2)) {
                    this.f6869b.put(str2, next.getValue());
                }
            }
        }
        this.f6870c = treeSet.isEmpty() ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(treeSet));
    }

    /* renamed from: b */
    public static C3719e m7013b(Class<?> cls) {
        return m7014c(cls, false);
    }

    /* renamed from: c */
    public static C3719e m7014c(Class<?> cls, boolean z) {
        if (cls == null) {
            return null;
        }
        ConcurrentMap<Class<?>, C3719e> concurrentMap = z ? f6867e : f6866d;
        C3719e eVar = (C3719e) concurrentMap.get(cls);
        if (eVar != null) {
            return eVar;
        }
        C3719e eVar2 = new C3719e(cls, z);
        C3719e putIfAbsent = concurrentMap.putIfAbsent(cls, eVar2);
        return putIfAbsent == null ? eVar2 : putIfAbsent;
    }

    /* renamed from: a */
    public C3729j mo15076a(String str) {
        if (str != null) {
            if (this.f6868a) {
                str = str.toLowerCase(Locale.US);
            }
            str = str.intern();
        }
        return this.f6869b.get(str);
    }
}
