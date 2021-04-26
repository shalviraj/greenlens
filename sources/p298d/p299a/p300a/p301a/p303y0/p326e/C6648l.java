package p298d.p299a.p300a.p301a.p303y0.p326e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6681t;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6692w;
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

/* renamed from: d.a.a.a.y0.e.l */
public final class C6648l extends C7095h.C7099d<C6648l> implements Object {

    /* renamed from: q */
    public static final C6648l f13257q;

    /* renamed from: r */
    public static C7120r<C6648l> f13258r = new C6649a();

    /* renamed from: h */
    public final C7085c f13259h;

    /* renamed from: i */
    public int f13260i;

    /* renamed from: j */
    public List<C6643i> f13261j;

    /* renamed from: k */
    public List<C6654n> f13262k;

    /* renamed from: l */
    public List<C6674r> f13263l;

    /* renamed from: m */
    public C6681t f13264m;

    /* renamed from: n */
    public C6692w f13265n;

    /* renamed from: o */
    public byte f13266o;

    /* renamed from: p */
    public int f13267p;

    /* renamed from: d.a.a.a.y0.e.l$a */
    public static class C6649a extends C7084b<C6648l> {
        /* renamed from: a */
        public Object mo23688a(C7088d dVar, C7091f fVar) {
            return new C6648l(dVar, fVar, (C6581a) null);
        }
    }

    /* renamed from: d.a.a.a.y0.e.l$b */
    public static final class C6650b extends C7095h.C7098c<C6648l, C6650b> implements Object {

        /* renamed from: j */
        public int f13268j;

        /* renamed from: k */
        public List<C6643i> f13269k = Collections.emptyList();

        /* renamed from: l */
        public List<C6654n> f13270l = Collections.emptyList();

        /* renamed from: m */
        public List<C6674r> f13271m = Collections.emptyList();

        /* renamed from: n */
        public C6681t f13272n = C6681t.f13458m;

        /* renamed from: o */
        public C6692w f13273o = C6692w.f13517k;

        /* renamed from: H */
        public /* bridge */ /* synthetic */ C7117p.C7118a mo23689H(C7088d dVar, C7091f fVar) {
            mo23774n(dVar, fVar);
            return this;
        }

        public Object clone() {
            C6650b bVar = new C6650b();
            bVar.mo23773m(mo23772l());
            return bVar;
        }

        /* renamed from: e */
        public C7117p mo23691e() {
            C6648l l = mo23772l();
            if (l.mo23687g()) {
                return l;
            }
            throw new C7134v();
        }

        /* renamed from: h */
        public /* bridge */ /* synthetic */ C7081a.C7082a mo23692h(C7088d dVar, C7091f fVar) {
            mo23774n(dVar, fVar);
            return this;
        }

        /* renamed from: i */
        public C7095h.C7097b mo23693i() {
            C6650b bVar = new C6650b();
            bVar.mo23773m(mo23772l());
            return bVar;
        }

        /* renamed from: j */
        public /* bridge */ /* synthetic */ C7095h.C7097b mo23694j(C7095h hVar) {
            mo23773m((C6648l) hVar);
            return this;
        }

        /* renamed from: l */
        public C6648l mo23772l() {
            C6648l lVar = new C6648l(this, (C6581a) null);
            int i = this.f13268j;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.f13269k = Collections.unmodifiableList(this.f13269k);
                this.f13268j &= -2;
            }
            lVar.f13261j = this.f13269k;
            if ((this.f13268j & 2) == 2) {
                this.f13270l = Collections.unmodifiableList(this.f13270l);
                this.f13268j &= -3;
            }
            lVar.f13262k = this.f13270l;
            if ((this.f13268j & 4) == 4) {
                this.f13271m = Collections.unmodifiableList(this.f13271m);
                this.f13268j &= -5;
            }
            lVar.f13263l = this.f13271m;
            if ((i & 8) != 8) {
                i2 = 0;
            }
            lVar.f13264m = this.f13272n;
            if ((i & 16) == 16) {
                i2 |= 2;
            }
            lVar.f13265n = this.f13273o;
            lVar.f13260i = i2;
            return lVar;
        }

        /* renamed from: m */
        public C6650b mo23773m(C6648l lVar) {
            C6692w wVar;
            C6681t tVar;
            if (lVar == C6648l.f13257q) {
                return this;
            }
            boolean z = true;
            if (!lVar.f13261j.isEmpty()) {
                if (this.f13269k.isEmpty()) {
                    this.f13269k = lVar.f13261j;
                    this.f13268j &= -2;
                } else {
                    if ((this.f13268j & 1) != 1) {
                        this.f13269k = new ArrayList(this.f13269k);
                        this.f13268j |= 1;
                    }
                    this.f13269k.addAll(lVar.f13261j);
                }
            }
            if (!lVar.f13262k.isEmpty()) {
                if (this.f13270l.isEmpty()) {
                    this.f13270l = lVar.f13262k;
                    this.f13268j &= -3;
                } else {
                    if ((this.f13268j & 2) != 2) {
                        this.f13270l = new ArrayList(this.f13270l);
                        this.f13268j |= 2;
                    }
                    this.f13270l.addAll(lVar.f13262k);
                }
            }
            if (!lVar.f13263l.isEmpty()) {
                if (this.f13271m.isEmpty()) {
                    this.f13271m = lVar.f13263l;
                    this.f13268j &= -5;
                } else {
                    if ((this.f13268j & 4) != 4) {
                        this.f13271m = new ArrayList(this.f13271m);
                        this.f13268j |= 4;
                    }
                    this.f13271m.addAll(lVar.f13263l);
                }
            }
            if ((lVar.f13260i & 1) == 1) {
                C6681t tVar2 = lVar.f13264m;
                if ((this.f13268j & 8) == 8 && (tVar = this.f13272n) != C6681t.f13458m) {
                    C6681t.C6683b j = C6681t.m12144j(tVar);
                    j.mo23820l(tVar2);
                    tVar2 = j.mo23819k();
                }
                this.f13272n = tVar2;
                this.f13268j |= 8;
            }
            if ((lVar.f13260i & 2) != 2) {
                z = false;
            }
            if (z) {
                C6692w wVar2 = lVar.f13265n;
                if ((this.f13268j & 16) == 16 && (wVar = this.f13273o) != C6692w.f13517k) {
                    C6692w.C6694b j2 = C6692w.m12195j(wVar);
                    j2.mo23832l(wVar2);
                    wVar2 = j2.mo23831k();
                }
                this.f13273o = wVar2;
                this.f13268j |= 16;
            }
            mo24678k(lVar);
            this.f14190g = this.f14190g.mo24607e(lVar.f13259h);
            return this;
        }

        /* renamed from: n */
        public C6650b mo23774n(C7088d dVar, C7091f fVar) {
            C6648l lVar;
            C6648l lVar2 = null;
            try {
                C6648l a = C6648l.f13258r.mo23688a(dVar, fVar);
                if (a != null) {
                    mo23773m(a);
                }
                return this;
            } catch (C7106j e) {
                lVar = (C6648l) e.f14209g;
                throw e;
            } catch (Throwable th) {
                th = th;
                lVar2 = lVar;
            }
            if (lVar2 != null) {
                mo23773m(lVar2);
            }
            throw th;
        }
    }

    static {
        C6648l lVar = new C6648l();
        f13257q = lVar;
        lVar.mo23771t();
    }

    public C6648l() {
        this.f13266o = -1;
        this.f13267p = -1;
        this.f13259h = C7085c.f14160g;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: d.a.a.a.y0.e.t$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: d.a.a.a.y0.e.w$b} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6648l(p298d.p299a.p300a.p301a.p303y0.p389g.C7088d r10, p298d.p299a.p300a.p301a.p303y0.p389g.C7091f r11, p298d.p299a.p300a.p301a.p303y0.p326e.C6581a r12) {
        /*
            r9 = this;
            r9.<init>()
            r12 = -1
            r9.f13266o = r12
            r9.f13267p = r12
            r9.mo23771t()
            d.a.a.a.y0.g.c$b r12 = p298d.p299a.p300a.p301a.p303y0.p389g.C7085c.m12683B()
            r0 = 1
            d.a.a.a.y0.g.e r1 = p298d.p299a.p300a.p301a.p303y0.p389g.C7089e.m12732k(r12, r0)
            r2 = 0
            r3 = r2
        L_0x0016:
            r4 = 2
            r5 = 4
            if (r2 != 0) goto L_0x0120
            int r6 = r10.mo24637o()     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            if (r6 == 0) goto L_0x00ce
            r7 = 26
            if (r6 == r7) goto L_0x00b7
            r7 = 34
            if (r6 == r7) goto L_0x00a5
            r7 = 42
            if (r6 == r7) goto L_0x008f
            r7 = 242(0xf2, float:3.39E-43)
            r8 = 0
            if (r6 == r7) goto L_0x0066
            r7 = 258(0x102, float:3.62E-43)
            if (r6 == r7) goto L_0x003d
            boolean r4 = r9.mo24685q(r10, r1, r11, r6)     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            if (r4 != 0) goto L_0x0016
            goto L_0x00ce
        L_0x003d:
            int r6 = r9.f13260i     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r6 = r6 & r4
            if (r6 != r4) goto L_0x004b
            d.a.a.a.y0.e.w r6 = r9.f13265n     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            d.a.a.a.y0.e.w$b r8 = p298d.p299a.p300a.p301a.p303y0.p326e.C6692w.m12195j(r6)     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
        L_0x004b:
            d.a.a.a.y0.g.r<d.a.a.a.y0.e.w> r6 = p298d.p299a.p300a.p301a.p303y0.p326e.C6692w.f13518l     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            d.a.a.a.y0.g.p r6 = r10.mo24630h(r6, r11)     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            d.a.a.a.y0.e.w r6 = (p298d.p299a.p300a.p301a.p303y0.p326e.C6692w) r6     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r9.f13265n = r6     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            if (r8 == 0) goto L_0x0060
            r8.mo23832l(r6)     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            d.a.a.a.y0.e.w r6 = r8.mo23831k()     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r9.f13265n = r6     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
        L_0x0060:
            int r6 = r9.f13260i     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r6 = r6 | r4
            r9.f13260i = r6     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            goto L_0x0016
        L_0x0066:
            int r6 = r9.f13260i     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r6 = r6 & r0
            if (r6 != r0) goto L_0x0074
            d.a.a.a.y0.e.t r6 = r9.f13264m     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            d.a.a.a.y0.e.t$b r8 = p298d.p299a.p300a.p301a.p303y0.p326e.C6681t.m12144j(r6)     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
        L_0x0074:
            d.a.a.a.y0.g.r<d.a.a.a.y0.e.t> r6 = p298d.p299a.p300a.p301a.p303y0.p326e.C6681t.f13459n     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            d.a.a.a.y0.g.p r6 = r10.mo24630h(r6, r11)     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            d.a.a.a.y0.e.t r6 = (p298d.p299a.p300a.p301a.p303y0.p326e.C6681t) r6     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r9.f13264m = r6     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            if (r8 == 0) goto L_0x0089
            r8.mo23820l(r6)     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            d.a.a.a.y0.e.t r6 = r8.mo23819k()     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r9.f13264m = r6     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
        L_0x0089:
            int r6 = r9.f13260i     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r6 = r6 | r0
            r9.f13260i = r6     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            goto L_0x0016
        L_0x008f:
            r6 = r3 & 4
            if (r6 == r5) goto L_0x009c
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r6.<init>()     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r9.f13263l = r6     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r3 = r3 | 4
        L_0x009c:
            java.util.List<d.a.a.a.y0.e.r> r6 = r9.f13263l     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            d.a.a.a.y0.g.r<d.a.a.a.y0.e.r> r7 = p298d.p299a.p300a.p301a.p303y0.p326e.C6674r.f13409v     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
        L_0x00a0:
            d.a.a.a.y0.g.p r7 = r10.mo24630h(r7, r11)     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            goto L_0x00c9
        L_0x00a5:
            r6 = r3 & 2
            if (r6 == r4) goto L_0x00b2
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r6.<init>()     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r9.f13262k = r6     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r3 = r3 | 2
        L_0x00b2:
            java.util.List<d.a.a.a.y0.e.n> r6 = r9.f13262k     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            d.a.a.a.y0.g.r<d.a.a.a.y0.e.n> r7 = p298d.p299a.p300a.p301a.p303y0.p326e.C6654n.f13290y     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            goto L_0x00a0
        L_0x00b7:
            r6 = r3 & 1
            if (r6 == r0) goto L_0x00c4
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r6.<init>()     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r9.f13261j = r6     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            r3 = r3 | 1
        L_0x00c4:
            java.util.List<d.a.a.a.y0.e.i> r6 = r9.f13261j     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            d.a.a.a.y0.g.r<d.a.a.a.y0.e.i> r7 = p298d.p299a.p300a.p301a.p303y0.p326e.C6643i.f13215y     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            goto L_0x00a0
        L_0x00c9:
            r6.add(r7)     // Catch:{ j -> 0x00e0, IOException -> 0x00d3 }
            goto L_0x0016
        L_0x00ce:
            r2 = r0
            goto L_0x0016
        L_0x00d1:
            r10 = move-exception
            goto L_0x00e4
        L_0x00d3:
            r10 = move-exception
            d.a.a.a.y0.g.j r11 = new d.a.a.a.y0.g.j     // Catch:{ all -> 0x00d1 }
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x00d1 }
            r11.<init>(r10)     // Catch:{ all -> 0x00d1 }
            r11.f14209g = r9     // Catch:{ all -> 0x00d1 }
            throw r11     // Catch:{ all -> 0x00d1 }
        L_0x00e0:
            r10 = move-exception
            r10.f14209g = r9     // Catch:{ all -> 0x00d1 }
            throw r10     // Catch:{ all -> 0x00d1 }
        L_0x00e4:
            r11 = r3 & 1
            if (r11 != r0) goto L_0x00f0
            java.util.List<d.a.a.a.y0.e.i> r11 = r9.f13261j
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r9.f13261j = r11
        L_0x00f0:
            r11 = r3 & 2
            if (r11 != r4) goto L_0x00fc
            java.util.List<d.a.a.a.y0.e.n> r11 = r9.f13262k
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r9.f13262k = r11
        L_0x00fc:
            r11 = r3 & 4
            if (r11 != r5) goto L_0x0108
            java.util.List<d.a.a.a.y0.e.r> r11 = r9.f13263l
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r9.f13263l = r11
        L_0x0108:
            r1.mo24644j()     // Catch:{ IOException -> 0x0114, all -> 0x010c }
            goto L_0x0114
        L_0x010c:
            r10 = move-exception
            d.a.a.a.y0.g.c r11 = r12.mo24619q()
            r9.f13259h = r11
            throw r10
        L_0x0114:
            d.a.a.a.y0.g.c r11 = r12.mo24619q()
            r9.f13259h = r11
            d.a.a.a.y0.g.g<d.a.a.a.y0.g.h$e> r11 = r9.f14193g
            r11.mo24669i()
            throw r10
        L_0x0120:
            r10 = r3 & 1
            if (r10 != r0) goto L_0x012c
            java.util.List<d.a.a.a.y0.e.i> r10 = r9.f13261j
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            r9.f13261j = r10
        L_0x012c:
            r10 = r3 & 2
            if (r10 != r4) goto L_0x0138
            java.util.List<d.a.a.a.y0.e.n> r10 = r9.f13262k
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            r9.f13262k = r10
        L_0x0138:
            r10 = r3 & 4
            if (r10 != r5) goto L_0x0144
            java.util.List<d.a.a.a.y0.e.r> r10 = r9.f13263l
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            r9.f13263l = r10
        L_0x0144:
            r1.mo24644j()     // Catch:{ IOException -> 0x0150, all -> 0x0148 }
            goto L_0x0150
        L_0x0148:
            r10 = move-exception
            d.a.a.a.y0.g.c r11 = r12.mo24619q()
            r9.f13259h = r11
            throw r10
        L_0x0150:
            d.a.a.a.y0.g.c r10 = r12.mo24619q()
            r9.f13259h = r10
            d.a.a.a.y0.g.g<d.a.a.a.y0.g.h$e> r10 = r9.f14193g
            r10.mo24669i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p326e.C6648l.<init>(d.a.a.a.y0.g.d, d.a.a.a.y0.g.f, d.a.a.a.y0.e.a):void");
    }

    /* renamed from: a */
    public int mo23683a() {
        int i = this.f13267p;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f13261j.size(); i3++) {
            i2 += C7089e.m12727e(3, this.f13261j.get(i3));
        }
        for (int i4 = 0; i4 < this.f13262k.size(); i4++) {
            i2 += C7089e.m12727e(4, this.f13262k.get(i4));
        }
        for (int i5 = 0; i5 < this.f13263l.size(); i5++) {
            i2 += C7089e.m12727e(5, this.f13263l.get(i5));
        }
        if ((this.f13260i & 1) == 1) {
            i2 += C7089e.m12727e(30, this.f13264m);
        }
        if ((this.f13260i & 2) == 2) {
            i2 += C7089e.m12727e(32, this.f13265n);
        }
        int size = this.f13259h.size() + mo24680k() + i2;
        this.f13267p = size;
        return size;
    }

    /* renamed from: b */
    public C7117p mo23743b() {
        return f13257q;
    }

    /* renamed from: c */
    public C7117p.C7118a mo23684c() {
        C6650b bVar = new C6650b();
        bVar.mo23773m(this);
        return bVar;
    }

    /* renamed from: d */
    public void mo23685d(C7089e eVar) {
        mo23683a();
        C7095h.C7099d<MessageType>.C0000a p = mo24684p();
        for (int i = 0; i < this.f13261j.size(); i++) {
            eVar.mo24651r(3, this.f13261j.get(i));
        }
        for (int i2 = 0; i2 < this.f13262k.size(); i2++) {
            eVar.mo24651r(4, this.f13262k.get(i2));
        }
        for (int i3 = 0; i3 < this.f13263l.size(); i3++) {
            eVar.mo24651r(5, this.f13263l.get(i3));
        }
        if ((this.f13260i & 1) == 1) {
            eVar.mo24651r(30, this.f13264m);
        }
        if ((this.f13260i & 2) == 2) {
            eVar.mo24651r(32, this.f13265n);
        }
        p.mo24687a(200, eVar);
        eVar.mo24654u(this.f13259h);
    }

    /* renamed from: f */
    public C7117p.C7118a mo23686f() {
        return new C6650b();
    }

    /* renamed from: g */
    public final boolean mo23687g() {
        byte b = this.f13266o;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f13261j.size(); i++) {
            if (!this.f13261j.get(i).mo23687g()) {
                this.f13266o = 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.f13262k.size(); i2++) {
            if (!this.f13262k.get(i2).mo23687g()) {
                this.f13266o = 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f13263l.size(); i3++) {
            if (!this.f13263l.get(i3).mo23687g()) {
                this.f13266o = 0;
                return false;
            }
        }
        if (((this.f13260i & 1) == 1) && !this.f13264m.mo23687g()) {
            this.f13266o = 0;
            return false;
        } else if (!mo24679j()) {
            this.f13266o = 0;
            return false;
        } else {
            this.f13266o = 1;
            return true;
        }
    }

    /* renamed from: t */
    public final void mo23771t() {
        this.f13261j = Collections.emptyList();
        this.f13262k = Collections.emptyList();
        this.f13263l = Collections.emptyList();
        this.f13264m = C6681t.f13458m;
        this.f13265n = C6692w.f13517k;
    }

    public C6648l(C7095h.C7098c cVar, C6581a aVar) {
        super(cVar);
        this.f13266o = -1;
        this.f13267p = -1;
        this.f13259h = cVar.f14190g;
    }
}
