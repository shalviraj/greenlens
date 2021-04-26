package p005b.p096l.p175c.p177b;

import java.io.Serializable;

/* renamed from: b.l.c.b.z */
public final class C3804z<T> extends C3801w<T> implements Serializable {

    /* renamed from: g */
    public final C3801w<? super T> f7014g;

    public C3804z(C3801w<? super T> wVar) {
        this.f7014g = wVar;
    }

    /* renamed from: a */
    public <S extends T> C3801w<S> mo15315a() {
        return this.f7014g;
    }

    public int compare(T t, T t2) {
        return this.f7014g.compare(t2, t);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3804z) {
            return this.f7014g.equals(((C3804z) obj).f7014g);
        }
        return false;
    }

    public int hashCode() {
        return -this.f7014g.hashCode();
    }

    public String toString() {
        return this.f7014g + ".reverse()";
    }
}
