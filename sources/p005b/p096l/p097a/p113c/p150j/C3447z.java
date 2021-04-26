package p005b.p096l.p097a.p113c.p150j;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: b.l.a.c.j.z */
public final class C3447z<TResult, TContinuationResult> implements C3416b, C3420d, C3422e<TContinuationResult>, C3417b0<TResult> {

    /* renamed from: a */
    public final Executor f6239a;

    /* renamed from: b */
    public final C3427g<TResult, TContinuationResult> f6240b;

    /* renamed from: c */
    public final C3423e0<TContinuationResult> f6241c;

    public C3447z(@NonNull Executor executor, @NonNull C3427g<TResult, TContinuationResult> gVar, @NonNull C3423e0<TContinuationResult> e0Var) {
        this.f6239a = executor;
        this.f6240b = gVar;
        this.f6241c = e0Var;
    }

    /* renamed from: a */
    public final void mo14678a(TContinuationResult tcontinuationresult) {
        this.f6241c.mo14695q(tcontinuationresult);
    }

    /* renamed from: b */
    public final void mo12749b(@NonNull Exception exc) {
        this.f6241c.mo14694p(exc);
    }

    /* renamed from: c */
    public final void mo14673c(@NonNull C3428h<TResult> hVar) {
        this.f6239a.execute(new C3415a0(this, hVar));
    }

    public final void cancel() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final void mo14672d() {
        this.f6241c.mo14696r();
    }
}
