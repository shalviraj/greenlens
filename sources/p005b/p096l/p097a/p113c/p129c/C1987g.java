package p005b.p096l.p097a.p113c.p129c;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p129c.C1978a;
import p005b.p096l.p097a.p113c.p142g.C3071b;
import p005b.p096l.p097a.p113c.p142g.p143f.C3087k;
import p005b.p096l.p097a.p113c.p142g.p144g.C3096d;

/* renamed from: b.l.a.c.c.g */
public final class C1987g implements C1978a.C1979a {

    /* renamed from: a */
    public final /* synthetic */ Bundle f3550a;

    /* renamed from: b */
    public final /* synthetic */ C1978a f3551b;

    public C1987g(C1978a aVar, Bundle bundle) {
        this.f3551b = aVar;
        this.f3550a = bundle;
    }

    /* renamed from: a */
    public final void mo12305a(C1983c cVar) {
        T t = this.f3551b.f3544a;
        Bundle bundle = this.f3550a;
        C3071b.C3072a aVar = (C3071b.C3072a) t;
        Objects.requireNonNull(aVar);
        try {
            Bundle bundle2 = new Bundle();
            C3087k.m5775b(bundle, bundle2);
            aVar.f5210b.mo14038g1(bundle2);
            C3087k.m5775b(bundle2, bundle);
            aVar.f5211c = (View) C1984d.m2900n(aVar.f5210b.mo14039n0());
            aVar.f5209a.removeAllViews();
            aVar.f5209a.addView(aVar.f5211c);
        } catch (RemoteException e) {
            throw new C3096d(e);
        }
    }
}
