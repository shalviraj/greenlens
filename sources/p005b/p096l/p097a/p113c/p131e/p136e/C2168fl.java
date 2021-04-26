package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import org.json.JSONObject;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.e.e.fl */
public final class C2168fl implements C2553vi {

    /* renamed from: g */
    public String f3870g;

    /* renamed from: h */
    public String f3871h;
    @Nullable

    /* renamed from: i */
    public final String f3872i;

    public C2168fl(@Nullable String str) {
        this.f3872i = str;
    }

    public C2168fl(String str, String str2, @Nullable String str3) {
        C0823f.m376j(str);
        this.f3870g = str;
        C0823f.m376j(str2);
        this.f3871h = str2;
        this.f3872i = str3;
    }

    /* renamed from: a */
    public final String mo12411a() {
        JSONObject jSONObject = new JSONObject();
        String str = this.f3870g;
        if (str != null) {
            jSONObject.put(NotificationCompat.CATEGORY_EMAIL, str);
        }
        String str2 = this.f3871h;
        if (str2 != null) {
            jSONObject.put("password", str2);
        }
        String str3 = this.f3872i;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        return jSONObject.toString();
    }
}
