package p005b.p096l.p097a.p113c.p150j;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: b.l.a.c.j.r */
public final class C3439r<TResult> implements C3417b0<TResult> {

    /* renamed from: a */
    public final Executor f6220a;

    /* renamed from: b */
    public final Object f6221b = new Object();

    /* renamed from: c */
    public C3416b f6222c;

    public C3439r(@NonNull Executor executor, @NonNull C3416b bVar) {
        this.f6220a = executor;
        this.f6222c = bVar;
    }

    /* renamed from: c */
    public final void mo14673c(@NonNull C3428h hVar) {
        if (hVar.mo14690l()) {
            synchronized (this.f6221b) {
                if (this.f6222c != null) {
                    this.f6220a.execute(new C3440s(this));
                }
            }
        }
    }

    public final void cancel() {
        synchronized (this.f6221b) {
            this.f6222c = null;
        }
    }
}
