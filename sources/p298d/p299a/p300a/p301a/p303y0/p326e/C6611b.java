package p298d.p299a.p300a.p301a.p303y0.p326e;

import com.google.android.material.shadow.ShadowDrawableWrapper;
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

/* renamed from: d.a.a.a.y0.e.b */
public final class C6611b extends C7095h implements C7119q {

    /* renamed from: m */
    public static final C6611b f13016m;

    /* renamed from: n */
    public static C7120r<C6611b> f13017n = new C6612a();

    /* renamed from: g */
    public final C7085c f13018g;

    /* renamed from: h */
    public int f13019h;

    /* renamed from: i */
    public int f13020i;

    /* renamed from: j */
    public List<C6613b> f13021j;

    /* renamed from: k */
    public byte f13022k;

    /* renamed from: l */
    public int f13023l;

    /* renamed from: d.a.a.a.y0.e.b$a */
    public static class C6612a extends C7084b<C6611b> {
        /* renamed from: a */
        public Object mo23688a(C7088d dVar, C7091f fVar) {
            return new C6611b(dVar, fVar, (C6581a) null);
        }
    }

    /* renamed from: d.a.a.a.y0.e.b$c */
    public static final class C6620c extends C7095h.C7097b<C6611b, C6620c> implements Object {

        /* renamed from: h */
        public int f13079h;

        /* renamed from: i */
        public int f13080i;

        /* renamed from: j */
        public List<C6613b> f13081j = Collections.emptyList();

        /* renamed from: H */
        public /* bridge */ /* synthetic */ C7117p.C7118a mo23689H(C7088d dVar, C7091f fVar) {
            mo23742m(dVar, fVar);
            return this;
        }

        public Object clone() {
            C6620c cVar = new C6620c();
            cVar.mo23741l(mo23740k());
            return cVar;
        }

        /* renamed from: e */
        public C7117p mo23691e() {
            C6611b k = mo23740k();
            if (k.mo23687g()) {
                return k;
            }
            throw new C7134v();
        }

        /* renamed from: h */
        public /* bridge */ /* synthetic */ C7081a.C7082a mo23692h(C7088d dVar, C7091f fVar) {
            mo23742m(dVar, fVar);
            return this;
        }

        /* renamed from: i */
        public C7095h.C7097b mo23693i() {
            C6620c cVar = new C6620c();
            cVar.mo23741l(mo23740k());
            return cVar;
        }

        /* renamed from: j */
        public /* bridge */ /* synthetic */ C7095h.C7097b mo23694j(C7095h hVar) {
            mo23741l((C6611b) hVar);
            return this;
        }

        /* renamed from: k */
        public C6611b mo23740k() {
            C6611b bVar = new C6611b(this, (C6581a) null);
            int i = this.f13079h;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            bVar.f13020i = this.f13080i;
            if ((i & 2) == 2) {
                this.f13081j = Collections.unmodifiableList(this.f13081j);
                this.f13079h &= -3;
            }
            bVar.f13021j = this.f13081j;
            bVar.f13019h = i2;
            return bVar;
        }

        /* renamed from: l */
        public C6620c mo23741l(C6611b bVar) {
            if (bVar == C6611b.f13016m) {
                return this;
            }
            if ((bVar.f13019h & 1) == 1) {
                int i = bVar.f13020i;
                this.f13079h = 1 | this.f13079h;
                this.f13080i = i;
            }
            if (!bVar.f13021j.isEmpty()) {
                if (this.f13081j.isEmpty()) {
                    this.f13081j = bVar.f13021j;
                    this.f13079h &= -3;
                } else {
                    if ((this.f13079h & 2) != 2) {
                        this.f13081j = new ArrayList(this.f13081j);
                        this.f13079h |= 2;
                    }
                    this.f13081j.addAll(bVar.f13021j);
                }
            }
            this.f14190g = this.f14190g.mo24607e(bVar.f13018g);
            return this;
        }

        /* renamed from: m */
        public C6620c mo23742m(C7088d dVar, C7091f fVar) {
            C6611b bVar;
            C6611b bVar2 = null;
            try {
                C6611b a = C6611b.f13017n.mo23688a(dVar, fVar);
                if (a != null) {
                    mo23741l(a);
                }
                return this;
            } catch (C7106j e) {
                bVar = (C6611b) e.f14209g;
                throw e;
            } catch (Throwable th) {
                th = th;
                bVar2 = bVar;
            }
            if (bVar2 != null) {
                mo23741l(bVar2);
            }
            throw th;
        }
    }

    static {
        C6611b bVar = new C6611b();
        f13016m = bVar;
        bVar.f13020i = 0;
        bVar.f13021j = Collections.emptyList();
    }

    public C6611b() {
        this.f13022k = -1;
        this.f13023l = -1;
        this.f13018g = C7085c.f14160g;
    }

    public C6611b(C7088d dVar, C7091f fVar, C6581a aVar) {
        this.f13022k = -1;
        this.f13023l = -1;
        boolean z = false;
        this.f13020i = 0;
        this.f13021j = Collections.emptyList();
        C7085c.C7087b B = C7085c.m12683B();
        C7089e k = C7089e.m12732k(B, 1);
        boolean z2 = false;
        while (!z) {
            try {
                int o = dVar.mo24637o();
                if (o != 0) {
                    if (o == 8) {
                        this.f13019h |= 1;
                        this.f13020i = dVar.mo24634l();
                    } else if (o == 18) {
                        if (!(z2 & true)) {
                            this.f13021j = new ArrayList();
                            z2 |= true;
                        }
                        this.f13021j.add(dVar.mo24630h(C6613b.f13025n, fVar));
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
                if (z2 & true) {
                    this.f13021j = Collections.unmodifiableList(this.f13021j);
                }
                try {
                    k.mo24644j();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f13018g = B.mo24619q();
                    throw th2;
                }
                this.f13018g = B.mo24619q();
                throw th;
            }
        }
        if (z2 & true) {
            this.f13021j = Collections.unmodifiableList(this.f13021j);
        }
        try {
            k.mo24644j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f13018g = B.mo24619q();
            throw th3;
        }
        this.f13018g = B.mo24619q();
    }

    /* renamed from: a */
    public int mo23683a() {
        int i = this.f13023l;
        if (i != -1) {
            return i;
        }
        int c = (this.f13019h & 1) == 1 ? C7089e.m12725c(1, this.f13020i) + 0 : 0;
        for (int i2 = 0; i2 < this.f13021j.size(); i2++) {
            c += C7089e.m12727e(2, this.f13021j.get(i2));
        }
        int size = this.f13018g.size() + c;
        this.f13023l = size;
        return size;
    }

    /* renamed from: c */
    public C7117p.C7118a mo23684c() {
        C6620c cVar = new C6620c();
        cVar.mo23741l(this);
        return cVar;
    }

    /* renamed from: d */
    public void mo23685d(C7089e eVar) {
        mo23683a();
        if ((this.f13019h & 1) == 1) {
            eVar.mo24649p(1, this.f13020i);
        }
        for (int i = 0; i < this.f13021j.size(); i++) {
            eVar.mo24651r(2, this.f13021j.get(i));
        }
        eVar.mo24654u(this.f13018g);
    }

    /* renamed from: f */
    public C7117p.C7118a mo23686f() {
        return new C6620c();
    }

    /* renamed from: g */
    public final boolean mo23687g() {
        byte b = this.f13022k;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!((this.f13019h & 1) == 1)) {
            this.f13022k = 0;
            return false;
        }
        for (int i = 0; i < this.f13021j.size(); i++) {
            if (!this.f13021j.get(i).mo23687g()) {
                this.f13022k = 0;
                return false;
            }
        }
        this.f13022k = 1;
        return true;
    }

    public C6611b(C7095h.C7097b bVar, C6581a aVar) {
        super(bVar);
        this.f13022k = -1;
        this.f13023l = -1;
        this.f13018g = bVar.f14190g;
    }

    /* renamed from: d.a.a.a.y0.e.b$b */
    public static final class C6613b extends C7095h implements C7119q {

        /* renamed from: m */
        public static final C6613b f13024m;

        /* renamed from: n */
        public static C7120r<C6613b> f13025n = new C6614a();

        /* renamed from: g */
        public final C7085c f13026g;

        /* renamed from: h */
        public int f13027h;

        /* renamed from: i */
        public int f13028i;

        /* renamed from: j */
        public C6616c f13029j;

        /* renamed from: k */
        public byte f13030k;

        /* renamed from: l */
        public int f13031l;

        /* renamed from: d.a.a.a.y0.e.b$b$a */
        public static class C6614a extends C7084b<C6613b> {
            /* renamed from: a */
            public Object mo23688a(C7088d dVar, C7091f fVar) {
                return new C6613b(dVar, fVar, (C6581a) null);
            }
        }

        /* renamed from: d.a.a.a.y0.e.b$b$b */
        public static final class C6615b extends C7095h.C7097b<C6613b, C6615b> implements Object {

            /* renamed from: h */
            public int f13032h;

            /* renamed from: i */
            public int f13033i;

            /* renamed from: j */
            public C6616c f13034j = C6616c.f13035v;

            /* renamed from: H */
            public /* bridge */ /* synthetic */ C7117p.C7118a mo23689H(C7088d dVar, C7091f fVar) {
                mo23735m(dVar, fVar);
                return this;
            }

            public Object clone() {
                C6615b bVar = new C6615b();
                bVar.mo23734l(mo23733k());
                return bVar;
            }

            /* renamed from: e */
            public C7117p mo23691e() {
                C6613b k = mo23733k();
                if (k.mo23687g()) {
                    return k;
                }
                throw new C7134v();
            }

            /* renamed from: h */
            public /* bridge */ /* synthetic */ C7081a.C7082a mo23692h(C7088d dVar, C7091f fVar) {
                mo23735m(dVar, fVar);
                return this;
            }

            /* renamed from: i */
            public C7095h.C7097b mo23693i() {
                C6615b bVar = new C6615b();
                bVar.mo23734l(mo23733k());
                return bVar;
            }

            /* renamed from: j */
            public /* bridge */ /* synthetic */ C7095h.C7097b mo23694j(C7095h hVar) {
                mo23734l((C6613b) hVar);
                return this;
            }

            /* renamed from: k */
            public C6613b mo23733k() {
                C6613b bVar = new C6613b(this, (C6581a) null);
                int i = this.f13032h;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                bVar.f13028i = this.f13033i;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                bVar.f13029j = this.f13034j;
                bVar.f13027h = i2;
                return bVar;
            }

            /* renamed from: l */
            public C6615b mo23734l(C6613b bVar) {
                C6616c cVar;
                if (bVar == C6613b.f13024m) {
                    return this;
                }
                int i = bVar.f13027h;
                boolean z = false;
                if ((i & 1) == 1) {
                    int i2 = bVar.f13028i;
                    this.f13032h |= 1;
                    this.f13033i = i2;
                }
                if ((i & 2) == 2) {
                    z = true;
                }
                if (z) {
                    C6616c cVar2 = bVar.f13029j;
                    if ((this.f13032h & 2) == 2 && (cVar = this.f13034j) != C6616c.f13035v) {
                        C6616c.C6618b bVar2 = new C6616c.C6618b();
                        bVar2.mo23738l(cVar);
                        bVar2.mo23738l(cVar2);
                        cVar2 = bVar2.mo23737k();
                    }
                    this.f13034j = cVar2;
                    this.f13032h |= 2;
                }
                this.f14190g = this.f14190g.mo24607e(bVar.f13026g);
                return this;
            }

            /* renamed from: m */
            public C6615b mo23735m(C7088d dVar, C7091f fVar) {
                C6613b bVar;
                C6613b bVar2 = null;
                try {
                    C6613b a = C6613b.f13025n.mo23688a(dVar, fVar);
                    if (a != null) {
                        mo23734l(a);
                    }
                    return this;
                } catch (C7106j e) {
                    bVar = (C6613b) e.f14209g;
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                }
                if (bVar2 != null) {
                    mo23734l(bVar2);
                }
                throw th;
            }
        }

        static {
            C6613b bVar = new C6613b();
            f13024m = bVar;
            bVar.f13028i = 0;
            bVar.f13029j = C6616c.f13035v;
        }

        public C6613b() {
            this.f13030k = -1;
            this.f13031l = -1;
            this.f13026g = C7085c.f14160g;
        }

        public C6613b(C7088d dVar, C7091f fVar, C6581a aVar) {
            this.f13030k = -1;
            this.f13031l = -1;
            boolean z = false;
            this.f13028i = 0;
            this.f13029j = C6616c.f13035v;
            C7085c.C7087b B = C7085c.m12683B();
            C7089e k = C7089e.m12732k(B, 1);
            while (!z) {
                try {
                    int o = dVar.mo24637o();
                    if (o != 0) {
                        if (o == 8) {
                            this.f13027h |= 1;
                            this.f13028i = dVar.mo24634l();
                        } else if (o == 18) {
                            C6616c.C6618b bVar = null;
                            if ((this.f13027h & 2) == 2) {
                                C6616c cVar = this.f13029j;
                                Objects.requireNonNull(cVar);
                                C6616c.C6618b bVar2 = new C6616c.C6618b();
                                bVar2.mo23738l(cVar);
                                bVar = bVar2;
                            }
                            C6616c cVar2 = (C6616c) dVar.mo24630h(C6616c.f13036w, fVar);
                            this.f13029j = cVar2;
                            if (bVar != null) {
                                bVar.mo23738l(cVar2);
                                this.f13029j = bVar.mo23737k();
                            }
                            this.f13027h |= 2;
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
                        this.f13026g = B.mo24619q();
                        throw th2;
                    }
                    this.f13026g = B.mo24619q();
                    throw th;
                }
            }
            try {
                k.mo24644j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f13026g = B.mo24619q();
                throw th3;
            }
            this.f13026g = B.mo24619q();
        }

        /* renamed from: a */
        public int mo23683a() {
            int i = this.f13031l;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f13027h & 1) == 1) {
                i2 = 0 + C7089e.m12725c(1, this.f13028i);
            }
            if ((this.f13027h & 2) == 2) {
                i2 += C7089e.m12727e(2, this.f13029j);
            }
            int size = this.f13026g.size() + i2;
            this.f13031l = size;
            return size;
        }

        /* renamed from: c */
        public C7117p.C7118a mo23684c() {
            C6615b bVar = new C6615b();
            bVar.mo23734l(this);
            return bVar;
        }

        /* renamed from: d */
        public void mo23685d(C7089e eVar) {
            mo23683a();
            if ((this.f13027h & 1) == 1) {
                eVar.mo24649p(1, this.f13028i);
            }
            if ((this.f13027h & 2) == 2) {
                eVar.mo24651r(2, this.f13029j);
            }
            eVar.mo24654u(this.f13026g);
        }

        /* renamed from: f */
        public C7117p.C7118a mo23686f() {
            return new C6615b();
        }

        /* renamed from: g */
        public final boolean mo23687g() {
            byte b = this.f13030k;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            int i = this.f13027h;
            if (!((i & 1) == 1)) {
                this.f13030k = 0;
                return false;
            }
            if (!((i & 2) == 2)) {
                this.f13030k = 0;
                return false;
            } else if (!this.f13029j.mo23687g()) {
                this.f13030k = 0;
                return false;
            } else {
                this.f13030k = 1;
                return true;
            }
        }

        public C6613b(C7095h.C7097b bVar, C6581a aVar) {
            super(bVar);
            this.f13030k = -1;
            this.f13031l = -1;
            this.f13026g = bVar.f14190g;
        }

        /* renamed from: d.a.a.a.y0.e.b$b$c */
        public static final class C6616c extends C7095h implements C7119q {

            /* renamed from: v */
            public static final C6616c f13035v;

            /* renamed from: w */
            public static C7120r<C6616c> f13036w = new C6617a();

            /* renamed from: g */
            public final C7085c f13037g;

            /* renamed from: h */
            public int f13038h;

            /* renamed from: i */
            public C6619c f13039i;

            /* renamed from: j */
            public long f13040j;

            /* renamed from: k */
            public float f13041k;

            /* renamed from: l */
            public double f13042l;

            /* renamed from: m */
            public int f13043m;

            /* renamed from: n */
            public int f13044n;

            /* renamed from: o */
            public int f13045o;

            /* renamed from: p */
            public C6611b f13046p;

            /* renamed from: q */
            public List<C6616c> f13047q;

            /* renamed from: r */
            public int f13048r;

            /* renamed from: s */
            public int f13049s;

            /* renamed from: t */
            public byte f13050t;

            /* renamed from: u */
            public int f13051u;

            /* renamed from: d.a.a.a.y0.e.b$b$c$a */
            public static class C6617a extends C7084b<C6616c> {
                /* renamed from: a */
                public Object mo23688a(C7088d dVar, C7091f fVar) {
                    return new C6616c(dVar, fVar, (C6581a) null);
                }
            }

            /* renamed from: d.a.a.a.y0.e.b$b$c$b */
            public static final class C6618b extends C7095h.C7097b<C6616c, C6618b> implements Object {

                /* renamed from: h */
                public int f13052h;

                /* renamed from: i */
                public C6619c f13053i = C6619c.BYTE;

                /* renamed from: j */
                public long f13054j;

                /* renamed from: k */
                public float f13055k;

                /* renamed from: l */
                public double f13056l;

                /* renamed from: m */
                public int f13057m;

                /* renamed from: n */
                public int f13058n;

                /* renamed from: o */
                public int f13059o;

                /* renamed from: p */
                public C6611b f13060p = C6611b.f13016m;

                /* renamed from: q */
                public List<C6616c> f13061q = Collections.emptyList();

                /* renamed from: r */
                public int f13062r;

                /* renamed from: s */
                public int f13063s;

                /* renamed from: H */
                public /* bridge */ /* synthetic */ C7117p.C7118a mo23689H(C7088d dVar, C7091f fVar) {
                    mo23739m(dVar, fVar);
                    return this;
                }

                public Object clone() {
                    C6618b bVar = new C6618b();
                    bVar.mo23738l(mo23737k());
                    return bVar;
                }

                /* renamed from: e */
                public C7117p mo23691e() {
                    C6616c k = mo23737k();
                    if (k.mo23687g()) {
                        return k;
                    }
                    throw new C7134v();
                }

                /* renamed from: h */
                public /* bridge */ /* synthetic */ C7081a.C7082a mo23692h(C7088d dVar, C7091f fVar) {
                    mo23739m(dVar, fVar);
                    return this;
                }

                /* renamed from: i */
                public C7095h.C7097b mo23693i() {
                    C6618b bVar = new C6618b();
                    bVar.mo23738l(mo23737k());
                    return bVar;
                }

                /* renamed from: j */
                public /* bridge */ /* synthetic */ C7095h.C7097b mo23694j(C7095h hVar) {
                    mo23738l((C6616c) hVar);
                    return this;
                }

                /* renamed from: k */
                public C6616c mo23737k() {
                    C6616c cVar = new C6616c(this, (C6581a) null);
                    int i = this.f13052h;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    cVar.f13039i = this.f13053i;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    cVar.f13040j = this.f13054j;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    cVar.f13041k = this.f13055k;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    cVar.f13042l = this.f13056l;
                    if ((i & 16) == 16) {
                        i2 |= 16;
                    }
                    cVar.f13043m = this.f13057m;
                    if ((i & 32) == 32) {
                        i2 |= 32;
                    }
                    cVar.f13044n = this.f13058n;
                    if ((i & 64) == 64) {
                        i2 |= 64;
                    }
                    cVar.f13045o = this.f13059o;
                    if ((i & 128) == 128) {
                        i2 |= 128;
                    }
                    cVar.f13046p = this.f13060p;
                    if ((i & 256) == 256) {
                        this.f13061q = Collections.unmodifiableList(this.f13061q);
                        this.f13052h &= -257;
                    }
                    cVar.f13047q = this.f13061q;
                    if ((i & 512) == 512) {
                        i2 |= 256;
                    }
                    cVar.f13048r = this.f13062r;
                    if ((i & 1024) == 1024) {
                        i2 |= 512;
                    }
                    cVar.f13049s = this.f13063s;
                    cVar.f13038h = i2;
                    return cVar;
                }

                /* renamed from: l */
                public C6618b mo23738l(C6616c cVar) {
                    C6611b bVar;
                    if (cVar == C6616c.f13035v) {
                        return this;
                    }
                    boolean z = true;
                    if ((cVar.f13038h & 1) == 1) {
                        C6619c cVar2 = cVar.f13039i;
                        Objects.requireNonNull(cVar2);
                        this.f13052h |= 1;
                        this.f13053i = cVar2;
                    }
                    int i = cVar.f13038h;
                    if ((i & 2) == 2) {
                        long j = cVar.f13040j;
                        this.f13052h |= 2;
                        this.f13054j = j;
                    }
                    if ((i & 4) == 4) {
                        float f = cVar.f13041k;
                        this.f13052h = 4 | this.f13052h;
                        this.f13055k = f;
                    }
                    if ((i & 8) == 8) {
                        double d = cVar.f13042l;
                        this.f13052h |= 8;
                        this.f13056l = d;
                    }
                    if ((i & 16) == 16) {
                        int i2 = cVar.f13043m;
                        this.f13052h = 16 | this.f13052h;
                        this.f13057m = i2;
                    }
                    if ((i & 32) == 32) {
                        int i3 = cVar.f13044n;
                        this.f13052h = 32 | this.f13052h;
                        this.f13058n = i3;
                    }
                    if ((i & 64) == 64) {
                        int i4 = cVar.f13045o;
                        this.f13052h = 64 | this.f13052h;
                        this.f13059o = i4;
                    }
                    if ((i & 128) == 128) {
                        C6611b bVar2 = cVar.f13046p;
                        if ((this.f13052h & 128) == 128 && (bVar = this.f13060p) != C6611b.f13016m) {
                            C6620c cVar3 = new C6620c();
                            cVar3.mo23741l(bVar);
                            cVar3.mo23741l(bVar2);
                            bVar2 = cVar3.mo23740k();
                        }
                        this.f13060p = bVar2;
                        this.f13052h |= 128;
                    }
                    if (!cVar.f13047q.isEmpty()) {
                        if (this.f13061q.isEmpty()) {
                            this.f13061q = cVar.f13047q;
                            this.f13052h &= -257;
                        } else {
                            if ((this.f13052h & 256) != 256) {
                                this.f13061q = new ArrayList(this.f13061q);
                                this.f13052h |= 256;
                            }
                            this.f13061q.addAll(cVar.f13047q);
                        }
                    }
                    int i5 = cVar.f13038h;
                    if ((i5 & 256) == 256) {
                        int i6 = cVar.f13048r;
                        this.f13052h |= 512;
                        this.f13062r = i6;
                    }
                    if ((i5 & 512) != 512) {
                        z = false;
                    }
                    if (z) {
                        int i7 = cVar.f13049s;
                        this.f13052h |= 1024;
                        this.f13063s = i7;
                    }
                    this.f14190g = this.f14190g.mo24607e(cVar.f13037g);
                    return this;
                }

                /* renamed from: m */
                public C6618b mo23739m(C7088d dVar, C7091f fVar) {
                    C6616c cVar;
                    C6616c cVar2 = null;
                    try {
                        C6616c a = C6616c.f13036w.mo23688a(dVar, fVar);
                        if (a != null) {
                            mo23738l(a);
                        }
                        return this;
                    } catch (C7106j e) {
                        cVar = (C6616c) e.f14209g;
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        cVar2 = cVar;
                    }
                    if (cVar2 != null) {
                        mo23738l(cVar2);
                    }
                    throw th;
                }
            }

            /* renamed from: d.a.a.a.y0.e.b$b$c$c */
            public enum C6619c implements C7103i.C7104a {
                BYTE(0),
                CHAR(1),
                SHORT(2),
                INT(3),
                LONG(4),
                FLOAT(5),
                DOUBLE(6),
                BOOLEAN(7),
                STRING(8),
                CLASS(9),
                ENUM(10),
                ANNOTATION(11),
                ARRAY(12);
                

                /* renamed from: g */
                public final int f13078g;

                /* access modifiers changed from: public */
                C6619c(int i) {
                    this.f13078g = i;
                }

                /* renamed from: d */
                public static C6619c m11847d(int i) {
                    switch (i) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                /* renamed from: f */
                public final int mo23715f() {
                    return this.f13078g;
                }
            }

            static {
                C6616c cVar = new C6616c();
                f13035v = cVar;
                cVar.mo23736j();
            }

            public C6616c() {
                this.f13050t = -1;
                this.f13051u = -1;
                this.f13037g = C7085c.f14160g;
            }

            public C6616c(C7088d dVar, C7091f fVar, C6581a aVar) {
                this.f13050t = -1;
                this.f13051u = -1;
                mo23736j();
                C7085c.C7087b B = C7085c.m12683B();
                C7089e k = C7089e.m12732k(B, 1);
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int o = dVar.mo24637o();
                        switch (o) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                int l = dVar.mo24634l();
                                C6619c d = C6619c.m11847d(l);
                                if (d != null) {
                                    this.f13038h |= 1;
                                    this.f13039i = d;
                                    break;
                                } else {
                                    k.mo24658y(o);
                                    k.mo24658y(l);
                                    break;
                                }
                            case 16:
                                this.f13038h |= 2;
                                long m = dVar.mo24635m();
                                this.f13040j = (-(m & 1)) ^ (m >>> 1);
                                break;
                            case 29:
                                this.f13038h |= 4;
                                this.f13041k = Float.intBitsToFloat(dVar.mo24632j());
                                break;
                            case 33:
                                this.f13038h |= 8;
                                this.f13042l = Double.longBitsToDouble(dVar.mo24633k());
                                break;
                            case 40:
                                this.f13038h |= 16;
                                this.f13043m = dVar.mo24634l();
                                break;
                            case 48:
                                this.f13038h |= 32;
                                this.f13044n = dVar.mo24634l();
                                break;
                            case 56:
                                this.f13038h |= 64;
                                this.f13045o = dVar.mo24634l();
                                break;
                            case 66:
                                C6620c cVar = null;
                                if ((this.f13038h & 128) == 128) {
                                    C6611b bVar = this.f13046p;
                                    Objects.requireNonNull(bVar);
                                    C6620c cVar2 = new C6620c();
                                    cVar2.mo23741l(bVar);
                                    cVar = cVar2;
                                }
                                C6611b bVar2 = (C6611b) dVar.mo24630h(C6611b.f13017n, fVar);
                                this.f13046p = bVar2;
                                if (cVar != null) {
                                    cVar.mo23741l(bVar2);
                                    this.f13046p = cVar.mo23740k();
                                }
                                this.f13038h |= 128;
                                break;
                            case 74:
                                if (!(z2 & true)) {
                                    this.f13047q = new ArrayList();
                                    z2 |= true;
                                }
                                this.f13047q.add(dVar.mo24630h(f13036w, fVar));
                                break;
                            case 80:
                                this.f13038h |= 512;
                                this.f13049s = dVar.mo24634l();
                                break;
                            case 88:
                                this.f13038h |= 256;
                                this.f13048r = dVar.mo24634l();
                                break;
                            default:
                                if (dVar.mo24640r(o, k)) {
                                    break;
                                }
                                z = true;
                                break;
                        }
                    } catch (C7106j e) {
                        e.f14209g = this;
                        throw e;
                    } catch (IOException e2) {
                        C7106j jVar = new C7106j(e2.getMessage());
                        jVar.f14209g = this;
                        throw jVar;
                    } catch (Throwable th) {
                        if (z2 & true) {
                            this.f13047q = Collections.unmodifiableList(this.f13047q);
                        }
                        try {
                            k.mo24644j();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f13037g = B.mo24619q();
                            throw th2;
                        }
                        this.f13037g = B.mo24619q();
                        throw th;
                    }
                }
                if (z2 & true) {
                    this.f13047q = Collections.unmodifiableList(this.f13047q);
                }
                try {
                    k.mo24644j();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f13037g = B.mo24619q();
                    throw th3;
                }
                this.f13037g = B.mo24619q();
            }

            /* renamed from: a */
            public int mo23683a() {
                int i = this.f13051u;
                if (i != -1) {
                    return i;
                }
                int b = (this.f13038h & 1) == 1 ? C7089e.m12724b(1, this.f13039i.f13078g) + 0 : 0;
                if ((this.f13038h & 2) == 2) {
                    long j = this.f13040j;
                    b += C7089e.m12730h((j >> 63) ^ (j << 1)) + C7089e.m12731i(2);
                }
                if ((this.f13038h & 4) == 4) {
                    b += C7089e.m12731i(3) + 4;
                }
                if ((this.f13038h & 8) == 8) {
                    b += C7089e.m12731i(4) + 8;
                }
                if ((this.f13038h & 16) == 16) {
                    b += C7089e.m12725c(5, this.f13043m);
                }
                if ((this.f13038h & 32) == 32) {
                    b += C7089e.m12725c(6, this.f13044n);
                }
                if ((this.f13038h & 64) == 64) {
                    b += C7089e.m12725c(7, this.f13045o);
                }
                if ((this.f13038h & 128) == 128) {
                    b += C7089e.m12727e(8, this.f13046p);
                }
                for (int i2 = 0; i2 < this.f13047q.size(); i2++) {
                    b += C7089e.m12727e(9, this.f13047q.get(i2));
                }
                if ((this.f13038h & 512) == 512) {
                    b += C7089e.m12725c(10, this.f13049s);
                }
                if ((this.f13038h & 256) == 256) {
                    b += C7089e.m12725c(11, this.f13048r);
                }
                int size = this.f13037g.size() + b;
                this.f13051u = size;
                return size;
            }

            /* renamed from: c */
            public C7117p.C7118a mo23684c() {
                C6618b bVar = new C6618b();
                bVar.mo23738l(this);
                return bVar;
            }

            /* renamed from: d */
            public void mo23685d(C7089e eVar) {
                mo23683a();
                if ((this.f13038h & 1) == 1) {
                    eVar.mo24647n(1, this.f13039i.f13078g);
                }
                if ((this.f13038h & 2) == 2) {
                    long j = this.f13040j;
                    eVar.mo24658y(16);
                    eVar.mo24659z((j << 1) ^ (j >> 63));
                }
                if ((this.f13038h & 4) == 4) {
                    float f = this.f13041k;
                    eVar.mo24658y(29);
                    eVar.mo24656w(Float.floatToRawIntBits(f));
                }
                if ((this.f13038h & 8) == 8) {
                    double d = this.f13042l;
                    eVar.mo24658y(33);
                    eVar.mo24657x(Double.doubleToRawLongBits(d));
                }
                if ((this.f13038h & 16) == 16) {
                    eVar.mo24649p(5, this.f13043m);
                }
                if ((this.f13038h & 32) == 32) {
                    eVar.mo24649p(6, this.f13044n);
                }
                if ((this.f13038h & 64) == 64) {
                    eVar.mo24649p(7, this.f13045o);
                }
                if ((this.f13038h & 128) == 128) {
                    eVar.mo24651r(8, this.f13046p);
                }
                for (int i = 0; i < this.f13047q.size(); i++) {
                    eVar.mo24651r(9, this.f13047q.get(i));
                }
                if ((this.f13038h & 512) == 512) {
                    eVar.mo24649p(10, this.f13049s);
                }
                if ((this.f13038h & 256) == 256) {
                    eVar.mo24649p(11, this.f13048r);
                }
                eVar.mo24654u(this.f13037g);
            }

            /* renamed from: f */
            public C7117p.C7118a mo23686f() {
                return new C6618b();
            }

            /* renamed from: g */
            public final boolean mo23687g() {
                byte b = this.f13050t;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!((this.f13038h & 128) == 128) || this.f13046p.mo23687g()) {
                    for (int i = 0; i < this.f13047q.size(); i++) {
                        if (!this.f13047q.get(i).mo23687g()) {
                            this.f13050t = 0;
                            return false;
                        }
                    }
                    this.f13050t = 1;
                    return true;
                }
                this.f13050t = 0;
                return false;
            }

            /* renamed from: j */
            public final void mo23736j() {
                this.f13039i = C6619c.BYTE;
                this.f13040j = 0;
                this.f13041k = 0.0f;
                this.f13042l = ShadowDrawableWrapper.COS_45;
                this.f13043m = 0;
                this.f13044n = 0;
                this.f13045o = 0;
                this.f13046p = C6611b.f13016m;
                this.f13047q = Collections.emptyList();
                this.f13048r = 0;
                this.f13049s = 0;
            }

            public C6616c(C7095h.C7097b bVar, C6581a aVar) {
                super(bVar);
                this.f13050t = -1;
                this.f13051u = -1;
                this.f13037g = bVar.f14190g;
            }
        }
    }
}
