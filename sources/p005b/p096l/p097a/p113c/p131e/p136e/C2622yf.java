package p005b.p096l.p097a.p113c.p131e.p136e;

import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p119b.p124n.C1955a;

/* renamed from: b.l.a.c.e.e.yf */
public final class C2622yf implements C2116dj<Void> {

    /* renamed from: a */
    public final /* synthetic */ C2116dj f4494a;

    /* renamed from: b */
    public final /* synthetic */ C2646zf f4495b;

    public C2622yf(C2646zf zfVar, C2116dj djVar) {
        this.f4495b = zfVar;
        this.f4494a = djVar;
    }

    /* renamed from: a */
    public final void mo12389a(Object obj) {
        Void voidR = (Void) obj;
        C2648zh zhVar = this.f4495b.f4527a;
        Objects.requireNonNull(zhVar);
        try {
            zhVar.f4530a.mo12400f();
        } catch (RemoteException e) {
            C1955a aVar = zhVar.f4531b;
            Log.e(aVar.f3501a, aVar.mo12284c("RemoteException when sending delete account response.", new Object[0]), e);
        }
    }

    /* renamed from: d */
    public final void mo12390d(@Nullable String str) {
        this.f4494a.mo12390d(str);
    }
}
