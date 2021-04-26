package p005b.p096l.p175c.p177b;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

/* renamed from: b.l.c.b.g */
public final class C3773g<T> extends C3801w<T> implements Serializable {

    /* renamed from: g */
    public final Comparator<T> f6960g;

    public C3773g(Comparator<T> comparator) {
        Objects.requireNonNull(comparator);
        this.f6960g = comparator;
    }

    public int compare(T t, T t2) {
        return this.f6960g.compare(t, t2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3773g) {
            return this.f6960g.equals(((C3773g) obj).f6960g);
        }
        return false;
    }

    public int hashCode() {
        return this.f6960g.hashCode();
    }

    public String toString() {
        return this.f6960g.toString();
    }
}
