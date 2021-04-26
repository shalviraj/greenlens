package p298d.p299a.p300a.p301a.p303y0.p326e;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6667q;
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

/* renamed from: d.a.a.a.y0.e.r */
public final class C6674r extends C7095h.C7099d<C6674r> implements Object {

    /* renamed from: u */
    public static final C6674r f13408u;

    /* renamed from: v */
    public static C7120r<C6674r> f13409v = new C6675a();

    /* renamed from: h */
    public final C7085c f13410h;

    /* renamed from: i */
    public int f13411i;

    /* renamed from: j */
    public int f13412j;

    /* renamed from: k */
    public int f13413k;

    /* renamed from: l */
    public List<C6677s> f13414l;

    /* renamed from: m */
    public C6667q f13415m;

    /* renamed from: n */
    public int f13416n;

    /* renamed from: o */
    public C6667q f13417o;

    /* renamed from: p */
    public int f13418p;

    /* renamed from: q */
    public List<C6611b> f13419q;

    /* renamed from: r */
    public List<Integer> f13420r;

    /* renamed from: s */
    public byte f13421s;

    /* renamed from: t */
    public int f13422t;

    /* renamed from: d.a.a.a.y0.e.r$a */
    public static class C6675a extends C7084b<C6674r> {
        /* renamed from: a */
        public Object mo23688a(C7088d dVar, C7091f fVar) {
            return new C6674r(dVar, fVar, (C6581a) null);
        }
    }

    /* renamed from: d.a.a.a.y0.e.r$b */
    public static final class C6676b extends C7095h.C7098c<C6674r, C6676b> implements Object {

        /* renamed from: j */
        public int f13423j;

        /* renamed from: k */
        public int f13424k = 6;

        /* renamed from: l */
        public int f13425l;

        /* renamed from: m */
        public List<C6677s> f13426m = Collections.emptyList();

        /* renamed from: n */
        public C6667q f13427n;

        /* renamed from: o */
        public int f13428o;

        /* renamed from: p */
        public C6667q f13429p;

        /* renamed from: q */
        public int f13430q;

        /* renamed from: r */
        public List<C6611b> f13431r;

        /* renamed from: s */
        public List<Integer> f13432s;

        public C6676b() {
            C6667q qVar = C6667q.f13355z;
            this.f13427n = qVar;
            this.f13429p = qVar;
            this.f13431r = Collections.emptyList();
            this.f13432s = Collections.emptyList();
        }

        /* renamed from: H */
        public /* bridge */ /* synthetic */ C7117p.C7118a mo23689H(C7088d dVar, C7091f fVar) {
            mo23813n(dVar, fVar);
            return this;
        }

        public Object clone() {
            C6676b bVar = new C6676b();
            bVar.mo23812m(mo23811l());
            return bVar;
        }

        /* renamed from: e */
        public C7117p mo23691e() {
            C6674r l = mo23811l();
            if (l.mo23687g()) {
                return l;
            }
            throw new C7134v();
        }

        /* renamed from: h */
        public /* bridge */ /* synthetic */ C7081a.C7082a mo23692h(C7088d dVar, C7091f fVar) {
            mo23813n(dVar, fVar);
            return this;
        }

        /* renamed from: i */
        public C7095h.C7097b mo23693i() {
            C6676b bVar = new C6676b();
            bVar.mo23812m(mo23811l());
            return bVar;
        }

        /* renamed from: j */
        public /* bridge */ /* synthetic */ C7095h.C7097b mo23694j(C7095h hVar) {
            mo23812m((C6674r) hVar);
            return this;
        }

        /* renamed from: l */
        public C6674r mo23811l() {
            C6674r rVar = new C6674r(this, (C6581a) null);
            int i = this.f13423j;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            rVar.f13412j = this.f13424k;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            rVar.f13413k = this.f13425l;
            if ((i & 4) == 4) {
                this.f13426m = Collections.unmodifiableList(this.f13426m);
                this.f13423j &= -5;
            }
            rVar.f13414l = this.f13426m;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            rVar.f13415m = this.f13427n;
            if ((i & 16) == 16) {
                i2 |= 8;
            }
            rVar.f13416n = this.f13428o;
            if ((i & 32) == 32) {
                i2 |= 16;
            }
            rVar.f13417o = this.f13429p;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            rVar.f13418p = this.f13430q;
            if ((this.f13423j & 128) == 128) {
                this.f13431r = Collections.unmodifiableList(this.f13431r);
                this.f13423j &= -129;
            }
            rVar.f13419q = this.f13431r;
            if ((this.f13423j & 256) == 256) {
                this.f13432s = Collections.unmodifiableList(this.f13432s);
                this.f13423j &= -257;
            }
            rVar.f13420r = this.f13432s;
            rVar.f13411i = i2;
            return rVar;
        }

        /* renamed from: m */
        public C6676b mo23812m(C6674r rVar) {
            C6667q qVar;
            C6667q qVar2;
            if (rVar == C6674r.f13408u) {
                return this;
            }
            int i = rVar.f13411i;
            boolean z = false;
            if ((i & 1) == 1) {
                int i2 = rVar.f13412j;
                this.f13423j |= 1;
                this.f13424k = i2;
            }
            if ((i & 2) == 2) {
                int i3 = rVar.f13413k;
                this.f13423j = 2 | this.f13423j;
                this.f13425l = i3;
            }
            if (!rVar.f13414l.isEmpty()) {
                if (this.f13426m.isEmpty()) {
                    this.f13426m = rVar.f13414l;
                    this.f13423j &= -5;
                } else {
                    if ((this.f13423j & 4) != 4) {
                        this.f13426m = new ArrayList(this.f13426m);
                        this.f13423j |= 4;
                    }
                    this.f13426m.addAll(rVar.f13414l);
                }
            }
            if (rVar.mo23809v()) {
                C6667q qVar3 = rVar.f13415m;
                if ((this.f13423j & 8) == 8 && (qVar2 = this.f13427n) != C6667q.f13355z) {
                    qVar3 = C0843a.m427C(qVar2, qVar3);
                }
                this.f13427n = qVar3;
                this.f13423j |= 8;
            }
            if ((rVar.f13411i & 8) == 8) {
                int i4 = rVar.f13416n;
                this.f13423j |= 16;
                this.f13428o = i4;
            }
            if (rVar.mo23808t()) {
                C6667q qVar4 = rVar.f13417o;
                if ((this.f13423j & 32) == 32 && (qVar = this.f13429p) != C6667q.f13355z) {
                    qVar4 = C0843a.m427C(qVar, qVar4);
                }
                this.f13429p = qVar4;
                this.f13423j |= 32;
            }
            if ((rVar.f13411i & 32) == 32) {
                z = true;
            }
            if (z) {
                int i5 = rVar.f13418p;
                this.f13423j |= 64;
                this.f13430q = i5;
            }
            if (!rVar.f13419q.isEmpty()) {
                if (this.f13431r.isEmpty()) {
                    this.f13431r = rVar.f13419q;
                    this.f13423j &= -129;
                } else {
                    if ((this.f13423j & 128) != 128) {
                        this.f13431r = new ArrayList(this.f13431r);
                        this.f13423j |= 128;
                    }
                    this.f13431r.addAll(rVar.f13419q);
                }
            }
            if (!rVar.f13420r.isEmpty()) {
                if (this.f13432s.isEmpty()) {
                    this.f13432s = rVar.f13420r;
                    this.f13423j &= -257;
                } else {
                    if ((this.f13423j & 256) != 256) {
                        this.f13432s = new ArrayList(this.f13432s);
                        this.f13423j |= 256;
                    }
                    this.f13432s.addAll(rVar.f13420r);
                }
            }
            mo24678k(rVar);
            this.f14190g = this.f14190g.mo24607e(rVar.f13410h);
            return this;
        }

        /* renamed from: n */
        public C6676b mo23813n(C7088d dVar, C7091f fVar) {
            C6674r rVar;
            C6674r rVar2 = null;
            try {
                C6674r a = C6674r.f13409v.mo23688a(dVar, fVar);
                if (a != null) {
                    mo23812m(a);
                }
                return this;
            } catch (C7106j e) {
                rVar = (C6674r) e.f14209g;
                throw e;
            } catch (Throwable th) {
                th = th;
                rVar2 = rVar;
            }
            if (rVar2 != null) {
                mo23812m(rVar2);
            }
            throw th;
        }
    }

    static {
        C6674r rVar = new C6674r();
        f13408u = rVar;
        rVar.mo23810w();
    }

    public C6674r() {
        this.f13421s = -1;
        this.f13422t = -1;
        this.f13410h = C7085c.f14160g;
    }

    public C6674r(C7088d dVar, C7091f fVar, C6581a aVar) {
        Object obj;
        List list;
        C7120r rVar;
        this.f13421s = -1;
        this.f13422t = -1;
        mo23810w();
        C7085c.C7087b B = C7085c.m12683B();
        C7089e k = C7089e.m12732k(B, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int o = dVar.mo24637o();
                C6667q.C6673c cVar = null;
                switch (o) {
                    case 0:
                        z = true;
                        continue;
                    case 8:
                        this.f13411i |= 1;
                        this.f13412j = dVar.mo24634l();
                        continue;
                    case 16:
                        this.f13411i |= 2;
                        this.f13413k = dVar.mo24634l();
                        continue;
                    case 26:
                        if (!(z2 & true)) {
                            this.f13414l = new ArrayList();
                            z2 |= true;
                        }
                        list = this.f13414l;
                        rVar = C6677s.f13434t;
                        break;
                    case 34:
                        cVar = (this.f13411i & 4) == 4 ? this.f13415m.mo23684c() : cVar;
                        C6667q qVar = (C6667q) dVar.mo24630h(C6667q.f13354A, fVar);
                        this.f13415m = qVar;
                        if (cVar != null) {
                            cVar.mo23694j(qVar);
                            this.f13415m = cVar.mo23805l();
                        }
                        this.f13411i |= 4;
                        continue;
                    case 40:
                        this.f13411i |= 8;
                        this.f13416n = dVar.mo24634l();
                        continue;
                    case 50:
                        cVar = (this.f13411i & 16) == 16 ? this.f13417o.mo23684c() : cVar;
                        C6667q qVar2 = (C6667q) dVar.mo24630h(C6667q.f13354A, fVar);
                        this.f13417o = qVar2;
                        if (cVar != null) {
                            cVar.mo23694j(qVar2);
                            this.f13417o = cVar.mo23805l();
                        }
                        this.f13411i |= 16;
                        continue;
                    case 56:
                        this.f13411i |= 32;
                        this.f13418p = dVar.mo24634l();
                        continue;
                    case 66:
                        if (!(z2 & true)) {
                            this.f13419q = new ArrayList();
                            z2 |= true;
                        }
                        list = this.f13419q;
                        rVar = C6611b.f13017n;
                        break;
                    case 248:
                        if (!(z2 & true)) {
                            this.f13420r = new ArrayList();
                            z2 |= true;
                        }
                        list = this.f13420r;
                        obj = Integer.valueOf(dVar.mo24634l());
                        break;
                    case 250:
                        int d = dVar.mo24626d(dVar.mo24634l());
                        if (!(z2 & true) && dVar.mo24624b() > 0) {
                            this.f13420r = new ArrayList();
                            z2 |= true;
                        }
                        while (dVar.mo24624b() > 0) {
                            this.f13420r.add(Integer.valueOf(dVar.mo24634l()));
                        }
                        dVar.f14175i = d;
                        dVar.mo24638p();
                        continue;
                    default:
                        if (mo24685q(dVar, k, fVar, o)) {
                            continue;
                        }
                        z = true;
                        continue;
                }
                obj = dVar.mo24630h(rVar, fVar);
                list.add(obj);
            } catch (C7106j e) {
                e.f14209g = this;
                throw e;
            } catch (IOException e2) {
                C7106j jVar = new C7106j(e2.getMessage());
                jVar.f14209g = this;
                throw jVar;
            } catch (Throwable th) {
                if (z2 & true) {
                    this.f13414l = Collections.unmodifiableList(this.f13414l);
                }
                if (z2 & true) {
                    this.f13419q = Collections.unmodifiableList(this.f13419q);
                }
                if (z2 & true) {
                    this.f13420r = Collections.unmodifiableList(this.f13420r);
                }
                try {
                    k.mo24644j();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f13410h = B.mo24619q();
                    throw th2;
                }
                this.f13410h = B.mo24619q();
                this.f14193g.mo24669i();
                throw th;
            }
        }
        if (z2 & true) {
            this.f13414l = Collections.unmodifiableList(this.f13414l);
        }
        if (z2 & true) {
            this.f13419q = Collections.unmodifiableList(this.f13419q);
        }
        if (z2 & true) {
            this.f13420r = Collections.unmodifiableList(this.f13420r);
        }
        try {
            k.mo24644j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f13410h = B.mo24619q();
            throw th3;
        }
        this.f13410h = B.mo24619q();
        this.f14193g.mo24669i();
    }

    /* renamed from: a */
    public int mo23683a() {
        int i = this.f13422t;
        if (i != -1) {
            return i;
        }
        int c = (this.f13411i & 1) == 1 ? C7089e.m12725c(1, this.f13412j) + 0 : 0;
        if ((this.f13411i & 2) == 2) {
            c += C7089e.m12725c(2, this.f13413k);
        }
        for (int i2 = 0; i2 < this.f13414l.size(); i2++) {
            c += C7089e.m12727e(3, this.f13414l.get(i2));
        }
        if ((this.f13411i & 4) == 4) {
            c += C7089e.m12727e(4, this.f13415m);
        }
        if ((this.f13411i & 8) == 8) {
            c += C7089e.m12725c(5, this.f13416n);
        }
        if ((this.f13411i & 16) == 16) {
            c += C7089e.m12727e(6, this.f13417o);
        }
        if ((this.f13411i & 32) == 32) {
            c += C7089e.m12725c(7, this.f13418p);
        }
        for (int i3 = 0; i3 < this.f13419q.size(); i3++) {
            c += C7089e.m12727e(8, this.f13419q.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f13420r.size(); i5++) {
            i4 += C7089e.m12726d(this.f13420r.get(i5).intValue());
        }
        int size = this.f13410h.size() + mo24680k() + (this.f13420r.size() * 2) + c + i4;
        this.f13422t = size;
        return size;
    }

    /* renamed from: b */
    public C7117p mo23743b() {
        return f13408u;
    }

    /* renamed from: c */
    public C7117p.C7118a mo23684c() {
        C6676b bVar = new C6676b();
        bVar.mo23812m(this);
        return bVar;
    }

    /* renamed from: d */
    public void mo23685d(C7089e eVar) {
        mo23683a();
        C7095h.C7099d<MessageType>.C0000a p = mo24684p();
        if ((this.f13411i & 1) == 1) {
            eVar.mo24649p(1, this.f13412j);
        }
        if ((this.f13411i & 2) == 2) {
            eVar.mo24649p(2, this.f13413k);
        }
        for (int i = 0; i < this.f13414l.size(); i++) {
            eVar.mo24651r(3, this.f13414l.get(i));
        }
        if ((this.f13411i & 4) == 4) {
            eVar.mo24651r(4, this.f13415m);
        }
        if ((this.f13411i & 8) == 8) {
            eVar.mo24649p(5, this.f13416n);
        }
        if ((this.f13411i & 16) == 16) {
            eVar.mo24651r(6, this.f13417o);
        }
        if ((this.f13411i & 32) == 32) {
            eVar.mo24649p(7, this.f13418p);
        }
        for (int i2 = 0; i2 < this.f13419q.size(); i2++) {
            eVar.mo24651r(8, this.f13419q.get(i2));
        }
        for (int i3 = 0; i3 < this.f13420r.size(); i3++) {
            eVar.mo24649p(31, this.f13420r.get(i3).intValue());
        }
        p.mo24687a(200, eVar);
        eVar.mo24654u(this.f13410h);
    }

    /* renamed from: f */
    public C7117p.C7118a mo23686f() {
        return new C6676b();
    }

    /* renamed from: g */
    public final boolean mo23687g() {
        byte b = this.f13421s;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!((this.f13411i & 2) == 2)) {
            this.f13421s = 0;
            return false;
        }
        for (int i = 0; i < this.f13414l.size(); i++) {
            if (!this.f13414l.get(i).mo23687g()) {
                this.f13421s = 0;
                return false;
            }
        }
        if (mo23809v() && !this.f13415m.mo23687g()) {
            this.f13421s = 0;
            return false;
        } else if (!mo23808t() || this.f13417o.mo23687g()) {
            for (int i2 = 0; i2 < this.f13419q.size(); i2++) {
                if (!this.f13419q.get(i2).mo23687g()) {
                    this.f13421s = 0;
                    return false;
                }
            }
            if (!mo24679j()) {
                this.f13421s = 0;
                return false;
            }
            this.f13421s = 1;
            return true;
        } else {
            this.f13421s = 0;
            return false;
        }
    }

    /* renamed from: t */
    public boolean mo23808t() {
        return (this.f13411i & 16) == 16;
    }

    /* renamed from: v */
    public boolean mo23809v() {
        return (this.f13411i & 4) == 4;
    }

    /* renamed from: w */
    public final void mo23810w() {
        this.f13412j = 6;
        this.f13413k = 0;
        this.f13414l = Collections.emptyList();
        C6667q qVar = C6667q.f13355z;
        this.f13415m = qVar;
        this.f13416n = 0;
        this.f13417o = qVar;
        this.f13418p = 0;
        this.f13419q = Collections.emptyList();
        this.f13420r = Collections.emptyList();
    }

    public C6674r(C7095h.C7098c cVar, C6581a aVar) {
        super(cVar);
        this.f13421s = -1;
        this.f13422t = -1;
        this.f13410h = cVar.f14190g;
    }
}
