package p005b.p006a.p007a.p015f;

import android.os.Build;
import com.amplitude.api.AmplitudeClient;
import com.amplitude.api.Constants;
import com.segment.analytics.Analytics;
import com.segment.analytics.AnalyticsContext;
import com.segment.analytics.Properties;
import java.util.UUID;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p038f.p039a.C0849e;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.f.a */
public final class C0688a {

    /* renamed from: a */
    public static final String f390a = C0849e.m470B();

    /* renamed from: b */
    public static final C0688a f391b = null;

    /* renamed from: a */
    public static final void m183a(String str, int i) {
        Analytics K = C0843a.m435K(str, "appReviewEventType");
        String c = m185c();
        String uuid = UUID.randomUUID().toString();
        C6888i.m12437d(uuid, "java.util.UUID.randomUUID().toString()");
        C0843a.m430F("Slack", true, K, str, m184b(c, uuid).putValue("app_sessions", (Object) Integer.valueOf(i)));
    }

    /* renamed from: b */
    public static final Properties m184b(String str, String str2) {
        Properties putValue = new Properties().putValue("time_stamp", (Object) Long.valueOf(System.currentTimeMillis())).putValue(AmplitudeClient.DEVICE_ID_KEY, (Object) f390a).putValue("app_id", (Object) str).putValue("minor_version", (Object) "180").putValue("major_version", (Object) "3.0.180").putValue(Constants.AMP_TRACKING_OPTION_PLATFORM, (Object) Constants.PLATFORM).putValue("uuid", (Object) str2);
        C6888i.m12437d(putValue, "Properties().putValue(TI…    .putValue(UUID, uuid)");
        return putValue;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.f11018a;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m185c() {
        /*
            com.appfoundry.previewer.model.JsonApp r0 = p005b.p006a.p007a.p024o.C0820c.m306f()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r0.f11018a
            if (r0 == 0) goto L_0x000b
            goto L_0x000f
        L_0x000b:
            java.lang.String r0 = p005b.p038f.p039a.C0849e.m507b()
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p005b.p006a.p007a.p015f.C0688a.m185c():java.lang.String");
    }

    /* renamed from: d */
    public static final void m186d(String str) {
        C0843a.m430F("Slack", false, C0843a.m435K(str, "mapUri"), "Action Started", C0843a.m436L("java.util.UUID.randomUUID().toString()", m185c(), "action_type", "map", "action_data", str));
    }

    /* renamed from: e */
    public static final void m187e(String str, String str2, String str3) {
        Analytics with = Analytics.with(C0849e.m505a());
        String c = m185c();
        String uuid = UUID.randomUUID().toString();
        C6888i.m12437d(uuid, "java.util.UUID.randomUUID().toString()");
        Properties putValue = m184b(c, uuid).putValue("os", (Object) Build.VERSION.RELEASE).putValue("version", (Object) String.valueOf(Build.VERSION.SDK_INT)).putValue("brand", (Object) Build.BRAND);
        String str4 = Build.MODEL;
        C6888i.m12437d(str4, "Build.MODEL");
        Properties putValue2 = putValue.putValue(AnalyticsContext.Device.DEVICE_MODEL_KEY, (Object) str4).putValue("model_identifier", (Object) Build.PRODUCT);
        if (str2 == null) {
            str2 = "UnknownTag";
        }
        with.track(str, putValue2.putValue("tag", (Object) str2).putValue("message", (Object) str3));
    }
}
