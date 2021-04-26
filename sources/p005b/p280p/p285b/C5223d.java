package p005b.p280p.p285b;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import p005b.p040g.p041a.C0851b;
import p005b.p040g.p041a.C0852c;
import p005b.p040g.p041a.p042e.C0856c;
import p005b.p040g.p041a.p047i.p048b.C0908a;
import p005b.p040g.p041a.p047i.p048b.C0910c;
import p005b.p040g.p041a.p047i.p048b.C0917j;
import p005b.p280p.p285b.C5249p;
import p005b.p280p.p285b.p286a0.C5123b;
import p005b.p280p.p285b.p286a0.C5125d;
import p005b.p280p.p285b.p286a0.p288k.C5199g;

/* renamed from: b.p.b.d */
public class C5223d {

    /* renamed from: a */
    public final C5252r f10276a;

    /* renamed from: b */
    public boolean f10277b;

    /* renamed from: c */
    public C5255t f10278c;

    /* renamed from: d */
    public C5199g f10279d;

    /* renamed from: b.p.b.d$b */
    public class C5225b implements C5249p.C5250a {

        /* renamed from: a */
        public final int f10280a;

        /* renamed from: b */
        public final C5255t f10281b;

        /* renamed from: c */
        public final boolean f10282c;

        public C5225b(int i, C5255t tVar, boolean z) {
            this.f10280a = i;
            this.f10281b = tVar;
            this.f10282c = z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:100:0x0201, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0113, code lost:
            if (r8.equals("HEAD") == false) goto L_0x014d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
            r2.f10279d = r4;
         */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x0191 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x019b  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p005b.p280p.p285b.C5260w mo17132a(p005b.p280p.p285b.C5255t r20) {
            /*
                r19 = this;
                r1 = r19
                r0 = r20
                int r2 = r1.f10280a
                b.p.b.d r3 = p005b.p280p.p285b.C5223d.this
                b.p.b.r r3 = r3.f10276a
                java.util.List<b.p.b.p> r3 = r3.f10458l
                int r3 = r3.size()
                if (r2 >= r3) goto L_0x004c
                b.p.b.d$b r2 = new b.p.b.d$b
                b.p.b.d r3 = p005b.p280p.p285b.C5223d.this
                int r4 = r1.f10280a
                int r5 = r4 + 1
                boolean r6 = r1.f10282c
                r2.<init>(r5, r0, r6)
                b.p.b.r r0 = r3.f10276a
                java.util.List<b.p.b.p> r0 = r0.f10458l
                java.lang.Object r0 = r0.get(r4)
                b.p.b.p r0 = (p005b.p280p.p285b.C5249p) r0
                b.p.b.w r2 = r0.mo17183a(r2)
                if (r2 == 0) goto L_0x0030
                return r2
            L_0x0030:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "application interceptor "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = " returned null"
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r2.<init>(r0)
                throw r2
            L_0x004c:
                b.p.b.d r2 = p005b.p280p.p285b.C5223d.this
                boolean r12 = r1.f10282c
                java.util.Objects.requireNonNull(r2)
                b.p.b.v r3 = r0.f10482d
                java.lang.String r13 = "Content-Type"
                java.lang.String r14 = "Content-Length"
                java.lang.String r15 = "Transfer-Encoding"
                if (r3 == 0) goto L_0x0090
                b.p.b.t$b r0 = r20.mo17192c()
                b.p.b.u r3 = (p005b.p280p.p285b.C5258u) r3
                b.p.b.q r4 = r3.f10491a
                if (r4 == 0) goto L_0x006c
                java.lang.String r4 = r4.f10445a
                r0.mo17196b(r13, r4)
            L_0x006c:
                int r3 = r3.f10492b
                long r3 = (long) r3
                r5 = -1
                int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r5 == 0) goto L_0x0082
                java.lang.String r3 = java.lang.Long.toString(r3)
                r0.mo17196b(r14, r3)
                b.p.b.n$b r3 = r0.f10488c
                r3.mo17163e(r15)
                goto L_0x008c
            L_0x0082:
                java.lang.String r3 = "chunked"
                r0.mo17196b(r15, r3)
                b.p.b.n$b r3 = r0.f10488c
                r3.mo17163e(r14)
            L_0x008c:
                b.p.b.t r0 = r0.mo17195a()
            L_0x0090:
                r5 = r0
                b.p.b.a0.k.g r0 = new b.p.b.a0.k.g
                b.p.b.r r4 = r2.f10276a
                r6 = 0
                r7 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r3 = r0
                r8 = r12
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                r2.f10279d = r0
                r16 = 0
                r3 = r16
            L_0x00a5:
                r4 = 0
                r5 = 1
                b.p.b.a0.k.g r0 = r2.f10279d     // Catch:{ m -> 0x01f4, IOException -> 0x01e9 }
                r0.mo17095j()     // Catch:{ m -> 0x01f4, IOException -> 0x01e9 }
                b.p.b.a0.k.g r0 = r2.f10279d     // Catch:{ m -> 0x01f4, IOException -> 0x01e9 }
                r0.mo17090e()     // Catch:{ m -> 0x01f4, IOException -> 0x01e9 }
                b.p.b.a0.k.g r0 = r2.f10279d
                b.p.b.w r11 = r0.f10191k
                if (r11 == 0) goto L_0x01e1
                b.p.b.a0.k.p r6 = r0.f10182b
                b.p.b.a0.l.a r6 = r6.mo17109a()
                if (r6 == 0) goto L_0x00c2
                b.p.b.y r6 = r6.f10236a
                goto L_0x00c3
            L_0x00c2:
                r6 = r4
            L_0x00c3:
                if (r6 == 0) goto L_0x00c8
                java.net.Proxy r6 = r6.f10518b
                goto L_0x00cc
            L_0x00c8:
                b.p.b.r r6 = r0.f10181a
                java.net.Proxy r6 = r6.f10455i
            L_0x00cc:
                b.p.b.w r7 = r0.f10191k
                int r7 = r7.f10497c
                b.p.b.t r8 = r0.f10188h
                java.lang.String r8 = r8.f10480b
                r9 = 307(0x133, float:4.3E-43)
                java.lang.String r10 = "GET"
                if (r7 == r9) goto L_0x0107
                r9 = 308(0x134, float:4.32E-43)
                if (r7 == r9) goto L_0x0107
                r9 = 401(0x191, float:5.62E-43)
                if (r7 == r9) goto L_0x00fb
                r9 = 407(0x197, float:5.7E-43)
                if (r7 == r9) goto L_0x00ea
                switch(r7) {
                    case 300: goto L_0x0116;
                    case 301: goto L_0x0116;
                    case 302: goto L_0x0116;
                    case 303: goto L_0x0116;
                    default: goto L_0x00e9;
                }
            L_0x00e9:
                goto L_0x014d
            L_0x00ea:
                java.net.Proxy$Type r5 = r6.type()
                java.net.Proxy$Type r7 = java.net.Proxy.Type.HTTP
                if (r5 != r7) goto L_0x00f3
                goto L_0x00fb
            L_0x00f3:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.String r2 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
                r0.<init>(r2)
                throw r0
            L_0x00fb:
                b.p.b.r r5 = r0.f10181a
                b.p.b.b r5 = r5.f10467u
                b.p.b.w r0 = r0.f10191k
                b.p.b.t r0 = p005b.p280p.p285b.p286a0.p288k.C5204j.m9652c(r5, r0, r6)
                goto L_0x018e
            L_0x0107:
                boolean r6 = r8.equals(r10)
                if (r6 != 0) goto L_0x0116
                java.lang.String r6 = "HEAD"
                boolean r6 = r8.equals(r6)
                if (r6 != 0) goto L_0x0116
                goto L_0x014d
            L_0x0116:
                b.p.b.r r6 = r0.f10181a
                boolean r6 = r6.f10471y
                if (r6 != 0) goto L_0x011d
                goto L_0x014d
            L_0x011d:
                b.p.b.w r6 = r0.f10191k
                b.p.b.n r6 = r6.f10500f
                java.lang.String r7 = "Location"
                java.lang.String r6 = r6.mo17153a(r7)
                if (r6 == 0) goto L_0x012a
                goto L_0x012b
            L_0x012a:
                r6 = r4
            L_0x012b:
                if (r6 != 0) goto L_0x012e
                goto L_0x014d
            L_0x012e:
                b.p.b.t r7 = r0.f10188h
                b.p.b.o r7 = r7.f10479a
                b.p.b.o r6 = r7.mo17172q(r6)
                if (r6 != 0) goto L_0x0139
                goto L_0x014d
            L_0x0139:
                java.lang.String r7 = r6.f10420a
                b.p.b.t r9 = r0.f10188h
                b.p.b.o r9 = r9.f10479a
                java.lang.String r9 = r9.f10420a
                boolean r7 = r7.equals(r9)
                if (r7 != 0) goto L_0x014f
                b.p.b.r r7 = r0.f10181a
                boolean r7 = r7.f10470x
                if (r7 != 0) goto L_0x014f
            L_0x014d:
                r5 = r4
                goto L_0x018f
            L_0x014f:
                b.p.b.t r7 = r0.f10188h
                b.p.b.t$b r7 = r7.mo17192c()
                boolean r9 = p005b.p273o.C4805c3.m8816o(r8)
                if (r9 == 0) goto L_0x017a
                java.lang.String r9 = "PROPFIND"
                boolean r9 = r8.equals(r9)
                r5 = r5 ^ r9
                if (r5 == 0) goto L_0x0168
                r7.mo17197c(r10, r4)
                goto L_0x016b
            L_0x0168:
                r7.mo17197c(r8, r4)
            L_0x016b:
                b.p.b.n$b r5 = r7.f10488c
                r5.mo17163e(r15)
                b.p.b.n$b r5 = r7.f10488c
                r5.mo17163e(r14)
                b.p.b.n$b r5 = r7.f10488c
                r5.mo17163e(r13)
            L_0x017a:
                boolean r0 = r0.mo17094i(r6)
                if (r0 != 0) goto L_0x0187
                b.p.b.n$b r0 = r7.f10488c
                java.lang.String r5 = "Authorization"
                r0.mo17163e(r5)
            L_0x0187:
                r7.mo17198d(r6)
                b.p.b.t r0 = r7.mo17195a()
            L_0x018e:
                r5 = r0
            L_0x018f:
                if (r5 != 0) goto L_0x019b
                if (r12 != 0) goto L_0x019a
                b.p.b.a0.k.g r0 = r2.f10279d
                b.p.b.a0.k.p r0 = r0.f10182b
                r0.mo17115g()
            L_0x019a:
                return r11
            L_0x019b:
                b.p.b.a0.k.g r0 = r2.f10279d
                b.p.b.a0.k.p r0 = r0.mo17087a()
                int r10 = r3 + 1
                r3 = 20
                if (r10 > r3) goto L_0x01ce
                b.p.b.a0.k.g r3 = r2.f10279d
                b.p.b.o r6 = r5.f10479a
                boolean r3 = r3.mo17094i(r6)
                if (r3 != 0) goto L_0x01b6
                r0.mo17115g()
                r9 = r4
                goto L_0x01b7
            L_0x01b6:
                r9 = r0
            L_0x01b7:
                b.p.b.a0.k.g r0 = new b.p.b.a0.k.g
                b.p.b.r r4 = r2.f10276a
                r6 = 0
                r7 = 0
                r17 = 0
                r3 = r0
                r8 = r12
                r18 = r10
                r10 = r17
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                r2.f10279d = r0
                r3 = r18
                goto L_0x00a5
            L_0x01ce:
                r18 = r10
                r0.mo17115g()
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.String r2 = "Too many follow-up requests: "
                r3 = r18
                java.lang.String r2 = p005b.p035e.p036a.p037a.C0843a.m444e(r2, r3)
                r0.<init>(r2)
                throw r0
            L_0x01e1:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
            L_0x01e7:
                r0 = move-exception
                goto L_0x0206
            L_0x01e9:
                r0 = move-exception
                b.p.b.a0.k.g r6 = r2.f10279d     // Catch:{ all -> 0x01e7 }
                b.p.b.a0.k.g r4 = r6.mo17093h(r0, r4)     // Catch:{ all -> 0x01e7 }
                if (r4 == 0) goto L_0x01f3
                goto L_0x01fd
            L_0x01f3:
                throw r0     // Catch:{ all -> 0x01e7 }
            L_0x01f4:
                r0 = move-exception
                b.p.b.a0.k.g r4 = r2.f10279d     // Catch:{ all -> 0x01e7 }
                b.p.b.a0.k.g r4 = r4.mo17092g(r0)     // Catch:{ all -> 0x01e7 }
                if (r4 == 0) goto L_0x0203
            L_0x01fd:
                r2.f10279d = r4     // Catch:{ all -> 0x0201 }
                goto L_0x00a5
            L_0x0201:
                r0 = move-exception
                goto L_0x0208
            L_0x0203:
                java.io.IOException r0 = r0.f10215g     // Catch:{ all -> 0x01e7 }
                throw r0     // Catch:{ all -> 0x01e7 }
            L_0x0206:
                r16 = r5
            L_0x0208:
                if (r16 == 0) goto L_0x0213
                b.p.b.a0.k.g r2 = r2.f10279d
                b.p.b.a0.k.p r2 = r2.mo17087a()
                r2.mo17115g()
            L_0x0213:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p285b.C5223d.C5225b.mo17132a(b.p.b.t):b.p.b.w");
        }
    }

    /* renamed from: b.p.b.d$c */
    public final class C5226c extends C5125d {

        /* renamed from: h */
        public final C5227e f10284h;

        /* renamed from: i */
        public final boolean f10285i;

        public C5226c(C5227e eVar, boolean z, C5224a aVar) {
            super("OkHttp %s", C5223d.this.f10278c.f10479a.f10428i);
            this.f10284h = eVar;
            this.f10285i = z;
        }

        /* renamed from: a */
        public void mo16974a() {
            boolean z = false;
            try {
                C5223d dVar = C5223d.this;
                boolean z2 = this.f10285i;
                C5255t tVar = dVar.f10278c;
                C5260w a = new C5225b(0, tVar, z2).mo17132a(tVar);
                Objects.requireNonNull(C5223d.this);
                z = true;
                ((C0917j) this.f10284h).mo10753d(a);
            } catch (IOException e) {
                if (z) {
                    Logger logger = C5123b.f9929a;
                    Level level = Level.INFO;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Callback failure for ");
                    C5245o q = C5223d.this.f10278c.f10479a.mo17172q("/...");
                    sb.append(NotificationCompat.CATEGORY_CALL + " to " + q);
                    logger.log(level, sb.toString(), e);
                } else {
                    C5199g gVar = C5223d.this.f10279d;
                    C0910c cVar = (C0910c) this.f10284h;
                    C0908a<U> aVar = cVar.f817e;
                    C0852c cVar2 = new C0852c(e);
                    Objects.requireNonNull(aVar);
                    cVar.f820h.mo10713b(new C0856c("Request failed", (C0851b) cVar2));
                }
            } catch (Throwable th) {
                C5223d.this.f10276a.f10454h.mo17147a(this);
                throw th;
            }
            C5223d.this.f10276a.f10454h.mo17147a(this);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|17|18|19|20) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0043 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5223d(p005b.p280p.p285b.C5252r r4, p005b.p280p.p285b.C5255t r5) {
        /*
            r3 = this;
            r3.<init>()
            java.util.Objects.requireNonNull(r4)
            b.p.b.r r0 = new b.p.b.r
            r0.<init>(r4)
            java.net.ProxySelector r1 = r0.f10460n
            if (r1 != 0) goto L_0x0015
            java.net.ProxySelector r1 = java.net.ProxySelector.getDefault()
            r0.f10460n = r1
        L_0x0015:
            java.net.CookieHandler r1 = r0.f10461o
            if (r1 != 0) goto L_0x001f
            java.net.CookieHandler r1 = java.net.CookieHandler.getDefault()
            r0.f10461o = r1
        L_0x001f:
            javax.net.SocketFactory r1 = r0.f10463q
            if (r1 != 0) goto L_0x0029
            javax.net.SocketFactory r1 = javax.net.SocketFactory.getDefault()
            r0.f10463q = r1
        L_0x0029:
            javax.net.ssl.SSLSocketFactory r1 = r0.f10464r
            if (r1 != 0) goto L_0x0052
            monitor-enter(r4)
            javax.net.ssl.SSLSocketFactory r1 = p005b.p280p.p285b.C5252r.f10449F     // Catch:{ all -> 0x004f }
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = "TLS"
            javax.net.ssl.SSLContext r1 = javax.net.ssl.SSLContext.getInstance(r1)     // Catch:{ GeneralSecurityException -> 0x0043 }
            r2 = 0
            r1.init(r2, r2, r2)     // Catch:{ GeneralSecurityException -> 0x0043 }
            javax.net.ssl.SSLSocketFactory r1 = r1.getSocketFactory()     // Catch:{ GeneralSecurityException -> 0x0043 }
            p005b.p280p.p285b.C5252r.f10449F = r1     // Catch:{ GeneralSecurityException -> 0x0043 }
            goto L_0x0049
        L_0x0043:
            java.lang.AssertionError r5 = new java.lang.AssertionError     // Catch:{ all -> 0x004f }
            r5.<init>()     // Catch:{ all -> 0x004f }
            throw r5     // Catch:{ all -> 0x004f }
        L_0x0049:
            javax.net.ssl.SSLSocketFactory r1 = p005b.p280p.p285b.C5252r.f10449F     // Catch:{ all -> 0x004f }
            monitor-exit(r4)
            r0.f10464r = r1
            goto L_0x0052
        L_0x004f:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0052:
            javax.net.ssl.HostnameVerifier r4 = r0.f10465s
            if (r4 != 0) goto L_0x005a
            b.p.b.a0.m.d r4 = p005b.p280p.p285b.p286a0.p290m.C5216d.f10258a
            r0.f10465s = r4
        L_0x005a:
            b.p.b.f r4 = r0.f10466t
            if (r4 != 0) goto L_0x0062
            b.p.b.f r4 = p005b.p280p.p285b.C5228f.f10287b
            r0.f10466t = r4
        L_0x0062:
            b.p.b.b r4 = r0.f10467u
            if (r4 != 0) goto L_0x006a
            b.p.b.b r4 = p005b.p280p.p285b.p286a0.p288k.C5182a.f10133a
            r0.f10467u = r4
        L_0x006a:
            b.p.b.i r4 = r0.f10468v
            if (r4 != 0) goto L_0x0072
            b.p.b.i r4 = p005b.p280p.p285b.C5233i.f10390g
            r0.f10468v = r4
        L_0x0072:
            java.util.List<b.p.b.s> r4 = r0.f10456j
            if (r4 != 0) goto L_0x007a
            java.util.List<b.p.b.s> r4 = p005b.p280p.p285b.C5252r.f10447D
            r0.f10456j = r4
        L_0x007a:
            java.util.List<b.p.b.j> r4 = r0.f10457k
            if (r4 != 0) goto L_0x0082
            java.util.List<b.p.b.j> r4 = p005b.p280p.p285b.C5252r.f10448E
            r0.f10457k = r4
        L_0x0082:
            b.p.b.l r4 = r0.f10469w
            if (r4 != 0) goto L_0x008a
            b.p.b.l r4 = p005b.p280p.p285b.C5239l.f10413a
            r0.f10469w = r4
        L_0x008a:
            r3.f10276a = r0
            r3.f10278c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p285b.C5223d.<init>(b.p.b.r, b.p.b.t):void");
    }

    /* renamed from: a */
    public void mo17131a(C5227e eVar) {
        synchronized (this) {
            if (!this.f10277b) {
                this.f10277b = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        C5238k kVar = this.f10276a.f10454h;
        C5226c cVar = new C5226c(eVar, false, (C5224a) null);
        synchronized (kVar) {
            if (kVar.f10412c.size() >= 64 || kVar.mo17150d(cVar) >= 5) {
                kVar.f10411b.add(cVar);
            } else {
                kVar.f10412c.add(cVar);
                kVar.mo17148b().execute(cVar);
            }
        }
    }
}
