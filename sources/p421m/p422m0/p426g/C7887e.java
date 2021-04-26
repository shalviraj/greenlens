package p421m.p422m0.p426g;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p298d.p344x.p346c.C6888i;
import p421m.C7831c0;
import p421m.C7839e0;
import p421m.C7841f;
import p421m.C7843g;
import p421m.C7850h0;
import p421m.C8011r;
import p421m.C8014u;
import p421m.p422m0.C7867c;
import p421m.p422m0.p430k.C7976h;
import p435n.C8031b;

/* renamed from: m.m0.g.e */
public final class C7887e implements C7841f {

    /* renamed from: g */
    public final C7895j f15686g;

    /* renamed from: h */
    public final C8014u f15687h;

    /* renamed from: i */
    public final C7890c f15688i;

    /* renamed from: j */
    public final AtomicBoolean f15689j = new AtomicBoolean();

    /* renamed from: k */
    public Object f15690k;

    /* renamed from: l */
    public C7886d f15691l;

    /* renamed from: m */
    public C7894i f15692m;

    /* renamed from: n */
    public boolean f15693n;

    /* renamed from: o */
    public C7883c f15694o;

    /* renamed from: p */
    public boolean f15695p;

    /* renamed from: q */
    public boolean f15696q;

    /* renamed from: r */
    public boolean f15697r = true;

    /* renamed from: s */
    public volatile boolean f15698s;

    /* renamed from: t */
    public volatile C7883c f15699t;

    /* renamed from: u */
    public volatile C7894i f15700u;

    /* renamed from: v */
    public final C7831c0 f15701v;

    /* renamed from: w */
    public final C7839e0 f15702w;

    /* renamed from: x */
    public final boolean f15703x;

    /* renamed from: m.m0.g.e$a */
    public final class C7888a implements Runnable {

        /* renamed from: g */
        public volatile AtomicInteger f15704g = new AtomicInteger(0);

        /* renamed from: h */
        public final C7843g f15705h;

        /* renamed from: i */
        public final /* synthetic */ C7887e f15706i;

        public C7888a(C7887e eVar, C7843g gVar) {
            C6888i.m12438e(gVar, "responseCallback");
            this.f15706i = eVar;
            this.f15705h = gVar;
        }

        /* renamed from: a */
        public final String mo25629a() {
            return this.f15706i.f15702w.f15528b.f16106e;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0054 A[Catch:{ all -> 0x0075, all -> 0x00b7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x007a A[Catch:{ all -> 0x0075, all -> 0x00b7 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x009a A[Catch:{ all -> 0x0075, all -> 0x00b7 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                java.lang.String r0 = "OkHttp "
                java.lang.StringBuilder r0 = p005b.p035e.p036a.p037a.C0843a.m460u(r0)
                m.m0.g.e r1 = r7.f15706i
                m.e0 r1 = r1.f15702w
                m.z r1 = r1.f15528b
                java.lang.String r1 = r1.mo25857f()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                java.lang.String r2 = "currentThread"
                p298d.p344x.p346c.C6888i.m12437d(r1, r2)
                java.lang.String r2 = r1.getName()
                r1.setName(r0)
                m.m0.g.e r0 = r7.f15706i     // Catch:{ all -> 0x00b7 }
                m.m0.g.e$c r0 = r0.f15688i     // Catch:{ all -> 0x00b7 }
                r0.mo25869h()     // Catch:{ all -> 0x00b7 }
                r0 = 0
                m.m0.g.e r3 = r7.f15706i     // Catch:{ IOException -> 0x0077, all -> 0x004c }
                m.h0 r0 = r3.mo25625j()     // Catch:{ IOException -> 0x0077, all -> 0x004c }
                r3 = 1
                m.g r4 = r7.f15705h     // Catch:{ IOException -> 0x0047, all -> 0x0042 }
                m.m0.g.e r5 = r7.f15706i     // Catch:{ IOException -> 0x0047, all -> 0x0042 }
                r4.mo10629a(r5, r0)     // Catch:{ IOException -> 0x0047, all -> 0x0042 }
                m.m0.g.e r0 = r7.f15706i     // Catch:{ all -> 0x00b7 }
            L_0x003f:
                m.c0 r0 = r0.f15701v     // Catch:{ all -> 0x00b7 }
                goto L_0x00a4
            L_0x0042:
                r0 = move-exception
                r6 = r3
                r3 = r0
                r0 = r6
                goto L_0x004d
            L_0x0047:
                r0 = move-exception
                r6 = r3
                r3 = r0
                r0 = r6
                goto L_0x0078
            L_0x004c:
                r3 = move-exception
            L_0x004d:
                m.m0.g.e r4 = r7.f15706i     // Catch:{ all -> 0x0075 }
                r4.mo25621f()     // Catch:{ all -> 0x0075 }
                if (r0 != 0) goto L_0x0074
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0075 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
                r4.<init>()     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = "canceled due to "
                r4.append(r5)     // Catch:{ all -> 0x0075 }
                r4.append(r3)     // Catch:{ all -> 0x0075 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0075 }
                r0.<init>(r4)     // Catch:{ all -> 0x0075 }
                p005b.p291q.p292a.C5266a.m10007p(r0, r3)     // Catch:{ all -> 0x0075 }
                m.g r4 = r7.f15705h     // Catch:{ all -> 0x0075 }
                m.m0.g.e r5 = r7.f15706i     // Catch:{ all -> 0x0075 }
                r4.mo10630b(r5, r0)     // Catch:{ all -> 0x0075 }
            L_0x0074:
                throw r3     // Catch:{ all -> 0x0075 }
            L_0x0075:
                r0 = move-exception
                goto L_0x00ad
            L_0x0077:
                r3 = move-exception
            L_0x0078:
                if (r0 == 0) goto L_0x009a
                m.m0.k.h$a r0 = p421m.p422m0.p430k.C7976h.f16015c     // Catch:{ all -> 0x0075 }
                m.m0.k.h r0 = p421m.p422m0.p430k.C7976h.f16013a     // Catch:{ all -> 0x0075 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
                r4.<init>()     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = "Callback failure for "
                r4.append(r5)     // Catch:{ all -> 0x0075 }
                m.m0.g.e r5 = r7.f15706i     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = p421m.p422m0.p426g.C7887e.m14346a(r5)     // Catch:{ all -> 0x0075 }
                r4.append(r5)     // Catch:{ all -> 0x0075 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0075 }
                r5 = 4
                r0.mo25771i(r4, r5, r3)     // Catch:{ all -> 0x0075 }
                goto L_0x00a1
            L_0x009a:
                m.g r0 = r7.f15705h     // Catch:{ all -> 0x0075 }
                m.m0.g.e r4 = r7.f15706i     // Catch:{ all -> 0x0075 }
                r0.mo10630b(r4, r3)     // Catch:{ all -> 0x0075 }
            L_0x00a1:
                m.m0.g.e r0 = r7.f15706i     // Catch:{ all -> 0x00b7 }
                goto L_0x003f
            L_0x00a4:
                m.r r0 = r0.f15460g     // Catch:{ all -> 0x00b7 }
                r0.mo25823c(r7)     // Catch:{ all -> 0x00b7 }
                r1.setName(r2)
                return
            L_0x00ad:
                m.m0.g.e r3 = r7.f15706i     // Catch:{ all -> 0x00b7 }
                m.c0 r3 = r3.f15701v     // Catch:{ all -> 0x00b7 }
                m.r r3 = r3.f15460g     // Catch:{ all -> 0x00b7 }
                r3.mo25823c(r7)     // Catch:{ all -> 0x00b7 }
                throw r0     // Catch:{ all -> 0x00b7 }
            L_0x00b7:
                r0 = move-exception
                r1.setName(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p426g.C7887e.C7888a.run():void");
        }
    }

    /* renamed from: m.m0.g.e$b */
    public static final class C7889b extends WeakReference<C7887e> {

        /* renamed from: a */
        public final Object f15707a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7889b(C7887e eVar, Object obj) {
            super(eVar);
            C6888i.m12438e(eVar, "referent");
            this.f15707a = obj;
        }
    }

    /* renamed from: m.m0.g.e$c */
    public static final class C7890c extends C8031b {

        /* renamed from: l */
        public final /* synthetic */ C7887e f15708l;

        public C7890c(C7887e eVar) {
            this.f15708l = eVar;
        }

        /* renamed from: k */
        public void mo17037k() {
            this.f15708l.mo25621f();
        }
    }

    public C7887e(C7831c0 c0Var, C7839e0 e0Var, boolean z) {
        C6888i.m12438e(c0Var, "client");
        C6888i.m12438e(e0Var, "originalRequest");
        this.f15701v = c0Var;
        this.f15702w = e0Var;
        this.f15703x = z;
        this.f15686g = c0Var.f15461h.f15615a;
        this.f15687h = c0Var.f15464k.mo25582a(this);
        C7890c cVar = new C7890c(this);
        cVar.mo25879g((long) 0, TimeUnit.MILLISECONDS);
        this.f15688i = cVar;
    }

    /* renamed from: a */
    public static final String m14346a(C7887e eVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(eVar.f15698s ? "canceled " : "");
        sb.append(eVar.f15703x ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(eVar.f15702w.f15528b.mo25857f());
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo25617b(C7894i iVar) {
        C6888i.m12438e(iVar, "connection");
        byte[] bArr = C7867c.f15619a;
        if (this.f15692m == null) {
            this.f15692m = iVar;
            iVar.f15727o.add(new C7889b(this, this.f15690k));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: c */
    public final <E extends IOException> E mo25618c(E e) {
        E e2;
        Socket m;
        byte[] bArr = C7867c.f15619a;
        C7894i iVar = this.f15692m;
        if (iVar != null) {
            synchronized (iVar) {
                m = mo25628m();
            }
            if (this.f15692m == null) {
                if (m != null) {
                    C7867c.m14284e(m);
                }
                Objects.requireNonNull(this.f15687h);
                C6888i.m12438e(this, NotificationCompat.CATEGORY_CALL);
                C6888i.m12438e(iVar, "connection");
            } else {
                if (!(m == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (!this.f15693n && this.f15688i.mo25870i()) {
            e2 = new InterruptedIOException("timeout");
            if (e != null) {
                e2.initCause(e);
            }
        } else {
            e2 = e;
        }
        if (e != null) {
            C8014u uVar = this.f15687h;
            C6888i.m12436c(e2);
            Objects.requireNonNull(uVar);
            C6888i.m12438e(this, NotificationCompat.CATEGORY_CALL);
            C6888i.m12438e(e2, "ioe");
        } else {
            Objects.requireNonNull(this.f15687h);
            C6888i.m12438e(this, NotificationCompat.CATEGORY_CALL);
        }
        return e2;
    }

    public Object clone() {
        return new C7887e(this.f15701v, this.f15702w, this.f15703x);
    }

    /* renamed from: d */
    public final void mo25620d() {
        C7976h.C7977a aVar = C7976h.f16015c;
        this.f15690k = C7976h.f16013a.mo25759g("response.body().close()");
        Objects.requireNonNull(this.f15687h);
        C6888i.m12438e(this, NotificationCompat.CATEGORY_CALL);
    }

    /* renamed from: f */
    public void mo25621f() {
        Socket socket;
        if (!this.f15698s) {
            this.f15698s = true;
            C7883c cVar = this.f15699t;
            if (cVar != null) {
                cVar.f15664f.cancel();
            }
            C7894i iVar = this.f15700u;
            if (!(iVar == null || (socket = iVar.f15714b) == null)) {
                C7867c.m14284e(socket);
            }
            Objects.requireNonNull(this.f15687h);
            C6888i.m12438e(this, NotificationCompat.CATEGORY_CALL);
        }
    }

    /* renamed from: g */
    public void mo25622g(C7843g gVar) {
        C7888a aVar;
        C6888i.m12438e(gVar, "responseCallback");
        if (this.f15689j.compareAndSet(false, true)) {
            mo25620d();
            C8011r rVar = this.f15701v.f15460g;
            C7888a aVar2 = new C7888a(this, gVar);
            Objects.requireNonNull(rVar);
            C6888i.m12438e(aVar2, NotificationCompat.CATEGORY_CALL);
            synchronized (rVar) {
                rVar.f16080b.add(aVar2);
                if (!aVar2.f15706i.f15703x) {
                    String a = aVar2.mo25629a();
                    Iterator<C7888a> it = rVar.f16081c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator<C7888a> it2 = rVar.f16080b.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    aVar = null;
                                    break;
                                }
                                aVar = it2.next();
                                if (C6888i.m12434a(aVar.mo25629a(), a)) {
                                    break;
                                }
                            }
                        } else {
                            aVar = it.next();
                            if (C6888i.m12434a(aVar.mo25629a(), a)) {
                                break;
                            }
                        }
                    }
                    if (aVar != null) {
                        C6888i.m12438e(aVar, "other");
                        aVar2.f15704g = aVar.f15704g;
                    }
                }
            }
            rVar.mo25824d();
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    /* renamed from: h */
    public C7850h0 mo25623h() {
        if (this.f15689j.compareAndSet(false, true)) {
            this.f15688i.mo25869h();
            mo25620d();
            try {
                C8011r rVar = this.f15701v.f15460g;
                synchronized (rVar) {
                    C6888i.m12438e(this, NotificationCompat.CATEGORY_CALL);
                    rVar.f16082d.add(this);
                }
                C7850h0 j = mo25625j();
                C8011r rVar2 = this.f15701v.f15460g;
                Objects.requireNonNull(rVar2);
                C6888i.m12438e(this, NotificationCompat.CATEGORY_CALL);
                rVar2.mo25822b(rVar2.f16082d, this);
                return j;
            } catch (Throwable th) {
                C8011r rVar3 = this.f15701v.f15460g;
                Objects.requireNonNull(rVar3);
                C6888i.m12438e(this, NotificationCompat.CATEGORY_CALL);
                rVar3.mo25822b(rVar3.f16082d, this);
                throw th;
            }
        } else {
            throw new IllegalStateException("Already Executed".toString());
        }
    }

    /* renamed from: i */
    public final void mo25624i(boolean z) {
        C7883c cVar;
        synchronized (this) {
            if (!this.f15697r) {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (cVar = this.f15699t) != null) {
            cVar.f15664f.cancel();
            cVar.f15661c.mo25626k(cVar, true, true, (IOException) null);
        }
        this.f15694o = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0090  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p421m.C7850h0 mo25625j() {
        /*
            r11 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            m.c0 r0 = r11.f15701v
            java.util.List<m.a0> r0 = r0.f15462i
            p298d.p334t.C6790h.m12342b(r2, r0)
            m.m0.h.i r0 = new m.m0.h.i
            m.c0 r1 = r11.f15701v
            r0.<init>(r1)
            r2.add(r0)
            m.m0.h.a r0 = new m.m0.h.a
            m.c0 r1 = r11.f15701v
            m.q r1 = r1.f15469p
            r0.<init>(r1)
            r2.add(r0)
            m.m0.e.a r0 = new m.m0.e.a
            m.c0 r1 = r11.f15701v
            java.util.Objects.requireNonNull(r1)
            r0.<init>()
            r2.add(r0)
            m.m0.g.a r0 = p421m.p422m0.p426g.C7881a.f15654a
            r2.add(r0)
            boolean r0 = r11.f15703x
            if (r0 != 0) goto L_0x003f
            m.c0 r0 = r11.f15701v
            java.util.List<m.a0> r0 = r0.f15463j
            p298d.p334t.C6790h.m12342b(r2, r0)
        L_0x003f:
            m.m0.h.b r0 = new m.m0.h.b
            boolean r1 = r11.f15703x
            r0.<init>(r1)
            r2.add(r0)
            m.m0.h.g r9 = new m.m0.h.g
            r3 = 0
            r4 = 0
            m.e0 r5 = r11.f15702w
            m.c0 r0 = r11.f15701v
            int r6 = r0.f15456B
            int r7 = r0.f15457C
            int r8 = r0.f15458D
            r0 = r9
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            m.e0 r2 = r11.f15702w     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
            m.h0 r2 = r9.mo25663c(r2)     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
            boolean r3 = r11.f15698s     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
            if (r3 != 0) goto L_0x006c
            r11.mo25627l(r1)
            return r2
        L_0x006c:
            p421m.p422m0.C7867c.m14283d(r2)     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
            throw r2     // Catch:{ IOException -> 0x0079, all -> 0x0077 }
        L_0x0077:
            r2 = move-exception
            goto L_0x008e
        L_0x0079:
            r0 = move-exception
            r2 = 1
            java.io.IOException r0 = r11.mo25627l(r0)     // Catch:{ all -> 0x008a }
            if (r0 != 0) goto L_0x0089
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x008a }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r3)     // Catch:{ all -> 0x008a }
            throw r0     // Catch:{ all -> 0x008a }
        L_0x0089:
            throw r0     // Catch:{ all -> 0x008a }
        L_0x008a:
            r0 = move-exception
            r10 = r2
            r2 = r0
            r0 = r10
        L_0x008e:
            if (r0 != 0) goto L_0x0093
            r11.mo25627l(r1)
        L_0x0093:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p426g.C7887e.mo25625j():m.h0");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0031 A[Catch:{ all -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0033 A[Catch:{ all -> 0x0019 }] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E extends java.io.IOException> E mo25626k(p421m.p422m0.p426g.C7883c r3, boolean r4, boolean r5, E r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            p298d.p344x.p346c.C6888i.m12438e(r3, r0)
            m.m0.g.c r0 = r2.f15699t
            boolean r3 = p298d.p344x.p346c.C6888i.m12434a(r3, r0)
            r0 = 1
            r3 = r3 ^ r0
            if (r3 == 0) goto L_0x0010
            return r6
        L_0x0010:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L_0x001b
            boolean r1 = r2.f15695p     // Catch:{ all -> 0x0019 }
            if (r1 != 0) goto L_0x0021
            goto L_0x001b
        L_0x0019:
            r3 = move-exception
            goto L_0x0042
        L_0x001b:
            if (r5 == 0) goto L_0x0044
            boolean r1 = r2.f15696q     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0044
        L_0x0021:
            if (r4 == 0) goto L_0x0025
            r2.f15695p = r3     // Catch:{ all -> 0x0019 }
        L_0x0025:
            if (r5 == 0) goto L_0x0029
            r2.f15696q = r3     // Catch:{ all -> 0x0019 }
        L_0x0029:
            boolean r4 = r2.f15695p     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x0033
            boolean r5 = r2.f15696q     // Catch:{ all -> 0x0019 }
            if (r5 != 0) goto L_0x0033
            r5 = r0
            goto L_0x0034
        L_0x0033:
            r5 = r3
        L_0x0034:
            if (r4 != 0) goto L_0x003f
            boolean r4 = r2.f15696q     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x003f
            boolean r4 = r2.f15697r     // Catch:{ all -> 0x0019 }
            if (r4 != 0) goto L_0x003f
            r3 = r0
        L_0x003f:
            r4 = r3
            r3 = r5
            goto L_0x0045
        L_0x0042:
            monitor-exit(r2)
            throw r3
        L_0x0044:
            r4 = r3
        L_0x0045:
            monitor-exit(r2)
            if (r3 == 0) goto L_0x005a
            r3 = 0
            r2.f15699t = r3
            m.m0.g.i r3 = r2.f15692m
            if (r3 == 0) goto L_0x005a
            monitor-enter(r3)
            int r5 = r3.f15724l     // Catch:{ all -> 0x0057 }
            int r5 = r5 + r0
            r3.f15724l = r5     // Catch:{ all -> 0x0057 }
            monitor-exit(r3)
            goto L_0x005a
        L_0x0057:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x005a:
            if (r4 == 0) goto L_0x0061
            java.io.IOException r3 = r2.mo25618c(r6)
            return r3
        L_0x0061:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p426g.C7887e.mo25626k(m.m0.g.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    /* renamed from: l */
    public final IOException mo25627l(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f15697r) {
                this.f15697r = false;
                if (!this.f15695p && !this.f15696q) {
                    z = true;
                }
            }
        }
        return z ? mo25618c(iOException) : iOException;
    }

    /* renamed from: m */
    public final Socket mo25628m() {
        C7894i iVar = this.f15692m;
        C6888i.m12436c(iVar);
        byte[] bArr = C7867c.f15619a;
        List<Reference<C7887e>> list = iVar.f15727o;
        Iterator<Reference<C7887e>> it = list.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (C6888i.m12434a((C7887e) it.next().get(), this)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            list.remove(i);
            this.f15692m = null;
            if (list.isEmpty()) {
                iVar.f15728p = System.nanoTime();
                C7895j jVar = this.f15686g;
                Objects.requireNonNull(jVar);
                C6888i.m12438e(iVar, "connection");
                byte[] bArr2 = C7867c.f15619a;
                if (iVar.f15721i || jVar.f15734e == 0) {
                    iVar.f15721i = true;
                    jVar.f15733d.remove(iVar);
                    if (jVar.f15733d.isEmpty()) {
                        jVar.f15731b.mo25589a();
                    }
                    z = true;
                } else {
                    jVar.f15731b.mo25591c(jVar.f15732c, 0);
                }
                if (z) {
                    Socket socket = iVar.f15715c;
                    C6888i.m12436c(socket);
                    return socket;
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
