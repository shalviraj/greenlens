package p421m.p422m0.p426g;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import p298d.p344x.p346c.C6888i;
import p421m.C7825a;
import p421m.C7860k0;
import p421m.C8014u;
import p421m.C8025z;
import p421m.p422m0.p426g.C7899m;
import p421m.p422m0.p429j.C7921a;
import p421m.p422m0.p429j.C7922b;
import p421m.p422m0.p429j.C7960u;

/* renamed from: m.m0.g.d */
public final class C7886d {

    /* renamed from: a */
    public C7899m.C7900a f15676a;

    /* renamed from: b */
    public C7899m f15677b;

    /* renamed from: c */
    public int f15678c;

    /* renamed from: d */
    public int f15679d;

    /* renamed from: e */
    public int f15680e;

    /* renamed from: f */
    public C7860k0 f15681f;

    /* renamed from: g */
    public final C7895j f15682g;

    /* renamed from: h */
    public final C7825a f15683h;

    /* renamed from: i */
    public final C7887e f15684i;

    /* renamed from: j */
    public final C8014u f15685j;

    public C7886d(C7895j jVar, C7825a aVar, C7887e eVar, C8014u uVar) {
        C6888i.m12438e(jVar, "connectionPool");
        C6888i.m12438e(aVar, "address");
        C6888i.m12438e(eVar, NotificationCompat.CATEGORY_CALL);
        C6888i.m12438e(uVar, "eventListener");
        this.f15682g = jVar;
        this.f15683h = aVar;
        this.f15684i = eVar;
        this.f15685j = uVar;
    }

    /* JADX INFO: finally extract failed */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02fd A[SYNTHETIC] */
    /* renamed from: a */
    public final p421m.p422m0.p426g.C7894i mo25614a(int r16, int r17, int r18, int r19, boolean r20, boolean r21) {
        /*
            r15 = this;
            r1 = r15
        L_0x0001:
            m.m0.g.e r0 = r1.f15684i
            boolean r0 = r0.f15698s
            if (r0 != 0) goto L_0x0343
            m.m0.g.e r0 = r1.f15684i
            m.m0.g.i r2 = r0.f15692m
            r0 = 0
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x005e
            monitor-enter(r2)
            boolean r5 = r2.f15721i     // Catch:{ all -> 0x005b }
            if (r5 != 0) goto L_0x0024
            m.k0 r5 = r2.f15729q     // Catch:{ all -> 0x005b }
            m.a r5 = r5.f15604a     // Catch:{ all -> 0x005b }
            m.z r5 = r5.f15435a     // Catch:{ all -> 0x005b }
            boolean r5 = r15.mo25615b(r5)     // Catch:{ all -> 0x005b }
            if (r5 != 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r5 = r3
            goto L_0x002a
        L_0x0024:
            m.m0.g.e r5 = r1.f15684i     // Catch:{ all -> 0x005b }
            java.net.Socket r5 = r5.mo25628m()     // Catch:{ all -> 0x005b }
        L_0x002a:
            monitor-exit(r2)
            m.m0.g.e r6 = r1.f15684i
            m.m0.g.i r6 = r6.f15692m
            if (r6 == 0) goto L_0x0044
            if (r5 != 0) goto L_0x0034
            r0 = r4
        L_0x0034:
            if (r0 == 0) goto L_0x0038
            goto L_0x02c9
        L_0x0038:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0044:
            if (r5 == 0) goto L_0x0049
            p421m.p422m0.C7867c.m14284e(r5)
        L_0x0049:
            m.u r5 = r1.f15685j
            m.m0.g.e r6 = r1.f15684i
            java.util.Objects.requireNonNull(r5)
            java.lang.String r5 = "call"
            p298d.p344x.p346c.C6888i.m12438e(r6, r5)
            java.lang.String r5 = "connection"
            p298d.p344x.p346c.C6888i.m12438e(r2, r5)
            goto L_0x005e
        L_0x005b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x005e:
            r1.f15678c = r0
            r1.f15679d = r0
            r1.f15680e = r0
            m.m0.g.j r2 = r1.f15682g
            m.a r5 = r1.f15683h
            m.m0.g.e r6 = r1.f15684i
            boolean r2 = r2.mo25645a(r5, r6, r3, r0)
            if (r2 == 0) goto L_0x0072
            goto L_0x0262
        L_0x0072:
            m.k0 r2 = r1.f15681f
            if (r2 == 0) goto L_0x007c
            p298d.p344x.p346c.C6888i.m12436c(r2)
            r1.f15681f = r3
            goto L_0x0092
        L_0x007c:
            m.m0.g.m$a r2 = r1.f15676a
            if (r2 == 0) goto L_0x0095
            p298d.p344x.p346c.C6888i.m12436c(r2)
            boolean r2 = r2.mo25649a()
            if (r2 == 0) goto L_0x0095
            m.m0.g.m$a r0 = r1.f15676a
            p298d.p344x.p346c.C6888i.m12436c(r0)
            m.k0 r2 = r0.mo25650b()
        L_0x0092:
            r5 = r3
            goto L_0x026f
        L_0x0095:
            m.m0.g.m r2 = r1.f15677b
            if (r2 != 0) goto L_0x00aa
            m.m0.g.m r2 = new m.m0.g.m
            m.a r5 = r1.f15683h
            m.m0.g.e r6 = r1.f15684i
            m.c0 r7 = r6.f15701v
            m.m0.g.k r7 = r7.f15459E
            m.u r8 = r1.f15685j
            r2.<init>(r5, r7, r6, r8)
            r1.f15677b = r2
        L_0x00aa:
            boolean r5 = r2.mo25647a()
            if (r5 == 0) goto L_0x033d
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x00b5:
            boolean r6 = r2.mo25648b()
            if (r6 == 0) goto L_0x0237
            boolean r6 = r2.mo25648b()
            java.lang.String r7 = "No route to "
            if (r6 == 0) goto L_0x0216
            java.util.List<? extends java.net.Proxy> r6 = r2.f15739a
            int r8 = r2.f15740b
            int r9 = r8 + 1
            r2.f15740b = r9
            java.lang.Object r6 = r6.get(r8)
            java.net.Proxy r6 = (java.net.Proxy) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r2.f15741c = r8
            java.net.Proxy$Type r9 = r6.type()
            java.net.Proxy$Type r10 = java.net.Proxy.Type.DIRECT
            if (r9 == r10) goto L_0x012e
            java.net.Proxy$Type r9 = r6.type()
            java.net.Proxy$Type r10 = java.net.Proxy.Type.SOCKS
            if (r9 != r10) goto L_0x00e9
            goto L_0x012e
        L_0x00e9:
            java.net.SocketAddress r9 = r6.address()
            boolean r10 = r9 instanceof java.net.InetSocketAddress
            if (r10 == 0) goto L_0x0113
            java.net.InetSocketAddress r9 = (java.net.InetSocketAddress) r9
            java.lang.String r10 = "$this$socketHost"
            p298d.p344x.p346c.C6888i.m12438e(r9, r10)
            java.net.InetAddress r10 = r9.getAddress()
            if (r10 == 0) goto L_0x0105
            java.lang.String r10 = r10.getHostAddress()
            java.lang.String r11 = "address.hostAddress"
            goto L_0x010b
        L_0x0105:
            java.lang.String r10 = r9.getHostName()
            java.lang.String r11 = "hostName"
        L_0x010b:
            p298d.p344x.p346c.C6888i.m12437d(r10, r11)
            int r9 = r9.getPort()
            goto L_0x0136
        L_0x0113:
            java.lang.String r0 = "Proxy.address() is not an InetSocketAddress: "
            java.lang.StringBuilder r0 = p005b.p035e.p036a.p037a.C0843a.m460u(r0)
            java.lang.Class r2 = r9.getClass()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x012e:
            m.a r9 = r2.f15743e
            m.z r9 = r9.f15435a
            java.lang.String r10 = r9.f16106e
            int r9 = r9.f16107f
        L_0x0136:
            r11 = 65535(0xffff, float:9.1834E-41)
            if (r4 > r9) goto L_0x01f4
            if (r11 < r9) goto L_0x01f4
            java.net.Proxy$Type r7 = r6.type()
            java.net.Proxy$Type r11 = java.net.Proxy.Type.SOCKS
            if (r7 != r11) goto L_0x014d
            java.net.InetSocketAddress r7 = java.net.InetSocketAddress.createUnresolved(r10, r9)
            r8.add(r7)
            goto L_0x0197
        L_0x014d:
            m.u r7 = r2.f15746h
            m.f r11 = r2.f15745g
            java.util.Objects.requireNonNull(r7)
            java.lang.String r7 = "call"
            p298d.p344x.p346c.C6888i.m12438e(r11, r7)
            java.lang.String r11 = "domainName"
            p298d.p344x.p346c.C6888i.m12438e(r10, r11)
            m.a r12 = r2.f15743e
            m.t r12 = r12.f15438d
            java.util.List r12 = r12.mo25825a(r10)
            boolean r13 = r12.isEmpty()
            if (r13 != 0) goto L_0x01d6
            m.u r13 = r2.f15746h
            m.f r14 = r2.f15745g
            java.util.Objects.requireNonNull(r13)
            p298d.p344x.p346c.C6888i.m12438e(r14, r7)
            p298d.p344x.p346c.C6888i.m12438e(r10, r11)
            java.lang.String r7 = "inetAddressList"
            p298d.p344x.p346c.C6888i.m12438e(r12, r7)
            java.util.Iterator r7 = r12.iterator()
        L_0x0182:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x0197
            java.lang.Object r10 = r7.next()
            java.net.InetAddress r10 = (java.net.InetAddress) r10
            java.net.InetSocketAddress r11 = new java.net.InetSocketAddress
            r11.<init>(r10, r9)
            r8.add(r11)
            goto L_0x0182
        L_0x0197:
            java.util.List<? extends java.net.InetSocketAddress> r7 = r2.f15741c
            java.util.Iterator r7 = r7.iterator()
        L_0x019d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x01ce
            java.lang.Object r8 = r7.next()
            java.net.InetSocketAddress r8 = (java.net.InetSocketAddress) r8
            m.k0 r9 = new m.k0
            m.a r10 = r2.f15743e
            r9.<init>(r10, r6, r8)
            m.m0.g.k r8 = r2.f15744f
            monitor-enter(r8)
            java.lang.String r10 = "route"
            p298d.p344x.p346c.C6888i.m12438e(r9, r10)     // Catch:{ all -> 0x01cb }
            java.util.Set<m.k0> r10 = r8.f15736a     // Catch:{ all -> 0x01cb }
            boolean r10 = r10.contains(r9)     // Catch:{ all -> 0x01cb }
            monitor-exit(r8)
            if (r10 == 0) goto L_0x01c7
            java.util.List<m.k0> r8 = r2.f15742d
            r8.add(r9)
            goto L_0x019d
        L_0x01c7:
            r5.add(r9)
            goto L_0x019d
        L_0x01cb:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x01ce:
            boolean r6 = r5.isEmpty()
            r6 = r6 ^ r4
            if (r6 == 0) goto L_0x00b5
            goto L_0x0237
        L_0x01d6:
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            m.a r2 = r2.f15743e
            m.t r2 = r2.f15438d
            r3.append(r2)
            java.lang.String r2 = " returned no addresses for "
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x01f4:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            r2.append(r10)
            r3 = 58
            r2.append(r3)
            r2.append(r9)
            java.lang.String r3 = "; port is out of range"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0216:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r3 = p005b.p035e.p036a.p037a.C0843a.m460u(r7)
            m.a r4 = r2.f15743e
            m.z r4 = r4.f15435a
            java.lang.String r4 = r4.f16106e
            r3.append(r4)
            java.lang.String r4 = "; exhausted proxy configurations: "
            r3.append(r4)
            java.util.List<? extends java.net.Proxy> r2 = r2.f15739a
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x0237:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x0247
            java.util.List<m.k0> r6 = r2.f15742d
            p298d.p334t.C6790h.m12342b(r5, r6)
            java.util.List<m.k0> r2 = r2.f15742d
            r2.clear()
        L_0x0247:
            m.m0.g.m$a r2 = new m.m0.g.m$a
            r2.<init>(r5)
            r1.f15676a = r2
            java.util.List<m.k0> r5 = r2.f15748b
            m.m0.g.e r6 = r1.f15684i
            boolean r6 = r6.f15698s
            if (r6 != 0) goto L_0x0335
            m.m0.g.j r6 = r1.f15682g
            m.a r7 = r1.f15683h
            m.m0.g.e r8 = r1.f15684i
            boolean r0 = r6.mo25645a(r7, r8, r5, r0)
            if (r0 == 0) goto L_0x026b
        L_0x0262:
            m.m0.g.e r0 = r1.f15684i
            m.m0.g.i r0 = r0.f15692m
            p298d.p344x.p346c.C6888i.m12436c(r0)
        L_0x0269:
            r2 = r0
            goto L_0x02c2
        L_0x026b:
            m.k0 r2 = r2.mo25650b()
        L_0x026f:
            m.m0.g.i r14 = new m.m0.g.i
            m.m0.g.j r0 = r1.f15682g
            r14.<init>(r0, r2)
            m.m0.g.e r0 = r1.f15684i
            r0.f15700u = r14
            m.m0.g.e r12 = r1.f15684i     // Catch:{ all -> 0x032f }
            m.u r13 = r1.f15685j     // Catch:{ all -> 0x032f }
            r6 = r14
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r6.mo25633c(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x032f }
            m.m0.g.e r0 = r1.f15684i
            r0.f15700u = r3
            m.m0.g.e r0 = r1.f15684i
            m.c0 r0 = r0.f15701v
            m.m0.g.k r3 = r0.f15459E
            m.k0 r0 = r14.f15729q
            monitor-enter(r3)
            java.lang.String r6 = "route"
            p298d.p344x.p346c.C6888i.m12438e(r0, r6)     // Catch:{ all -> 0x032c }
            java.util.Set<m.k0> r6 = r3.f15736a     // Catch:{ all -> 0x032c }
            r6.remove(r0)     // Catch:{ all -> 0x032c }
            monitor-exit(r3)
            m.m0.g.j r0 = r1.f15682g
            m.a r3 = r1.f15683h
            m.m0.g.e r6 = r1.f15684i
            boolean r0 = r0.mo25645a(r3, r6, r5, r4)
            if (r0 == 0) goto L_0x02cc
            m.m0.g.e r0 = r1.f15684i
            m.m0.g.i r0 = r0.f15692m
            p298d.p344x.p346c.C6888i.m12436c(r0)
            r1.f15681f = r2
            java.net.Socket r2 = r14.f15715c
            p298d.p344x.p346c.C6888i.m12436c(r2)
            p421m.p422m0.C7867c.m14284e(r2)
            goto L_0x0269
        L_0x02c2:
            m.u r0 = r1.f15685j
            m.m0.g.e r3 = r1.f15684i
            r0.mo25826a(r3, r2)
        L_0x02c9:
            r0 = r21
            goto L_0x02f7
        L_0x02cc:
            monitor-enter(r14)
            m.m0.g.j r0 = r1.f15682g     // Catch:{ all -> 0x0329 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x0329 }
            java.lang.String r2 = "connection"
            p298d.p344x.p346c.C6888i.m12438e(r14, r2)     // Catch:{ all -> 0x0329 }
            byte[] r2 = p421m.p422m0.C7867c.f15619a     // Catch:{ all -> 0x0329 }
            java.util.concurrent.ConcurrentLinkedQueue<m.m0.g.i> r2 = r0.f15733d     // Catch:{ all -> 0x0329 }
            r2.add(r14)     // Catch:{ all -> 0x0329 }
            m.m0.f.c r2 = r0.f15731b     // Catch:{ all -> 0x0329 }
            m.m0.g.j$a r0 = r0.f15732c     // Catch:{ all -> 0x0329 }
            r5 = 0
            r2.mo25591c(r0, r5)     // Catch:{ all -> 0x0329 }
            m.m0.g.e r0 = r1.f15684i     // Catch:{ all -> 0x0329 }
            r0.mo25617b(r14)     // Catch:{ all -> 0x0329 }
            monitor-exit(r14)
            m.u r0 = r1.f15685j
            m.m0.g.e r2 = r1.f15684i
            r0.mo25826a(r2, r14)
            r0 = r21
            r2 = r14
        L_0x02f7:
            boolean r3 = r2.mo25639i(r0)
            if (r3 == 0) goto L_0x02fe
            return r2
        L_0x02fe:
            r2.mo25642l()
            m.k0 r2 = r1.f15681f
            if (r2 == 0) goto L_0x0307
            goto L_0x0001
        L_0x0307:
            m.m0.g.m$a r2 = r1.f15676a
            if (r2 == 0) goto L_0x0310
            boolean r2 = r2.mo25649a()
            goto L_0x0311
        L_0x0310:
            r2 = r4
        L_0x0311:
            if (r2 == 0) goto L_0x0315
            goto L_0x0001
        L_0x0315:
            m.m0.g.m r2 = r1.f15677b
            if (r2 == 0) goto L_0x031d
            boolean r4 = r2.mo25647a()
        L_0x031d:
            if (r4 == 0) goto L_0x0321
            goto L_0x0001
        L_0x0321:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "exhausted all routes"
            r0.<init>(r2)
            throw r0
        L_0x0329:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        L_0x032c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x032f:
            r0 = move-exception
            m.m0.g.e r2 = r1.f15684i
            r2.f15700u = r3
            throw r0
        L_0x0335:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x033d:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0343:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p426g.C7886d.mo25614a(int, int, int, int, boolean, boolean):m.m0.g.i");
    }

    /* renamed from: b */
    public final boolean mo25615b(C8025z zVar) {
        C6888i.m12438e(zVar, "url");
        C8025z zVar2 = this.f15683h.f15435a;
        return zVar.f16107f == zVar2.f16107f && C6888i.m12434a(zVar.f16106e, zVar2.f16106e);
    }

    /* renamed from: c */
    public final void mo25616c(IOException iOException) {
        C6888i.m12438e(iOException, "e");
        this.f15681f = null;
        if ((iOException instanceof C7960u) && ((C7960u) iOException).f15983g == C7922b.REFUSED_STREAM) {
            this.f15678c++;
        } else if (iOException instanceof C7921a) {
            this.f15679d++;
        } else {
            this.f15680e++;
        }
    }
}
