package p005b.p096l.p175c.p177b;

import p005b.p096l.p175c.p177b.C3792o;

/* renamed from: b.l.c.b.s */
public abstract class C3797s<E> extends C3760a0<C3792o.C3793a<E>> {
    public void clear() {
        mo15176d().clear();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof C3792o.C3793a)) {
            return false;
        }
        C3792o.C3793a aVar = (C3792o.C3793a) obj;
        return aVar.getCount() > 0 && mo15176d().mo15141S(aVar.mo15201d()) == aVar.getCount();
    }

    /* renamed from: d */
    public abstract C3792o<E> mo15176d();

    public boolean remove(Object obj) {
        if (obj instanceof C3792o.C3793a) {
            C3792o.C3793a aVar = (C3792o.C3793a) obj;
            Object d = aVar.mo15201d();
            int count = aVar.getCount();
            if (count != 0) {
                return mo15176d().mo15140D(d, count, 0);
            }
        }
        return false;
    }
}
