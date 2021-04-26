package p005b.p096l.p097a.p113c.p150j;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: b.l.a.c.j.p */
public final class C3437p<TResult, TContinuationResult> implements C3416b, C3420d, C3422e<TContinuationResult>, C3417b0<TResult> {

    /* renamed from: a */
    public final Executor f6215a;

    /* renamed from: b */
    public final C3414a<TResult, C3428h<TContinuationResult>> f6216b;

    /* renamed from: c */
    public final C3423e0<TContinuationResult> f6217c;

    public C3437p(@NonNull Executor executor, @NonNull C3414a<TResult, C3428h<TContinuationResult>> aVar, @NonNull C3423e0<TContinuationResult> e0Var) {
        this.f6215a = executor;
        this.f6216b = aVar;
        this.f6217c = e0Var;
    }

    /* renamed from: a */
    public final void mo14678a(TContinuationResult tcontinuationresult) {
        this.f6217c.mo14695q(tcontinuationresult);
    }

    /* renamed from: b */
    public final void mo12749b(@NonNull Exception exc) {
        this.f6217c.mo14694p(exc);
    }

    /* renamed from: c */
    public final void mo14673c(@NonNull C3428h<TResult> hVar) {
        this.f6215a.execute(new C3438q(this, hVar));
    }

    public final void cancel() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final void mo14672d() {
        this.f6217c.mo14696r();
    }
}
