package p005b.p096l.p097a.p151d.p152a.p154b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* renamed from: b.l.a.d.a.b.e2 */
public final class C3489e2 {

    /* renamed from: a */
    public final Context f6382a;

    public C3489e2(Context context) {
        this.f6382a = context;
    }

    @Nullable
    /* renamed from: a */
    public static String m6666a(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            return bundle.getString("local_testing_dir");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
