package p005b.p096l.p097a.p151d.p152a.p163i;

import java.util.concurrent.Executor;

/* renamed from: b.l.a.d.a.i.r */
public final class C3651r<ResultT> extends C3651r<ResultT> {

    /* renamed from: a */
    public final Object f6724a = new Object();

    /* renamed from: b */
    public final C3646m<ResultT> f6725b = new C3646m<>();

    /* renamed from: c */
    public boolean f6726c;

    /* renamed from: d */
    public ResultT f6727d;

    /* renamed from: e */
    public Exception f6728e;

    /* renamed from: a */
    public final void mo14932a(ResultT resultt) {
        synchronized (this.f6724a) {
            if (!this.f6726c) {
                this.f6726c = true;
                this.f6727d = resultt;
            } else {
                throw new IllegalStateException("Task is already complete");
            }
        }
        this.f6725b.mo14927b(this);
    }

    /* renamed from: b */
    public final C3651r<ResultT> mo14933b(Executor executor, C3635b bVar) {
        this.f6725b.mo14926a(new C3642i(executor, bVar));
        mo14936e();
        return this;
    }

    /* renamed from: c */
    public final C3651r<ResultT> mo14934c(Executor executor, C3636c<? super ResultT> cVar) {
        this.f6725b.mo14926a(new C3644k(executor, cVar));
        mo14936e();
        return this;
    }

    /* renamed from: d */
    public final void mo14935d(Exception exc) {
        synchronized (this.f6724a) {
            if (!this.f6726c) {
                this.f6726c = true;
                this.f6728e = exc;
            } else {
                throw new IllegalStateException("Task is already complete");
            }
        }
        this.f6725b.mo14927b(this);
    }

    /* renamed from: e */
    public final void mo14936e() {
        synchronized (this.f6724a) {
            if (this.f6726c) {
                this.f6725b.mo14927b(this);
            }
        }
    }

    /* renamed from: f */
    public final ResultT mo14937f() {
        ResultT resultt;
        synchronized (this.f6724a) {
            if (this.f6726c) {
                Exception exc = this.f6728e;
                if (exc == null) {
                    resultt = this.f6727d;
                } else {
                    throw new C3637d(exc);
                }
            } else {
                throw new IllegalStateException("Task is not yet complete");
            }
        }
        return resultt;
    }

    /* renamed from: g */
    public final boolean mo14938g() {
        boolean z;
        synchronized (this.f6724a) {
            z = false;
            if (this.f6726c && this.f6728e == null) {
                z = true;
            }
        }
        return z;
    }
}
