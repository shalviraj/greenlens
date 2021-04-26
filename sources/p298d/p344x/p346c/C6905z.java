package p298d.p344x.p346c;

import java.util.Set;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.p347a0.C6875a;
import p298d.p344x.p346c.p347a0.C6878d;

/* renamed from: d.x.c.z */
public class C6905z {
    /* renamed from: a */
    public static Set m12472a(Object obj) {
        if (!(obj instanceof C6875a) || (obj instanceof C6878d)) {
            try {
                return (Set) obj;
            } catch (ClassCastException e) {
                C6888i.m12443j(e, C6905z.class.getName());
                throw e;
            }
        } else {
            m12474c(obj, "kotlin.collections.MutableSet");
            throw null;
        }
    }

    /* renamed from: b */
    public static Object m12473b(Object obj, int i) {
        boolean z = true;
        if ((obj instanceof C6885f ? ((C6885f) obj).getArity() : obj instanceof C6851a ? 0 : obj instanceof C6862l ? 1 : 2) != i) {
            z = false;
        }
        if (z) {
            return obj;
        }
        m12474c(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    /* renamed from: c */
    public static void m12474c(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(C0843a.m452m(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        C6888i.m12443j(classCastException, C6905z.class.getName());
        throw classCastException;
    }
}
