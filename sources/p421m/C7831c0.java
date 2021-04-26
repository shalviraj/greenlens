package p421m;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p298d.p344x.p346c.C6888i;
import p421m.C8014u;
import p421m.p422m0.C7865a;
import p421m.p422m0.C7867c;
import p421m.p422m0.p426g.C7887e;
import p421m.p422m0.p426g.C7897k;
import p421m.p422m0.p433m.C7999c;
import p421m.p422m0.p433m.C8000d;

/* renamed from: m.c0 */
public class C7831c0 implements Cloneable {

    /* renamed from: F */
    public static final List<C7835d0> f15452F = C7867c.m14291l(C7835d0.HTTP_2, C7835d0.HTTP_1_1);

    /* renamed from: G */
    public static final List<C8002n> f15453G = C7867c.m14291l(C8002n.f16046g, C8002n.f16047h);

    /* renamed from: H */
    public static final C7833b f15454H = new C7833b((DefaultConstructorMarker) null);

    /* renamed from: A */
    public final C7999c f15455A;

    /* renamed from: B */
    public final int f15456B;

    /* renamed from: C */
    public final int f15457C;

    /* renamed from: D */
    public final int f15458D;

    /* renamed from: E */
    public final C7897k f15459E;

    /* renamed from: g */
    public final C8011r f15460g;

    /* renamed from: h */
    public final C7864m f15461h;

    /* renamed from: i */
    public final List<C7826a0> f15462i;

    /* renamed from: j */
    public final List<C7826a0> f15463j;

    /* renamed from: k */
    public final C8014u.C8016b f15464k;

    /* renamed from: l */
    public final boolean f15465l;

    /* renamed from: m */
    public final C7830c f15466m;

    /* renamed from: n */
    public final boolean f15467n;

    /* renamed from: o */
    public final boolean f15468o;

    /* renamed from: p */
    public final C8010q f15469p;

    /* renamed from: q */
    public final C8013t f15470q;

    /* renamed from: r */
    public final ProxySelector f15471r;

    /* renamed from: s */
    public final C7830c f15472s;

    /* renamed from: t */
    public final SocketFactory f15473t;

    /* renamed from: u */
    public final SSLSocketFactory f15474u;

    /* renamed from: v */
    public final X509TrustManager f15475v;

    /* renamed from: w */
    public final List<C8002n> f15476w;

    /* renamed from: x */
    public final List<C7835d0> f15477x;

    /* renamed from: y */
    public final HostnameVerifier f15478y;

    /* renamed from: z */
    public final C7847h f15479z;

    /* renamed from: m.c0$a */
    public static final class C7832a {

        /* renamed from: a */
        public C8011r f15480a = new C8011r();

        /* renamed from: b */
        public C7864m f15481b = new C7864m();

        /* renamed from: c */
        public final List<C7826a0> f15482c = new ArrayList();

        /* renamed from: d */
        public final List<C7826a0> f15483d = new ArrayList();

        /* renamed from: e */
        public C8014u.C8016b f15484e;

        /* renamed from: f */
        public boolean f15485f;

        /* renamed from: g */
        public C7830c f15486g;

        /* renamed from: h */
        public boolean f15487h;

        /* renamed from: i */
        public boolean f15488i;

        /* renamed from: j */
        public C8010q f15489j;

        /* renamed from: k */
        public C8013t f15490k;

        /* renamed from: l */
        public C7830c f15491l;

        /* renamed from: m */
        public SocketFactory f15492m;

        /* renamed from: n */
        public SSLSocketFactory f15493n;

        /* renamed from: o */
        public X509TrustManager f15494o;

        /* renamed from: p */
        public List<C8002n> f15495p;

        /* renamed from: q */
        public List<? extends C7835d0> f15496q;

        /* renamed from: r */
        public HostnameVerifier f15497r;

        /* renamed from: s */
        public C7847h f15498s;

        /* renamed from: t */
        public C7999c f15499t;

        /* renamed from: u */
        public int f15500u;

        /* renamed from: v */
        public int f15501v;

        /* renamed from: w */
        public int f15502w;

        /* renamed from: x */
        public long f15503x;

        public C7832a() {
            C8014u uVar = C8014u.f16084a;
            C6888i.m12438e(uVar, "$this$asFactory");
            this.f15484e = new C7865a(uVar);
            this.f15485f = true;
            C7830c cVar = C7830c.f15451a;
            this.f15486g = cVar;
            this.f15487h = true;
            this.f15488i = true;
            this.f15489j = C8010q.f16078a;
            this.f15490k = C8013t.f16083a;
            this.f15491l = cVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            C6888i.m12437d(socketFactory, "SocketFactory.getDefault()");
            this.f15492m = socketFactory;
            C7833b bVar = C7831c0.f15454H;
            this.f15495p = C7831c0.f15453G;
            this.f15496q = C7831c0.f15452F;
            this.f15497r = C8000d.f16043a;
            this.f15498s = C7847h.f15545c;
            this.f15500u = 10000;
            this.f15501v = 10000;
            this.f15502w = 10000;
            this.f15503x = 1024;
        }
    }

    /* renamed from: m.c0$b */
    public static final class C7833b {
        public C7833b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public C7831c0() {
        this(new C7832a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7831c0(p421m.C7831c0.C7832a r6) {
        /*
            r5 = this;
            java.lang.String r0 = "builder"
            p298d.p344x.p346c.C6888i.m12438e(r6, r0)
            r5.<init>()
            m.r r0 = r6.f15480a
            r5.f15460g = r0
            m.m r0 = r6.f15481b
            r5.f15461h = r0
            java.util.List<m.a0> r0 = r6.f15482c
            java.util.List r0 = p421m.p422m0.C7867c.m14304y(r0)
            r5.f15462i = r0
            java.util.List<m.a0> r0 = r6.f15483d
            java.util.List r0 = p421m.p422m0.C7867c.m14304y(r0)
            r5.f15463j = r0
            m.u$b r0 = r6.f15484e
            r5.f15464k = r0
            boolean r0 = r6.f15485f
            r5.f15465l = r0
            m.c r0 = r6.f15486g
            r5.f15466m = r0
            boolean r0 = r6.f15487h
            r5.f15467n = r0
            boolean r0 = r6.f15488i
            r5.f15468o = r0
            m.q r0 = r6.f15489j
            r5.f15469p = r0
            m.t r0 = r6.f15490k
            r5.f15470q = r0
            java.net.ProxySelector r0 = java.net.ProxySelector.getDefault()
            if (r0 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            m.m0.l.a r0 = p421m.p422m0.p432l.C7996a.f16040a
        L_0x0045:
            r5.f15471r = r0
            m.c r0 = r6.f15491l
            r5.f15472s = r0
            javax.net.SocketFactory r0 = r6.f15492m
            r5.f15473t = r0
            java.util.List<m.n> r0 = r6.f15495p
            r5.f15476w = r0
            java.util.List<? extends m.d0> r1 = r6.f15496q
            r5.f15477x = r1
            javax.net.ssl.HostnameVerifier r1 = r6.f15497r
            r5.f15478y = r1
            r1 = 0
            int r2 = r6.f15500u
            r5.f15456B = r2
            int r2 = r6.f15501v
            r5.f15457C = r2
            int r2 = r6.f15502w
            r5.f15458D = r2
            m.m0.g.k r2 = new m.m0.g.k
            r2.<init>()
            r5.f15459E = r2
            boolean r2 = r0 instanceof java.util.Collection
            r3 = 1
            if (r2 == 0) goto L_0x007b
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x007b
            goto L_0x0091
        L_0x007b:
            java.util.Iterator r0 = r0.iterator()
        L_0x007f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0091
            java.lang.Object r2 = r0.next()
            m.n r2 = (p421m.C8002n) r2
            boolean r2 = r2.f16048a
            if (r2 == 0) goto L_0x007f
            r0 = r1
            goto L_0x0092
        L_0x0091:
            r0 = r3
        L_0x0092:
            r2 = 0
            if (r0 == 0) goto L_0x009e
            r5.f15474u = r2
            r5.f15455A = r2
            r5.f15475v = r2
            m.h r6 = p421m.C7847h.f15545c
            goto L_0x00e1
        L_0x009e:
            javax.net.ssl.SSLSocketFactory r0 = r6.f15493n
            if (r0 == 0) goto L_0x00b3
            r5.f15474u = r0
            m.m0.m.c r0 = r6.f15499t
            p298d.p344x.p346c.C6888i.m12436c(r0)
            r5.f15455A = r0
            javax.net.ssl.X509TrustManager r4 = r6.f15494o
            p298d.p344x.p346c.C6888i.m12436c(r4)
            r5.f15475v = r4
            goto L_0x00d8
        L_0x00b3:
            m.m0.k.h$a r0 = p421m.p422m0.p430k.C7976h.f16015c
            m.m0.k.h r0 = p421m.p422m0.p430k.C7976h.f16013a
            javax.net.ssl.X509TrustManager r0 = r0.mo25766n()
            r5.f15475v = r0
            m.m0.k.h r4 = p421m.p422m0.p430k.C7976h.f16013a
            p298d.p344x.p346c.C6888i.m12436c(r0)
            javax.net.ssl.SSLSocketFactory r4 = r4.mo25767m(r0)
            r5.f15474u = r4
            p298d.p344x.p346c.C6888i.m12436c(r0)
            java.lang.String r4 = "trustManager"
            p298d.p344x.p346c.C6888i.m12438e(r0, r4)
            m.m0.k.h r4 = p421m.p422m0.p430k.C7976h.f16013a
            m.m0.m.c r0 = r4.mo25752b(r0)
            r5.f15455A = r0
        L_0x00d8:
            m.h r6 = r6.f15498s
            p298d.p344x.p346c.C6888i.m12436c(r0)
            m.h r6 = r6.mo25547b(r0)
        L_0x00e1:
            r5.f15479z = r6
            java.util.List<m.a0> r6 = r5.f15462i
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"
            java.util.Objects.requireNonNull(r6, r0)
            boolean r6 = r6.contains(r2)
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x01bb
            java.util.List<m.a0> r6 = r5.f15463j
            java.util.Objects.requireNonNull(r6, r0)
            boolean r6 = r6.contains(r2)
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x01a2
            java.util.List<m.n> r6 = r5.f15476w
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x010a
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x010a
            goto L_0x0120
        L_0x010a:
            java.util.Iterator r6 = r6.iterator()
        L_0x010e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0120
            java.lang.Object r0 = r6.next()
            m.n r0 = (p421m.C8002n) r0
            boolean r0 = r0.f16048a
            if (r0 == 0) goto L_0x010e
            r6 = r1
            goto L_0x0121
        L_0x0120:
            r6 = r3
        L_0x0121:
            if (r6 == 0) goto L_0x0171
            javax.net.ssl.SSLSocketFactory r6 = r5.f15474u
            if (r6 != 0) goto L_0x0129
            r6 = r3
            goto L_0x012a
        L_0x0129:
            r6 = r1
        L_0x012a:
            java.lang.String r0 = "Check failed."
            if (r6 == 0) goto L_0x0167
            m.m0.m.c r6 = r5.f15455A
            if (r6 != 0) goto L_0x0134
            r6 = r3
            goto L_0x0135
        L_0x0134:
            r6 = r1
        L_0x0135:
            if (r6 == 0) goto L_0x015d
            javax.net.ssl.X509TrustManager r6 = r5.f15475v
            if (r6 != 0) goto L_0x013c
            r1 = r3
        L_0x013c:
            if (r1 == 0) goto L_0x0153
            m.h r6 = r5.f15479z
            m.h r1 = p421m.C7847h.f15545c
            boolean r6 = p298d.p344x.p346c.C6888i.m12434a(r6, r1)
            if (r6 == 0) goto L_0x0149
            goto L_0x017d
        L_0x0149:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0153:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x015d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0167:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0171:
            javax.net.ssl.SSLSocketFactory r6 = r5.f15474u
            if (r6 == 0) goto L_0x0196
            m.m0.m.c r6 = r5.f15455A
            if (r6 == 0) goto L_0x018a
            javax.net.ssl.X509TrustManager r6 = r5.f15475v
            if (r6 == 0) goto L_0x017e
        L_0x017d:
            return
        L_0x017e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "x509TrustManager == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x018a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "certificateChainCleaner == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0196:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "sslSocketFactory == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x01a2:
            java.lang.String r6 = "Null network interceptor: "
            java.lang.StringBuilder r6 = p005b.p035e.p036a.p037a.C0843a.m460u(r6)
            java.util.List<m.a0> r0 = r5.f15463j
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        L_0x01bb:
            java.lang.String r6 = "Null interceptor: "
            java.lang.StringBuilder r6 = p005b.p035e.p036a.p037a.C0843a.m460u(r6)
            java.util.List<m.a0> r0 = r5.f15462i
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.C7831c0.<init>(m.c0$a):void");
    }

    /* renamed from: a */
    public C7841f mo25525a(C7839e0 e0Var) {
        C6888i.m12438e(e0Var, "request");
        return new C7887e(this, e0Var, false);
    }

    public Object clone() {
        return super.clone();
    }
}
