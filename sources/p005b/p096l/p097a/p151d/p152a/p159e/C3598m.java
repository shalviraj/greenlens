package p005b.p096l.p097a.p151d.p152a.p159e;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: b.l.a.d.a.e.m */
public final class C3598m extends C3586g {

    /* renamed from: h */
    public final /* synthetic */ IBinder f6658h;

    /* renamed from: i */
    public final /* synthetic */ C3602o f6659i;

    public C3598m(C3602o oVar, IBinder iBinder) {
        this.f6659i = oVar;
        this.f6658h = iBinder;
    }

    /* renamed from: a */
    public final void mo14738a() {
        C3604p pVar = this.f6659i.f6661a;
        pVar.f6673k = (IInterface) pVar.f6669g.mo14737a(this.f6658h);
        C3604p pVar2 = this.f6659i.f6661a;
        pVar2.f6664b.mo14884b(4, "linkToDeath", new Object[0]);
        try {
            pVar2.f6673k.asBinder().linkToDeath(pVar2.f6671i, 0);
        } catch (RemoteException e) {
            pVar2.f6664b.mo14883a(e, "linkToDeath failed", new Object[0]);
        }
        C3604p pVar3 = this.f6659i.f6661a;
        pVar3.f6667e = false;
        for (C3586g run : pVar3.f6666d) {
            run.run();
        }
        this.f6659i.f6661a.f6666d.clear();
    }
}
