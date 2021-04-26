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
import android.util.Base64;
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
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.segment.analytics.integrations.BasePayload;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p124n.C1955a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1957a;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p119b.p126p.C1961e;
import p005b.p096l.p097a.p113c.p131e.p136e.C2165fi;
import p005b.p096l.p097a.p113c.p131e.p136e.C2190gi;
import p005b.p096l.p097a.p113c.p131e.p136e.C2364nl;
import p005b.p096l.p097a.p113c.p131e.p136e.C2386oj;
import p005b.p096l.p097a.p113c.p131e.p136e.C2410pj;
import p005b.p096l.p180d.C3825d;
import p005b.p096l.p180d.p185o.p189e0.C3865a0;
import p005b.p096l.p180d.p185o.p189e0.C3867b0;
import p005b.p096l.p180d.p185o.p189e0.C3898w;
import p005b.p096l.p180d.p185o.p189e0.C3899x;
import p005b.p096l.p180d.p185o.p189e0.C3901z;

@KeepName
public class GenericIdpActivity extends FragmentActivity implements C2190gi {

    /* renamed from: i */
    public static long f11428i;

    /* renamed from: j */
    public static final C3899x f11429j = C3899x.f7183b;

    /* renamed from: g */
    public final Executor f11430g;

    /* renamed from: h */
    public boolean f11431h = false;

    public GenericIdpActivity() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f11430g = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* JADX INFO: finally extract failed */
    @RecentlyNullable
    /* renamed from: a */
    public final Uri.Builder mo22162a(@RecentlyNonNull Uri.Builder builder, @RecentlyNonNull Intent intent, @RecentlyNonNull String str, @RecentlyNonNull String str2) {
        String str3;
        String str4;
        Uri.Builder builder2 = builder;
        Intent intent2 = intent;
        String str5 = str;
        String stringExtra = intent2.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent2.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent2.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent2.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String join = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(",", stringArrayListExtra);
        Bundle bundleExtra = intent2.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if (bundleExtra == null) {
            str3 = null;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                for (String str6 : bundleExtra.keySet()) {
                    String string = bundleExtra.getString(str6);
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject.put(str6, string);
                    }
                }
            } catch (JSONException unused) {
                Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
            }
            str3 = jSONObject.toString();
        }
        String uuid = UUID.randomUUID().toString();
        try {
            str4 = new String(MessageDigest.getInstance("SHA-256").digest(UUID.randomUUID().toString().getBytes()));
            int length = str4.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                char charAt = str4.charAt(i);
                if (charAt >= 'A' && charAt <= 'Z') {
                    char[] charArray = str4.toCharArray();
                    while (i < length) {
                        char c = charArray[i];
                        if (c >= 'A' && c <= 'Z') {
                            charArray[i] = (char) (c ^ ' ');
                        }
                        i++;
                    }
                    str4 = String.valueOf(charArray);
                } else {
                    i++;
                }
            }
        } catch (NoSuchAlgorithmException unused2) {
            C1955a aVar = C2190gi.f3889b;
            Log.e(aVar.f3501a, aVar.mo12284c("Failed to get SHA-256 MessageDigest", new Object[0]));
            str4 = null;
        }
        String action = intent.getAction();
        String stringExtra5 = intent2.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        C3865a0 a0Var = C3865a0.f7114a;
        Context applicationContext = getApplicationContext();
        synchronized (a0Var) {
            try {
                C0823f.m376j(str);
                C0823f.m376j(uuid);
                C0823f.m376j(str4);
                C0823f.m376j(stringExtra4);
                SharedPreferences b = C3865a0.m7253b(applicationContext, str5);
                C3865a0.m7252a(b);
                SharedPreferences.Editor edit = b.edit();
                edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", new Object[]{uuid}), str4);
                edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{uuid}), action);
                edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", new Object[]{uuid}), stringExtra2);
                edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{uuid}), stringExtra4);
                edit.putString("com.google.firebase.auth.api.gms.config.tenant.id", stringExtra3);
                edit.apply();
            } catch (Throwable th) {
                throw th;
            }
        }
        String b2 = C3867b0.m7254a(getApplicationContext(), C3825d.m7209d(stringExtra4).mo15345e()).mo15370b();
        if (TextUtils.isEmpty(b2)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            mo22164c(C1960d.m2768Y0("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        }
        if (str4 == null) {
            return null;
        }
        Uri.Builder appendQueryParameter = builder2.appendQueryParameter("eid", "p");
        String valueOf = String.valueOf(stringExtra5);
        appendQueryParameter.appendQueryParameter("v", valueOf.length() != 0 ? "X".concat(valueOf) : new String("X")).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", str4).appendQueryParameter("eventId", uuid).appendQueryParameter("apn", str5).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", b2);
        if (!TextUtils.isEmpty(join)) {
            builder2.appendQueryParameter("scopes", join);
        }
        if (!TextUtils.isEmpty(str3)) {
            builder2.appendQueryParameter("customParameters", str3);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            builder2.appendQueryParameter("tid", stringExtra3);
        }
        return builder2;
    }

    /* renamed from: b */
    public final void mo22163b() {
        f11428i = 0;
        this.f11431h = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!LocalBroadcastManager.getInstance(this).sendBroadcast(intent)) {
            f11429j.mo15420a(this, C1960d.m2768Y0("WEB_CONTEXT_CANCELED"));
        } else {
            f11429j.mo15421b(this);
        }
        finish();
    }

    /* renamed from: c */
    public final void mo22164c(Status status) {
        f11428i = 0;
        this.f11431h = false;
        Intent intent = new Intent();
        Map<String, String> map = C3898w.f7182a;
        Parcel obtain = Parcel.obtain();
        status.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", marshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!LocalBroadcastManager.getInstance(this).sendBroadcast(intent)) {
            f11429j.mo15420a(getApplicationContext(), status);
        } else {
            f11429j.mo15421b(this);
        }
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
        Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
        mo22163b();
    }

    @RecentlyNullable
    /* renamed from: l */
    public final Uri.Builder mo12684l(@RecentlyNonNull Intent intent, @RecentlyNonNull String str, @RecentlyNonNull String str2) {
        return mo22162a(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    @RecentlyNullable
    /* renamed from: m */
    public final HttpURLConnection mo12685m(@RecentlyNonNull URL url) {
        try {
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            Log.e("GenericIdpActivity", "Error generating URL connection");
            return null;
        }
    }

    /* renamed from: n */
    public final void mo12686n(@RecentlyNonNull String str, @Nullable Status status) {
        if (status == null) {
            mo22163b();
        } else {
            mo22164c(status);
        }
    }

    public final void onCreate(@RecentlyNonNull Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) || "com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) || "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) || "android.intent.action.VIEW".equals(action)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - f11428i < Constants.EVENT_UPLOAD_PERIOD_MILLIS) {
                Log.e("GenericIdpActivity", "Could not start operation - already in progress");
                return;
            }
            f11428i = currentTimeMillis;
            if (bundle != null) {
                this.f11431h = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
                return;
            }
            return;
        }
        String valueOf = String.valueOf(action);
        Log.e("GenericIdpActivity", valueOf.length() != 0 ? "Could not do operation - unknown action: ".concat(valueOf) : new String("Could not do operation - unknown action: "));
        mo22163b();
    }

    public final void onNewIntent(@RecentlyNonNull Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public final void onResume() {
        C2386oj ojVar;
        C3901z zVar;
        super.onResume();
        String str = null;
        if ("android.intent.action.VIEW".equals(getIntent().getAction())) {
            Intent intent = getIntent();
            if (intent.hasExtra("firebaseError")) {
                mo22164c(C3898w.m7286a(intent.getStringExtra("firebaseError")));
            } else if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
                mo22163b();
            } else {
                String stringExtra = intent.getStringExtra("link");
                String stringExtra2 = intent.getStringExtra("eventId");
                String packageName = getPackageName();
                boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
                synchronized (C3865a0.f7114a) {
                    C0823f.m376j(packageName);
                    C0823f.m376j(stringExtra2);
                    SharedPreferences b = C3865a0.m7253b(this, packageName);
                    String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", new Object[]{stringExtra2});
                    String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", new Object[]{stringExtra2});
                    String format3 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", new Object[]{stringExtra2});
                    String format4 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", new Object[]{stringExtra2});
                    String string = b.getString(format, (String) null);
                    String string2 = b.getString(format2, (String) null);
                    String string3 = b.getString(format3, (String) null);
                    String string4 = b.getString("com.google.firebase.auth.api.gms.config.tenant.id", (String) null);
                    String string5 = b.getString(format4, (String) null);
                    SharedPreferences.Editor edit = b.edit();
                    edit.remove(format);
                    edit.remove(format2);
                    edit.remove(format3);
                    edit.remove(format4);
                    edit.apply();
                    zVar = (string == null || string2 == null || string3 == null) ? null : new C3901z(string, string2, string3, string4, string5);
                }
                if (zVar == null) {
                    mo22163b();
                }
                if (booleanExtra) {
                    stringExtra = C3867b0.m7254a(getApplicationContext(), C3825d.m7209d(zVar.f7189e).mo15345e()).mo15371c(stringExtra);
                }
                C2364nl nlVar = new C2364nl(zVar, stringExtra);
                String str2 = zVar.f7188d;
                String str3 = zVar.f7186b;
                nlVar.f4121t = str2;
                if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(str3) || "com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(str3) || "com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(str3)) {
                    f11428i = 0;
                    this.f11431h = false;
                    Intent intent2 = new Intent();
                    Parcel obtain = Parcel.obtain();
                    nlVar.writeToParcel(obtain, 0);
                    byte[] marshall = obtain.marshall();
                    obtain.recycle();
                    intent2.putExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", marshall);
                    intent2.putExtra("com.google.firebase.auth.internal.OPERATION", str3);
                    intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                    if (!LocalBroadcastManager.getInstance(this).sendBroadcast(intent2)) {
                        SharedPreferences.Editor edit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                        Parcel obtain2 = Parcel.obtain();
                        nlVar.writeToParcel(obtain2, 0);
                        byte[] marshall2 = obtain2.marshall();
                        obtain2.recycle();
                        if (marshall2 != null) {
                            str = Base64.encodeToString(marshall2, 10);
                        }
                        edit2.putString("verifyAssertionRequest", str);
                        edit2.putString("operation", str3);
                        edit2.putString("tenantId", str2);
                        edit2.putLong(BasePayload.TIMESTAMP_KEY, System.currentTimeMillis());
                        edit2.commit();
                    } else {
                        f11429j.mo15421b(this);
                    }
                    finish();
                    return;
                }
                Log.e("GenericIdpActivity", str3.length() != 0 ? "unsupported operation: ".concat(str3) : new String("unsupported operation: "));
                mo22163b();
            }
        } else if (!this.f11431h) {
            String packageName2 = getPackageName();
            try {
                String lowerCase = C1961e.m2877a(C1957a.m2688a(this, packageName2), false).toLowerCase(Locale.US);
                C3825d d = C3825d.m7209d(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                Map<String, C2386oj> map = C2410pj.f4205a;
                d.mo15344a();
                if (!map.containsKey(d.f7044c.f7058a)) {
                    new C2165fi(packageName2, lowerCase, getIntent(), this).executeOnExecutor(this.f11430g, new Void[0]);
                    this.f11431h = true;
                    return;
                }
                d.mo15344a();
                String str4 = d.f7044c.f7058a;
                synchronized (map) {
                    ojVar = map.get(str4);
                }
                if (ojVar == null) {
                    throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
                }
                throw null;
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(packageName2).length() + 34 + valueOf.length());
                sb.append("Could not get package signature: ");
                sb.append(packageName2);
                sb.append(" ");
                sb.append(valueOf);
                Log.e("GenericIdpActivity", sb.toString());
                mo12686n(packageName2, (Status) null);
            }
        } else {
            mo22163b();
        }
    }

    public final void onSaveInstanceState(@RecentlyNonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f11431h);
    }
}
