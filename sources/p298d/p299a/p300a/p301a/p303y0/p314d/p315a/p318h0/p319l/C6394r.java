package p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p319l;

import java.util.Collection;
import java.util.Set;
import p298d.C6777r;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6046e;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7623b;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.d.a.h0.l.r */
public final class C6394r extends C7623b<C6046e, C6777r> {

    /* renamed from: a */
    public final /* synthetic */ C6046e f12601a;

    /* renamed from: b */
    public final /* synthetic */ Set<R> f12602b;

    /* renamed from: c */
    public final /* synthetic */ C6862l<C7277h, Collection<R>> f12603c;

    public C6394r(C6046e eVar, Set<R> set, C6862l<? super C7277h, ? extends Collection<? extends R>> lVar) {
        this.f12601a = eVar;
        this.f12602b = set;
        this.f12603c = lVar;
    }

    public boolean beforeChildren(Object obj) {
        C6046e eVar = (C6046e) obj;
        C6888i.m12438e(eVar, "current");
        if (eVar == this.f12601a) {
            return true;
        }
        C7277h staticScope = eVar.getStaticScope();
        C6888i.m12437d(staticScope, "current.staticScope");
        if (!(staticScope instanceof C6395s)) {
            return true;
        }
        this.f12602b.addAll(this.f12603c.invoke(staticScope));
        return false;
    }

    public Object result() {
        return C6777r.f13694a;
    }
}
