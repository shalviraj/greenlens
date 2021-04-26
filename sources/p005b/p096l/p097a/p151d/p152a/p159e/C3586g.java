package p005b.p096l.p097a.p151d.p152a.p159e;

import androidx.annotation.Nullable;
import p005b.p096l.p097a.p151d.p152a.p163i.C3647n;

/* renamed from: b.l.a.d.a.e.g */
public abstract class C3586g implements Runnable {
    @Nullable

    /* renamed from: g */
    public final C3647n<?> f6649g;

    public C3586g() {
        this.f6649g = null;
    }

    public C3586g(@Nullable C3647n<?> nVar) {
        this.f6649g = nVar;
    }

    /* renamed from: a */
    public abstract void mo14738a();

    public final void run() {
        try {
            mo14738a();
        } catch (Exception e) {
            C3647n<?> nVar = this.f6649g;
            if (nVar != null) {
                nVar.mo14928a(e);
            }
        }
    }
}
