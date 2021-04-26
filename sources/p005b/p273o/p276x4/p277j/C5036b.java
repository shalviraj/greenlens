package p005b.p273o.p276x4.p277j;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActivityChooserModel;
import com.segment.analytics.AnalyticsContext;
import com.segment.analytics.integrations.BasePayload;
import java.util.Objects;
import org.json.JSONObject;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.o.x4.j.b */
public class C5036b {
    @NonNull

    /* renamed from: a */
    public String f9732a;
    @Nullable

    /* renamed from: b */
    public C5037c f9733b;

    /* renamed from: c */
    public Float f9734c;

    /* renamed from: d */
    public long f9735d;

    public C5036b(@NonNull String str, @Nullable C5037c cVar, float f) {
        this.f9732a = str;
        this.f9733b = cVar;
        this.f9734c = Float.valueOf(f);
        this.f9735d = 0;
    }

    public C5036b(@NonNull String str, @Nullable C5037c cVar, float f, long j) {
        this.f9732a = str;
        this.f9733b = cVar;
        this.f9734c = Float.valueOf(f);
        this.f9735d = j;
    }

    /* renamed from: a */
    public JSONObject mo16788a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AnalyticsContext.Device.DEVICE_ID_KEY, this.f9732a);
        C5037c cVar = this.f9733b;
        if (cVar != null) {
            Objects.requireNonNull(cVar);
            JSONObject jSONObject2 = new JSONObject();
            C5038d dVar = cVar.f9736a;
            if (dVar != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("notification_ids", dVar.f9738a);
                jSONObject3.put("in_app_message_ids", dVar.f9739b);
                jSONObject2.put("direct", jSONObject3);
            }
            C5038d dVar2 = cVar.f9737b;
            if (dVar2 != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("notification_ids", dVar2.f9738a);
                jSONObject4.put("in_app_message_ids", dVar2.f9739b);
                jSONObject2.put("indirect", jSONObject4);
            }
            jSONObject.put("sources", jSONObject2);
        }
        if (this.f9734c.floatValue() > 0.0f) {
            jSONObject.put(ActivityChooserModel.ATTRIBUTE_WEIGHT, this.f9734c);
        }
        long j = this.f9735d;
        if (j > 0) {
            jSONObject.put(BasePayload.TIMESTAMP_KEY, j);
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("OSOutcomeEventParams{outcomeId='");
        u.append(this.f9732a);
        u.append('\'');
        u.append(", outcomeSource=");
        u.append(this.f9733b);
        u.append(", weight=");
        u.append(this.f9734c);
        u.append(", timestamp=");
        u.append(this.f9735d);
        u.append('}');
        return u.toString();
    }
}
