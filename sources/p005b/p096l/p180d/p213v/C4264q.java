package p005b.p096l.p180d.p213v;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p180d.C3825d;

/* renamed from: b.l.d.v.q */
public final class C4264q {

    /* renamed from: a */
    public final Context f7889a;

    /* renamed from: b */
    public String f7890b;

    /* renamed from: c */
    public String f7891c;

    /* renamed from: d */
    public int f7892d;

    /* renamed from: e */
    public int f7893e = 0;

    public C4264q(Context context) {
        this.f7889a = context;
    }

    /* renamed from: a */
    public static String m7804a(C3825d dVar) {
        dVar.mo15344a();
        String str = dVar.f7044c.f7062e;
        if (str != null) {
            return str;
        }
        dVar.mo15344a();
        String str2 = dVar.f7044c.f7059b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    /* renamed from: b */
    public final synchronized int mo15861b() {
        int i = this.f7893e;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f7889a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!C1960d.m2806i0()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f7893e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
            if (C1960d.m2806i0()) {
                this.f7893e = 2;
            } else {
                this.f7893e = 1;
            }
            return this.f7893e;
        }
        this.f7893e = 2;
        return 2;
    }

    /* renamed from: c */
    public final synchronized String mo15862c() {
        if (this.f7890b == null) {
            mo15864e();
        }
        return this.f7890b;
    }

    /* renamed from: d */
    public final synchronized int mo15863d() {
        PackageInfo f;
        if (this.f7892d == 0 && (f = mo15865f("com.google.android.gms")) != null) {
            this.f7892d = f.versionCode;
        }
        return this.f7892d;
    }

    /* renamed from: e */
    public final synchronized void mo15864e() {
        PackageInfo f = mo15865f(this.f7889a.getPackageName());
        if (f != null) {
            this.f7890b = Integer.toString(f.versionCode);
            this.f7891c = f.versionName;
        }
    }

    /* renamed from: f */
    public final PackageInfo mo15865f(String str) {
        try {
            return this.f7889a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }
}
