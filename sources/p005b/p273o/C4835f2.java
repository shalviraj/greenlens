package p005b.p273o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.location.LocationCallback;
import com.segment.analytics.AnalyticsContext;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p273o.C4857i2;

/* renamed from: b.o.f2 */
public class C4835f2 {

    /* renamed from: a */
    public static final int[] f9290a = {401, 402, 403, 404, 410};

    /* renamed from: b.o.f2$a */
    public enum C4836a {
        DATA("data"),
        HTTPS("https"),
        HTTP("http");
        

        /* renamed from: g */
        public final String f9295g;

        /* access modifiers changed from: public */
        C4836a(String str) {
            this.f9295g = str;
        }
    }

    /* renamed from: a */
    public static boolean m8853a() {
        try {
            return NotificationManagerCompat.from(C4857i2.f9358c).areNotificationsEnabled();
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: b */
    public static String m8854b() {
        String language = Locale.getDefault().getLanguage();
        if (language.equals("iw")) {
            return "he";
        }
        if (language.equals("in")) {
            return AnalyticsContext.Device.DEVICE_ID_KEY;
        }
        if (language.equals("ji")) {
            return "yi";
        }
        if (!language.equals("zh")) {
            return language;
        }
        StringBuilder y = C0843a.m464y(language, "-");
        y.append(Locale.getDefault().getCountry());
        return y.toString();
    }

    /* renamed from: d */
    public static String m8855d(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString(str);
        } catch (Throwable th) {
            C4857i2.m8933a(C4857i2.C4868k.ERROR, "", th);
            return null;
        }
    }

    /* renamed from: f */
    public static String m8856f(Context context, String str, String str2) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "string", context.getPackageName());
        return identifier != 0 ? resources.getString(identifier) : str2;
    }

    /* renamed from: g */
    public static Uri m8857g(Context context, String str) {
        int i;
        StringBuilder sb;
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        if (!(str != null && !str.matches("^[0-9]")) || (i = resources.getIdentifier(str, "raw", packageName)) == 0) {
            i = resources.getIdentifier("onesignal_default_sound", "raw", packageName);
            if (i == 0) {
                return null;
            }
            sb = new StringBuilder();
        } else {
            sb = new StringBuilder();
        }
        sb.append("android.resource://");
        sb.append(packageName);
        sb.append("/");
        sb.append(i);
        return Uri.parse(sb.toString());
    }

    /* renamed from: h */
    public static boolean m8858h() {
        Class<GoogleCloudMessaging> cls = GoogleCloudMessaging.class;
        return true;
    }

    /* renamed from: i */
    public static boolean m8859i() {
        Class<AGConnectServicesConfig> cls = AGConnectServicesConfig.class;
        return true;
    }

    /* renamed from: j */
    public static boolean m8860j() {
        Class<HuaweiApiAvailability> cls = HuaweiApiAvailability.class;
        return true;
    }

    /* renamed from: k */
    public static boolean m8861k() {
        Class<LocationCallback> cls = LocationCallback.class;
        return true;
    }

    /* renamed from: l */
    public static boolean m8862l() {
        Class<HmsInstanceId> cls = HmsInstanceId.class;
        return true;
    }

    /* renamed from: m */
    public static boolean m8863m() {
        boolean z;
        char c;
        boolean z2;
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        if (z) {
            c = 2;
        } else {
            if (!m8864n()) {
                if (m8860j()) {
                    if (m8859i() && m8862l()) {
                        z2 = m8865o();
                        if (z2 || (!m8864n() && m8869s("com.huawei.hwid"))) {
                            c = 13;
                        }
                    }
                }
                z2 = false;
                c = 13;
            }
            c = 1;
        }
        if (c == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static boolean m8864n() {
        return m8869s("com.google.android.gms");
    }

    /* renamed from: o */
    public static boolean m8865o() {
        return HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(C4857i2.f9358c) == 0;
    }

    /* renamed from: p */
    public static <T> Set<T> m8866p() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    /* renamed from: q */
    public static Set<String> m8867q(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.getString(i));
        }
        return hashSet;
    }

    /* renamed from: r */
    public static void m8868r(@NonNull String str) {
        Intent intent;
        Uri parse = Uri.parse(str.trim());
        C4836a aVar = null;
        if (parse.getScheme() != null) {
            String scheme = parse.getScheme();
            C4836a[] values = C4836a.values();
            int i = 0;
            while (true) {
                if (i >= 3) {
                    break;
                }
                C4836a aVar2 = values[i];
                if (aVar2.f9295g.equalsIgnoreCase(scheme)) {
                    aVar = aVar2;
                    break;
                }
                i++;
            }
        }
        if (aVar == null) {
            aVar = C4836a.HTTP;
            if (!parse.toString().contains("://")) {
                StringBuilder u = C0843a.m460u("http://");
                u.append(parse.toString());
                parse = Uri.parse(u.toString());
            }
        }
        if (aVar.ordinal() != 0) {
            intent = new Intent("android.intent.action.VIEW", parse);
        } else {
            intent = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
            intent.setData(parse);
        }
        intent.addFlags(1476919296);
        C4857i2.f9358c.startActivity(intent);
    }

    /* renamed from: s */
    public static boolean m8869s(@NonNull String str) {
        try {
            return C4857i2.f9358c.getPackageManager().getPackageInfo(str, 128).applicationInfo.enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: t */
    public static long[] m8870t(JSONObject jSONObject) {
        try {
            Object opt = jSONObject.opt("vib_pt");
            JSONArray jSONArray = opt instanceof String ? new JSONArray((String) opt) : (JSONArray) opt;
            long[] jArr = new long[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                jArr[i] = jSONArray.optLong(i);
            }
            return jArr;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: u */
    public static void m8871u(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    /* renamed from: v */
    public static void m8872v(int i) {
        try {
            Thread.sleep((long) i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public int mo16572c() {
        boolean z;
        boolean z2 = false;
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        if (z) {
            return 2;
        }
        if (m8864n()) {
            return 1;
        }
        if (m8860j()) {
            if (m8859i() && m8862l()) {
                z2 = m8865o();
            }
        }
        if (z2) {
            return 13;
        }
        if (!m8864n() && m8869s("com.huawei.hwid")) {
            return 13;
        }
        return 1;
    }

    /* renamed from: e */
    public Integer mo16573e() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) C4857i2.f9358c.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return null;
        }
        int type = activeNetworkInfo.getType();
        return (type == 1 || type == 9) ? 0 : 1;
    }
}
