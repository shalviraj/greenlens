package p376j.p378b.p383c;

import com.segment.analytics.integrations.BasePayload;
import java.io.Closeable;
import java.util.Objects;
import p005b.p291q.p292a.C5266a;
import p376j.p377a.C7001b;
import p376j.p377a.C7008c;
import p376j.p378b.p383c.p384a0.C7018a;

/* renamed from: j.b.c.k */
public final class C7032k implements Closeable {

    /* renamed from: g */
    public final C7001b f14093g;

    /* renamed from: h */
    public final C7039o f14094h;

    /* renamed from: i */
    public final boolean f14095i;

    public C7032k(C7039o oVar, boolean z, C7031j jVar) {
        this.f14094h = oVar;
        this.f14095i = z;
        C7001b e = C7001b.m12593e();
        C7001b.C7004c<C7039o> cVar = C7018a.f14074a;
        C5266a.m9842M(e, BasePayload.CONTEXT_KEY);
        C7001b.C7004c<C7039o> cVar2 = C7018a.f14074a;
        C7008c.C7012d<K, V> dVar = e.f14056i.f14063a;
        C7001b c = C7001b.C7005d.f14061a.mo24392c(new C7001b(e, dVar == null ? new C7008c(new C7008c.C7011c(cVar2, oVar)) : new C7008c(dVar.mo24394b(cVar2, oVar, cVar2.hashCode(), 0))));
        this.f14093g = c == null ? C7001b.f14053m : c;
    }

    public void close() {
        C7001b.m12593e().mo24385q(this.f14093g);
        if (this.f14095i) {
            C7039o oVar = this.f14094h;
            Objects.requireNonNull(oVar);
            oVar.mo24432c(C7033l.f14096a);
        }
    }
}
