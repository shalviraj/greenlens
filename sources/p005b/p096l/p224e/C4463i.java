package p005b.p096l.p224e;

import java.util.concurrent.atomic.AtomicLong;
import p005b.p096l.p224e.p231g0.C4457a;
import p005b.p096l.p224e.p231g0.C4460c;

/* renamed from: b.l.e.i */
public class C4463i extends C4332b0<AtomicLong> {

    /* renamed from: a */
    public final /* synthetic */ C4332b0 f8290a;

    public C4463i(C4332b0 b0Var) {
        this.f8290a = b0Var;
    }

    /* renamed from: a */
    public Object mo10755a(C4457a aVar) {
        return new AtomicLong(((Number) this.f8290a.mo10755a(aVar)).longValue());
    }

    /* renamed from: b */
    public void mo10756b(C4460c cVar, Object obj) {
        this.f8290a.mo10756b(cVar, Long.valueOf(((AtomicLong) obj).get()));
    }
}
