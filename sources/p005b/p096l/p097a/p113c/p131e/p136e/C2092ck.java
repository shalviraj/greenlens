package p005b.p096l.p097a.p113c.p131e.p136e;

import org.json.JSONObject;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.e.e.ck */
public final class C2092ck implements C2553vi {

    /* renamed from: g */
    public final String f3690g;

    public C2092ck(String str) {
        C0823f.m376j(str);
        this.f3690g = str;
    }

    /* renamed from: a */
    public final String mo12411a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", "refresh_token");
        jSONObject.put("refreshToken", this.f3690g);
        return jSONObject.toString();
    }
}
