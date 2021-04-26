package p005b.p096l.p097a.p113c.p131e.p136e;

import org.json.JSONObject;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.e.e.yl */
public final class C2628yl implements C2553vi {

    /* renamed from: g */
    public final String f4516g;

    /* renamed from: h */
    public final String f4517h;

    public C2628yl(String str, String str2) {
        C0823f.m376j(str);
        this.f4516g = str;
        C0823f.m376j(str2);
        this.f4517h = str2;
    }

    /* renamed from: a */
    public final String mo12411a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f4516g);
        jSONObject.put("mfaEnrollmentId", this.f4517h);
        return jSONObject.toString();
    }
}
