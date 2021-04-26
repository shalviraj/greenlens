package p005b.p040g.p041a.p046h;

import android.net.Uri;
import android.util.Log;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import com.amplitude.api.DeviceInfo;

/* renamed from: b.g.a.h.f */
public abstract class C0884f {

    /* renamed from: a */
    public static final String f753a = "f";

    /* renamed from: a */
    public static String m611a(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        if (!URLUtil.isValidUrl(str3)) {
            String str4 = f753a;
            Log.e(str4, "The Domain is invalid and the Callback URI will not be set. You used: " + str3);
            return null;
        }
        Uri build = Uri.parse(str3).buildUpon().scheme(str).appendPath(DeviceInfo.OS_NAME).appendPath(str2).appendPath("callback").build();
        String str5 = f753a;
        Log.v(str5, "The Callback URI is: " + build);
        return build.toString();
    }
}
