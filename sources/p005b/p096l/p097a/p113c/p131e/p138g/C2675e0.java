package p005b.p096l.p097a.p113c.p131e.p138g;

import com.google.android.gms.common.api.GoogleApiClient;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1830j;
import p005b.p096l.p097a.p113c.p141f.C3049a;

/* renamed from: b.l.a.c.e.g.e0 */
public final class C2675e0 extends C2668b {

    /* renamed from: q */
    public final /* synthetic */ C3049a f4562q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2675e0(GoogleApiClient googleApiClient, C3049a aVar) {
        super(googleApiClient);
        this.f4562q = aVar;
    }

    /* renamed from: j */
    public final void mo12072j(C1770a.C1772b bVar) {
        C3049a aVar = this.f4562q;
        String simpleName = C3049a.class.getSimpleName();
        C0823f.m380l(aVar, "Listener must not be null");
        C0823f.m380l(simpleName, "Listener type must not be null");
        C0823f.m374i(simpleName, "Listener type must not be empty");
        C1830j.C1831a aVar2 = new C1830j.C1831a(aVar, simpleName);
        C2670c cVar = new C2670c(this);
        C2681k kVar = ((C2686p) bVar).f4571F;
        kVar.f4563a.mo13190a();
        C0823f.m380l(aVar2, "Invalid null listener key");
        synchronized (kVar.f4566d) {
            C2684n remove = kVar.f4566d.remove(aVar2);
            if (remove != null) {
                synchronized (remove) {
                    remove.f4569b.f3231b = null;
                }
                ((C2679i) kVar.f4563a.mo13191b()).mo13175p0(C2690t.m4525V(remove, cVar));
            }
        }
    }
}
