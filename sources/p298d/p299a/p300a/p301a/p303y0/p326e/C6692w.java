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

/* renamed from: d.a.a.a.y0.e.w */
public final class C6692w extends C7095h implements C7119q {

    /* renamed from: k */
    public static final C6692w f13517k;

    /* renamed from: l */
    public static C7120r<C6692w> f13518l = new C6693a();

    /* renamed from: g */
    public final C7085c f13519g;

    /* renamed from: h */
    public List<C6687v> f13520h;

    /* renamed from: i */
    public byte f13521i;

    /* renamed from: j */
    public int f13522j;

    /* renamed from: d.a.a.a.y0.e.w$a */
    public static class C6693a extends C7084b<C6692w> {
        /* renamed from: a */
        public Object mo23688a(C7088d dVar, C7091f fVar) {
            return new C6692w(dVar, fVar, (C6581a) null);
        }
    }

    /* renamed from: d.a.a.a.y0.e.w$b */
    public static final class C6694b extends C7095h.C7097b<C6692w, C6694b> implements Object {

        /* renamed from: h */
        public int f13523h;

        /* renamed from: i */
        public List<C6687v> f13524i = Collections.emptyList();

        /* renamed from: H */
        public /* bridge */ /* synthetic */ C7117p.C7118a mo23689H(C7088d dVar, C7091f fVar) {
            mo23833m(dVar, fVar);
            return this;
        }

        public Object clone() {
            C6694b bVar = new C6694b();
            bVar.mo23832l(mo23831k());
            return bVar;
        }

        /* renamed from: e */
        public C7117p mo23691e() {
            C6692w k = mo23831k();
            if (k.mo23687g()) {
                return k;
            }
            throw new C7134v();
        }

        /* renamed from: h */
        public /* bridge */ /* synthetic */ C7081a.C7082a mo23692h(C7088d dVar, C7091f fVar) {
            mo23833m(dVar, fVar);
            return this;
        }

        /* renamed from: i */
        public C7095h.C7097b mo23693i() {
            C6694b bVar = new C6694b();
            bVar.mo23832l(mo23831k());
            return bVar;
        }

        /* renamed from: j */
        public /* bridge */ /* synthetic */ C7095h.C7097b mo23694j(C7095h hVar) {
            mo23832l((C6692w) hVar);
            return this;
        }

        /* renamed from: k */
        public C6692w mo23831k() {
            C6692w wVar = new C6692w(this, (C6581a) null);
            if ((this.f13523h & 1) == 1) {
                this.f13524i = Collections.unmodifiableList(this.f13524i);
                this.f13523h &= -2;
            }
            wVar.f13520h = this.f13524i;
            return wVar;
        }

        /* renamed from: l */
        public C6694b mo23832l(C6692w wVar) {
            if (wVar == C6692w.f13517k) {
                return this;
            }
            if (!wVar.f13520h.isEmpty()) {
                if (this.f13524i.isEmpty()) {
                    this.f13524i = wVar.f13520h;
                    this.f13523h &= -2;
                } else {
                    if ((this.f13523h & 1) != 1) {
                        this.f13524i = new ArrayList(this.f13524i);
                        this.f13523h |= 1;
                    }
                    this.f13524i.addAll(wVar.f13520h);
                }
            }
            this.f14190g = this.f14190g.mo24607e(wVar.f13519g);
            return this;
        }

        /* renamed from: m */
        public C6694b mo23833m(C7088d dVar, C7091f fVar) {
            C6692w wVar;
            C6692w wVar2 = null;
            try {
                C6692w a = C6692w.f13518l.mo23688a(dVar, fVar);
                if (a != null) {
                    mo23832l(a);
                }
                return this;
            } catch (C7106j e) {
                wVar = (C6692w) e.f14209g;
                throw e;
            } catch (Throwable th) {
                th = th;
                wVar2 = wVar;
            }
            if (wVar2 != null) {
                mo23832l(wVar2);
            }
            throw th;
        }
    }

    static {
        C6692w wVar = new C6692w();
        f13517k = wVar;
        wVar.f13520h = Collections.emptyList();
    }

    public C6692w() {
        this.f13521i = -1;
        this.f13522j = -1;
        this.f13519g = C7085c.f14160g;
    }

    public C6692w(C7088d dVar, C7091f fVar, C6581a aVar) {
        this.f13521i = -1;
        this.f13522j = -1;
        this.f13520h = Collections.emptyList();
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
                            this.f13520h = new ArrayList();
                            z2 |= true;
                        }
                        this.f13520h.add(dVar.mo24630h(C6687v.f13489r, fVar));
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
                    this.f13520h = Collections.unmodifiableList(this.f13520h);
                }
                try {
                    k.mo24644j();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f13519g = B.mo24619q();
                    throw th2;
                }
                this.f13519g = B.mo24619q();
                throw th;
            }
        }
        if (z2 && true) {
            this.f13520h = Collections.unmodifiableList(this.f13520h);
        }
        try {
            k.mo24644j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f13519g = B.mo24619q();
            throw th3;
        }
        this.f13519g = B.mo24619q();
    }

    /* renamed from: j */
    public static C6694b m12195j(C6692w wVar) {
        C6694b bVar = new C6694b();
        bVar.mo23832l(wVar);
        return bVar;
    }

    /* renamed from: a */
    public int mo23683a() {
        int i = this.f13522j;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f13520h.size(); i3++) {
            i2 += C7089e.m12727e(1, this.f13520h.get(i3));
        }
        int size = this.f13519g.size() + i2;
        this.f13522j = size;
        return size;
    }

    /* renamed from: c */
    public C7117p.C7118a mo23684c() {
        return m12195j(this);
    }

    /* renamed from: d */
    public void mo23685d(C7089e eVar) {
        mo23683a();
        for (int i = 0; i < this.f13520h.size(); i++) {
            eVar.mo24651r(1, this.f13520h.get(i));
        }
        eVar.mo24654u(this.f13519g);
    }

    /* renamed from: f */
    public C7117p.C7118a mo23686f() {
        return new C6694b();
    }

    /* renamed from: g */
    public final boolean mo23687g() {
        byte b = this.f13521i;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f13521i = 1;
        return true;
    }

    /* renamed from: k */
    public C6694b mo23830k() {
        return m12195j(this);
    }

    public C6692w(C7095h.C7097b bVar, C6581a aVar) {
        super(bVar);
        this.f13521i = -1;
        this.f13522j = -1;
        this.f13519g = bVar.f14190g;
    }
}
