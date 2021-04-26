package p005b.p265m.p266a.p267t;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import app.bravostudio.A01F41WRYKPX5KXQ68EGF1JX39R.R;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p232f.p254x.p255a.C4644b;
import p005b.p096l.p232f.p254x.p255a.p256h.C4655a;
import p005b.p096l.p232f.p254x.p255a.p256h.p257b.C4656a;
import p005b.p265m.p266a.C4719j;
import p005b.p265m.p266a.C4729r;
import p005b.p265m.p266a.C4730s;

/* renamed from: b.m.a.t.e */
public final class C4743e {

    /* renamed from: n */
    public static final String f9071n = "e";

    /* renamed from: a */
    public Camera f9072a;

    /* renamed from: b */
    public Camera.CameraInfo f9073b;

    /* renamed from: c */
    public C4731a f9074c;

    /* renamed from: d */
    public C4644b f9075d;

    /* renamed from: e */
    public boolean f9076e;

    /* renamed from: f */
    public String f9077f;

    /* renamed from: g */
    public C4745f f9078g = new C4745f();

    /* renamed from: h */
    public C4749j f9079h;

    /* renamed from: i */
    public C4729r f9080i;

    /* renamed from: j */
    public C4729r f9081j;

    /* renamed from: k */
    public int f9082k = -1;

    /* renamed from: l */
    public Context f9083l;

    /* renamed from: m */
    public final C4744a f9084m;

    /* renamed from: b.m.a.t.e$a */
    public final class C4744a implements Camera.PreviewCallback {

        /* renamed from: a */
        public C4752m f9085a;

        /* renamed from: b */
        public C4729r f9086b;

        public C4744a() {
        }

        public void onPreviewFrame(byte[] bArr, Camera camera) {
            Exception e;
            C4729r rVar = this.f9086b;
            C4752m mVar = this.f9085a;
            if (rVar == null || mVar == null) {
                Log.d(C4743e.f9071n, "Got preview callback, but no handler or resolution available");
                if (mVar != null) {
                    e = new Exception("No resolution available");
                } else {
                    return;
                }
            } else if (bArr != null) {
                try {
                    byte[] bArr2 = bArr;
                    C4730s sVar = new C4730s(bArr2, rVar.f9029g, rVar.f9030h, camera.getParameters().getPreviewFormat(), C4743e.this.f9082k);
                    if (C4743e.this.f9073b.facing == 1) {
                        sVar.f9035e = true;
                    }
                    C4719j.C4721b bVar = (C4719j.C4721b) mVar;
                    synchronized (C4719j.this.f9011h) {
                        C4719j jVar = C4719j.this;
                        if (jVar.f9010g) {
                            jVar.f9006c.obtainMessage(R.id.zxing_decode, sVar).sendToTarget();
                        }
                    }
                    return;
                } catch (RuntimeException e2) {
                    e = e2;
                    Log.e(C4743e.f9071n, "Camera preview failed", e);
                }
            } else {
                throw new NullPointerException("No preview data received");
            }
            ((C4719j.C4721b) mVar).mo16450a(e);
        }
    }

    public C4743e(Context context) {
        this.f9083l = context;
        this.f9084m = new C4744a();
    }

    /* renamed from: a */
    public final int mo16471a() {
        int i = this.f9079h.f9098b;
        int i2 = 0;
        if (i != 0) {
            if (i == 1) {
                i2 = 90;
            } else if (i == 2) {
                i2 = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
            } else if (i == 3) {
                i2 = 270;
            }
        }
        Camera.CameraInfo cameraInfo = this.f9073b;
        int i3 = cameraInfo.facing;
        int i4 = cameraInfo.orientation;
        int i5 = (i3 == 1 ? 360 - ((i4 + i2) % 360) : (i4 - i2) + 360) % 360;
        String str = f9071n;
        Log.i(str, "Camera Display Orientation: " + i5);
        return i5;
    }

    /* renamed from: b */
    public void mo16472b() {
        if (this.f9072a != null) {
            try {
                int a = mo16471a();
                this.f9082k = a;
                this.f9072a.setDisplayOrientation(a);
            } catch (Exception unused) {
                Log.w(f9071n, "Failed to set rotation.");
            }
            try {
                mo16475e(false);
            } catch (Exception unused2) {
                try {
                    mo16475e(true);
                } catch (Exception unused3) {
                    Log.w(f9071n, "Camera rejected even safe-mode parameters! No configuration");
                }
            }
            Camera.Size previewSize = this.f9072a.getParameters().getPreviewSize();
            if (previewSize == null) {
                this.f9081j = this.f9080i;
            } else {
                this.f9081j = new C4729r(previewSize.width, previewSize.height);
            }
            this.f9084m.f9086b = this.f9081j;
            return;
        }
        throw new RuntimeException("Camera not open");
    }

    /* renamed from: c */
    public boolean mo16473c() {
        int i = this.f9082k;
        if (i != -1) {
            return i % BaseTransientBottomBar.ANIMATION_FADE_DURATION != 0;
        }
        throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
    }

    /* renamed from: d */
    public void mo16474d() {
        int a = C4656a.m8564a(this.f9078g.f9088a);
        Camera open = a == -1 ? null : Camera.open(a);
        this.f9072a = open;
        if (open != null) {
            int a2 = C4656a.m8564a(this.f9078g.f9088a);
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            this.f9073b = cameraInfo;
            Camera.getCameraInfo(a2, cameraInfo);
            return;
        }
        throw new RuntimeException("Failed to open camera");
    }

    /* renamed from: e */
    public final void mo16475e(boolean z) {
        String str;
        String str2;
        Camera.Parameters parameters = this.f9072a.getParameters();
        String str3 = this.f9077f;
        if (str3 == null) {
            this.f9077f = parameters.flatten();
        } else {
            parameters.unflatten(str3);
        }
        if (parameters == null) {
            Log.w(f9071n, "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        String str4 = f9071n;
        StringBuilder u = C0843a.m460u("Initial camera parameters: ");
        u.append(parameters.flatten());
        Log.i(str4, u.toString());
        if (z) {
            Log.w(str4, "In camera config safe mode -- most settings will not be honored");
        }
        Objects.requireNonNull(this.f9078g);
        int i = C4655a.f8783a;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        String a = C4655a.m8562a("focus mode", supportedFocusModes, "auto");
        if (!z && a == null) {
            a = C4655a.m8562a("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (a != null) {
            if (a.equals(parameters.getFocusMode())) {
                Log.i("CameraConfiguration", "Focus mode already set to " + a);
            } else {
                parameters.setFocusMode(a);
            }
        }
        if (!z) {
            C4655a.m8563b(parameters, false);
            Objects.requireNonNull(this.f9078g);
            Objects.requireNonNull(this.f9078g);
            Objects.requireNonNull(this.f9078g);
        }
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                arrayList.add(new C4729r(previewSize.width, previewSize.height));
            }
        } else {
            for (Camera.Size next : supportedPreviewSizes) {
                arrayList.add(new C4729r(next.width, next.height));
            }
        }
        int[] iArr = null;
        if (arrayList.size() == 0) {
            this.f9080i = null;
        } else {
            C4749j jVar = this.f9079h;
            boolean c = mo16473c();
            C4729r rVar = jVar.f9097a;
            if (rVar == null) {
                rVar = null;
            } else if (c) {
                rVar = new C4729r(rVar.f9030h, rVar.f9029g);
            }
            C4754o oVar = jVar.f9099c;
            Objects.requireNonNull(oVar);
            if (rVar != null) {
                Collections.sort(arrayList, new C4753n(oVar, rVar));
            }
            String str5 = C4754o.f9103a;
            Log.i(str5, "Viewfinder size: " + rVar);
            Log.i(str5, "Preview in order of preference: " + arrayList);
            C4729r rVar2 = (C4729r) arrayList.get(0);
            this.f9080i = rVar2;
            parameters.setPreviewSize(rVar2.f9029g, rVar2.f9030h);
        }
        if (Build.DEVICE.equals("glass-1")) {
            List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
            StringBuilder u2 = C0843a.m460u("Supported FPS ranges: ");
            if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.isEmpty()) {
                str = "[]";
            } else {
                StringBuilder t = C0843a.m459t('[');
                Iterator<int[]> it = supportedPreviewFpsRange.iterator();
                while (it.hasNext()) {
                    t.append(Arrays.toString(it.next()));
                    if (it.hasNext()) {
                        t.append(", ");
                    }
                }
                t.append(']');
                str = t.toString();
            }
            u2.append(str);
            Log.i("CameraConfiguration", u2.toString());
            if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
                Iterator<int[]> it2 = supportedPreviewFpsRange.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    int[] next2 = it2.next();
                    int i2 = next2[0];
                    int i3 = next2[1];
                    if (i2 >= 10000 && i3 <= 20000) {
                        iArr = next2;
                        break;
                    }
                }
                if (iArr == null) {
                    str2 = "No suitable FPS range?";
                } else {
                    int[] iArr2 = new int[2];
                    parameters.getPreviewFpsRange(iArr2);
                    if (Arrays.equals(iArr2, iArr)) {
                        StringBuilder u3 = C0843a.m460u("FPS range already set to ");
                        u3.append(Arrays.toString(iArr));
                        str2 = u3.toString();
                    } else {
                        StringBuilder u4 = C0843a.m460u("Setting FPS range to ");
                        u4.append(Arrays.toString(iArr));
                        Log.i("CameraConfiguration", u4.toString());
                        parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                    }
                }
                Log.i("CameraConfiguration", str2);
            }
        }
        String str6 = f9071n;
        StringBuilder u5 = C0843a.m460u("Final camera parameters: ");
        u5.append(parameters.flatten());
        Log.i(str6, u5.toString());
        this.f9072a.setParameters(parameters);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        r0 = r0.getFlashMode();
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16476f(boolean r4) {
        /*
            r3 = this;
            android.hardware.Camera r0 = r3.f9072a
            if (r0 == 0) goto L_0x0052
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch:{ RuntimeException -> 0x004a }
            r1 = 0
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = r0.getFlashMode()     // Catch:{ RuntimeException -> 0x004a }
            if (r0 == 0) goto L_0x0023
            java.lang.String r2 = "on"
            boolean r2 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x004a }
            if (r2 != 0) goto L_0x0021
            java.lang.String r2 = "torch"
            boolean r0 = r2.equals(r0)     // Catch:{ RuntimeException -> 0x004a }
            if (r0 == 0) goto L_0x0023
        L_0x0021:
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = r1
        L_0x0024:
            if (r4 == r0) goto L_0x0052
            b.m.a.t.a r0 = r3.f9074c     // Catch:{ RuntimeException -> 0x004a }
            if (r0 == 0) goto L_0x002d
            r0.mo16460c()     // Catch:{ RuntimeException -> 0x004a }
        L_0x002d:
            android.hardware.Camera r0 = r3.f9072a     // Catch:{ RuntimeException -> 0x004a }
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch:{ RuntimeException -> 0x004a }
            p005b.p096l.p232f.p254x.p255a.p256h.C4655a.m8563b(r0, r4)     // Catch:{ RuntimeException -> 0x004a }
            b.m.a.t.f r4 = r3.f9078g     // Catch:{ RuntimeException -> 0x004a }
            java.util.Objects.requireNonNull(r4)     // Catch:{ RuntimeException -> 0x004a }
            android.hardware.Camera r4 = r3.f9072a     // Catch:{ RuntimeException -> 0x004a }
            r4.setParameters(r0)     // Catch:{ RuntimeException -> 0x004a }
            b.m.a.t.a r4 = r3.f9074c     // Catch:{ RuntimeException -> 0x004a }
            if (r4 == 0) goto L_0x0052
            r4.f9038a = r1     // Catch:{ RuntimeException -> 0x004a }
            r4.mo16459b()     // Catch:{ RuntimeException -> 0x004a }
            goto L_0x0052
        L_0x004a:
            r4 = move-exception
            java.lang.String r0 = f9071n
            java.lang.String r1 = "Failed to set torch"
            android.util.Log.e(r0, r1, r4)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p265m.p266a.p267t.C4743e.mo16476f(boolean):void");
    }

    /* renamed from: g */
    public void mo16477g() {
        Camera camera = this.f9072a;
        if (camera != null && !this.f9076e) {
            camera.startPreview();
            this.f9076e = true;
            this.f9074c = new C4731a(this.f9072a, this.f9078g);
            Context context = this.f9083l;
            C4745f fVar = this.f9078g;
            this.f9075d = new C4644b(context, this, fVar);
            Objects.requireNonNull(fVar);
        }
    }
}
