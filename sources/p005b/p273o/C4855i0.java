package p005b.p273o;

import android.content.Context;
import android.database.Cursor;
import android.service.notification.StatusBarNotification;
import androidx.annotation.RequiresApi;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: b.o.i0 */
public class C4855i0 {

    /* renamed from: a */
    public static final String f9330a = Integer.toString(49);

    /* renamed from: a */
    public static void m8920a(Context context, int i) {
        C4783a3 e = C4783a3.m8766e(context);
        Cursor cursor = null;
        try {
            cursor = e.mo16512Z("notification", new String[]{"android_notification_id"}, C4783a3.m8767f0().toString(), (String[]) null, (String) null, (String) null, "_id", f9330a + i);
            int count = (cursor.getCount() - 49) + i;
            if (count >= 1) {
                do {
                    if (!cursor.moveToNext()) {
                        break;
                    }
                    C4857i2.m8938f(cursor.getInt(cursor.getColumnIndex("android_notification_id")));
                    count--;
                } while (count > 0);
                if (cursor.isClosed()) {
                    return;
                }
                cursor.close();
            } else if (!cursor.isClosed()) {
                cursor.close();
            }
        } catch (Throwable th) {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            throw th;
        }
    }

    @RequiresApi(api = 23)
    /* renamed from: b */
    public static void m8921b(Context context, int i) {
        StatusBarNotification[] f = C4805c3.m8807f(context);
        int length = (f.length - 49) + i;
        if (length >= 1) {
            TreeMap treeMap = new TreeMap();
            for (StatusBarNotification statusBarNotification : f) {
                if (!m8922c(statusBarNotification)) {
                    treeMap.put(Long.valueOf(statusBarNotification.getNotification().when), Integer.valueOf(statusBarNotification.getId()));
                }
            }
            for (Map.Entry value : treeMap.entrySet()) {
                C4857i2.m8938f(((Integer) value.getValue()).intValue());
                length--;
                if (length <= 0) {
                    return;
                }
            }
        }
    }

    @RequiresApi(api = 21)
    /* renamed from: c */
    public static boolean m8922c(StatusBarNotification statusBarNotification) {
        return (statusBarNotification.getNotification().flags & 512) != 0;
    }
}
