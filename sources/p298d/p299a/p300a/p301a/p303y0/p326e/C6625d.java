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
import p298d.p299a.p300a.p301a.p303y0.p389g.C7120r;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7134v;

/* renamed from: d.a.a.a.y0.e.d */
public final class C6625d extends C7095h.C7099d<C6625d> implements Object {

    /* renamed from: o */
    public static final C6625d f13133o;

    /* renamed from: p */
    public static C7120r<C6625d> f13134p = new C6626a();

    /* renamed from: h */
    public final C7085c f13135h;

    /* renamed from: i */
    public int f13136i;

    /* renamed from: j */
    public int f13137j;

    /* renamed from: k */
    public List<C6684u> f13138k;

    /* renamed from: l */
    public List<Integer> f13139l;

    /* renamed from: m */
    public byte f13140m;

    /* renamed from: n */
    public int f13141n;

    /* renamed from: d.a.a.a.y0.e.d$a */
    public static class C6626a extends C7084b<C6625d> {
        /* renamed from: a */
        public Object mo23688a(C7088d dVar, C7091f fVar) {
            return new C6625d(dVar, fVar, (C6581a) null);
        }
    }

    /* renamed from: d.a.a.a.y0.e.d$b */
    public static final class C6627b extends C7095h.C7098c<C6625d, C6627b> implements Object {

        /* renamed from: j */
        public int f13142j;

        /* renamed from: k */
        public int f13143k = 6;

        /* renamed from: l */
        public List<C6684u> f13144l = Collections.emptyList();

        /* renamed from: m */
        public List<Integer> f13145m = Collections.emptyList();

        /* renamed from: H */
        public /* bridge */ /* synthetic */ C7117p.C7118a mo23689H(C7088d dVar, C7091f fVar) {
            mo23750n(dVar, fVar);
            return this;
        }

        public Object clone() {
            C6627b bVar = new C6627b();
            bVar.mo23749m(mo23748l());
            return bVar;
        }

        /* renamed from: e */
        public C7117p mo23691e() {
            C6625d l = mo23748l();
            if (l.mo23687g()) {
                return l;
            }
            throw new C7134v();
        }

        /* renamed from: h */
        public /* bridge */ /* synthetic */ C7081a.C7082a mo23692h(C7088d dVar, C7091f fVar) {
            mo23750n(dVar, fVar);
            return this;
        }

        /* renamed from: i */
        public C7095h.C7097b mo23693i() {
            C6627b bVar = new C6627b();
            bVar.mo23749m(mo23748l());
            return bVar;
        }

        /* renamed from: j */
        public /* bridge */ /* synthetic */ C7095h.C7097b mo23694j(C7095h hVar) {
            mo23749m((C6625d) hVar);
            return this;
        }

        /* renamed from: l */
        public C6625d mo23748l() {
            C6625d dVar = new C6625d(this, (C6581a) null);
            int i = this.f13142j;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            dVar.f13137j = this.f13143k;
            if ((i & 2) == 2) {
                this.f13144l = Collections.unmodifiableList(this.f13144l);
                this.f13142j &= -3;
            }
            dVar.f13138k = this.f13144l;
            if ((this.f13142j & 4) == 4) {
                this.f13145m = Collections.unmodifiableList(this.f13145m);
                this.f13142j &= -5;
            }
            dVar.f13139l = this.f13145m;
            dVar.f13136i = i2;
            return dVar;
        }

        /* renamed from: m */
        public C6627b mo23749m(C6625d dVar) {
            if (dVar == C6625d.f13133o) {
                return this;
            }
            if ((dVar.f13136i & 1) == 1) {
                int i = dVar.f13137j;
                this.f13142j = 1 | this.f13142j;
                this.f13143k = i;
            }
            if (!dVar.f13138k.isEmpty()) {
                if (this.f13144l.isEmpty()) {
                    this.f13144l = dVar.f13138k;
                    this.f13142j &= -3;
                } else {
                    if ((this.f13142j & 2) != 2) {
                        this.f13144l = new ArrayList(this.f13144l);
                        this.f13142j |= 2;
                    }
                    this.f13144l.addAll(dVar.f13138k);
                }
            }
            if (!dVar.f13139l.isEmpty()) {
                if (this.f13145m.isEmpty()) {
                    this.f13145m = dVar.f13139l;
                    this.f13142j &= -5;
                } else {
                    if ((this.f13142j & 4) != 4) {
                        this.f13145m = new ArrayList(this.f13145m);
                        this.f13142j |= 4;
                    }
                    this.f13145m.addAll(dVar.f13139l);
                }
            }
            mo24678k(dVar);
            this.f14190g = this.f14190g.mo24607e(dVar.f13135h);
            return this;
        }

        /* renamed from: n */
        public C6627b mo23750n(C7088d dVar, C7091f fVar) {
            C6625d dVar2;
            C6625d dVar3 = null;
            try {
                C6625d a = C6625d.f13134p.mo23688a(dVar, fVar);
                if (a != null) {
                    mo23749m(a);
                }
                return this;
            } catch (C7106j e) {
                dVar2 = (C6625d) e.f14209g;
                throw e;
            } catch (Throwable th) {
                th = th;
                dVar3 = dVar2;
            }
            if (dVar3 != null) {
                mo23749m(dVar3);
            }
            throw th;
        }
    }

    static {
        C6625d dVar = new C6625d();
        f13133o = dVar;
        dVar.f13137j = 6;
        dVar.f13138k = Collections.emptyList();
        dVar.f13139l = Collections.emptyList();
    }

    public C6625d() {
        this.f13140m = -1;
        this.f13141n = -1;
        this.f13135h = C7085c.f14160g;
    }

    public C6625d(C7088d dVar, C7091f fVar, C6581a aVar) {
        Object obj;
        List list;
        this.f13140m = -1;
        this.f13141n = -1;
        this.f13137j = 6;
        this.f13138k = Collections.emptyList();
        this.f13139l = Collections.emptyList();
        C7085c.C7087b B = C7085c.m12683B();
        C7089e k = C7089e.m12732k(B, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int o = dVar.mo24637o();
                if (o != 0) {
                    if (o != 8) {
                        if (o == 18) {
                            if (!(z2 & true)) {
                                this.f13138k = new ArrayList();
                                z2 |= true;
                            }
                            list = this.f13138k;
                            obj = dVar.mo24630h(C6684u.f13470s, fVar);
                        } else if (o == 248) {
                            if (!(z2 & true)) {
                                this.f13139l = new ArrayList();
                                z2 |= true;
                            }
                            list = this.f13139l;
                            obj = Integer.valueOf(dVar.mo24634l());
                        } else if (o == 250) {
                            int d = dVar.mo24626d(dVar.mo24634l());
                            if (!(z2 & true) && dVar.mo24624b() > 0) {
                                this.f13139l = new ArrayList();
                                z2 |= true;
                            }
                            while (dVar.mo24624b() > 0) {
                                this.f13139l.add(Integer.valueOf(dVar.mo24634l()));
                            }
                            dVar.f14175i = d;
                            dVar.mo24638p();
                        } else if (!mo24685q(dVar, k, fVar, o)) {
                        }
                        list.add(obj);
                    } else {
                        this.f13136i |= 1;
                        this.f13137j = dVar.mo24634l();
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
                    this.f13138k = Collections.unmodifiableList(this.f13138k);
                }
                if (z2 & true) {
                    this.f13139l = Collections.unmodifiableList(this.f13139l);
                }
                try {
                    k.mo24644j();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f13135h = B.mo24619q();
                    throw th2;
                }
                this.f13135h = B.mo24619q();
                this.f14193g.mo24669i();
                throw th;
            }
        }
        if (z2 & true) {
            this.f13138k = Collections.unmodifiableList(this.f13138k);
        }
        if (z2 & true) {
            this.f13139l = Collections.unmodifiableList(this.f13139l);
        }
        try {
            k.mo24644j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f13135h = B.mo24619q();
            throw th3;
        }
        this.f13135h = B.mo24619q();
        this.f14193g.mo24669i();
    }

    /* renamed from: a */
    public int mo23683a() {
        int i = this.f13141n;
        if (i != -1) {
            return i;
        }
        int c = (this.f13136i & 1) == 1 ? C7089e.m12725c(1, this.f13137j) + 0 : 0;
        for (int i2 = 0; i2 < this.f13138k.size(); i2++) {
            c += C7089e.m12727e(2, this.f13138k.get(i2));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f13139l.size(); i4++) {
            i3 += C7089e.m12726d(this.f13139l.get(i4).intValue());
        }
        int size = this.f13135h.size() + mo24680k() + (this.f13139l.size() * 2) + c + i3;
        this.f13141n = size;
        return size;
    }

    /* renamed from: b */
    public C7117p mo23743b() {
        return f13133o;
    }

    /* renamed from: c */
    public C7117p.C7118a mo23684c() {
        C6627b bVar = new C6627b();
        bVar.mo23749m(this);
        return bVar;
    }

    /* renamed from: d */
    public void mo23685d(C7089e eVar) {
        mo23683a();
        C7095h.C7099d<MessageType>.C0000a p = mo24684p();
        if ((this.f13136i & 1) == 1) {
            eVar.mo24649p(1, this.f13137j);
        }
        for (int i = 0; i < this.f13138k.size(); i++) {
            eVar.mo24651r(2, this.f13138k.get(i));
        }
        for (int i2 = 0; i2 < this.f13139l.size(); i2++) {
            eVar.mo24649p(31, this.f13139l.get(i2).intValue());
        }
        p.mo24687a(19000, eVar);
        eVar.mo24654u(this.f13135h);
    }

    /* renamed from: f */
    public C7117p.C7118a mo23686f() {
        return new C6627b();
    }

    /* renamed from: g */
    public final boolean mo23687g() {
        byte b = this.f13140m;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f13138k.size(); i++) {
            if (!this.f13138k.get(i).mo23687g()) {
                this.f13140m = 0;
                return false;
            }
        }
        if (!mo24679j()) {
            this.f13140m = 0;
            return false;
        }
        this.f13140m = 1;
        return true;
    }

    public C6625d(C7095h.C7098c cVar, C6581a aVar) {
        super(cVar);
        this.f13140m = -1;
        this.f13141n = -1;
        this.f13135h = cVar.f14190g;
    }
}
