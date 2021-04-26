package p005b.p280p.p285b;

import com.amplitude.api.Constants;
import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p285b.p286a0.C5123b;
import p005b.p280p.p285b.p286a0.C5132g;
import p005b.p280p.p285b.p286a0.C5133h;
import p005b.p280p.p285b.p286a0.C5134i;
import p005b.p280p.p285b.p286a0.p288k.C5211p;
import p005b.p280p.p285b.p286a0.p289l.C5212a;

/* renamed from: b.p.b.i */
public final class C5233i {

    /* renamed from: g */
    public static final C5233i f10390g;

    /* renamed from: a */
    public final Executor f10391a;

    /* renamed from: b */
    public final int f10392b;

    /* renamed from: c */
    public final long f10393c;

    /* renamed from: d */
    public Runnable f10394d = new C5234a();

    /* renamed from: e */
    public final Deque<C5212a> f10395e = new ArrayDeque();

    /* renamed from: f */
    public final C5132g f10396f = new C5132g();

    /* renamed from: b.p.b.i$a */
    public class C5234a implements Runnable {
        public C5234a() {
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0079 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r13 = this;
            L_0x0000:
                b.p.b.i r0 = p005b.p280p.p285b.C5233i.this
                long r1 = java.lang.System.nanoTime()
                monitor-enter(r0)
                java.util.Deque<b.p.b.a0.l.a> r3 = r0.f10395e     // Catch:{ all -> 0x007d }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x007d }
                r4 = 0
                r5 = 0
                r6 = -9223372036854775808
                r7 = r6
                r6 = r5
                r5 = r4
            L_0x0014:
                boolean r9 = r3.hasNext()     // Catch:{ all -> 0x007d }
                if (r9 == 0) goto L_0x0036
                java.lang.Object r9 = r3.next()     // Catch:{ all -> 0x007d }
                b.p.b.a0.l.a r9 = (p005b.p280p.p285b.p286a0.p289l.C5212a) r9     // Catch:{ all -> 0x007d }
                int r10 = r0.mo17137a(r9, r1)     // Catch:{ all -> 0x007d }
                if (r10 <= 0) goto L_0x0029
                int r5 = r5 + 1
                goto L_0x0014
            L_0x0029:
                int r4 = r4 + 1
                long r10 = r9.f10247l     // Catch:{ all -> 0x007d }
                long r10 = r1 - r10
                int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                if (r12 <= 0) goto L_0x0014
                r6 = r9
                r7 = r10
                goto L_0x0014
            L_0x0036:
                long r1 = r0.f10393c     // Catch:{ all -> 0x007d }
                int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                r9 = -1
                r11 = 0
                if (r3 >= 0) goto L_0x0051
                int r3 = r0.f10392b     // Catch:{ all -> 0x007d }
                if (r4 <= r3) goto L_0x0045
                goto L_0x0051
            L_0x0045:
                if (r4 <= 0) goto L_0x004a
                long r1 = r1 - r7
                monitor-exit(r0)     // Catch:{ all -> 0x007d }
                goto L_0x005d
            L_0x004a:
                if (r5 <= 0) goto L_0x004e
                monitor-exit(r0)     // Catch:{ all -> 0x007d }
                goto L_0x005d
            L_0x004e:
                monitor-exit(r0)     // Catch:{ all -> 0x007d }
                r1 = r9
                goto L_0x005d
            L_0x0051:
                java.util.Deque<b.p.b.a0.l.a> r1 = r0.f10395e     // Catch:{ all -> 0x007d }
                r1.remove(r6)     // Catch:{ all -> 0x007d }
                monitor-exit(r0)     // Catch:{ all -> 0x007d }
                java.net.Socket r0 = r6.f10238c
                p005b.p280p.p285b.p286a0.C5134i.m9459d(r0)
                r1 = r11
            L_0x005d:
                int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
                if (r0 != 0) goto L_0x0062
                return
            L_0x0062:
                int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
                if (r0 <= 0) goto L_0x0000
                r3 = 1000000(0xf4240, double:4.940656E-318)
                long r5 = r1 / r3
                long r3 = r3 * r5
                long r1 = r1 - r3
                b.p.b.i r0 = p005b.p280p.p285b.C5233i.this
                monitor-enter(r0)
                b.p.b.i r3 = p005b.p280p.p285b.C5233i.this     // Catch:{ InterruptedException -> 0x0079 }
                int r1 = (int) r1     // Catch:{ InterruptedException -> 0x0079 }
                r3.wait(r5, r1)     // Catch:{ InterruptedException -> 0x0079 }
                goto L_0x0079
            L_0x0077:
                r1 = move-exception
                goto L_0x007b
            L_0x0079:
                monitor-exit(r0)     // Catch:{ all -> 0x0077 }
                goto L_0x0000
            L_0x007b:
                monitor-exit(r0)     // Catch:{ all -> 0x0077 }
                throw r1
            L_0x007d:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x007d }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p005b.p280p.p285b.C5233i.C5234a.run():void");
        }
    }

    static {
        C5233i iVar;
        String property = System.getProperty("http.keepAlive");
        String property2 = System.getProperty("http.keepAliveDuration");
        String property3 = System.getProperty("http.maxConnections");
        long parseLong = property2 != null ? Long.parseLong(property2) : Constants.MIN_TIME_BETWEEN_SESSIONS_MILLIS;
        if (property != null && !Boolean.parseBoolean(property)) {
            iVar = new C5233i(0, parseLong);
        } else if (property3 != null) {
            int parseInt = Integer.parseInt(property3);
        } else {
            iVar = new C5233i(5, parseLong);
        }
        f10390g = iVar;
    }

    public C5233i(int i, long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        byte[] bArr = C5134i.f9953a;
        this.f10391a = new ThreadPoolExecutor(0, 1, 60, timeUnit2, linkedBlockingQueue, new C5133h("OkHttp ConnectionPool", true));
        this.f10392b = i;
        this.f10393c = timeUnit.toNanos(j);
        if (j <= 0) {
            throw new IllegalArgumentException(C0843a.m448i("keepAliveDuration <= 0: ", j));
        }
    }

    /* renamed from: a */
    public final int mo17137a(C5212a aVar, long j) {
        List<Reference<C5211p>> list = aVar.f10245j;
        int i = 0;
        while (i < list.size()) {
            if (list.get(i).get() != null) {
                i++;
            } else {
                Logger logger = C5123b.f9929a;
                StringBuilder u = C0843a.m460u("A connection to ");
                u.append(aVar.f10236a.f10517a.f9914a);
                u.append(" was leaked. Did you forget to close a response body?");
                logger.warning(u.toString());
                list.remove(i);
                aVar.f10246k = true;
                if (list.isEmpty()) {
                    aVar.f10247l = j - this.f10393c;
                    return 0;
                }
            }
        }
        return list.size();
    }
}
