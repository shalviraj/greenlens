package p298d.p336u;

import java.util.Comparator;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.u.b */
public final class C6819b implements Comparator<Comparable<? super Object>> {

    /* renamed from: g */
    public static final C6819b f13744g = new C6819b();

    public int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        C6888i.m12438e(comparable, "a");
        C6888i.m12438e(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    public final Comparator<Comparable<Object>> reversed() {
        return C6818a.f13743g;
    }
}
