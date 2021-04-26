package p005b.p096l.p097a.p113c.p150j;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: b.l.a.c.j.v */
public final class C3443v<TResult> implements C3417b0<TResult> {

    /* renamed from: a */
    public final Executor f6229a;

    /* renamed from: b */
    public final Object f6230b = new Object();

    /* renamed from: c */
    public C3420d f6231c;

    public C3443v(@NonNull Executor executor, @NonNull C3420d dVar) {
        this.f6229a = executor;
        this.f6231c = dVar;
    }

    /* renamed from: c */
    public final void mo14673c(@NonNull C3428h<TResult> hVar) {
        if (!hVar.mo14692n() && !hVar.mo14690l()) {
            synchronized (this.f6230b) {
                if (this.f6231c != null) {
                    this.f6229a.execute(new C3444w(this, hVar));
                }
            }
        }
    }

    public final void cancel() {
        synchronized (this.f6230b) {
            this.f6231c = null;
        }
    }
}
