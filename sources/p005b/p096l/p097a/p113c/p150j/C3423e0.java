package p005b.p096l.p097a.p113c.p150j;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1824h;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1827i;

/* renamed from: b.l.a.c.j.e0 */
public final class C3423e0<TResult> extends C3428h<TResult> {

    /* renamed from: a */
    public final Object f6188a = new Object();

    /* renamed from: b */
    public final C3419c0<TResult> f6189b = new C3419c0<>();

    /* renamed from: c */
    public boolean f6190c;

    /* renamed from: d */
    public volatile boolean f6191d;

    /* renamed from: e */
    public TResult f6192e;

    /* renamed from: f */
    public Exception f6193f;

    /* renamed from: b.l.a.c.j.e0$a */
    public static class C3424a extends LifecycleCallback {

        /* renamed from: b */
        public final List<WeakReference<C3417b0<?>>> f6194b = new ArrayList();

        public C3424a(C1827i iVar) {
            super(iVar);
            this.f11301a.mo12076a("TaskOnStopCallback", this);
        }

        @MainThread
        /* renamed from: g */
        public void mo14698g() {
            synchronized (this.f6194b) {
                for (WeakReference<C3417b0<?>> weakReference : this.f6194b) {
                    C3417b0 b0Var = (C3417b0) weakReference.get();
                    if (b0Var != null) {
                        b0Var.cancel();
                    }
                }
                this.f6194b.clear();
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public final C3428h<TResult> mo14679a(@NonNull Executor executor, @NonNull C3416b bVar) {
        this.f6189b.mo14676b(new C3439r(executor, bVar));
        mo14697s();
        return this;
    }

    @NonNull
    /* renamed from: b */
    public final C3428h<TResult> mo14680b(@NonNull Activity activity, @NonNull C3418c<TResult> cVar) {
        C3441t tVar = new C3441t(C3430j.f6198a, cVar);
        this.f6189b.mo14676b(tVar);
        C1827i b = LifecycleCallback.m10387b(new C1824h(activity));
        C3424a aVar = (C3424a) b.mo12077b("TaskOnStopCallback", C3424a.class);
        if (aVar == null) {
            aVar = new C3424a(b);
        }
        synchronized (aVar.f6194b) {
            aVar.f6194b.add(new WeakReference(tVar));
        }
        mo14697s();
        return this;
    }

    @NonNull
    /* renamed from: c */
    public final C3428h<TResult> mo14681c(@NonNull C3418c<TResult> cVar) {
        this.f6189b.mo14676b(new C3441t(C3430j.f6198a, cVar));
        mo14697s();
        return this;
    }

    @NonNull
    /* renamed from: d */
    public final C3428h<TResult> mo14682d(@NonNull Executor executor, @NonNull C3420d dVar) {
        this.f6189b.mo14676b(new C3443v(executor, dVar));
        mo14697s();
        return this;
    }

    @NonNull
    /* renamed from: e */
    public final C3428h<TResult> mo14683e(@NonNull Executor executor, @NonNull C3422e<? super TResult> eVar) {
        this.f6189b.mo14676b(new C3445x(executor, eVar));
        mo14697s();
        return this;
    }

    @NonNull
    /* renamed from: f */
    public final <TContinuationResult> C3428h<TContinuationResult> mo14684f(@NonNull C3414a<TResult, TContinuationResult> aVar) {
        return mo14685g(C3430j.f6198a, aVar);
    }

    @NonNull
    /* renamed from: g */
    public final <TContinuationResult> C3428h<TContinuationResult> mo14685g(@NonNull Executor executor, @NonNull C3414a<TResult, TContinuationResult> aVar) {
        C3423e0 e0Var = new C3423e0();
        this.f6189b.mo14676b(new C3435n(executor, aVar, e0Var));
        mo14697s();
        return e0Var;
    }

    @NonNull
    /* renamed from: h */
    public final <TContinuationResult> C3428h<TContinuationResult> mo14686h(@NonNull Executor executor, @NonNull C3414a<TResult, C3428h<TContinuationResult>> aVar) {
        C3423e0 e0Var = new C3423e0();
        this.f6189b.mo14676b(new C3437p(executor, aVar, e0Var));
        mo14697s();
        return e0Var;
    }

    @Nullable
    /* renamed from: i */
    public final Exception mo14687i() {
        Exception exc;
        synchronized (this.f6188a) {
            exc = this.f6193f;
        }
        return exc;
    }

    /* renamed from: j */
    public final TResult mo14688j() {
        TResult tresult;
        synchronized (this.f6188a) {
            C0823f.m386o(this.f6190c, "Task is not yet complete");
            if (this.f6191d) {
                throw new CancellationException("Task is already canceled.");
            } else if (this.f6193f == null) {
                tresult = this.f6192e;
            } else {
                throw new C3425f(this.f6193f);
            }
        }
        return tresult;
    }

    /* renamed from: k */
    public final <X extends Throwable> TResult mo14689k(@NonNull Class<X> cls) {
        TResult tresult;
        synchronized (this.f6188a) {
            C0823f.m386o(this.f6190c, "Task is not yet complete");
            if (this.f6191d) {
                throw new CancellationException("Task is already canceled.");
            } else if (cls.isInstance(this.f6193f)) {
                throw ((Throwable) cls.cast(this.f6193f));
            } else if (this.f6193f == null) {
                tresult = this.f6192e;
            } else {
                throw new C3425f(this.f6193f);
            }
        }
        return tresult;
    }

    /* renamed from: l */
    public final boolean mo14690l() {
        return this.f6191d;
    }

    /* renamed from: m */
    public final boolean mo14691m() {
        boolean z;
        synchronized (this.f6188a) {
            z = this.f6190c;
        }
        return z;
    }

    /* renamed from: n */
    public final boolean mo14692n() {
        boolean z;
        synchronized (this.f6188a) {
            z = this.f6190c && !this.f6191d && this.f6193f == null;
        }
        return z;
    }

    @NonNull
    /* renamed from: o */
    public final <TContinuationResult> C3428h<TContinuationResult> mo14693o(Executor executor, C3427g<TResult, TContinuationResult> gVar) {
        C3423e0 e0Var = new C3423e0();
        this.f6189b.mo14676b(new C3447z(executor, gVar, e0Var));
        mo14697s();
        return e0Var;
    }

    /* renamed from: p */
    public final void mo14694p(@NonNull Exception exc) {
        C0823f.m380l(exc, "Exception must not be null");
        synchronized (this.f6188a) {
            C0823f.m386o(!this.f6190c, "Task is already complete");
            this.f6190c = true;
            this.f6193f = exc;
        }
        this.f6189b.mo14675a(this);
    }

    /* renamed from: q */
    public final void mo14695q(TResult tresult) {
        synchronized (this.f6188a) {
            C0823f.m386o(!this.f6190c, "Task is already complete");
            this.f6190c = true;
            this.f6192e = tresult;
        }
        this.f6189b.mo14675a(this);
    }

    /* renamed from: r */
    public final boolean mo14696r() {
        synchronized (this.f6188a) {
            if (this.f6190c) {
                return false;
            }
            this.f6190c = true;
            this.f6191d = true;
            this.f6189b.mo14675a(this);
            return true;
        }
    }

    /* renamed from: s */
    public final void mo14697s() {
        synchronized (this.f6188a) {
            if (this.f6190c) {
                this.f6189b.mo14675a(this);
            }
        }
    }
}
