package p005b.p096l.p180d.p213v;

import android.util.Log;

/* renamed from: b.l.d.v.l */
public final /* synthetic */ class C4253l implements Runnable {

    /* renamed from: g */
    public final C4245h f7876g;

    /* renamed from: h */
    public final C4255m f7877h;

    public C4253l(C4245h hVar, C4255m mVar) {
        this.f7876g = hVar;
        this.f7877h = mVar;
    }

    public final void run() {
        C4245h hVar = this.f7876g;
        int i = this.f7877h.f7879a;
        synchronized (hVar) {
            C4255m mVar = hVar.f7860e.get(i);
            if (mVar != null) {
                StringBuilder sb = new StringBuilder(31);
                sb.append("Timing out request: ");
                sb.append(i);
                Log.w("MessengerIpcClient", sb.toString());
                hVar.f7860e.remove(i);
                mVar.mo15848b(new C4262p(3, "Timed out waiting for response"));
                hVar.mo15834c();
            }
        }
    }
}
