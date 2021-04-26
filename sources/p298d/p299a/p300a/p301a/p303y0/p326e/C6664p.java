package p298d.p299a.p300a.p301a.p303y0.p326e;

import java.io.IOException;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7081a;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7084b;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7085c;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7088d;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7089e;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7091f;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7095h;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7106j;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7112m;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7113n;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7117p;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7119q;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7120r;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7134v;

/* renamed from: d.a.a.a.y0.e.p */
public final class C6664p extends C7095h implements C7119q {

    /* renamed from: k */
    public static final C6664p f13346k;

    /* renamed from: l */
    public static C7120r<C6664p> f13347l = new C6665a();

    /* renamed from: g */
    public final C7085c f13348g;

    /* renamed from: h */
    public C7113n f13349h;

    /* renamed from: i */
    public byte f13350i;

    /* renamed from: j */
    public int f13351j;

    /* renamed from: d.a.a.a.y0.e.p$a */
    public static class C6665a extends C7084b<C6664p> {
        /* renamed from: a */
        public Object mo23688a(C7088d dVar, C7091f fVar) {
            return new C6664p(dVar, fVar, (C6581a) null);
        }
    }

    /* renamed from: d.a.a.a.y0.e.p$b */
    public static final class C6666b extends C7095h.C7097b<C6664p, C6666b> implements Object {

        /* renamed from: h */
        public int f13352h;

        /* renamed from: i */
        public C7113n f13353i = C7112m.f14214h;

        /* renamed from: H */
        public /* bridge */ /* synthetic */ C7117p.C7118a mo23689H(C7088d dVar, C7091f fVar) {
            mo23793m(dVar, fVar);
            return this;
        }

        public Object clone() {
            C6666b bVar = new C6666b();
            bVar.mo23792l(mo23791k());
            return bVar;
        }

        /* renamed from: e */
        public C7117p mo23691e() {
            C6664p k = mo23791k();
            if (k.mo23687g()) {
                return k;
            }
            throw new C7134v();
        }

        /* renamed from: h */
        public /* bridge */ /* synthetic */ C7081a.C7082a mo23692h(C7088d dVar, C7091f fVar) {
            mo23793m(dVar, fVar);
            return this;
        }

        /* renamed from: i */
        public C7095h.C7097b mo23693i() {
            C6666b bVar = new C6666b();
            bVar.mo23792l(mo23791k());
            return bVar;
        }

        /* renamed from: j */
        public /* bridge */ /* synthetic */ C7095h.C7097b mo23694j(C7095h hVar) {
            mo23792l((C6664p) hVar);
            return this;
        }

        /* renamed from: k */
        public C6664p mo23791k() {
            C6664p pVar = new C6664p(this, (C6581a) null);
            if ((this.f13352h & 1) == 1) {
                this.f13353i = this.f13353i.mo24714z();
                this.f13352h &= -2;
            }
            pVar.f13349h = this.f13353i;
            return pVar;
        }

        /* renamed from: l */
        public C6666b mo23792l(C6664p pVar) {
            if (pVar == C6664p.f13346k) {
                return this;
            }
            if (!pVar.f13349h.isEmpty()) {
                if (this.f13353i.isEmpty()) {
                    this.f13353i = pVar.f13349h;
                    this.f13352h &= -2;
                } else {
                    if ((this.f13352h & 1) != 1) {
                        this.f13353i = new C7112m(this.f13353i);
                        this.f13352h |= 1;
                    }
                    this.f13353i.addAll(pVar.f13349h);
                }
            }
            this.f14190g = this.f14190g.mo24607e(pVar.f13348g);
            return this;
        }

        /* renamed from: m */
        public C6666b mo23793m(C7088d dVar, C7091f fVar) {
            C6664p pVar;
            C6664p pVar2 = null;
            try {
                C6664p a = C6664p.f13347l.mo23688a(dVar, fVar);
                if (a != null) {
                    mo23792l(a);
                }
                return this;
            } catch (C7106j e) {
                pVar = (C6664p) e.f14209g;
                throw e;
            } catch (Throwable th) {
                th = th;
                pVar2 = pVar;
            }
            if (pVar2 != null) {
                mo23792l(pVar2);
            }
            throw th;
        }
    }

    static {
        C6664p pVar = new C6664p();
        f13346k = pVar;
        pVar.f13349h = C7112m.f14214h;
    }

    public C6664p() {
        this.f13350i = -1;
        this.f13351j = -1;
        this.f13348g = C7085c.f14160g;
    }

    public C6664p(C7088d dVar, C7091f fVar, C6581a aVar) {
        this.f13350i = -1;
        this.f13351j = -1;
        this.f13349h = C7112m.f14214h;
        C7085c.C7087b B = C7085c.m12683B();
        C7089e k = C7089e.m12732k(B, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int o = dVar.mo24637o();
                if (o != 0) {
                    if (o == 10) {
                        C7085c f = dVar.mo24628f();
                        if (!z2 || !true) {
                            this.f13349h = new C7112m();
                            z2 |= true;
                        }
                        this.f13349h.mo24704P(f);
                    } else if (!dVar.mo24640r(o, k)) {
                    }
                }
                z = true;
            } catch (C7106j e) {
                e.f14209g = this;
                throw e;
            } catch (IOException e2) {
                C7106j jVar = new C7106j(e2.getMessage());
                jVar.f14209g = this;
                throw jVar;
            } catch (Throwable th) {
                if (z2 && true) {
                    this.f13349h = this.f13349h.mo24714z();
                }
                try {
                    k.mo24644j();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f13348g = B.mo24619q();
                    throw th2;
                }
                this.f13348g = B.mo24619q();
                throw th;
            }
        }
        if (z2 && true) {
            this.f13349h = this.f13349h.mo24714z();
        }
        try {
            k.mo24644j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f13348g = B.mo24619q();
            throw th3;
        }
        this.f13348g = B.mo24619q();
    }

    /* renamed from: a */
    public int mo23683a() {
        int i = this.f13351j;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f13349h.size(); i3++) {
            i2 += C7089e.m12723a(this.f13349h.mo24713t(i3));
        }
        int size = this.f13348g.size() + (this.f13349h.size() * 1) + 0 + i2;
        this.f13351j = size;
        return size;
    }

    /* renamed from: c */
    public C7117p.C7118a mo23684c() {
        C6666b bVar = new C6666b();
        bVar.mo23792l(this);
        return bVar;
    }

    /* renamed from: d */
    public void mo23685d(C7089e eVar) {
        mo23683a();
        for (int i = 0; i < this.f13349h.size(); i++) {
            C7085c t = this.f13349h.mo24713t(i);
            eVar.mo24658y(10);
            eVar.mo24646m(t);
        }
        eVar.mo24654u(this.f13348g);
    }

    /* renamed from: f */
    public C7117p.C7118a mo23686f() {
        return new C6666b();
    }

    /* renamed from: g */
    public final boolean mo23687g() {
        byte b = this.f13350i;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f13350i = 1;
        return true;
    }

    public C6664p(C7095h.C7097b bVar, C6581a aVar) {
        super(bVar);
        this.f13350i = -1;
        this.f13351j = -1;
        this.f13348g = bVar.f14190g;
    }
}
