package p005b.p096l.p180d.p191q.p192f.p202m;

import androidx.core.app.NotificationCompat;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONObject;
import p005b.p096l.p180d.p191q.p192f.p195g.C4026n0;
import p005b.p096l.p180d.p191q.p192f.p202m.p203j.C4188a;
import p005b.p096l.p180d.p191q.p192f.p202m.p203j.C4189b;
import p005b.p096l.p180d.p191q.p192f.p202m.p203j.C4190c;
import p005b.p096l.p180d.p191q.p192f.p202m.p203j.C4192e;

/* renamed from: b.l.d.q.f.m.i */
public class C4187i implements C4186h {
    /* renamed from: a */
    public C4192e mo15782a(C4026n0 n0Var, JSONObject jSONObject) {
        String str;
        long j;
        JSONObject jSONObject2 = jSONObject;
        int optInt = jSONObject2.optInt("settings_version", 0);
        int optInt2 = jSONObject2.optInt("cache_duration", 3600);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("fabric");
        JSONObject jSONObject4 = jSONObject2.getJSONObject("app");
        String string = jSONObject4.getString(NotificationCompat.CATEGORY_STATUS);
        boolean equals = "new".equals(string);
        String string2 = jSONObject3.getString("bundle_id");
        String string3 = jSONObject3.getString("org_id");
        if (equals) {
            str = "https://update.crashlytics.com/spi/v1/platforms/android/apps";
        } else {
            str = String.format(Locale.US, "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s", new Object[]{string2});
        }
        String str2 = str;
        Locale locale = Locale.US;
        C4188a aVar = new C4188a(string, str2, String.format(locale, "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports", new Object[]{string2}), String.format(locale, "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps", new Object[]{string2}), string2, string3, jSONObject4.optBoolean("update_required", false), jSONObject4.optInt("report_upload_variant", 0), jSONObject4.optInt("native_report_upload_variant", 0));
        C4190c cVar = new C4190c(8, 4);
        C4189b bVar = new C4189b(jSONObject2.getJSONObject("features").optBoolean("collect_reports", true));
        long j2 = (long) optInt2;
        if (jSONObject2.has("expires_at")) {
            j = jSONObject2.optLong("expires_at");
        } else {
            Objects.requireNonNull(n0Var);
            j = (j2 * 1000) + System.currentTimeMillis();
        }
        return new C4192e(j, aVar, cVar, bVar, optInt, optInt2);
    }
}
