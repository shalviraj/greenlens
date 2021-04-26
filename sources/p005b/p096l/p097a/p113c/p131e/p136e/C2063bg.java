package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p124n.C1955a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.bg */
public final class C2063bg implements C2116dj<C2315lk> {

    /* renamed from: a */
    public final /* synthetic */ C2648zh f3646a;

    public C2063bg(C2648zh zhVar) {
        this.f3646a = zhVar;
    }

    /* renamed from: a */
    public final void mo12389a(Object obj) {
        C2315lk lkVar = (C2315lk) obj;
        C2648zh zhVar = this.f3646a;
        Objects.requireNonNull(zhVar);
        try {
            zhVar.f4530a.mo12402h();
        } catch (RemoteException e) {
            C1955a aVar = zhVar.f4531b;
            Log.e(aVar.f3501a, aVar.mo12284c("RemoteException when sending email verification response.", new Object[0]), e);
        }
    }

    /* renamed from: d */
    public final void mo12390d(String str) {
        this.f3646a.mo12771f(C1960d.m2768Y0(str));
    }
}
