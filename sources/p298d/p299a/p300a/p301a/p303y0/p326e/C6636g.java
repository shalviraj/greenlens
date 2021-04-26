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
import p298d.p299a.p300a.p301a.p303y0.p389g.C7117p;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7120r;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7134v;

/* renamed from: d.a.a.a.y0.e.g */
public final class C6636g extends C7095h.C7099d<C6636g> implements Object {

    /* renamed from: m */
    public static final C6636g f13179m;

    /* renamed from: n */
    public static C7120r<C6636g> f13180n = new C6637a();

    /* renamed from: h */
    public final C7085c f13181h;

    /* renamed from: i */
    public int f13182i;

    /* renamed from: j */
    public int f13183j;

    /* renamed from: k */
    public byte f13184k;

    /* renamed from: l */
    public int f13185l;

    /* renamed from: d.a.a.a.y0.e.g$a */
    public static class C6637a extends C7084b<C6636g> {
        /* renamed from: a */
        public Object mo23688a(C7088d dVar, C7091f fVar) {
            return new C6636g(dVar, fVar, (C6581a) null);
        }
    }

    /* renamed from: d.a.a.a.y0.e.g$b */
    public static final class C6638b extends C7095h.C7098c<C6636g, C6638b> implements Object {

        /* renamed from: j */
        public int f13186j;

        /* renamed from: k */
        public int f13187k;

        /* renamed from: H */
        public /* bridge */ /* synthetic */ C7117p.C7118a mo23689H(C7088d dVar, C7091f fVar) {
            mo23759n(dVar, fVar);
            return this;
        }

        public Object clone() {
            C6638b bVar = new C6638b();
            bVar.mo23758m(mo23757l());
            return bVar;
        }

        /* renamed from: e */
        public C7117p mo23691e() {
            C6636g l = mo23757l();
            if (l.mo23687g()) {
                return l;
            }
            throw new C7134v();
        }

        /* renamed from: h */
        public /* bridge */ /* synthetic */ C7081a.C7082a mo23692h(C7088d dVar, C7091f fVar) {
            mo23759n(dVar, fVar);
            return this;
        }

        /* renamed from: i */
        public C7095h.C7097b mo23693i() {
            C6638b bVar = new C6638b();
            bVar.mo23758m(mo23757l());
            return bVar;
        }

        /* renamed from: j */
        public /* bridge */ /* synthetic */ C7095h.C7097b mo23694j(C7095h hVar) {
            mo23758m((C6636g) hVar);
            return this;
        }

        /* renamed from: l */
        public C6636g mo23757l() {
            C6636g gVar = new C6636g(this, (C6581a) null);
            int i = 1;
            if ((this.f13186j & 1) != 1) {
                i = 0;
            }
            gVar.f13183j = this.f13187k;
            gVar.f13182i = i;
            return gVar;
        }

        /* renamed from: m */
        public C6638b mo23758m(C6636g gVar) {
            if (gVar == C6636g.f13179m) {
                return this;
            }
            if ((gVar.f13182i & 1) == 1) {
                int i = gVar.f13183j;
                this.f13186j = 1 | this.f13186j;
                this.f13187k = i;
            }
            mo24678k(gVar);
            this.f14190g = this.f14190g.mo24607e(gVar.f13181h);
            return this;
        }

        /* renamed from: n */
        public C6638b mo23759n(C7088d dVar, C7091f fVar) {
            C6636g gVar;
            C6636g gVar2 = null;
            try {
                C6636g a = C6636g.f13180n.mo23688a(dVar, fVar);
                if (a != null) {
                    mo23758m(a);
                }
                return this;
            } catch (C7106j e) {
                gVar = (C6636g) e.f14209g;
                throw e;
            } catch (Throwable th) {
                th = th;
                gVar2 = gVar;
            }
            if (gVar2 != null) {
                mo23758m(gVar2);
            }
            throw th;
        }
    }

    static {
        C6636g gVar = new C6636g();
        f13179m = gVar;
        gVar.f13183j = 0;
    }

    public C6636g() {
        this.f13184k = -1;
        this.f13185l = -1;
        this.f13181h = C7085c.f14160g;
    }

    public C6636g(C7088d dVar, C7091f fVar, C6581a aVar) {
        this.f13184k = -1;
        this.f13185l = -1;
        boolean z = false;
        this.f13183j = 0;
        C7085c.C7087b B = C7085c.m12683B();
        C7089e k = C7089e.m12732k(B, 1);
        while (!z) {
            try {
                int o = dVar.mo24637o();
                if (o != 0) {
                    if (o == 8) {
                        this.f13182i |= 1;
                        this.f13183j = dVar.mo24634l();
                    } else if (!mo24685q(dVar, k, fVar, o)) {
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
                try {
                    k.mo24644j();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f13181h = B.mo24619q();
                    throw th2;
                }
                this.f13181h = B.mo24619q();
                this.f14193g.mo24669i();
                throw th;
            }
        }
        try {
            k.mo24644j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f13181h = B.mo24619q();
            throw th3;
        }
        this.f13181h = B.mo24619q();
        this.f14193g.mo24669i();
    }

    /* renamed from: a */
    public int mo23683a() {
        int i = this.f13185l;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.f13182i & 1) == 1) {
            i2 = 0 + C7089e.m12725c(1, this.f13183j);
        }
        int size = this.f13181h.size() + mo24680k() + i2;
        this.f13185l = size;
        return size;
    }

    /* renamed from: b */
    public C7117p mo23743b() {
        return f13179m;
    }

    /* renamed from: c */
    public C7117p.C7118a mo23684c() {
        C6638b bVar = new C6638b();
        bVar.mo23758m(this);
        return bVar;
    }

    /* renamed from: d */
    public void mo23685d(C7089e eVar) {
        mo23683a();
        C7095h.C7099d<MessageType>.C0000a p = mo24684p();
        if ((this.f13182i & 1) == 1) {
            eVar.mo24649p(1, this.f13183j);
        }
        p.mo24687a(200, eVar);
        eVar.mo24654u(this.f13181h);
    }

    /* renamed from: f */
    public C7117p.C7118a mo23686f() {
        return new C6638b();
    }

    /* renamed from: g */
    public final boolean mo23687g() {
        byte b = this.f13184k;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!mo24679j()) {
            this.f13184k = 0;
            return false;
        }
        this.f13184k = 1;
        return true;
    }

    public C6636g(C7095h.C7098c cVar, C6581a aVar) {
        super(cVar);
        this.f13184k = -1;
        this.f13185l = -1;
        this.f13181h = cVar.f14190g;
    }
}
