package p298d.p299a.p300a.p301a.p303y0.p326e;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6639h;
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

/* renamed from: d.a.a.a.y0.e.f */
public final class C6631f extends C7095h implements C7119q {

    /* renamed from: o */
    public static final C6631f f13154o;

    /* renamed from: p */
    public static C7120r<C6631f> f13155p = new C6632a();

    /* renamed from: g */
    public final C7085c f13156g;

    /* renamed from: h */
    public int f13157h;

    /* renamed from: i */
    public C6634c f13158i;

    /* renamed from: j */
    public List<C6639h> f13159j;

    /* renamed from: k */
    public C6639h f13160k;

    /* renamed from: l */
    public C6635d f13161l;

    /* renamed from: m */
    public byte f13162m;

    /* renamed from: n */
    public int f13163n;

    /* renamed from: d.a.a.a.y0.e.f$a */
    public static class C6632a extends C7084b<C6631f> {
        /* renamed from: a */
        public Object mo23688a(C7088d dVar, C7091f fVar) {
            return new C6631f(dVar, fVar, (C6581a) null);
        }
    }

    /* renamed from: d.a.a.a.y0.e.f$b */
    public static final class C6633b extends C7095h.C7097b<C6631f, C6633b> implements Object {

        /* renamed from: h */
        public int f13164h;

        /* renamed from: i */
        public C6634c f13165i = C6634c.RETURNS_CONSTANT;

        /* renamed from: j */
        public List<C6639h> f13166j = Collections.emptyList();

        /* renamed from: k */
        public C6639h f13167k = C6639h.f13188r;

        /* renamed from: l */
        public C6635d f13168l = C6635d.AT_MOST_ONCE;

        /* renamed from: H */
        public /* bridge */ /* synthetic */ C7117p.C7118a mo23689H(C7088d dVar, C7091f fVar) {
            mo23756m(dVar, fVar);
            return this;
        }

        public Object clone() {
            C6633b bVar = new C6633b();
            bVar.mo23755l(mo23754k());
            return bVar;
        }

        /* renamed from: e */
        public C7117p mo23691e() {
            C6631f k = mo23754k();
            if (k.mo23687g()) {
                return k;
            }
            throw new C7134v();
        }

        /* renamed from: h */
        public /* bridge */ /* synthetic */ C7081a.C7082a mo23692h(C7088d dVar, C7091f fVar) {
            mo23756m(dVar, fVar);
            return this;
        }

        /* renamed from: i */
        public C7095h.C7097b mo23693i() {
            C6633b bVar = new C6633b();
            bVar.mo23755l(mo23754k());
            return bVar;
        }

        /* renamed from: j */
        public /* bridge */ /* synthetic */ C7095h.C7097b mo23694j(C7095h hVar) {
            mo23755l((C6631f) hVar);
            return this;
        }

        /* renamed from: k */
        public C6631f mo23754k() {
            C6631f fVar = new C6631f(this, (C6581a) null);
            int i = this.f13164h;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            fVar.f13158i = this.f13165i;
            if ((i & 2) == 2) {
                this.f13166j = Collections.unmodifiableList(this.f13166j);
                this.f13164h &= -3;
            }
            fVar.f13159j = this.f13166j;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            fVar.f13160k = this.f13167k;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            fVar.f13161l = this.f13168l;
            fVar.f13157h = i2;
            return fVar;
        }

        /* renamed from: l */
        public C6633b mo23755l(C6631f fVar) {
            C6639h hVar;
            if (fVar == C6631f.f13154o) {
                return this;
            }
            boolean z = true;
            if ((fVar.f13157h & 1) == 1) {
                C6634c cVar = fVar.f13158i;
                Objects.requireNonNull(cVar);
                this.f13164h |= 1;
                this.f13165i = cVar;
            }
            if (!fVar.f13159j.isEmpty()) {
                if (this.f13166j.isEmpty()) {
                    this.f13166j = fVar.f13159j;
                    this.f13164h &= -3;
                } else {
                    if ((this.f13164h & 2) != 2) {
                        this.f13166j = new ArrayList(this.f13166j);
                        this.f13164h |= 2;
                    }
                    this.f13166j.addAll(fVar.f13159j);
                }
            }
            if ((fVar.f13157h & 2) == 2) {
                C6639h hVar2 = fVar.f13160k;
                if ((this.f13164h & 4) == 4 && (hVar = this.f13167k) != C6639h.f13188r) {
                    C6639h.C6641b bVar = new C6639h.C6641b();
                    bVar.mo23762l(hVar);
                    bVar.mo23762l(hVar2);
                    hVar2 = bVar.mo23761k();
                }
                this.f13167k = hVar2;
                this.f13164h |= 4;
            }
            if ((fVar.f13157h & 4) != 4) {
                z = false;
            }
            if (z) {
                C6635d dVar = fVar.f13161l;
                Objects.requireNonNull(dVar);
                this.f13164h |= 8;
                this.f13168l = dVar;
            }
            this.f14190g = this.f14190g.mo24607e(fVar.f13156g);
            return this;
        }

        /* renamed from: m */
        public C6633b mo23756m(C7088d dVar, C7091f fVar) {
            C6631f fVar2;
            C6631f fVar3 = null;
            try {
                C6631f a = C6631f.f13155p.mo23688a(dVar, fVar);
                if (a != null) {
                    mo23755l(a);
                }
                return this;
            } catch (C7106j e) {
                fVar2 = (C6631f) e.f14209g;
                throw e;
            } catch (Throwable th) {
                th = th;
                fVar3 = fVar2;
            }
            if (fVar3 != null) {
                mo23755l(fVar3);
            }
            throw th;
        }
    }

    /* renamed from: d.a.a.a.y0.e.f$c */
    public enum C6634c implements C7103i.C7104a {
        RETURNS_CONSTANT(0),
        CALLS(1),
        RETURNS_NOT_NULL(2);
        

        /* renamed from: g */
        public final int f13173g;

        /* access modifiers changed from: public */
        C6634c(int i) {
            this.f13173g = i;
        }

        /* renamed from: d */
        public static C6634c m11917d(int i) {
            if (i == 0) {
                return RETURNS_CONSTANT;
            }
            if (i == 1) {
                return CALLS;
            }
            if (i != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }

        /* renamed from: f */
        public final int mo23715f() {
            return this.f13173g;
        }
    }

    /* renamed from: d.a.a.a.y0.e.f$d */
    public enum C6635d implements C7103i.C7104a {
        AT_MOST_ONCE(0),
        EXACTLY_ONCE(1),
        AT_LEAST_ONCE(2);
        

        /* renamed from: g */
        public final int f13178g;

        /* access modifiers changed from: public */
        C6635d(int i) {
            this.f13178g = i;
        }

        /* renamed from: d */
        public static C6635d m11919d(int i) {
            if (i == 0) {
                return AT_MOST_ONCE;
            }
            if (i == 1) {
                return EXACTLY_ONCE;
            }
            if (i != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }

        /* renamed from: f */
        public final int mo23715f() {
            return this.f13178g;
        }
    }

    static {
        C6631f fVar = new C6631f();
        f13154o = fVar;
        fVar.f13158i = C6634c.RETURNS_CONSTANT;
        fVar.f13159j = Collections.emptyList();
        fVar.f13160k = C6639h.f13188r;
        fVar.f13161l = C6635d.AT_MOST_ONCE;
    }

    public C6631f() {
        this.f13162m = -1;
        this.f13163n = -1;
        this.f13156g = C7085c.f14160g;
    }

    public C6631f(C7088d dVar, C7091f fVar, C6581a aVar) {
        int l;
        this.f13162m = -1;
        this.f13163n = -1;
        this.f13158i = C6634c.RETURNS_CONSTANT;
        this.f13159j = Collections.emptyList();
        this.f13160k = C6639h.f13188r;
        this.f13161l = C6635d.AT_MOST_ONCE;
        C7085c.C7087b B = C7085c.m12683B();
        C7089e k = C7089e.m12732k(B, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int o = dVar.mo24637o();
                if (o != 0) {
                    if (o == 8) {
                        l = dVar.mo24634l();
                        C6634c d = C6634c.m11917d(l);
                        if (d != null) {
                            this.f13157h |= 1;
                            this.f13158i = d;
                        }
                    } else if (o == 18) {
                        if (!(z2 & true)) {
                            this.f13159j = new ArrayList();
                            z2 |= true;
                        }
                        this.f13159j.add(dVar.mo24630h(C6639h.f13189s, fVar));
                    } else if (o == 26) {
                        C6639h.C6641b bVar = null;
                        if ((this.f13157h & 2) == 2) {
                            C6639h hVar = this.f13160k;
                            Objects.requireNonNull(hVar);
                            C6639h.C6641b bVar2 = new C6639h.C6641b();
                            bVar2.mo23762l(hVar);
                            bVar = bVar2;
                        }
                        C6639h hVar2 = (C6639h) dVar.mo24630h(C6639h.f13189s, fVar);
                        this.f13160k = hVar2;
                        if (bVar != null) {
                            bVar.mo23762l(hVar2);
                            this.f13160k = bVar.mo23761k();
                        }
                        this.f13157h |= 2;
                    } else if (o == 32) {
                        l = dVar.mo24634l();
                        C6635d d2 = C6635d.m11919d(l);
                        if (d2 != null) {
                            this.f13157h |= 4;
                            this.f13161l = d2;
                        }
                    } else if (!dVar.mo24640r(o, k)) {
                    }
                    k.mo24658y(o);
                    k.mo24658y(l);
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
                    this.f13159j = Collections.unmodifiableList(this.f13159j);
                }
                try {
                    k.mo24644j();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f13156g = B.mo24619q();
                    throw th2;
                }
                this.f13156g = B.mo24619q();
                throw th;
            }
        }
        if (z2 & true) {
            this.f13159j = Collections.unmodifiableList(this.f13159j);
        }
        try {
            k.mo24644j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f13156g = B.mo24619q();
            throw th3;
        }
        this.f13156g = B.mo24619q();
    }

    /* renamed from: a */
    public int mo23683a() {
        int i = this.f13163n;
        if (i != -1) {
            return i;
        }
        int b = (this.f13157h & 1) == 1 ? C7089e.m12724b(1, this.f13158i.f13173g) + 0 : 0;
        for (int i2 = 0; i2 < this.f13159j.size(); i2++) {
            b += C7089e.m12727e(2, this.f13159j.get(i2));
        }
        if ((this.f13157h & 2) == 2) {
            b += C7089e.m12727e(3, this.f13160k);
        }
        if ((this.f13157h & 4) == 4) {
            b += C7089e.m12724b(4, this.f13161l.f13178g);
        }
        int size = this.f13156g.size() + b;
        this.f13163n = size;
        return size;
    }

    /* renamed from: c */
    public C7117p.C7118a mo23684c() {
        C6633b bVar = new C6633b();
        bVar.mo23755l(this);
        return bVar;
    }

    /* renamed from: d */
    public void mo23685d(C7089e eVar) {
        mo23683a();
        if ((this.f13157h & 1) == 1) {
            eVar.mo24647n(1, this.f13158i.f13173g);
        }
        for (int i = 0; i < this.f13159j.size(); i++) {
            eVar.mo24651r(2, this.f13159j.get(i));
        }
        if ((this.f13157h & 2) == 2) {
            eVar.mo24651r(3, this.f13160k);
        }
        if ((this.f13157h & 4) == 4) {
            eVar.mo24647n(4, this.f13161l.f13178g);
        }
        eVar.mo24654u(this.f13156g);
    }

    /* renamed from: f */
    public C7117p.C7118a mo23686f() {
        return new C6633b();
    }

    /* renamed from: g */
    public final boolean mo23687g() {
        byte b = this.f13162m;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f13159j.size(); i++) {
            if (!this.f13159j.get(i).mo23687g()) {
                this.f13162m = 0;
                return false;
            }
        }
        if (!((this.f13157h & 2) == 2) || this.f13160k.mo23687g()) {
            this.f13162m = 1;
            return true;
        }
        this.f13162m = 0;
        return false;
    }

    public C6631f(C7095h.C7097b bVar, C6581a aVar) {
        super(bVar);
        this.f13162m = -1;
        this.f13163n = -1;
        this.f13156g = bVar.f14190g;
    }
}
