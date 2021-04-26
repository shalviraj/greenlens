package p005b.p096l.p097a.p113c.p145h.p147b;

import java.util.Iterator;

/* renamed from: b.l.a.c.h.b.p */
public final class C3276p implements Iterator<String> {

    /* renamed from: g */
    public final Iterator<String> f5824g;

    /* renamed from: h */
    public final /* synthetic */ C3287q f5825h;

    public C3276p(C3287q qVar) {
        this.f5825h = qVar;
        this.f5824g = qVar.f5876g.keySet().iterator();
    }

    /* renamed from: b */
    public final String next() {
        return this.f5824g.next();
    }

    public final boolean hasNext() {
        return this.f5824g.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
