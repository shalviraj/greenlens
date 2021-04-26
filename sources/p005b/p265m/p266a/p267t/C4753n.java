package p005b.p265m.p266a.p267t;

import java.util.Comparator;
import p005b.p265m.p266a.C4729r;

/* renamed from: b.m.a.t.n */
public class C4753n implements Comparator<C4729r> {

    /* renamed from: g */
    public final /* synthetic */ C4729r f9101g;

    /* renamed from: h */
    public final /* synthetic */ C4754o f9102h;

    public C4753n(C4754o oVar, C4729r rVar) {
        this.f9102h = oVar;
        this.f9101g = rVar;
    }

    public int compare(Object obj, Object obj2) {
        return Float.compare(this.f9102h.mo16481a((C4729r) obj2, this.f9101g), this.f9102h.mo16481a((C4729r) obj, this.f9101g));
    }
}
