package p298d.p299a.p300a.p301a.p303y0.p326e;

import java.io.IOException;
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

/* renamed from: d.a.a.a.y0.e.v */
public final class C6687v extends C7095h implements C7119q {

    /* renamed from: q */
    public static final C6687v f13488q;

    /* renamed from: r */
    public static C7120r<C6687v> f13489r = new C6688a();

    /* renamed from: g */
    public final C7085c f13490g;

    /* renamed from: h */
    public int f13491h;

    /* renamed from: i */
    public int f13492i;

    /* renamed from: j */
    public int f13493j;

    /* renamed from: k */
    public C6690c f13494k;

    /* renamed from: l */
    public int f13495l;

    /* renamed from: m */
    public int f13496m;

    /* renamed from: n */
    public C6691d f13497n;

    /* renamed from: o */
    public byte f13498o;

    /* renamed from: p */
    public int f13499p;

    /* renamed from: d.a.a.a.y0.e.v$a */
    public static class C6688a extends C7084b<C6687v> {
        /* renamed from: a */
        public Object mo23688a(C7088d dVar, C7091f fVar) {
            return new C6687v(dVar, fVar, (C6581a) null);
        }
    }

    /* renamed from: d.a.a.a.y0.e.v$b */
    public static final class C6689b extends C7095h.C7097b<C6687v, C6689b> implements Object {

        /* renamed from: h */
        public int f13500h;

        /* renamed from: i */
        public int f13501i;

        /* renamed from: j */
        public int f13502j;

        /* renamed from: k */
        public C6690c f13503k = C6690c.ERROR;

        /* renamed from: l */
        public int f13504l;

        /* renamed from: m */
        public int f13505m;

        /* renamed from: n */
        public C6691d f13506n = C6691d.LANGUAGE_VERSION;

        /* renamed from: H */
        public /* bridge */ /* synthetic */ C7117p.C7118a mo23689H(C7088d dVar, C7091f fVar) {
            mo23829m(dVar, fVar);
            return this;
        }

        public Object clone() {
            C6689b bVar = new C6689b();
            bVar.mo23828l(mo23827k());
            return bVar;
        }

        /* renamed from: e */
        public C7117p mo23691e() {
            C6687v k = mo23827k();
            if (k.mo23687g()) {
                return k;
            }
            throw new C7134v();
        }

        /* renamed from: h */
        public /* bridge */ /* synthetic */ C7081a.C7082a mo23692h(C7088d dVar, C7091f fVar) {
            mo23829m(dVar, fVar);
            return this;
        }

        /* renamed from: i */
        public C7095h.C7097b mo23693i() {
            C6689b bVar = new C6689b();
            bVar.mo23828l(mo23827k());
            return bVar;
        }

        /* renamed from: j */
        public /* bridge */ /* synthetic */ C7095h.C7097b mo23694j(C7095h hVar) {
            mo23828l((C6687v) hVar);
            return this;
        }

        /* renamed from: k */
        public C6687v mo23827k() {
            C6687v vVar = new C6687v(this, (C6581a) null);
            int i = this.f13500h;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            vVar.f13492i = this.f13501i;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            vVar.f13493j = this.f13502j;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            vVar.f13494k = this.f13503k;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            vVar.f13495l = this.f13504l;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            vVar.f13496m = this.f13505m;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            vVar.f13497n = this.f13506n;
            vVar.f13491h = i2;
            return vVar;
        }

        /* renamed from: l */
        public C6689b mo23828l(C6687v vVar) {
            if (vVar == C6687v.f13488q) {
                return this;
            }
            int i = vVar.f13491h;
            boolean z = false;
            if ((i & 1) == 1) {
                int i2 = vVar.f13492i;
                this.f13500h |= 1;
                this.f13501i = i2;
            }
            if ((i & 2) == 2) {
                int i3 = vVar.f13493j;
                this.f13500h = 2 | this.f13500h;
                this.f13502j = i3;
            }
            if ((i & 4) == 4) {
                C6690c cVar = vVar.f13494k;
                Objects.requireNonNull(cVar);
                this.f13500h = 4 | this.f13500h;
                this.f13503k = cVar;
            }
            int i4 = vVar.f13491h;
            if ((i4 & 8) == 8) {
                int i5 = vVar.f13495l;
                this.f13500h = 8 | this.f13500h;
                this.f13504l = i5;
            }
            if ((i4 & 16) == 16) {
                int i6 = vVar.f13496m;
                this.f13500h = 16 | this.f13500h;
                this.f13505m = i6;
            }
            if ((i4 & 32) == 32) {
                z = true;
            }
            if (z) {
                C6691d dVar = vVar.f13497n;
                Objects.requireNonNull(dVar);
                this.f13500h = 32 | this.f13500h;
                this.f13506n = dVar;
            }
            this.f14190g = this.f14190g.mo24607e(vVar.f13490g);
            return this;
        }

        /* renamed from: m */
        public C6689b mo23829m(C7088d dVar, C7091f fVar) {
            C6687v vVar;
            C6687v vVar2 = null;
            try {
                C6687v a = C6687v.f13489r.mo23688a(dVar, fVar);
                if (a != null) {
                    mo23828l(a);
                }
                return this;
            } catch (C7106j e) {
                vVar = (C6687v) e.f14209g;
                throw e;
            } catch (Throwable th) {
                th = th;
                vVar2 = vVar;
            }
            if (vVar2 != null) {
                mo23828l(vVar2);
            }
            throw th;
        }
    }

    /* renamed from: d.a.a.a.y0.e.v$c */
    public enum C6690c implements C7103i.C7104a {
        WARNING(0),
        ERROR(1),
        HIDDEN(2);
        

        /* renamed from: g */
        public final int f13511g;

        /* access modifiers changed from: public */
        C6690c(int i) {
            this.f13511g = i;
        }

        /* renamed from: d */
        public static C6690c m12191d(int i) {
            if (i == 0) {
                return WARNING;
            }
            if (i == 1) {
                return ERROR;
            }
            if (i != 2) {
                return null;
            }
            return HIDDEN;
        }

        /* renamed from: f */
        public final int mo23715f() {
            return this.f13511g;
        }
    }

    /* renamed from: d.a.a.a.y0.e.v$d */
    public enum C6691d implements C7103i.C7104a {
        LANGUAGE_VERSION(0),
        COMPILER_VERSION(1),
        API_VERSION(2);
        

        /* renamed from: g */
        public final int f13516g;

        /* access modifiers changed from: public */
        C6691d(int i) {
            this.f13516g = i;
        }

        /* renamed from: d */
        public static C6691d m12193d(int i) {
            if (i == 0) {
                return LANGUAGE_VERSION;
            }
            if (i == 1) {
                return COMPILER_VERSION;
            }
            if (i != 2) {
                return null;
            }
            return API_VERSION;
        }

        /* renamed from: f */
        public final int mo23715f() {
            return this.f13516g;
        }
    }

    static {
        C6687v vVar = new C6687v();
        f13488q = vVar;
        vVar.f13492i = 0;
        vVar.f13493j = 0;
        vVar.f13494k = C6690c.ERROR;
        vVar.f13495l = 0;
        vVar.f13496m = 0;
        vVar.f13497n = C6691d.LANGUAGE_VERSION;
    }

    public C6687v() {
        this.f13498o = -1;
        this.f13499p = -1;
        this.f13490g = C7085c.f14160g;
    }

    public C6687v(C7088d dVar, C7091f fVar, C6581a aVar) {
        int l;
        this.f13498o = -1;
        this.f13499p = -1;
        boolean z = false;
        this.f13492i = 0;
        this.f13493j = 0;
        this.f13494k = C6690c.ERROR;
        this.f13495l = 0;
        this.f13496m = 0;
        this.f13497n = C6691d.LANGUAGE_VERSION;
        C7085c.C7087b B = C7085c.m12683B();
        C7089e k = C7089e.m12732k(B, 1);
        while (!z) {
            try {
                int o = dVar.mo24637o();
                if (o != 0) {
                    if (o == 8) {
                        this.f13491h |= 1;
                        this.f13492i = dVar.mo24634l();
                    } else if (o != 16) {
                        if (o == 24) {
                            l = dVar.mo24634l();
                            C6690c d = C6690c.m12191d(l);
                            if (d != null) {
                                this.f13491h |= 4;
                                this.f13494k = d;
                            }
                        } else if (o == 32) {
                            this.f13491h |= 8;
                            this.f13495l = dVar.mo24634l();
                        } else if (o == 40) {
                            this.f13491h |= 16;
                            this.f13496m = dVar.mo24634l();
                        } else if (o == 48) {
                            l = dVar.mo24634l();
                            C6691d d2 = C6691d.m12193d(l);
                            if (d2 != null) {
                                this.f13491h |= 32;
                                this.f13497n = d2;
                            }
                        } else if (!dVar.mo24640r(o, k)) {
                        }
                        k.mo24658y(o);
                        k.mo24658y(l);
                    } else {
                        this.f13491h |= 2;
                        this.f13493j = dVar.mo24634l();
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
                    this.f13490g = B.mo24619q();
                    throw th2;
                }
                this.f13490g = B.mo24619q();
                throw th;
            }
        }
        try {
            k.mo24644j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f13490g = B.mo24619q();
            throw th3;
        }
        this.f13490g = B.mo24619q();
    }

    /* renamed from: a */
    public int mo23683a() {
        int i = this.f13499p;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.f13491h & 1) == 1) {
            i2 = 0 + C7089e.m12725c(1, this.f13492i);
        }
        if ((this.f13491h & 2) == 2) {
            i2 += C7089e.m12725c(2, this.f13493j);
        }
        if ((this.f13491h & 4) == 4) {
            i2 += C7089e.m12724b(3, this.f13494k.f13511g);
        }
        if ((this.f13491h & 8) == 8) {
            i2 += C7089e.m12725c(4, this.f13495l);
        }
        if ((this.f13491h & 16) == 16) {
            i2 += C7089e.m12725c(5, this.f13496m);
        }
        if ((this.f13491h & 32) == 32) {
            i2 += C7089e.m12724b(6, this.f13497n.f13516g);
        }
        int size = this.f13490g.size() + i2;
        this.f13499p = size;
        return size;
    }

    /* renamed from: c */
    public C7117p.C7118a mo23684c() {
        C6689b bVar = new C6689b();
        bVar.mo23828l(this);
        return bVar;
    }

    /* renamed from: d */
    public void mo23685d(C7089e eVar) {
        mo23683a();
        if ((this.f13491h & 1) == 1) {
            eVar.mo24649p(1, this.f13492i);
        }
        if ((this.f13491h & 2) == 2) {
            eVar.mo24649p(2, this.f13493j);
        }
        if ((this.f13491h & 4) == 4) {
            eVar.mo24647n(3, this.f13494k.f13511g);
        }
        if ((this.f13491h & 8) == 8) {
            eVar.mo24649p(4, this.f13495l);
        }
        if ((this.f13491h & 16) == 16) {
            eVar.mo24649p(5, this.f13496m);
        }
        if ((this.f13491h & 32) == 32) {
            eVar.mo24647n(6, this.f13497n.f13516g);
        }
        eVar.mo24654u(this.f13490g);
    }

    /* renamed from: f */
    public C7117p.C7118a mo23686f() {
        return new C6689b();
    }

    /* renamed from: g */
    public final boolean mo23687g() {
        byte b = this.f13498o;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f13498o = 1;
        return true;
    }

    public C6687v(C7095h.C7097b bVar, C6581a aVar) {
        super(bVar);
        this.f13498o = -1;
        this.f13499p = -1;
        this.f13490g = bVar.f14190g;
    }
}
