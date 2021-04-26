package p421m.p422m0.p426g;

import androidx.core.app.NotificationCompat;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import p298d.p334t.C6798p;
import p298d.p344x.p346c.C6888i;
import p421m.C7825a;
import p421m.C7841f;
import p421m.C7860k0;
import p421m.C8014u;
import p421m.C8025z;

/* renamed from: m.m0.g.m */
public final class C7899m {

    /* renamed from: a */
    public List<? extends Proxy> f15739a;

    /* renamed from: b */
    public int f15740b;

    /* renamed from: c */
    public List<? extends InetSocketAddress> f15741c;

    /* renamed from: d */
    public final List<C7860k0> f15742d = new ArrayList();

    /* renamed from: e */
    public final C7825a f15743e;

    /* renamed from: f */
    public final C7897k f15744f;

    /* renamed from: g */
    public final C7841f f15745g;

    /* renamed from: h */
    public final C8014u f15746h;

    /* renamed from: m.m0.g.m$a */
    public static final class C7900a {

        /* renamed from: a */
        public int f15747a;

        /* renamed from: b */
        public final List<C7860k0> f15748b;

        public C7900a(List<C7860k0> list) {
            C6888i.m12438e(list, "routes");
            this.f15748b = list;
        }

        /* renamed from: a */
        public final boolean mo25649a() {
            return this.f15747a < this.f15748b.size();
        }

        /* renamed from: b */
        public final C7860k0 mo25650b() {
            if (mo25649a()) {
                List<C7860k0> list = this.f15748b;
                int i = this.f15747a;
                this.f15747a = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    public C7899m(C7825a aVar, C7897k kVar, C7841f fVar, C8014u uVar) {
        C6888i.m12438e(aVar, "address");
        C6888i.m12438e(kVar, "routeDatabase");
        C6888i.m12438e(fVar, NotificationCompat.CATEGORY_CALL);
        C6888i.m12438e(uVar, "eventListener");
        this.f15743e = aVar;
        this.f15744f = kVar;
        this.f15745g = fVar;
        this.f15746h = uVar;
        C6798p pVar = C6798p.f13713g;
        this.f15739a = pVar;
        this.f15741c = pVar;
        C8025z zVar = aVar.f15435a;
        C7901n nVar = new C7901n(this, aVar.f15444j, zVar);
        C6888i.m12438e(fVar, NotificationCompat.CATEGORY_CALL);
        C6888i.m12438e(zVar, "url");
        List<Proxy> a = nVar.invoke();
        this.f15739a = a;
        this.f15740b = 0;
        C6888i.m12438e(fVar, NotificationCompat.CATEGORY_CALL);
        C6888i.m12438e(zVar, "url");
        C6888i.m12438e(a, "proxies");
    }

    /* renamed from: a */
    public final boolean mo25647a() {
        return mo25648b() || (this.f15742d.isEmpty() ^ true);
    }

    /* renamed from: b */
    public final boolean mo25648b() {
        return this.f15740b < this.f15739a.size();
    }
}
