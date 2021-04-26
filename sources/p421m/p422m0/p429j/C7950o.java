package p421m.p422m0.p429j;

import com.airbnb.lottie.utils.Utils;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;
import p421m.C8022y;
import p421m.p422m0.C7867c;
import p421m.p422m0.p425f.C7875c;
import p435n.C8030a0;
import p435n.C8031b;
import p435n.C8034b0;
import p435n.C8040e;
import p435n.C8064y;

/* renamed from: m.m0.j.o */
public final class C7950o {

    /* renamed from: a */
    public long f15941a;

    /* renamed from: b */
    public long f15942b;

    /* renamed from: c */
    public long f15943c;

    /* renamed from: d */
    public long f15944d;

    /* renamed from: e */
    public final ArrayDeque<C8022y> f15945e;

    /* renamed from: f */
    public boolean f15946f;

    /* renamed from: g */
    public final C7952b f15947g;

    /* renamed from: h */
    public final C7951a f15948h;

    /* renamed from: i */
    public final C7953c f15949i = new C7953c();

    /* renamed from: j */
    public final C7953c f15950j = new C7953c();

    /* renamed from: k */
    public C7922b f15951k;

    /* renamed from: l */
    public IOException f15952l;

    /* renamed from: m */
    public final int f15953m;

    /* renamed from: n */
    public final C7929f f15954n;

    /* renamed from: m.m0.j.o$a */
    public final class C7951a implements C8064y {

        /* renamed from: g */
        public final C8040e f15955g = new C8040e();

        /* renamed from: h */
        public boolean f15956h;

        /* renamed from: i */
        public boolean f15957i;

        public C7951a(boolean z) {
            this.f15957i = z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
            r0 = r14.f15958j;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
            if (r0.f15948h.f15957i != false) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
            if (r14.f15955g.f16140h <= 0) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            r2 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
            if (r2 == false) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
            if (r14.f15955g.f16140h <= 0) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
            mo25730d(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
            if (r1 == false) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
            r0.f15954n.mo25694O(r0.f15953m, true, (p435n.C8040e) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
            r0 = r14.f15958j;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            r14.f15956h = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x004c, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x004d, code lost:
            r14.f15958j.f15954n.f15851F.flush();
            r14.f15958j.mo25718a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x005b, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r14 = this;
                m.m0.j.o r0 = p421m.p422m0.p429j.C7950o.this
                byte[] r1 = p421m.p422m0.C7867c.f15619a
                monitor-enter(r0)
                boolean r1 = r14.f15956h     // Catch:{ all -> 0x005f }
                if (r1 == 0) goto L_0x000b
                monitor-exit(r0)
                return
            L_0x000b:
                m.m0.j.o r1 = p421m.p422m0.p429j.C7950o.this     // Catch:{ all -> 0x005f }
                m.m0.j.b r1 = r1.mo25723f()     // Catch:{ all -> 0x005f }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x0017
                r1 = r3
                goto L_0x0018
            L_0x0017:
                r1 = r2
            L_0x0018:
                monitor-exit(r0)
                m.m0.j.o r0 = p421m.p422m0.p429j.C7950o.this
                m.m0.j.o$a r4 = r0.f15948h
                boolean r4 = r4.f15957i
                if (r4 != 0) goto L_0x0047
                n.e r4 = r14.f15955g
                long r4 = r4.f16140h
                r6 = 0
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 <= 0) goto L_0x002c
                r2 = r3
            L_0x002c:
                if (r2 == 0) goto L_0x003a
            L_0x002e:
                n.e r0 = r14.f15955g
                long r0 = r0.f16140h
                int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r0 <= 0) goto L_0x0047
                r14.mo25730d(r3)
                goto L_0x002e
            L_0x003a:
                if (r1 == 0) goto L_0x0047
                m.m0.j.f r8 = r0.f15954n
                int r9 = r0.f15953m
                r10 = 1
                r11 = 0
                r12 = 0
                r8.mo25694O(r9, r10, r11, r12)
            L_0x0047:
                m.m0.j.o r0 = p421m.p422m0.p429j.C7950o.this
                monitor-enter(r0)
                r14.f15956h = r3     // Catch:{ all -> 0x005c }
                monitor-exit(r0)
                m.m0.j.o r0 = p421m.p422m0.p429j.C7950o.this
                m.m0.j.f r0 = r0.f15954n
                m.m0.j.p r0 = r0.f15851F
                r0.flush()
                m.m0.j.o r0 = p421m.p422m0.p429j.C7950o.this
                r0.mo25718a()
                return
            L_0x005c:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x005f:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p429j.C7950o.C7951a.close():void");
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r12.f15958j.f15950j.mo25732l();
            r12.f15958j.mo25719b();
            r1 = r12.f15958j;
            r10 = java.lang.Math.min(r1.f15944d - r1.f15943c, r12.f15955g.f16140h);
            r1 = r12.f15958j;
            r1.f15943c += r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
            if (r13 == false) goto L_0x005c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
            if (r10 != r12.f15955g.f16140h) goto L_0x005c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
            if (r1.mo25723f() != null) goto L_0x005c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
            r13 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
            r13 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
            r8 = r13;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo25730d(boolean r13) {
            /*
                r12 = this;
                m.m0.j.o r0 = p421m.p422m0.p429j.C7950o.this
                monitor-enter(r0)
                m.m0.j.o r1 = p421m.p422m0.p429j.C7950o.this     // Catch:{ all -> 0x008b }
                m.m0.j.o$c r1 = r1.f15950j     // Catch:{ all -> 0x008b }
                r1.mo25869h()     // Catch:{ all -> 0x008b }
            L_0x000a:
                m.m0.j.o r1 = p421m.p422m0.p429j.C7950o.this     // Catch:{ all -> 0x0082 }
                long r2 = r1.f15943c     // Catch:{ all -> 0x0082 }
                long r4 = r1.f15944d     // Catch:{ all -> 0x0082 }
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 < 0) goto L_0x0028
                boolean r2 = r12.f15957i     // Catch:{ all -> 0x0082 }
                if (r2 != 0) goto L_0x0028
                boolean r2 = r12.f15956h     // Catch:{ all -> 0x0082 }
                if (r2 != 0) goto L_0x0028
                m.m0.j.b r1 = r1.mo25723f()     // Catch:{ all -> 0x0082 }
                if (r1 != 0) goto L_0x0028
                m.m0.j.o r1 = p421m.p422m0.p429j.C7950o.this     // Catch:{ all -> 0x0082 }
                r1.mo25729l()     // Catch:{ all -> 0x0082 }
                goto L_0x000a
            L_0x0028:
                m.m0.j.o r1 = p421m.p422m0.p429j.C7950o.this     // Catch:{ all -> 0x008b }
                m.m0.j.o$c r1 = r1.f15950j     // Catch:{ all -> 0x008b }
                r1.mo25732l()     // Catch:{ all -> 0x008b }
                m.m0.j.o r1 = p421m.p422m0.p429j.C7950o.this     // Catch:{ all -> 0x008b }
                r1.mo25719b()     // Catch:{ all -> 0x008b }
                m.m0.j.o r1 = p421m.p422m0.p429j.C7950o.this     // Catch:{ all -> 0x008b }
                long r2 = r1.f15944d     // Catch:{ all -> 0x008b }
                long r4 = r1.f15943c     // Catch:{ all -> 0x008b }
                long r2 = r2 - r4
                n.e r1 = r12.f15955g     // Catch:{ all -> 0x008b }
                long r4 = r1.f16140h     // Catch:{ all -> 0x008b }
                long r10 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x008b }
                m.m0.j.o r1 = p421m.p422m0.p429j.C7950o.this     // Catch:{ all -> 0x008b }
                long r2 = r1.f15943c     // Catch:{ all -> 0x008b }
                long r2 = r2 + r10
                r1.f15943c = r2     // Catch:{ all -> 0x008b }
                if (r13 == 0) goto L_0x005c
                n.e r13 = r12.f15955g     // Catch:{ all -> 0x008b }
                long r2 = r13.f16140h     // Catch:{ all -> 0x008b }
                int r13 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r13 != 0) goto L_0x005c
                m.m0.j.b r13 = r1.mo25723f()     // Catch:{ all -> 0x008b }
                if (r13 != 0) goto L_0x005c
                r13 = 1
                goto L_0x005d
            L_0x005c:
                r13 = 0
            L_0x005d:
                r8 = r13
                monitor-exit(r0)
                m.m0.j.o r13 = p421m.p422m0.p429j.C7950o.this
                m.m0.j.o$c r13 = r13.f15950j
                r13.mo25869h()
                m.m0.j.o r13 = p421m.p422m0.p429j.C7950o.this     // Catch:{ all -> 0x0079 }
                m.m0.j.f r6 = r13.f15954n     // Catch:{ all -> 0x0079 }
                int r7 = r13.f15953m     // Catch:{ all -> 0x0079 }
                n.e r9 = r12.f15955g     // Catch:{ all -> 0x0079 }
                r6.mo25694O(r7, r8, r9, r10)     // Catch:{ all -> 0x0079 }
                m.m0.j.o r13 = p421m.p422m0.p429j.C7950o.this
                m.m0.j.o$c r13 = r13.f15950j
                r13.mo25732l()
                return
            L_0x0079:
                r13 = move-exception
                m.m0.j.o r0 = p421m.p422m0.p429j.C7950o.this
                m.m0.j.o$c r0 = r0.f15950j
                r0.mo25732l()
                throw r13
            L_0x0082:
                r13 = move-exception
                m.m0.j.o r1 = p421m.p422m0.p429j.C7950o.this     // Catch:{ all -> 0x008b }
                m.m0.j.o$c r1 = r1.f15950j     // Catch:{ all -> 0x008b }
                r1.mo25732l()     // Catch:{ all -> 0x008b }
                throw r13     // Catch:{ all -> 0x008b }
            L_0x008b:
                r13 = move-exception
                monitor-exit(r0)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p429j.C7950o.C7951a.mo25730d(boolean):void");
        }

        /* renamed from: f */
        public C8034b0 mo17028f() {
            return C7950o.this.f15950j;
        }

        public void flush() {
            C7950o oVar = C7950o.this;
            byte[] bArr = C7867c.f15619a;
            synchronized (oVar) {
                C7950o.this.mo25719b();
            }
            while (this.f15955g.f16140h > 0) {
                mo25730d(false);
                C7950o.this.f15954n.f15851F.flush();
            }
        }

        /* renamed from: j */
        public void mo17030j(C8040e eVar, long j) {
            C6888i.m12438e(eVar, "source");
            byte[] bArr = C7867c.f15619a;
            this.f15955g.mo17030j(eVar, j);
            while (this.f15955g.f16140h >= 16384) {
                mo25730d(false);
            }
        }
    }

    /* renamed from: m.m0.j.o$b */
    public final class C7952b implements C8030a0 {

        /* renamed from: g */
        public final C8040e f15959g = new C8040e();

        /* renamed from: h */
        public final C8040e f15960h = new C8040e();

        /* renamed from: i */
        public boolean f15961i;

        /* renamed from: j */
        public final long f15962j;

        /* renamed from: k */
        public boolean f15963k;

        public C7952b(long j, boolean z) {
            this.f15962j = j;
            this.f15963k = z;
        }

        /* renamed from: T */
        public long mo17031T(C8040e eVar, long j) {
            long j2;
            boolean z;
            long j3;
            C8040e eVar2 = eVar;
            long j4 = j;
            C6888i.m12438e(eVar2, "sink");
            long j5 = 0;
            if (j4 >= 0) {
                while (true) {
                    Throwable th = null;
                    synchronized (C7950o.this) {
                        C7950o.this.f15949i.mo25869h();
                        try {
                            if (C7950o.this.mo25723f() != null) {
                                th = C7950o.this.f15952l;
                                if (th == null) {
                                    C7922b f = C7950o.this.mo25723f();
                                    C6888i.m12436c(f);
                                    th = new C7960u(f);
                                }
                            }
                            if (!this.f15961i) {
                                C8040e eVar3 = this.f15960h;
                                long j6 = eVar3.f16140h;
                                if (j6 > j5) {
                                    j3 = eVar3.mo17031T(eVar2, Math.min(j4, j6));
                                    C7950o oVar = C7950o.this;
                                    long j7 = oVar.f15941a + j3;
                                    oVar.f15941a = j7;
                                    long j8 = j7 - oVar.f15942b;
                                    if (th == null && j8 >= ((long) (oVar.f15954n.f15872y.mo25749a() / 2))) {
                                        C7950o oVar2 = C7950o.this;
                                        oVar2.f15954n.mo25700f0(oVar2.f15953m, j8);
                                        C7950o oVar3 = C7950o.this;
                                        oVar3.f15942b = oVar3.f15941a;
                                    }
                                } else if (this.f15963k || th != null) {
                                    j3 = -1;
                                } else {
                                    C7950o.this.mo25729l();
                                    z = true;
                                    j2 = -1;
                                }
                                long j9 = j3;
                                z = false;
                                j2 = j9;
                            } else {
                                throw new IOException("stream closed");
                            }
                        } finally {
                            C7950o.this.f15949i.mo25732l();
                        }
                    }
                    if (z) {
                        j5 = 0;
                    } else if (j2 != -1) {
                        mo25731d(j2);
                        return j2;
                    } else if (th == null) {
                        return -1;
                    } else {
                        C6888i.m12436c(th);
                        throw th;
                    }
                }
            } else {
                throw new IllegalArgumentException(C0843a.m448i("byteCount < 0: ", j4).toString());
            }
        }

        public void close() {
            long j;
            synchronized (C7950o.this) {
                this.f15961i = true;
                C8040e eVar = this.f15960h;
                j = eVar.f16140h;
                eVar.skip(j);
                C7950o oVar = C7950o.this;
                if (oVar != null) {
                    oVar.notifyAll();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
            }
            if (j > 0) {
                mo25731d(j);
            }
            C7950o.this.mo25718a();
        }

        /* renamed from: d */
        public final void mo25731d(long j) {
            C7950o oVar = C7950o.this;
            byte[] bArr = C7867c.f15619a;
            oVar.f15954n.mo25693N(j);
        }

        /* renamed from: f */
        public C8034b0 mo17035f() {
            return C7950o.this.f15949i;
        }
    }

    /* renamed from: m.m0.j.o$c */
    public final class C7953c extends C8031b {
        public C7953c() {
        }

        /* renamed from: j */
        public IOException mo17036j(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* renamed from: k */
        public void mo17037k() {
            C7950o.this.mo25722e(C7922b.CANCEL);
            C7929f fVar = C7950o.this.f15954n;
            synchronized (fVar) {
                long j = fVar.f15869v;
                long j2 = fVar.f15868u;
                if (j >= j2) {
                    fVar.f15868u = j2 + 1;
                    fVar.f15871x = System.nanoTime() + ((long) Utils.SECOND_IN_NANOS);
                    C7875c cVar = fVar.f15862o;
                    String p = C0843a.m455p(new StringBuilder(), fVar.f15857j, " ping");
                    cVar.mo25591c(new C7945l(p, true, p, true, fVar), 0);
                }
            }
        }

        /* renamed from: l */
        public final void mo25732l() {
            if (mo25870i()) {
                throw new SocketTimeoutException("timeout");
            }
        }
    }

    public C7950o(int i, C7929f fVar, boolean z, boolean z2, C8022y yVar) {
        C6888i.m12438e(fVar, "connection");
        this.f15953m = i;
        this.f15954n = fVar;
        this.f15944d = (long) fVar.f15873z.mo25749a();
        ArrayDeque<C8022y> arrayDeque = new ArrayDeque<>();
        this.f15945e = arrayDeque;
        this.f15947g = new C7952b((long) fVar.f15872y.mo25749a(), z2);
        this.f15948h = new C7951a(z);
        if (yVar != null) {
            if (!mo25725h()) {
                arrayDeque.add(yVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!mo25725h()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    /* renamed from: a */
    public final void mo25718a() {
        boolean z;
        boolean i;
        byte[] bArr = C7867c.f15619a;
        synchronized (this) {
            C7952b bVar = this.f15947g;
            if (!bVar.f15963k && bVar.f15961i) {
                C7951a aVar = this.f15948h;
                if (aVar.f15957i || aVar.f15956h) {
                    z = true;
                    i = mo25726i();
                }
            }
            z = false;
            i = mo25726i();
        }
        if (z) {
            mo25720c(C7922b.CANCEL, (IOException) null);
        } else if (!i) {
            this.f15954n.mo25702z(this.f15953m);
        }
    }

    /* renamed from: b */
    public final void mo25719b() {
        C7951a aVar = this.f15948h;
        if (aVar.f15956h) {
            throw new IOException("stream closed");
        } else if (aVar.f15957i) {
            throw new IOException("stream finished");
        } else if (this.f15951k != null) {
            Throwable th = this.f15952l;
            if (th == null) {
                C7922b bVar = this.f15951k;
                C6888i.m12436c(bVar);
                th = new C7960u(bVar);
            }
            throw th;
        }
    }

    /* renamed from: c */
    public final void mo25720c(C7922b bVar, IOException iOException) {
        C6888i.m12438e(bVar, "rstStatusCode");
        if (mo25721d(bVar, iOException)) {
            C7929f fVar = this.f15954n;
            int i = this.f15953m;
            Objects.requireNonNull(fVar);
            C6888i.m12438e(bVar, "statusCode");
            fVar.f15851F.mo25733H(i, bVar);
        }
    }

    /* renamed from: d */
    public final boolean mo25721d(C7922b bVar, IOException iOException) {
        byte[] bArr = C7867c.f15619a;
        synchronized (this) {
            if (this.f15951k != null) {
                return false;
            }
            if (this.f15947g.f15963k && this.f15948h.f15957i) {
                return false;
            }
            this.f15951k = bVar;
            this.f15952l = iOException;
            notifyAll();
            this.f15954n.mo25702z(this.f15953m);
            return true;
        }
    }

    /* renamed from: e */
    public final void mo25722e(C7922b bVar) {
        C6888i.m12438e(bVar, "errorCode");
        if (mo25721d(bVar, (IOException) null)) {
            this.f15954n.mo25696Z(this.f15953m, bVar);
        }
    }

    /* renamed from: f */
    public final synchronized C7922b mo25723f() {
        return this.f15951k;
    }

    /* renamed from: g */
    public final C8064y mo25724g() {
        synchronized (this) {
            if (!(this.f15946f || mo25725h())) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
        }
        return this.f15948h;
    }

    /* renamed from: h */
    public final boolean mo25725h() {
        return this.f15954n.f15854g == ((this.f15953m & 1) == 1);
    }

    /* renamed from: i */
    public final synchronized boolean mo25726i() {
        if (this.f15951k != null) {
            return false;
        }
        C7952b bVar = this.f15947g;
        if (bVar.f15963k || bVar.f15961i) {
            C7951a aVar = this.f15948h;
            if ((aVar.f15957i || aVar.f15956h) && this.f15946f) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25727j(p421m.C8022y r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            p298d.p344x.p346c.C6888i.m12438e(r3, r0)
            byte[] r0 = p421m.p422m0.C7867c.f15619a
            monitor-enter(r2)
            boolean r0 = r2.f15946f     // Catch:{ all -> 0x0035 }
            r1 = 1
            if (r0 == 0) goto L_0x0016
            if (r4 != 0) goto L_0x0010
            goto L_0x0016
        L_0x0010:
            m.m0.j.o$b r3 = r2.f15947g     // Catch:{ all -> 0x0035 }
            java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x0035 }
            goto L_0x001d
        L_0x0016:
            r2.f15946f = r1     // Catch:{ all -> 0x0035 }
            java.util.ArrayDeque<m.y> r0 = r2.f15945e     // Catch:{ all -> 0x0035 }
            r0.add(r3)     // Catch:{ all -> 0x0035 }
        L_0x001d:
            if (r4 == 0) goto L_0x0023
            m.m0.j.o$b r3 = r2.f15947g     // Catch:{ all -> 0x0035 }
            r3.f15963k = r1     // Catch:{ all -> 0x0035 }
        L_0x0023:
            boolean r3 = r2.mo25726i()     // Catch:{ all -> 0x0035 }
            r2.notifyAll()     // Catch:{ all -> 0x0035 }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x0034
            m.m0.j.f r3 = r2.f15954n
            int r4 = r2.f15953m
            r3.mo25702z(r4)
        L_0x0034:
            return
        L_0x0035:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p429j.C7950o.mo25727j(m.y, boolean):void");
    }

    /* renamed from: k */
    public final synchronized void mo25728k(C7922b bVar) {
        C6888i.m12438e(bVar, "errorCode");
        if (this.f15951k == null) {
            this.f15951k = bVar;
            notifyAll();
        }
    }

    /* renamed from: l */
    public final void mo25729l() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
