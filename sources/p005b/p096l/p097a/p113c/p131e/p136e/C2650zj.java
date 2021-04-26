package p005b.p096l.p097a.p113c.p131e.p136e;

import org.json.JSONException;
import org.json.JSONObject;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.zj */
public final class C2650zj implements C2577wi<C2650zj> {

    /* renamed from: i */
    public static final String f4537i = "zj";

    /* renamed from: g */
    public String f4538g;

    /* renamed from: h */
    public String f4539h;

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C2577wi mo12435d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f4538g = jSONObject.optString("idToken", (String) null);
            this.f4539h = jSONObject.optString("refreshToken", (String) null);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw C1960d.m2701C1(e, f4537i, str);
        }
    }
}
