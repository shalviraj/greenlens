package p005b.p265m.p266a.p267t;

import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceHolder;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p265m.p266a.C4729r;

/* renamed from: b.m.a.t.d */
public class C4738d {

    /* renamed from: n */
    public static final String f9053n = "d";

    /* renamed from: a */
    public C4747h f9054a;

    /* renamed from: b */
    public C4746g f9055b;

    /* renamed from: c */
    public C4743e f9056c;

    /* renamed from: d */
    public Handler f9057d;

    /* renamed from: e */
    public C4749j f9058e;

    /* renamed from: f */
    public boolean f9059f = false;

    /* renamed from: g */
    public boolean f9060g = true;

    /* renamed from: h */
    public Handler f9061h;

    /* renamed from: i */
    public C4745f f9062i = new C4745f();

    /* renamed from: j */
    public Runnable f9063j = new C4739a();

    /* renamed from: k */
    public Runnable f9064k = new C4740b();

    /* renamed from: l */
    public Runnable f9065l = new C4741c();

    /* renamed from: m */
    public Runnable f9066m = new C4742d();

    /* renamed from: b.m.a.t.d$a */
    public class C4739a implements Runnable {
        public C4739a() {
        }

        public void run() {
            try {
                Log.d(C4738d.f9053n, "Opening camera");
                C4738d.this.f9056c.mo16474d();
            } catch (Exception e) {
                C4738d.m8703a(C4738d.this, e);
                Log.e(C4738d.f9053n, "Failed to open camera", e);
            }
        }
    }

    /* renamed from: b.m.a.t.d$b */
    public class C4740b implements Runnable {
        public C4740b() {
        }

        public void run() {
            C4729r rVar;
            try {
                Log.d(C4738d.f9053n, "Configuring camera");
                C4738d.this.f9056c.mo16472b();
                C4738d dVar = C4738d.this;
                Handler handler = dVar.f9057d;
                if (handler != null) {
                    C4743e eVar = dVar.f9056c;
                    if (eVar.f9081j == null) {
                        rVar = null;
                    } else {
                        boolean c = eVar.mo16473c();
                        rVar = eVar.f9081j;
                        if (c) {
                            rVar = new C4729r(rVar.f9030h, rVar.f9029g);
                        }
                    }
                    handler.obtainMessage(R.id.zxing_prewiew_size_ready, rVar).sendToTarget();
                }
            } catch (Exception e) {
                C4738d.m8703a(C4738d.this, e);
                Log.e(C4738d.f9053n, "Failed to configure camera", e);
            }
        }
    }

    /* renamed from: b.m.a.t.d$c */
    public class C4741c implements Runnable {
        public C4741c() {
        }

        public void run() {
            try {
                Log.d(C4738d.f9053n, "Starting preview");
                C4738d dVar = C4738d.this;
                C4743e eVar = dVar.f9056c;
                C4746g gVar = dVar.f9055b;
                Camera camera = eVar.f9072a;
                SurfaceHolder surfaceHolder = gVar.f9089a;
                if (surfaceHolder != null) {
                    camera.setPreviewDisplay(surfaceHolder);
                } else {
                    camera.setPreviewTexture(gVar.f9090b);
                }
                C4738d.this.f9056c.mo16477g();
            } catch (Exception e) {
                C4738d.m8703a(C4738d.this, e);
                Log.e(C4738d.f9053n, "Failed to start preview", e);
            }
        }
    }

    /* renamed from: b.m.a.t.d$d */
    public class C4742d implements Runnable {
        public C4742d() {
        }

        public void run() {
            try {
                Log.d(C4738d.f9053n, "Closing camera");
                C4743e eVar = C4738d.this.f9056c;
                C4731a aVar = eVar.f9074c;
                if (aVar != null) {
                    aVar.mo16460c();
                    eVar.f9074c = null;
                }
                if (eVar.f9075d != null) {
                    eVar.f9075d = null;
                }
                Camera camera = eVar.f9072a;
                if (camera != null && eVar.f9076e) {
                    camera.stopPreview();
                    eVar.f9084m.f9085a = null;
                    eVar.f9076e = false;
                }
                C4743e eVar2 = C4738d.this.f9056c;
                Camera camera2 = eVar2.f9072a;
                if (camera2 != null) {
                    camera2.release();
                    eVar2.f9072a = null;
                }
            } catch (Exception e) {
                Log.e(C4738d.f9053n, "Failed to close camera", e);
            }
            C4738d dVar = C4738d.this;
            dVar.f9060g = true;
            dVar.f9057d.sendEmptyMessage(R.id.zxing_camera_closed);
            C4747h hVar = C4738d.this.f9054a;
            synchronized (hVar.f9095d) {
                int i = hVar.f9094c - 1;
                hVar.f9094c = i;
                if (i == 0) {
                    synchronized (hVar.f9095d) {
                        hVar.f9093b.quit();
                        hVar.f9093b = null;
                        hVar.f9092a = null;
                    }
                }
            }
        }
    }

    public C4738d(Context context) {
        C1960d.m2750S0();
        if (C4747h.f9091e == null) {
            C4747h.f9091e = new C4747h();
        }
        this.f9054a = C4747h.f9091e;
        C4743e eVar = new C4743e(context);
        this.f9056c = eVar;
        eVar.f9078g = this.f9062i;
        this.f9061h = new Handler();
    }

    /* renamed from: a */
    public static void m8703a(C4738d dVar, Exception exc) {
        Handler handler = dVar.f9057d;
        if (handler != null) {
            handler.obtainMessage(R.id.zxing_camera_error, exc).sendToTarget();
        }
    }
}
