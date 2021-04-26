package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.xj */
public final class C2602xj implements C2577wi<C2602xj> {

    /* renamed from: m */
    public static final String f4452m = "xj";

    /* renamed from: g */
    public String f4453g;

    /* renamed from: h */
    public String f4454h;

    /* renamed from: i */
    public boolean f4455i;

    /* renamed from: j */
    public long f4456j;
    @Nullable

    /* renamed from: k */
    public List<C2435qk> f4457k;
    @Nullable

    /* renamed from: l */
    public String f4458l;

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C2577wi mo12435d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("localId", (String) null);
            jSONObject.optString(NotificationCompat.CATEGORY_EMAIL, (String) null);
            this.f4453g = jSONObject.optString("idToken", (String) null);
            this.f4454h = jSONObject.optString("refreshToken", (String) null);
            this.f4455i = jSONObject.optBoolean("isNewUser", false);
            this.f4456j = jSONObject.optLong("expiresIn", 0);
            this.f4457k = C2435qk.m4037W(jSONObject.optJSONArray("mfaInfo"));
            this.f4458l = jSONObject.optString("mfaPendingCredential", (String) null);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C1960d.m2701C1(e, f4452m, str);
        }
    }
}
