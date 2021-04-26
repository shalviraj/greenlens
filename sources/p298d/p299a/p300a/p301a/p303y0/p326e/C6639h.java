package p298d.p299a.p300a.p301a.p303y0.p326e;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6667q;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7081a;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7084b;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7085c;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7088d;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7089e;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7091f;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7095h;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7103i;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7106j;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7117p;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7119q;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7120r;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7134v;

/* renamed from: d.a.a.a.y0.e.h */
public final class C6639h extends C7095h implements C7119q {

    /* renamed from: r */
    public static final C6639h f13188r;

    /* renamed from: s */
    public static C7120r<C6639h> f13189s = new C6640a();

    /* renamed from: g */
    public final C7085c f13190g;

    /* renamed from: h */
    public int f13191h;

    /* renamed from: i */
    public int f13192i;

    /* renamed from: j */
    public int f13193j;

    /* renamed from: k */
    public C6642c f13194k;

    /* renamed from: l */
    public C6667q f13195l;

    /* renamed from: m */
    public int f13196m;

    /* renamed from: n */
    public List<C6639h> f13197n;

    /* renamed from: o */
    public List<C6639h> f13198o;

    /* renamed from: p */
    public byte f13199p;

    /* renamed from: q */
    public int f13200q;

    /* renamed from: d.a.a.a.y0.e.h$a */
    public static class C6640a extends C7084b<C6639h> {
        /* renamed from: a */
        public Object mo23688a(C7088d dVar, C7091f fVar) {
            return new C6639h(dVar, fVar, (C6581a) null);
        }
    }

    /* renamed from: d.a.a.a.y0.e.h$b */
    public static final class C6641b extends C7095h.C7097b<C6639h, C6641b> implements Object {

        /* renamed from: h */
        public int f13201h;

        /* renamed from: i */
        public int f13202i;

        /* renamed from: j */
        public int f13203j;

        /* renamed from: k */
        public C6642c f13204k = C6642c.TRUE;

        /* renamed from: l */
        public C6667q f13205l = C6667q.f13355z;

        /* renamed from: m */
        public int f13206m;

        /* renamed from: n */
        public List<C6639h> f13207n = Collections.emptyList();

        /* renamed from: o */
        public List<C6639h> f13208o = Collections.emptyList();

        /* renamed from: H */
        public /* bridge */ /* synthetic */ C7117p.C7118a mo23689H(C7088d dVar, C7091f fVar) {
            mo23763m(dVar, fVar);
            return this;
        }

        public Object clone() {
            C6641b bVar = new C6641b();
            bVar.mo23762l(mo23761k());
            return bVar;
        }

        /* renamed from: e */
        public C7117p mo23691e() {
            C6639h k = mo23761k();
            if (k.mo23687g()) {
                return k;
            }
            throw new C7134v();
        }

        /* renamed from: h */
        public /* bridge */ /* synthetic */ C7081a.C7082a mo23692h(C7088d dVar, C7091f fVar) {
            mo23763m(dVar, fVar);
            return this;
        }

        /* renamed from: i */
        public C7095h.C7097b mo23693i() {
            C6641b bVar = new C6641b();
            bVar.mo23762l(mo23761k());
            return bVar;
        }

        /* renamed from: j */
        public /* bridge */ /* synthetic */ C7095h.C7097b mo23694j(C7095h hVar) {
            mo23762l((C6639h) hVar);
            return this;
        }

        /* renamed from: k */
        public C6639h mo23761k() {
            C6639h hVar = new C6639h(this, (C6581a) null);
            int i = this.f13201h;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            hVar.f13192i = this.f13202i;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            hVar.f13193j = this.f13203j;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            hVar.f13194k = this.f13204k;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            hVar.f13195l = this.f13205l;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            hVar.f13196m = this.f13206m;
            if ((i & 32) == 32) {
                this.f13207n = Collections.unmodifiableList(this.f13207n);
                this.f13201h &= -33;
            }
            hVar.f13197n = this.f13207n;
            if ((this.f13201h & 64) == 64) {
                this.f13208o = Collections.unmodifiableList(this.f13208o);
                this.f13201h &= -65;
            }
            hVar.f13198o = this.f13208o;
            hVar.f13191h = i2;
            return hVar;
        }

        /* renamed from: l */
        public C6641b mo23762l(C6639h hVar) {
            C6667q qVar;
            if (hVar == C6639h.f13188r) {
                return this;
            }
            int i = hVar.f13191h;
            boolean z = false;
            if ((i & 1) == 1) {
                int i2 = hVar.f13192i;
                this.f13201h |= 1;
                this.f13202i = i2;
            }
            if ((i & 2) == 2) {
                int i3 = hVar.f13193j;
                this.f13201h = 2 | this.f13201h;
                this.f13203j = i3;
            }
            if ((i & 4) == 4) {
                C6642c cVar = hVar.f13194k;
                Objects.requireNonNull(cVar);
                this.f13201h = 4 | this.f13201h;
                this.f13204k = cVar;
            }
            if ((hVar.f13191h & 8) == 8) {
                C6667q qVar2 = hVar.f13195l;
                if ((this.f13201h & 8) == 8 && (qVar = this.f13205l) != C6667q.f13355z) {
                    qVar2 = C0843a.m427C(qVar, qVar2);
                }
                this.f13205l = qVar2;
                this.f13201h |= 8;
            }
            if ((hVar.f13191h & 16) == 16) {
                z = true;
            }
            if (z) {
                int i4 = hVar.f13196m;
                this.f13201h = 16 | this.f13201h;
                this.f13206m = i4;
            }
            if (!hVar.f13197n.isEmpty()) {
                if (this.f13207n.isEmpty()) {
                    this.f13207n = hVar.f13197n;
                    this.f13201h &= -33;
                } else {
                    if ((this.f13201h & 32) != 32) {
                        this.f13207n = new ArrayList(this.f13207n);
                        this.f13201h |= 32;
                    }
                    this.f13207n.addAll(hVar.f13197n);
                }
            }
            if (!hVar.f13198o.isEmpty()) {
                if (this.f13208o.isEmpty()) {
                    this.f13208o = hVar.f13198o;
                    this.f13201h &= -65;
                } else {
                    if ((this.f13201h & 64) != 64) {
                        this.f13208o = new ArrayList(this.f13208o);
                        this.f13201h |= 64;
                    }
                    this.f13208o.addAll(hVar.f13198o);
                }
            }
            this.f14190g = this.f14190g.mo24607e(hVar.f13190g);
            return this;
        }

        /* renamed from: m */
        public C6641b mo23763m(C7088d dVar, C7091f fVar) {
            C6639h hVar;
            C6639h hVar2 = null;
            try {
                C6639h a = C6639h.f13189s.mo23688a(dVar, fVar);
                if (a != null) {
                    mo23762l(a);
                }
                return this;
            } catch (C7106j e) {
                hVar = (C6639h) e.f14209g;
                throw e;
            } catch (Throwable th) {
                th = th;
                hVar2 = hVar;
            }
            if (hVar2 != null) {
                mo23762l(hVar2);
            }
            throw th;
        }
    }

    /* renamed from: d.a.a.a.y0.e.h$c */
    public enum C6642c implements C7103i.C7104a {
        TRUE(0),
        FALSE(1),
        NULL(2);
        

        /* renamed from: g */
        public final int f13213g;

        /* access modifiers changed from: public */
        C6642c(int i) {
            this.f13213g = i;
        }

        /* renamed from: d */
        public static C6642c m11951d(int i) {
            if (i == 0) {
                return TRUE;
            }
            if (i == 1) {
                return FALSE;
            }
            if (i != 2) {
                return null;
            }
            return NULL;
        }

        /* renamed from: f */
        public final int mo23715f() {
            return this.f13213g;
        }
    }

    static {
        C6639h hVar = new C6639h();
        f13188r = hVar;
        hVar.mo23760j();
    }

    public C6639h() {
        this.f13199p = -1;
        this.f13200q = -1;
        this.f13190g = C7085c.f14160g;
    }

    public C6639h(C7088d dVar, C7091f fVar, C6581a aVar) {
        List<C6639h> list;
        C7120r<C6639h> rVar;
        this.f13199p = -1;
        this.f13200q = -1;
        mo23760j();
        C7085c.C7087b B = C7085c.m12683B();
        C7089e k = C7089e.m12732k(B, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int o = dVar.mo24637o();
                if (o != 0) {
                    if (o == 8) {
                        this.f13191h |= 1;
                        this.f13192i = dVar.mo24634l();
                    } else if (o == 16) {
                        this.f13191h |= 2;
                        this.f13193j = dVar.mo24634l();
                    } else if (o == 24) {
                        int l = dVar.mo24634l();
                        C6642c d = C6642c.m11951d(l);
                        if (d == null) {
                            k.mo24658y(o);
                            k.mo24658y(l);
                        } else {
                            this.f13191h |= 4;
                            this.f13194k = d;
                        }
                    } else if (o == 34) {
                        C6667q.C6673c B2 = (this.f13191h & 8) == 8 ? this.f13195l.mo23684c() : null;
                        C6667q qVar = (C6667q) dVar.mo24630h(C6667q.f13354A, fVar);
                        this.f13195l = qVar;
                        if (B2 != null) {
                            B2.mo23694j(qVar);
                            this.f13195l = B2.mo23805l();
                        }
                        this.f13191h |= 8;
                    } else if (o != 40) {
                        if (o == 50) {
                            if (!(z2 & true)) {
                                this.f13197n = new ArrayList();
                                z2 |= true;
                            }
                            list = this.f13197n;
                            rVar = f13189s;
                        } else if (o == 58) {
                            if (!(z2 & true)) {
                                this.f13198o = new ArrayList();
                                z2 |= true;
                            }
                            list = this.f13198o;
                            rVar = f13189s;
                        } else if (!dVar.mo24640r(o, k)) {
                        }
                        list.add(dVar.mo24630h(rVar, fVar));
                    } else {
                        this.f13191h |= 16;
                        this.f13196m = dVar.mo24634l();
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
                if (z2 & true) {
                    this.f13197n = Collections.unmodifiableList(this.f13197n);
                }
                if (z2 & true) {
                    this.f13198o = Collections.unmodifiableList(this.f13198o);
                }
                try {
                    k.mo24644j();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f13190g = B.mo24619q();
                    throw th2;
                }
                this.f13190g = B.mo24619q();
                throw th;
            }
        }
        if (z2 & true) {
            this.f13197n = Collections.unmodifiableList(this.f13197n);
        }
        if (z2 & true) {
            this.f13198o = Collections.unmodifiableList(this.f13198o);
        }
        try {
            k.mo24644j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f13190g = B.mo24619q();
            throw th3;
        }
        this.f13190g = B.mo24619q();
    }

    /* renamed from: a */
    public int mo23683a() {
        int i = this.f13200q;
        if (i != -1) {
            return i;
        }
        int c = (this.f13191h & 1) == 1 ? C7089e.m12725c(1, this.f13192i) + 0 : 0;
        if ((this.f13191h & 2) == 2) {
            c += C7089e.m12725c(2, this.f13193j);
        }
        if ((this.f13191h & 4) == 4) {
            c += C7089e.m12724b(3, this.f13194k.f13213g);
        }
        if ((this.f13191h & 8) == 8) {
            c += C7089e.m12727e(4, this.f13195l);
        }
        if ((this.f13191h & 16) == 16) {
            c += C7089e.m12725c(5, this.f13196m);
        }
        for (int i2 = 0; i2 < this.f13197n.size(); i2++) {
            c += C7089e.m12727e(6, this.f13197n.get(i2));
        }
        for (int i3 = 0; i3 < this.f13198o.size(); i3++) {
            c += C7089e.m12727e(7, this.f13198o.get(i3));
        }
        int size = this.f13190g.size() + c;
        this.f13200q = size;
        return size;
    }

    /* renamed from: c */
    public C7117p.C7118a mo23684c() {
        C6641b bVar = new C6641b();
        bVar.mo23762l(this);
        return bVar;
    }

    /* renamed from: d */
    public void mo23685d(C7089e eVar) {
        mo23683a();
        if ((this.f13191h & 1) == 1) {
            eVar.mo24649p(1, this.f13192i);
        }
        if ((this.f13191h & 2) == 2) {
            eVar.mo24649p(2, this.f13193j);
        }
        if ((this.f13191h & 4) == 4) {
            eVar.mo24647n(3, this.f13194k.f13213g);
        }
        if ((this.f13191h & 8) == 8) {
            eVar.mo24651r(4, this.f13195l);
        }
        if ((this.f13191h & 16) == 16) {
            eVar.mo24649p(5, this.f13196m);
        }
        for (int i = 0; i < this.f13197n.size(); i++) {
            eVar.mo24651r(6, this.f13197n.get(i));
        }
        for (int i2 = 0; i2 < this.f13198o.size(); i2++) {
            eVar.mo24651r(7, this.f13198o.get(i2));
        }
        eVar.mo24654u(this.f13190g);
    }

    /* renamed from: f */
    public C7117p.C7118a mo23686f() {
        return new C6641b();
    }

    /* renamed from: g */
    public final boolean mo23687g() {
        byte b = this.f13199p;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!((this.f13191h & 8) == 8) || this.f13195l.mo23687g()) {
            for (int i = 0; i < this.f13197n.size(); i++) {
                if (!this.f13197n.get(i).mo23687g()) {
                    this.f13199p = 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < this.f13198o.size(); i2++) {
                if (!this.f13198o.get(i2).mo23687g()) {
                    this.f13199p = 0;
                    return false;
                }
            }
            this.f13199p = 1;
            return true;
        }
        this.f13199p = 0;
        return false;
    }

    /* renamed from: j */
    public final void mo23760j() {
        this.f13192i = 0;
        this.f13193j = 0;
        this.f13194k = C6642c.TRUE;
        this.f13195l = C6667q.f13355z;
        this.f13196m = 0;
        this.f13197n = Collections.emptyList();
        this.f13198o = Collections.emptyList();
    }

    public C6639h(C7095h.C7097b bVar, C6581a aVar) {
        super(bVar);
        this.f13199p = -1;
        this.f13200q = -1;
        this.f13190g = bVar.f14190g;
    }
}
