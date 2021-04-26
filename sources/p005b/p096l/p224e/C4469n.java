package p005b.p096l.p224e;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: b.l.e.n */
public final class C4469n extends C4472q implements Iterable<C4472q> {

    /* renamed from: g */
    public final List<C4472q> f8317g = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C4469n) && ((C4469n) obj).f8317g.equals(this.f8317g));
    }

    public int hashCode() {
        return this.f8317g.hashCode();
    }

    public Iterator<C4472q> iterator() {
        return this.f8317g.iterator();
    }

    /* renamed from: n */
    public long mo16133n() {
        if (this.f8317g.size() == 1) {
            return this.f8317g.get(0).mo16133n();
        }
        throw new IllegalStateException();
    }

    /* renamed from: q */
    public String mo16134q() {
        if (this.f8317g.size() == 1) {
            return this.f8317g.get(0).mo16134q();
        }
        throw new IllegalStateException();
    }
}
