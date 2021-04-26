package p005b.p273o;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActivityChooserModel;
import org.json.JSONObject;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.o.d1 */
public class C4811d1 {

    /* renamed from: a */
    public String f9205a;

    /* renamed from: b */
    public float f9206b;

    /* renamed from: c */
    public boolean f9207c;

    public C4811d1(@NonNull JSONObject jSONObject) {
        this.f9205a = jSONObject.getString("name");
        this.f9206b = jSONObject.has(ActivityChooserModel.ATTRIBUTE_WEIGHT) ? (float) jSONObject.getDouble(ActivityChooserModel.ATTRIBUTE_WEIGHT) : 0.0f;
        this.f9207c = jSONObject.has("unique") && jSONObject.getBoolean("unique");
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("OSInAppMessageOutcome{name='");
        u.append(this.f9205a);
        u.append('\'');
        u.append(", weight=");
        u.append(this.f9206b);
        u.append(", unique=");
        u.append(this.f9207c);
        u.append('}');
        return u.toString();
    }
}
