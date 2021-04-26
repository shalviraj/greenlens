package p005b.p096l.p175c.p177b;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: b.l.c.b.y */
public final class C3803y extends C3801w<Comparable> implements Serializable {

    /* renamed from: g */
    public static final C3803y f7013g = new C3803y();

    /* renamed from: a */
    public <S extends Comparable> C3801w<S> mo15315a() {
        return C3800v.f7009g;
    }

    public int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
