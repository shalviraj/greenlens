package p005b.p096l.p097a.p113c.p131e.p140i;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.UserHandle;
import android.util.Log;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;

@TargetApi(24)
/* renamed from: b.l.a.c.e.i.y4 */
public final class C3028y4 {
    @Nullable

    /* renamed from: a */
    public static final Method f5155a;
    @Nullable

    /* renamed from: b */
    public static final Method f5156b;

    static {
        Method method;
        Class<String> cls = String.class;
        Method method2 = null;
        try {
            method = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", new Class[]{JobInfo.class, cls, Integer.TYPE, cls});
        } catch (NoSuchMethodException unused) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            }
            method = null;
        }
        f5155a = method;
        try {
            method2 = UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
        } catch (NoSuchMethodException unused2) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
            }
        }
        f5156b = method2;
    }
}
