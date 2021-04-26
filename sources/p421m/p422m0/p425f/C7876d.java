package p421m.p422m0.p425f;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p344x.p346c.C6888i;
import p421m.p422m0.C7866b;
import p421m.p422m0.C7867c;

/* renamed from: m.m0.f.d */
public final class C7876d {

    /* renamed from: h */
    public static final C7876d f15642h;

    /* renamed from: i */
    public static final Logger f15643i;

    /* renamed from: j */
    public static final C7878b f15644j = new C7878b((DefaultConstructorMarker) null);

    /* renamed from: a */
    public int f15645a = 10000;

    /* renamed from: b */
    public boolean f15646b;

    /* renamed from: c */
    public long f15647c;

    /* renamed from: d */
    public final List<C7875c> f15648d = new ArrayList();

    /* renamed from: e */
    public final List<C7875c> f15649e = new ArrayList();

    /* renamed from: f */
    public final Runnable f15650f = new C7880d(this);

    /* renamed from: g */
    public final C7877a f15651g;

    /* renamed from: m.m0.f.d$a */
    public interface C7877a {
        /* renamed from: a */
        void mo25600a(C7876d dVar);

        /* renamed from: b */
        void mo25601b(C7876d dVar, long j);

        /* renamed from: c */
        long mo25602c();

        void execute(Runnable runnable);
    }

    /* renamed from: m.m0.f.d$b */
    public static final class C7878b {
        public C7878b(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* renamed from: a */
        public final Logger mo25604a() {
            return C7876d.f15643i;
        }
    }

    /* renamed from: m.m0.f.d$c */
    public static final class C7879c implements C7877a {

        /* renamed from: a */
        public final ThreadPoolExecutor f15652a;

        public C7879c(ThreadFactory threadFactory) {
            C6888i.m12438e(threadFactory, "threadFactory");
            this.f15652a = new ThreadPoolExecutor(0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        /* renamed from: a */
        public void mo25600a(C7876d dVar) {
            C6888i.m12438e(dVar, "taskRunner");
            dVar.notify();
        }

        /* renamed from: b */
        public void mo25601b(C7876d dVar, long j) {
            C6888i.m12438e(dVar, "taskRunner");
            long j2 = j / 1000000;
            long j3 = j - (1000000 * j2);
            if (j2 > 0 || j > 0) {
                dVar.wait(j2, (int) j3);
            }
        }

        /* renamed from: c */
        public long mo25602c() {
            return System.nanoTime();
        }

        public void execute(Runnable runnable) {
            C6888i.m12438e(runnable, "runnable");
            this.f15652a.execute(runnable);
        }
    }

    /* renamed from: m.m0.f.d$d */
    public static final class C7880d implements Runnable {

        /* renamed from: g */
        public final /* synthetic */ C7876d f15653g;

        public C7880d(C7876d dVar) {
            this.f15653g = dVar;
        }

        public void run() {
            C7873a c;
            while (true) {
                synchronized (this.f15653g) {
                    c = this.f15653g.mo25596c();
                }
                if (c != null) {
                    C7875c cVar = c.f15631a;
                    C6888i.m12436c(cVar);
                    long j = -1;
                    C7878b bVar = C7876d.f15644j;
                    boolean isLoggable = C7876d.f15643i.isLoggable(Level.FINE);
                    if (isLoggable) {
                        j = cVar.f15640e.f15651g.mo25602c();
                        C5266a.m9995n(c, cVar, "starting");
                    }
                    try {
                        C7876d.m14319a(this.f15653g, c);
                        if (isLoggable) {
                            long c2 = cVar.f15640e.f15651g.mo25602c() - j;
                            StringBuilder u = C0843a.m460u("finished run in ");
                            u.append(C5266a.m9893V0(c2));
                            C5266a.m9995n(c, cVar, u.toString());
                        }
                    } catch (Throwable th) {
                        if (isLoggable) {
                            long c3 = cVar.f15640e.f15651g.mo25602c() - j;
                            StringBuilder u2 = C0843a.m460u("failed a run in ");
                            u2.append(C5266a.m9893V0(c3));
                            C5266a.m9995n(c, cVar, u2.toString());
                        }
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }
    }

    static {
        String str = C7867c.f15625g + " TaskRunner";
        C6888i.m12438e(str, "name");
        f15642h = new C7876d(new C7879c(new C7866b(str, true)));
        Logger logger = Logger.getLogger(C7876d.class.getName());
        C6888i.m12437d(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f15643i = logger;
    }

    public C7876d(C7877a aVar) {
        C6888i.m12438e(aVar, "backend");
        this.f15651g = aVar;
    }

    /* renamed from: a */
    public static final void m14319a(C7876d dVar, C7873a aVar) {
        Objects.requireNonNull(dVar);
        byte[] bArr = C7867c.f15619a;
        Thread currentThread = Thread.currentThread();
        C6888i.m12437d(currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(aVar.f15633c);
        try {
            long a = aVar.mo25587a();
            synchronized (dVar) {
                dVar.mo25595b(aVar, a);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (dVar) {
                dVar.mo25595b(aVar, -1);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void mo25595b(C7873a aVar, long j) {
        byte[] bArr = C7867c.f15619a;
        C7875c cVar = aVar.f15631a;
        C6888i.m12436c(cVar);
        if (cVar.f15637b == aVar) {
            boolean z = cVar.f15639d;
            cVar.f15639d = false;
            cVar.f15637b = null;
            this.f15648d.remove(cVar);
            if (j != -1 && !z && !cVar.f15636a) {
                cVar.mo25592d(aVar, j, true);
            }
            if (!cVar.f15638c.isEmpty()) {
                this.f15649e.add(cVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:29|30|31|34|35|42|32) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a7, code lost:
        r14.f15646b = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a9, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00a3 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p421m.p422m0.p425f.C7873a mo25596c() {
        /*
            r14 = this;
            byte[] r0 = p421m.p422m0.C7867c.f15619a
        L_0x0002:
            java.util.List<m.m0.f.c> r0 = r14.f15649e
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            m.m0.f.d$a r0 = r14.f15651g
            long r2 = r0.mo25602c()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.List<m.m0.f.c> r0 = r14.f15649e
            java.util.Iterator r0 = r0.iterator()
            r6 = r1
        L_0x001e:
            boolean r7 = r0.hasNext()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x004c
            java.lang.Object r7 = r0.next()
            m.m0.f.c r7 = (p421m.p422m0.p425f.C7875c) r7
            java.util.List<m.m0.f.a> r7 = r7.f15638c
            java.lang.Object r7 = r7.get(r9)
            m.m0.f.a r7 = (p421m.p422m0.p425f.C7873a) r7
            long r10 = r7.f15632b
            long r10 = r10 - r2
            r12 = 0
            long r10 = java.lang.Math.max(r12, r10)
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x0046
            long r4 = java.lang.Math.min(r10, r4)
            goto L_0x001e
        L_0x0046:
            if (r6 == 0) goto L_0x004a
            r0 = r8
            goto L_0x004d
        L_0x004a:
            r6 = r7
            goto L_0x001e
        L_0x004c:
            r0 = r9
        L_0x004d:
            if (r6 == 0) goto L_0x0082
            byte[] r1 = p421m.p422m0.C7867c.f15619a
            r1 = -1
            r6.f15632b = r1
            m.m0.f.c r1 = r6.f15631a
            p298d.p344x.p346c.C6888i.m12436c(r1)
            java.util.List<m.m0.f.a> r2 = r1.f15638c
            r2.remove(r6)
            java.util.List<m.m0.f.c> r2 = r14.f15649e
            r2.remove(r1)
            r1.f15637b = r6
            java.util.List<m.m0.f.c> r2 = r14.f15648d
            r2.add(r1)
            if (r0 != 0) goto L_0x007a
            boolean r0 = r14.f15646b
            if (r0 != 0) goto L_0x0081
            java.util.List<m.m0.f.c> r0 = r14.f15649e
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x0081
        L_0x007a:
            m.m0.f.d$a r0 = r14.f15651g
            java.lang.Runnable r1 = r14.f15650f
            r0.execute(r1)
        L_0x0081:
            return r6
        L_0x0082:
            boolean r0 = r14.f15646b
            if (r0 == 0) goto L_0x0093
            long r6 = r14.f15647c
            long r6 = r6 - r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0092
            m.m0.f.d$a r0 = r14.f15651g
            r0.mo25600a(r14)
        L_0x0092:
            return r1
        L_0x0093:
            r14.f15646b = r8
            long r2 = r2 + r4
            r14.f15647c = r2
            m.m0.f.d$a r0 = r14.f15651g     // Catch:{ InterruptedException -> 0x00a3 }
            r0.mo25601b(r14, r4)     // Catch:{ InterruptedException -> 0x00a3 }
        L_0x009d:
            r14.f15646b = r9
            goto L_0x0002
        L_0x00a1:
            r0 = move-exception
            goto L_0x00a7
        L_0x00a3:
            r14.mo25597d()     // Catch:{ all -> 0x00a1 }
            goto L_0x009d
        L_0x00a7:
            r14.f15646b = r9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p425f.C7876d.mo25596c():m.m0.f.a");
    }

    /* renamed from: d */
    public final void mo25597d() {
        for (int size = this.f15648d.size() - 1; size >= 0; size--) {
            this.f15648d.get(size).mo25590b();
        }
        for (int size2 = this.f15649e.size() - 1; size2 >= 0; size2--) {
            C7875c cVar = this.f15649e.get(size2);
            cVar.mo25590b();
            if (cVar.f15638c.isEmpty()) {
                this.f15649e.remove(size2);
            }
        }
    }

    /* renamed from: e */
    public final void mo25598e(C7875c cVar) {
        C6888i.m12438e(cVar, "taskQueue");
        byte[] bArr = C7867c.f15619a;
        if (cVar.f15637b == null) {
            if (!cVar.f15638c.isEmpty()) {
                List<C7875c> list = this.f15649e;
                C6888i.m12438e(list, "$this$addIfAbsent");
                if (!list.contains(cVar)) {
                    list.add(cVar);
                }
            } else {
                this.f15649e.remove(cVar);
            }
        }
        if (this.f15646b) {
            this.f15651g.mo25600a(this);
        } else {
            this.f15651g.execute(this.f15650f);
        }
    }

    /* renamed from: f */
    public final C7875c mo25599f() {
        int i;
        synchronized (this) {
            i = this.f15645a;
            this.f15645a = i + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i);
        return new C7875c(this, sb.toString());
    }
}
