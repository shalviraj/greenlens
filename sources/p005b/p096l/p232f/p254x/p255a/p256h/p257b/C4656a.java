package p005b.p096l.p232f.p254x.p255a.p256h.p257b;

import android.hardware.Camera;
import android.util.Log;

/* renamed from: b.l.f.x.a.h.b.a */
public final class C4656a {

    /* renamed from: a */
    public static final String f8784a = "b.l.f.x.a.h.b.a";

    /* renamed from: a */
    public static int m8564a(int i) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w(f8784a, "No cameras!");
            return -1;
        }
        boolean z = i >= 0;
        if (!z) {
            i = 0;
            while (i < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i++;
            }
        }
        return i < numberOfCameras ? i : z ? -1 : 0;
    }
}
