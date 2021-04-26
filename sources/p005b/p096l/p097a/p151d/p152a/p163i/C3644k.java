package p005b.p096l.p097a.p151d.p152a.p163i;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* renamed from: b.l.a.d.a.i.k */
public final class C3644k<ResultT> implements C3645l<ResultT> {

    /* renamed from: a */
    public final Executor f6716a;

    /* renamed from: b */
    public final Object f6717b = new Object();
    @Nullable

    /* renamed from: c */
    public final C3636c<? super ResultT> f6718c;

    public C3644k(Executor executor, C3636c<? super ResultT> cVar) {
        this.f6716a = executor;
        this.f6718c = cVar;
    }

    /* renamed from: a */
    public final void mo14923a(C3651r<ResultT> rVar) {
        if (rVar.mo14938g()) {
            synchronized (this.f6717b) {
                if (this.f6718c != null) {
                    this.f6716a.execute(new C3643j(this, rVar));
                }
            }
        }
    }
}
