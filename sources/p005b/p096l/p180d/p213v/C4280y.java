package p005b.p096l.p180d.p213v;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: b.l.d.v.y */
public final class C4280y {

    /* renamed from: e */
    public static C4280y f7930e;
    @Nullable

    /* renamed from: a */
    public String f7931a = null;

    /* renamed from: b */
    public Boolean f7932b = null;

    /* renamed from: c */
    public Boolean f7933c = null;
    @VisibleForTesting

    /* renamed from: d */
    public final Queue<Intent> f7934d = new ArrayDeque();

    /* renamed from: a */
    public static synchronized C4280y m7833a() {
        C4280y yVar;
        synchronized (C4280y.class) {
            if (f7930e == null) {
                f7930e = new C4280y();
            }
            yVar = f7930e;
        }
        return yVar;
    }

    /* renamed from: b */
    public final boolean mo15878b(Context context) {
        if (this.f7932b == null) {
            this.f7932b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f7932b.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f7932b.booleanValue();
    }
}
