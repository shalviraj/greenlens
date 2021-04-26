package p005b.p096l.p164b.p165a.p169b;

import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpTransport;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p164b.p165a.p173d.C3742t;
import p005b.p096l.p164b.p165a.p173d.C3743u;
import p005b.p291q.p292a.C5266a;
import p376j.p378b.p383c.C7019b;
import p376j.p378b.p383c.C7039o;
import p376j.p378b.p383c.C7050v;

/* renamed from: b.l.b.a.b.f */
public final class C3677f {

    /* renamed from: t */
    public static final String f6763t;

    /* renamed from: u */
    public static final String f6764u;

    /* renamed from: a */
    public C3675d f6765a;

    /* renamed from: b */
    public HttpHeaders f6766b = new HttpHeaders();

    /* renamed from: c */
    public HttpHeaders f6767c = new HttpHeaders();

    /* renamed from: d */
    public int f6768d = 10;

    /* renamed from: e */
    public int f6769e = 16384;

    /* renamed from: f */
    public boolean f6770f = true;

    /* renamed from: g */
    public boolean f6771g = true;

    /* renamed from: h */
    public C3672a f6772h;

    /* renamed from: i */
    public final HttpTransport f6773i;

    /* renamed from: j */
    public String f6774j;

    /* renamed from: k */
    public C3674c f6775k;

    /* renamed from: l */
    public int f6776l = 20000;

    /* renamed from: m */
    public int f6777m = 20000;

    /* renamed from: n */
    public C3682j f6778n;

    /* renamed from: o */
    public C3742t f6779o;

    /* renamed from: p */
    public boolean f6780p = true;

    /* renamed from: q */
    public boolean f6781q = true;

    /* renamed from: r */
    public C3743u f6782r = C3743u.f6926a;

    /* renamed from: s */
    public final C7050v f6783s = C3685m.f6806c;

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        r3 = move-exception;
     */
    static {
        /*
            java.lang.String r0 = "unknown-version"
            java.lang.Class<b.l.b.a.b.f> r1 = p005b.p096l.p164b.p165a.p169b.C3677f.class
            java.lang.String r2 = "/google-http-client.properties"
            java.io.InputStream r1 = r1.getResourceAsStream(r2)     // Catch:{ IOException -> 0x002c }
            if (r1 == 0) goto L_0x0027
            java.util.Properties r2 = new java.util.Properties     // Catch:{ all -> 0x001b }
            r2.<init>()     // Catch:{ all -> 0x001b }
            r2.load(r1)     // Catch:{ all -> 0x001b }
            java.lang.String r3 = "google-http-client.version"
            java.lang.String r0 = r2.getProperty(r3)     // Catch:{ all -> 0x001b }
            goto L_0x0027
        L_0x001b:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001d }
        L_0x001d:
            r3 = move-exception
            r1.close()     // Catch:{ all -> 0x0022 }
            goto L_0x0026
        L_0x0022:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ IOException -> 0x002c }
        L_0x0026:
            throw r3     // Catch:{ IOException -> 0x002c }
        L_0x0027:
            if (r1 == 0) goto L_0x002c
            r1.close()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            f6763t = r0
            java.lang.String r1 = "Google-HTTP-Java-Client/"
            java.lang.String r2 = " (gzip)"
            java.lang.String r0 = p005b.p035e.p036a.p037a.C0843a.m452m(r1, r0, r2)
            f6764u = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p164b.p165a.p169b.C3677f.<clinit>():void");
    }

    public C3677f(HttpTransport httpTransport, String str) {
        this.f6773i = httpTransport;
        mo14992d((String) null);
    }

    /* renamed from: a */
    public static void m6927a(C7039o oVar, String str, String str2) {
        if (str2 != null) {
            C5266a.m9842M(str2, "stringValue");
            oVar.mo24433d(str, new C7019b(str2));
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r12v4, types: [b.l.b.a.d.r] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02ab  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p005b.p096l.p164b.p165a.p169b.C3679h mo14990b() {
        /*
            r25 = this;
            r1 = r25
            java.lang.String r2 = "options"
            int r0 = r1.f6768d
            r3 = 1
            r4 = 0
            if (r0 < 0) goto L_0x000c
            r0 = r3
            goto L_0x000d
        L_0x000c:
            r0 = r4
        L_0x000d:
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2849t(r0)
            int r0 = r1.f6768d
            java.lang.String r5 = r1.f6774j
            java.util.Objects.requireNonNull(r5)
            b.l.b.a.b.c r5 = r1.f6775k
            java.util.Objects.requireNonNull(r5)
            j.b.c.v r5 = r1.f6783s
            java.lang.String r6 = p005b.p096l.p164b.p165a.p169b.C3685m.f6805b
            java.util.Objects.requireNonNull(r5)
            j.a.b r5 = p376j.p377a.C7001b.m12593e()
            j.a.b$c<j.b.c.o> r7 = p376j.p378b.p383c.p384a0.C7018a.f14074a
            java.lang.String r8 = "context"
            p005b.p291q.p292a.C5266a.m9842M(r5, r8)
            java.util.Objects.requireNonNull(r7)
            j.a.c<j.a.b$c<?>, java.lang.Object> r5 = r5.f14056i
            j.a.c$d<K, V> r5 = r5.f14063a
            if (r5 != 0) goto L_0x0039
            r5 = 0
            goto L_0x0041
        L_0x0039:
            int r8 = r7.hashCode()
            java.lang.Object r5 = r5.mo24393a(r7, r8, r4)
        L_0x0041:
            if (r5 != 0) goto L_0x0044
            r5 = 0
        L_0x0044:
            j.b.c.o r5 = (p376j.p378b.p383c.C7039o) r5
            if (r5 != 0) goto L_0x004a
            j.b.c.i r5 = p376j.p378b.p383c.C7030i.f14092e
        L_0x004a:
            java.lang.String r5 = "name"
            p005b.p291q.p292a.C5266a.m9842M(r6, r5)
            boolean r5 = p005b.p096l.p164b.p165a.p169b.C3685m.f6808e
            j.b.c.i r5 = p376j.p378b.p383c.C7030i.f14092e
            r6 = 0
        L_0x0054:
            java.lang.String r7 = "retry #"
            java.lang.StringBuilder r7 = p005b.p035e.p036a.p037a.C0843a.m460u(r7)
            int r8 = r1.f6768d
            int r8 = r8 - r0
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.util.Objects.requireNonNull(r5)
            java.lang.String r8 = "description"
            p005b.p291q.p292a.C5266a.m9842M(r7, r8)
            java.util.Map<java.lang.String, j.b.c.a> r8 = p376j.p378b.p383c.C7039o.f14103c
            r5.mo24435f(r7, r8)
            if (r6 == 0) goto L_0x0076
            r6.mo14996d()
        L_0x0076:
            b.l.b.a.b.d r6 = r1.f6765a
            if (r6 == 0) goto L_0x007d
            r6.intercept(r1)
        L_0x007d:
            b.l.b.a.b.c r6 = r1.f6775k
            java.lang.String r6 = r6.build()
            java.lang.String r7 = r1.f6774j
            java.lang.String r8 = "http.method"
            m6927a(r5, r8, r7)
            b.l.b.a.b.c r7 = r1.f6775k
            java.lang.String r7 = r7.host
            java.lang.String r8 = "http.host"
            m6927a(r5, r8, r7)
            b.l.b.a.b.c r7 = r1.f6775k
            java.util.List<java.lang.String> r8 = r7.pathParts
            if (r8 != 0) goto L_0x009b
            r7 = 0
            goto L_0x00a7
        L_0x009b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r7.appendRawPathFromParts(r8)
            java.lang.String r7 = r8.toString()
        L_0x00a7:
            java.lang.String r8 = "http.path"
            m6927a(r5, r8, r7)
            java.lang.String r7 = "http.url"
            m6927a(r5, r7, r6)
            com.google.api.client.http.HttpTransport r7 = r1.f6773i
            java.lang.String r8 = r1.f6774j
            b.l.b.a.b.k r7 = r7.mo15022a(r8, r6)
            java.util.logging.Logger r8 = com.google.api.client.http.HttpTransport.f11410a
            boolean r9 = r1.f6770f
            if (r9 == 0) goto L_0x00ca
            java.util.logging.Level r9 = java.util.logging.Level.CONFIG
            boolean r9 = r8.isLoggable(r9)
            if (r9 == 0) goto L_0x00ca
            r16 = r3
            goto L_0x00cc
        L_0x00ca:
            r16 = r4
        L_0x00cc:
            if (r16 == 0) goto L_0x010b
            java.lang.String r9 = "-------------- REQUEST  --------------"
            java.lang.StringBuilder r9 = p005b.p035e.p036a.p037a.C0843a.m460u(r9)
            java.lang.String r10 = p005b.p096l.p164b.p165a.p173d.C3746w.f6927a
            r9.append(r10)
            java.lang.String r11 = r1.f6774j
            r9.append(r11)
            r11 = 32
            r9.append(r11)
            r9.append(r6)
            r9.append(r10)
            boolean r10 = r1.f6771g
            if (r10 == 0) goto L_0x0109
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "curl -v --compressed"
            r10.<init>(r11)
            java.lang.String r11 = r1.f6774j
            java.lang.String r12 = "GET"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x010d
            java.lang.String r11 = " -X "
            r10.append(r11)
            java.lang.String r11 = r1.f6774j
            r10.append(r11)
            goto L_0x010d
        L_0x0109:
            r10 = 0
            goto L_0x010d
        L_0x010b:
            r10 = 0
            r9 = 0
        L_0x010d:
            r15 = r9
            r14 = r10
            com.google.api.client.http.HttpHeaders r9 = r1.f6766b
            java.lang.String r13 = r9.mo22140k()
            java.lang.String r9 = "http.user_agent"
            if (r13 != 0) goto L_0x0124
            com.google.api.client.http.HttpHeaders r10 = r1.f6766b
            java.lang.String r11 = f6764u
            r10.mo22149u(r11)
            m6927a(r5, r9, r11)
            goto L_0x013b
        L_0x0124:
            java.lang.String r10 = " "
            java.lang.StringBuilder r10 = p005b.p035e.p036a.p037a.C0843a.m464y(r13, r10)
            java.lang.String r11 = f6764u
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.google.api.client.http.HttpHeaders r11 = r1.f6766b
            r11.mo22149u(r10)
            m6927a(r5, r9, r10)
        L_0x013b:
            com.google.api.client.http.HttpHeaders r9 = r1.f6766b
            java.lang.String r10 = "span should not be null."
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2833p(r3, r10)
            if (r9 == 0) goto L_0x0146
            r10 = r3
            goto L_0x0147
        L_0x0146:
            r10 = r4
        L_0x0147:
            java.lang.String r11 = "headers should not be null."
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2833p(r10, r11)
            j.b.c.z.a r10 = p005b.p096l.p164b.p165a.p169b.C3685m.f6809f
            if (r10 == 0) goto L_0x0165
            j.b.c.z.a$a r10 = p005b.p096l.p164b.p165a.p169b.C3685m.f6810g
            if (r10 == 0) goto L_0x0165
            j.b.c.i r10 = p376j.p378b.p383c.C7030i.f14092e
            boolean r10 = r5.equals(r10)
            if (r10 != 0) goto L_0x0165
            j.b.c.z.a r10 = p005b.p096l.p164b.p165a.p169b.C3685m.f6809f
            j.b.c.p r11 = r5.f14105a
            j.b.c.z.a$a r12 = p005b.p096l.p164b.p165a.p169b.C3685m.f6810g
            r10.mo24399a(r11, r9, r12)
        L_0x0165:
            com.google.api.client.http.HttpHeaders r12 = r1.f6766b
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            java.util.Set r9 = r12.entrySet()
            java.util.Iterator r17 = r9.iterator()
        L_0x0174:
            boolean r9 = r17.hasNext()
            if (r9 == 0) goto L_0x021d
            java.lang.Object r9 = r17.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r10 = r9.getKey()
            java.lang.String r10 = (java.lang.String) r10
            r18 = r13
            boolean r13 = r11.add(r10)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r4] = r10
            java.lang.String r4 = "multiple headers of the same name (headers are case insensitive): %s"
            p005b.p096l.p097a.p113c.p119b.p126p.C1960d.m2845s(r13, r4, r3)
            java.lang.Object r3 = r9.getValue()
            if (r3 == 0) goto L_0x0207
            b.l.b.a.d.e r4 = r12.classInfo
            b.l.b.a.d.j r4 = r4.mo15076a(r10)
            if (r4 == 0) goto L_0x01a6
            java.lang.String r4 = r4.f6907d
            goto L_0x01a7
        L_0x01a6:
            r4 = r10
        L_0x01a7:
            java.lang.Class r9 = r3.getClass()
            boolean r10 = r3 instanceof java.lang.Iterable
            if (r10 != 0) goto L_0x01cc
            boolean r9 = r9.isArray()
            if (r9 == 0) goto L_0x01b6
            goto L_0x01cc
        L_0x01b6:
            r19 = 0
            r9 = r8
            r10 = r15
            r20 = r11
            r11 = r14
            r21 = r12
            r12 = r7
            r22 = r18
            r13 = r4
            r4 = r14
            r14 = r3
            r3 = r15
            r15 = r19
            com.google.api.client.http.HttpHeaders.m10487a(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x020f
        L_0x01cc:
            r20 = r11
            r21 = r12
            r22 = r18
            r24 = r15
            r15 = r14
            r14 = r24
            java.lang.Iterable r3 = p005b.p096l.p164b.p165a.p173d.C3734l.m7048l(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x01df:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x0204
            java.lang.Object r18 = r3.next()
            r19 = 0
            r9 = r8
            r10 = r14
            r11 = r15
            r12 = r7
            r13 = r4
            r23 = r3
            r3 = r14
            r14 = r18
            r18 = r4
            r4 = r15
            r15 = r19
            com.google.api.client.http.HttpHeaders.m10487a(r9, r10, r11, r12, r13, r14, r15)
            r14 = r3
            r15 = r4
            r4 = r18
            r3 = r23
            goto L_0x01df
        L_0x0204:
            r3 = r14
            r4 = r15
            goto L_0x020f
        L_0x0207:
            r20 = r11
            r21 = r12
            r4 = r14
            r3 = r15
            r22 = r18
        L_0x020f:
            r9 = 1
            r10 = 0
            r15 = r3
            r14 = r4
            r3 = r9
            r4 = r10
            r11 = r20
            r12 = r21
            r13 = r22
            goto L_0x0174
        L_0x021d:
            r22 = r13
            r4 = r14
            r3 = r15
            com.google.api.client.http.HttpHeaders r9 = r1.f6766b
            r10 = r22
            r9.mo22149u(r10)
            b.l.b.a.b.a r9 = r1.f6772h
            java.lang.String r10 = "'"
            if (r9 == 0) goto L_0x02d8
            b.l.b.a.b.e r11 = r9.f6752a
            if (r11 != 0) goto L_0x0234
            r11 = 0
            goto L_0x0238
        L_0x0234:
            java.lang.String r11 = r11.mo14983a()
        L_0x0238:
            if (r16 == 0) goto L_0x0246
            b.l.b.a.d.r r12 = new b.l.b.a.d.r
            java.util.logging.Logger r13 = com.google.api.client.http.HttpTransport.f11410a
            java.util.logging.Level r14 = java.util.logging.Level.CONFIG
            int r15 = r1.f6769e
            r12.<init>(r9, r13, r14, r15)
            r9 = r12
        L_0x0246:
            b.l.b.a.b.a r12 = r1.f6772h
            long r13 = r12.f6753b
            r17 = -1
            int r13 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r13 != 0) goto L_0x0268
            b.l.b.a.d.c r13 = new b.l.b.a.d.c
            r13.<init>()
            r14 = r12
            b.l.b.a.b.n r14 = (p005b.p096l.p164b.p165a.p169b.C3687n) r14     // Catch:{ all -> 0x0263 }
            r14.mo15014a(r13)     // Catch:{ all -> 0x0263 }
            r13.close()
            long r13 = r13.f6863g
            r12.f6753b = r13
            goto L_0x0268
        L_0x0263:
            r0 = move-exception
            r13.close()
            throw r0
        L_0x0268:
            long r12 = r12.f6753b
            if (r16 == 0) goto L_0x02c5
            if (r11 == 0) goto L_0x02a3
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Content-Type: "
            r14.append(r15)
            r14.append(r11)
            java.lang.String r14 = r14.toString()
            r3.append(r14)
            java.lang.String r15 = p005b.p096l.p164b.p165a.p173d.C3746w.f6927a
            r3.append(r15)
            if (r4 == 0) goto L_0x02a3
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r17 = r2
            java.lang.String r2 = " -H '"
            r15.append(r2)
            r15.append(r14)
            r15.append(r10)
            java.lang.String r2 = r15.toString()
            r4.append(r2)
            goto L_0x02a5
        L_0x02a3:
            r17 = r2
        L_0x02a5:
            r14 = 0
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r2 < 0) goto L_0x02c7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r14 = "Content-Length: "
            r2.append(r14)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            r3.append(r2)
            java.lang.String r2 = p005b.p096l.p164b.p165a.p173d.C3746w.f6927a
            r3.append(r2)
            goto L_0x02c7
        L_0x02c5:
            r17 = r2
        L_0x02c7:
            if (r4 == 0) goto L_0x02ce
            java.lang.String r2 = " -d '@-'"
            r4.append(r2)
        L_0x02ce:
            r7.f6802c = r11
            r2 = 0
            r7.f6801b = r2
            r7.f6800a = r12
            r7.f6803d = r9
            goto L_0x02da
        L_0x02d8:
            r17 = r2
        L_0x02da:
            if (r16 == 0) goto L_0x0304
            java.lang.String r2 = r3.toString()
            r8.config(r2)
            if (r4 == 0) goto L_0x0304
            java.lang.String r2 = " -- '"
            r4.append(r2)
            java.lang.String r2 = "'\"'\"'"
            java.lang.String r2 = r6.replaceAll(r10, r2)
            r4.append(r2)
            r4.append(r10)
            if (r9 == 0) goto L_0x02fd
            java.lang.String r2 = " << $$$"
            r4.append(r2)
        L_0x02fd:
            java.lang.String r2 = r4.toString()
            r8.config(r2)
        L_0x0304:
            if (r0 <= 0) goto L_0x0308
            r2 = 1
            goto L_0x0309
        L_0x0308:
            r2 = 0
        L_0x0309:
            int r3 = r1.f6776l
            int r4 = r1.f6777m
            r7.mo15001c(r3, r4)
            r4 = 0
            r7.mo15002d(r4)
            j.b.c.v r3 = r1.f6783s
            java.util.Objects.requireNonNull(r3)
            java.lang.String r3 = "span"
            p005b.p291q.p292a.C5266a.m9842M(r5, r3)
            j.b.c.k r3 = new j.b.c.k
            r6 = 0
            r3.<init>(r5, r4, r6)
            long r8 = r7.f6800a
            j.b.c.m$b r6 = p376j.p378b.p383c.C7034m.C7036b.SENT
            p005b.p096l.p164b.p165a.p169b.C3685m.m6953b(r5, r8, r6)
            b.l.b.a.b.l r6 = r7.mo15000b()     // Catch:{ IOException -> 0x03b0 }
            if (r6 == 0) goto L_0x033a
            long r7 = r6.mo15006d()     // Catch:{ IOException -> 0x03b0 }
            j.b.c.m$b r9 = p376j.p378b.p383c.C7034m.C7036b.RECEIVED     // Catch:{ IOException -> 0x03b0 }
            p005b.p096l.p164b.p165a.p169b.C3685m.m6953b(r5, r7, r9)     // Catch:{ IOException -> 0x03b0 }
        L_0x033a:
            b.l.b.a.b.h r7 = new b.l.b.a.b.h     // Catch:{ all -> 0x039f }
            r7.<init>(r1, r6)     // Catch:{ all -> 0x039f }
            r3.close()
            boolean r3 = r7.mo14997e()     // Catch:{ all -> 0x039a }
            if (r3 != 0) goto L_0x0368
            b.l.b.a.b.j r3 = r1.f6778n     // Catch:{ all -> 0x039a }
            if (r3 == 0) goto L_0x0351
            boolean r3 = r3.handleResponse(r1, r7, r2)     // Catch:{ all -> 0x039a }
            goto L_0x0352
        L_0x0351:
            r3 = r4
        L_0x0352:
            if (r3 != 0) goto L_0x0361
            int r6 = r7.f6789f     // Catch:{ all -> 0x039a }
            b.l.b.a.b.f r8 = r7.f6791h     // Catch:{ all -> 0x039a }
            com.google.api.client.http.HttpHeaders r8 = r8.f6767c     // Catch:{ all -> 0x039a }
            boolean r6 = r1.mo14991c(r6, r8)     // Catch:{ all -> 0x039a }
            if (r6 == 0) goto L_0x0361
            r3 = 1
        L_0x0361:
            r2 = r2 & r3
            if (r2 == 0) goto L_0x036a
            r7.mo14996d()     // Catch:{ all -> 0x039a }
            goto L_0x036a
        L_0x0368:
            r2 = r2 & 0
        L_0x036a:
            int r0 = r0 + -1
            if (r2 != 0) goto L_0x0394
            int r0 = r7.f6789f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            j.b.c.l r0 = p005b.p096l.p164b.p165a.p169b.C3685m.m6952a(r0)
            r2 = r17
            p005b.p291q.p292a.C5266a.m9842M(r0, r2)
            boolean r0 = r1.f6781q
            if (r0 == 0) goto L_0x0393
            boolean r0 = r7.mo14997e()
            if (r0 == 0) goto L_0x0388
            goto L_0x0393
        L_0x0388:
            b.l.b.a.b.i r0 = new b.l.b.a.b.i     // Catch:{ all -> 0x038e }
            r0.<init>((p005b.p096l.p164b.p165a.p169b.C3679h) r7)     // Catch:{ all -> 0x038e }
            throw r0     // Catch:{ all -> 0x038e }
        L_0x038e:
            r0 = move-exception
            r7.mo14993a()
            throw r0
        L_0x0393:
            return r7
        L_0x0394:
            r2 = r17
            r3 = 1
            r6 = r7
            goto L_0x0054
        L_0x039a:
            r0 = move-exception
            r7.mo14993a()
            throw r0
        L_0x039f:
            r0 = move-exception
            r2 = r17
            java.io.InputStream r4 = r6.mo15004b()     // Catch:{ IOException -> 0x03ac }
            if (r4 == 0) goto L_0x03ab
            r4.close()     // Catch:{ IOException -> 0x03ac }
        L_0x03ab:
            throw r0     // Catch:{ IOException -> 0x03ac }
        L_0x03ac:
            r0 = move-exception
            goto L_0x03b3
        L_0x03ae:
            r0 = move-exception
            goto L_0x03bc
        L_0x03b0:
            r0 = move-exception
            r2 = r17
        L_0x03b3:
            r4 = 0
            j.b.c.l r4 = p005b.p096l.p164b.p165a.p169b.C3685m.m6952a(r4)     // Catch:{ all -> 0x03ae }
            p005b.p291q.p292a.C5266a.m9842M(r4, r2)     // Catch:{ all -> 0x03ae }
            throw r0     // Catch:{ all -> 0x03ae }
        L_0x03bc:
            r3.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p164b.p165a.p169b.C3677f.mo14990b():b.l.b.a.b.h");
    }

    /* renamed from: c */
    public boolean mo14991c(int i, HttpHeaders httpHeaders) {
        boolean z;
        String j = httpHeaders.mo22139j();
        if (this.f6780p) {
            if (!(i == 307 || i == 308)) {
                switch (i) {
                    case 301:
                    case 302:
                    case 303:
                        break;
                    default:
                        z = false;
                        break;
                }
            }
            z = true;
            if (z && j != null) {
                C3674c cVar = this.f6775k;
                Objects.requireNonNull(cVar);
                try {
                    this.f6775k = new C3674c(new URL(new URL(cVar.build()), j), false);
                    if (i == 303) {
                        mo14992d("GET");
                        this.f6772h = null;
                    }
                    this.f6766b.mo22143o((String) null);
                    this.f6766b.mo22144p((String) null);
                    this.f6766b.mo22146r((String) null);
                    this.f6766b.mo22145q((String) null);
                    this.f6766b.mo22148t((String) null);
                    this.f6766b.mo22147s((String) null);
                    return true;
                } catch (MalformedURLException e) {
                    throw new IllegalArgumentException(e);
                } catch (MalformedURLException e2) {
                    throw new IllegalArgumentException(e2);
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public C3677f mo14992d(String str) {
        C1960d.m2849t(str == null || C3676e.f6756f.matcher(str).matches());
        this.f6774j = str;
        return this;
    }
}
