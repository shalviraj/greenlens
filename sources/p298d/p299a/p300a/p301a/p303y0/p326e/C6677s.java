package p298d.p299a.p300a.p301a.p303y0.p326e;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
import p298d.p299a.p300a.p301a.p303y0.p389g.C7120r;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7134v;

/* renamed from: d.a.a.a.y0.e.s */
public final class C6677s extends C7095h.C7099d<C6677s> implements Object {

    /* renamed from: s */
    public static final C6677s f13433s;

    /* renamed from: t */
    public static C7120r<C6677s> f13434t = new C6678a();

    /* renamed from: h */
    public final C7085c f13435h;

    /* renamed from: i */
    public int f13436i;

    /* renamed from: j */
    public int f13437j;

    /* renamed from: k */
    public int f13438k;

    /* renamed from: l */
    public boolean f13439l;

    /* renamed from: m */
    public C6680c f13440m;

    /* renamed from: n */
    public List<C6667q> f13441n;

    /* renamed from: o */
    public List<Integer> f13442o;

    /* renamed from: p */
    public int f13443p;

    /* renamed from: q */
    public byte f13444q;

    /* renamed from: r */
    public int f13445r;

    /* renamed from: d.a.a.a.y0.e.s$a */
    public static class C6678a extends C7084b<C6677s> {
        /* renamed from: a */
        public Object mo23688a(C7088d dVar, C7091f fVar) {
            return new C6677s(dVar, fVar, (C6581a) null);
        }
    }

    /* renamed from: d.a.a.a.y0.e.s$b */
    public static final class C6679b extends C7095h.C7098c<C6677s, C6679b> implements Object {

        /* renamed from: j */
        public int f13446j;

        /* renamed from: k */
        public int f13447k;

        /* renamed from: l */
        public int f13448l;

        /* renamed from: m */
        public boolean f13449m;

        /* renamed from: n */
        public C6680c f13450n = C6680c.INV;

        /* renamed from: o */
        public List<C6667q> f13451o = Collections.emptyList();

        /* renamed from: p */
        public List<Integer> f13452p = Collections.emptyList();

        /* renamed from: H */
        public /* bridge */ /* synthetic */ C7117p.C7118a mo23689H(C7088d dVar, C7091f fVar) {
            mo23817n(dVar, fVar);
            return this;
        }

        public Object clone() {
            C6679b bVar = new C6679b();
            bVar.mo23816m(mo23815l());
            return bVar;
        }

        /* renamed from: e */
        public C7117p mo23691e() {
            C6677s l = mo23815l();
            if (l.mo23687g()) {
                return l;
            }
            throw new C7134v();
        }

        /* renamed from: h */
        public /* bridge */ /* synthetic */ C7081a.C7082a mo23692h(C7088d dVar, C7091f fVar) {
            mo23817n(dVar, fVar);
            return this;
        }

        /* renamed from: i */
        public C7095h.C7097b mo23693i() {
            C6679b bVar = new C6679b();
            bVar.mo23816m(mo23815l());
            return bVar;
        }

        /* renamed from: j */
        public /* bridge */ /* synthetic */ C7095h.C7097b mo23694j(C7095h hVar) {
            mo23816m((C6677s) hVar);
            return this;
        }

        /* renamed from: l */
        public C6677s mo23815l() {
            C6677s sVar = new C6677s(this, (C6581a) null);
            int i = this.f13446j;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            sVar.f13437j = this.f13447k;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            sVar.f13438k = this.f13448l;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            sVar.f13439l = this.f13449m;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            sVar.f13440m = this.f13450n;
            if ((i & 16) == 16) {
                this.f13451o = Collections.unmodifiableList(this.f13451o);
                this.f13446j &= -17;
            }
            sVar.f13441n = this.f13451o;
            if ((this.f13446j & 32) == 32) {
                this.f13452p = Collections.unmodifiableList(this.f13452p);
                this.f13446j &= -33;
            }
            sVar.f13442o = this.f13452p;
            sVar.f13436i = i2;
            return sVar;
        }

        /* renamed from: m */
        public C6679b mo23816m(C6677s sVar) {
            if (sVar == C6677s.f13433s) {
                return this;
            }
            int i = sVar.f13436i;
            boolean z = false;
            if ((i & 1) == 1) {
                int i2 = sVar.f13437j;
                this.f13446j |= 1;
                this.f13447k = i2;
            }
            if ((i & 2) == 2) {
                int i3 = sVar.f13438k;
                this.f13446j = 2 | this.f13446j;
                this.f13448l = i3;
            }
            if ((i & 4) == 4) {
                boolean z2 = sVar.f13439l;
                this.f13446j = 4 | this.f13446j;
                this.f13449m = z2;
            }
            if ((i & 8) == 8) {
                z = true;
            }
            if (z) {
                C6680c cVar = sVar.f13440m;
                Objects.requireNonNull(cVar);
                this.f13446j = 8 | this.f13446j;
                this.f13450n = cVar;
            }
            if (!sVar.f13441n.isEmpty()) {
                if (this.f13451o.isEmpty()) {
                    this.f13451o = sVar.f13441n;
                    this.f13446j &= -17;
                } else {
                    if ((this.f13446j & 16) != 16) {
                        this.f13451o = new ArrayList(this.f13451o);
                        this.f13446j |= 16;
                    }
                    this.f13451o.addAll(sVar.f13441n);
                }
            }
            if (!sVar.f13442o.isEmpty()) {
                if (this.f13452p.isEmpty()) {
                    this.f13452p = sVar.f13442o;
                    this.f13446j &= -33;
                } else {
                    if ((this.f13446j & 32) != 32) {
                        this.f13452p = new ArrayList(this.f13452p);
                        this.f13446j |= 32;
                    }
                    this.f13452p.addAll(sVar.f13442o);
                }
            }
            mo24678k(sVar);
            this.f14190g = this.f14190g.mo24607e(sVar.f13435h);
            return this;
        }

        /* renamed from: n */
        public C6679b mo23817n(C7088d dVar, C7091f fVar) {
            C6677s sVar;
            C6677s sVar2 = null;
            try {
                C6677s a = C6677s.f13434t.mo23688a(dVar, fVar);
                if (a != null) {
                    mo23816m(a);
                }
                return this;
            } catch (C7106j e) {
                sVar = (C6677s) e.f14209g;
                throw e;
            } catch (Throwable th) {
                th = th;
                sVar2 = sVar;
            }
            if (sVar2 != null) {
                mo23816m(sVar2);
            }
            throw th;
        }
    }

    /* renamed from: d.a.a.a.y0.e.s$c */
    public enum C6680c implements C7103i.C7104a {
        IN(0),
        OUT(1),
        INV(2);
        

        /* renamed from: g */
        public final int f13457g;

        /* access modifiers changed from: public */
        C6680c(int i) {
            this.f13457g = i;
        }

        /* renamed from: d */
        public static C6680c m12142d(int i) {
            if (i == 0) {
                return IN;
            }
            if (i == 1) {
                return OUT;
            }
            if (i != 2) {
                return null;
            }
            return INV;
        }

        /* renamed from: f */
        public final int mo23715f() {
            return this.f13457g;
        }
    }

    static {
        C6677s sVar = new C6677s();
        f13433s = sVar;
        sVar.mo23814t();
    }

    public C6677s() {
        this.f13443p = -1;
        this.f13444q = -1;
        this.f13445r = -1;
        this.f13435h = C7085c.f14160g;
    }

    public C6677s(C7088d dVar, C7091f fVar, C6581a aVar) {
        Object obj;
        List list;
        this.f13443p = -1;
        this.f13444q = -1;
        this.f13445r = -1;
        mo23814t();
        C7085c.C7087b B = C7085c.m12683B();
        C7089e k = C7089e.m12732k(B, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int o = dVar.mo24637o();
                if (o != 0) {
                    if (o == 8) {
                        this.f13436i |= 1;
                        this.f13437j = dVar.mo24634l();
                    } else if (o == 16) {
                        this.f13436i |= 2;
                        this.f13438k = dVar.mo24634l();
                    } else if (o == 24) {
                        this.f13436i |= 4;
                        this.f13439l = dVar.mo24627e();
                    } else if (o != 32) {
                        if (o == 42) {
                            if (!(z2 & true)) {
                                this.f13441n = new ArrayList();
                                z2 |= true;
                            }
                            list = this.f13441n;
                            obj = dVar.mo24630h(C6667q.f13354A, fVar);
                        } else if (o == 48) {
                            if (!(z2 & true)) {
                                this.f13442o = new ArrayList();
                                z2 |= true;
                            }
                            list = this.f13442o;
                            obj = Integer.valueOf(dVar.mo24634l());
                        } else if (o == 50) {
                            int d = dVar.mo24626d(dVar.mo24634l());
                            if (!(z2 & true) && dVar.mo24624b() > 0) {
                                this.f13442o = new ArrayList();
                                z2 |= true;
                            }
                            while (dVar.mo24624b() > 0) {
                                this.f13442o.add(Integer.valueOf(dVar.mo24634l()));
                            }
                            dVar.f14175i = d;
                            dVar.mo24638p();
                        } else if (!mo24685q(dVar, k, fVar, o)) {
                        }
                        list.add(obj);
                    } else {
                        int l = dVar.mo24634l();
                        C6680c d2 = C6680c.m12142d(l);
                        if (d2 == null) {
                            k.mo24658y(o);
                            k.mo24658y(l);
                        } else {
                            this.f13436i |= 8;
                            this.f13440m = d2;
                        }
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
                    this.f13441n = Collections.unmodifiableList(this.f13441n);
                }
                if (z2 & true) {
                    this.f13442o = Collections.unmodifiableList(this.f13442o);
                }
                try {
                    k.mo24644j();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f13435h = B.mo24619q();
                    throw th2;
                }
                this.f13435h = B.mo24619q();
                this.f14193g.mo24669i();
                throw th;
            }
        }
        if (z2 & true) {
            this.f13441n = Collections.unmodifiableList(this.f13441n);
        }
        if (z2 & true) {
            this.f13442o = Collections.unmodifiableList(this.f13442o);
        }
        try {
            k.mo24644j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f13435h = B.mo24619q();
            throw th3;
        }
        this.f13435h = B.mo24619q();
        this.f14193g.mo24669i();
    }

    /* renamed from: a */
    public int mo23683a() {
        int i = this.f13445r;
        if (i != -1) {
            return i;
        }
        int c = (this.f13436i & 1) == 1 ? C7089e.m12725c(1, this.f13437j) + 0 : 0;
        if ((this.f13436i & 2) == 2) {
            c += C7089e.m12725c(2, this.f13438k);
        }
        if ((this.f13436i & 4) == 4) {
            c += C7089e.m12731i(3) + 1;
        }
        if ((this.f13436i & 8) == 8) {
            c += C7089e.m12724b(4, this.f13440m.f13457g);
        }
        for (int i2 = 0; i2 < this.f13441n.size(); i2++) {
            c += C7089e.m12727e(5, this.f13441n.get(i2));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f13442o.size(); i4++) {
            i3 += C7089e.m12726d(this.f13442o.get(i4).intValue());
        }
        int i5 = c + i3;
        if (!this.f13442o.isEmpty()) {
            i5 = i5 + 1 + C7089e.m12726d(i3);
        }
        this.f13443p = i3;
        int size = this.f13435h.size() + mo24680k() + i5;
        this.f13445r = size;
        return size;
    }

    /* renamed from: b */
    public C7117p mo23743b() {
        return f13433s;
    }

    /* renamed from: c */
    public C7117p.C7118a mo23684c() {
        C6679b bVar = new C6679b();
        bVar.mo23816m(this);
        return bVar;
    }

    /* renamed from: d */
    public void mo23685d(C7089e eVar) {
        mo23683a();
        C7095h.C7099d<MessageType>.C0000a p = mo24684p();
        if ((this.f13436i & 1) == 1) {
            eVar.mo24649p(1, this.f13437j);
        }
        if ((this.f13436i & 2) == 2) {
            eVar.mo24649p(2, this.f13438k);
        }
        if ((this.f13436i & 4) == 4) {
            boolean z = this.f13439l;
            eVar.mo24658y(24);
            eVar.mo24653t(z ? 1 : 0);
        }
        if ((this.f13436i & 8) == 8) {
            eVar.mo24647n(4, this.f13440m.f13457g);
        }
        for (int i = 0; i < this.f13441n.size(); i++) {
            eVar.mo24651r(5, this.f13441n.get(i));
        }
        if (this.f13442o.size() > 0) {
            eVar.mo24658y(50);
            eVar.mo24658y(this.f13443p);
        }
        for (int i2 = 0; i2 < this.f13442o.size(); i2++) {
            eVar.mo24650q(this.f13442o.get(i2).intValue());
        }
        p.mo24687a(1000, eVar);
        eVar.mo24654u(this.f13435h);
    }

    /* renamed from: f */
    public C7117p.C7118a mo23686f() {
        return new C6679b();
    }

    /* renamed from: g */
    public final boolean mo23687g() {
        byte b = this.f13444q;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f13436i;
        if (!((i & 1) == 1)) {
            this.f13444q = 0;
            return false;
        }
        if (!((i & 2) == 2)) {
            this.f13444q = 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f13441n.size(); i2++) {
            if (!this.f13441n.get(i2).mo23687g()) {
                this.f13444q = 0;
                return false;
            }
        }
        if (!mo24679j()) {
            this.f13444q = 0;
            return false;
        }
        this.f13444q = 1;
        return true;
    }

    /* renamed from: t */
    public final void mo23814t() {
        this.f13437j = 0;
        this.f13438k = 0;
        this.f13439l = false;
        this.f13440m = C6680c.INV;
        this.f13441n = Collections.emptyList();
        this.f13442o = Collections.emptyList();
    }

    public C6677s(C7095h.C7098c cVar, C6581a aVar) {
        super(cVar);
        this.f13443p = -1;
        this.f13444q = -1;
        this.f13445r = -1;
        this.f13435h = cVar.f14190g;
    }
}
