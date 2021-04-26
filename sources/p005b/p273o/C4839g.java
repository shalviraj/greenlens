package p005b.p273o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import p005b.p273o.C4857i2;
import p005b.p273o.p278y4.C5047b;
import p005b.p273o.p278y4.C5048c;

/* renamed from: b.o.g */
public class C4839g {

    /* renamed from: a */
    public static int f9298a = -1;

    /* renamed from: a */
    public static boolean m8875a(Context context) {
        int i = f9298a;
        if (i != -1) {
            return i == 1;
        }
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                f9298a = "DISABLE".equals(bundle.getString("com.onesignal.BadgeCount")) ? 0 : 1;
            } else {
                f9298a = 1;
            }
        } catch (PackageManager.NameNotFoundException e) {
            f9298a = 0;
            C4857i2.m8933a(C4857i2.C4868k.ERROR, "Error reading meta-data tag 'com.onesignal.BadgeCount'. Disabling badge setting.", e);
        }
        return f9298a == 1;
    }

    /* renamed from: b */
    public static void m8876b(C5053z2 z2Var, Context context) {
        if (m8875a(context) && C4835f2.m8853a()) {
            int i = 0;
            for (StatusBarNotification c : C4805c3.m8807f(context)) {
                if (!C4855i0.m8922c(c)) {
                    i++;
                }
            }
            m8877c(i, context);
        }
    }

    /* renamed from: c */
    public static void m8877c(int i, Context context) {
        if (m8875a(context)) {
            try {
                C5048c.m9244a(context, i);
            } catch (C5047b unused) {
            }
        }
    }
}
