package p298d.p299a.p300a.p301a.p303y0.p326e;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7081a;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7084b;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7085c;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7088d;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7089e;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7091f;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7095h;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7106j;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7117p;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7119q;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7120r;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7134v;

/* renamed from: d.a.a.a.y0.e.t */
public final class C6681t extends C7095h implements C7119q {

    /* renamed from: m */
    public static final C6681t f13458m;

    /* renamed from: n */
    public static C7120r<C6681t> f13459n = new C6682a();

    /* renamed from: g */
    public final C7085c f13460g;

    /* renamed from: h */
    public int f13461h;

    /* renamed from: i */
    public List<C6667q> f13462i;

    /* renamed from: j */
    public int f13463j;

    /* renamed from: k */
    public byte f13464k;

    /* renamed from: l */
    public int f13465l;

    /* renamed from: d.a.a.a.y0.e.t$a */
    public static class C6682a extends C7084b<C6681t> {
        /* renamed from: a */
        public Object mo23688a(C7088d dVar, C7091f fVar) {
            return new C6681t(dVar, fVar, (C6581a) null);
        }
    }

    /* renamed from: d.a.a.a.y0.e.t$b */
    public static final class C6683b extends C7095h.C7097b<C6681t, C6683b> implements Object {

        /* renamed from: h */
        public int f13466h;

        /* renamed from: i */
        public List<C6667q> f13467i = Collections.emptyList();

        /* renamed from: j */
        public int f13468j = -1;

        /* renamed from: H */
        public /* bridge */ /* synthetic */ C7117p.C7118a mo23689H(C7088d dVar, C7091f fVar) {
            mo23821m(dVar, fVar);
            return this;
        }

        public Object clone() {
            C6683b bVar = new C6683b();
            bVar.mo23820l(mo23819k());
            return bVar;
        }

        /* renamed from: e */
        public C7117p mo23691e() {
            C6681t k = mo23819k();
            if (k.mo23687g()) {
                return k;
            }
            throw new C7134v();
        }

        /* renamed from: h */
        public /* bridge */ /* synthetic */ C7081a.C7082a mo23692h(C7088d dVar, C7091f fVar) {
            mo23821m(dVar, fVar);
            return this;
        }

        /* renamed from: i */
        public C7095h.C7097b mo23693i() {
            C6683b bVar = new C6683b();
            bVar.mo23820l(mo23819k());
            return bVar;
        }

        /* renamed from: j */
        public /* bridge */ /* synthetic */ C7095h.C7097b mo23694j(C7095h hVar) {
            mo23820l((C6681t) hVar);
            return this;
        }

        /* renamed from: k */
        public C6681t mo23819k() {
            C6681t tVar = new C6681t(this, (C6581a) null);
            int i = this.f13466h;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.f13467i = Collections.unmodifiableList(this.f13467i);
                this.f13466h &= -2;
            }
            tVar.f13462i = this.f13467i;
            if ((i & 2) != 2) {
                i2 = 0;
            }
            tVar.f13463j = this.f13468j;
            tVar.f13461h = i2;
            return tVar;
        }

        /* renamed from: l */
        public C6683b mo23820l(C6681t tVar) {
            if (tVar == C6681t.f13458m) {
                return this;
            }
            boolean z = true;
            if (!tVar.f13462i.isEmpty()) {
                if (this.f13467i.isEmpty()) {
                    this.f13467i = tVar.f13462i;
                    this.f13466h &= -2;
                } else {
                    if ((this.f13466h & 1) != 1) {
                        this.f13467i = new ArrayList(this.f13467i);
                        this.f13466h |= 1;
                    }
                    this.f13467i.addAll(tVar.f13462i);
                }
            }
            if ((tVar.f13461h & 1) != 1) {
                z = false;
            }
            if (z) {
                int i = tVar.f13463j;
                this.f13466h |= 2;
                this.f13468j = i;
            }
            this.f14190g = this.f14190g.mo24607e(tVar.f13460g);
            return this;
        }

        /* renamed from: m */
        public C6683b mo23821m(C7088d dVar, C7091f fVar) {
            C6681t tVar;
            C6681t tVar2 = null;
            try {
                C6681t a = C6681t.f13459n.mo23688a(dVar, fVar);
                if (a != null) {
                    mo23820l(a);
                }
                return this;
            } catch (C7106j e) {
                tVar = (C6681t) e.f14209g;
                throw e;
            } catch (Throwable th) {
                th = th;
                tVar2 = tVar;
            }
            if (tVar2 != null) {
                mo23820l(tVar2);
            }
            throw th;
        }
    }

    static {
        C6681t tVar = new C6681t();
        f13458m = tVar;
        tVar.f13462i = Collections.emptyList();
        tVar.f13463j = -1;
    }

    public C6681t() {
        this.f13464k = -1;
        this.f13465l = -1;
        this.f13460g = C7085c.f14160g;
    }

    public C6681t(C7088d dVar, C7091f fVar, C6581a aVar) {
        this.f13464k = -1;
        this.f13465l = -1;
        this.f13462i = Collections.emptyList();
        this.f13463j = -1;
        C7085c.C7087b B = C7085c.m12683B();
        C7089e k = C7089e.m12732k(B, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int o = dVar.mo24637o();
                if (o != 0) {
                    if (o == 10) {
                        if (!z2 || !true) {
                            this.f13462i = new ArrayList();
                            z2 |= true;
                        }
                        this.f13462i.add(dVar.mo24630h(C6667q.f13354A, fVar));
                    } else if (o == 16) {
                        this.f13461h |= 1;
                        this.f13463j = dVar.mo24634l();
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
                    this.f13462i = Collections.unmodifiableList(this.f13462i);
                }
                try {
                    k.mo24644j();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f13460g = B.mo24619q();
                    throw th2;
                }
                this.f13460g = B.mo24619q();
                throw th;
            }
        }
        if (z2 && true) {
            this.f13462i = Collections.unmodifiableList(this.f13462i);
        }
        try {
            k.mo24644j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f13460g = B.mo24619q();
            throw th3;
        }
        this.f13460g = B.mo24619q();
    }

    /* renamed from: j */
    public static C6683b m12144j(C6681t tVar) {
        C6683b bVar = new C6683b();
        bVar.mo23820l(tVar);
        return bVar;
    }

    /* renamed from: a */
    public int mo23683a() {
        int i = this.f13465l;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f13462i.size(); i3++) {
            i2 += C7089e.m12727e(1, this.f13462i.get(i3));
        }
        if ((this.f13461h & 1) == 1) {
            i2 += C7089e.m12725c(2, this.f13463j);
        }
        int size = this.f13460g.size() + i2;
        this.f13465l = size;
        return size;
    }

    /* renamed from: c */
    public C7117p.C7118a mo23684c() {
        return m12144j(this);
    }

    /* renamed from: d */
    public void mo23685d(C7089e eVar) {
        mo23683a();
        for (int i = 0; i < this.f13462i.size(); i++) {
            eVar.mo24651r(1, this.f13462i.get(i));
        }
        if ((this.f13461h & 1) == 1) {
            eVar.mo24649p(2, this.f13463j);
        }
        eVar.mo24654u(this.f13460g);
    }

    /* renamed from: f */
    public C7117p.C7118a mo23686f() {
        return new C6683b();
    }

    /* renamed from: g */
    public final boolean mo23687g() {
        byte b = this.f13464k;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f13462i.size(); i++) {
            if (!this.f13462i.get(i).mo23687g()) {
                this.f13464k = 0;
                return false;
            }
        }
        this.f13464k = 1;
        return true;
    }

    /* renamed from: k */
    public C6683b mo23818k() {
        return m12144j(this);
    }

    public C6681t(C7095h.C7097b bVar, C6581a aVar) {
        super(bVar);
        this.f13464k = -1;
        this.f13465l = -1;
        this.f13460g = bVar.f14190g;
    }
}
