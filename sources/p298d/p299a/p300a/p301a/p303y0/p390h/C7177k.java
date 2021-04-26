package p298d.p299a.p300a.p301a.p303y0.p390h;

import p298d.p299a.C6736l;
import p298d.p344x.p346c.C6888i;
import p298d.p348y.C6906a;

/* renamed from: d.a.a.a.y0.h.k */
public final class C7177k extends C6906a<T> {

    /* renamed from: b */
    public final /* synthetic */ Object f14388b;

    /* renamed from: c */
    public final /* synthetic */ C7174j f14389c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7177k(Object obj, Object obj2, C7174j jVar) {
        super(obj2);
        this.f14388b = obj;
        this.f14389c = jVar;
    }

    /* renamed from: c */
    public boolean mo24212c(C6736l<?> lVar, T t, T t2) {
        C6888i.m12438e(lVar, "property");
        if (!this.f14389c.f14360a) {
            return true;
        }
        throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
    }
}
