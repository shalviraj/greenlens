package p005b.p096l.p097a.p113c.p129c;

import android.os.RemoteException;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p129c.C1978a;
import p005b.p096l.p097a.p113c.p142g.C3071b;
import p005b.p096l.p097a.p113c.p142g.p144g.C3096d;

/* renamed from: b.l.a.c.c.i */
public final class C1989i implements C1978a.C1979a {

    /* renamed from: a */
    public final /* synthetic */ C1978a f3554a;

    public C1989i(C1978a aVar) {
        this.f3554a = aVar;
    }

    /* renamed from: a */
    public final void mo12305a(C1983c cVar) {
        C3071b.C3072a aVar = (C3071b.C3072a) this.f3554a.f3544a;
        Objects.requireNonNull(aVar);
        try {
            aVar.f5210b.onResume();
        } catch (RemoteException e) {
            throw new C3096d(e);
        }
    }
}
