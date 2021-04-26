package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p124n.C1955a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.hg */
public final class C2213hg implements C2116dj<C2143el> {

    /* renamed from: a */
    public final /* synthetic */ C2648zh f3918a;

    public C2213hg(C2648zh zhVar) {
        this.f3918a = zhVar;
    }

    /* renamed from: a */
    public final void mo12389a(Object obj) {
        C2648zh zhVar = this.f3918a;
        String str = ((C2143el) obj).f3832g;
        Objects.requireNonNull(zhVar);
        try {
            zhVar.f4530a.mo12408m0(str);
        } catch (RemoteException e) {
            C1955a aVar = zhVar.f4531b;
            Log.e(aVar.f3501a, aVar.mo12284c("RemoteException when sending set account info response.", new Object[0]), e);
        }
    }

    /* renamed from: d */
    public final void mo12390d(@Nullable String str) {
        this.f3918a.mo12771f(C1960d.m2768Y0(str));
    }
}
