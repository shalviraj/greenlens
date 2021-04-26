package p005b.p280p.p285b.p286a0.p288k;

import java.net.CookieHandler;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.Comparator;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p273o.C4805c3;
import p005b.p280p.p285b.C5121a;
import p005b.p280p.p285b.C5219b;
import p005b.p280p.p285b.C5228f;
import p005b.p280p.p285b.C5233i;
import p005b.p280p.p285b.C5239l;
import p005b.p280p.p285b.C5242n;
import p005b.p280p.p285b.C5245o;
import p005b.p280p.p285b.C5249p;
import p005b.p280p.p285b.C5251q;
import p005b.p280p.p285b.C5252r;
import p005b.p280p.p285b.C5255t;
import p005b.p280p.p285b.C5258u;
import p005b.p280p.p285b.C5259v;
import p005b.p280p.p285b.C5260w;
import p005b.p280p.p285b.C5263x;
import p005b.p280p.p285b.p286a0.C5134i;
import p005b.p291q.p292a.C5266a;
import p435n.C8040e;
import p435n.C8042f;
import p435n.C8043g;
import p435n.C8050m;
import p435n.C8058t;
import p435n.C8064y;

/* renamed from: b.p.b.a0.k.g */
public final class C5199g {

    /* renamed from: q */
    public static final C5263x f10180q = new C5200a();

    /* renamed from: a */
    public final C5252r f10181a;

    /* renamed from: b */
    public final C5211p f10182b;

    /* renamed from: c */
    public final C5260w f10183c;

    /* renamed from: d */
    public C5203i f10184d;

    /* renamed from: e */
    public long f10185e = -1;

    /* renamed from: f */
    public boolean f10186f;

    /* renamed from: g */
    public final boolean f10187g;

    /* renamed from: h */
    public final C5255t f10188h;

    /* renamed from: i */
    public C5255t f10189i;

    /* renamed from: j */
    public C5260w f10190j;

    /* renamed from: k */
    public C5260w f10191k;

    /* renamed from: l */
    public C8064y f10192l;

    /* renamed from: m */
    public final boolean f10193m;

    /* renamed from: n */
    public final boolean f10194n;

    /* renamed from: o */
    public C5183b f10195o;

    /* renamed from: p */
    public C5184c f10196p;

    /* renamed from: b.p.b.a0.k.g$a */
    public static class C5200a extends C5263x {
        /* renamed from: e */
        public long mo17098e() {
            return 0;
        }

        /* renamed from: q */
        public C5251q mo17099q() {
            return null;
        }

        /* renamed from: z */
        public C8043g mo17100z() {
            return new C8040e();
        }
    }

    /* renamed from: b.p.b.a0.k.g$b */
    public class C5201b implements C5249p.C5250a {

        /* renamed from: a */
        public final int f10197a;

        /* renamed from: b */
        public final C5255t f10198b;

        /* renamed from: c */
        public int f10199c;

        public C5201b(int i, C5255t tVar) {
            this.f10197a = i;
            this.f10198b = tVar;
        }

        /* renamed from: a */
        public C5260w mo17101a(C5255t tVar) {
            C5259v vVar;
            this.f10199c++;
            int i = this.f10197a;
            if (i > 0) {
                C5249p pVar = C5199g.this.f10181a.f10459m.get(i - 1);
                C5121a aVar = C5199g.this.f10182b.mo17109a().f10236a.f10517a;
                if (!tVar.f10479a.f10423d.equals(aVar.f9914a.f10423d) || tVar.f10479a.f10424e != aVar.f9914a.f10424e) {
                    throw new IllegalStateException("network interceptor " + pVar + " must retain the same host and port");
                } else if (this.f10199c > 1) {
                    throw new IllegalStateException("network interceptor " + pVar + " must call proceed() exactly once");
                }
            }
            if (this.f10197a < C5199g.this.f10181a.f10459m.size()) {
                C5199g gVar = C5199g.this;
                int i2 = this.f10197a;
                C5201b bVar = new C5201b(i2 + 1, tVar);
                C5249p pVar2 = gVar.f10181a.f10459m.get(i2);
                C5260w a = pVar2.mo17183a(bVar);
                if (bVar.f10199c != 1) {
                    throw new IllegalStateException("network interceptor " + pVar2 + " must call proceed() exactly once");
                } else if (a != null) {
                    return a;
                } else {
                    throw new NullPointerException("network interceptor " + pVar2 + " returned null");
                }
            } else {
                C5199g.this.f10184d.mo17075c(tVar);
                C5199g gVar2 = C5199g.this;
                gVar2.f10189i = tVar;
                if (gVar2.mo17088c(tVar) && (vVar = tVar.f10482d) != null) {
                    C8042f G = C5266a.m9806G(C5199g.this.f10184d.mo17074b(tVar, (long) ((C5258u) vVar).f10492b));
                    C5258u uVar = (C5258u) tVar.f10482d;
                    C8058t tVar2 = (C8058t) G;
                    tVar2.mo25908h(uVar.f10493c, uVar.f10494d, uVar.f10492b);
                    tVar2.close();
                }
                C5260w d = C5199g.this.mo17089d();
                int i3 = d.f10497c;
                if ((i3 != 204 && i3 != 205) || d.f10501g.mo17098e() <= 0) {
                    return d;
                }
                StringBuilder v = C0843a.m461v("HTTP ", i3, " had non-zero Content-Length: ");
                v.append(d.f10501g.mo17098e());
                throw new ProtocolException(v.toString());
            }
        }
    }

    public C5199g(C5252r rVar, C5255t tVar, boolean z, boolean z2, boolean z3, C5211p pVar, C5207l lVar, C5260w wVar) {
        C5211p pVar2;
        C5228f fVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        C5252r rVar2 = rVar;
        C5255t tVar2 = tVar;
        this.f10181a = rVar2;
        this.f10188h = tVar2;
        this.f10187g = z;
        this.f10193m = z2;
        this.f10194n = z3;
        if (pVar != null) {
            pVar2 = pVar;
        } else {
            C5233i iVar = rVar2.f10468v;
            if (tVar.mo17191b()) {
                SSLSocketFactory sSLSocketFactory2 = rVar2.f10464r;
                hostnameVerifier = rVar2.f10465s;
                sSLSocketFactory = sSLSocketFactory2;
                fVar = rVar2.f10466t;
            } else {
                sSLSocketFactory = null;
                hostnameVerifier = null;
                fVar = null;
            }
            C5245o oVar = tVar2.f10479a;
            String str = oVar.f10423d;
            int i = oVar.f10424e;
            C5239l lVar2 = rVar2.f10469w;
            SocketFactory socketFactory = rVar2.f10463q;
            C5219b bVar = rVar2.f10467u;
            Proxy proxy = rVar2.f10455i;
            pVar2 = new C5211p(iVar, new C5121a(str, i, lVar2, socketFactory, sSLSocketFactory, hostnameVerifier, fVar, bVar, proxy, rVar2.f10456j, rVar2.f10457k, rVar2.f10460n));
        }
        this.f10182b = pVar2;
        this.f10192l = lVar;
        this.f10183c = wVar;
    }

    /* renamed from: b */
    public static boolean m9624b(C5260w wVar) {
        if (wVar.f10495a.f10480b.equals("HEAD")) {
            return false;
        }
        int i = wVar.f10497c;
        if ((i < 100 || i >= 200) && i != 204 && i != 304) {
            return true;
        }
        Comparator<String> comparator = C5204j.f10205a;
        if (C5204j.m9650a(wVar.f10500f) == -1) {
            String a = wVar.f10500f.mo17153a("Transfer-Encoding");
            if (a == null) {
                a = null;
            }
            if ("chunked".equalsIgnoreCase(a)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static C5260w m9625k(C5260w wVar) {
        if (wVar == null || wVar.f10501g == null) {
            return wVar;
        }
        C5260w.C5262b c = wVar.mo17201c();
        c.f10512g = null;
        return c.mo17203a();
    }

    /* renamed from: a */
    public C5211p mo17087a() {
        C8064y yVar = this.f10192l;
        if (yVar != null) {
            C5134i.m9458c(yVar);
        }
        C5260w wVar = this.f10191k;
        if (wVar != null) {
            C5134i.m9458c(wVar.f10501g);
        } else {
            this.f10182b.mo17110b();
        }
        return this.f10182b;
    }

    /* renamed from: c */
    public boolean mo17088c(C5255t tVar) {
        return C4805c3.m8816o(tVar.f10480b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x008f, code lost:
        if ("close".equalsIgnoreCase(r1) != false) goto L_0x0091;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p005b.p280p.p285b.C5260w mo17089d() {
        /*
            r5 = this;
            b.p.b.a0.k.i r0 = r5.f10184d
            r0.mo17073a()
            b.p.b.a0.k.i r0 = r5.f10184d
            b.p.b.w$b r0 = r0.mo17078f()
            b.p.b.t r1 = r5.f10189i
            r0.f10506a = r1
            b.p.b.a0.k.p r1 = r5.f10182b
            b.p.b.a0.l.a r1 = r1.mo17109a()
            b.p.b.m r1 = r1.f10239d
            r0.f10510e = r1
            java.lang.String r1 = p005b.p280p.p285b.p286a0.p288k.C5204j.f10207c
            long r2 = r5.f10185e
            java.lang.String r2 = java.lang.Long.toString(r2)
            b.p.b.n$b r3 = r0.f10511f
            r3.mo17162d(r1, r2)
            r3.mo17163e(r1)
            java.util.List<java.lang.String> r4 = r3.f10418a
            r4.add(r1)
            java.util.List<java.lang.String> r1 = r3.f10418a
            java.lang.String r2 = r2.trim()
            r1.add(r2)
            java.lang.String r1 = p005b.p280p.p285b.p286a0.p288k.C5204j.f10208d
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = java.lang.Long.toString(r2)
            b.p.b.n$b r3 = r0.f10511f
            r3.mo17162d(r1, r2)
            r3.mo17163e(r1)
            java.util.List<java.lang.String> r4 = r3.f10418a
            r4.add(r1)
            java.util.List<java.lang.String> r1 = r3.f10418a
            java.lang.String r2 = r2.trim()
            r1.add(r2)
            b.p.b.w r0 = r0.mo17203a()
            boolean r1 = r5.f10194n
            if (r1 != 0) goto L_0x006f
            b.p.b.w$b r1 = r0.mo17201c()
            b.p.b.a0.k.i r2 = r5.f10184d
            b.p.b.x r0 = r2.mo17079g(r0)
            r1.f10512g = r0
            b.p.b.w r0 = r1.mo17203a()
        L_0x006f:
            b.p.b.t r1 = r0.f10495a
            b.p.b.n r1 = r1.f10481c
            java.lang.String r2 = "Connection"
            java.lang.String r1 = r1.mo17153a(r2)
            java.lang.String r3 = "close"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x0091
            b.p.b.n r1 = r0.f10500f
            java.lang.String r1 = r1.mo17153a(r2)
            if (r1 == 0) goto L_0x008a
            goto L_0x008b
        L_0x008a:
            r1 = 0
        L_0x008b:
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0096
        L_0x0091:
            b.p.b.a0.k.p r1 = r5.f10182b
            r1.mo17114f()
        L_0x0096:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p285b.p286a0.p288k.C5199g.mo17089d():b.p.b.w");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c4, code lost:
        if (r7.getTime() < r1.getTime()) goto L_0x00c6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01c1  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17090e() {
        /*
            r13 = this;
            b.p.b.w r0 = r13.f10191k
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            b.p.b.t r0 = r13.f10189i
            if (r0 != 0) goto L_0x0016
            b.p.b.w r1 = r13.f10190j
            if (r1 == 0) goto L_0x000e
            goto L_0x0016
        L_0x000e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call sendRequest() first!"
            r0.<init>(r1)
            throw r0
        L_0x0016:
            if (r0 != 0) goto L_0x0019
            return
        L_0x0019:
            boolean r1 = r13.f10194n
            java.lang.String r2 = "Content-Length"
            r3 = 0
            if (r1 == 0) goto L_0x0026
            b.p.b.a0.k.i r1 = r13.f10184d
            r1.mo17075c(r0)
            goto L_0x0082
        L_0x0026:
            boolean r1 = r13.f10193m
            if (r1 != 0) goto L_0x0034
            b.p.b.a0.k.g$b r1 = new b.p.b.a0.k.g$b
            r1.<init>(r3, r0)
            b.p.b.w r0 = r1.mo17101a(r0)
            goto L_0x0086
        L_0x0034:
            long r4 = r13.f10185e
            r6 = -1
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x006e
            java.util.Comparator<java.lang.String> r1 = p005b.p280p.p285b.p286a0.p288k.C5204j.f10205a
            b.p.b.n r0 = r0.f10481c
            long r0 = p005b.p280p.p285b.p286a0.p288k.C5204j.m9650a(r0)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0067
            n.y r0 = r13.f10192l
            boolean r1 = r0 instanceof p005b.p280p.p285b.p286a0.p288k.C5207l
            if (r1 == 0) goto L_0x0067
            b.p.b.a0.k.l r0 = (p005b.p280p.p285b.p286a0.p288k.C5207l) r0
            n.e r0 = r0.f10213i
            long r0 = r0.f16140h
            b.p.b.t r4 = r13.f10189i
            b.p.b.t$b r4 = r4.mo17192c()
            java.lang.String r0 = java.lang.Long.toString(r0)
            r4.mo17196b(r2, r0)
            b.p.b.t r0 = r4.mo17195a()
            r13.f10189i = r0
        L_0x0067:
            b.p.b.a0.k.i r0 = r13.f10184d
            b.p.b.t r1 = r13.f10189i
            r0.mo17075c(r1)
        L_0x006e:
            n.y r0 = r13.f10192l
            if (r0 == 0) goto L_0x0082
            r0.close()
            n.y r0 = r13.f10192l
            boolean r1 = r0 instanceof p005b.p280p.p285b.p286a0.p288k.C5207l
            if (r1 == 0) goto L_0x0082
            b.p.b.a0.k.i r1 = r13.f10184d
            b.p.b.a0.k.l r0 = (p005b.p280p.p285b.p286a0.p288k.C5207l) r0
            r1.mo17077e(r0)
        L_0x0082:
            b.p.b.w r0 = r13.mo17089d()
        L_0x0086:
            b.p.b.n r1 = r0.f10500f
            r13.mo17091f(r1)
            b.p.b.w r1 = r13.f10190j
            java.lang.String r4 = "networkResponse"
            r5 = 1
            if (r1 == 0) goto L_0x0190
            int r6 = r0.f10497c
            r7 = 304(0x130, float:4.26E-43)
            if (r6 != r7) goto L_0x0099
            goto L_0x00c6
        L_0x0099:
            b.p.b.n r1 = r1.f10500f
            java.lang.String r6 = "Last-Modified"
            java.lang.String r1 = r1.mo17153a(r6)
            r7 = 0
            if (r1 == 0) goto L_0x00a9
            java.util.Date r1 = p005b.p280p.p285b.p286a0.p288k.C5197f.m9623a(r1)
            goto L_0x00aa
        L_0x00a9:
            r1 = r7
        L_0x00aa:
            if (r1 == 0) goto L_0x00c8
            b.p.b.n r8 = r0.f10500f
            java.lang.String r6 = r8.mo17153a(r6)
            if (r6 == 0) goto L_0x00b8
            java.util.Date r7 = p005b.p280p.p285b.p286a0.p288k.C5197f.m9623a(r6)
        L_0x00b8:
            if (r7 == 0) goto L_0x00c8
            long r6 = r7.getTime()
            long r8 = r1.getTime()
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x00c8
        L_0x00c6:
            r1 = r5
            goto L_0x00c9
        L_0x00c8:
            r1 = r3
        L_0x00c9:
            if (r1 == 0) goto L_0x0189
            b.p.b.w r1 = r13.f10190j
            b.p.b.w$b r1 = r1.mo17201c()
            b.p.b.t r5 = r13.f10188h
            r1.f10506a = r5
            b.p.b.w r5 = r13.f10183c
            b.p.b.w r5 = m9625k(r5)
            r1.mo17207e(r5)
            b.p.b.w r5 = r13.f10190j
            b.p.b.n r5 = r5.f10500f
            b.p.b.n r6 = r0.f10500f
            b.p.b.n$b r7 = new b.p.b.n$b
            r7.<init>()
            int r8 = r5.mo17156d()
            r9 = r3
        L_0x00ee:
            if (r9 >= r8) goto L_0x011b
            java.lang.String r10 = r5.mo17154b(r9)
            java.lang.String r11 = r5.mo17157e(r9)
            java.lang.String r12 = "Warning"
            boolean r12 = r12.equalsIgnoreCase(r10)
            if (r12 == 0) goto L_0x0109
            java.lang.String r12 = "1"
            boolean r12 = r11.startsWith(r12)
            if (r12 == 0) goto L_0x0109
            goto L_0x0118
        L_0x0109:
            boolean r12 = p005b.p280p.p285b.p286a0.p288k.C5204j.m9651b(r10)
            if (r12 == 0) goto L_0x0115
            java.lang.String r12 = r6.mo17153a(r10)
            if (r12 != 0) goto L_0x0118
        L_0x0115:
            r7.mo17159a(r10, r11)
        L_0x0118:
            int r9 = r9 + 1
            goto L_0x00ee
        L_0x011b:
            int r5 = r6.mo17156d()
        L_0x011f:
            if (r3 >= r5) goto L_0x013c
            java.lang.String r8 = r6.mo17154b(r3)
            boolean r9 = r2.equalsIgnoreCase(r8)
            if (r9 == 0) goto L_0x012c
            goto L_0x0139
        L_0x012c:
            boolean r9 = p005b.p280p.p285b.p286a0.p288k.C5204j.m9651b(r8)
            if (r9 == 0) goto L_0x0139
            java.lang.String r9 = r6.mo17157e(r3)
            r7.mo17159a(r8, r9)
        L_0x0139:
            int r3 = r3 + 1
            goto L_0x011f
        L_0x013c:
            b.p.b.n r2 = r7.mo17161c()
            r1.mo17206d(r2)
            b.p.b.w r2 = r13.f10190j
            b.p.b.w r2 = m9625k(r2)
            r1.mo17204b(r2)
            b.p.b.w r2 = m9625k(r0)
            if (r2 == 0) goto L_0x0155
            r1.mo17205c(r4, r2)
        L_0x0155:
            r1.f10513h = r2
            b.p.b.w r1 = r1.mo17203a()
            r13.f10191k = r1
            b.p.b.x r0 = r0.f10501g
            r0.close()
            b.p.b.a0.k.p r0 = r13.f10182b
            r0.mo17115g()
            b.p.b.a0.b r0 = p005b.p280p.p285b.p286a0.C5123b.f9930b
            b.p.b.r r1 = r13.f10181a
            b.p.b.r$a r0 = (p005b.p280p.p285b.C5252r.C5253a) r0
            java.util.Objects.requireNonNull(r0)
            b.p.b.a0.c r0 = r1.f10462p
            r0.mo16971d()
            b.p.b.w r1 = r13.f10190j
            b.p.b.w r2 = r13.f10191k
            b.p.b.w r2 = m9625k(r2)
            r0.mo16973f(r1, r2)
            b.p.b.w r0 = r13.f10191k
            b.p.b.w r0 = r13.mo17096l(r0)
            r13.f10191k = r0
            return
        L_0x0189:
            b.p.b.w r1 = r13.f10190j
            b.p.b.x r1 = r1.f10501g
            p005b.p280p.p285b.p286a0.C5134i.m9458c(r1)
        L_0x0190:
            b.p.b.w$b r1 = r0.mo17201c()
            b.p.b.t r2 = r13.f10188h
            r1.f10506a = r2
            b.p.b.w r2 = r13.f10183c
            b.p.b.w r2 = m9625k(r2)
            r1.mo17207e(r2)
            b.p.b.w r2 = r13.f10190j
            b.p.b.w r2 = m9625k(r2)
            r1.mo17204b(r2)
            b.p.b.w r0 = m9625k(r0)
            if (r0 == 0) goto L_0x01b3
            r1.mo17205c(r4, r0)
        L_0x01b3:
            r1.f10513h = r0
            b.p.b.w r0 = r1.mo17203a()
            r13.f10191k = r0
            boolean r0 = m9624b(r0)
            if (r0 == 0) goto L_0x0252
            b.p.b.a0.b r0 = p005b.p280p.p285b.p286a0.C5123b.f9930b
            b.p.b.r r1 = r13.f10181a
            b.p.b.r$a r0 = (p005b.p280p.p285b.C5252r.C5253a) r0
            java.util.Objects.requireNonNull(r0)
            b.p.b.a0.c r0 = r1.f10462p
            if (r0 != 0) goto L_0x01cf
            goto L_0x021a
        L_0x01cf:
            b.p.b.w r1 = r13.f10191k
            b.p.b.t r2 = r13.f10189i
            boolean r1 = p005b.p280p.p285b.p286a0.p288k.C5184c.m9592a(r1, r2)
            if (r1 != 0) goto L_0x020e
            b.p.b.t r1 = r13.f10189i
            java.lang.String r1 = r1.f10480b
            java.lang.String r2 = "POST"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0205
            java.lang.String r2 = "PATCH"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0205
            java.lang.String r2 = "PUT"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0205
            java.lang.String r2 = "DELETE"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0205
            java.lang.String r2 = "MOVE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0206
        L_0x0205:
            r3 = r5
        L_0x0206:
            if (r3 == 0) goto L_0x021a
            b.p.b.t r1 = r13.f10189i     // Catch:{ IOException -> 0x021a }
            r0.mo16969b(r1)     // Catch:{ IOException -> 0x021a }
            goto L_0x021a
        L_0x020e:
            b.p.b.w r1 = r13.f10191k
            b.p.b.w r1 = m9625k(r1)
            b.p.b.a0.k.b r0 = r0.mo16970c(r1)
            r13.f10195o = r0
        L_0x021a:
            b.p.b.a0.k.b r0 = r13.f10195o
            b.p.b.w r1 = r13.f10191k
            if (r0 != 0) goto L_0x0221
            goto L_0x024c
        L_0x0221:
            n.y r2 = r0.mo17071a()
            if (r2 != 0) goto L_0x0228
            goto L_0x024c
        L_0x0228:
            b.p.b.x r3 = r1.f10501g
            n.g r3 = r3.mo17100z()
            n.f r2 = p005b.p291q.p292a.C5266a.m9806G(r2)
            b.p.b.a0.k.h r4 = new b.p.b.a0.k.h
            r4.<init>(r13, r3, r0, r2)
            b.p.b.w$b r0 = r1.mo17201c()
            b.p.b.a0.k.k r2 = new b.p.b.a0.k.k
            b.p.b.n r1 = r1.f10500f
            n.g r3 = p005b.p291q.p292a.C5266a.m9812H(r4)
            r2.<init>(r1, r3)
            r0.f10512g = r2
            b.p.b.w r1 = r0.mo17203a()
        L_0x024c:
            b.p.b.w r0 = r13.mo17096l(r1)
            r13.f10191k = r0
        L_0x0252:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p285b.p286a0.p288k.C5199g.mo17090e():void");
    }

    /* renamed from: f */
    public void mo17091f(C5242n nVar) {
        CookieHandler cookieHandler = this.f10181a.f10461o;
        if (cookieHandler != null) {
            cookieHandler.put(this.f10188h.mo17193d(), C5204j.m9653d(nVar, (String) null));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003c  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p005b.p280p.p285b.p286a0.p288k.C5199g mo17092g(p005b.p280p.p285b.p286a0.p288k.C5208m r11) {
        /*
            r10 = this;
            b.p.b.a0.k.p r0 = r10.f10182b
            b.p.b.a0.l.a r1 = r0.f10231d
            if (r1 == 0) goto L_0x000b
            java.io.IOException r1 = r11.f10215g
            r0.mo17111c(r1)
        L_0x000b:
            b.p.b.a0.k.n r0 = r0.f10230c
            r1 = 0
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.mo17104b()
            if (r0 == 0) goto L_0x003d
        L_0x0016:
            java.io.IOException r11 = r11.f10215g
            boolean r0 = r11 instanceof java.net.ProtocolException
            r2 = 1
            if (r0 == 0) goto L_0x001e
            goto L_0x0036
        L_0x001e:
            boolean r0 = r11 instanceof java.io.InterruptedIOException
            if (r0 == 0) goto L_0x0025
            boolean r11 = r11 instanceof java.net.SocketTimeoutException
            goto L_0x0039
        L_0x0025:
            boolean r0 = r11 instanceof javax.net.ssl.SSLHandshakeException
            if (r0 == 0) goto L_0x0032
            java.lang.Throwable r0 = r11.getCause()
            boolean r0 = r0 instanceof java.security.cert.CertificateException
            if (r0 == 0) goto L_0x0032
            goto L_0x0036
        L_0x0032:
            boolean r11 = r11 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r11 == 0) goto L_0x0038
        L_0x0036:
            r11 = r1
            goto L_0x0039
        L_0x0038:
            r11 = r2
        L_0x0039:
            if (r11 != 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r1 = r2
        L_0x003d:
            r11 = 0
            if (r1 != 0) goto L_0x0041
            return r11
        L_0x0041:
            b.p.b.r r0 = r10.f10181a
            boolean r0 = r0.f10472z
            if (r0 != 0) goto L_0x0048
            return r11
        L_0x0048:
            b.p.b.a0.k.p r7 = r10.mo17087a()
            b.p.b.a0.k.g r11 = new b.p.b.a0.k.g
            b.p.b.r r2 = r10.f10181a
            b.p.b.t r3 = r10.f10188h
            boolean r4 = r10.f10187g
            boolean r5 = r10.f10193m
            boolean r6 = r10.f10194n
            n.y r0 = r10.f10192l
            r8 = r0
            b.p.b.a0.k.l r8 = (p005b.p280p.p285b.p286a0.p288k.C5207l) r8
            b.p.b.w r9 = r10.f10183c
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p285b.p286a0.p288k.C5199g.mo17092g(b.p.b.a0.k.m):b.p.b.a0.k.g");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r0 == 1) goto L_0x0029;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p005b.p280p.p285b.p286a0.p288k.C5199g mo17093h(java.io.IOException r10, p435n.C8064y r11) {
        /*
            r9 = this;
            b.p.b.a0.k.p r11 = r9.f10182b
            b.p.b.a0.l.a r0 = r11.f10231d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            int r0 = r0.f10242g
            r11.mo17111c(r10)
            if (r0 != r2) goto L_0x0010
            goto L_0x0029
        L_0x0010:
            b.p.b.a0.k.n r11 = r11.f10230c
            if (r11 == 0) goto L_0x001a
            boolean r11 = r11.mo17104b()
            if (r11 == 0) goto L_0x0029
        L_0x001a:
            boolean r11 = r10 instanceof java.net.ProtocolException
            if (r11 == 0) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            boolean r10 = r10 instanceof java.io.InterruptedIOException
            if (r10 == 0) goto L_0x0025
        L_0x0023:
            r10 = r1
            goto L_0x0026
        L_0x0025:
            r10 = r2
        L_0x0026:
            if (r10 == 0) goto L_0x0029
            r1 = r2
        L_0x0029:
            r10 = 0
            if (r1 != 0) goto L_0x002d
            return r10
        L_0x002d:
            b.p.b.r r11 = r9.f10181a
            boolean r11 = r11.f10472z
            if (r11 != 0) goto L_0x0034
            return r10
        L_0x0034:
            b.p.b.a0.k.p r6 = r9.mo17087a()
            b.p.b.a0.k.g r10 = new b.p.b.a0.k.g
            b.p.b.r r1 = r9.f10181a
            b.p.b.t r2 = r9.f10188h
            boolean r3 = r9.f10187g
            boolean r4 = r9.f10193m
            boolean r5 = r9.f10194n
            b.p.b.w r8 = r9.f10183c
            r7 = 0
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p285b.p286a0.p288k.C5199g.mo17093h(java.io.IOException, n.y):b.p.b.a0.k.g");
    }

    /* renamed from: i */
    public boolean mo17094i(C5245o oVar) {
        C5245o oVar2 = this.f10188h.f10479a;
        return oVar2.f10423d.equals(oVar.f10423d) && oVar2.f10424e == oVar.f10424e && oVar2.f10420a.equals(oVar.f10420a);
    }

    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v1, types: [b.p.b.w, b.p.b.a0.k.c$a, b.p.b.t] */
    /* JADX WARNING: type inference failed for: r6v20 */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0210, code lost:
        if (r7 > 0) goto L_0x01fc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02f5  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17095j() {
        /*
            r27 = this;
            r1 = r27
            b.p.b.a0.k.c r0 = r1.f10196p
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            b.p.b.a0.k.i r0 = r1.f10184d
            if (r0 != 0) goto L_0x0441
            b.p.b.t r0 = r1.f10188h
            b.p.b.t$b r2 = r0.mo17192c()
            b.p.b.n r3 = r0.f10481c
            java.lang.String r4 = "Host"
            java.lang.String r3 = r3.mo17153a(r4)
            if (r3 != 0) goto L_0x0024
            b.p.b.o r3 = r0.f10479a
            java.lang.String r3 = p005b.p280p.p285b.p286a0.C5134i.m9462g(r3)
            r2.mo17196b(r4, r3)
        L_0x0024:
            b.p.b.n r3 = r0.f10481c
            java.lang.String r4 = "Connection"
            java.lang.String r3 = r3.mo17153a(r4)
            if (r3 != 0) goto L_0x0033
            java.lang.String r3 = "Keep-Alive"
            r2.mo17196b(r4, r3)
        L_0x0033:
            b.p.b.n r3 = r0.f10481c
            java.lang.String r4 = "Accept-Encoding"
            java.lang.String r3 = r3.mo17153a(r4)
            r5 = 1
            if (r3 != 0) goto L_0x0045
            r1.f10186f = r5
            java.lang.String r3 = "gzip"
            r2.mo17196b(r4, r3)
        L_0x0045:
            b.p.b.r r3 = r1.f10181a
            java.net.CookieHandler r3 = r3.f10461o
            r4 = 0
            r6 = 0
            if (r3 == 0) goto L_0x00d1
            b.p.b.t r7 = r2.mo17195a()
            b.p.b.n r7 = r7.f10481c
            java.util.Map r7 = p005b.p280p.p285b.p286a0.p288k.C5204j.m9653d(r7, r6)
            java.net.URI r8 = r0.mo17193d()
            java.util.Map r3 = r3.get(r8, r7)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0067:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x00d1
            java.lang.Object r7 = r3.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getKey()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = "Cookie"
            boolean r9 = r9.equalsIgnoreCase(r8)
            if (r9 != 0) goto L_0x0089
            java.lang.String r9 = "Cookie2"
            boolean r9 = r9.equalsIgnoreCase(r8)
            if (r9 == 0) goto L_0x0067
        L_0x0089:
            java.lang.Object r9 = r7.getValue()
            java.util.List r9 = (java.util.List) r9
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x0067
            java.lang.Object r7 = r7.getValue()
            java.util.List r7 = (java.util.List) r7
            int r9 = r7.size()
            if (r9 != r5) goto L_0x00a8
            java.lang.Object r7 = r7.get(r4)
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x00cb
        L_0x00a8:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r10 = r7.size()
            r11 = r4
        L_0x00b2:
            if (r11 >= r10) goto L_0x00c7
            if (r11 <= 0) goto L_0x00bb
            java.lang.String r12 = "; "
            r9.append(r12)
        L_0x00bb:
            java.lang.Object r12 = r7.get(r11)
            java.lang.String r12 = (java.lang.String) r12
            r9.append(r12)
            int r11 = r11 + 1
            goto L_0x00b2
        L_0x00c7:
            java.lang.String r7 = r9.toString()
        L_0x00cb:
            b.p.b.n$b r9 = r2.f10488c
            r9.mo17159a(r8, r7)
            goto L_0x0067
        L_0x00d1:
            b.p.b.n r0 = r0.f10481c
            java.lang.String r3 = "User-Agent"
            java.lang.String r0 = r0.mo17153a(r3)
            if (r0 != 0) goto L_0x00e0
            java.lang.String r0 = "okhttp/2.7.5"
            r2.mo17196b(r3, r0)
        L_0x00e0:
            b.p.b.t r0 = r2.mo17195a()
            b.p.b.a0.b r2 = p005b.p280p.p285b.p286a0.C5123b.f9930b
            b.p.b.r r3 = r1.f10181a
            b.p.b.r$a r2 = (p005b.p280p.p285b.C5252r.C5253a) r2
            java.util.Objects.requireNonNull(r2)
            b.p.b.a0.c r2 = r3.f10462p
            if (r2 == 0) goto L_0x00f6
            b.p.b.w r3 = r2.mo16968a(r0)
            goto L_0x00f7
        L_0x00f6:
            r3 = r6
        L_0x00f7:
            long r7 = java.lang.System.currentTimeMillis()
            r9 = -1
            if (r3 == 0) goto L_0x0181
            b.p.b.n r12 = r3.f10500f
            int r13 = r12.mo17156d()
            r14 = r4
            r16 = r6
            r21 = r16
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r15 = r9
            r17 = 0
            r19 = 0
        L_0x0116:
            if (r14 >= r13) goto L_0x0192
            java.lang.String r4 = r12.mo17154b(r14)
            java.lang.String r5 = r12.mo17157e(r14)
            java.lang.String r10 = "Date"
            boolean r10 = r10.equalsIgnoreCase(r4)
            if (r10 == 0) goto L_0x012f
            java.util.Date r16 = p005b.p280p.p285b.p286a0.p288k.C5197f.m9623a(r5)
            r25 = r5
            goto L_0x017c
        L_0x012f:
            java.lang.String r10 = "Expires"
            boolean r10 = r10.equalsIgnoreCase(r4)
            if (r10 == 0) goto L_0x013c
            java.util.Date r21 = p005b.p280p.p285b.p286a0.p288k.C5197f.m9623a(r5)
            goto L_0x017c
        L_0x013c:
            java.lang.String r10 = "Last-Modified"
            boolean r10 = r10.equalsIgnoreCase(r4)
            if (r10 == 0) goto L_0x014b
            java.util.Date r22 = p005b.p280p.p285b.p286a0.p288k.C5197f.m9623a(r5)
            r24 = r5
            goto L_0x017c
        L_0x014b:
            java.lang.String r10 = "ETag"
            boolean r10 = r10.equalsIgnoreCase(r4)
            if (r10 == 0) goto L_0x0156
            r23 = r5
            goto L_0x017c
        L_0x0156:
            java.lang.String r10 = "Age"
            boolean r10 = r10.equalsIgnoreCase(r4)
            if (r10 == 0) goto L_0x0163
            int r15 = p005b.p273o.C4805c3.m8815n(r5, r9)
            goto L_0x017c
        L_0x0163:
            java.lang.String r10 = p005b.p280p.p285b.p286a0.p288k.C5204j.f10207c
            boolean r10 = r10.equalsIgnoreCase(r4)
            if (r10 == 0) goto L_0x0170
            long r19 = java.lang.Long.parseLong(r5)
            goto L_0x017c
        L_0x0170:
            java.lang.String r10 = p005b.p280p.p285b.p286a0.p288k.C5204j.f10208d
            boolean r4 = r10.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x017c
            long r17 = java.lang.Long.parseLong(r5)
        L_0x017c:
            int r14 = r14 + 1
            r4 = 0
            r5 = 1
            goto L_0x0116
        L_0x0181:
            r16 = r6
            r21 = r16
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r15 = r9
            r17 = 0
            r19 = 0
        L_0x0192:
            if (r3 != 0) goto L_0x019b
            b.p.b.a0.k.c r4 = new b.p.b.a0.k.c
            r4.<init>(r0, r6, r6)
            goto L_0x0301
        L_0x019b:
            boolean r4 = r0.mo17191b()
            if (r4 == 0) goto L_0x01ac
            b.p.b.m r4 = r3.f10499e
            if (r4 != 0) goto L_0x01ac
            b.p.b.a0.k.c r4 = new b.p.b.a0.k.c
            r4.<init>(r0, r6, r6)
            goto L_0x0301
        L_0x01ac:
            boolean r4 = p005b.p280p.p285b.p286a0.p288k.C5184c.m9592a(r3, r0)
            if (r4 != 0) goto L_0x01b9
            b.p.b.a0.k.c r4 = new b.p.b.a0.k.c
            r4.<init>(r0, r6, r6)
            goto L_0x0301
        L_0x01b9:
            b.p.b.c r4 = r0.mo17190a()
            boolean r5 = r4.f10261a
            if (r5 != 0) goto L_0x02fc
            boolean r5 = p005b.p280p.p285b.p286a0.p288k.C5184c.C5186b.m9593a(r0)
            if (r5 == 0) goto L_0x01c9
            goto L_0x02fc
        L_0x01c9:
            if (r16 == 0) goto L_0x01d8
            long r10 = r16.getTime()
            long r10 = r17 - r10
            r12 = 0
            long r10 = java.lang.Math.max(r12, r10)
            goto L_0x01da
        L_0x01d8:
            r10 = 0
        L_0x01da:
            if (r15 == r9) goto L_0x01e7
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            long r12 = (long) r15
            long r12 = r5.toMillis(r12)
            long r10 = java.lang.Math.max(r10, r12)
        L_0x01e7:
            long r12 = r17 - r19
            long r7 = r7 - r17
            long r10 = r10 + r12
            long r10 = r10 + r7
            b.p.b.c r5 = r3.mo17199a()
            int r5 = r5.f10263c
            if (r5 == r9) goto L_0x01fe
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            long r12 = (long) r5
            long r7 = r7.toMillis(r12)
        L_0x01fc:
            r12 = r7
            goto L_0x0213
        L_0x01fe:
            if (r21 == 0) goto L_0x0217
            if (r16 == 0) goto L_0x0206
            long r17 = r16.getTime()
        L_0x0206:
            long r7 = r21.getTime()
            long r7 = r7 - r17
            r12 = 0
            int r5 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x024a
            goto L_0x01fc
        L_0x0213:
            r7 = r12
            r12 = 0
            goto L_0x024d
        L_0x0217:
            if (r22 == 0) goto L_0x024a
            b.p.b.t r5 = r3.f10495a
            b.p.b.o r5 = r5.f10479a
            java.util.List<java.lang.String> r7 = r5.f10426g
            if (r7 != 0) goto L_0x0223
            r5 = r6
            goto L_0x0231
        L_0x0223:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.util.List<java.lang.String> r5 = r5.f10426g
            p005b.p280p.p285b.C5245o.m9722j(r7, r5)
            java.lang.String r5 = r7.toString()
        L_0x0231:
            if (r5 != 0) goto L_0x024a
            if (r16 == 0) goto L_0x0239
            long r19 = r16.getTime()
        L_0x0239:
            long r7 = r22.getTime()
            long r19 = r19 - r7
            r12 = 0
            int r5 = (r19 > r12 ? 1 : (r19 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x024c
            r7 = 10
            long r7 = r19 / r7
            goto L_0x024d
        L_0x024a:
            r12 = 0
        L_0x024c:
            r7 = r12
        L_0x024d:
            int r5 = r4.f10263c
            if (r5 == r9) goto L_0x025c
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.SECONDS
            long r12 = (long) r5
            long r12 = r14.toMillis(r12)
            long r7 = java.lang.Math.min(r7, r12)
        L_0x025c:
            int r5 = r4.f10269i
            if (r5 == r9) goto L_0x0268
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS
            long r13 = (long) r5
            long r12 = r12.toMillis(r13)
            goto L_0x026a
        L_0x0268:
            r12 = 0
        L_0x026a:
            b.p.b.c r5 = r3.mo17199a()
            boolean r14 = r5.f10267g
            if (r14 != 0) goto L_0x0280
            int r4 = r4.f10268h
            if (r4 == r9) goto L_0x0280
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.SECONDS
            r17 = r7
            long r6 = (long) r4
            long r6 = r14.toMillis(r6)
            goto L_0x0284
        L_0x0280:
            r17 = r7
            r6 = 0
        L_0x0284:
            boolean r4 = r5.f10261a
            if (r4 != 0) goto L_0x02cb
            long r12 = r12 + r10
            long r6 = r6 + r17
            int r4 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x02cb
            b.p.b.w$b r4 = r3.mo17201c()
            int r5 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            java.lang.String r6 = "Warning"
            if (r5 < 0) goto L_0x02a0
            b.p.b.n$b r5 = r4.f10511f
            java.lang.String r7 = "110 HttpURLConnection \"Response is stale\""
            r5.mo17159a(r6, r7)
        L_0x02a0:
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            int r5 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x02bf
            b.p.b.c r5 = r3.mo17199a()
            int r5 = r5.f10263c
            if (r5 != r9) goto L_0x02b4
            if (r21 != 0) goto L_0x02b4
            r26 = 1
            goto L_0x02b6
        L_0x02b4:
            r26 = 0
        L_0x02b6:
            if (r26 == 0) goto L_0x02bf
            b.p.b.n$b r5 = r4.f10511f
            java.lang.String r7 = "113 HttpURLConnection \"Heuristic expiration\""
            r5.mo17159a(r6, r7)
        L_0x02bf:
            b.p.b.a0.k.c r5 = new b.p.b.a0.k.c
            b.p.b.w r4 = r4.mo17203a()
            r6 = 0
            r5.<init>(r6, r4, r6)
        L_0x02c9:
            r4 = r5
            goto L_0x0301
        L_0x02cb:
            b.p.b.t$b r4 = r0.mo17192c()
            java.lang.String r5 = "If-Modified-Since"
            if (r23 == 0) goto L_0x02d8
            java.lang.String r5 = "If-None-Match"
            r6 = r23
            goto L_0x02e1
        L_0x02d8:
            if (r22 == 0) goto L_0x02dd
            r6 = r24
            goto L_0x02e1
        L_0x02dd:
            if (r16 == 0) goto L_0x02e4
            r6 = r25
        L_0x02e1:
            r4.mo17196b(r5, r6)
        L_0x02e4:
            b.p.b.t r4 = r4.mo17195a()
            boolean r5 = p005b.p280p.p285b.p286a0.p288k.C5184c.C5186b.m9593a(r4)
            if (r5 == 0) goto L_0x02f5
            b.p.b.a0.k.c r5 = new b.p.b.a0.k.c
            r6 = 0
            r5.<init>(r4, r3, r6)
            goto L_0x02c9
        L_0x02f5:
            r6 = 0
            b.p.b.a0.k.c r5 = new b.p.b.a0.k.c
            r5.<init>(r4, r6, r6)
            goto L_0x02c9
        L_0x02fc:
            b.p.b.a0.k.c r4 = new b.p.b.a0.k.c
            r4.<init>(r0, r6, r6)
        L_0x0301:
            b.p.b.t r5 = r4.f10134a
            if (r5 == 0) goto L_0x0312
            b.p.b.c r5 = r0.mo17190a()
            boolean r5 = r5.f10270j
            if (r5 == 0) goto L_0x0312
            b.p.b.a0.k.c r4 = new b.p.b.a0.k.c
            r4.<init>(r6, r6, r6)
        L_0x0312:
            r1.f10196p = r4
            b.p.b.t r5 = r4.f10134a
            r1.f10189i = r5
            b.p.b.w r5 = r4.f10135b
            r1.f10190j = r5
            if (r2 == 0) goto L_0x0321
            r2.mo16972e(r4)
        L_0x0321:
            if (r3 == 0) goto L_0x032c
            b.p.b.w r2 = r1.f10190j
            if (r2 != 0) goto L_0x032c
            b.p.b.x r2 = r3.f10501g
            p005b.p280p.p285b.p286a0.C5134i.m9458c(r2)
        L_0x032c:
            b.p.b.t r2 = r1.f10189i
            if (r2 == 0) goto L_0x03f3
            java.lang.String r2 = r2.f10480b
            java.lang.String r3 = "GET"
            boolean r2 = r2.equals(r3)
            r3 = 1
            r9 = r2 ^ 1
            b.p.b.a0.k.p r2 = r1.f10182b
            b.p.b.r r3 = r1.f10181a
            int r5 = r3.f10450A
            int r10 = r3.f10451B
            int r11 = r3.f10452C
            boolean r8 = r3.f10472z
            java.util.Objects.requireNonNull(r2)
            r4 = r2
            r6 = r10
            r7 = r11
            b.p.b.a0.l.a r3 = r4.mo17113e(r5, r6, r7, r8, r9)     // Catch:{ IOException -> 0x03ec }
            b.p.b.a0.j.d r4 = r3.f10241f     // Catch:{ IOException -> 0x03ec }
            if (r4 == 0) goto L_0x035d
            b.p.b.a0.k.e r4 = new b.p.b.a0.k.e     // Catch:{ IOException -> 0x03ec }
            b.p.b.a0.j.d r5 = r3.f10241f     // Catch:{ IOException -> 0x03ec }
            r4.<init>(r2, r5)     // Catch:{ IOException -> 0x03ec }
            goto L_0x0381
        L_0x035d:
            java.net.Socket r4 = r3.f10238c     // Catch:{ IOException -> 0x03ec }
            r4.setSoTimeout(r10)     // Catch:{ IOException -> 0x03ec }
            n.g r4 = r3.f10243h     // Catch:{ IOException -> 0x03ec }
            n.b0 r4 = r4.mo17035f()     // Catch:{ IOException -> 0x03ec }
            long r5 = (long) r10     // Catch:{ IOException -> 0x03ec }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ IOException -> 0x03ec }
            r4.mo25879g(r5, r7)     // Catch:{ IOException -> 0x03ec }
            n.f r4 = r3.f10244i     // Catch:{ IOException -> 0x03ec }
            n.b0 r4 = r4.mo17028f()     // Catch:{ IOException -> 0x03ec }
            long r5 = (long) r11     // Catch:{ IOException -> 0x03ec }
            r4.mo25879g(r5, r7)     // Catch:{ IOException -> 0x03ec }
            b.p.b.a0.k.d r4 = new b.p.b.a0.k.d     // Catch:{ IOException -> 0x03ec }
            n.g r5 = r3.f10243h     // Catch:{ IOException -> 0x03ec }
            n.f r6 = r3.f10244i     // Catch:{ IOException -> 0x03ec }
            r4.<init>(r2, r5, r6)     // Catch:{ IOException -> 0x03ec }
        L_0x0381:
            b.p.b.i r5 = r2.f10229b     // Catch:{ IOException -> 0x03ec }
            monitor-enter(r5)     // Catch:{ IOException -> 0x03ec }
            int r6 = r3.f10242g     // Catch:{ all -> 0x03e9 }
            r7 = 1
            int r6 = r6 + r7
            r3.f10242g = r6     // Catch:{ all -> 0x03e9 }
            r2.f10233f = r4     // Catch:{ all -> 0x03e9 }
            monitor-exit(r5)     // Catch:{ all -> 0x03e9 }
            r1.f10184d = r4
            r4.mo17076d(r1)
            boolean r2 = r1.f10193m
            if (r2 == 0) goto L_0x0440
            b.p.b.t r2 = r1.f10189i
            boolean r2 = r1.mo17088c(r2)
            if (r2 == 0) goto L_0x0440
            n.y r2 = r1.f10192l
            if (r2 != 0) goto L_0x0440
            java.util.Comparator<java.lang.String> r2 = p005b.p280p.p285b.p286a0.p288k.C5204j.f10205a
            b.p.b.n r0 = r0.f10481c
            long r2 = p005b.p280p.p285b.p286a0.p288k.C5204j.m9650a(r0)
            boolean r0 = r1.f10187g
            if (r0 == 0) goto L_0x03d7
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x03cf
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x03c9
            b.p.b.a0.k.i r0 = r1.f10184d
            b.p.b.t r4 = r1.f10189i
            r0.mo17075c(r4)
            b.p.b.a0.k.l r0 = new b.p.b.a0.k.l
            int r2 = (int) r2
            r0.<init>(r2)
            goto L_0x03e6
        L_0x03c9:
            b.p.b.a0.k.l r0 = new b.p.b.a0.k.l
            r0.<init>()
            goto L_0x03e6
        L_0x03cf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2 GiB."
            r0.<init>(r2)
            throw r0
        L_0x03d7:
            b.p.b.a0.k.i r0 = r1.f10184d
            b.p.b.t r4 = r1.f10189i
            r0.mo17075c(r4)
            b.p.b.a0.k.i r0 = r1.f10184d
            b.p.b.t r4 = r1.f10189i
            n.y r0 = r0.mo17074b(r4, r2)
        L_0x03e6:
            r1.f10192l = r0
            goto L_0x0440
        L_0x03e9:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x03e9 }
            throw r0     // Catch:{ IOException -> 0x03ec }
        L_0x03ec:
            r0 = move-exception
            b.p.b.a0.k.m r2 = new b.p.b.a0.k.m
            r2.<init>(r0)
            throw r2
        L_0x03f3:
            b.p.b.w r0 = r1.f10190j
            if (r0 == 0) goto L_0x0412
            b.p.b.w$b r0 = r0.mo17201c()
            b.p.b.t r2 = r1.f10188h
            r0.f10506a = r2
            b.p.b.w r2 = r1.f10183c
            b.p.b.w r2 = m9625k(r2)
            r0.mo17207e(r2)
            b.p.b.w r2 = r1.f10190j
            b.p.b.w r2 = m9625k(r2)
            r0.mo17204b(r2)
            goto L_0x0434
        L_0x0412:
            b.p.b.w$b r0 = new b.p.b.w$b
            r0.<init>()
            b.p.b.t r2 = r1.f10188h
            r0.f10506a = r2
            b.p.b.w r2 = r1.f10183c
            b.p.b.w r2 = m9625k(r2)
            r0.mo17207e(r2)
            b.p.b.s r2 = p005b.p280p.p285b.C5254s.HTTP_1_1
            r0.f10507b = r2
            r2 = 504(0x1f8, float:7.06E-43)
            r0.f10508c = r2
            java.lang.String r2 = "Unsatisfiable Request (only-if-cached)"
            r0.f10509d = r2
            b.p.b.x r2 = f10180q
            r0.f10512g = r2
        L_0x0434:
            b.p.b.w r0 = r0.mo17203a()
            r1.f10191k = r0
            b.p.b.w r0 = r1.mo17096l(r0)
            r1.f10191k = r0
        L_0x0440:
            return
        L_0x0441:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p285b.p286a0.p288k.C5199g.mo17095j():void");
    }

    /* renamed from: l */
    public final C5260w mo17096l(C5260w wVar) {
        C5263x xVar;
        if (!this.f10186f) {
            return wVar;
        }
        String a = this.f10191k.f10500f.mo17153a("Content-Encoding");
        if (a == null) {
            a = null;
        }
        if (!"gzip".equalsIgnoreCase(a) || (xVar = wVar.f10501g) == null) {
            return wVar;
        }
        C8050m mVar = new C8050m(xVar.mo17100z());
        C5242n.C5244b c = wVar.f10500f.mo17155c();
        c.mo17163e("Content-Encoding");
        c.mo17163e("Content-Length");
        C5242n c2 = c.mo17161c();
        C5260w.C5262b c3 = wVar.mo17201c();
        c3.mo17206d(c2);
        c3.f10512g = new C5206k(c2, C5266a.m9812H(mVar));
        return c3.mo17203a();
    }

    /* renamed from: m */
    public void mo17097m() {
        if (this.f10185e == -1) {
            this.f10185e = System.currentTimeMillis();
            return;
        }
        throw new IllegalStateException();
    }
}
