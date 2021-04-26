package p005b.p096l.p180d.p191q.p192f.p202m;

import androidx.core.app.NotificationCompat;
import java.util.Objects;
import org.json.JSONObject;
import p005b.p096l.p180d.p191q.p192f.p195g.C4026n0;
import p005b.p096l.p180d.p191q.p192f.p202m.p203j.C4188a;
import p005b.p096l.p180d.p191q.p192f.p202m.p203j.C4189b;
import p005b.p096l.p180d.p191q.p192f.p202m.p203j.C4190c;
import p005b.p096l.p180d.p191q.p192f.p202m.p203j.C4192e;

/* renamed from: b.l.d.q.f.m.b */
public class C4180b implements C4186h {
    /* renamed from: b */
    public static long m7719b(C4026n0 n0Var, long j, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        Objects.requireNonNull(n0Var);
        return (j * 1000) + System.currentTimeMillis();
    }

    /* renamed from: a */
    public C4192e mo15782a(C4026n0 n0Var, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        int optInt = jSONObject2.optInt("settings_version", 0);
        int optInt2 = jSONObject2.optInt("cache_duration", 3600);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("app");
        return new C4192e(m7719b(n0Var, (long) optInt2, jSONObject2), new C4188a(jSONObject3.getString(NotificationCompat.CATEGORY_STATUS), jSONObject3.getString("url"), jSONObject3.getString("reports_url"), jSONObject3.getString("ndk_reports_url"), jSONObject3.optBoolean("update_required", false)), new C4190c(jSONObject2.getJSONObject("session").optInt("max_custom_exception_events", 8), 4), new C4189b(jSONObject2.getJSONObject("features").optBoolean("collect_reports", true)), optInt, optInt2);
    }
}
