package p005b.p265m.p266a.p267t;

import android.hardware.Camera;
import android.util.Log;
import p005b.p265m.p266a.p267t.C4743e;

/* renamed from: b.m.a.t.c */
public class C4736c implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ C4752m f9050g;

    /* renamed from: h */
    public final /* synthetic */ C4738d f9051h;

    /* renamed from: b.m.a.t.c$a */
    public class C4737a implements Runnable {
        public C4737a() {
        }

        public void run() {
            C4736c cVar = C4736c.this;
            C4743e eVar = cVar.f9051h.f9056c;
            C4752m mVar = cVar.f9050g;
            Camera camera = eVar.f9072a;
            if (camera != null && eVar.f9076e) {
                C4743e.C4744a aVar = eVar.f9084m;
                aVar.f9085a = mVar;
                camera.setOneShotPreviewCallback(aVar);
            }
        }
    }

    public C4736c(C4738d dVar, C4752m mVar) {
        this.f9051h = dVar;
        this.f9050g = mVar;
    }

    public void run() {
        C4738d dVar = this.f9051h;
        if (!dVar.f9059f) {
            Log.d(C4738d.f9053n, "Camera is closed, not requesting preview");
        } else {
            dVar.f9054a.mo16480b(new C4737a());
        }
    }
}
