package p005b.p280p.p285b.p286a0.p288k;

import java.io.IOException;
import p005b.p280p.p285b.C5121a;
import p005b.p280p.p285b.C5233i;
import p005b.p280p.p285b.p286a0.p289l.C5212a;

/* renamed from: b.p.b.a0.k.p */
public final class C5211p {

    /* renamed from: a */
    public final C5121a f10228a;

    /* renamed from: b */
    public final C5233i f10229b;

    /* renamed from: c */
    public C5209n f10230c;

    /* renamed from: d */
    public C5212a f10231d;

    /* renamed from: e */
    public boolean f10232e;

    /* renamed from: f */
    public C5203i f10233f;

    public C5211p(C5233i iVar, C5121a aVar) {
        this.f10229b = iVar;
        this.f10228a = aVar;
    }

    /* renamed from: a */
    public synchronized C5212a mo17109a() {
        return this.f10231d;
    }

    /* renamed from: b */
    public void mo17110b() {
        mo17112d(true, false, true);
    }

    /* renamed from: c */
    public final void mo17111c(IOException iOException) {
        synchronized (this.f10229b) {
            C5209n nVar = this.f10230c;
            if (nVar != null) {
                C5212a aVar = this.f10231d;
                if (aVar.f10242g == 0) {
                    nVar.mo17103a(aVar.f10236a, iOException);
                } else {
                    this.f10230c = null;
                }
            }
        }
        mo17110b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x007d A[Catch:{ all -> 0x0009 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17112d(boolean r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            b.p.b.i r0 = r5.f10229b
            monitor-enter(r0)
            r1 = 0
            if (r8 == 0) goto L_0x000c
            r5.f10233f = r1     // Catch:{ all -> 0x0009 }
            goto L_0x000c
        L_0x0009:
            r6 = move-exception
            goto L_0x0097
        L_0x000c:
            r8 = 1
            if (r7 == 0) goto L_0x0011
            r5.f10232e = r8     // Catch:{ all -> 0x0009 }
        L_0x0011:
            b.p.b.a0.l.a r7 = r5.f10231d     // Catch:{ all -> 0x0009 }
            if (r7 == 0) goto L_0x008e
            if (r6 == 0) goto L_0x0019
            r7.f10246k = r8     // Catch:{ all -> 0x0009 }
        L_0x0019:
            b.p.b.a0.k.i r6 = r5.f10233f     // Catch:{ all -> 0x0009 }
            if (r6 != 0) goto L_0x008e
            boolean r6 = r5.f10232e     // Catch:{ all -> 0x0009 }
            if (r6 != 0) goto L_0x0025
            boolean r6 = r7.f10246k     // Catch:{ all -> 0x0009 }
            if (r6 == 0) goto L_0x008e
        L_0x0025:
            java.util.List<java.lang.ref.Reference<b.p.b.a0.k.p>> r6 = r7.f10245j     // Catch:{ all -> 0x0009 }
            int r6 = r6.size()     // Catch:{ all -> 0x0009 }
            r2 = 0
            r3 = r2
        L_0x002d:
            if (r3 >= r6) goto L_0x0088
            java.util.List<java.lang.ref.Reference<b.p.b.a0.k.p>> r4 = r7.f10245j     // Catch:{ all -> 0x0009 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ all -> 0x0009 }
            java.lang.ref.Reference r4 = (java.lang.ref.Reference) r4     // Catch:{ all -> 0x0009 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x0009 }
            if (r4 != r5) goto L_0x0085
            java.util.List<java.lang.ref.Reference<b.p.b.a0.k.p>> r6 = r7.f10245j     // Catch:{ all -> 0x0009 }
            r6.remove(r3)     // Catch:{ all -> 0x0009 }
            b.p.b.a0.l.a r6 = r5.f10231d     // Catch:{ all -> 0x0009 }
            int r7 = r6.f10242g     // Catch:{ all -> 0x0009 }
            if (r7 <= 0) goto L_0x004a
            r5.f10230c = r1     // Catch:{ all -> 0x0009 }
        L_0x004a:
            java.util.List<java.lang.ref.Reference<b.p.b.a0.k.p>> r6 = r6.f10245j     // Catch:{ all -> 0x0009 }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x0009 }
            if (r6 == 0) goto L_0x0080
            b.p.b.a0.l.a r6 = r5.f10231d     // Catch:{ all -> 0x0009 }
            long r3 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0009 }
            r6.f10247l = r3     // Catch:{ all -> 0x0009 }
            b.p.b.a0.b r6 = p005b.p280p.p285b.p286a0.C5123b.f9930b     // Catch:{ all -> 0x0009 }
            b.p.b.i r7 = r5.f10229b     // Catch:{ all -> 0x0009 }
            b.p.b.a0.l.a r3 = r5.f10231d     // Catch:{ all -> 0x0009 }
            b.p.b.r$a r6 = (p005b.p280p.p285b.C5252r.C5253a) r6     // Catch:{ all -> 0x0009 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ all -> 0x0009 }
            java.util.Objects.requireNonNull(r7)     // Catch:{ all -> 0x0009 }
            boolean r6 = r3.f10246k     // Catch:{ all -> 0x0009 }
            if (r6 != 0) goto L_0x0076
            int r6 = r7.f10392b     // Catch:{ all -> 0x0009 }
            if (r6 != 0) goto L_0x0071
            goto L_0x0076
        L_0x0071:
            r7.notifyAll()     // Catch:{ all -> 0x0009 }
            r8 = r2
            goto L_0x007b
        L_0x0076:
            java.util.Deque<b.p.b.a0.l.a> r6 = r7.f10395e     // Catch:{ all -> 0x0009 }
            r6.remove(r3)     // Catch:{ all -> 0x0009 }
        L_0x007b:
            if (r8 == 0) goto L_0x0080
            b.p.b.a0.l.a r6 = r5.f10231d     // Catch:{ all -> 0x0009 }
            goto L_0x0081
        L_0x0080:
            r6 = r1
        L_0x0081:
            r5.f10231d = r1     // Catch:{ all -> 0x0009 }
            r1 = r6
            goto L_0x008e
        L_0x0085:
            int r3 = r3 + 1
            goto L_0x002d
        L_0x0088:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0009 }
            r6.<init>()     // Catch:{ all -> 0x0009 }
            throw r6     // Catch:{ all -> 0x0009 }
        L_0x008e:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            if (r1 == 0) goto L_0x0096
            java.net.Socket r6 = r1.f10238c
            p005b.p280p.p285b.p286a0.C5134i.m9459d(r6)
        L_0x0096:
            return
        L_0x0097:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p285b.p286a0.p288k.C5211p.mo17112d(boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0188, code lost:
        if (r2.f10238c.isInputShutdown() != false) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0190, code lost:
        if (r2.f10238c.isOutputShutdown() == false) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0195, code lost:
        if (r2.f10241f == null) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0198, code lost:
        if (r21 == false) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        r5 = r2.f10238c.getSoTimeout();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r2.f10238c.setSoTimeout(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01ab, code lost:
        if (r2.f10243h.mo25886D() == false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        r2.f10238c.setSoTimeout(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01b3, code lost:
        r2.f10238c.setSoTimeout(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01b9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01ba, code lost:
        r2.f10238c.setSoTimeout(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01bf, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0135, code lost:
        r13 = r0 instanceof javax.net.ssl.SSLHandshakeException;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0180, code lost:
        if (r2.f10238c.isClosed() != false) goto L_0x01c0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01c4 A[LOOP:0: B:1:0x0002->B:122:0x01c4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01c3 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p005b.p280p.p285b.p286a0.p289l.C5212a mo17113e(int r17, int r18, int r19, boolean r20, boolean r21) {
        /*
            r16 = this;
            r1 = r16
        L_0x0002:
            b.p.b.i r2 = r1.f10229b
            monitor-enter(r2)
            boolean r0 = r1.f10232e     // Catch:{ all -> 0x01ea }
            if (r0 != 0) goto L_0x01e2
            b.p.b.a0.k.i r0 = r1.f10233f     // Catch:{ all -> 0x01ea }
            if (r0 != 0) goto L_0x01da
            b.p.b.a0.l.a r0 = r1.f10231d     // Catch:{ all -> 0x01ea }
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0021
            boolean r5 = r0.f10246k     // Catch:{ all -> 0x01ea }
            if (r5 != 0) goto L_0x0021
        L_0x0017:
            monitor-exit(r2)     // Catch:{ all -> 0x01ea }
            r10 = r17
            r11 = r18
            r12 = r19
            r2 = r0
            goto L_0x0170
        L_0x0021:
            b.p.b.a0.b r0 = p005b.p280p.p285b.p286a0.C5123b.f9930b     // Catch:{ all -> 0x01ea }
            b.p.b.i r5 = r1.f10229b     // Catch:{ all -> 0x01ea }
            b.p.b.a r6 = r1.f10228a     // Catch:{ all -> 0x01ea }
            b.p.b.a0.l.a r0 = r0.mo16967a(r5, r6, r1)     // Catch:{ all -> 0x01ea }
            if (r0 == 0) goto L_0x0030
            r1.f10231d = r0     // Catch:{ all -> 0x01ea }
            goto L_0x0017
        L_0x0030:
            b.p.b.a0.k.n r0 = r1.f10230c     // Catch:{ all -> 0x01ea }
            if (r0 != 0) goto L_0x0048
            b.p.b.a0.k.n r0 = new b.p.b.a0.k.n     // Catch:{ all -> 0x01ea }
            b.p.b.a r5 = r1.f10228a     // Catch:{ all -> 0x01ea }
            b.p.b.a0.b r6 = p005b.p280p.p285b.p286a0.C5123b.f9930b     // Catch:{ all -> 0x01ea }
            b.p.b.i r7 = r1.f10229b     // Catch:{ all -> 0x01ea }
            b.p.b.r$a r6 = (p005b.p280p.p285b.C5252r.C5253a) r6     // Catch:{ all -> 0x01ea }
            java.util.Objects.requireNonNull(r6)     // Catch:{ all -> 0x01ea }
            b.p.b.a0.g r6 = r7.f10396f     // Catch:{ all -> 0x01ea }
            r0.<init>(r5, r6)     // Catch:{ all -> 0x01ea }
            r1.f10230c = r0     // Catch:{ all -> 0x01ea }
        L_0x0048:
            monitor-exit(r2)     // Catch:{ all -> 0x01ea }
            b.p.b.a0.k.n r0 = r1.f10230c
            b.p.b.y r0 = r0.mo17107e()
            b.p.b.a0.l.a r2 = new b.p.b.a0.l.a
            r2.<init>(r0)
            java.util.List<java.lang.ref.Reference<b.p.b.a0.k.p>> r0 = r2.f10245j
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r1)
            r0.add(r5)
            b.p.b.i r5 = r1.f10229b
            monitor-enter(r5)
            b.p.b.a0.b r0 = p005b.p280p.p285b.p286a0.C5123b.f9930b     // Catch:{ all -> 0x01d7 }
            b.p.b.i r6 = r1.f10229b     // Catch:{ all -> 0x01d7 }
            b.p.b.r$a r0 = (p005b.p280p.p285b.C5252r.C5253a) r0     // Catch:{ all -> 0x01d7 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x01d7 }
            java.util.Deque<b.p.b.a0.l.a> r0 = r6.f10395e     // Catch:{ all -> 0x01d7 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x01d7 }
            if (r0 == 0) goto L_0x0079
            java.util.concurrent.Executor r0 = r6.f10391a     // Catch:{ all -> 0x01d7 }
            java.lang.Runnable r7 = r6.f10394d     // Catch:{ all -> 0x01d7 }
            r0.execute(r7)     // Catch:{ all -> 0x01d7 }
        L_0x0079:
            java.util.Deque<b.p.b.a0.l.a> r0 = r6.f10395e     // Catch:{ all -> 0x01d7 }
            r0.add(r2)     // Catch:{ all -> 0x01d7 }
            r1.f10231d = r2     // Catch:{ all -> 0x01d7 }
            monitor-exit(r5)     // Catch:{ all -> 0x01d7 }
            b.p.b.a r0 = r1.f10228a
            java.util.List<b.p.b.j> r0 = r0.f9919f
            b.p.b.s r5 = r2.f10240e
            if (r5 != 0) goto L_0x01cf
            b.p.b.a0.a r5 = new b.p.b.a0.a
            r5.<init>(r0)
            b.p.b.y r6 = r2.f10236a
            java.net.Proxy r7 = r6.f10518b
            b.p.b.a r6 = r6.f10517a
            javax.net.ssl.SSLSocketFactory r8 = r6.f9922i
            if (r8 != 0) goto L_0x00bd
            b.p.b.j r8 = p005b.p280p.p285b.C5235j.f10401h
            boolean r8 = r0.contains(r8)
            if (r8 == 0) goto L_0x00a1
            goto L_0x00bd
        L_0x00a1:
            b.p.b.a0.k.m r2 = new b.p.b.a0.k.m
            java.net.UnknownServiceException r3 = new java.net.UnknownServiceException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "CLEARTEXT communication not supported: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            r2.<init>(r3)
            throw r2
        L_0x00bd:
            r8 = 0
            r9 = r8
        L_0x00bf:
            b.p.b.s r0 = r2.f10240e
            if (r0 != 0) goto L_0x0156
            java.net.Proxy$Type r0 = r7.type()     // Catch:{ IOException -> 0x00ee }
            java.net.Proxy$Type r10 = java.net.Proxy.Type.DIRECT     // Catch:{ IOException -> 0x00ee }
            if (r0 == r10) goto L_0x00da
            java.net.Proxy$Type r0 = r7.type()     // Catch:{ IOException -> 0x00ee }
            java.net.Proxy$Type r10 = java.net.Proxy.Type.HTTP     // Catch:{ IOException -> 0x00ee }
            if (r0 != r10) goto L_0x00d4
            goto L_0x00da
        L_0x00d4:
            java.net.Socket r0 = new java.net.Socket     // Catch:{ IOException -> 0x00ee }
            r0.<init>(r7)     // Catch:{ IOException -> 0x00ee }
            goto L_0x00e0
        L_0x00da:
            javax.net.SocketFactory r0 = r6.f9916c     // Catch:{ IOException -> 0x00ee }
            java.net.Socket r0 = r0.createSocket()     // Catch:{ IOException -> 0x00ee }
        L_0x00e0:
            r2.f10237b = r0     // Catch:{ IOException -> 0x00ee }
            r10 = r17
            r11 = r18
            r12 = r19
            r2.mo17118a(r10, r11, r12, r5)     // Catch:{ IOException -> 0x00ec }
            goto L_0x00bf
        L_0x00ec:
            r0 = move-exception
            goto L_0x00f5
        L_0x00ee:
            r0 = move-exception
            r10 = r17
            r11 = r18
            r12 = r19
        L_0x00f5:
            java.net.Socket r13 = r2.f10238c
            p005b.p280p.p285b.p286a0.C5134i.m9459d(r13)
            java.net.Socket r13 = r2.f10237b
            p005b.p280p.p285b.p286a0.C5134i.m9459d(r13)
            r2.f10238c = r8
            r2.f10237b = r8
            r2.f10243h = r8
            r2.f10244i = r8
            r2.f10239d = r8
            r2.f10240e = r8
            if (r9 != 0) goto L_0x0113
            b.p.b.a0.k.m r9 = new b.p.b.a0.k.m
            r9.<init>(r0)
            goto L_0x0122
        L_0x0113:
            java.io.IOException r13 = r9.f10215g
            java.lang.reflect.Method r14 = p005b.p280p.p285b.p286a0.p288k.C5208m.f10214h
            if (r14 == 0) goto L_0x0120
            java.lang.Object[] r15 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0120 }
            r15[r4] = r13     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0120 }
            r14.invoke(r0, r15)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0120 }
        L_0x0120:
            r9.f10215g = r0
        L_0x0122:
            if (r20 == 0) goto L_0x0155
            r5.f9928d = r3
            boolean r13 = r5.f9927c
            if (r13 != 0) goto L_0x012b
            goto L_0x014e
        L_0x012b:
            boolean r13 = r0 instanceof java.net.ProtocolException
            if (r13 == 0) goto L_0x0130
            goto L_0x014e
        L_0x0130:
            boolean r13 = r0 instanceof java.io.InterruptedIOException
            if (r13 == 0) goto L_0x0135
            goto L_0x014e
        L_0x0135:
            boolean r13 = r0 instanceof javax.net.ssl.SSLHandshakeException
            if (r13 == 0) goto L_0x0142
            java.lang.Throwable r14 = r0.getCause()
            boolean r14 = r14 instanceof java.security.cert.CertificateException
            if (r14 == 0) goto L_0x0142
            goto L_0x014e
        L_0x0142:
            boolean r14 = r0 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r14 == 0) goto L_0x0147
            goto L_0x014e
        L_0x0147:
            if (r13 != 0) goto L_0x0150
            boolean r0 = r0 instanceof javax.net.ssl.SSLProtocolException
            if (r0 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r0 = r4
            goto L_0x0151
        L_0x0150:
            r0 = r3
        L_0x0151:
            if (r0 == 0) goto L_0x0155
            goto L_0x00bf
        L_0x0155:
            throw r9
        L_0x0156:
            r10 = r17
            r11 = r18
            r12 = r19
            b.p.b.a0.b r0 = p005b.p280p.p285b.p286a0.C5123b.f9930b
            b.p.b.i r5 = r1.f10229b
            b.p.b.r$a r0 = (p005b.p280p.p285b.C5252r.C5253a) r0
            java.util.Objects.requireNonNull(r0)
            b.p.b.a0.g r5 = r5.f10396f
            b.p.b.y r0 = r2.f10236a
            monitor-enter(r5)
            java.util.Set<b.p.b.y> r6 = r5.f9950a     // Catch:{ all -> 0x01cc }
            r6.remove(r0)     // Catch:{ all -> 0x01cc }
            monitor-exit(r5)
        L_0x0170:
            b.p.b.i r6 = r1.f10229b
            monitor-enter(r6)
            int r0 = r2.f10242g     // Catch:{ all -> 0x01c9 }
            if (r0 != 0) goto L_0x0179
            monitor-exit(r6)     // Catch:{ all -> 0x01c9 }
            return r2
        L_0x0179:
            monitor-exit(r6)     // Catch:{ all -> 0x01c9 }
            java.net.Socket r0 = r2.f10238c
            boolean r0 = r0.isClosed()
            if (r0 != 0) goto L_0x01c0
            java.net.Socket r0 = r2.f10238c
            boolean r0 = r0.isInputShutdown()
            if (r0 != 0) goto L_0x01c0
            java.net.Socket r0 = r2.f10238c
            boolean r0 = r0.isOutputShutdown()
            if (r0 == 0) goto L_0x0193
            goto L_0x01c0
        L_0x0193:
            b.p.b.a0.j.d r0 = r2.f10241f
            if (r0 == 0) goto L_0x0198
            goto L_0x01c1
        L_0x0198:
            if (r21 == 0) goto L_0x01c1
            java.net.Socket r0 = r2.f10238c     // Catch:{ SocketTimeoutException -> 0x01c1, IOException -> 0x01c0 }
            int r5 = r0.getSoTimeout()     // Catch:{ SocketTimeoutException -> 0x01c1, IOException -> 0x01c0 }
            java.net.Socket r0 = r2.f10238c     // Catch:{ all -> 0x01b9 }
            r0.setSoTimeout(r3)     // Catch:{ all -> 0x01b9 }
            n.g r0 = r2.f10243h     // Catch:{ all -> 0x01b9 }
            boolean r0 = r0.mo25886D()     // Catch:{ all -> 0x01b9 }
            if (r0 == 0) goto L_0x01b3
            java.net.Socket r0 = r2.f10238c     // Catch:{ SocketTimeoutException -> 0x01c1, IOException -> 0x01c0 }
            r0.setSoTimeout(r5)     // Catch:{ SocketTimeoutException -> 0x01c1, IOException -> 0x01c0 }
            goto L_0x01c0
        L_0x01b3:
            java.net.Socket r0 = r2.f10238c     // Catch:{ SocketTimeoutException -> 0x01c1, IOException -> 0x01c0 }
            r0.setSoTimeout(r5)     // Catch:{ SocketTimeoutException -> 0x01c1, IOException -> 0x01c0 }
            goto L_0x01c1
        L_0x01b9:
            r0 = move-exception
            java.net.Socket r6 = r2.f10238c     // Catch:{ SocketTimeoutException -> 0x01c1, IOException -> 0x01c0 }
            r6.setSoTimeout(r5)     // Catch:{ SocketTimeoutException -> 0x01c1, IOException -> 0x01c0 }
            throw r0     // Catch:{ SocketTimeoutException -> 0x01c1, IOException -> 0x01c0 }
        L_0x01c0:
            r3 = r4
        L_0x01c1:
            if (r3 == 0) goto L_0x01c4
            return r2
        L_0x01c4:
            r16.mo17110b()
            goto L_0x0002
        L_0x01c9:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x01c9 }
            throw r0
        L_0x01cc:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x01cf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "already connected"
            r0.<init>(r2)
            throw r0
        L_0x01d7:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x01d7 }
            throw r0
        L_0x01da:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01ea }
            java.lang.String r3 = "stream != null"
            r0.<init>(r3)     // Catch:{ all -> 0x01ea }
            throw r0     // Catch:{ all -> 0x01ea }
        L_0x01e2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01ea }
            java.lang.String r3 = "released"
            r0.<init>(r3)     // Catch:{ all -> 0x01ea }
            throw r0     // Catch:{ all -> 0x01ea }
        L_0x01ea:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01ea }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p285b.p286a0.p288k.C5211p.mo17113e(int, int, int, boolean, boolean):b.p.b.a0.l.a");
    }

    /* renamed from: f */
    public void mo17114f() {
        mo17112d(true, false, false);
    }

    /* renamed from: g */
    public void mo17115g() {
        mo17112d(false, true, false);
    }

    /* renamed from: h */
    public void mo17116h(C5203i iVar) {
        synchronized (this.f10229b) {
            if (iVar != null) {
                if (iVar == this.f10233f) {
                }
            }
            throw new IllegalStateException("expected " + this.f10233f + " but was " + iVar);
        }
        mo17112d(false, false, true);
    }

    public String toString() {
        return this.f10228a.toString();
    }
}
