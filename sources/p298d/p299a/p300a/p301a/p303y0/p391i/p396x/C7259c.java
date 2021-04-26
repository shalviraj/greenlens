package p298d.p299a.p300a.p301a.p303y0.p391i.p396x;

import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7623b;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6901v;

/* renamed from: d.a.a.a.y0.i.x.c */
public final class C7259c extends C7623b<C6023b, C6023b> {

    /* renamed from: a */
    public final /* synthetic */ C6901v<C6023b> f14479a;

    /* renamed from: b */
    public final /* synthetic */ C6862l<C6023b, Boolean> f14480b;

    public C7259c(C6901v<C6023b> vVar, C6862l<? super C6023b, Boolean> lVar) {
        this.f14479a = vVar;
        this.f14480b = lVar;
    }

    public void afterChildren(Object obj) {
        T t = (C6023b) obj;
        C6888i.m12438e(t, "current");
        if (this.f14479a.f13801g == null && this.f14480b.invoke(t).booleanValue()) {
            this.f14479a.f13801g = t;
        }
    }

    public boolean beforeChildren(Object obj) {
        C6888i.m12438e((C6023b) obj, "current");
        return this.f14479a.f13801g == null;
    }

    public Object result() {
        return (C6023b) this.f14479a.f13801g;
    }
}
