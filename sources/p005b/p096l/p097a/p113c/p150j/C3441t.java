package p005b.p096l.p097a.p113c.p150j;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: b.l.a.c.j.t */
public final class C3441t<TResult> implements C3417b0<TResult> {

    /* renamed from: a */
    public final Executor f6224a;

    /* renamed from: b */
    public final Object f6225b = new Object();

    /* renamed from: c */
    public C3418c<TResult> f6226c;

    public C3441t(@NonNull Executor executor, @NonNull C3418c<TResult> cVar) {
        this.f6224a = executor;
        this.f6226c = cVar;
    }

    /* renamed from: c */
    public final void mo14673c(@NonNull C3428h<TResult> hVar) {
        synchronized (this.f6225b) {
            if (this.f6226c != null) {
                this.f6224a.execute(new C3442u(this, hVar));
            }
        }
    }

    public final void cancel() {
        synchronized (this.f6225b) {
            this.f6226c = null;
        }
    }
}
