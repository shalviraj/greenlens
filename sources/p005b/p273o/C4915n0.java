package p005b.p273o;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.onesignal.JobIntentService;
import com.onesignal.RestoreJobService;
import com.onesignal.RestoreKickoffJobService;
import com.segment.analytics.integrations.BasePayload;
import java.util.ArrayList;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p273o.C4857i2;

/* renamed from: b.o.n0 */
public class C4915n0 {

    /* renamed from: a */
    public static final String[] f9484a = {"android_notification_id", "full_data", "created_time"};

    /* renamed from: b */
    public static boolean f9485b;

    /* renamed from: a */
    public static Intent m9027a(Intent intent, Cursor cursor) {
        int i = cursor.getInt(cursor.getColumnIndex("android_notification_id"));
        String string = cursor.getString(cursor.getColumnIndex("full_data"));
        intent.putExtra("json_payload", string).putExtra("android_notif_id", i).putExtra("restoring", true).putExtra(BasePayload.TIMESTAMP_KEY, Long.valueOf(cursor.getLong(cursor.getColumnIndex("created_time"))));
        return intent;
    }

    @WorkerThread
    /* renamed from: b */
    public static void m9028b(Context context) {
        C4857i2.C4868k kVar = C4857i2.C4868k.INFO;
        if (C4835f2.m8853a() && !f9485b) {
            f9485b = true;
            Cursor cursor = null;
            C4857i2.m8933a(kVar, "Restoring notifications", (Throwable) null);
            C4783a3 e = C4783a3.m8766e(context);
            StringBuilder f0 = C4783a3.m8767f0();
            StatusBarNotification[] f = C4805c3.m8807f(context);
            if (f.length != 0) {
                ArrayList arrayList = new ArrayList();
                for (StatusBarNotification id : f) {
                    arrayList.add(Integer.valueOf(id.getId()));
                }
                f0.append(" AND android_notification_id NOT IN (");
                f0.append(TextUtils.join(",", arrayList));
                f0.append(")");
            }
            StringBuilder u = C0843a.m460u("Querying DB for notifs to restore: ");
            u.append(f0.toString());
            C4857i2.m8933a(kVar, u.toString(), (Throwable) null);
            try {
                cursor = e.mo16512Z("notification", f9484a, f0.toString(), (String[]) null, (String) null, (String) null, "_id DESC", C4855i0.f9330a);
                m9029c(context, cursor, 200);
                C4839g.m8876b(e, context);
                if (cursor.isClosed()) {
                    return;
                }
            } catch (Throwable th) {
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
                throw th;
            }
            cursor.close();
        }
    }

    /* renamed from: c */
    public static void m9029c(Context context, Cursor cursor, int i) {
        int i2;
        ComponentName componentName;
        Intent intent;
        if (cursor.moveToFirst()) {
            boolean z = C4840g0.m8878f(context) != null;
            do {
                if (z) {
                    intent = C4840g0.m8878f(context);
                    m9027a(intent, cursor);
                    componentName = intent.getComponent();
                    i2 = 2071862121;
                } else {
                    intent = new Intent();
                    m9027a(intent, cursor);
                    componentName = new ComponentName(context, RestoreJobService.class);
                    i2 = 2071862122;
                }
                JobIntentService.m10584a(context, componentName, i2, intent, false);
                if (i > 0) {
                    C4835f2.m8872v(i);
                }
            } while (cursor.moveToNext());
        }
    }

    /* renamed from: d */
    public static void m9030d(Context context) {
        C4857i2.m8933a(C4857i2.C4868k.INFO, "scheduleRestoreKickoffJob", (Throwable) null);
        ((JobScheduler) context.getSystemService("jobscheduler")).schedule(new JobInfo.Builder(2071862120, new ComponentName(context, RestoreKickoffJobService.class)).setOverrideDeadline(15000).setMinimumLatency(15000).build());
    }
}
