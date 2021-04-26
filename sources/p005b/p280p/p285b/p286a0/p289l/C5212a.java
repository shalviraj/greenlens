package p005b.p280p.p285b.p286a0.p289l;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p285b.C5241m;
import p005b.p280p.p285b.C5254s;
import p005b.p280p.p285b.C5264y;
import p005b.p280p.p285b.p286a0.C5127f;
import p005b.p280p.p285b.p286a0.p287j.C5139d;
import p005b.p280p.p285b.p286a0.p288k.C5211p;
import p005b.p280p.p285b.p286a0.p290m.C5218f;
import p435n.C8042f;
import p435n.C8043g;

/* renamed from: b.p.b.a0.l.a */
public final class C5212a {

    /* renamed from: m */
    public static SSLSocketFactory f10234m;

    /* renamed from: n */
    public static C5218f f10235n;

    /* renamed from: a */
    public final C5264y f10236a;

    /* renamed from: b */
    public Socket f10237b;

    /* renamed from: c */
    public Socket f10238c;

    /* renamed from: d */
    public C5241m f10239d;

    /* renamed from: e */
    public C5254s f10240e;

    /* renamed from: f */
    public volatile C5139d f10241f;

    /* renamed from: g */
    public int f10242g;

    /* renamed from: h */
    public C8043g f10243h;

    /* renamed from: i */
    public C8042f f10244i;

    /* renamed from: j */
    public final List<Reference<C5211p>> f10245j = new ArrayList();

    /* renamed from: k */
    public boolean f10246k;

    /* renamed from: l */
    public long f10247l = RecyclerView.FOREVER_NS;

    public C5212a(C5264y yVar) {
        this.f10236a = yVar;
    }

    /* renamed from: b */
    public static synchronized C5218f m9673b(SSLSocketFactory sSLSocketFactory) {
        C5218f fVar;
        synchronized (C5212a.class) {
            if (sSLSocketFactory != f10234m) {
                C5127f fVar2 = C5127f.f9935a;
                f10235n = fVar2.mo16985g(fVar2.mo16984f(sSLSocketFactory));
                f10234m = sSLSocketFactory;
            }
            fVar = f10235n;
        }
        return fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0233 A[Catch:{ all -> 0x022a }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0239 A[Catch:{ all -> 0x022a }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x023d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17118a(int r18, int r19, int r20, p005b.p280p.p285b.p286a0.C5122a r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            b.p.b.s r2 = p005b.p280p.p285b.C5254s.HTTP_1_1
            java.net.Socket r3 = r1.f10237b
            r3.setSoTimeout(r0)
            b.p.b.a0.f r3 = p005b.p280p.p285b.p286a0.C5127f.f9935a     // Catch:{ ConnectException -> 0x029f }
            java.net.Socket r4 = r1.f10237b     // Catch:{ ConnectException -> 0x029f }
            b.p.b.y r5 = r1.f10236a     // Catch:{ ConnectException -> 0x029f }
            java.net.InetSocketAddress r5 = r5.f10519c     // Catch:{ ConnectException -> 0x029f }
            r6 = r18
            r3.mo16982c(r4, r5, r6)     // Catch:{ ConnectException -> 0x029f }
            java.net.Socket r3 = r1.f10237b
            n.a0 r3 = p005b.p291q.p292a.C5266a.m9946e4(r3)
            n.g r3 = p005b.p291q.p292a.C5266a.m9812H(r3)
            r1.f10243h = r3
            java.net.Socket r3 = r1.f10237b
            n.y r3 = p005b.p291q.p292a.C5266a.m9916Z3(r3)
            n.f r3 = p005b.p291q.p292a.C5266a.m9806G(r3)
            r1.f10244i = r3
            b.p.b.y r3 = r1.f10236a
            b.p.b.a r4 = r3.f10517a
            javax.net.ssl.SSLSocketFactory r4 = r4.f9922i
            r5 = 0
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x0246
            java.net.Proxy r3 = r3.f10518b
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.HTTP
            if (r3 != r4) goto L_0x0047
            r3 = r6
            goto L_0x0048
        L_0x0047:
            r3 = r7
        L_0x0048:
            if (r3 == 0) goto L_0x013c
            b.p.b.t$b r3 = new b.p.b.t$b
            r3.<init>()
            b.p.b.y r4 = r1.f10236a
            b.p.b.a r4 = r4.f10517a
            b.p.b.o r4 = r4.f9914a
            r3.mo17198d(r4)
            b.p.b.y r4 = r1.f10236a
            b.p.b.a r4 = r4.f10517a
            b.p.b.o r4 = r4.f9914a
            java.lang.String r4 = p005b.p280p.p285b.p286a0.C5134i.m9462g(r4)
            java.lang.String r8 = "Host"
            r3.mo17196b(r8, r4)
            java.lang.String r4 = "Proxy-Connection"
            java.lang.String r8 = "Keep-Alive"
            r3.mo17196b(r4, r8)
            java.lang.String r4 = "User-Agent"
            java.lang.String r8 = "okhttp/2.7.5"
            r3.mo17196b(r4, r8)
            b.p.b.t r3 = r3.mo17195a()
            b.p.b.o r4 = r3.f10479a
            java.lang.String r8 = "CONNECT "
            java.lang.StringBuilder r8 = p005b.p035e.p036a.p037a.C0843a.m460u(r8)
            java.lang.String r9 = r4.f10423d
            r8.append(r9)
            java.lang.String r9 = ":"
            r8.append(r9)
            int r4 = r4.f10424e
            java.lang.String r9 = " HTTP/1.1"
            java.lang.String r4 = p005b.p035e.p036a.p037a.C0843a.m453n(r8, r4, r9)
        L_0x0093:
            b.p.b.a0.k.d r8 = new b.p.b.a0.k.d
            n.g r9 = r1.f10243h
            n.f r10 = r1.f10244i
            r8.<init>(r5, r9, r10)
            n.b0 r9 = r9.mo17035f()
            long r10 = (long) r0
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS
            r9.mo25879g(r10, r12)
            n.f r9 = r1.f10244i
            n.b0 r9 = r9.mo17028f()
            r10 = r20
            long r13 = (long) r10
            r9.mo25879g(r13, r12)
            b.p.b.n r9 = r3.f10481c
            r8.mo17083l(r9, r4)
            n.f r9 = r8.f10138c
            r9.flush()
            b.p.b.w$b r9 = r8.mo17082k()
            r9.f10506a = r3
            b.p.b.w r3 = r9.mo17203a()
            java.util.Comparator<java.lang.String> r9 = p005b.p280p.p285b.p286a0.p288k.C5204j.f10205a
            b.p.b.n r9 = r3.f10500f
            long r13 = p005b.p280p.p285b.p286a0.p288k.C5204j.m9650a(r9)
            r15 = -1
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 != 0) goto L_0x00d6
            r13 = 0
        L_0x00d6:
            n.a0 r8 = r8.mo17080i(r13)
            r9 = 2147483647(0x7fffffff, float:NaN)
            p005b.p280p.p285b.p286a0.C5134i.m9467l(r8, r9, r12)
            b.p.b.a0.k.d$f r8 = (p005b.p280p.p285b.p286a0.p288k.C5187d.C5193f) r8
            r8.close()
            int r8 = r3.f10497c
            r9 = 200(0xc8, float:2.8E-43)
            if (r8 == r9) goto L_0x011b
            r9 = 407(0x197, float:5.7E-43)
            if (r8 != r9) goto L_0x0106
            b.p.b.y r8 = r1.f10236a
            b.p.b.a r9 = r8.f10517a
            b.p.b.b r9 = r9.f9917d
            java.net.Proxy r8 = r8.f10518b
            b.p.b.t r3 = p005b.p280p.p285b.p286a0.p288k.C5204j.m9652c(r9, r3, r8)
            if (r3 == 0) goto L_0x00fe
            goto L_0x0093
        L_0x00fe:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Failed to authenticate with proxy"
            r0.<init>(r2)
            throw r0
        L_0x0106:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Unexpected response code for CONNECT: "
            java.lang.StringBuilder r2 = p005b.p035e.p036a.p037a.C0843a.m460u(r2)
            int r3 = r3.f10497c
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x011b:
            n.g r0 = r1.f10243h
            n.e r0 = r0.mo25900a()
            boolean r0 = r0.mo25886D()
            if (r0 == 0) goto L_0x0134
            n.f r0 = r1.f10244i
            n.e r0 = r0.mo25900a()
            boolean r0 = r0.mo25886D()
            if (r0 == 0) goto L_0x0134
            goto L_0x013c
        L_0x0134:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "TLS tunnel buffered too many bytes!"
            r0.<init>(r2)
            throw r0
        L_0x013c:
            b.p.b.y r0 = r1.f10236a
            b.p.b.a r0 = r0.f10517a
            javax.net.ssl.SSLSocketFactory r3 = r0.f9922i
            java.net.Socket r4 = r1.f10237b     // Catch:{ AssertionError -> 0x022c }
            b.p.b.o r8 = r0.f9914a     // Catch:{ AssertionError -> 0x022c }
            java.lang.String r9 = r8.f10423d     // Catch:{ AssertionError -> 0x022c }
            int r8 = r8.f10424e     // Catch:{ AssertionError -> 0x022c }
            java.net.Socket r3 = r3.createSocket(r4, r9, r8, r6)     // Catch:{ AssertionError -> 0x022c }
            javax.net.ssl.SSLSocket r3 = (javax.net.ssl.SSLSocket) r3     // Catch:{ AssertionError -> 0x022c }
            r4 = r21
            b.p.b.j r4 = r4.mo16966a(r3)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            boolean r8 = r4.f10403b     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            if (r8 == 0) goto L_0x0165
            b.p.b.a0.f r8 = p005b.p280p.p285b.p286a0.C5127f.f9935a     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            b.p.b.o r9 = r0.f9914a     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.String r9 = r9.f10423d     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.util.List<b.p.b.s> r10 = r0.f9918e     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            r8.mo16981b(r3, r9, r10)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
        L_0x0165:
            r3.startHandshake()     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            javax.net.ssl.SSLSession r8 = r3.getSession()     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            b.p.b.m r8 = p005b.p280p.p285b.C5241m.m9706a(r8)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            javax.net.ssl.HostnameVerifier r9 = r0.f9923j     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            b.p.b.o r10 = r0.f9914a     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.String r10 = r10.f10423d     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            javax.net.ssl.SSLSession r11 = r3.getSession()     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            boolean r9 = r9.verify(r10, r11)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            if (r9 == 0) goto L_0x01d5
            b.p.b.f r9 = r0.f9924k     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            b.p.b.f r10 = p005b.p280p.p285b.C5228f.f10287b     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            if (r9 == r10) goto L_0x01a0
            javax.net.ssl.SSLSocketFactory r9 = r0.f9922i     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            b.p.b.a0.m.f r9 = m9673b(r9)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            b.p.b.a0.m.b r10 = new b.p.b.a0.m.b     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            r10.<init>(r9)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.util.List<java.security.cert.Certificate> r9 = r8.f10415b     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.util.List r9 = r10.mo17121a(r9)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            b.p.b.f r10 = r0.f9924k     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            b.p.b.o r0 = r0.f9914a     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.String r0 = r0.f10423d     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            r10.mo17133a(r0, r9)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
        L_0x01a0:
            boolean r0 = r4.f10403b     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            if (r0 == 0) goto L_0x01ab
            b.p.b.a0.f r0 = p005b.p280p.p285b.p286a0.C5127f.f9935a     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.String r0 = r0.mo16983d(r3)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            goto L_0x01ac
        L_0x01ab:
            r0 = r5
        L_0x01ac:
            r1.f10238c = r3     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            n.a0 r4 = p005b.p291q.p292a.C5266a.m9946e4(r3)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            n.g r4 = p005b.p291q.p292a.C5266a.m9812H(r4)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            r1.f10243h = r4     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.net.Socket r4 = r1.f10238c     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            n.y r4 = p005b.p291q.p292a.C5266a.m9916Z3(r4)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            n.f r4 = p005b.p291q.p292a.C5266a.m9806G(r4)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            r1.f10244i = r4     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            r1.f10239d = r8     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            if (r0 == 0) goto L_0x01cc
            b.p.b.s r2 = p005b.p280p.p285b.C5254s.m9747d(r0)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
        L_0x01cc:
            r1.f10240e = r2     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            b.p.b.a0.f r0 = p005b.p280p.p285b.p286a0.C5127f.f9935a
            r0.mo16980a(r3)
            goto L_0x024c
        L_0x01d5:
            java.util.List<java.security.cert.Certificate> r2 = r8.f10415b     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.Object r2 = r2.get(r7)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            javax.net.ssl.SSLPeerUnverifiedException r4 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            r5.<init>()     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.String r6 = "Hostname "
            r5.append(r6)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            b.p.b.o r0 = r0.f9914a     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.String r0 = r0.f10423d     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            r5.append(r0)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.String r0 = " not verified:"
            r5.append(r0)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.String r0 = "\n    certificate: "
            r5.append(r0)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.String r0 = p005b.p280p.p285b.C5228f.m9692b(r2)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            r5.append(r0)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.String r0 = "\n    DN: "
            r5.append(r0)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.security.Principal r0 = r2.getSubjectDN()     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.String r0 = r0.getName()     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            r5.append(r0)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.String r0 = "\n    subjectAltNames: "
            r5.append(r0)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.util.List r0 = p005b.p280p.p285b.p286a0.p290m.C5216d.m9681a(r2)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            r5.append(r0)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            java.lang.String r0 = r5.toString()     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            r4.<init>(r0)     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
            throw r4     // Catch:{ AssertionError -> 0x0227, all -> 0x0225 }
        L_0x0225:
            r0 = move-exception
            goto L_0x023b
        L_0x0227:
            r0 = move-exception
            r5 = r3
            goto L_0x022d
        L_0x022a:
            r0 = move-exception
            goto L_0x023a
        L_0x022c:
            r0 = move-exception
        L_0x022d:
            boolean r2 = p005b.p280p.p285b.p286a0.C5134i.m9466k(r0)     // Catch:{ all -> 0x022a }
            if (r2 == 0) goto L_0x0239
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x022a }
            r2.<init>(r0)     // Catch:{ all -> 0x022a }
            throw r2     // Catch:{ all -> 0x022a }
        L_0x0239:
            throw r0     // Catch:{ all -> 0x022a }
        L_0x023a:
            r3 = r5
        L_0x023b:
            if (r3 == 0) goto L_0x0242
            b.p.b.a0.f r2 = p005b.p280p.p285b.p286a0.C5127f.f9935a
            r2.mo16980a(r3)
        L_0x0242:
            p005b.p280p.p285b.p286a0.C5134i.m9459d(r3)
            throw r0
        L_0x0246:
            r1.f10240e = r2
            java.net.Socket r0 = r1.f10237b
            r1.f10238c = r0
        L_0x024c:
            b.p.b.s r0 = r1.f10240e
            b.p.b.s r2 = p005b.p280p.p285b.C5254s.SPDY_3
            if (r0 == r2) goto L_0x0256
            b.p.b.s r2 = p005b.p280p.p285b.C5254s.HTTP_2
            if (r0 != r2) goto L_0x029e
        L_0x0256:
            java.net.Socket r0 = r1.f10238c
            r0.setSoTimeout(r7)
            b.p.b.a0.j.d$c r0 = new b.p.b.a0.j.d$c
            r0.<init>(r6)
            java.net.Socket r2 = r1.f10238c
            b.p.b.y r3 = r1.f10236a
            b.p.b.a r3 = r3.f10517a
            b.p.b.o r3 = r3.f9914a
            java.lang.String r3 = r3.f10423d
            n.g r4 = r1.f10243h
            n.f r6 = r1.f10244i
            r0.f10005a = r2
            r0.f10006b = r3
            r0.f10007c = r4
            r0.f10008d = r6
            b.p.b.s r2 = r1.f10240e
            r0.f10009e = r2
            b.p.b.a0.j.d r2 = new b.p.b.a0.j.d
            r2.<init>(r0, r5)
            b.p.b.a0.j.c r0 = r2.f9996x
            r0.mo16990F()
            b.p.b.a0.j.c r0 = r2.f9996x
            b.p.b.a0.j.t r3 = r2.f9991s
            r0.mo16997g0(r3)
            b.p.b.a0.j.t r0 = r2.f9991s
            r3 = 65536(0x10000, float:9.18355E-41)
            int r0 = r0.mo17063b(r3)
            if (r0 == r3) goto L_0x029c
            b.p.b.a0.j.c r4 = r2.f9996x
            int r0 = r0 - r3
            long r5 = (long) r0
            r4.mo16996g(r7, r5)
        L_0x029c:
            r1.f10241f = r2
        L_0x029e:
            return
        L_0x029f:
            java.net.ConnectException r0 = new java.net.ConnectException
            java.lang.String r2 = "Failed to connect to "
            java.lang.StringBuilder r2 = p005b.p035e.p036a.p037a.C0843a.m460u(r2)
            b.p.b.y r3 = r1.f10236a
            java.net.InetSocketAddress r3 = r3.f10519c
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p285b.p286a0.p289l.C5212a.mo17118a(int, int, int, b.p.b.a0.a):void");
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Connection{");
        u.append(this.f10236a.f10517a.f9914a.f10423d);
        u.append(":");
        u.append(this.f10236a.f10517a.f9914a.f10424e);
        u.append(", proxy=");
        u.append(this.f10236a.f10518b);
        u.append(" hostAddress=");
        u.append(this.f10236a.f10519c);
        u.append(" cipherSuite=");
        C5241m mVar = this.f10239d;
        u.append(mVar != null ? mVar.f10414a : "none");
        u.append(" protocol=");
        u.append(this.f10240e);
        u.append('}');
        return u.toString();
    }
}
