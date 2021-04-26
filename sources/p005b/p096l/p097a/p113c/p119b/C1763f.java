package p005b.p096l.p097a.p113c.p119b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.segment.analytics.AnalyticsContext;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p113c.p119b.p122m.C1914g0;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p119b.p128q.C1968b;

/* renamed from: b.l.a.c.b.f */
public class C1763f {

    /* renamed from: a */
    public static final int f3112a = 12451000;

    /* renamed from: b */
    public static final C1763f f3113b = new C1763f();

    static {
        boolean z = C1767i.f3116a;
    }

    @Nullable
    /* renamed from: a */
    public Intent mo12003a(Context context, int i, @Nullable String str) {
        if (i == 1 || i == 2) {
            if (context == null || !C1960d.m2846s0(context)) {
                StringBuilder u = C0843a.m460u("gcore_");
                u.append(f3112a);
                u.append("-");
                if (!TextUtils.isEmpty(str)) {
                    u.append(str);
                }
                u.append("-");
                if (context != null) {
                    u.append(context.getPackageName());
                }
                u.append("-");
                if (context != null) {
                    try {
                        u.append(C1968b.m2885a(context).mo12294b(context.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                String sb = u.toString();
                int i2 = C1914g0.f3432a;
                Intent intent = new Intent("android.intent.action.VIEW");
                Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(AnalyticsContext.Device.DEVICE_ID_KEY, "com.google.android.gms");
                if (!TextUtils.isEmpty(sb)) {
                    appendQueryParameter.appendQueryParameter("pcampaignid", sb);
                }
                intent.setData(appendQueryParameter.build());
                intent.setPackage("com.android.vending");
                intent.addFlags(524288);
                return intent;
            }
            int i3 = C1914g0.f3432a;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else if (i != 3) {
            return null;
        } else {
            int i4 = C1914g0.f3432a;
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String) null);
            Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent3.setData(fromParts);
            return intent3;
        }
    }

    /* renamed from: b */
    public int mo12004b(Context context, int i) {
        int b = C1767i.m2344b(context, i);
        if (C1767i.m2345c(context, b)) {
            return 18;
        }
        return b;
    }

    /* renamed from: c */
    public boolean mo12005c(int i) {
        boolean z = C1767i.f3116a;
        return i == 1 || i == 2 || i == 3 || i == 9;
    }
}
