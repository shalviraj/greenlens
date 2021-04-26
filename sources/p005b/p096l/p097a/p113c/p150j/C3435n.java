package p005b.p096l.p097a.p113c.p150j;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: b.l.a.c.j.n */
public final class C3435n<TResult, TContinuationResult> implements C3417b0<TResult> {

    /* renamed from: a */
    public final Executor f6210a;

    /* renamed from: b */
    public final C3414a<TResult, TContinuationResult> f6211b;

    /* renamed from: c */
    public final C3423e0<TContinuationResult> f6212c;

    public C3435n(@NonNull Executor executor, @NonNull C3414a<TResult, TContinuationResult> aVar, @NonNull C3423e0<TContinuationResult> e0Var) {
        this.f6210a = executor;
        this.f6211b = aVar;
        this.f6212c = e0Var;
    }

    /* renamed from: c */
    public final void mo14673c(@NonNull C3428h<TResult> hVar) {
        this.f6210a.execute(new C3436o(this, hVar));
    }

    public final void cancel() {
        throw new UnsupportedOperationException();
    }
}
