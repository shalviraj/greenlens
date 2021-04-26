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
import p298d.p299a.p300a.p301a.p303y0.p389g.C7119q;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7120r;
import p298d.p299a.p300a.p301a.p303y0.p389g.C7134v;

/* renamed from: d.a.a.a.y0.e.o */
public final class C6657o extends C7095h implements C7119q {

    /* renamed from: k */
    public static final C6657o f13320k;

    /* renamed from: l */
    public static C7120r<C6657o> f13321l = new C6658a();

    /* renamed from: g */
    public final C7085c f13322g;

    /* renamed from: h */
    public List<C6660c> f13323h;

    /* renamed from: i */
    public byte f13324i;

    /* renamed from: j */
    public int f13325j;

    /* renamed from: d.a.a.a.y0.e.o$a */
    public static class C6658a extends C7084b<C6657o> {
        /* renamed from: a */
        public Object mo23688a(C7088d dVar, C7091f fVar) {
            return new C6657o(dVar, fVar, (C6581a) null);
        }
    }

    /* renamed from: d.a.a.a.y0.e.o$b */
    public static final class C6659b extends C7095h.C7097b<C6657o, C6659b> implements Object {

        /* renamed from: h */
        public int f13326h;

        /* renamed from: i */
        public List<C6660c> f13327i = Collections.emptyList();

        /* renamed from: H */
        public /* bridge */ /* synthetic */ C7117p.C7118a mo23689H(C7088d dVar, C7091f fVar) {
            mo23787m(dVar, fVar);
            return this;
        }

        public Object clone() {
            C6659b bVar = new C6659b();
            bVar.mo23786l(mo23785k());
            return bVar;
        }

        /* renamed from: e */
        public C7117p mo23691e() {
            C6657o k = mo23785k();
            if (k.mo23687g()) {
                return k;
            }
            throw new C7134v();
        }

        /* renamed from: h */
        public /* bridge */ /* synthetic */ C7081a.C7082a mo23692h(C7088d dVar, C7091f fVar) {
            mo23787m(dVar, fVar);
            return this;
        }

        /* renamed from: i */
        public C7095h.C7097b mo23693i() {
            C6659b bVar = new C6659b();
            bVar.mo23786l(mo23785k());
            return bVar;
        }

        /* renamed from: j */
        public /* bridge */ /* synthetic */ C7095h.C7097b mo23694j(C7095h hVar) {
            mo23786l((C6657o) hVar);
            return this;
        }

        /* renamed from: k */
        public C6657o mo23785k() {
            C6657o oVar = new C6657o(this, (C6581a) null);
            if ((this.f13326h & 1) == 1) {
                this.f13327i = Collections.unmodifiableList(this.f13327i);
                this.f13326h &= -2;
            }
            oVar.f13323h = this.f13327i;
            return oVar;
        }

        /* renamed from: l */
        public C6659b mo23786l(C6657o oVar) {
            if (oVar == C6657o.f13320k) {
                return this;
            }
            if (!oVar.f13323h.isEmpty()) {
                if (this.f13327i.isEmpty()) {
                    this.f13327i = oVar.f13323h;
                    this.f13326h &= -2;
                } else {
                    if ((this.f13326h & 1) != 1) {
                        this.f13327i = new ArrayList(this.f13327i);
                        this.f13326h |= 1;
                    }
                    this.f13327i.addAll(oVar.f13323h);
                }
            }
            this.f14190g = this.f14190g.mo24607e(oVar.f13322g);
            return this;
        }

        /* renamed from: m */
        public C6659b mo23787m(C7088d dVar, C7091f fVar) {
            C6657o oVar;
            C6657o oVar2 = null;
            try {
                C6657o a = C6657o.f13321l.mo23688a(dVar, fVar);
                if (a != null) {
                    mo23786l(a);
                }
                return this;
            } catch (C7106j e) {
                oVar = (C6657o) e.f14209g;
                throw e;
            } catch (Throwable th) {
                th = th;
                oVar2 = oVar;
            }
            if (oVar2 != null) {
                mo23786l(oVar2);
            }
            throw th;
        }
    }

    static {
        C6657o oVar = new C6657o();
        f13320k = oVar;
        oVar.f13323h = Collections.emptyList();
    }

    public C6657o() {
        this.f13324i = -1;
        this.f13325j = -1;
        this.f13322g = C7085c.f14160g;
    }

    public C6657o(C7088d dVar, C7091f fVar, C6581a aVar) {
        this.f13324i = -1;
        this.f13325j = -1;
        this.f13323h = Collections.emptyList();
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
                            this.f13323h = new ArrayList();
                            z2 |= true;
                        }
                        this.f13323h.add(dVar.mo24630h(C6660c.f13329o, fVar));
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
                    this.f13323h = Collections.unmodifiableList(this.f13323h);
                }
                try {
                    k.mo24644j();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f13322g = B.mo24619q();
                    throw th2;
                }
                this.f13322g = B.mo24619q();
                throw th;
            }
        }
        if (z2 && true) {
            this.f13323h = Collections.unmodifiableList(this.f13323h);
        }
        try {
            k.mo24644j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f13322g = B.mo24619q();
            throw th3;
        }
        this.f13322g = B.mo24619q();
    }

    /* renamed from: a */
    public int mo23683a() {
        int i = this.f13325j;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f13323h.size(); i3++) {
            i2 += C7089e.m12727e(1, this.f13323h.get(i3));
        }
        int size = this.f13322g.size() + i2;
        this.f13325j = size;
        return size;
    }

    /* renamed from: c */
    public C7117p.C7118a mo23684c() {
        C6659b bVar = new C6659b();
        bVar.mo23786l(this);
        return bVar;
    }

    /* renamed from: d */
    public void mo23685d(C7089e eVar) {
        mo23683a();
        for (int i = 0; i < this.f13323h.size(); i++) {
            eVar.mo24651r(1, this.f13323h.get(i));
        }
        eVar.mo24654u(this.f13322g);
    }

    /* renamed from: f */
    public C7117p.C7118a mo23686f() {
        return new C6659b();
    }

    /* renamed from: g */
    public final boolean mo23687g() {
        byte b = this.f13324i;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f13323h.size(); i++) {
            if (!this.f13323h.get(i).mo23687g()) {
                this.f13324i = 0;
                return false;
            }
        }
        this.f13324i = 1;
        return true;
    }

    public C6657o(C7095h.C7097b bVar, C6581a aVar) {
        super(bVar);
        this.f13324i = -1;
        this.f13325j = -1;
        this.f13322g = bVar.f14190g;
    }

    /* renamed from: d.a.a.a.y0.e.o$c */
    public static final class C6660c extends C7095h implements C7119q {

        /* renamed from: n */
        public static final C6660c f13328n;

        /* renamed from: o */
        public static C7120r<C6660c> f13329o = new C6661a();

        /* renamed from: g */
        public final C7085c f13330g;

        /* renamed from: h */
        public int f13331h;

        /* renamed from: i */
        public int f13332i;

        /* renamed from: j */
        public int f13333j;

        /* renamed from: k */
        public C6663c f13334k;

        /* renamed from: l */
        public byte f13335l;

        /* renamed from: m */
        public int f13336m;

        /* renamed from: d.a.a.a.y0.e.o$c$a */
        public static class C6661a extends C7084b<C6660c> {
            /* renamed from: a */
            public Object mo23688a(C7088d dVar, C7091f fVar) {
                return new C6660c(dVar, fVar, (C6581a) null);
            }
        }

        /* renamed from: d.a.a.a.y0.e.o$c$b */
        public static final class C6662b extends C7095h.C7097b<C6660c, C6662b> implements Object {

            /* renamed from: h */
            public int f13337h;

            /* renamed from: i */
            public int f13338i = -1;

            /* renamed from: j */
            public int f13339j;

            /* renamed from: k */
            public C6663c f13340k = C6663c.PACKAGE;

            /* renamed from: H */
            public /* bridge */ /* synthetic */ C7117p.C7118a mo23689H(C7088d dVar, C7091f fVar) {
                mo23790m(dVar, fVar);
                return this;
            }

            public Object clone() {
                C6662b bVar = new C6662b();
                bVar.mo23789l(mo23788k());
                return bVar;
            }

            /* renamed from: e */
            public C7117p mo23691e() {
                C6660c k = mo23788k();
                if (k.mo23687g()) {
                    return k;
                }
                throw new C7134v();
            }

            /* renamed from: h */
            public /* bridge */ /* synthetic */ C7081a.C7082a mo23692h(C7088d dVar, C7091f fVar) {
                mo23790m(dVar, fVar);
                return this;
            }

            /* renamed from: i */
            public C7095h.C7097b mo23693i() {
                C6662b bVar = new C6662b();
                bVar.mo23789l(mo23788k());
                return bVar;
            }

            /* renamed from: j */
            public /* bridge */ /* synthetic */ C7095h.C7097b mo23694j(C7095h hVar) {
                mo23789l((C6660c) hVar);
                return this;
            }

            /* renamed from: k */
            public C6660c mo23788k() {
                C6660c cVar = new C6660c(this, (C6581a) null);
                int i = this.f13337h;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                cVar.f13332i = this.f13338i;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                cVar.f13333j = this.f13339j;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                cVar.f13334k = this.f13340k;
                cVar.f13331h = i2;
                return cVar;
            }

            /* renamed from: l */
            public C6662b mo23789l(C6660c cVar) {
                if (cVar == C6660c.f13328n) {
                    return this;
                }
                int i = cVar.f13331h;
                boolean z = false;
                if ((i & 1) == 1) {
                    int i2 = cVar.f13332i;
                    this.f13337h |= 1;
                    this.f13338i = i2;
                }
                if ((i & 2) == 2) {
                    int i3 = cVar.f13333j;
                    this.f13337h = 2 | this.f13337h;
                    this.f13339j = i3;
                }
                if ((i & 4) == 4) {
                    z = true;
                }
                if (z) {
                    C6663c cVar2 = cVar.f13334k;
                    Objects.requireNonNull(cVar2);
                    this.f13337h = 4 | this.f13337h;
                    this.f13340k = cVar2;
                }
                this.f14190g = this.f14190g.mo24607e(cVar.f13330g);
                return this;
            }

            /* renamed from: m */
            public C6662b mo23790m(C7088d dVar, C7091f fVar) {
                C6660c cVar;
                C6660c cVar2 = null;
                try {
                    C6660c a = C6660c.f13329o.mo23688a(dVar, fVar);
                    if (a != null) {
                        mo23789l(a);
                    }
                    return this;
                } catch (C7106j e) {
                    cVar = (C6660c) e.f14209g;
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    cVar2 = cVar;
                }
                if (cVar2 != null) {
                    mo23789l(cVar2);
                }
                throw th;
            }
        }

        /* renamed from: d.a.a.a.y0.e.o$c$c */
        public enum C6663c implements C7103i.C7104a {
            CLASS(0),
            PACKAGE(1),
            LOCAL(2);
            

            /* renamed from: g */
            public final int f13345g;

            /* access modifiers changed from: public */
            C6663c(int i) {
                this.f13345g = i;
            }

            /* renamed from: d */
            public static C6663c m12052d(int i) {
                if (i == 0) {
                    return CLASS;
                }
                if (i == 1) {
                    return PACKAGE;
                }
                if (i != 2) {
                    return null;
                }
                return LOCAL;
            }

            /* renamed from: f */
            public final int mo23715f() {
                return this.f13345g;
            }
        }

        static {
            C6660c cVar = new C6660c();
            f13328n = cVar;
            cVar.f13332i = -1;
            cVar.f13333j = 0;
            cVar.f13334k = C6663c.PACKAGE;
        }

        public C6660c() {
            this.f13335l = -1;
            this.f13336m = -1;
            this.f13330g = C7085c.f14160g;
        }

        public C6660c(C7088d dVar, C7091f fVar, C6581a aVar) {
            this.f13335l = -1;
            this.f13336m = -1;
            this.f13332i = -1;
            boolean z = false;
            this.f13333j = 0;
            this.f13334k = C6663c.PACKAGE;
            C7085c.C7087b B = C7085c.m12683B();
            C7089e k = C7089e.m12732k(B, 1);
            while (!z) {
                try {
                    int o = dVar.mo24637o();
                    if (o != 0) {
                        if (o == 8) {
                            this.f13331h |= 1;
                            this.f13332i = dVar.mo24634l();
                        } else if (o == 16) {
                            this.f13331h |= 2;
                            this.f13333j = dVar.mo24634l();
                        } else if (o == 24) {
                            int l = dVar.mo24634l();
                            C6663c d = C6663c.m12052d(l);
                            if (d == null) {
                                k.mo24658y(o);
                                k.mo24658y(l);
                            } else {
                                this.f13331h |= 4;
                                this.f13334k = d;
                            }
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
                    try {
                        k.mo24644j();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f13330g = B.mo24619q();
                        throw th2;
                    }
                    this.f13330g = B.mo24619q();
                    throw th;
                }
            }
            try {
                k.mo24644j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f13330g = B.mo24619q();
                throw th3;
            }
            this.f13330g = B.mo24619q();
        }

        /* renamed from: a */
        public int mo23683a() {
            int i = this.f13336m;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f13331h & 1) == 1) {
                i2 = 0 + C7089e.m12725c(1, this.f13332i);
            }
            if ((this.f13331h & 2) == 2) {
                i2 += C7089e.m12725c(2, this.f13333j);
            }
            if ((this.f13331h & 4) == 4) {
                i2 += C7089e.m12724b(3, this.f13334k.f13345g);
            }
            int size = this.f13330g.size() + i2;
            this.f13336m = size;
            return size;
        }

        /* renamed from: c */
        public C7117p.C7118a mo23684c() {
            C6662b bVar = new C6662b();
            bVar.mo23789l(this);
            return bVar;
        }

        /* renamed from: d */
        public void mo23685d(C7089e eVar) {
            mo23683a();
            if ((this.f13331h & 1) == 1) {
                eVar.mo24649p(1, this.f13332i);
            }
            if ((this.f13331h & 2) == 2) {
                eVar.mo24649p(2, this.f13333j);
            }
            if ((this.f13331h & 4) == 4) {
                eVar.mo24647n(3, this.f13334k.f13345g);
            }
            eVar.mo24654u(this.f13330g);
        }

        /* renamed from: f */
        public C7117p.C7118a mo23686f() {
            return new C6662b();
        }

        /* renamed from: g */
        public final boolean mo23687g() {
            byte b = this.f13335l;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!((this.f13331h & 2) == 2)) {
                this.f13335l = 0;
                return false;
            }
            this.f13335l = 1;
            return true;
        }

        public C6660c(C7095h.C7097b bVar, C6581a aVar) {
            super(bVar);
            this.f13335l = -1;
            this.f13336m = -1;
            this.f13330g = bVar.f14190g;
        }
    }
}
