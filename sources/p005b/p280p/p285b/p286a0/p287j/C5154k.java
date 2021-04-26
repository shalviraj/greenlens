package p005b.p280p.p285b.p286a0.p287j;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p435n.C8030a0;
import p435n.C8031b;
import p435n.C8034b0;
import p435n.C8040e;
import p435n.C8064y;

/* renamed from: b.p.b.a0.j.k */
public final class C5154k {

    /* renamed from: a */
    public long f10038a = 0;

    /* renamed from: b */
    public long f10039b;

    /* renamed from: c */
    public final int f10040c;

    /* renamed from: d */
    public final C5139d f10041d;

    /* renamed from: e */
    public final List<C5159l> f10042e;

    /* renamed from: f */
    public List<C5159l> f10043f;

    /* renamed from: g */
    public final C5157c f10044g;

    /* renamed from: h */
    public final C5156b f10045h;

    /* renamed from: i */
    public final C5158d f10046i = new C5158d();

    /* renamed from: j */
    public final C5158d f10047j = new C5158d();

    /* renamed from: k */
    public C5135a f10048k = null;

    /* renamed from: b.p.b.a0.j.k$b */
    public final class C5156b implements C8064y {

        /* renamed from: g */
        public final C8040e f10049g = new C8040e();

        /* renamed from: h */
        public boolean f10050h;

        /* renamed from: i */
        public boolean f10051i;

        public C5156b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            if (r13.f10049g.f16140h <= 0) goto L_0x0029;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
            if (r13.f10049g.f16140h <= 0) goto L_0x0034;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
            mo17027d(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
            r0.f10041d.mo17003O(r0.f10040c, true, (p435n.C8040e) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
            r1 = r13.f10052j;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r13.f10050h = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
            r13.f10052j.f10041d.f9996x.flush();
            p005b.p280p.p285b.p286a0.p287j.C5154k.m9508a(r13.f10052j);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
            r0 = r13.f10052j;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r0.f10045h.f10051i != false) goto L_0x0034;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() {
            /*
                r13 = this;
                b.p.b.a0.j.k r0 = p005b.p280p.p285b.p286a0.p287j.C5154k.this
                monitor-enter(r0)
                boolean r1 = r13.f10050h     // Catch:{ all -> 0x004c }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x004c }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x004c }
                b.p.b.a0.j.k r0 = p005b.p280p.p285b.p286a0.p287j.C5154k.this
                b.p.b.a0.j.k$b r1 = r0.f10045h
                boolean r1 = r1.f10051i
                r2 = 1
                if (r1 != 0) goto L_0x0034
                n.e r1 = r13.f10049g
                long r3 = r1.f16140h
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 <= 0) goto L_0x0029
            L_0x001d:
                n.e r0 = r13.f10049g
                long r0 = r0.f16140h
                int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r0 <= 0) goto L_0x0034
                r13.mo17027d(r2)
                goto L_0x001d
            L_0x0029:
                b.p.b.a0.j.d r7 = r0.f10041d
                int r8 = r0.f10040c
                r9 = 1
                r10 = 0
                r11 = 0
                r7.mo17003O(r8, r9, r10, r11)
            L_0x0034:
                b.p.b.a0.j.k r1 = p005b.p280p.p285b.p286a0.p287j.C5154k.this
                monitor-enter(r1)
                r13.f10050h = r2     // Catch:{ all -> 0x0049 }
                monitor-exit(r1)     // Catch:{ all -> 0x0049 }
                b.p.b.a0.j.k r0 = p005b.p280p.p285b.p286a0.p287j.C5154k.this
                b.p.b.a0.j.d r0 = r0.f10041d
                b.p.b.a0.j.c r0 = r0.f9996x
                r0.flush()
                b.p.b.a0.j.k r0 = p005b.p280p.p285b.p286a0.p287j.C5154k.this
                p005b.p280p.p285b.p286a0.p287j.C5154k.m9508a(r0)
                return
            L_0x0049:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0049 }
                throw r0
            L_0x004c:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004c }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p285b.p286a0.p287j.C5154k.C5156b.close():void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
            throw new java.io.InterruptedIOException();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r1.f10047j.mo17038l();
            p005b.p280p.p285b.p286a0.p287j.C5154k.m9509b(r11.f10052j);
            r9 = java.lang.Math.min(r11.f10052j.f10039b, r11.f10049g.f16140h);
            r1 = r11.f10052j;
            r1.f10039b -= r9;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0024 */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo17027d(boolean r12) {
            /*
                r11 = this;
                b.p.b.a0.j.k r0 = p005b.p280p.p285b.p286a0.p287j.C5154k.this
                monitor-enter(r0)
                b.p.b.a0.j.k r1 = p005b.p280p.p285b.p286a0.p287j.C5154k.this     // Catch:{ all -> 0x0080 }
                b.p.b.a0.j.k$d r1 = r1.f10047j     // Catch:{ all -> 0x0080 }
                r1.mo25869h()     // Catch:{ all -> 0x0080 }
            L_0x000a:
                b.p.b.a0.j.k r1 = p005b.p280p.p285b.p286a0.p287j.C5154k.this     // Catch:{ all -> 0x0077 }
                long r2 = r1.f10039b     // Catch:{ all -> 0x0077 }
                r4 = 0
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 > 0) goto L_0x002a
                boolean r2 = r11.f10051i     // Catch:{ all -> 0x0077 }
                if (r2 != 0) goto L_0x002a
                boolean r2 = r11.f10050h     // Catch:{ all -> 0x0077 }
                if (r2 != 0) goto L_0x002a
                b.p.b.a0.j.a r2 = r1.f10048k     // Catch:{ all -> 0x0077 }
                if (r2 != 0) goto L_0x002a
                r1.wait()     // Catch:{ InterruptedException -> 0x0024 }
                goto L_0x000a
            L_0x0024:
                java.io.InterruptedIOException r12 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0077 }
                r12.<init>()     // Catch:{ all -> 0x0077 }
                throw r12     // Catch:{ all -> 0x0077 }
            L_0x002a:
                b.p.b.a0.j.k$d r1 = r1.f10047j     // Catch:{ all -> 0x0080 }
                r1.mo17038l()     // Catch:{ all -> 0x0080 }
                b.p.b.a0.j.k r1 = p005b.p280p.p285b.p286a0.p287j.C5154k.this     // Catch:{ all -> 0x0080 }
                p005b.p280p.p285b.p286a0.p287j.C5154k.m9509b(r1)     // Catch:{ all -> 0x0080 }
                b.p.b.a0.j.k r1 = p005b.p280p.p285b.p286a0.p287j.C5154k.this     // Catch:{ all -> 0x0080 }
                long r1 = r1.f10039b     // Catch:{ all -> 0x0080 }
                n.e r3 = r11.f10049g     // Catch:{ all -> 0x0080 }
                long r3 = r3.f16140h     // Catch:{ all -> 0x0080 }
                long r9 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x0080 }
                b.p.b.a0.j.k r1 = p005b.p280p.p285b.p286a0.p287j.C5154k.this     // Catch:{ all -> 0x0080 }
                long r2 = r1.f10039b     // Catch:{ all -> 0x0080 }
                long r2 = r2 - r9
                r1.f10039b = r2     // Catch:{ all -> 0x0080 }
                monitor-exit(r0)     // Catch:{ all -> 0x0080 }
                b.p.b.a0.j.k$d r0 = r1.f10047j
                r0.mo25869h()
                b.p.b.a0.j.k r0 = p005b.p280p.p285b.p286a0.p287j.C5154k.this     // Catch:{ all -> 0x006e }
                b.p.b.a0.j.d r5 = r0.f10041d     // Catch:{ all -> 0x006e }
                int r6 = r0.f10040c     // Catch:{ all -> 0x006e }
                if (r12 == 0) goto L_0x005f
                n.e r12 = r11.f10049g     // Catch:{ all -> 0x006e }
                long r0 = r12.f16140h     // Catch:{ all -> 0x006e }
                int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r12 != 0) goto L_0x005f
                r12 = 1
                goto L_0x0060
            L_0x005f:
                r12 = 0
            L_0x0060:
                r7 = r12
                n.e r8 = r11.f10049g     // Catch:{ all -> 0x006e }
                r5.mo17003O(r6, r7, r8, r9)     // Catch:{ all -> 0x006e }
                b.p.b.a0.j.k r12 = p005b.p280p.p285b.p286a0.p287j.C5154k.this
                b.p.b.a0.j.k$d r12 = r12.f10047j
                r12.mo17038l()
                return
            L_0x006e:
                r12 = move-exception
                b.p.b.a0.j.k r0 = p005b.p280p.p285b.p286a0.p287j.C5154k.this
                b.p.b.a0.j.k$d r0 = r0.f10047j
                r0.mo17038l()
                throw r12
            L_0x0077:
                r12 = move-exception
                b.p.b.a0.j.k r1 = p005b.p280p.p285b.p286a0.p287j.C5154k.this     // Catch:{ all -> 0x0080 }
                b.p.b.a0.j.k$d r1 = r1.f10047j     // Catch:{ all -> 0x0080 }
                r1.mo17038l()     // Catch:{ all -> 0x0080 }
                throw r12     // Catch:{ all -> 0x0080 }
            L_0x0080:
                r12 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0080 }
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p285b.p286a0.p287j.C5154k.C5156b.mo17027d(boolean):void");
        }

        /* renamed from: f */
        public C8034b0 mo17028f() {
            return C5154k.this.f10047j;
        }

        public void flush() {
            synchronized (C5154k.this) {
                C5154k.m9509b(C5154k.this);
            }
            while (this.f10049g.f16140h > 0) {
                mo17027d(false);
                C5154k.this.f10041d.flush();
            }
        }

        /* renamed from: j */
        public void mo17030j(C8040e eVar, long j) {
            this.f10049g.mo17030j(eVar, j);
            while (this.f10049g.f16140h >= 16384) {
                mo17027d(false);
            }
        }
    }

    /* renamed from: b.p.b.a0.j.k$c */
    public final class C5157c implements C8030a0 {

        /* renamed from: g */
        public final C8040e f10053g = new C8040e();

        /* renamed from: h */
        public final C8040e f10054h = new C8040e();

        /* renamed from: i */
        public final long f10055i;

        /* renamed from: j */
        public boolean f10056j;

        /* renamed from: k */
        public boolean f10057k;

        public C5157c(long j, C5155a aVar) {
            this.f10055i = j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
            r11 = r8.f10058l.f10041d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
            monitor-enter(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r2 = r8.f10058l.f10041d;
            r3 = r2.f9989q + r9;
            r2.f9989q = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
            if (r3 < ((long) (r2.f9991s.mo17063b(65536) / 2))) goto L_0x0076;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
            r2 = r8.f10058l.f10041d;
            r2.mo17005Z(0, r2.f9989q);
            r8.f10058l.f10041d.f9989q = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0076, code lost:
            monitor-exit(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
            return r9;
         */
        /* renamed from: T */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo17031T(p435n.C8040e r9, long r10) {
            /*
                r8 = this;
                r0 = 0
                int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r2 < 0) goto L_0x007e
                b.p.b.a0.j.k r2 = p005b.p280p.p285b.p286a0.p287j.C5154k.this
                monitor-enter(r2)
                r8.mo17034e()     // Catch:{ all -> 0x007b }
                r8.mo17033d()     // Catch:{ all -> 0x007b }
                n.e r3 = r8.f10054h     // Catch:{ all -> 0x007b }
                long r4 = r3.f16140h     // Catch:{ all -> 0x007b }
                int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r6 != 0) goto L_0x001b
                r9 = -1
                monitor-exit(r2)     // Catch:{ all -> 0x007b }
                return r9
            L_0x001b:
                long r10 = java.lang.Math.min(r10, r4)     // Catch:{ all -> 0x007b }
                long r9 = r3.mo17031T(r9, r10)     // Catch:{ all -> 0x007b }
                b.p.b.a0.j.k r11 = p005b.p280p.p285b.p286a0.p287j.C5154k.this     // Catch:{ all -> 0x007b }
                long r3 = r11.f10038a     // Catch:{ all -> 0x007b }
                long r3 = r3 + r9
                r11.f10038a = r3     // Catch:{ all -> 0x007b }
                b.p.b.a0.j.d r11 = r11.f10041d     // Catch:{ all -> 0x007b }
                b.p.b.a0.j.t r11 = r11.f9991s     // Catch:{ all -> 0x007b }
                r5 = 65536(0x10000, float:9.18355E-41)
                int r11 = r11.mo17063b(r5)     // Catch:{ all -> 0x007b }
                int r11 = r11 / 2
                long r6 = (long) r11     // Catch:{ all -> 0x007b }
                int r11 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r11 < 0) goto L_0x004a
                b.p.b.a0.j.k r11 = p005b.p280p.p285b.p286a0.p287j.C5154k.this     // Catch:{ all -> 0x007b }
                b.p.b.a0.j.d r3 = r11.f10041d     // Catch:{ all -> 0x007b }
                int r4 = r11.f10040c     // Catch:{ all -> 0x007b }
                long r6 = r11.f10038a     // Catch:{ all -> 0x007b }
                r3.mo17005Z(r4, r6)     // Catch:{ all -> 0x007b }
                b.p.b.a0.j.k r11 = p005b.p280p.p285b.p286a0.p287j.C5154k.this     // Catch:{ all -> 0x007b }
                r11.f10038a = r0     // Catch:{ all -> 0x007b }
            L_0x004a:
                monitor-exit(r2)     // Catch:{ all -> 0x007b }
                b.p.b.a0.j.k r11 = p005b.p280p.p285b.p286a0.p287j.C5154k.this
                b.p.b.a0.j.d r11 = r11.f10041d
                monitor-enter(r11)
                b.p.b.a0.j.k r2 = p005b.p280p.p285b.p286a0.p287j.C5154k.this     // Catch:{ all -> 0x0078 }
                b.p.b.a0.j.d r2 = r2.f10041d     // Catch:{ all -> 0x0078 }
                long r3 = r2.f9989q     // Catch:{ all -> 0x0078 }
                long r3 = r3 + r9
                r2.f9989q = r3     // Catch:{ all -> 0x0078 }
                b.p.b.a0.j.t r2 = r2.f9991s     // Catch:{ all -> 0x0078 }
                int r2 = r2.mo17063b(r5)     // Catch:{ all -> 0x0078 }
                int r2 = r2 / 2
                long r5 = (long) r2     // Catch:{ all -> 0x0078 }
                int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r2 < 0) goto L_0x0076
                b.p.b.a0.j.k r2 = p005b.p280p.p285b.p286a0.p287j.C5154k.this     // Catch:{ all -> 0x0078 }
                b.p.b.a0.j.d r2 = r2.f10041d     // Catch:{ all -> 0x0078 }
                r3 = 0
                long r4 = r2.f9989q     // Catch:{ all -> 0x0078 }
                r2.mo17005Z(r3, r4)     // Catch:{ all -> 0x0078 }
                b.p.b.a0.j.k r2 = p005b.p280p.p285b.p286a0.p287j.C5154k.this     // Catch:{ all -> 0x0078 }
                b.p.b.a0.j.d r2 = r2.f10041d     // Catch:{ all -> 0x0078 }
                r2.f9989q = r0     // Catch:{ all -> 0x0078 }
            L_0x0076:
                monitor-exit(r11)     // Catch:{ all -> 0x0078 }
                return r9
            L_0x0078:
                r9 = move-exception
                monitor-exit(r11)     // Catch:{ all -> 0x0078 }
                throw r9
            L_0x007b:
                r9 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x007b }
                throw r9
            L_0x007e:
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "byteCount < 0: "
                java.lang.String r10 = p005b.p035e.p036a.p037a.C0843a.m448i(r0, r10)
                r9.<init>(r10)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p285b.p286a0.p287j.C5154k.C5157c.mo17031T(n.e, long):long");
        }

        public void close() {
            synchronized (C5154k.this) {
                this.f10056j = true;
                C8040e eVar = this.f10054h;
                eVar.skip(eVar.f16140h);
                C5154k.this.notifyAll();
            }
            C5154k.m9508a(C5154k.this);
        }

        /* renamed from: d */
        public final void mo17033d() {
            if (this.f10056j) {
                throw new IOException("stream closed");
            } else if (C5154k.this.f10048k != null) {
                StringBuilder u = C0843a.m460u("stream was reset: ");
                u.append(C5154k.this.f10048k);
                throw new IOException(u.toString());
            }
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0023 */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo17034e() {
            /*
                r4 = this;
                b.p.b.a0.j.k r0 = p005b.p280p.p285b.p286a0.p287j.C5154k.this
                b.p.b.a0.j.k$d r0 = r0.f10046i
                r0.mo25869h()
            L_0x0007:
                n.e r0 = r4.f10054h     // Catch:{ all -> 0x0031 }
                long r0 = r0.f16140h     // Catch:{ all -> 0x0031 }
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L_0x0029
                boolean r0 = r4.f10057k     // Catch:{ all -> 0x0031 }
                if (r0 != 0) goto L_0x0029
                boolean r0 = r4.f10056j     // Catch:{ all -> 0x0031 }
                if (r0 != 0) goto L_0x0029
                b.p.b.a0.j.k r0 = p005b.p280p.p285b.p286a0.p287j.C5154k.this     // Catch:{ all -> 0x0031 }
                b.p.b.a0.j.a r1 = r0.f10048k     // Catch:{ all -> 0x0031 }
                if (r1 != 0) goto L_0x0029
                r0.wait()     // Catch:{ InterruptedException -> 0x0023 }
                goto L_0x0007
            L_0x0023:
                java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0031 }
                r0.<init>()     // Catch:{ all -> 0x0031 }
                throw r0     // Catch:{ all -> 0x0031 }
            L_0x0029:
                b.p.b.a0.j.k r0 = p005b.p280p.p285b.p286a0.p287j.C5154k.this
                b.p.b.a0.j.k$d r0 = r0.f10046i
                r0.mo17038l()
                return
            L_0x0031:
                r0 = move-exception
                b.p.b.a0.j.k r1 = p005b.p280p.p285b.p286a0.p287j.C5154k.this
                b.p.b.a0.j.k$d r1 = r1.f10046i
                r1.mo17038l()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p285b.p286a0.p287j.C5154k.C5157c.mo17034e():void");
        }

        /* renamed from: f */
        public C8034b0 mo17035f() {
            return C5154k.this.f10046i;
        }
    }

    /* renamed from: b.p.b.a0.j.k$d */
    public class C5158d extends C8031b {
        public C5158d() {
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
            C5154k.this.mo17020e(C5135a.CANCEL);
        }

        /* renamed from: l */
        public void mo17038l() {
            if (mo25870i()) {
                throw new SocketTimeoutException("timeout");
            }
        }
    }

    public C5154k(int i, C5139d dVar, boolean z, boolean z2, List<C5159l> list) {
        Objects.requireNonNull(dVar, "connection == null");
        Objects.requireNonNull(list, "requestHeaders == null");
        this.f10040c = i;
        this.f10041d = dVar;
        this.f10039b = (long) dVar.f9992t.mo17063b(65536);
        C5157c cVar = new C5157c((long) dVar.f9991s.mo17063b(65536), (C5155a) null);
        this.f10044g = cVar;
        C5156b bVar = new C5156b();
        this.f10045h = bVar;
        cVar.f10057k = z2;
        bVar.f10051i = z;
        this.f10042e = list;
    }

    /* renamed from: a */
    public static void m9508a(C5154k kVar) {
        boolean z;
        boolean i;
        synchronized (kVar) {
            C5157c cVar = kVar.f10044g;
            if (!cVar.f10057k && cVar.f10056j) {
                C5156b bVar = kVar.f10045h;
                if (bVar.f10051i || bVar.f10050h) {
                    z = true;
                    i = kVar.mo17024i();
                }
            }
            z = false;
            i = kVar.mo17024i();
        }
        if (z) {
            kVar.mo17018c(C5135a.CANCEL);
        } else if (!i) {
            kVar.f10041d.mo17010z(kVar.f10040c);
        }
    }

    /* renamed from: b */
    public static void m9509b(C5154k kVar) {
        C5156b bVar = kVar.f10045h;
        if (bVar.f10050h) {
            throw new IOException("stream closed");
        } else if (bVar.f10051i) {
            throw new IOException("stream finished");
        } else if (kVar.f10048k != null) {
            StringBuilder u = C0843a.m460u("stream was reset: ");
            u.append(kVar.f10048k);
            throw new IOException(u.toString());
        }
    }

    /* renamed from: c */
    public void mo17018c(C5135a aVar) {
        if (mo17019d(aVar)) {
            C5139d dVar = this.f10041d;
            dVar.f9996x.mo16999s(this.f10040c, aVar);
        }
    }

    /* renamed from: d */
    public final boolean mo17019d(C5135a aVar) {
        synchronized (this) {
            if (this.f10048k != null) {
                return false;
            }
            if (this.f10044g.f10057k && this.f10045h.f10051i) {
                return false;
            }
            this.f10048k = aVar;
            notifyAll();
            this.f10041d.mo17010z(this.f10040c);
            return true;
        }
    }

    /* renamed from: e */
    public void mo17020e(C5135a aVar) {
        if (mo17019d(aVar)) {
            this.f10041d.mo17004S(this.f10040c, aVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        r3.f10046i.mo17038l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0012 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<p005b.p280p.p285b.p286a0.p287j.C5159l> mo17021f() {
        /*
            r3 = this;
            monitor-enter(r3)
            b.p.b.a0.j.k$d r0 = r3.f10046i     // Catch:{ all -> 0x0043 }
            r0.mo25869h()     // Catch:{ all -> 0x0043 }
        L_0x0006:
            java.util.List<b.p.b.a0.j.l> r0 = r3.f10043f     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x0018
            b.p.b.a0.j.a r0 = r3.f10048k     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x0018
            r3.wait()     // Catch:{ InterruptedException -> 0x0012 }
            goto L_0x0006
        L_0x0012:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x003c }
            r0.<init>()     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x0018:
            b.p.b.a0.j.k$d r0 = r3.f10046i     // Catch:{ all -> 0x0043 }
            r0.mo17038l()     // Catch:{ all -> 0x0043 }
            java.util.List<b.p.b.a0.j.l> r0 = r3.f10043f     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0023
            monitor-exit(r3)
            return r0
        L_0x0023:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0043 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0043 }
            r1.<init>()     // Catch:{ all -> 0x0043 }
            java.lang.String r2 = "stream was reset: "
            r1.append(r2)     // Catch:{ all -> 0x0043 }
            b.p.b.a0.j.a r2 = r3.f10048k     // Catch:{ all -> 0x0043 }
            r1.append(r2)     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0043 }
            r0.<init>(r1)     // Catch:{ all -> 0x0043 }
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x003c:
            r0 = move-exception
            b.p.b.a0.j.k$d r1 = r3.f10046i     // Catch:{ all -> 0x0043 }
            r1.mo17038l()     // Catch:{ all -> 0x0043 }
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p285b.p286a0.p287j.C5154k.mo17021f():java.util.List");
    }

    /* renamed from: g */
    public C8064y mo17022g() {
        synchronized (this) {
            if (this.f10043f == null) {
                if (!mo17023h()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f10045h;
    }

    /* renamed from: h */
    public boolean mo17023h() {
        return this.f10041d.f9980h == ((this.f10040c & 1) == 1);
    }

    /* renamed from: i */
    public synchronized boolean mo17024i() {
        if (this.f10048k != null) {
            return false;
        }
        C5157c cVar = this.f10044g;
        if (cVar.f10057k || cVar.f10056j) {
            C5156b bVar = this.f10045h;
            if ((bVar.f10051i || bVar.f10050h) && this.f10043f != null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public void mo17025j() {
        boolean i;
        synchronized (this) {
            this.f10044g.f10057k = true;
            i = mo17024i();
            notifyAll();
        }
        if (!i) {
            this.f10041d.mo17010z(this.f10040c);
        }
    }
}
