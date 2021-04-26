package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.core.app.NotificationCompat;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p119b.p126p.C1963g;

/* renamed from: b.l.a.c.e.e.el */
public final class C2143el implements C2577wi<C2143el> {

    /* renamed from: l */
    public static final String f3831l = "el";

    /* renamed from: g */
    public String f3832g;

    /* renamed from: h */
    public C2555vk f3833h;

    /* renamed from: i */
    public String f3834i;

    /* renamed from: j */
    public String f3835j;

    /* renamed from: k */
    public long f3836k;

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C2577wi mo12435d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f3832g = C1963g.m2880a(jSONObject.optString(NotificationCompat.CATEGORY_EMAIL, (String) null));
            C1963g.m2880a(jSONObject.optString("passwordHash", (String) null));
            jSONObject.optBoolean("emailVerified", false);
            C1963g.m2880a(jSONObject.optString("displayName", (String) null));
            C1963g.m2880a(jSONObject.optString("photoUrl", (String) null));
            this.f3833h = C2555vk.m4322V(jSONObject.optJSONArray("providerUserInfo"));
            this.f3834i = C1963g.m2880a(jSONObject.optString("idToken", (String) null));
            this.f3835j = C1963g.m2880a(jSONObject.optString("refreshToken", (String) null));
            this.f3836k = jSONObject.optLong("expiresIn", 0);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C1960d.m2701C1(e, f3831l, str);
        }
    }
}
