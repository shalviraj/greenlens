package p005b.p096l.p097a.p151d.p152a.p163i;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* renamed from: b.l.a.d.a.i.g */
public final class C3640g<ResultT> implements C3645l<ResultT> {

    /* renamed from: a */
    public final Executor f6706a;

    /* renamed from: b */
    public final Object f6707b = new Object();
    @Nullable

    /* renamed from: c */
    public final C3634a<ResultT> f6708c;

    public C3640g(Executor executor, C3634a<ResultT> aVar) {
        this.f6706a = executor;
        this.f6708c = aVar;
    }

    /* renamed from: a */
    public final void mo14923a(C3651r<ResultT> rVar) {
        synchronized (this.f6707b) {
            if (this.f6708c != null) {
                this.f6706a.execute(new C3639f(this, rVar));
            }
        }
    }
}
