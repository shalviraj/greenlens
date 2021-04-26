package p005b.p096l.p097a.p113c.p131e.p138g;

import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p141f.C3050b;

/* renamed from: b.l.a.c.e.g.c0 */
public final class C2671c0 {
    /* renamed from: a */
    public final Location mo13167a(GoogleApiClient googleApiClient) {
        boolean z = true;
        C0823f.m362c(true, "GoogleApiClient parameter is required.");
        C2686p pVar = (C2686p) googleApiClient.mo12141e(C3050b.f5190a);
        if (pVar == null) {
            z = false;
        }
        C0823f.m386o(z, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        try {
            C2681k kVar = pVar.f4571F;
            kVar.f4563a.mo13190a();
            return ((C2679i) kVar.f4563a.mo13191b()).mo13172d(kVar.f4564b.getPackageName());
        } catch (Exception unused) {
            return null;
        }
    }
}
