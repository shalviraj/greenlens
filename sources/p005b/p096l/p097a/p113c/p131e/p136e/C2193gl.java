package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.core.app.NotificationCompat;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p119b.p126p.C1963g;

/* renamed from: b.l.a.c.e.e.gl */
public final class C2193gl implements C2577wi<C2193gl> {

    /* renamed from: j */
    public static final String f3903j = "gl";

    /* renamed from: g */
    public String f3904g;

    /* renamed from: h */
    public String f3905h;

    /* renamed from: i */
    public long f3906i;

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C2577wi mo12435d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f3904g = C1963g.m2880a(jSONObject.optString("idToken", (String) null));
            C1963g.m2880a(jSONObject.optString("displayName", (String) null));
            C1963g.m2880a(jSONObject.optString(NotificationCompat.CATEGORY_EMAIL, (String) null));
            this.f3905h = C1963g.m2880a(jSONObject.optString("refreshToken", (String) null));
            this.f3906i = jSONObject.optLong("expiresIn", 0);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C1960d.m2701C1(e, f3903j, str);
        }
    }
}
