package p005b.p096l.p180d.p213v;

import android.text.TextUtils;
import android.util.Log;
import com.segment.analytics.AnalyticsContext;
import com.segment.analytics.integrations.BasePayload;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: b.l.d.v.a0 */
public final class C4232a0 {

    /* renamed from: d */
    public static final long f7827d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: e */
    public static final /* synthetic */ int f7828e = 0;

    /* renamed from: a */
    public final String f7829a;

    /* renamed from: b */
    public final String f7830b;

    /* renamed from: c */
    public final long f7831c;

    public C4232a0(String str, String str2, long j) {
        this.f7829a = str;
        this.f7830b = str2;
        this.f7831c = j;
    }

    /* renamed from: a */
    public static String m7771a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AnalyticsContext.Device.DEVICE_TOKEN_KEY, str);
            jSONObject.put("appVersion", str2);
            jSONObject.put(BasePayload.TIMESTAMP_KEY, j);
            return jSONObject.toString();
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    /* renamed from: b */
    public static C4232a0 m7772b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C4232a0(str, (String) null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C4232a0(jSONObject.getString(AnalyticsContext.Device.DEVICE_TOKEN_KEY), jSONObject.getString("appVersion"), jSONObject.getLong(BasePayload.TIMESTAMP_KEY));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("Failed to parse token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }
}
