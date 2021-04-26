package p005b.p096l.p097a.p113c.p131e.p136e;

import org.json.JSONException;
import org.json.JSONObject;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p119b.p126p.C1963g;

/* renamed from: b.l.a.c.e.e.xl */
public final class C2604xl implements C2577wi<C2604xl> {

    /* renamed from: m */
    public static final String f4462m = "xl";

    /* renamed from: g */
    public String f4463g;

    /* renamed from: h */
    public String f4464h;

    /* renamed from: i */
    public long f4465i;

    /* renamed from: j */
    public boolean f4466j;

    /* renamed from: k */
    public String f4467k;

    /* renamed from: l */
    public String f4468l;

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C2577wi mo12435d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f4463g = C1963g.m2880a(jSONObject.optString("idToken", (String) null));
            this.f4464h = C1963g.m2880a(jSONObject.optString("refreshToken", (String) null));
            this.f4465i = jSONObject.optLong("expiresIn", 0);
            C1963g.m2880a(jSONObject.optString("localId", (String) null));
            this.f4466j = jSONObject.optBoolean("isNewUser", false);
            this.f4467k = C1963g.m2880a(jSONObject.optString("temporaryProof", (String) null));
            this.f4468l = C1963g.m2880a(jSONObject.optString("phoneNumber", (String) null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C1960d.m2701C1(e, f4462m, str);
        }
    }
}
