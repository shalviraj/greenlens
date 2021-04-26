package p005b.p096l.p180d.p223z;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: b.l.d.z.c */
public final class C4325c {

    /* renamed from: d */
    public static final AtomicInteger f8032d = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: a */
    public final Context f8033a;

    /* renamed from: b */
    public final String f8034b;

    /* renamed from: c */
    public Bundle f8035c;

    public C4325c(Context context, String str) {
        this.f8033a = context;
        this.f8034b = str;
    }

    /* renamed from: b */
    public static String m7931b(Bundle bundle, String str) {
        String string = bundle.getString(str);
        return string == null ? bundle.getString(str.replace("gcm.n.", "gcm.notification.")) : string;
    }

    /* renamed from: c */
    public static void m7932c(Intent intent, Bundle bundle) {
        for (String str : bundle.keySet()) {
            if (str.startsWith("google.c.a.") || str.equals("from")) {
                intent.putExtra(str, bundle.getString(str));
            }
        }
    }

    /* renamed from: h */
    public static boolean m7933h(Bundle bundle) {
        return "1".equals(m7931b(bundle, "gcm.n.e")) || m7931b(bundle, "gcm.n.icon") != null;
    }

    /* renamed from: i */
    public static boolean m7934i(Bundle bundle) {
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    /* renamed from: a */
    public final PendingIntent mo15955a(int i, Intent intent) {
        return PendingIntent.getBroadcast(this.f8033a, i, new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(this.f8033a, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), BasicMeasure.EXACTLY);
    }

    /* renamed from: d */
    public final synchronized Bundle mo15956d() {
        Bundle bundle;
        Bundle bundle2 = this.f8035c;
        if (bundle2 != null) {
            return bundle2;
        }
        try {
            ApplicationInfo f = mo15958f(128);
            if (!(f == null || (bundle = f.metaData) == null)) {
                this.f8035c = bundle;
                return bundle;
            }
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 35);
            sb.append("Couldn't get own application info: ");
            sb.append(valueOf);
            Log.w("FirebaseMessaging", sb.toString());
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    /* renamed from: e */
    public final boolean mo15957e(int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(this.f8033a.getResources().getDrawable(i, (Resources.Theme) null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i);
            Log.e("FirebaseMessaging", sb.toString());
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i);
            sb2.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb2.toString());
            return false;
        }
    }

    /* renamed from: f */
    public final ApplicationInfo mo15958f(int i) {
        return this.f8033a.getPackageManager().getApplicationInfo(this.f8034b, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00d2 A[SYNTHETIC, Splitter:B:20:0x00d2] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo15959g(android.os.Bundle r14, java.lang.String r15) {
        /*
            r13 = this;
            java.lang.String r0 = m7931b(r14, r15)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            java.lang.String r0 = "_loc_key"
            java.lang.String r1 = r15.concat(r0)
            java.lang.String r1 = m7931b(r14, r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 0
            if (r2 == 0) goto L_0x001e
            goto L_0x0108
        L_0x001e:
            android.content.Context r2 = r13.f8033a
            android.content.res.Resources r2 = r2.getResources()
            java.lang.String r4 = r13.f8034b
            java.lang.String r5 = "string"
            int r1 = r2.getIdentifier(r1, r5, r4)
            java.lang.String r4 = " Default value will be used."
            r5 = 6
            java.lang.String r6 = "FirebaseMessaging"
            if (r1 != 0) goto L_0x0066
            java.lang.String r14 = r15.concat(r0)
            java.lang.String r14 = r14.substring(r5)
            java.lang.String r0 = java.lang.String.valueOf(r14)
            int r0 = r0.length()
            int r0 = r0 + 49
            int r1 = r15.length()
            int r1 = r1 + r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r14 = " resource not found: "
            r0.append(r14)
            r0.append(r15)
            r0.append(r4)
            java.lang.String r14 = r0.toString()
            android.util.Log.w(r6, r14)
            goto L_0x0108
        L_0x0066:
            java.lang.String r0 = "_loc_args"
            java.lang.String r7 = r15.concat(r0)
            java.lang.String r14 = m7931b(r14, r7)
            boolean r7 = android.text.TextUtils.isEmpty(r14)
            java.lang.String r8 = ": "
            if (r7 == 0) goto L_0x0079
            goto L_0x00ca
        L_0x0079:
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0090 }
            r7.<init>(r14)     // Catch:{ JSONException -> 0x0090 }
            int r9 = r7.length()     // Catch:{ JSONException -> 0x0090 }
            java.lang.String[] r10 = new java.lang.String[r9]     // Catch:{ JSONException -> 0x0090 }
            r11 = 0
        L_0x0085:
            if (r11 >= r9) goto L_0x00cb
            java.lang.Object r12 = r7.opt(r11)     // Catch:{ JSONException -> 0x0090 }
            r10[r11] = r12     // Catch:{ JSONException -> 0x0090 }
            int r11 = r11 + 1
            goto L_0x0085
        L_0x0090:
            java.lang.String r0 = r15.concat(r0)
            java.lang.String r0 = r0.substring(r5)
            java.lang.String r5 = java.lang.String.valueOf(r0)
            int r5 = r5.length()
            int r5 = r5 + 41
            java.lang.String r7 = java.lang.String.valueOf(r14)
            int r7 = r7.length()
            int r7 = r7 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r7)
            java.lang.String r7 = "Malformed "
            r5.append(r7)
            r5.append(r0)
            r5.append(r8)
            r5.append(r14)
            java.lang.String r14 = "  Default value will be used."
            r5.append(r14)
            java.lang.String r14 = r5.toString()
            android.util.Log.w(r6, r14)
        L_0x00ca:
            r10 = r3
        L_0x00cb:
            if (r10 != 0) goto L_0x00d2
            java.lang.String r3 = r2.getString(r1)
            goto L_0x0108
        L_0x00d2:
            java.lang.String r3 = r2.getString(r1, r10)     // Catch:{ MissingFormatArgumentException -> 0x00d7 }
            goto L_0x0108
        L_0x00d7:
            r14 = move-exception
            java.lang.String r0 = java.util.Arrays.toString(r10)
            int r1 = r15.length()
            int r1 = r1 + 58
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            int r2 = r2 + r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.String r2 = "Missing format argument for "
            r1.append(r2)
            r1.append(r15)
            r1.append(r8)
            r1.append(r0)
            r1.append(r4)
            java.lang.String r15 = r1.toString()
            android.util.Log.w(r6, r15, r14)
        L_0x0108:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p096l.p180d.p223z.C4325c.mo15959g(android.os.Bundle, java.lang.String):java.lang.String");
    }
}
