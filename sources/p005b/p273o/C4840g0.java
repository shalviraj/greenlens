package p005b.p273o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.onesignal.JobIntentService;
import java.util.List;

/* renamed from: b.o.g0 */
public abstract class C4840g0 extends JobIntentService {

    /* renamed from: b.o.g0$a */
    public static class C4841a {

        /* renamed from: a */
        public Integer f9299a;
    }

    /* renamed from: f */
    public static Intent m8878f(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent().setAction("com.onesignal.NotificationExtender").setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 128);
        if (queryIntentServices.size() < 1) {
            return null;
        }
        intent.setComponent(new ComponentName(context, queryIntentServices.get(0).serviceInfo.name));
        return intent;
    }
}
