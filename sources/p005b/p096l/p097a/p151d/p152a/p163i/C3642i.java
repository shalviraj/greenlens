package p005b.p096l.p097a.p151d.p152a.p163i;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* renamed from: b.l.a.d.a.i.i */
public final class C3642i<ResultT> implements C3645l<ResultT> {

    /* renamed from: a */
    public final Executor f6711a;

    /* renamed from: b */
    public final Object f6712b = new Object();
    @Nullable

    /* renamed from: c */
    public final C3635b f6713c;

    public C3642i(Executor executor, C3635b bVar) {
        this.f6711a = executor;
        this.f6713c = bVar;
    }

    /* renamed from: a */
    public final void mo14923a(C3651r<ResultT> rVar) {
        if (!rVar.mo14938g()) {
            synchronized (this.f6712b) {
                if (this.f6713c != null) {
                    this.f6711a.execute(new C3641h(this, rVar));
                }
            }
        }
    }
}
