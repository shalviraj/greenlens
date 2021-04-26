package p005b.p096l.p232f.p254x.p255a.p256h;

import android.hardware.Camera;
import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.f.x.a.h.a */
public final class C4655a {

    /* renamed from: a */
    public static final /* synthetic */ int f8783a = 0;

    static {
        Pattern.compile(";");
    }

    /* renamed from: a */
    public static String m8562a(String str, Collection<String> collection, String... strArr) {
        StringBuilder z = C0843a.m465z("Requesting ", str, " value from among: ");
        z.append(Arrays.toString(strArr));
        Log.i("CameraConfiguration", z.toString());
        Log.i("CameraConfiguration", "Supported " + str + " values: " + collection);
        if (collection != null) {
            for (String str2 : strArr) {
                if (collection.contains(str2)) {
                    Log.i("CameraConfiguration", "Can set " + str + " to: " + str2);
                    return str2;
                }
            }
        }
        Log.i("CameraConfiguration", "No supported values match");
        return null;
    }

    /* renamed from: b */
    public static void m8563b(Camera.Parameters parameters, boolean z) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String a = z ? m8562a("flash mode", supportedFlashModes, "torch", "on") : m8562a("flash mode", supportedFlashModes, "off");
        if (a == null) {
            return;
        }
        if (a.equals(parameters.getFlashMode())) {
            Log.i("CameraConfiguration", "Flash mode already set to " + a);
            return;
        }
        Log.i("CameraConfiguration", "Setting flash mode to " + a);
        parameters.setFlashMode(a);
    }
}
