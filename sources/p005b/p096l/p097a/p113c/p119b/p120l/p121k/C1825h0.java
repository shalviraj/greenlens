package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import androidx.annotation.WorkerThread;

/* renamed from: b.l.a.c.b.l.k.h0 */
public abstract class C1825h0 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C1876x f3219g;

    public C1825h0(C1876x xVar, C1873w wVar) {
        this.f3219g = xVar;
    }

    @WorkerThread
    /* renamed from: a */
    public abstract void mo12075a();

    @WorkerThread
    public void run() {
        this.f3219g.f3321b.lock();
        try {
            if (!Thread.interrupted()) {
                mo12075a();
                this.f3219g.f3321b.unlock();
            }
        } catch (RuntimeException e) {
            C1853p0 p0Var = this.f3219g.f3320a;
            p0Var.f3280e.sendMessage(p0Var.f3280e.obtainMessage(2, e));
        } finally {
            this.f3219g.f3321b.unlock();
        }
    }
}
