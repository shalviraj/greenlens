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

/* renamed from: d.a.a.a.y0.e.e */
public final class C6628e extends C7095h implements C7119q {

    /* renamed from: k */
    public static final C6628e f13146k;

    /* renamed from: l */
    public static C7120r<C6628e> f13147l = new C6629a();

    /* renamed from: g */
    public final C7085c f13148g;

    /* renamed from: h */
    public List<C6631f> f13149h;

    /* renamed from: i */
    public byte f13150i;

    /* renamed from: j */
    public int f13151j;

    /* renamed from: d.a.a.a.y0.e.e$a */
    public static class C6629a extends C7084b<C6628e> {
        /* renamed from: a */
        public Object mo23688a(C7088d dVar, C7091f fVar) {
            return new C6628e(dVar, fVar, (C6581a) null);
        }
    }

    /* renamed from: d.a.a.a.y0.e.e$b */
    public static final class C6630b extends C7095h.C7097b<C6628e, C6630b> implements Object {

        /* renamed from: h */
        public int f13152h;

        /* renamed from: i */
        public List<C6631f> f13153i = Collections.emptyList();

        /* renamed from: H */
        public /* bridge */ /* synthetic */ C7117p.C7118a mo23689H(C7088d dVar, C7091f fVar) {
            mo23753m(dVar, fVar);
            return this;
        }

        public Object clone() {
            C6630b bVar = new C6630b();
            bVar.mo23752l(mo23751k());
            return bVar;
        }

        /* renamed from: e */
        public C7117p mo23691e() {
            C6628e k = mo23751k();
            if (k.mo23687g()) {
                return k;
            }
            throw new C7134v();
        }

        /* renamed from: h */
        public /* bridge */ /* synthetic */ C7081a.C7082a mo23692h(C7088d dVar, C7091f fVar) {
            mo23753m(dVar, fVar);
            return this;
        }

        /* renamed from: i */
        public C7095h.C7097b mo23693i() {
            C6630b bVar = new C6630b();
            bVar.mo23752l(mo23751k());
            return bVar;
        }

        /* renamed from: j */
        public /* bridge */ /* synthetic */ C7095h.C7097b mo23694j(C7095h hVar) {
            mo23752l((C6628e) hVar);
            return this;
        }

        /* renamed from: k */
        public C6628e mo23751k() {
            C6628e eVar = new C6628e(this, (C6581a) null);
            if ((this.f13152h & 1) == 1) {
                this.f13153i = Collections.unmodifiableList(this.f13153i);
                this.f13152h &= -2;
            }
            eVar.f13149h = this.f13153i;
            return eVar;
        }

        /* renamed from: l */
        public C6630b mo23752l(C6628e eVar) {
            if (eVar == C6628e.f13146k) {
                return this;
            }
            if (!eVar.f13149h.isEmpty()) {
                if (this.f13153i.isEmpty()) {
                    this.f13153i = eVar.f13149h;
                    this.f13152h &= -2;
                } else {
                    if ((this.f13152h & 1) != 1) {
                        this.f13153i = new ArrayList(this.f13153i);
                        this.f13152h |= 1;
                    }
                    this.f13153i.addAll(eVar.f13149h);
                }
            }
            this.f14190g = this.f14190g.mo24607e(eVar.f13148g);
            return this;
        }

        /* renamed from: m */
        public C6630b mo23753m(C7088d dVar, C7091f fVar) {
            C6628e eVar;
            C6628e eVar2 = null;
            try {
                C6628e a = C6628e.f13147l.mo23688a(dVar, fVar);
                if (a != null) {
                    mo23752l(a);
                }
                return this;
            } catch (C7106j e) {
                eVar = (C6628e) e.f14209g;
                throw e;
            } catch (Throwable th) {
                th = th;
                eVar2 = eVar;
            }
            if (eVar2 != null) {
                mo23752l(eVar2);
            }
            throw th;
        }
    }

    static {
        C6628e eVar = new C6628e();
        f13146k = eVar;
        eVar.f13149h = Collections.emptyList();
    }

    public C6628e() {
        this.f13150i = -1;
        this.f13151j = -1;
        this.f13148g = C7085c.f14160g;
    }

    public C6628e(C7088d dVar, C7091f fVar, C6581a aVar) {
        this.f13150i = -1;
        this.f13151j = -1;
        this.f13149h = Collections.emptyList();
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
                            this.f13149h = new ArrayList();
                            z2 |= true;
                        }
                        this.f13149h.add(dVar.mo24630h(C6631f.f13155p, fVar));
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
                    this.f13149h = Collections.unmodifiableList(this.f13149h);
                }
                try {
                    k.mo24644j();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f13148g = B.mo24619q();
                    throw th2;
                }
                this.f13148g = B.mo24619q();
                throw th;
            }
        }
        if (z2 && true) {
            this.f13149h = Collections.unmodifiableList(this.f13149h);
        }
        try {
            k.mo24644j();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f13148g = B.mo24619q();
            throw th3;
        }
        this.f13148g = B.mo24619q();
    }

    /* renamed from: a */
    public int mo23683a() {
        int i = this.f13151j;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f13149h.size(); i3++) {
            i2 += C7089e.m12727e(1, this.f13149h.get(i3));
        }
        int size = this.f13148g.size() + i2;
        this.f13151j = size;
        return size;
    }

    /* renamed from: c */
    public C7117p.C7118a mo23684c() {
        C6630b bVar = new C6630b();
        bVar.mo23752l(this);
        return bVar;
    }

    /* renamed from: d */
    public void mo23685d(C7089e eVar) {
        mo23683a();
        for (int i = 0; i < this.f13149h.size(); i++) {
            eVar.mo24651r(1, this.f13149h.get(i));
        }
        eVar.mo24654u(this.f13148g);
    }

    /* renamed from: f */
    public C7117p.C7118a mo23686f() {
        return new C6630b();
    }

    /* renamed from: g */
    public final boolean mo23687g() {
        byte b = this.f13150i;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f13149h.size(); i++) {
            if (!this.f13149h.get(i).mo23687g()) {
                this.f13150i = 0;
                return false;
            }
        }
        this.f13150i = 1;
        return true;
    }

    public C6628e(C7095h.C7097b bVar, C6581a aVar) {
        super(bVar);
        this.f13150i = -1;
        this.f13151j = -1;
        this.f13148g = bVar.f14190g;
    }
}
