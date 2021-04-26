package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsService;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.amplitude.api.Constants;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;
import com.segment.analytics.integrations.BasePayload;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p124n.C1955a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1957a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p119b.p126p.C1961e;
import p005b.p096l.p097a.p113c.p131e.p136e.C2165fi;
import p005b.p096l.p097a.p113c.p131e.p136e.C2190gi;
import p005b.p096l.p097a.p113c.p131e.p136e.C2410pj;
import p005b.p096l.p180d.C3825d;
import p005b.p096l.p180d.p185o.p189e0.C3865a0;
import p005b.p096l.p180d.p185o.p189e0.C3867b0;
import p005b.p096l.p180d.p185o.p189e0.C3898w;
import p005b.p096l.p180d.p185o.p189e0.C3899x;

public class RecaptchaActivity extends FragmentActivity implements C2190gi {

    /* renamed from: h */
    public static final String f11432h = RecaptchaActivity.class.getSimpleName();

    /* renamed from: i */
    public static final ExecutorService f11433i;

    /* renamed from: j */
    public static long f11434j = 0;

    /* renamed from: k */
    public static final C3899x f11435k = C3899x.f7183b;

    /* renamed from: g */
    public boolean f11436g = false;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f11433i = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* renamed from: a */
    public final void mo22165a() {
        f11434j = 0;
        this.f11436g = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        f11435k.mo15421b(this);
        finish();
    }

    /* renamed from: b */
    public final void mo22166b(Status status) {
        f11434j = 0;
        this.f11436g = false;
        Intent intent = new Intent();
        Map<String, String> map = C3898w.f7182a;
        Parcel obtain = Parcel.obtain();
        status.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", marshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        f11435k.mo15421b(this);
        finish();
    }

    @RecentlyNonNull
    /* renamed from: i */
    public final Context mo12681i() {
        return getApplicationContext();
    }

    @RecentlyNonNull
    /* renamed from: j */
    public final String mo12682j(@RecentlyNonNull String str) {
        return C2410pj.m4011a(str);
    }

    /* renamed from: k */
    public final void mo12683k(@RecentlyNonNull Uri uri, @RecentlyNonNull String str) {
        if (getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null) {
            List<ResolveInfo> queryIntentServices = getPackageManager().queryIntentServices(new Intent(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION), 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.putExtra("com.android.browser.application_id", str);
                intent.addFlags(BasicMeasure.EXACTLY);
                intent.addFlags(268435456);
                startActivity(intent);
                return;
            }
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            build.intent.addFlags(BasicMeasure.EXACTLY);
            build.intent.addFlags(268435456);
            build.launchUrl(this, uri);
            return;
        }
        Log.e(f11432h, "Device cannot resolve intent for: android.intent.action.VIEW");
        mo22165a();
    }

    @RecentlyNullable
    /* renamed from: l */
    public final Uri.Builder mo12684l(@RecentlyNonNull Intent intent, @RecentlyNonNull String str, @RecentlyNonNull String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String uuid = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        C3825d d = C3825d.m7209d(stringExtra3);
        FirebaseAuth instance = FirebaseAuth.getInstance(d);
        C3865a0 a0Var = C3865a0.f7114a;
        Context applicationContext = getApplicationContext();
        synchronized (a0Var) {
            C0823f.m376j(str);
            C0823f.m376j(uuid);
            SharedPreferences b = C3865a0.m7253b(applicationContext, str);
            C3865a0.m7252a(b);
            SharedPreferences.Editor edit = b.edit();
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{uuid}), "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{uuid}), stringExtra3);
            edit.apply();
        }
        String b2 = C3867b0.m7254a(getApplicationContext(), d.mo15345e()).mo15370b();
        String str3 = null;
        if (TextUtils.isEmpty(b2)) {
            Log.e(f11432h, "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            mo22166b(C1960d.m2768Y0("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        synchronized (instance.f11421g) {
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            synchronized (instance.f11421g) {
            }
        } else {
            str3 = C1960d.m2791e1();
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", str3).appendQueryParameter("eventId", uuid);
        String valueOf = String.valueOf(stringExtra2);
        return appendQueryParameter.appendQueryParameter("v", valueOf.length() != 0 ? "X".concat(valueOf) : new String("X")).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", b2);
    }

    @RecentlyNullable
    /* renamed from: m */
    public final HttpURLConnection mo12685m(@RecentlyNonNull URL url) {
        try {
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            C1955a aVar = C2190gi.f3889b;
            Log.e(aVar.f3501a, aVar.mo12284c("Error generating connection", new Object[0]));
            return null;
        }
    }

    /* renamed from: n */
    public final void mo12686n(@RecentlyNonNull String str, @Nullable Status status) {
        if (status == null) {
            mo22165a();
        } else {
            mo22166b(status);
        }
    }

    public final void onCreate(@RecentlyNonNull Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) || "android.intent.action.VIEW".equals(action)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - f11434j < Constants.EVENT_UPLOAD_PERIOD_MILLIS) {
                Log.e(f11432h, "Could not start operation - already in progress");
                return;
            }
            f11434j = currentTimeMillis;
            if (bundle != null) {
                this.f11436g = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
                return;
            }
            return;
        }
        String str = f11432h;
        String valueOf = String.valueOf(action);
        Log.e(str, valueOf.length() != 0 ? "Could not do operation - unknown action: ".concat(valueOf) : new String("Could not do operation - unknown action: "));
        mo22165a();
    }

    public final void onNewIntent(@RecentlyNonNull Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public final void onResume() {
        String string;
        boolean isEmpty;
        super.onResume();
        String str = null;
        if ("android.intent.action.VIEW".equals(getIntent().getAction())) {
            Intent intent = getIntent();
            if (intent.hasExtra("firebaseError")) {
                mo22166b(C3898w.m7286a(intent.getStringExtra("firebaseError")));
            } else if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
                mo22165a();
            } else {
                String stringExtra = intent.getStringExtra("link");
                C3865a0 a0Var = C3865a0.f7114a;
                Context applicationContext = getApplicationContext();
                String packageName = getPackageName();
                String stringExtra2 = intent.getStringExtra("eventId");
                synchronized (a0Var) {
                    C0823f.m376j(packageName);
                    C0823f.m376j(stringExtra2);
                    SharedPreferences b = C3865a0.m7253b(applicationContext, packageName);
                    String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{stringExtra2});
                    String string2 = b.getString(format, (String) null);
                    String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{stringExtra2});
                    string = b.getString(format2, (String) null);
                    SharedPreferences.Editor edit = b.edit();
                    edit.remove(format);
                    edit.remove(format2);
                    edit.apply();
                    isEmpty = TextUtils.isEmpty(string2);
                }
                if (!isEmpty) {
                    str = string;
                }
                if (TextUtils.isEmpty(str)) {
                    Log.e(f11432h, "Failed to find registration for this event - failing to prevent session injection.");
                    mo22166b(C1960d.m2768Y0("Failed to find registration for this reCAPTCHA event"));
                }
                if (intent.getBooleanExtra("encryptionEnabled", true)) {
                    stringExtra = C3867b0.m7254a(getApplicationContext(), C3825d.m7209d(str).mo15345e()).mo15371c(stringExtra);
                }
                String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
                f11434j = 0;
                this.f11436g = false;
                Intent intent2 = new Intent();
                intent2.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
                intent2.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                if (!LocalBroadcastManager.getInstance(this).sendBroadcast(intent2)) {
                    SharedPreferences.Editor edit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                    edit2.putString("recaptchaToken", queryParameter);
                    edit2.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                    edit2.putLong(BasePayload.TIMESTAMP_KEY, System.currentTimeMillis());
                    edit2.commit();
                } else {
                    f11435k.mo15421b(this);
                }
                finish();
            }
        } else if (!this.f11436g) {
            String packageName2 = getPackageName();
            try {
                new C2165fi(packageName2, C1961e.m2877a(C1957a.m2688a(this, packageName2), false).toLowerCase(Locale.US), getIntent(), this).executeOnExecutor(f11433i, new Void[0]);
            } catch (PackageManager.NameNotFoundException e) {
                String str2 = f11432h;
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(packageName2).length() + 34 + valueOf.length());
                sb.append("Could not get package signature: ");
                sb.append(packageName2);
                sb.append(" ");
                sb.append(valueOf);
                Log.e(str2, sb.toString());
                mo12686n(packageName2, (Status) null);
            }
            this.f11436g = true;
        } else {
            mo22165a();
        }
    }

    public final void onSaveInstanceState(@RecentlyNonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f11436g);
    }
}
