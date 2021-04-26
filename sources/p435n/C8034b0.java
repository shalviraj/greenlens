package p435n;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: n.b0 */
public class C8034b0 {

    /* renamed from: d */
    public static final C8034b0 f16129d = new C8035a();

    /* renamed from: a */
    public boolean f16130a;

    /* renamed from: b */
    public long f16131b;

    /* renamed from: c */
    public long f16132c;

    /* renamed from: n.b0$a */
    public static final class C8035a extends C8034b0 {
        /* renamed from: d */
        public C8034b0 mo25876d(long j) {
            return this;
        }

        /* renamed from: f */
        public void mo25878f() {
        }

        /* renamed from: g */
        public C8034b0 mo25879g(long j, TimeUnit timeUnit) {
            C6888i.m12438e(timeUnit, "unit");
            return this;
        }
    }

    /* renamed from: a */
    public C8034b0 mo25873a() {
        this.f16130a = false;
        return this;
    }

    /* renamed from: b */
    public C8034b0 mo25874b() {
        this.f16132c = 0;
        return this;
    }

    /* renamed from: c */
    public long mo25875c() {
        if (this.f16130a) {
            return this.f16131b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    /* renamed from: d */
    public C8034b0 mo25876d(long j) {
        this.f16130a = true;
        this.f16131b = j;
        return this;
    }

    /* renamed from: e */
    public boolean mo25877e() {
        return this.f16130a;
    }

    /* renamed from: f */
    public void mo25878f() {
        Thread currentThread = Thread.currentThread();
        C6888i.m12437d(currentThread, "Thread.currentThread()");
        if (currentThread.isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        } else if (this.f16130a && this.f16131b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: g */
    public C8034b0 mo25879g(long j, TimeUnit timeUnit) {
        C6888i.m12438e(timeUnit, "unit");
        if (j >= 0) {
            this.f16132c = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(C0843a.m448i("timeout < 0: ", j).toString());
    }
}
