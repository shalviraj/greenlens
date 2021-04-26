package p005b.p273o.p276x4.p277j;

import androidx.annotation.Nullable;
import org.json.JSONArray;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.o.x4.j.d */
public class C5038d {
    @Nullable

    /* renamed from: a */
    public JSONArray f9738a;
    @Nullable

    /* renamed from: b */
    public JSONArray f9739b;

    public C5038d() {
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        this.f9738a = jSONArray;
        this.f9739b = jSONArray2;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("OSOutcomeSourceBody{notificationIds=");
        u.append(this.f9738a);
        u.append(", inAppMessagesIds=");
        u.append(this.f9739b);
        u.append('}');
        return u.toString();
    }
}
