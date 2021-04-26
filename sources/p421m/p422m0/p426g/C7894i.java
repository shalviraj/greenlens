package p421m.p422m0.p426g;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;
import p298d.p415c0.C7694h;
import p421m.C7825a;
import p421m.C7831c0;
import p421m.C7835d0;
import p421m.C7839e0;
import p421m.C7841f;
import p421m.C7844g0;
import p421m.C7850h0;
import p421m.C7860k0;
import p421m.C7861l;
import p421m.C8014u;
import p421m.C8020x;
import p421m.C8022y;
import p421m.C8025z;
import p421m.p422m0.C7867c;
import p421m.p422m0.p425f.C7874b;
import p421m.p422m0.p425f.C7875c;
import p421m.p422m0.p425f.C7876d;
import p421m.p422m0.p427h.C7906d;
import p421m.p422m0.p427h.C7909g;
import p421m.p422m0.p428i.C7914b;
import p421m.p422m0.p429j.C7922b;
import p421m.p422m0.p429j.C7928e;
import p421m.p422m0.p429j.C7929f;
import p421m.p422m0.p429j.C7946m;
import p421m.p422m0.p429j.C7950o;
import p421m.p422m0.p429j.C7954p;
import p421m.p422m0.p429j.C7959t;
import p421m.p422m0.p430k.C7976h;
import p435n.C8030a0;
import p435n.C8042f;
import p435n.C8043g;

/* renamed from: m.m0.g.i */
public final class C7894i extends C7929f.C7932c implements C7861l {

    /* renamed from: b */
    public Socket f15714b;

    /* renamed from: c */
    public Socket f15715c;

    /* renamed from: d */
    public C8020x f15716d;

    /* renamed from: e */
    public C7835d0 f15717e;

    /* renamed from: f */
    public C7929f f15718f;

    /* renamed from: g */
    public C8043g f15719g;

    /* renamed from: h */
    public C8042f f15720h;

    /* renamed from: i */
    public boolean f15721i;

    /* renamed from: j */
    public boolean f15722j;

    /* renamed from: k */
    public int f15723k;

    /* renamed from: l */
    public int f15724l;

    /* renamed from: m */
    public int f15725m;

    /* renamed from: n */
    public int f15726n = 1;

    /* renamed from: o */
    public final List<Reference<C7887e>> f15727o = new ArrayList();

    /* renamed from: p */
    public long f15728p = RecyclerView.FOREVER_NS;

    /* renamed from: q */
    public final C7860k0 f15729q;

    public C7894i(C7895j jVar, C7860k0 k0Var) {
        C6888i.m12438e(jVar, "connectionPool");
        C6888i.m12438e(k0Var, "route");
        this.f15729q = k0Var;
    }

    /* renamed from: a */
    public synchronized void mo25631a(C7929f fVar, C7959t tVar) {
        C6888i.m12438e(fVar, "connection");
        C6888i.m12438e(tVar, "settings");
        this.f15726n = (tVar.f15981a & 16) != 0 ? tVar.f15982b[4] : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    /* renamed from: b */
    public void mo25632b(C7950o oVar) {
        C6888i.m12438e(oVar, "stream");
        oVar.mo25720c(C7922b.REFUSED_STREAM, (IOException) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x015b A[EDGE_INSN: B:78:0x015b->B:70:0x015b ?: BREAK  , SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25633c(int r17, int r18, int r19, int r20, boolean r21, p421m.C7841f r22, p421m.C8014u r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            java.lang.String r10 = "proxy"
            java.lang.String r11 = "inetSocketAddress"
            java.lang.String r12 = "call"
            p298d.p344x.p346c.C6888i.m12438e(r8, r12)
            java.lang.String r0 = "eventListener"
            p298d.p344x.p346c.C6888i.m12438e(r9, r0)
            m.d0 r0 = r7.f15717e
            if (r0 != 0) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 == 0) goto L_0x0169
            m.k0 r0 = r7.f15729q
            m.a r0 = r0.f15604a
            java.util.List<m.n> r0 = r0.f15437c
            m.m0.g.b r13 = new m.m0.g.b
            r13.<init>(r0)
            m.k0 r1 = r7.f15729q
            m.a r1 = r1.f15604a
            javax.net.ssl.SSLSocketFactory r2 = r1.f15440f
            if (r2 != 0) goto L_0x006b
            m.n r1 = p421m.C8002n.f16047h
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x005e
            m.k0 r0 = r7.f15729q
            m.a r0 = r0.f15604a
            m.z r0 = r0.f15435a
            java.lang.String r0 = r0.f16106e
            m.m0.k.h$a r1 = p421m.p422m0.p430k.C7976h.f16015c
            m.m0.k.h r1 = p421m.p422m0.p430k.C7976h.f16013a
            boolean r1 = r1.mo25755h(r0)
            if (r1 == 0) goto L_0x004b
            goto L_0x0075
        L_0x004b:
            m.m0.g.l r1 = new m.m0.g.l
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.String r3 = "CLEARTEXT communication to "
            java.lang.String r4 = " not permitted by network security policy"
            java.lang.String r0 = p005b.p035e.p036a.p037a.C0843a.m452m(r3, r0, r4)
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x005e:
            m.m0.g.l r0 = new m.m0.g.l
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x006b:
            java.util.List<m.d0> r0 = r1.f15436b
            m.d0 r1 = p421m.C7835d0.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x015c
        L_0x0075:
            r14 = 0
            r15 = r14
        L_0x0077:
            m.k0 r0 = r7.f15729q     // Catch:{ IOException -> 0x00df }
            boolean r0 = r0.mo25577a()     // Catch:{ IOException -> 0x00df }
            if (r0 == 0) goto L_0x009d
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.mo25636f(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00df }
            java.net.Socket r0 = r7.f15714b     // Catch:{ IOException -> 0x00df }
            if (r0 != 0) goto L_0x0093
            goto L_0x00b8
        L_0x0093:
            r1 = r17
            r2 = r18
            goto L_0x00a4
        L_0x0098:
            r1 = r17
            r2 = r18
            goto L_0x00dc
        L_0x009d:
            r1 = r17
            r2 = r18
            r7.mo25635e(r1, r2, r8, r9)     // Catch:{ IOException -> 0x00db }
        L_0x00a4:
            r3 = r20
            r7.mo25637g(r13, r3, r8, r9)     // Catch:{ IOException -> 0x00d9 }
            m.k0 r0 = r7.f15729q     // Catch:{ IOException -> 0x00d9 }
            java.net.InetSocketAddress r4 = r0.f15606c     // Catch:{ IOException -> 0x00d9 }
            java.net.Proxy r0 = r0.f15605b     // Catch:{ IOException -> 0x00d9 }
            p298d.p344x.p346c.C6888i.m12438e(r8, r12)     // Catch:{ IOException -> 0x00d9 }
            p298d.p344x.p346c.C6888i.m12438e(r4, r11)     // Catch:{ IOException -> 0x00d9 }
            p298d.p344x.p346c.C6888i.m12438e(r0, r10)     // Catch:{ IOException -> 0x00d9 }
        L_0x00b8:
            m.k0 r0 = r7.f15729q
            boolean r0 = r0.mo25577a()
            if (r0 == 0) goto L_0x00d2
            java.net.Socket r0 = r7.f15714b
            if (r0 == 0) goto L_0x00c5
            goto L_0x00d2
        L_0x00c5:
            m.m0.g.l r0 = new m.m0.g.l
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "Too many tunnel connections attempted: 21"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x00d2:
            long r0 = java.lang.System.nanoTime()
            r7.f15728p = r0
            return
        L_0x00d9:
            r0 = move-exception
            goto L_0x00e1
        L_0x00db:
            r0 = move-exception
        L_0x00dc:
            r3 = r20
            goto L_0x00e1
        L_0x00df:
            r0 = move-exception
            goto L_0x0098
        L_0x00e1:
            java.net.Socket r4 = r7.f15715c
            if (r4 == 0) goto L_0x00e8
            p421m.p422m0.C7867c.m14284e(r4)
        L_0x00e8:
            java.net.Socket r4 = r7.f15714b
            if (r4 == 0) goto L_0x00ef
            p421m.p422m0.C7867c.m14284e(r4)
        L_0x00ef:
            r7.f15715c = r14
            r7.f15714b = r14
            r7.f15719g = r14
            r7.f15720h = r14
            r7.f15716d = r14
            r7.f15717e = r14
            r7.f15718f = r14
            r4 = 1
            r7.f15726n = r4
            m.k0 r4 = r7.f15729q
            java.net.InetSocketAddress r5 = r4.f15606c
            java.net.Proxy r4 = r4.f15605b
            p298d.p344x.p346c.C6888i.m12438e(r8, r12)
            p298d.p344x.p346c.C6888i.m12438e(r5, r11)
            p298d.p344x.p346c.C6888i.m12438e(r4, r10)
            java.lang.String r4 = "ioe"
            p298d.p344x.p346c.C6888i.m12438e(r0, r4)
            java.lang.String r4 = "e"
            if (r15 != 0) goto L_0x011e
            m.m0.g.l r15 = new m.m0.g.l
            r15.<init>(r0)
            goto L_0x0128
        L_0x011e:
            p298d.p344x.p346c.C6888i.m12438e(r0, r4)
            java.io.IOException r5 = r15.f15738h
            p005b.p291q.p292a.C5266a.m10007p(r5, r0)
            r15.f15737g = r0
        L_0x0128:
            if (r21 == 0) goto L_0x015b
            p298d.p344x.p346c.C6888i.m12438e(r0, r4)
            r4 = 1
            r13.f15657c = r4
            boolean r5 = r13.f15656b
            if (r5 != 0) goto L_0x0135
            goto L_0x0156
        L_0x0135:
            boolean r5 = r0 instanceof java.net.ProtocolException
            if (r5 == 0) goto L_0x013a
            goto L_0x0156
        L_0x013a:
            boolean r5 = r0 instanceof java.io.InterruptedIOException
            if (r5 == 0) goto L_0x013f
            goto L_0x0156
        L_0x013f:
            boolean r5 = r0 instanceof javax.net.ssl.SSLHandshakeException
            if (r5 == 0) goto L_0x014c
            java.lang.Throwable r5 = r0.getCause()
            boolean r5 = r5 instanceof java.security.cert.CertificateException
            if (r5 == 0) goto L_0x014c
            goto L_0x0156
        L_0x014c:
            boolean r5 = r0 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r5 == 0) goto L_0x0151
            goto L_0x0156
        L_0x0151:
            boolean r0 = r0 instanceof javax.net.ssl.SSLException
            if (r0 == 0) goto L_0x0156
            goto L_0x0157
        L_0x0156:
            r4 = 0
        L_0x0157:
            if (r4 == 0) goto L_0x015b
            goto L_0x0077
        L_0x015b:
            throw r15
        L_0x015c:
            m.m0.g.l r0 = new m.m0.g.l
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0169:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p426g.C7894i.mo25633c(int, int, int, int, boolean, m.f, m.u):void");
    }

    /* renamed from: d */
    public final void mo25634d(C7831c0 c0Var, C7860k0 k0Var, IOException iOException) {
        C6888i.m12438e(c0Var, "client");
        C6888i.m12438e(k0Var, "failedRoute");
        C6888i.m12438e(iOException, "failure");
        if (k0Var.f15605b.type() != Proxy.Type.DIRECT) {
            C7825a aVar = k0Var.f15604a;
            aVar.f15445k.connectFailed(aVar.f15435a.mo25858g(), k0Var.f15605b.address(), iOException);
        }
        C7897k kVar = c0Var.f15459E;
        synchronized (kVar) {
            C6888i.m12438e(k0Var, "failedRoute");
            kVar.f15736a.add(k0Var);
        }
    }

    /* renamed from: e */
    public final void mo25635e(int i, int i2, C7841f fVar, C8014u uVar) {
        Socket socket;
        int i3;
        C7860k0 k0Var = this.f15729q;
        Proxy proxy = k0Var.f15605b;
        C7825a aVar = k0Var.f15604a;
        Proxy.Type type = proxy.type();
        if (type != null && ((i3 = C7891f.f15709a[type.ordinal()]) == 1 || i3 == 2)) {
            socket = aVar.f15439e.createSocket();
            C6888i.m12436c(socket);
        } else {
            socket = new Socket(proxy);
        }
        this.f15714b = socket;
        InetSocketAddress inetSocketAddress = this.f15729q.f15606c;
        Objects.requireNonNull(uVar);
        C6888i.m12438e(fVar, NotificationCompat.CATEGORY_CALL);
        C6888i.m12438e(inetSocketAddress, "inetSocketAddress");
        C6888i.m12438e(proxy, "proxy");
        socket.setSoTimeout(i2);
        try {
            C7976h.C7977a aVar2 = C7976h.f16015c;
            C7976h.f16013a.mo25758e(socket, this.f15729q.f15606c, i);
            try {
                this.f15719g = C5266a.m9812H(C5266a.m9946e4(socket));
                this.f15720h = C5266a.m9806G(C5266a.m9916Z3(socket));
            } catch (NullPointerException e) {
                if (C6888i.m12434a(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            StringBuilder u = C0843a.m460u("Failed to connect to ");
            u.append(this.f15729q.f15606c);
            ConnectException connectException = new ConnectException(u.toString());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* renamed from: f */
    public final void mo25636f(int i, int i2, int i3, C7841f fVar, C8014u uVar) {
        C7839e0 e0Var;
        int i4 = i2;
        C7841f fVar2 = fVar;
        C7839e0.C7840a aVar = new C7839e0.C7840a();
        aVar.mo25541g(this.f15729q.f15604a.f15435a);
        C7831c0 c0Var = null;
        aVar.mo25537c("CONNECT", (C7844g0) null);
        boolean z = true;
        aVar.mo25536b("Host", C7867c.m14303x(this.f15729q.f15604a.f15435a, true));
        aVar.mo25536b("Proxy-Connection", "Keep-Alive");
        aVar.mo25536b("User-Agent", "okhttp/4.9.1");
        C7839e0 a = aVar.mo25535a();
        C7850h0.C7851a aVar2 = new C7850h0.C7851a();
        aVar2.mo25564g(a);
        aVar2.mo25563f(C7835d0.HTTP_1_1);
        aVar2.f15564c = 407;
        aVar2.mo25562e("Preemptive Authenticate");
        aVar2.f15568g = C7867c.f15621c;
        aVar2.f15572k = -1;
        aVar2.f15573l = -1;
        C6888i.m12438e("Proxy-Authenticate", "name");
        C6888i.m12438e("OkHttp-Preemptive", "value");
        C8022y.C8023a aVar3 = aVar2.f15567f;
        Objects.requireNonNull(aVar3);
        C6888i.m12438e("Proxy-Authenticate", "name");
        C6888i.m12438e("OkHttp-Preemptive", "value");
        C8022y.C8024b bVar = C8022y.f16097h;
        bVar.mo25848a("Proxy-Authenticate");
        bVar.mo25849b("OkHttp-Preemptive", "Proxy-Authenticate");
        aVar3.mo25847c("Proxy-Authenticate");
        aVar3.mo25845a("Proxy-Authenticate", "OkHttp-Preemptive");
        C7850h0 a2 = aVar2.mo25558a();
        C7860k0 k0Var = this.f15729q;
        C7839e0 a3 = k0Var.f15604a.f15443i.mo25520a(k0Var, a2);
        if (a3 != null) {
            a = a3;
        }
        C8025z zVar = e0Var.f15528b;
        int i5 = 0;
        while (i5 < 21) {
            mo25635e(i, i4, fVar2, uVar);
            String str = "CONNECT " + C7867c.m14303x(zVar, z) + " HTTP/1.1";
            while (true) {
                C8043g gVar = this.f15719g;
                C6888i.m12436c(gVar);
                C8042f fVar3 = this.f15720h;
                C6888i.m12436c(fVar3);
                C7914b bVar2 = new C7914b(c0Var, this, gVar, fVar3);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                gVar.mo17035f().mo25879g((long) i4, timeUnit);
                fVar3.mo17028f().mo25879g((long) i3, timeUnit);
                bVar2.mo25671k(e0Var.f15530d, str);
                bVar2.f15783g.flush();
                C7850h0.C7851a g = bVar2.mo25660g(false);
                C6888i.m12436c(g);
                g.mo25564g(e0Var);
                C7850h0 a4 = g.mo25558a();
                C6888i.m12438e(a4, "response");
                long k = C7867c.m14290k(a4);
                if (k != -1) {
                    C8030a0 j = bVar2.mo25670j(k);
                    C7867c.m14301v(j, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, timeUnit);
                    ((C7914b.C7918d) j).close();
                }
                int i6 = a4.f15552j;
                if (i6 != 200) {
                    if (i6 == 407) {
                        C7860k0 k0Var2 = this.f15729q;
                        C7839e0 a5 = k0Var2.f15604a.f15443i.mo25520a(k0Var2, a4);
                        if (a5 == null) {
                            throw new IOException("Failed to authenticate with proxy");
                        } else if (C7694h.m13928f("close", C7850h0.m14257d(a4, "Connection", (String) null, 2), true)) {
                            e0Var = a5;
                            z = true;
                            break;
                        } else {
                            int i7 = i;
                            C8014u uVar2 = uVar;
                            C7839e0 e0Var2 = a5;
                            c0Var = null;
                            e0Var = e0Var2;
                        }
                    } else {
                        StringBuilder u = C0843a.m460u("Unexpected response code for CONNECT: ");
                        u.append(a4.f15552j);
                        throw new IOException(u.toString());
                    }
                } else if (!gVar.mo25901c().mo25886D() || !fVar3.mo25901c().mo25886D()) {
                    throw new IOException("TLS tunnel buffered too many bytes!");
                } else {
                    z = true;
                    e0Var = null;
                }
            }
            if (e0Var != null) {
                Socket socket = this.f15714b;
                if (socket != null) {
                    C7867c.m14284e(socket);
                }
                c0Var = null;
                this.f15714b = null;
                this.f15720h = null;
                this.f15719g = null;
                C7860k0 k0Var3 = this.f15729q;
                InetSocketAddress inetSocketAddress = k0Var3.f15606c;
                Proxy proxy = k0Var3.f15605b;
                C6888i.m12438e(fVar2, NotificationCompat.CATEGORY_CALL);
                C6888i.m12438e(inetSocketAddress, "inetSocketAddress");
                C6888i.m12438e(proxy, "proxy");
                i5++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01f8  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25637g(p421m.p422m0.p426g.C7882b r17, int r18, p421m.C7841f r19, p421m.C8014u r20) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            r2 = r19
            m.d0 r3 = p421m.C7835d0.HTTP_2
            m.d0 r4 = p421m.C7835d0.H2_PRIOR_KNOWLEDGE
            m.d0 r5 = p421m.C7835d0.HTTP_1_1
            m.k0 r6 = r1.f15729q
            m.a r6 = r6.f15604a
            javax.net.ssl.SSLSocketFactory r7 = r6.f15440f
            if (r7 != 0) goto L_0x002d
            java.util.List<m.d0> r2 = r6.f15436b
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L_0x0026
            java.net.Socket r2 = r1.f15714b
            r1.f15715c = r2
            r1.f15717e = r4
            r1.mo25643m(r0)
            return
        L_0x0026:
            java.net.Socket r0 = r1.f15714b
            r1.f15715c = r0
            r1.f15717e = r5
            return
        L_0x002d:
            java.lang.String r6 = "call"
            p298d.p344x.p346c.C6888i.m12438e(r2, r6)
            m.k0 r7 = r1.f15729q
            m.a r7 = r7.f15604a
            javax.net.ssl.SSLSocketFactory r8 = r7.f15440f
            r9 = 0
            p298d.p344x.p346c.C6888i.m12436c(r8)     // Catch:{ all -> 0x01eb }
            java.net.Socket r10 = r1.f15714b     // Catch:{ all -> 0x01eb }
            m.z r11 = r7.f15435a     // Catch:{ all -> 0x01eb }
            java.lang.String r12 = r11.f16106e     // Catch:{ all -> 0x01eb }
            int r11 = r11.f16107f     // Catch:{ all -> 0x01eb }
            r13 = 1
            java.net.Socket r8 = r8.createSocket(r10, r12, r11, r13)     // Catch:{ all -> 0x01eb }
            if (r8 == 0) goto L_0x01e3
            javax.net.ssl.SSLSocket r8 = (javax.net.ssl.SSLSocket) r8     // Catch:{ all -> 0x01eb }
            r10 = r17
            m.n r10 = r10.mo25606a(r8)     // Catch:{ all -> 0x01e1 }
            boolean r11 = r10.f16049b     // Catch:{ all -> 0x01e1 }
            if (r11 == 0) goto L_0x0064
            m.m0.k.h$a r11 = p421m.p422m0.p430k.C7976h.f16015c     // Catch:{ all -> 0x01e1 }
            m.m0.k.h r11 = p421m.p422m0.p430k.C7976h.f16013a     // Catch:{ all -> 0x01e1 }
            m.z r12 = r7.f15435a     // Catch:{ all -> 0x01e1 }
            java.lang.String r12 = r12.f16106e     // Catch:{ all -> 0x01e1 }
            java.util.List<m.d0> r14 = r7.f15436b     // Catch:{ all -> 0x01e1 }
            r11.mo25753d(r8, r12, r14)     // Catch:{ all -> 0x01e1 }
        L_0x0064:
            r8.startHandshake()     // Catch:{ all -> 0x01e1 }
            javax.net.ssl.SSLSession r11 = r8.getSession()     // Catch:{ all -> 0x01e1 }
            java.lang.String r12 = "sslSocketSession"
            p298d.p344x.p346c.C6888i.m12437d(r11, r12)     // Catch:{ all -> 0x01e1 }
            m.x r12 = p421m.C8020x.m14696a(r11)     // Catch:{ all -> 0x01e1 }
            javax.net.ssl.HostnameVerifier r14 = r7.f15441g     // Catch:{ all -> 0x01e1 }
            p298d.p344x.p346c.C6888i.m12436c(r14)     // Catch:{ all -> 0x01e1 }
            m.z r15 = r7.f15435a     // Catch:{ all -> 0x01e1 }
            java.lang.String r15 = r15.f16106e     // Catch:{ all -> 0x01e1 }
            boolean r11 = r14.verify(r15, r11)     // Catch:{ all -> 0x01e1 }
            if (r11 != 0) goto L_0x0123
            java.util.List r0 = r12.mo25832c()     // Catch:{ all -> 0x01e1 }
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x01e1 }
            r2 = r2 ^ r13
            if (r2 == 0) goto L_0x0103
            r2 = 0
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x01e1 }
            if (r0 != 0) goto L_0x009d
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x01e1 }
            java.lang.String r2 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r0.<init>(r2)     // Catch:{ all -> 0x01e1 }
            throw r0     // Catch:{ all -> 0x01e1 }
        L_0x009d:
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0     // Catch:{ all -> 0x01e1 }
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x01e1 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e1 }
            r3.<init>()     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = "\n              |Hostname "
            r3.append(r4)     // Catch:{ all -> 0x01e1 }
            m.z r4 = r7.f15435a     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = r4.f16106e     // Catch:{ all -> 0x01e1 }
            r3.append(r4)     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = " not verified:\n              |    certificate: "
            r3.append(r4)     // Catch:{ all -> 0x01e1 }
            m.h$a r4 = p421m.C7847h.f15546d     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = r4.mo25550a(r0)     // Catch:{ all -> 0x01e1 }
            r3.append(r4)     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = "\n              |    DN: "
            r3.append(r4)     // Catch:{ all -> 0x01e1 }
            java.security.Principal r4 = r0.getSubjectDN()     // Catch:{ all -> 0x01e1 }
            java.lang.String r5 = "cert.subjectDN"
            p298d.p344x.p346c.C6888i.m12437d(r4, r5)     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x01e1 }
            r3.append(r4)     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = "\n              |    subjectAltNames: "
            r3.append(r4)     // Catch:{ all -> 0x01e1 }
            m.m0.m.d r4 = p421m.p422m0.p433m.C8000d.f16043a     // Catch:{ all -> 0x01e1 }
            java.lang.String r5 = "certificate"
            p298d.p344x.p346c.C6888i.m12438e(r0, r5)     // Catch:{ all -> 0x01e1 }
            r5 = 7
            java.util.List r5 = r4.mo25798a(r0, r5)     // Catch:{ all -> 0x01e1 }
            r6 = 2
            java.util.List r0 = r4.mo25798a(r0, r6)     // Catch:{ all -> 0x01e1 }
            java.util.List r0 = p298d.p334t.C6790h.m12322I(r5, r0)     // Catch:{ all -> 0x01e1 }
            r3.append(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "\n              "
            r3.append(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = p298d.p415c0.C7694h.m13922M(r0, r9, r13)     // Catch:{ all -> 0x01e1 }
            r2.<init>(r0)     // Catch:{ all -> 0x01e1 }
            throw r2     // Catch:{ all -> 0x01e1 }
        L_0x0103:
            javax.net.ssl.SSLPeerUnverifiedException r0 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ all -> 0x01e1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e1 }
            r2.<init>()     // Catch:{ all -> 0x01e1 }
            java.lang.String r3 = "Hostname "
            r2.append(r3)     // Catch:{ all -> 0x01e1 }
            m.z r3 = r7.f15435a     // Catch:{ all -> 0x01e1 }
            java.lang.String r3 = r3.f16106e     // Catch:{ all -> 0x01e1 }
            r2.append(r3)     // Catch:{ all -> 0x01e1 }
            java.lang.String r3 = " not verified (no certificates)"
            r2.append(r3)     // Catch:{ all -> 0x01e1 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01e1 }
            r0.<init>(r2)     // Catch:{ all -> 0x01e1 }
            throw r0     // Catch:{ all -> 0x01e1 }
        L_0x0123:
            m.h r9 = r7.f15442h     // Catch:{ all -> 0x01e1 }
            p298d.p344x.p346c.C6888i.m12436c(r9)     // Catch:{ all -> 0x01e1 }
            m.x r11 = new m.x     // Catch:{ all -> 0x01e1 }
            m.l0 r13 = r12.f16093b     // Catch:{ all -> 0x01e1 }
            m.k r14 = r12.f16094c     // Catch:{ all -> 0x01e1 }
            java.util.List<java.security.cert.Certificate> r15 = r12.f16095d     // Catch:{ all -> 0x01e1 }
            r20 = r4
            m.m0.g.g r4 = new m.m0.g.g     // Catch:{ all -> 0x01e1 }
            r4.<init>(r9, r12, r7)     // Catch:{ all -> 0x01e1 }
            r11.<init>(r13, r14, r15, r4)     // Catch:{ all -> 0x01e1 }
            r1.f15716d = r11     // Catch:{ all -> 0x01e1 }
            m.z r4 = r7.f15435a     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = r4.f16106e     // Catch:{ all -> 0x01e1 }
            m.m0.g.h r7 = new m.m0.g.h     // Catch:{ all -> 0x01e1 }
            r7.<init>(r1)     // Catch:{ all -> 0x01e1 }
            r9.mo25546a(r4, r7)     // Catch:{ all -> 0x01e1 }
            boolean r4 = r10.f16049b     // Catch:{ all -> 0x01e1 }
            if (r4 == 0) goto L_0x0155
            m.m0.k.h$a r4 = p421m.p422m0.p430k.C7976h.f16015c     // Catch:{ all -> 0x01e1 }
            m.m0.k.h r4 = p421m.p422m0.p430k.C7976h.f16013a     // Catch:{ all -> 0x01e1 }
            java.lang.String r4 = r4.mo25754f(r8)     // Catch:{ all -> 0x01e1 }
            goto L_0x0156
        L_0x0155:
            r4 = 0
        L_0x0156:
            r1.f15715c = r8     // Catch:{ all -> 0x01e1 }
            n.a0 r7 = p005b.p291q.p292a.C5266a.m9946e4(r8)     // Catch:{ all -> 0x01e1 }
            n.g r7 = p005b.p291q.p292a.C5266a.m9812H(r7)     // Catch:{ all -> 0x01e1 }
            r1.f15719g = r7     // Catch:{ all -> 0x01e1 }
            n.y r7 = p005b.p291q.p292a.C5266a.m9916Z3(r8)     // Catch:{ all -> 0x01e1 }
            n.f r7 = p005b.p291q.p292a.C5266a.m9806G(r7)     // Catch:{ all -> 0x01e1 }
            r1.f15720h = r7     // Catch:{ all -> 0x01e1 }
            if (r4 == 0) goto L_0x01cd
            java.lang.String r7 = "protocol"
            p298d.p344x.p346c.C6888i.m12438e(r4, r7)     // Catch:{ all -> 0x01e1 }
            m.d0 r7 = p421m.C7835d0.HTTP_1_0     // Catch:{ all -> 0x01e1 }
            java.lang.String r9 = "http/1.0"
            boolean r9 = p298d.p344x.p346c.C6888i.m12434a(r4, r9)     // Catch:{ all -> 0x01e1 }
            if (r9 == 0) goto L_0x017f
            r4 = r7
            goto L_0x01b4
        L_0x017f:
            java.lang.String r7 = "http/1.1"
            boolean r7 = p298d.p344x.p346c.C6888i.m12434a(r4, r7)     // Catch:{ all -> 0x01e1 }
            if (r7 == 0) goto L_0x0188
            goto L_0x01cd
        L_0x0188:
            java.lang.String r5 = "h2_prior_knowledge"
            boolean r5 = p298d.p344x.p346c.C6888i.m12434a(r4, r5)     // Catch:{ all -> 0x01e1 }
            if (r5 == 0) goto L_0x0193
            r4 = r20
            goto L_0x01b4
        L_0x0193:
            java.lang.String r5 = "h2"
            boolean r5 = p298d.p344x.p346c.C6888i.m12434a(r4, r5)     // Catch:{ all -> 0x01e1 }
            if (r5 == 0) goto L_0x019d
            r4 = r3
            goto L_0x01b4
        L_0x019d:
            m.d0 r5 = p421m.C7835d0.SPDY_3     // Catch:{ all -> 0x01e1 }
            java.lang.String r7 = "spdy/3.1"
            boolean r7 = p298d.p344x.p346c.C6888i.m12434a(r4, r7)     // Catch:{ all -> 0x01e1 }
            if (r7 == 0) goto L_0x01a9
        L_0x01a7:
            r4 = r5
            goto L_0x01b4
        L_0x01a9:
            m.d0 r5 = p421m.C7835d0.QUIC     // Catch:{ all -> 0x01e1 }
            java.lang.String r7 = "quic"
            boolean r7 = p298d.p344x.p346c.C6888i.m12434a(r4, r7)     // Catch:{ all -> 0x01e1 }
            if (r7 == 0) goto L_0x01b6
            goto L_0x01a7
        L_0x01b4:
            r5 = r4
            goto L_0x01cd
        L_0x01b6:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01e1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e1 }
            r2.<init>()     // Catch:{ all -> 0x01e1 }
            java.lang.String r3 = "Unexpected protocol: "
            r2.append(r3)     // Catch:{ all -> 0x01e1 }
            r2.append(r4)     // Catch:{ all -> 0x01e1 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01e1 }
            r0.<init>(r2)     // Catch:{ all -> 0x01e1 }
            throw r0     // Catch:{ all -> 0x01e1 }
        L_0x01cd:
            r1.f15717e = r5     // Catch:{ all -> 0x01e1 }
            m.m0.k.h$a r4 = p421m.p422m0.p430k.C7976h.f16015c
            m.m0.k.h r4 = p421m.p422m0.p430k.C7976h.f16013a
            r4.mo25769a(r8)
            p298d.p344x.p346c.C6888i.m12438e(r2, r6)
            m.d0 r2 = r1.f15717e
            if (r2 != r3) goto L_0x01e0
            r1.mo25643m(r0)
        L_0x01e0:
            return
        L_0x01e1:
            r0 = move-exception
            goto L_0x01ed
        L_0x01e3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x01eb }
            java.lang.String r2 = "null cannot be cast to non-null type javax.net.ssl.SSLSocket"
            r0.<init>(r2)     // Catch:{ all -> 0x01eb }
            throw r0     // Catch:{ all -> 0x01eb }
        L_0x01eb:
            r0 = move-exception
            r8 = 0
        L_0x01ed:
            if (r8 == 0) goto L_0x01f6
            m.m0.k.h$a r2 = p421m.p422m0.p430k.C7976h.f16015c
            m.m0.k.h r2 = p421m.p422m0.p430k.C7976h.f16013a
            r2.mo25769a(r8)
        L_0x01f6:
            if (r8 == 0) goto L_0x01fb
            p421m.p422m0.C7867c.m14284e(r8)
        L_0x01fb:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p426g.C7894i.mo25637g(m.m0.g.b, int, m.f, m.u):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d2, code lost:
        if (r8 == false) goto L_0x00d6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0089 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00da A[SYNTHETIC, Splitter:B:53:0x00da] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25638h(p421m.C7825a r7, java.util.List<p421m.C7860k0> r8) {
        /*
            r6 = this;
            java.lang.String r0 = "address"
            p298d.p344x.p346c.C6888i.m12438e(r7, r0)
            byte[] r0 = p421m.p422m0.C7867c.f15619a
            java.util.List<java.lang.ref.Reference<m.m0.g.e>> r0 = r6.f15727o
            int r0 = r0.size()
            int r1 = r6.f15726n
            r2 = 0
            if (r0 >= r1) goto L_0x00ff
            boolean r0 = r6.f15721i
            if (r0 == 0) goto L_0x0018
            goto L_0x00ff
        L_0x0018:
            m.k0 r0 = r6.f15729q
            m.a r0 = r0.f15604a
            boolean r0 = r0.mo25516a(r7)
            if (r0 != 0) goto L_0x0023
            return r2
        L_0x0023:
            m.z r0 = r7.f15435a
            java.lang.String r0 = r0.f16106e
            m.k0 r1 = r6.f15729q
            m.a r1 = r1.f15604a
            m.z r1 = r1.f15435a
            java.lang.String r1 = r1.f16106e
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r0, r1)
            r1 = 1
            if (r0 == 0) goto L_0x0037
            return r1
        L_0x0037:
            m.m0.j.f r0 = r6.f15718f
            if (r0 != 0) goto L_0x003c
            return r2
        L_0x003c:
            if (r8 == 0) goto L_0x00ff
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0045
            goto L_0x007e
        L_0x0045:
            java.util.Iterator r8 = r8.iterator()
        L_0x0049:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x007e
            java.lang.Object r0 = r8.next()
            m.k0 r0 = (p421m.C7860k0) r0
            java.net.Proxy r3 = r0.f15605b
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.DIRECT
            if (r3 != r4) goto L_0x0079
            m.k0 r3 = r6.f15729q
            java.net.Proxy r3 = r3.f15605b
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.DIRECT
            if (r3 != r4) goto L_0x0079
            m.k0 r3 = r6.f15729q
            java.net.InetSocketAddress r3 = r3.f15606c
            java.net.InetSocketAddress r0 = r0.f15606c
            boolean r0 = p298d.p344x.p346c.C6888i.m12434a(r3, r0)
            if (r0 == 0) goto L_0x0079
            r0 = r1
            goto L_0x007a
        L_0x0079:
            r0 = r2
        L_0x007a:
            if (r0 == 0) goto L_0x0049
            r8 = r1
            goto L_0x007f
        L_0x007e:
            r8 = r2
        L_0x007f:
            if (r8 != 0) goto L_0x0083
            goto L_0x00ff
        L_0x0083:
            javax.net.ssl.HostnameVerifier r8 = r7.f15441g
            m.m0.m.d r0 = p421m.p422m0.p433m.C8000d.f16043a
            if (r8 == r0) goto L_0x008a
            return r2
        L_0x008a:
            m.z r8 = r7.f15435a
            byte[] r3 = p421m.p422m0.C7867c.f15619a
            m.k0 r3 = r6.f15729q
            m.a r3 = r3.f15604a
            m.z r3 = r3.f15435a
            int r4 = r8.f16107f
            int r5 = r3.f16107f
            if (r4 == r5) goto L_0x009b
            goto L_0x00d6
        L_0x009b:
            java.lang.String r4 = r8.f16106e
            java.lang.String r3 = r3.f16106e
            boolean r3 = p298d.p344x.p346c.C6888i.m12434a(r4, r3)
            if (r3 == 0) goto L_0x00a6
            goto L_0x00d4
        L_0x00a6:
            boolean r3 = r6.f15722j
            if (r3 != 0) goto L_0x00d6
            m.x r3 = r6.f15716d
            if (r3 == 0) goto L_0x00d6
            p298d.p344x.p346c.C6888i.m12436c(r3)
            java.util.List r3 = r3.mo25832c()
            boolean r4 = r3.isEmpty()
            r4 = r4 ^ r1
            if (r4 == 0) goto L_0x00d1
            java.lang.String r8 = r8.f16106e
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r4 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            java.util.Objects.requireNonNull(r3, r4)
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            boolean r8 = r0.mo25799b(r8, r3)
            if (r8 == 0) goto L_0x00d1
            r8 = r1
            goto L_0x00d2
        L_0x00d1:
            r8 = r2
        L_0x00d2:
            if (r8 == 0) goto L_0x00d6
        L_0x00d4:
            r8 = r1
            goto L_0x00d7
        L_0x00d6:
            r8 = r2
        L_0x00d7:
            if (r8 != 0) goto L_0x00da
            return r2
        L_0x00da:
            m.h r8 = r7.f15442h     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            p298d.p344x.p346c.C6888i.m12436c(r8)     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            m.z r7 = r7.f15435a     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            java.lang.String r7 = r7.f16106e     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            m.x r0 = r6.f15716d     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            p298d.p344x.p346c.C6888i.m12436c(r0)     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            java.util.List r0 = r0.mo25832c()     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            java.lang.String r3 = "hostname"
            p298d.p344x.p346c.C6888i.m12438e(r7, r3)     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            java.lang.String r3 = "peerCertificates"
            p298d.p344x.p346c.C6888i.m12438e(r0, r3)     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            m.i r3 = new m.i     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            r3.<init>(r8, r0, r7)     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            r8.mo25546a(r7, r3)     // Catch:{ SSLPeerUnverifiedException -> 0x00ff }
            return r1
        L_0x00ff:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p426g.C7894i.mo25638h(m.a, java.util.List):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return false;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25639i(boolean r10) {
        /*
            r9 = this;
            byte[] r0 = p421m.p422m0.C7867c.f15619a
            long r0 = java.lang.System.nanoTime()
            java.net.Socket r2 = r9.f15714b
            p298d.p344x.p346c.C6888i.m12436c(r2)
            java.net.Socket r3 = r9.f15715c
            p298d.p344x.p346c.C6888i.m12436c(r3)
            n.g r4 = r9.f15719g
            p298d.p344x.p346c.C6888i.m12436c(r4)
            boolean r2 = r2.isClosed()
            r5 = 0
            if (r2 != 0) goto L_0x0086
            boolean r2 = r3.isClosed()
            if (r2 != 0) goto L_0x0086
            boolean r2 = r3.isInputShutdown()
            if (r2 != 0) goto L_0x0086
            boolean r2 = r3.isOutputShutdown()
            if (r2 == 0) goto L_0x002f
            goto L_0x0086
        L_0x002f:
            m.m0.j.f r2 = r9.f15718f
            r6 = 1
            if (r2 == 0) goto L_0x0050
            monitor-enter(r2)
            boolean r10 = r2.f15860m     // Catch:{ all -> 0x004d }
            if (r10 == 0) goto L_0x003b
        L_0x0039:
            monitor-exit(r2)
            goto L_0x004c
        L_0x003b:
            long r3 = r2.f15869v     // Catch:{ all -> 0x004d }
            long r7 = r2.f15868u     // Catch:{ all -> 0x004d }
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 >= 0) goto L_0x004a
            long r3 = r2.f15871x     // Catch:{ all -> 0x004d }
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 < 0) goto L_0x004a
            goto L_0x0039
        L_0x004a:
            monitor-exit(r2)
            r5 = r6
        L_0x004c:
            return r5
        L_0x004d:
            r10 = move-exception
            monitor-exit(r2)
            throw r10
        L_0x0050:
            monitor-enter(r9)
            long r7 = r9.f15728p     // Catch:{ all -> 0x0083 }
            long r0 = r0 - r7
            monitor-exit(r9)
            r7 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0082
            if (r10 == 0) goto L_0x0082
            java.lang.String r10 = "$this$isHealthy"
            p298d.p344x.p346c.C6888i.m12438e(r3, r10)
            java.lang.String r10 = "source"
            p298d.p344x.p346c.C6888i.m12438e(r4, r10)
            int r10 = r3.getSoTimeout()     // Catch:{ SocketTimeoutException -> 0x0080, IOException -> 0x0081 }
            r3.setSoTimeout(r6)     // Catch:{ all -> 0x007b }
            boolean r0 = r4.mo25886D()     // Catch:{ all -> 0x007b }
            r0 = r0 ^ r6
            r3.setSoTimeout(r10)     // Catch:{ SocketTimeoutException -> 0x0080, IOException -> 0x0081 }
            r5 = r0
            goto L_0x0081
        L_0x007b:
            r0 = move-exception
            r3.setSoTimeout(r10)     // Catch:{ SocketTimeoutException -> 0x0080, IOException -> 0x0081 }
            throw r0     // Catch:{ SocketTimeoutException -> 0x0080, IOException -> 0x0081 }
        L_0x0080:
            r5 = r6
        L_0x0081:
            return r5
        L_0x0082:
            return r6
        L_0x0083:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L_0x0086:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p426g.C7894i.mo25639i(boolean):boolean");
    }

    /* renamed from: j */
    public final boolean mo25640j() {
        return this.f15718f != null;
    }

    /* renamed from: k */
    public final C7906d mo25641k(C7831c0 c0Var, C7909g gVar) {
        C6888i.m12438e(c0Var, "client");
        C6888i.m12438e(gVar, "chain");
        Socket socket = this.f15715c;
        C6888i.m12436c(socket);
        C8043g gVar2 = this.f15719g;
        C6888i.m12436c(gVar2);
        C8042f fVar = this.f15720h;
        C6888i.m12436c(fVar);
        C7929f fVar2 = this.f15718f;
        if (fVar2 != null) {
            return new C7946m(c0Var, this, gVar, fVar2);
        }
        socket.setSoTimeout(gVar.f15766h);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        gVar2.mo17035f().mo25879g((long) gVar.f15766h, timeUnit);
        fVar.mo17028f().mo25879g((long) gVar.f15767i, timeUnit);
        return new C7914b(c0Var, this, gVar2, fVar);
    }

    /* renamed from: l */
    public final synchronized void mo25642l() {
        this.f15721i = true;
    }

    /* renamed from: m */
    public final void mo25643m(int i) {
        StringBuilder sb;
        Socket socket = this.f15715c;
        C6888i.m12436c(socket);
        C8043g gVar = this.f15719g;
        C6888i.m12436c(gVar);
        C8042f fVar = this.f15720h;
        C6888i.m12436c(fVar);
        socket.setSoTimeout(0);
        C7876d dVar = C7876d.f15642h;
        C7929f.C7931b bVar = new C7929f.C7931b(true, dVar);
        String str = this.f15729q.f15604a.f15435a.f16106e;
        C6888i.m12438e(socket, "socket");
        C6888i.m12438e(str, "peerName");
        C6888i.m12438e(gVar, "source");
        C6888i.m12438e(fVar, "sink");
        bVar.f15876a = socket;
        if (bVar.f15883h) {
            sb = new StringBuilder();
            sb.append(C7867c.f15625g);
            sb.append(' ');
        } else {
            sb = C0843a.m460u("MockWebServer ");
        }
        sb.append(str);
        bVar.f15877b = sb.toString();
        bVar.f15878c = gVar;
        bVar.f15879d = fVar;
        C6888i.m12438e(this, "listener");
        bVar.f15880e = this;
        bVar.f15882g = i;
        C7929f fVar2 = new C7929f(bVar);
        this.f15718f = fVar2;
        C7929f fVar3 = C7929f.f15845J;
        C7959t tVar = C7929f.f15844I;
        this.f15726n = (tVar.f15981a & 16) != 0 ? tVar.f15982b[4] : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        C6888i.m12438e(dVar, "taskRunner");
        C7954p pVar = fVar2.f15851F;
        synchronized (pVar) {
            if (pVar.f15969i) {
                throw new IOException("closed");
            } else if (pVar.f15972l) {
                Logger logger = C7954p.f15966m;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C7867c.m14288i(">> CONNECTION " + C7928e.f15839a.mo25960p(), new Object[0]));
                }
                pVar.f15971k.mo25890M(C7928e.f15839a);
                pVar.f15971k.flush();
            }
        }
        C7954p pVar2 = fVar2.f15851F;
        C7959t tVar2 = fVar2.f15872y;
        synchronized (pVar2) {
            C6888i.m12438e(tVar2, "settings");
            if (!pVar2.f15969i) {
                pVar2.mo25739e(0, Integer.bitCount(tVar2.f15981a) * 6, 4, 0);
                int i2 = 0;
                while (i2 < 10) {
                    if (((1 << i2) & tVar2.f15981a) != 0) {
                        pVar2.f15971k.mo25926r(i2 != 4 ? i2 != 7 ? i2 : 4 : 3);
                        pVar2.f15971k.mo25939v(tVar2.f15982b[i2]);
                    }
                    i2++;
                }
                pVar2.f15971k.flush();
            } else {
                throw new IOException("closed");
            }
        }
        int a = fVar2.f15872y.mo25749a();
        if (a != 65535) {
            fVar2.f15851F.mo25741g(0, (long) (a - 65535));
        }
        C7875c f = dVar.mo25599f();
        String str2 = fVar2.f15857j;
        f.mo25591c(new C7874b(fVar2.f15852G, str2, true, str2, true), 0);
    }

    public String toString() {
        Object obj;
        StringBuilder u = C0843a.m460u("Connection{");
        u.append(this.f15729q.f15604a.f15435a.f16106e);
        u.append(':');
        u.append(this.f15729q.f15604a.f15435a.f16107f);
        u.append(',');
        u.append(" proxy=");
        u.append(this.f15729q.f15605b);
        u.append(" hostAddress=");
        u.append(this.f15729q.f15606c);
        u.append(" cipherSuite=");
        C8020x xVar = this.f15716d;
        if (xVar == null || (obj = xVar.f16094c) == null) {
            obj = "none";
        }
        u.append(obj);
        u.append(" protocol=");
        u.append(this.f15717e);
        u.append('}');
        return u.toString();
    }
}
