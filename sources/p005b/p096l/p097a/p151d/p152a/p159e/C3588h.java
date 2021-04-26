package p005b.p096l.p097a.p151d.p152a.p159e;

import android.os.IBinder;
import android.os.RemoteException;
import p005b.p096l.p097a.p151d.p152a.p163i.C3647n;

/* renamed from: b.l.a.d.a.e.h */
public final /* synthetic */ class C3588h implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final C3604p f6652a;

    public C3588h(C3604p pVar) {
        this.f6652a = pVar;
    }

    public final void binderDied() {
        C3604p pVar = this.f6652a;
        pVar.f6664b.mo14884b(4, "reportBinderDeath", new Object[0]);
        C3594k kVar = (C3594k) pVar.f6670h.get();
        if (kVar == null) {
            pVar.f6664b.mo14884b(4, "%s : Binder has died.", new Object[]{pVar.f6665c});
            for (C3586g gVar : pVar.f6666d) {
                RemoteException remoteException = new RemoteException(String.valueOf(pVar.f6665c).concat(" : Binder has died."));
                C3647n<?> nVar = gVar.f6649g;
                if (nVar != null) {
                    nVar.mo14928a(remoteException);
                }
            }
            pVar.f6666d.clear();
            return;
        }
        pVar.f6664b.mo14884b(4, "calling onBinderDied", new Object[0]);
        kVar.mo14894a();
    }
}
