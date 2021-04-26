package p005b.p096l.p180d.p221y;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import p005b.p096l.p180d.p211t.C4221c;

/* renamed from: b.l.d.y.a */
public class C4320a {

    /* renamed from: a */
    public final Context f8027a;

    /* renamed from: b */
    public final SharedPreferences f8028b;

    /* renamed from: c */
    public final C4221c f8029c;

    /* renamed from: d */
    public boolean f8030d;

    public C4320a(Context context, String str, C4221c cVar) {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context createDeviceProtectedStorageContext = ContextCompat.createDeviceProtectedStorageContext(context);
        this.f8027a = createDeviceProtectedStorageContext;
        SharedPreferences sharedPreferences = createDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f8028b = sharedPreferences;
        this.f8029c = cVar;
        boolean z2 = true;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                PackageManager packageManager = createDeviceProtectedStorageContext.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(createDeviceProtectedStorageContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled"))) {
                    z2 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z = z2;
        }
        this.f8030d = z;
    }
}
