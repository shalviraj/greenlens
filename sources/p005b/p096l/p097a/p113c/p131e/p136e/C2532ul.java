package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import org.json.JSONObject;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.e.e.ul */
public final class C2532ul implements C2553vi {

    /* renamed from: g */
    public final String f4355g;

    /* renamed from: h */
    public final String f4356h;
    @Nullable

    /* renamed from: i */
    public final String f4357i;

    public C2532ul(String str, String str2, @Nullable String str3) {
        C0823f.m376j(str);
        this.f4355g = str;
        C0823f.m376j(str2);
        this.f4356h = str2;
        this.f4357i = str3;
    }

    /* renamed from: a */
    public final String mo12411a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(NotificationCompat.CATEGORY_EMAIL, this.f4355g);
        jSONObject.put("password", this.f4356h);
        jSONObject.put("returnSecureToken", true);
        String str = this.f4357i;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
