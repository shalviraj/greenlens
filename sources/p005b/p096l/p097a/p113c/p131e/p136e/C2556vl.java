package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.core.app.NotificationCompat;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p119b.p126p.C1963g;

/* renamed from: b.l.a.c.e.e.vl */
public final class C2556vl implements C2577wi<C2556vl> {

    /* renamed from: l */
    public static final String f4374l = "vl";

    /* renamed from: g */
    public String f4375g;

    /* renamed from: h */
    public String f4376h;

    /* renamed from: i */
    public long f4377i;

    /* renamed from: j */
    public List<C2435qk> f4378j;

    /* renamed from: k */
    public String f4379k;

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C2577wi mo12435d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C1963g.m2880a(jSONObject.optString("localId", (String) null));
            C1963g.m2880a(jSONObject.optString(NotificationCompat.CATEGORY_EMAIL, (String) null));
            C1963g.m2880a(jSONObject.optString("displayName", (String) null));
            this.f4375g = C1963g.m2880a(jSONObject.optString("idToken", (String) null));
            C1963g.m2880a(jSONObject.optString("photoUrl", (String) null));
            this.f4376h = C1963g.m2880a(jSONObject.optString("refreshToken", (String) null));
            this.f4377i = jSONObject.optLong("expiresIn", 0);
            this.f4378j = C2435qk.m4037W(jSONObject.optJSONArray("mfaInfo"));
            this.f4379k = jSONObject.optString("mfaPendingCredential", (String) null);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C1960d.m2701C1(e, f4374l, str);
        }
    }
}
