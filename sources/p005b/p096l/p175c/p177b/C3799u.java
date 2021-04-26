package p005b.p096l.p175c.p177b;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p175c.p177b.C3792o;

/* renamed from: b.l.c.b.u */
public final class C3799u<E> implements Iterator<E> {

    /* renamed from: g */
    public final C3792o<E> f7003g;

    /* renamed from: h */
    public final Iterator<C3792o.C3793a<E>> f7004h;

    /* renamed from: i */
    public C3792o.C3793a<E> f7005i;

    /* renamed from: j */
    public int f7006j;

    /* renamed from: k */
    public int f7007k;

    /* renamed from: l */
    public boolean f7008l;

    public C3799u(C3792o<E> oVar, Iterator<C3792o.C3793a<E>> it) {
        this.f7003g = oVar;
        this.f7004h = it;
    }

    public boolean hasNext() {
        return this.f7006j > 0 || this.f7004h.hasNext();
    }

    public E next() {
        if (hasNext()) {
            if (this.f7006j == 0) {
                C3792o.C3793a<E> next = this.f7004h.next();
                this.f7005i = next;
                int count = next.getCount();
                this.f7006j = count;
                this.f7007k = count;
            }
            this.f7006j--;
            this.f7008l = true;
            return this.f7005i.mo15201d();
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        C1960d.m2873z(this.f7008l);
        if (this.f7007k == 1) {
            this.f7004h.remove();
        } else {
            this.f7003g.remove(this.f7005i.mo15201d());
        }
        this.f7007k--;
        this.f7008l = false;
    }
}
