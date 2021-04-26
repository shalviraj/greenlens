package p421m.p422m0.p426g;

import androidx.core.app.NotificationCompat;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;
import p421m.C7825a;
import p421m.C7860k0;
import p421m.p422m0.C7867c;
import p421m.p422m0.p425f.C7873a;
import p421m.p422m0.p425f.C7875c;
import p421m.p422m0.p425f.C7876d;
import p421m.p422m0.p426g.C7887e;
import p421m.p422m0.p430k.C7976h;

/* renamed from: m.m0.g.j */
public final class C7895j {

    /* renamed from: a */
    public final long f15730a;

    /* renamed from: b */
    public final C7875c f15731b;

    /* renamed from: c */
    public final C7896a f15732c = new C7896a(this, C0843a.m455p(new StringBuilder(), C7867c.f15625g, " ConnectionPool"));

    /* renamed from: d */
    public final ConcurrentLinkedQueue<C7894i> f15733d = new ConcurrentLinkedQueue<>();

    /* renamed from: e */
    public final int f15734e;

    /* renamed from: m.m0.g.j$a */
    public static final class C7896a extends C7873a {

        /* renamed from: e */
        public final /* synthetic */ C7895j f15735e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7896a(C7895j jVar, String str) {
            super(str, true);
            this.f15735e = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0076, code lost:
            r1 = r6.f15715c;
            p298d.p344x.p346c.C6888i.m12436c(r1);
            p421m.p422m0.C7867c.m14284e(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0084, code lost:
            if (r0.f15733d.isEmpty() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0086, code lost:
            r0.f15731b.mo25589a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            return 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            return 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
            return 0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo25587a() {
            /*
                r13 = this;
                m.m0.g.j r0 = r13.f15735e
                long r1 = java.lang.System.nanoTime()
                java.util.concurrent.ConcurrentLinkedQueue<m.m0.g.i> r3 = r0.f15733d
                java.util.Iterator r3 = r3.iterator()
                r4 = 0
                r5 = 0
                r6 = -9223372036854775808
                r7 = r6
                r6 = r5
                r5 = r4
            L_0x0013:
                boolean r9 = r3.hasNext()
                if (r9 == 0) goto L_0x003f
                java.lang.Object r9 = r3.next()
                m.m0.g.i r9 = (p421m.p422m0.p426g.C7894i) r9
                java.lang.String r10 = "connection"
                p298d.p344x.p346c.C6888i.m12437d(r9, r10)
                monitor-enter(r9)
                int r10 = r0.mo25646b(r9, r1)     // Catch:{ all -> 0x003c }
                if (r10 <= 0) goto L_0x002e
                int r5 = r5 + 1
                goto L_0x003a
            L_0x002e:
                int r4 = r4 + 1
                long r10 = r9.f15728p     // Catch:{ all -> 0x003c }
                long r10 = r1 - r10
                int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                if (r12 <= 0) goto L_0x003a
                r6 = r9
                r7 = r10
            L_0x003a:
                monitor-exit(r9)
                goto L_0x0013
            L_0x003c:
                r0 = move-exception
                monitor-exit(r9)
                throw r0
            L_0x003f:
                long r9 = r0.f15730a
                int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r3 >= 0) goto L_0x0054
                int r3 = r0.f15734e
                if (r4 <= r3) goto L_0x004a
                goto L_0x0054
            L_0x004a:
                if (r4 <= 0) goto L_0x004e
                long r9 = r9 - r7
                goto L_0x008b
            L_0x004e:
                if (r5 <= 0) goto L_0x0051
                goto L_0x008b
            L_0x0051:
                r9 = -1
                goto L_0x008b
            L_0x0054:
                p298d.p344x.p346c.C6888i.m12436c(r6)
                monitor-enter(r6)
                java.util.List<java.lang.ref.Reference<m.m0.g.e>> r3 = r6.f15727o     // Catch:{ all -> 0x008c }
                boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x008c }
                r4 = 1
                r3 = r3 ^ r4
                r9 = 0
                if (r3 == 0) goto L_0x0066
            L_0x0064:
                monitor-exit(r6)
                goto L_0x008b
            L_0x0066:
                long r11 = r6.f15728p     // Catch:{ all -> 0x008c }
                long r11 = r11 + r7
                int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
                if (r1 == 0) goto L_0x006e
                goto L_0x0064
            L_0x006e:
                r6.f15721i = r4     // Catch:{ all -> 0x008c }
                java.util.concurrent.ConcurrentLinkedQueue<m.m0.g.i> r1 = r0.f15733d     // Catch:{ all -> 0x008c }
                r1.remove(r6)     // Catch:{ all -> 0x008c }
                monitor-exit(r6)
                java.net.Socket r1 = r6.f15715c
                p298d.p344x.p346c.C6888i.m12436c(r1)
                p421m.p422m0.C7867c.m14284e(r1)
                java.util.concurrent.ConcurrentLinkedQueue<m.m0.g.i> r1 = r0.f15733d
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x008b
                m.m0.f.c r0 = r0.f15731b
                r0.mo25589a()
            L_0x008b:
                return r9
            L_0x008c:
                r0 = move-exception
                monitor-exit(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p421m.p422m0.p426g.C7895j.C7896a.mo25587a():long");
        }
    }

    public C7895j(C7876d dVar, int i, long j, TimeUnit timeUnit) {
        C6888i.m12438e(dVar, "taskRunner");
        C6888i.m12438e(timeUnit, "timeUnit");
        this.f15734e = i;
        this.f15730a = timeUnit.toNanos(j);
        this.f15731b = dVar.mo25599f();
        if (!(j > 0)) {
            throw new IllegalArgumentException(C0843a.m448i("keepAliveDuration <= 0: ", j).toString());
        }
    }

    /* renamed from: a */
    public final boolean mo25645a(C7825a aVar, C7887e eVar, List<C7860k0> list, boolean z) {
        C6888i.m12438e(aVar, "address");
        C6888i.m12438e(eVar, NotificationCompat.CATEGORY_CALL);
        Iterator<C7894i> it = this.f15733d.iterator();
        while (it.hasNext()) {
            C7894i next = it.next();
            C6888i.m12437d(next, "connection");
            synchronized (next) {
                if (z) {
                    if (!next.mo25640j()) {
                    }
                }
                if (next.mo25638h(aVar, list)) {
                    eVar.mo25617b(next);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final int mo25646b(C7894i iVar, long j) {
        byte[] bArr = C7867c.f15619a;
        List<Reference<C7887e>> list = iVar.f15727o;
        int i = 0;
        while (i < list.size()) {
            Reference reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                StringBuilder u = C0843a.m460u("A connection to ");
                u.append(iVar.f15729q.f15604a.f15435a);
                u.append(" was leaked. ");
                u.append("Did you forget to close a response body?");
                String sb = u.toString();
                C7976h.C7977a aVar = C7976h.f16015c;
                C7976h.f16013a.mo25760k(sb, ((C7887e.C7889b) reference).f15707a);
                list.remove(i);
                iVar.f15721i = true;
                if (list.isEmpty()) {
                    iVar.f15728p = j - this.f15730a;
                    return 0;
                }
            }
        }
        return list.size();
    }
}
