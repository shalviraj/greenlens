package p421m.p422m0.p426g;

import java.net.Proxy;
import java.net.URI;
import java.util.List;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6890k;
import p421m.C8025z;
import p421m.p422m0.C7867c;

/* renamed from: m.m0.g.n */
public final class C7901n extends C6890k implements C6851a<List<? extends Proxy>> {

    /* renamed from: g */
    public final /* synthetic */ C7899m f15749g;

    /* renamed from: h */
    public final /* synthetic */ Proxy f15750h;

    /* renamed from: i */
    public final /* synthetic */ C8025z f15751i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7901n(C7899m mVar, Proxy proxy, C8025z zVar) {
        super(0);
        this.f15749g = mVar;
        this.f15750h = proxy;
        this.f15751i = zVar;
    }

    /* renamed from: a */
    public final List<Proxy> invoke() {
        Proxy proxy = this.f15750h;
        if (proxy != null) {
            return C5266a.m9910Y2(proxy);
        }
        URI g = this.f15751i.mo25858g();
        if (g.getHost() == null) {
            return C7867c.m14291l(Proxy.NO_PROXY);
        }
        List<Proxy> select = this.f15749g.f15743e.f15445k.select(g);
        if (!(select == null || select.isEmpty())) {
            return C7867c.m14304y(select);
        }
        return C7867c.m14291l(Proxy.NO_PROXY);
    }
}
