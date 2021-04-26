package p005b.p096l.p175c.p177b;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: b.l.c.b.v */
public final class C3800v extends C3801w<Comparable> implements Serializable {

    /* renamed from: g */
    public static final C3800v f7009g = new C3800v();

    /* renamed from: a */
    public <S extends Comparable> C3801w<S> mo15315a() {
        return C3803y.f7013g;
    }

    public int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        Objects.requireNonNull(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
