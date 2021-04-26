package p005b.p273o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.ActivityChooserModel;
import com.segment.analytics.AnalyticsContext;
import com.segment.analytics.integrations.BasePayload;
import org.json.JSONArray;
import org.json.JSONObject;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p273o.p274w4.p275f.C5019c;
import p005b.p273o.p276x4.p277j.C5036b;
import p005b.p273o.p276x4.p277j.C5037c;
import p005b.p273o.p276x4.p277j.C5038d;

/* renamed from: b.o.s3 */
public class C4967s3 {

    /* renamed from: a */
    public C5019c f9591a;

    /* renamed from: b */
    public JSONArray f9592b;

    /* renamed from: c */
    public String f9593c;

    /* renamed from: d */
    public long f9594d;

    /* renamed from: e */
    public Float f9595e;

    public C4967s3(@NonNull C5019c cVar, @Nullable JSONArray jSONArray, @NonNull String str, long j, float f) {
        this.f9591a = cVar;
        this.f9592b = jSONArray;
        this.f9593c = str;
        this.f9594d = j;
        this.f9595e = Float.valueOf(f);
    }

    /* renamed from: a */
    public static C4967s3 m9122a(C5036b bVar) {
        JSONArray jSONArray;
        C5038d dVar;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        C5019c cVar = C5019c.UNATTRIBUTED;
        C5037c cVar2 = bVar.f9733b;
        if (cVar2 != null) {
            C5038d dVar2 = cVar2.f9736a;
            if (dVar2 == null || (jSONArray3 = dVar2.f9738a) == null || jSONArray3.length() <= 0) {
                C5038d dVar3 = cVar2.f9737b;
                if (!(dVar3 == null || (jSONArray2 = dVar3.f9738a) == null || jSONArray2.length() <= 0)) {
                    cVar = C5019c.INDIRECT;
                    dVar = cVar2.f9737b;
                }
            } else {
                cVar = C5019c.DIRECT;
                dVar = cVar2.f9736a;
            }
            jSONArray = dVar.f9738a;
            return new C4967s3(cVar, jSONArray, bVar.f9732a, bVar.f9735d, bVar.f9734c.floatValue());
        }
        jSONArray = null;
        return new C4967s3(cVar, jSONArray, bVar.f9732a, bVar.f9735d, bVar.f9734c.floatValue());
    }

    /* renamed from: b */
    public JSONObject mo16697b() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = this.f9592b;
        if (jSONArray != null && jSONArray.length() > 0) {
            jSONObject.put("notification_ids", this.f9592b);
        }
        jSONObject.put(AnalyticsContext.Device.DEVICE_ID_KEY, this.f9593c);
        if (this.f9595e.floatValue() > 0.0f) {
            jSONObject.put(ActivityChooserModel.ATTRIBUTE_WEIGHT, this.f9595e);
        }
        long j = this.f9594d;
        if (j > 0) {
            jSONObject.put(BasePayload.TIMESTAMP_KEY, j);
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4967s3.class != obj.getClass()) {
            return false;
        }
        C4967s3 s3Var = (C4967s3) obj;
        return this.f9591a.equals(s3Var.f9591a) && this.f9592b.equals(s3Var.f9592b) && this.f9593c.equals(s3Var.f9593c) && this.f9594d == s3Var.f9594d && this.f9595e.equals(s3Var.f9595e);
    }

    public int hashCode() {
        int i = 1;
        Object[] objArr = {this.f9591a, this.f9592b, this.f9593c, Long.valueOf(this.f9594d), this.f9595e};
        for (int i2 = 0; i2 < 5; i2++) {
            Object obj = objArr[i2];
            i = (i * 31) + (obj == null ? 0 : obj.hashCode());
        }
        return i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("OutcomeEvent{session=");
        u.append(this.f9591a);
        u.append(", notificationIds=");
        u.append(this.f9592b);
        u.append(", name='");
        u.append(this.f9593c);
        u.append('\'');
        u.append(", timestamp=");
        u.append(this.f9594d);
        u.append(", weight=");
        u.append(this.f9595e);
        u.append('}');
        return u.toString();
    }
}
