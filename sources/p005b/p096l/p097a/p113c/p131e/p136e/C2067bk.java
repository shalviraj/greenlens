package p005b.p096l.p097a.p113c.p131e.p136e;

import org.json.JSONException;
import org.json.JSONObject;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.bk */
public final class C2067bk implements C2577wi<C2067bk> {

    /* renamed from: i */
    public static final String f3653i = "bk";

    /* renamed from: g */
    public String f3654g;

    /* renamed from: h */
    public String f3655h;

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C2577wi mo12435d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f3654g = jSONObject.optString("idToken", (String) null);
            this.f3655h = jSONObject.optString("refreshToken", (String) null);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C1960d.m2701C1(e, f3653i, str);
        }
    }
}
