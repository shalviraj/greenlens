package p298d.p299a.p300a.p301a.p303y0.p326e;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6648l;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6657o;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6664p;
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

/* renamed from: d.a.a.a.y0.e.m */
public final class C6651m extends C7095h.C7099d<C6651m> implements Object {

    /* renamed from: p */
    public static final C6651m f13274p;

    /* renamed from: q */
    public static C7120r<C6651m> f13275q = new C6652a();

    /* renamed from: h */
    public final C7085c f13276h;

    /* renamed from: i */
    public int f13277i;

    /* renamed from: j */
    public C6664p f13278j;

    /* renamed from: k */
    public C6657o f13279k;

    /* renamed from: l */
    public C6648l f13280l;

    /* renamed from: m */
    public List<C6621c> f13281m;

    /* renamed from: n */
    public byte f13282n;

    /* renamed from: o */
    public int f13283o;

    /* renamed from: d.a.a.a.y0.e.m$a */
    public static class C6652a extends C7084b<C6651m> {
        /* renamed from: a */
        public Object mo23688a(C7088d dVar, C7091f fVar) {
            return new C6651m(dVar, fVar, (C6581a) null);
        }
    }

    /* renamed from: d.a.a.a.y0.e.m$b */
    public static final class C6653b extends C7095h.C7098c<C6651m, C6653b> implements Object {

        /* renamed from: j */
        public int f13284j;

        /* renamed from: k */
        public C6664p f13285k = C6664p.f13346k;

        /* renamed from: l */
        public C6657o f13286l = C6657o.f13320k;

        /* renamed from: m */
        public C6648l f13287m = C6648l.f13257q;

        /* renamed from: n */
        public List<C6621c> f13288n = Collections.emptyList();

        /* renamed from: H */
        public /* bridge */ /* synthetic */ C7117p.C7118a mo23689H(C7088d dVar, C7091f fVar) {
            mo23777n(dVar, fVar);
            return this;
        }

        public Object clone() {
            C6653b bVar = new C6653b();
            bVar.mo23776m(mo23775l());
            return bVar;
        }

        /* renamed from: e */
        public C7117p mo23691e() {
            C6651m l = mo23775l();
            if (l.mo23687g()) {
                return l;
            }
            throw new C7134v();
        }

        /* renamed from: h */
        public /* bridge */ /* synthetic */ C7081a.C7082a mo23692h(C7088d dVar, C7091f fVar) {
            mo23777n(dVar, fVar);
            return this;
        }

        /* renamed from: i */
        public C7095h.C7097b mo23693i() {
            C6653b bVar = new C6653b();
            bVar.mo23776m(mo23775l());
            return bVar;
        }

        /* renamed from: j */
        public /* bridge */ /* synthetic */ C7095h.C7097b mo23694j(C7095h hVar) {
            mo23776m((C6651m) hVar);
            return this;
        }

        /* renamed from: l */
        public C6651m mo23775l() {
            C6651m mVar = new C6651m(this, (C6581a) null);
            int i = this.f13284j;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            mVar.f13278j = this.f13285k;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            mVar.f13279k = this.f13286l;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            mVar.f13280l = this.f13287m;
            if ((i & 8) == 8) {
                this.f13288n = Collections.unmodifiableList(this.f13288n);
                this.f13284j &= -9;
            }
            mVar.f13281m = this.f13288n;
            mVar.f13277i = i2;
            return mVar;
        }

        /* renamed from: m */
        public C6653b mo23776m(C6651m mVar) {
            C6648l lVar;
            C6657o oVar;
            C6664p pVar;
            if (mVar == C6651m.f13274p) {
                return this;
            }
            boolean z = true;
            if ((mVar.f13277i & 1) == 1) {
                C6664p pVar2 = mVar.f13278j;
                if ((this.f13284j & 1) == 1 && (pVar = this.f13285k) != C6664p.f13346k) {
                    C6664p.C6666b bVar = new C6664p.C6666b();
                    bVar.mo23792l(pVar);
                    bVar.mo23792l(pVar2);
                    pVar2 = bVar.mo23791k();
                }
                this.f13285k = pVar2;
                this.f13284j |= 1;
            }
            if ((mVar.f13277i & 2) == 2) {
                C6657o oVar2 = mVar.f13279k;
                if ((this.f13284j & 2) == 2 && (oVar = this.f13286l) != C6657o.f13320k) {
                    C6657o.C6659b bVar2 = new C6657o.C6659b();
                    bVar2.mo23786l(oVar);
                    bVar2.mo23786l(oVar2);
                    oVar2 = bVar2.mo23785k();
                }
                this.f13286l = oVar2;
                this.f13284j |= 2;
            }
            if ((mVar.f13277i & 4) != 4) {
                z = false;
            }
            if (z) {
                C6648l lVar2 = mVar.f13280l;
                if ((this.f13284j & 4) == 4 && (lVar = this.f13287m) != C6648l.f13257q) {
                    C6648l.C6650b bVar3 = new C6648l.C6650b();
                    bVar3.mo23773m(lVar);
                    bVar3.mo23773m(lVar2);
                    lVar2 = bVar3.mo23772l();
                }
                this.f13287m = lVar2;
                this.f13284j |= 4;
            }
            if (!mVar.f13281m.isEmpty()) {
                if (this.f13288n.isEmpty()) {
                    this.f13288n = mVar.f13281m;
                    this.f13284j &= -9;
                } else {
                    if ((this.f13284j & 8) != 8) {
                        this.f13288n = new ArrayList(this.f13288n);
                        this.f13284j |= 8;
                    }
                    this.f13288n.addAll(mVar.f13281m);
                }
            }
            mo24678k(mVar);
            this.f14190g = this.f14190g.mo24607e(mVar.f13276h);
            return this;
        }

        /* renamed from: n */
        public C6653b mo23777n(C7088d dVar, C7091f fVar) {
            C6651m mVar;
            C6651m mVar2 = null;
            try {
                C6651m a = C6651m.f13275q.mo23688a(dVar, fVar);
                if (a != null) {
                    mo23776m(a);
                }
                return this;
            } catch (C7106j e) {
                mVar = (C6651m) e.f14209g;
                throw e;
            } catch (Throwable th) {
                th = th;
                mVar2 = mVar;
            }
            if (mVar2 != null) {
                mo23776m(mVar2);
            }
            throw th;
        }
    }

    static {
        C6651m mVar = new C6651m();
        f13274p = mVar;
        mVar.f13278j = C6664p.f13346k;
        mVar.f13279k = C6657o.f13320k;
        mVar.f13280l = C6648l.f13257q;
        mVar.f13281m = Collections.emptyList();
    }

    public C6651m() {
        this.f13282n = -1;
        this.f13283o = -1;
        this.f13276h = C7085c.f14160g;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: d.a.a.a.y0.e.p$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: d.a.a.a.y0.e.o$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: d.a.a.a.y0.e.l$b} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6651m(p298d.p299a.p300a.p301a.p303y0.p389g.C7088d r9, p298d.p299a.p300a.p301a.p303y0.p389g.C7091f r10, p298d.p299a.p300a.p301a.p303y0.p326e.C6581a r11) {
        /*
            r8 = this;
            r8.<init>()
            r11 = -1
            r8.f13282n = r11
            r8.f13283o = r11
            d.a.a.a.y0.e.p r11 = p298d.p299a.p300a.p301a.p303y0.p326e.C6664p.f13346k
            r8.f13278j = r11
            d.a.a.a.y0.e.o r11 = p298d.p299a.p300a.p301a.p303y0.p326e.C6657o.f13320k
            r8.f13279k = r11
            d.a.a.a.y0.e.l r11 = p298d.p299a.p300a.p301a.p303y0.p326e.C6648l.f13257q
            r8.f13280l = r11
            java.util.List r11 = java.util.Collections.emptyList()
            r8.f13281m = r11
            d.a.a.a.y0.g.c$b r11 = p298d.p299a.p300a.p301a.p303y0.p389g.C7085c.m12683B()
            r0 = 1
            d.a.a.a.y0.g.e r1 = p298d.p299a.p300a.p301a.p303y0.p389g.C7089e.m12732k(r11, r0)
            r2 = 0
            r3 = r2
        L_0x0025:
            r4 = 8
            if (r2 != 0) goto L_0x0122
            int r5 = r9.mo24637o()     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            if (r5 == 0) goto L_0x00e8
            r6 = 10
            r7 = 0
            if (r5 == r6) goto L_0x00ba
            r6 = 18
            if (r5 == r6) goto L_0x008c
            r6 = 26
            if (r5 == r6) goto L_0x0061
            r6 = 34
            if (r5 == r6) goto L_0x0048
            boolean r4 = r8.mo24685q(r9, r1, r10, r5)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            if (r4 != 0) goto L_0x0025
            goto L_0x00e8
        L_0x0048:
            r5 = r3 & 8
            if (r5 == r4) goto L_0x0055
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r5.<init>()     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r8.f13281m = r5     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r3 = r3 | 8
        L_0x0055:
            java.util.List<d.a.a.a.y0.e.c> r5 = r8.f13281m     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            d.a.a.a.y0.g.r<d.a.a.a.y0.e.c> r6 = p298d.p299a.p300a.p301a.p303y0.p326e.C6621c.f13083F     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            d.a.a.a.y0.g.p r6 = r9.mo24630h(r6, r10)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r5.add(r6)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            goto L_0x0025
        L_0x0061:
            int r5 = r8.f13277i     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r6 = 4
            r5 = r5 & r6
            if (r5 != r6) goto L_0x0074
            d.a.a.a.y0.e.l r5 = r8.f13280l     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            java.util.Objects.requireNonNull(r5)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            d.a.a.a.y0.e.l$b r7 = new d.a.a.a.y0.e.l$b     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r7.<init>()     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r7.mo23773m(r5)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
        L_0x0074:
            d.a.a.a.y0.g.r<d.a.a.a.y0.e.l> r5 = p298d.p299a.p300a.p301a.p303y0.p326e.C6648l.f13258r     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            d.a.a.a.y0.g.p r5 = r9.mo24630h(r5, r10)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            d.a.a.a.y0.e.l r5 = (p298d.p299a.p300a.p301a.p303y0.p326e.C6648l) r5     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r8.f13280l = r5     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            if (r7 == 0) goto L_0x0089
            r7.mo23773m(r5)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            d.a.a.a.y0.e.l r5 = r7.mo23772l()     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r8.f13280l = r5     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
        L_0x0089:
            int r5 = r8.f13277i     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            goto L_0x00b5
        L_0x008c:
            int r5 = r8.f13277i     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r6 = 2
            r5 = r5 & r6
            if (r5 != r6) goto L_0x009f
            d.a.a.a.y0.e.o r5 = r8.f13279k     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            java.util.Objects.requireNonNull(r5)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            d.a.a.a.y0.e.o$b r7 = new d.a.a.a.y0.e.o$b     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r7.<init>()     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r7.mo23786l(r5)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
        L_0x009f:
            d.a.a.a.y0.g.r<d.a.a.a.y0.e.o> r5 = p298d.p299a.p300a.p301a.p303y0.p326e.C6657o.f13321l     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            d.a.a.a.y0.g.p r5 = r9.mo24630h(r5, r10)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            d.a.a.a.y0.e.o r5 = (p298d.p299a.p300a.p301a.p303y0.p326e.C6657o) r5     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r8.f13279k = r5     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            if (r7 == 0) goto L_0x0089
            r7.mo23786l(r5)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            d.a.a.a.y0.e.o r5 = r7.mo23785k()     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r8.f13279k = r5     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            goto L_0x0089
        L_0x00b5:
            r5 = r5 | r6
            r8.f13277i = r5     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            goto L_0x0025
        L_0x00ba:
            int r5 = r8.f13277i     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r5 = r5 & r0
            if (r5 != r0) goto L_0x00cc
            d.a.a.a.y0.e.p r5 = r8.f13278j     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            java.util.Objects.requireNonNull(r5)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            d.a.a.a.y0.e.p$b r7 = new d.a.a.a.y0.e.p$b     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r7.<init>()     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r7.mo23792l(r5)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
        L_0x00cc:
            d.a.a.a.y0.g.r<d.a.a.a.y0.e.p> r5 = p298d.p299a.p300a.p301a.p303y0.p326e.C6664p.f13347l     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            d.a.a.a.y0.g.p r5 = r9.mo24630h(r5, r10)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            d.a.a.a.y0.e.p r5 = (p298d.p299a.p300a.p301a.p303y0.p326e.C6664p) r5     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r8.f13278j = r5     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            if (r7 == 0) goto L_0x00e1
            r7.mo23792l(r5)     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            d.a.a.a.y0.e.p r5 = r7.mo23791k()     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r8.f13278j = r5     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
        L_0x00e1:
            int r5 = r8.f13277i     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            r5 = r5 | r0
            r8.f13277i = r5     // Catch:{ j -> 0x00fa, IOException -> 0x00ed }
            goto L_0x0025
        L_0x00e8:
            r2 = r0
            goto L_0x0025
        L_0x00eb:
            r9 = move-exception
            goto L_0x00fe
        L_0x00ed:
            r9 = move-exception
            d.a.a.a.y0.g.j r10 = new d.a.a.a.y0.g.j     // Catch:{ all -> 0x00eb }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x00eb }
            r10.<init>(r9)     // Catch:{ all -> 0x00eb }
            r10.f14209g = r8     // Catch:{ all -> 0x00eb }
            throw r10     // Catch:{ all -> 0x00eb }
        L_0x00fa:
            r9 = move-exception
            r9.f14209g = r8     // Catch:{ all -> 0x00eb }
            throw r9     // Catch:{ all -> 0x00eb }
        L_0x00fe:
            r10 = r3 & 8
            if (r10 != r4) goto L_0x010a
            java.util.List<d.a.a.a.y0.e.c> r10 = r8.f13281m
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            r8.f13281m = r10
        L_0x010a:
            r1.mo24644j()     // Catch:{ IOException -> 0x0116, all -> 0x010e }
            goto L_0x0116
        L_0x010e:
            r9 = move-exception
            d.a.a.a.y0.g.c r10 = r11.mo24619q()
            r8.f13276h = r10
            throw r9
        L_0x0116:
            d.a.a.a.y0.g.c r10 = r11.mo24619q()
            r8.f13276h = r10
            d.a.a.a.y0.g.g<d.a.a.a.y0.g.h$e> r10 = r8.f14193g
            r10.mo24669i()
            throw r9
        L_0x0122:
            r9 = r3 & 8
            if (r9 != r4) goto L_0x012e
            java.util.List<d.a.a.a.y0.e.c> r9 = r8.f13281m
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)
            r8.f13281m = r9
        L_0x012e:
            r1.mo24644j()     // Catch:{ IOException -> 0x013a, all -> 0x0132 }
            goto L_0x013a
        L_0x0132:
            r9 = move-exception
            d.a.a.a.y0.g.c r10 = r11.mo24619q()
            r8.f13276h = r10
            throw r9
        L_0x013a:
            d.a.a.a.y0.g.c r9 = r11.mo24619q()
            r8.f13276h = r9
            d.a.a.a.y0.g.g<d.a.a.a.y0.g.h$e> r9 = r8.f14193g
            r9.mo24669i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p298d.p299a.p300a.p301a.p303y0.p326e.C6651m.<init>(d.a.a.a.y0.g.d, d.a.a.a.y0.g.f, d.a.a.a.y0.e.a):void");
    }

    /* renamed from: a */
    public int mo23683a() {
        int i = this.f13283o;
        if (i != -1) {
            return i;
        }
        int e = (this.f13277i & 1) == 1 ? C7089e.m12727e(1, this.f13278j) + 0 : 0;
        if ((this.f13277i & 2) == 2) {
            e += C7089e.m12727e(2, this.f13279k);
        }
        if ((this.f13277i & 4) == 4) {
            e += C7089e.m12727e(3, this.f13280l);
        }
        for (int i2 = 0; i2 < this.f13281m.size(); i2++) {
            e += C7089e.m12727e(4, this.f13281m.get(i2));
        }
        int size = this.f13276h.size() + mo24680k() + e;
        this.f13283o = size;
        return size;
    }

    /* renamed from: b */
    public C7117p mo23743b() {
        return f13274p;
    }

    /* renamed from: c */
    public C7117p.C7118a mo23684c() {
        C6653b bVar = new C6653b();
        bVar.mo23776m(this);
        return bVar;
    }

    /* renamed from: d */
    public void mo23685d(C7089e eVar) {
        mo23683a();
        C7095h.C7099d<MessageType>.C0000a p = mo24684p();
        if ((this.f13277i & 1) == 1) {
            eVar.mo24651r(1, this.f13278j);
        }
        if ((this.f13277i & 2) == 2) {
            eVar.mo24651r(2, this.f13279k);
        }
        if ((this.f13277i & 4) == 4) {
            eVar.mo24651r(3, this.f13280l);
        }
        for (int i = 0; i < this.f13281m.size(); i++) {
            eVar.mo24651r(4, this.f13281m.get(i));
        }
        p.mo24687a(200, eVar);
        eVar.mo24654u(this.f13276h);
    }

    /* renamed from: f */
    public C7117p.C7118a mo23686f() {
        return new C6653b();
    }

    /* renamed from: g */
    public final boolean mo23687g() {
        byte b = this.f13282n;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!((this.f13277i & 2) == 2) || this.f13279k.mo23687g()) {
            if (!((this.f13277i & 4) == 4) || this.f13280l.mo23687g()) {
                for (int i = 0; i < this.f13281m.size(); i++) {
                    if (!this.f13281m.get(i).mo23687g()) {
                        this.f13282n = 0;
                        return false;
                    }
                }
                if (!mo24679j()) {
                    this.f13282n = 0;
                    return false;
                }
                this.f13282n = 1;
                return true;
            }
            this.f13282n = 0;
            return false;
        }
        this.f13282n = 0;
        return false;
    }

    public C6651m(C7095h.C7098c cVar, C6581a aVar) {
        super(cVar);
        this.f13282n = -1;
        this.f13283o = -1;
        this.f13276h = cVar.f14190g;
    }
}
