package p005b.p096l.p097a.p113c.p131e.p138g;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import p005b.p096l.p097a.p113c.p119b.p122m.C1905d;

/* renamed from: b.l.a.c.e.g.p */
public final class C2686p extends C2693w {

    /* renamed from: F */
    public final C2681k f4571F;

    public C2686p(Context context, Looper looper, GoogleApiClient.C5470b bVar, GoogleApiClient.C5471c cVar, String str, C1905d dVar) {
        super(context, looper, bVar, cVar, str, dVar);
        this.f4571F = new C2681k(context, this.f4588E);
    }

    /* renamed from: b */
    public final void mo12199b() {
        synchronized (this.f4571F) {
            if (mo12198a()) {
                try {
                    this.f4571F.mo13176a();
                    this.f4571F.mo13178c();
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.mo12199b();
        }
    }
}
