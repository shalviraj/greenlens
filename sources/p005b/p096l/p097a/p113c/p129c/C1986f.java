package p005b.p096l.p097a.p113c.p129c;

import java.util.Iterator;
import p005b.p096l.p097a.p113c.p129c.C1978a;

/* renamed from: b.l.a.c.c.f */
public final class C1986f implements C1985e<T> {

    /* renamed from: a */
    public final /* synthetic */ C1978a f3549a;

    public C1986f(C1978a aVar) {
        this.f3549a = aVar;
    }

    /* renamed from: a */
    public final void mo12306a(T t) {
        C1978a aVar = this.f3549a;
        aVar.f3544a = t;
        Iterator it = aVar.f3546c.iterator();
        while (it.hasNext()) {
            ((C1978a.C1979a) it.next()).mo12305a(this.f3549a.f3544a);
        }
        this.f3549a.f3546c.clear();
        this.f3549a.f3545b = null;
    }
}
