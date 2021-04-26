package p005b.p096l.p180d.p191q.p192f.p195g;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p150j.C3428h;

/* renamed from: b.l.d.q.f.g.f */
public class C4008f {

    /* renamed from: a */
    public final Executor f7341a;

    /* renamed from: b */
    public C3428h<Void> f7342b = C1960d.m2740P(null);

    /* renamed from: c */
    public final Object f7343c = new Object();

    /* renamed from: d */
    public final ThreadLocal<Boolean> f7344d = new ThreadLocal<>();

    /* renamed from: b.l.d.q.f.g.f$a */
    public class C4009a implements Runnable {
        public C4009a() {
        }

        public void run() {
            C4008f.this.f7344d.set(Boolean.TRUE);
        }
    }

    public C4008f(Executor executor) {
        this.f7341a = executor;
        executor.execute(new C4009a());
    }

    /* renamed from: a */
    public void mo15517a() {
        if (!Boolean.TRUE.equals(this.f7344d.get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    /* renamed from: b */
    public <T> C3428h<T> mo15518b(Callable<T> callable) {
        C3428h<TContinuationResult> g;
        synchronized (this.f7343c) {
            g = this.f7342b.mo14685g(this.f7341a, new C4011g(this, callable));
            this.f7342b = g.mo14685g(this.f7341a, new C4013h(this));
        }
        return g;
    }

    /* renamed from: c */
    public <T> C3428h<T> mo15519c(Callable<C3428h<T>> callable) {
        C3428h<TContinuationResult> h;
        synchronized (this.f7343c) {
            h = this.f7342b.mo14686h(this.f7341a, new C4011g(this, callable));
            this.f7342b = h.mo14685g(this.f7341a, new C4013h(this));
        }
        return h;
    }
}
