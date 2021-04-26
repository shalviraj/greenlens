package p005b.p273o;

import androidx.annotation.NonNull;
import org.json.JSONArray;
import org.json.JSONObject;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.o.h1 */
public class C4850h1 {

    /* renamed from: a */
    public JSONObject f9318a;

    /* renamed from: b */
    public JSONArray f9319b;

    public C4850h1(@NonNull JSONObject jSONObject) {
        JSONArray jSONArray = null;
        this.f9318a = jSONObject.has("adds") ? jSONObject.getJSONObject("adds") : null;
        this.f9319b = jSONObject.has("removes") ? jSONObject.getJSONArray("removes") : jSONArray;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("OSInAppMessageTag{adds=");
        u.append(this.f9318a);
        u.append(", removes=");
        u.append(this.f9319b);
        u.append('}');
        return u.toString();
    }
}
