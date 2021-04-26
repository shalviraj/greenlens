package p005b.p040g.p041a.p046h;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: b.g.a.h.v */
public class C0906v {

    /* renamed from: a */
    public static final String f811a = "b.g.a.h.v";

    /* renamed from: b */
    public static C0900p f812b;

    @VisibleForTesting
    /* renamed from: a */
    public static boolean m636a(@NonNull PackageManager packageManager) {
        return new Intent("android.intent.action.VIEW", Uri.parse("https://auth0.com")).resolveActivity(packageManager) != null;
    }
}
