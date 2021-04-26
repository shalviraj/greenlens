package p005b.p096l.p097a.p113c.p131e.p136e;

import org.json.JSONException;
import org.json.JSONObject;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p097a.p113c.p119b.p126p.C1963g;

/* renamed from: b.l.a.c.e.e.zl */
public final class C2652zl implements C2577wi<C2652zl> {

    /* renamed from: i */
    public static final String f4540i = "zl";

    /* renamed from: g */
    public String f4541g;

    /* renamed from: h */
    public String f4542h;

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C2577wi mo12435d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f4541g = C1963g.m2880a(jSONObject.optString("idToken", (String) null));
            this.f4542h = C1963g.m2880a(jSONObject.optString("refreshToken", (String) null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C1960d.m2701C1(e, f4540i, str);
        }
    }
}
