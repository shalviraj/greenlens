package p298d.p336u;

import java.util.Comparator;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.u.a */
public final class C6818a implements Comparator<Comparable<? super Object>> {

    /* renamed from: g */
    public static final C6818a f13743g = new C6818a();

    public int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        C6888i.m12438e(comparable, "a");
        C6888i.m12438e(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    public final Comparator<Comparable<Object>> reversed() {
        return C6819b.f13744g;
    }
}
