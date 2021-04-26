package p005b.p096l.p175c.p177b;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import p005b.p096l.p175c.p177b.C3792o;

/* renamed from: b.l.c.b.c */
public abstract class C3763c<E> extends AbstractCollection<E> implements C3792o<E> {

    /* renamed from: g */
    public transient Set<E> f6946g;

    /* renamed from: h */
    public transient Set<C3792o.C3793a<E>> f6947h;

    /* renamed from: b.l.c.b.c$a */
    public class C3764a extends C3796r<E> {
        public C3764a() {
        }

        /* renamed from: d */
        public C3792o<E> mo15174d() {
            return C3763c.this;
        }

        public Iterator<E> iterator() {
            return C3763c.this.mo15146l();
        }
    }

    /* renamed from: b.l.c.b.c$b */
    public class C3765b extends C3797s<E> {
        public C3765b() {
        }

        /* renamed from: d */
        public C3792o<E> mo15176d() {
            return C3763c.this;
        }

        public Iterator<C3792o.C3793a<E>> iterator() {
            return C3763c.this.mo15148q();
        }

        public int size() {
            return C3763c.this.mo15143e();
        }
    }

    public final boolean add(E e) {
        mo15147o(e, 1);
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        Objects.requireNonNull(collection);
        boolean z = false;
        if (collection instanceof C3792o) {
            C3792o oVar = (C3792o) collection;
            if (oVar instanceof C3761b) {
                if (((C3761b) oVar).isEmpty()) {
                    return false;
                }
                throw null;
            } else if (oVar.isEmpty()) {
                return false;
            } else {
                for (C3792o.C3793a aVar : oVar.entrySet()) {
                    mo15147o(aVar.mo15201d(), aVar.getCount());
                }
                return true;
            }
        } else if (collection.isEmpty()) {
            return false;
        } else {
            Iterator<? extends E> it = collection.iterator();
            Objects.requireNonNull(it);
            while (it.hasNext()) {
                add(it.next());
                z |= true;
            }
            return z;
        }
    }

    /* renamed from: c */
    public Set<E> mo15163c() {
        Set<E> set = this.f6946g;
        if (set != null) {
            return set;
        }
        Set<E> d = mo15165d();
        this.f6946g = d;
        return d;
    }

    public boolean contains(Object obj) {
        return mo15141S(obj) > 0;
    }

    /* renamed from: d */
    public Set<E> mo15165d() {
        return new C3764a();
    }

    /* renamed from: e */
    public abstract int mo15143e();

    public Set<C3792o.C3793a<E>> entrySet() {
        Set<C3792o.C3793a<E>> set = this.f6947h;
        if (set != null) {
            return set;
        }
        C3765b bVar = new C3765b();
        this.f6947h = bVar;
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3792o) {
            C3792o oVar = (C3792o) obj;
            if (size() == oVar.size() && entrySet().size() == oVar.entrySet().size()) {
                for (C3792o.C3793a aVar : oVar.entrySet()) {
                    if (mo15141S(aVar.mo15201d()) != aVar.getCount()) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return entrySet().hashCode();
    }

    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    /* renamed from: k */
    public abstract int mo15145k(Object obj, int i);

    /* renamed from: l */
    public abstract Iterator<E> mo15146l();

    /* renamed from: o */
    public abstract int mo15147o(E e, int i);

    /* renamed from: q */
    public abstract Iterator<C3792o.C3793a<E>> mo15148q();

    public final boolean remove(Object obj) {
        return mo15145k(obj, 1) > 0;
    }

    public final boolean removeAll(Collection<?> collection) {
        if (collection instanceof C3792o) {
            collection = ((C3792o) collection).mo15163c();
        }
        return mo15163c().removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof C3792o) {
            collection = ((C3792o) collection).mo15163c();
        }
        return mo15163c().retainAll(collection);
    }

    public final String toString() {
        return entrySet().toString();
    }
}
