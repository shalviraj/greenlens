package p005b.p096l.p097a.p151d.p152a.p154b;

import android.os.Bundle;
import p005b.p096l.p097a.p151d.p152a.p163i.C3647n;

/* renamed from: b.l.a.d.a.b.k */
public final class C3510k extends C3498h<Void> {

    /* renamed from: c */
    public final /* synthetic */ C3518m f6455c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3510k(C3518m mVar, C3647n<Void> nVar) {
        super(mVar, nVar);
        this.f6455c = mVar;
    }

    /* renamed from: d0 */
    public final void mo14780d0(Bundle bundle, Bundle bundle2) {
        super.mo14780d0(bundle, bundle2);
        if (!this.f6455c.f6473e.compareAndSet(true, false)) {
            C3518m.f6467f.mo14884b(5, "Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f6455c.mo14760c();
        }
    }
}
