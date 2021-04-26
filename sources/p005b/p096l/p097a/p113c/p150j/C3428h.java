package p005b.p096l.p097a.p113c.p150j;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* renamed from: b.l.a.c.j.h */
public abstract class C3428h<TResult> {
    @NonNull
    /* renamed from: a */
    public C3428h<TResult> mo14679a(@NonNull Executor executor, @NonNull C3416b bVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    @NonNull
    /* renamed from: b */
    public C3428h<TResult> mo14680b(@NonNull Activity activity, @NonNull C3418c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    /* renamed from: c */
    public C3428h<TResult> mo14681c(@NonNull C3418c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    /* renamed from: d */
    public abstract C3428h<TResult> mo14682d(@NonNull Executor executor, @NonNull C3420d dVar);

    @NonNull
    /* renamed from: e */
    public abstract C3428h<TResult> mo14683e(@NonNull Executor executor, @NonNull C3422e<? super TResult> eVar);

    @NonNull
    /* renamed from: f */
    public <TContinuationResult> C3428h<TContinuationResult> mo14684f(@NonNull C3414a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    /* renamed from: g */
    public <TContinuationResult> C3428h<TContinuationResult> mo14685g(@NonNull Executor executor, @NonNull C3414a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    /* renamed from: h */
    public <TContinuationResult> C3428h<TContinuationResult> mo14686h(@NonNull Executor executor, @NonNull C3414a<TResult, C3428h<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @Nullable
    /* renamed from: i */
    public abstract Exception mo14687i();

    @Nullable
    /* renamed from: j */
    public abstract TResult mo14688j();

    @Nullable
    /* renamed from: k */
    public abstract <X extends Throwable> TResult mo14689k(@NonNull Class<X> cls);

    /* renamed from: l */
    public abstract boolean mo14690l();

    /* renamed from: m */
    public abstract boolean mo14691m();

    /* renamed from: n */
    public abstract boolean mo14692n();

    @NonNull
    /* renamed from: o */
    public <TContinuationResult> C3428h<TContinuationResult> mo14693o(@NonNull Executor executor, @NonNull C3427g<TResult, TContinuationResult> gVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
