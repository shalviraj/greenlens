package p005b.p096l.p097a.p113c.p131e.p138g;

import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1830j;
import p005b.p096l.p097a.p113c.p141f.C3049a;

/* renamed from: b.l.a.c.e.g.d0 */
public final class C2673d0 extends C2668b {

    /* renamed from: q */
    public final /* synthetic */ LocationRequest f4560q;

    /* renamed from: r */
    public final /* synthetic */ C3049a f4561r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2673d0(GoogleApiClient googleApiClient, LocationRequest locationRequest, C3049a aVar) {
        super(googleApiClient);
        this.f4560q = locationRequest;
        this.f4561r = aVar;
    }

    /* renamed from: j */
    public final void mo12072j(C1770a.C1772b bVar) {
        C2686p pVar = (C2686p) bVar;
        C2670c cVar = new C2670c(this);
        LocationRequest locationRequest = this.f4560q;
        C3049a aVar = this.f4561r;
        C0823f.m386o(Looper.myLooper() != null, "Can't create handler inside thread that has not called Looper.prepare()");
        Looper myLooper = Looper.myLooper();
        String simpleName = C3049a.class.getSimpleName();
        C0823f.m380l(aVar, "Listener must not be null");
        C0823f.m380l(myLooper, "Looper must not be null");
        C0823f.m380l(simpleName, "Listener type must not be null");
        C1830j jVar = new C1830j(myLooper, aVar, simpleName);
        synchronized (pVar.f4571F) {
            pVar.f4571F.mo13177b(locationRequest, jVar, cVar);
        }
    }
}
