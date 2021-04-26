package p435n;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p298d.p344x.p346c.C6888i;

/* renamed from: n.b */
public class C8031b extends C8034b0 {

    /* renamed from: h */
    public static final long f16122h;

    /* renamed from: i */
    public static final long f16123i;

    /* renamed from: j */
    public static C8031b f16124j;

    /* renamed from: k */
    public static final C8032a f16125k = new C8032a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public boolean f16126e;

    /* renamed from: f */
    public C8031b f16127f;

    /* renamed from: g */
    public long f16128g;

    /* renamed from: n.b$a */
    public static final class C8032a {
        public C8032a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* renamed from: a */
        public final C8031b mo25871a() {
            Class<C8031b> cls = C8031b.class;
            C8031b bVar = C8031b.f16124j;
            C6888i.m12436c(bVar);
            C8031b bVar2 = bVar.f16127f;
            long nanoTime = System.nanoTime();
            if (bVar2 == null) {
                cls.wait(C8031b.f16122h);
                C8031b bVar3 = C8031b.f16124j;
                C6888i.m12436c(bVar3);
                if (bVar3.f16127f != null || System.nanoTime() - nanoTime < C8031b.f16123i) {
                    return null;
                }
                return C8031b.f16124j;
            }
            long j = bVar2.f16128g - nanoTime;
            if (j > 0) {
                long j2 = j / 1000000;
                cls.wait(j2, (int) (j - (1000000 * j2)));
                return null;
            }
            C8031b bVar4 = C8031b.f16124j;
            C6888i.m12436c(bVar4);
            bVar4.f16127f = bVar2.f16127f;
            bVar2.f16127f = null;
            return bVar2;
        }
    }

    /* renamed from: n.b$b */
    public static final class C8033b extends Thread {
        public C8033b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            if (r1 == null) goto L_0x0000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0015, code lost:
            r1.mo17037k();
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<n.b> r0 = p435n.C8031b.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                n.b$a r1 = p435n.C8031b.f16125k     // Catch:{ all -> 0x0019 }
                n.b r1 = r1.mo25871a()     // Catch:{ all -> 0x0019 }
                n.b r2 = p435n.C8031b.f16124j     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0012
                r1 = 0
                p435n.C8031b.f16124j = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0012:
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 == 0) goto L_0x0000
                r1.mo17037k()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: p435n.C8031b.C8033b.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f16122h = millis;
        f16123i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0061 A[EDGE_INSN: B:40:0x0061->B:27:0x0061 ?: BREAK  , SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25869h() {
        /*
            r9 = this;
            long r0 = r9.f16132c
            boolean r2 = r9.f16130a
            r3 = 0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            if (r2 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Class<n.b> r4 = p435n.C8031b.class
            monitor-enter(r4)
            boolean r5 = r9.f16126e     // Catch:{ all -> 0x0082 }
            r6 = 1
            r5 = r5 ^ r6
            if (r5 == 0) goto L_0x0076
            r9.f16126e = r6     // Catch:{ all -> 0x0082 }
            n.b r5 = f16124j     // Catch:{ all -> 0x0082 }
            if (r5 != 0) goto L_0x002b
            n.b r5 = new n.b     // Catch:{ all -> 0x0082 }
            r5.<init>()     // Catch:{ all -> 0x0082 }
            f16124j = r5     // Catch:{ all -> 0x0082 }
            n.b$b r5 = new n.b$b     // Catch:{ all -> 0x0082 }
            r5.<init>()     // Catch:{ all -> 0x0082 }
            r5.start()     // Catch:{ all -> 0x0082 }
        L_0x002b:
            long r5 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0082 }
            if (r3 == 0) goto L_0x003d
            if (r2 == 0) goto L_0x003d
            long r2 = r9.mo25875c()     // Catch:{ all -> 0x0082 }
            long r2 = r2 - r5
            long r0 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x0082 }
            goto L_0x003f
        L_0x003d:
            if (r3 == 0) goto L_0x0041
        L_0x003f:
            long r0 = r0 + r5
            goto L_0x0047
        L_0x0041:
            if (r2 == 0) goto L_0x0070
            long r0 = r9.mo25875c()     // Catch:{ all -> 0x0082 }
        L_0x0047:
            r9.f16128g = r0     // Catch:{ all -> 0x0082 }
            long r0 = r0 - r5
            n.b r2 = f16124j     // Catch:{ all -> 0x0082 }
        L_0x004c:
            p298d.p344x.p346c.C6888i.m12436c(r2)     // Catch:{ all -> 0x0082 }
            n.b r3 = r2.f16127f     // Catch:{ all -> 0x0082 }
            if (r3 == 0) goto L_0x0061
            p298d.p344x.p346c.C6888i.m12436c(r3)     // Catch:{ all -> 0x0082 }
            long r7 = r3.f16128g     // Catch:{ all -> 0x0082 }
            long r7 = r7 - r5
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x005e
            goto L_0x0061
        L_0x005e:
            n.b r2 = r2.f16127f     // Catch:{ all -> 0x0082 }
            goto L_0x004c
        L_0x0061:
            n.b r0 = r2.f16127f     // Catch:{ all -> 0x0082 }
            r9.f16127f = r0     // Catch:{ all -> 0x0082 }
            r2.f16127f = r9     // Catch:{ all -> 0x0082 }
            n.b r0 = f16124j     // Catch:{ all -> 0x0082 }
            if (r2 != r0) goto L_0x006e
            r4.notify()     // Catch:{ all -> 0x0082 }
        L_0x006e:
            monitor-exit(r4)
            return
        L_0x0070:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0082 }
            r0.<init>()     // Catch:{ all -> 0x0082 }
            throw r0     // Catch:{ all -> 0x0082 }
        L_0x0076:
            java.lang.String r0 = "Unbalanced enter/exit"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0082 }
            r1.<init>(r0)     // Catch:{ all -> 0x0082 }
            throw r1     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p435n.C8031b.mo25869h():void");
    }

    /* renamed from: i */
    public final boolean mo25870i() {
        boolean z;
        synchronized (C8031b.class) {
            z = false;
            if (this.f16126e) {
                this.f16126e = false;
                C8031b bVar = f16124j;
                while (true) {
                    if (bVar == null) {
                        z = true;
                        break;
                    }
                    C8031b bVar2 = bVar.f16127f;
                    if (bVar2 == this) {
                        bVar.f16127f = this.f16127f;
                        this.f16127f = null;
                        break;
                    }
                    bVar = bVar2;
                }
            }
        }
        return z;
    }

    /* renamed from: j */
    public IOException mo17036j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: k */
    public void mo17037k() {
    }
}
