package p005b.p096l.p097a.p113c.p150j;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: b.l.a.c.j.x */
public final class C3445x<TResult> implements C3417b0<TResult> {

    /* renamed from: a */
    public final Executor f6234a;

    /* renamed from: b */
    public final Object f6235b = new Object();

    /* renamed from: c */
    public C3422e<? super TResult> f6236c;

    public C3445x(@NonNull Executor executor, @NonNull C3422e<? super TResult> eVar) {
        this.f6234a = executor;
        this.f6236c = eVar;
    }

    /* renamed from: c */
    public final void mo14673c(@NonNull C3428h<TResult> hVar) {
        if (hVar.mo14692n()) {
            synchronized (this.f6235b) {
                if (this.f6236c != null) {
                    this.f6234a.execute(new C3446y(this, hVar));
                }
            }
        }
    }

    public final void cancel() {
        synchronized (this.f6235b) {
            this.f6236c = null;
        }
    }
}
