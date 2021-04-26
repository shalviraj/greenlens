package p298d.p299a.p300a.p301a.p303y0.p326e;

import java.io.IOException;
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

/* renamed from: d.a.a.a.y0.e.u */
public final class C6684u extends C7095h.C7099d<C6684u> implements Object {

    /* renamed from: r */
    public static final C6684u f13469r;

    /* renamed from: s */
    public static C7120r<C6684u> f13470s = new C6685a();

    /* renamed from: h */
    public final C7085c f13471h;

    /* renamed from: i */
    public int f13472i;

    /* renamed from: j */
    public int f13473j;

    /* renamed from: k */
    public int f13474k;

    /* renamed from: l */
    public C6667q f13475l;

    /* renamed from: m */
    public int f13476m;

    /* renamed from: n */
    public C6667q f13477n;

    /* renamed from: o */
    public int f13478o;

    /* renamed from: p */
    public byte f13479p;

    /* renamed from: q */
    public int f13480q;

    /* renamed from: d.a.a.a.y0.e.u$a */
    public static class C6685a extends C7084b<C6684u> {
        /* renamed from: a */
        public Object mo23688a(C7088d dVar, C7091f fVar) {
            return new C6684u(dVar, fVar, (C6581a) null);
        }
    }

    /* renamed from: d.a.a.a.y0.e.u$b */
    public static final class C6686b extends C7095h.C7098c<C6684u, C6686b> implements Object {

        /* renamed from: j */
        public int f13481j;

        /* renamed from: k */
        public int f13482k;

        /* renamed from: l */
        public int f13483l;

        /* renamed from: m */
        public C6667q f13484m;

        /* renamed from: n */
        public int f13485n;

        /* renamed from: o */
        public C6667q f13486o;

        /* renamed from: p */
        public int f13487p;

        public C6686b() {
            C6667q qVar = C6667q.f13355z;
            this.f13484m = qVar;
            this.f13486o = qVar;
        }

        /* renamed from: H */
        public /* bridge */ /* synthetic */ C7117p.C7118a mo23689H(C7088d dVar, C7091f fVar) {
            mo23826n(dVar, fVar);
            return this;
        }

        public Object clone() {
            C6686b bVar = new C6686b();
            bVar.mo23825m(mo23824l());
            return bVar;
        }

        /* renamed from: e */
        public C7117p mo23691e() {
            C6684u l = mo23824l();
            if (l.mo23687g()) {
                return l;
            }
            throw new C7134v();
        }

        /* renamed from: h */
        public /* bridge */ /* synthetic */ C7081a.C7082a mo23692h(C7088d dVar, C7091f fVar) {
            mo23826n(dVar, fVar);
            return this;
        }

        /* renamed from: i */
        public C7095h.C7097b mo23693i() {
            C6686b bVar = new C6686b();
            bVar.mo23825m(mo23824l());
            return bVar;
        }

        /* renamed from: j */
        public /* bridge */ /* synthetic */ C7095h.C7097b mo23694j(C7095h hVar) {
            mo23825m((C6684u) hVar);
            return this;
        }

        /* renamed from: l */
        public C6684u mo23824l() {
            C6684u uVar = new C6684u(this, (C6581a) null);
            int i = this.f13481j;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            uVar.f13473j = this.f13482k;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            uVar.f13474k = this.f13483l;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            uVar.f13475l = this.f13484m;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            uVar.f13476m = this.f13485n;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            uVar.f13477n = this.f13486o;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            uVar.f13478o = this.f13487p;
            uVar.f13472i = i2;
            return uVar;
        }

        /* renamed from: m */
        public C6686b mo23825m(C6684u uVar) {
            C6667q qVar;
            C6667q qVar2;
            if (uVar == C6684u.f13469r) {
                return this;
            }
            int i = uVar.f13472i;
            boolean z = false;
            if ((i & 1) == 1) {
                int i2 = uVar.f13473j;
                this.f13481j |= 1;
                this.f13482k = i2;
            }
            if ((i & 2) == 2) {
                int i3 = uVar.f13474k;
                this.f13481j = 2 | this.f13481j;
                this.f13483l = i3;
            }
            if (uVar.mo23822t()) {
                C6667q qVar3 = uVar.f13475l;
                if ((this.f13481j & 4) == 4 && (qVar2 = this.f13484m) != C6667q.f13355z) {
                    qVar3 = C0843a.m427C(qVar2, qVar3);
                }
                this.f13484m = qVar3;
                this.f13481j |= 4;
            }
            if ((uVar.f13472i & 8) == 8) {
                int i4 = uVar.f13476m;
                this.f13481j = 8 | this.f13481j;
                this.f13485n = i4;
            }
            if (uVar.mo23823v()) {
                C6667q qVar4 = uVar.f13477n;
                if ((this.f13481j & 16) == 16 && (qVar = this.f13486o) != C6667q.f13355z) {
                    qVar4 = C0843a.m427C(qVar, qVar4);
                }
                this.f13486o = qVar4;
                this.f13481j |= 16;
            }
            if ((uVar.f13472i & 32) == 32) {
                z = true;
            }
            if (z) {
                int i5 = uVar.f13478o;
                this.f13481j = 32 | this.f13481j;
                this.f13487p = i5;
            }
            mo24678k(uVar);
            this.f14190g = this.f14190g.mo24607e(uVar.f13471h);
            return this;
        }

        /* renamed from: n */
        public C6686b mo23826n(C7088d dVar, C7091f fVar) {
            C6684u uVar;
            C6684u uVar2 = null;
            try {
                C6684u a = C6684u.f13470s.mo23688a(dVar, fVar);
                if (a != null) {
                    mo23825m(a);
                }
                return this;
            } catch (C7106j e) {
                uVar = (C6684u) e.f14209g;
                throw e;
            } catch (Throwable th) {
                th = th;
                uVar2 = uVar;
            }
            if (uVar2 != null) {
                mo23825m(uVar2);
            }
            throw th;
        }
    }

    static {
        C6684u uVar = new C6684u();
        f13469r = uVar;
        uVar.f13473j = 0;
        uVar.f13474k = 0;
        C6667q qVar = C6667q.f13355z;
        uVar.f13475l = qVar;
        uVar.f13476m = 0;
        uVar.f13477n = qVar;
        uVar.f13478o = 0;
    }

    public C6684u() {
        this.f13479p = -1;
        this.f13480q = -1;
        this.f13471h = C7085c.f14160g;
    }

    public C6684u(C7088d dVar, C7091f fVar, C6581a aVar) {
        this.f13479p = -1;
        this.f13480q = -1;
        boolean z = false;
        this.f13473j = 0;
        this.f13474k = 0;
        C6667q qVar = C6667q.f13355z;
        this.f13475l = qVar;
        this.f13476m = 0;
        this.f13477n = qVar;
        this.f13478o = 0;
        C7085c.C7087b B = C7085c.m12683B();
        C7089e k = C7089e.m12732k(B, 1);
        while (!z) {
            try {
                int o = dVar.mo24637o();
                if (o != 0) {
                    if (o == 8) {
                        this.f13472i |= 1;
                        this.f13473j = dVar.mo24634l();
                    } else if (o != 16) {
                        C6667q.C6673c cVar = null;
                        if (o == 26) {
                            cVar = (this.f13472i & 4) == 4 ? this.f13475l.mo23684c() : cVar;
                            C6667q qVar2 = (C6667q) dVar.mo24630h(C6667q.f13354A, fVar);
                            this.f13475l = qVar2;
                            if (cVar != null) {
                                cVar.mo23694j(qVar2);
                                this.f13475l = cVar.mo23805l();
                            }
                            this.f13472i |= 4;
                        } else if (o == 34) {
                            cVar = (this.f13472i & 16) == 16 ? this.f13477n.mo23684c() : cVar;
                            C6667q qVar3 = (C6667q) dVar.mo24630h(C6667q.f13354A, fVar);
                            this.f13477n = qVar3;
                            if (cVar != null) {
                                cVar.mo23694j(qVar3);
                                this.f13477n = cVar.mo23805l();
                            }
                            this.f13472i |= 16;
                        } else if (o == 40) {
                            this.f13472i |= 8;
                            this.f13476m = dVar.mo24634l();
                        } else if (o == 48) {
                            this.f13472i |= 32;
                            this.f13478o = dVar.mo24634l();
                        } else if (!mo24685q(dVar, k, fVar, o)) {
                        }
                    } else {
                        this.f13472i |= 2;
                        this.f13474k = dVar.mo24634l();
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
                    this.f13471h = B.mo24619q();
                    throw th2;
                }
                this.f13471h = B.mo24619q();
                this.f14193g.mo24669i();
                throw th;
            }
        }
        try {
            k.mo24644j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f13471h = B.mo24619q();
            throw th3;
        }
        this.f13471h = B.mo24619q();
        this.f14193g.mo24669i();
    }

    /* renamed from: a */
    public int mo23683a() {
        int i = this.f13480q;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.f13472i & 1) == 1) {
            i2 = 0 + C7089e.m12725c(1, this.f13473j);
        }
        if ((this.f13472i & 2) == 2) {
            i2 += C7089e.m12725c(2, this.f13474k);
        }
        if ((this.f13472i & 4) == 4) {
            i2 += C7089e.m12727e(3, this.f13475l);
        }
        if ((this.f13472i & 16) == 16) {
            i2 += C7089e.m12727e(4, this.f13477n);
        }
        if ((this.f13472i & 8) == 8) {
            i2 += C7089e.m12725c(5, this.f13476m);
        }
        if ((this.f13472i & 32) == 32) {
            i2 += C7089e.m12725c(6, this.f13478o);
        }
        int size = this.f13471h.size() + mo24680k() + i2;
        this.f13480q = size;
        return size;
    }

    /* renamed from: b */
    public C7117p mo23743b() {
        return f13469r;
    }

    /* renamed from: c */
    public C7117p.C7118a mo23684c() {
        C6686b bVar = new C6686b();
        bVar.mo23825m(this);
        return bVar;
    }

    /* renamed from: d */
    public void mo23685d(C7089e eVar) {
        mo23683a();
        C7095h.C7099d<MessageType>.C0000a p = mo24684p();
        if ((this.f13472i & 1) == 1) {
            eVar.mo24649p(1, this.f13473j);
        }
        if ((this.f13472i & 2) == 2) {
            eVar.mo24649p(2, this.f13474k);
        }
        if ((this.f13472i & 4) == 4) {
            eVar.mo24651r(3, this.f13475l);
        }
        if ((this.f13472i & 16) == 16) {
            eVar.mo24651r(4, this.f13477n);
        }
        if ((this.f13472i & 8) == 8) {
            eVar.mo24649p(5, this.f13476m);
        }
        if ((this.f13472i & 32) == 32) {
            eVar.mo24649p(6, this.f13478o);
        }
        p.mo24687a(200, eVar);
        eVar.mo24654u(this.f13471h);
    }

    /* renamed from: f */
    public C7117p.C7118a mo23686f() {
        return new C6686b();
    }

    /* renamed from: g */
    public final boolean mo23687g() {
        byte b = this.f13479p;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!((this.f13472i & 2) == 2)) {
            this.f13479p = 0;
            return false;
        } else if (mo23822t() && !this.f13475l.mo23687g()) {
            this.f13479p = 0;
            return false;
        } else if (mo23823v() && !this.f13477n.mo23687g()) {
            this.f13479p = 0;
            return false;
        } else if (!mo24679j()) {
            this.f13479p = 0;
            return false;
        } else {
            this.f13479p = 1;
            return true;
        }
    }

    /* renamed from: t */
    public boolean mo23822t() {
        return (this.f13472i & 4) == 4;
    }

    /* renamed from: v */
    public boolean mo23823v() {
        return (this.f13472i & 16) == 16;
    }

    public C6684u(C7095h.C7098c cVar, C6581a aVar) {
        super(cVar);
        this.f13479p = -1;
        this.f13480q = -1;
        this.f13471h = cVar.f14190g;
    }
}
