package p005b.p096l.p097a.p113c.p131e.p136e;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p119b.p126p.C1963g;
import p005b.p096l.p180d.p185o.C3919n0;

/* renamed from: b.l.a.c.e.e.pl */
public final class C2412pl implements C2577wi<C2412pl> {

    /* renamed from: w */
    public static final String f4209w = "pl";

    /* renamed from: g */
    public boolean f4210g;

    /* renamed from: h */
    public String f4211h;

    /* renamed from: i */
    public String f4212i;

    /* renamed from: j */
    public long f4213j;

    /* renamed from: k */
    public String f4214k;

    /* renamed from: l */
    public String f4215l;

    /* renamed from: m */
    public String f4216m;

    /* renamed from: n */
    public boolean f4217n;

    /* renamed from: o */
    public String f4218o;

    /* renamed from: p */
    public String f4219p;

    /* renamed from: q */
    public String f4220q;

    /* renamed from: r */
    public String f4221r;

    /* renamed from: s */
    public String f4222s;

    /* renamed from: t */
    public String f4223t;

    /* renamed from: u */
    public List<C2435qk> f4224u;

    /* renamed from: v */
    public String f4225v;

    @Nullable
    /* renamed from: a */
    public final C3919n0 mo12922a() {
        if (TextUtils.isEmpty(this.f4218o) && TextUtils.isEmpty(this.f4219p)) {
            return null;
        }
        String str = this.f4215l;
        String str2 = this.f4219p;
        String str3 = this.f4218o;
        String str4 = this.f4222s;
        String str5 = this.f4220q;
        C0823f.m374i(str, "Must specify a non-empty providerId");
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            return new C3919n0(str, str2, str3, (C2364nl) null, str4, str5, (String) null);
        }
        throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C2577wi mo12435d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f4210g = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.f4211h = C1963g.m2880a(jSONObject.optString("idToken", (String) null));
            this.f4212i = C1963g.m2880a(jSONObject.optString("refreshToken", (String) null));
            this.f4213j = jSONObject.optLong("expiresIn", 0);
            C1963g.m2880a(jSONObject.optString("localId", (String) null));
            this.f4214k = C1963g.m2880a(jSONObject.optString(NotificationCompat.CATEGORY_EMAIL, (String) null));
            C1963g.m2880a(jSONObject.optString("displayName", (String) null));
            C1963g.m2880a(jSONObject.optString("photoUrl", (String) null));
            this.f4215l = C1963g.m2880a(jSONObject.optString("providerId", (String) null));
            this.f4216m = C1963g.m2880a(jSONObject.optString("rawUserInfo", (String) null));
            this.f4217n = jSONObject.optBoolean("isNewUser", false);
            this.f4218o = jSONObject.optString("oauthAccessToken", (String) null);
            this.f4219p = jSONObject.optString("oauthIdToken", (String) null);
            this.f4221r = C1963g.m2880a(jSONObject.optString("errorMessage", (String) null));
            this.f4222s = C1963g.m2880a(jSONObject.optString("pendingToken", (String) null));
            this.f4223t = C1963g.m2880a(jSONObject.optString("tenantId", (String) null));
            this.f4224u = C2435qk.m4037W(jSONObject.optJSONArray("mfaInfo"));
            this.f4225v = C1963g.m2880a(jSONObject.optString("mfaPendingCredential", (String) null));
            this.f4220q = C1963g.m2880a(jSONObject.optString("oauthTokenSecret", (String) null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C1960d.m2701C1(e, f4209w, str);
        }
    }
}
