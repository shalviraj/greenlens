package p005b.p096l.p175c.p177b;

import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import p005b.p096l.p175c.p177b.C3792o;

/* renamed from: b.l.c.b.i */
public abstract class C3783i<E> extends C3786k<E> implements C3762b0<E> {

    /* renamed from: g */
    public transient Comparator<? super E> f6985g;

    /* renamed from: h */
    public transient NavigableSet<E> f6986h;

    /* renamed from: i */
    public transient Set<C3792o.C3793a<E>> f6987i;

    /* renamed from: C */
    public C3792o.C3793a<E> mo15150C() {
        return ((C3767d) this).f6951j.mo15160y();
    }

    /* renamed from: O */
    public C3762b0<E> mo15151O(E e, C3771f fVar) {
        return ((C3769e) ((C3774g0) ((C3767d) this).f6951j).mo15156m(e, fVar)).mo15158s();
    }

    /* renamed from: Q */
    public C3762b0<E> mo15152Q(E e, C3771f fVar, E e2, C3771f fVar2) {
        return ((C3769e) ((C3767d) this).f6951j.mo15152Q(e2, fVar2, e, fVar)).mo15158s();
    }

    /* renamed from: c */
    public NavigableSet<E> m7144c() {
        NavigableSet<E> navigableSet = this.f6986h;
        if (navigableSet != null) {
            return navigableSet;
        }
        C3768d0 d0Var = new C3768d0(this);
        this.f6986h = d0Var;
        return d0Var;
    }

    public Comparator<? super E> comparator() {
        Comparator<? super E> comparator = this.f6985g;
        if (comparator != null) {
            return comparator;
        }
        Comparator<? super E> comparator2 = ((C3767d) this).f6951j.f6952i;
        C3801w a = (comparator2 instanceof C3801w ? (C3801w) comparator2 : new C3773g(comparator2)).mo15315a();
        this.f6985g = a;
        return a;
    }

    /* renamed from: d */
    public C3792o<E> mo15243d() {
        return ((C3767d) this).f6951j;
    }

    public Set<C3792o.C3793a<E>> entrySet() {
        Set<C3792o.C3793a<E>> set = this.f6987i;
        if (set != null) {
            return set;
        }
        C3781h hVar = new C3781h(this);
        this.f6987i = hVar;
        return hVar;
    }

    /* renamed from: m */
    public C3762b0<E> mo15156m(E e, C3771f fVar) {
        return ((C3769e) ((C3774g0) ((C3767d) this).f6951j).mo15151O(e, fVar)).mo15158s();
    }

    /* renamed from: p */
    public C3792o.C3793a<E> mo15157p() {
        return ((C3767d) this).f6951j.mo15159x();
    }

    /* renamed from: s */
    public C3762b0<E> mo15158s() {
        return ((C3767d) this).f6951j;
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    public String toString() {
        return entrySet().toString();
    }

    /* renamed from: x */
    public C3792o.C3793a<E> mo15159x() {
        return ((C3767d) this).f6951j.mo15157p();
    }

    /* renamed from: y */
    public C3792o.C3793a<E> mo15160y() {
        return ((C3767d) this).f6951j.mo15150C();
    }

    public <T> T[] toArray(T[] tArr) {
        int size = size();
        if (tArr.length < size) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), size);
        }
        Iterator it = ((C3767d) this).iterator();
        int i = 0;
        while (it.hasNext()) {
            tArr[i] = it.next();
            i++;
        }
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }
}
