package p005b.p280p.p285b.p286a0.p288k;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p005b.p273o.C4805c3;
import p005b.p280p.p285b.C5242n;
import p005b.p280p.p285b.C5254s;
import p005b.p280p.p285b.C5255t;
import p005b.p280p.p285b.C5260w;
import p005b.p280p.p285b.C5263x;
import p005b.p280p.p285b.p286a0.C5134i;
import p005b.p280p.p285b.p286a0.p287j.C5139d;
import p005b.p280p.p285b.p286a0.p287j.C5154k;
import p005b.p280p.p285b.p286a0.p287j.C5159l;
import p005b.p291q.p292a.C5266a;
import p435n.C8030a0;
import p435n.C8040e;
import p435n.C8044h;
import p435n.C8048k;
import p435n.C8064y;

/* renamed from: b.p.b.a0.k.e */
public final class C5195e implements C5203i {

    /* renamed from: e */
    public static final C8044h f10159e;

    /* renamed from: f */
    public static final C8044h f10160f;

    /* renamed from: g */
    public static final C8044h f10161g;

    /* renamed from: h */
    public static final C8044h f10162h;

    /* renamed from: i */
    public static final C8044h f10163i;

    /* renamed from: j */
    public static final C8044h f10164j;

    /* renamed from: k */
    public static final C8044h f10165k;

    /* renamed from: l */
    public static final C8044h f10166l;

    /* renamed from: m */
    public static final List<C8044h> f10167m;

    /* renamed from: n */
    public static final List<C8044h> f10168n;

    /* renamed from: o */
    public static final List<C8044h> f10169o;

    /* renamed from: p */
    public static final List<C8044h> f10170p;

    /* renamed from: a */
    public final C5211p f10171a;

    /* renamed from: b */
    public final C5139d f10172b;

    /* renamed from: c */
    public C5199g f10173c;

    /* renamed from: d */
    public C5154k f10174d;

    /* renamed from: b.p.b.a0.k.e$a */
    public class C5196a extends C8048k {
        public C5196a(C8030a0 a0Var) {
            super(a0Var);
        }

        public void close() {
            C5195e eVar = C5195e.this;
            eVar.f10171a.mo17116h(eVar);
            this.f16151g.close();
        }
    }

    static {
        C8044h k = C8044h.m14839k("connection");
        f10159e = k;
        C8044h k2 = C8044h.m14839k("host");
        f10160f = k2;
        C8044h k3 = C8044h.m14839k("keep-alive");
        f10161g = k3;
        C8044h k4 = C8044h.m14839k("proxy-connection");
        f10162h = k4;
        C8044h k5 = C8044h.m14839k("transfer-encoding");
        f10163i = k5;
        C8044h k6 = C8044h.m14839k("te");
        f10164j = k6;
        C8044h k7 = C8044h.m14839k("encoding");
        f10165k = k7;
        C8044h k8 = C8044h.m14839k("upgrade");
        f10166l = k8;
        C8044h hVar = C5159l.f10061e;
        C8044h hVar2 = C5159l.f10062f;
        C8044h hVar3 = C5159l.f10063g;
        C8044h hVar4 = C5159l.f10064h;
        C8044h hVar5 = C5159l.f10065i;
        C8044h hVar6 = C5159l.f10066j;
        f10167m = C5134i.m9464i(k, k2, k3, k4, k5, hVar, hVar2, hVar3, hVar4, hVar5, hVar6);
        f10168n = C5134i.m9464i(k, k2, k3, k4, k5);
        f10169o = C5134i.m9464i(k, k2, k3, k4, k6, k5, k7, k8, hVar, hVar2, hVar3, hVar4, hVar5, hVar6);
        f10170p = C5134i.m9464i(k, k2, k3, k4, k6, k5, k7, k8);
    }

    public C5195e(C5211p pVar, C5139d dVar) {
        this.f10171a = pVar;
        this.f10172b = dVar;
    }

    /* renamed from: a */
    public void mo17073a() {
        ((C5154k.C5156b) this.f10174d.mo17022g()).close();
    }

    /* renamed from: b */
    public C8064y mo17074b(C5255t tVar, long j) {
        return this.f10174d.mo17022g();
    }

    /* renamed from: c */
    public void mo17075c(C5255t tVar) {
        ArrayList arrayList;
        int i;
        C5154k kVar;
        if (this.f10174d == null) {
            this.f10173c.mo17097m();
            boolean c = this.f10173c.mo17088c(tVar);
            if (this.f10172b.f9979g == C5254s.HTTP_2) {
                C5242n nVar = tVar.f10481c;
                arrayList = new ArrayList(nVar.mo17156d() + 4);
                arrayList.add(new C5159l(C5159l.f10061e, tVar.f10480b));
                arrayList.add(new C5159l(C5159l.f10062f, C4805c3.m8819r(tVar.f10479a)));
                arrayList.add(new C5159l(C5159l.f10064h, C5134i.m9462g(tVar.f10479a)));
                arrayList.add(new C5159l(C5159l.f10063g, tVar.f10479a.f10420a));
                int d = nVar.mo17156d();
                for (int i2 = 0; i2 < d; i2++) {
                    C8044h k = C8044h.m14839k(nVar.mo17154b(i2).toLowerCase(Locale.US));
                    if (!f10169o.contains(k)) {
                        arrayList.add(new C5159l(k, nVar.mo17157e(i2)));
                    }
                }
            } else {
                C5242n nVar2 = tVar.f10481c;
                arrayList = new ArrayList(nVar2.mo17156d() + 5);
                arrayList.add(new C5159l(C5159l.f10061e, tVar.f10480b));
                arrayList.add(new C5159l(C5159l.f10062f, C4805c3.m8819r(tVar.f10479a)));
                arrayList.add(new C5159l(C5159l.f10066j, "HTTP/1.1"));
                arrayList.add(new C5159l(C5159l.f10065i, C5134i.m9462g(tVar.f10479a)));
                arrayList.add(new C5159l(C5159l.f10063g, tVar.f10479a.f10420a));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int d2 = nVar2.mo17156d();
                for (int i3 = 0; i3 < d2; i3++) {
                    C8044h k2 = C8044h.m14839k(nVar2.mo17154b(i3).toLowerCase(Locale.US));
                    if (!f10167m.contains(k2)) {
                        String e = nVar2.mo17157e(i3);
                        if (linkedHashSet.add(k2)) {
                            arrayList.add(new C5159l(k2, e));
                        } else {
                            int i4 = 0;
                            while (true) {
                                if (i4 >= arrayList.size()) {
                                    break;
                                } else if (((C5159l) arrayList.get(i4)).f10067a.equals(k2)) {
                                    arrayList.set(i4, new C5159l(k2, ((C5159l) arrayList.get(i4)).f10068b.mo25968z() + 0 + e));
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                        }
                    }
                }
            }
            C5139d dVar = this.f10172b;
            boolean z = !c;
            synchronized (dVar.f9996x) {
                synchronized (dVar) {
                    if (!dVar.f9986n) {
                        i = dVar.f9985m;
                        dVar.f9985m = i + 2;
                        kVar = new C5154k(i, dVar, z, false, arrayList);
                        if (kVar.mo17024i()) {
                            dVar.f9982j.put(Integer.valueOf(i), kVar);
                            dVar.mo17001H(false);
                        }
                    } else {
                        throw new IOException("shutdown");
                    }
                }
                dVar.f9996x.mo16994c0(z, false, i, 0, arrayList);
            }
            if (!c) {
                dVar.f9996x.flush();
            }
            this.f10174d = kVar;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            kVar.f10046i.mo25879g((long) this.f10173c.f10181a.f10451B, timeUnit);
            this.f10174d.f10047j.mo25879g((long) this.f10173c.f10181a.f10452C, timeUnit);
        }
    }

    /* renamed from: d */
    public void mo17076d(C5199g gVar) {
        this.f10173c = gVar;
    }

    /* renamed from: e */
    public void mo17077e(C5207l lVar) {
        C8064y g = this.f10174d.mo17022g();
        C8040e eVar = new C8040e();
        C8040e eVar2 = lVar.f10213i;
        eVar2.mo25946z(eVar, 0, eVar2.f16140h);
        ((C5154k.C5156b) g).mo17030j(eVar, eVar.f16140h);
    }

    /* renamed from: f */
    public C5260w.C5262b mo17078f() {
        C5254s sVar = C5254s.HTTP_2;
        String str = null;
        if (this.f10172b.f9979g == sVar) {
            List<C5159l> f = this.f10174d.mo17021f();
            C5242n.C5244b bVar = new C5242n.C5244b();
            int size = f.size();
            for (int i = 0; i < size; i++) {
                C8044h hVar = f.get(i).f10067a;
                String z = f.get(i).f10068b.mo25968z();
                if (hVar.equals(C5159l.f10060d)) {
                    str = z;
                } else if (!f10170p.contains(hVar)) {
                    bVar.mo17159a(hVar.mo25968z(), z);
                }
            }
            if (str != null) {
                C5210o a = C5210o.m9664a("HTTP/1.1 " + str);
                C5260w.C5262b bVar2 = new C5260w.C5262b();
                bVar2.f10507b = sVar;
                bVar2.f10508c = a.f10226b;
                bVar2.f10509d = a.f10227c;
                bVar2.mo17206d(bVar.mo17161c());
                return bVar2;
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
        List<C5159l> f2 = this.f10174d.mo17021f();
        C5242n.C5244b bVar3 = new C5242n.C5244b();
        int size2 = f2.size();
        String str2 = "HTTP/1.1";
        for (int i2 = 0; i2 < size2; i2++) {
            C8044h hVar2 = f2.get(i2).f10067a;
            String z2 = f2.get(i2).f10068b.mo25968z();
            int i3 = 0;
            while (i3 < z2.length()) {
                int indexOf = z2.indexOf(0, i3);
                if (indexOf == -1) {
                    indexOf = z2.length();
                }
                String substring = z2.substring(i3, indexOf);
                if (hVar2.equals(C5159l.f10060d)) {
                    str = substring;
                } else if (hVar2.equals(C5159l.f10066j)) {
                    str2 = substring;
                } else if (!f10168n.contains(hVar2)) {
                    bVar3.mo17159a(hVar2.mo25968z(), substring);
                }
                i3 = indexOf + 1;
            }
        }
        if (str != null) {
            C5210o a2 = C5210o.m9664a(str2 + " " + str);
            C5260w.C5262b bVar4 = new C5260w.C5262b();
            bVar4.f10507b = C5254s.SPDY_3;
            bVar4.f10508c = a2.f10226b;
            bVar4.f10509d = a2.f10227c;
            bVar4.mo17206d(bVar3.mo17161c());
            return bVar4;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    /* renamed from: g */
    public C5263x mo17079g(C5260w wVar) {
        return new C5206k(wVar.f10500f, C5266a.m9812H(new C5196a(this.f10174d.f10044g)));
    }
}
