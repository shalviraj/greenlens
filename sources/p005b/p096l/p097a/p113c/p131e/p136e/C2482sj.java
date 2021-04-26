package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.annotation.Nullable;
import org.json.JSONObject;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.e.e.sj */
public final class C2482sj implements C2553vi {

    /* renamed from: g */
    public final String f4291g;

    /* renamed from: h */
    public final String f4292h = "http://localhost";
    @Nullable

    /* renamed from: i */
    public final String f4293i;

    public C2482sj(String str, @Nullable String str2) {
        C0823f.m376j(str);
        this.f4291g = str;
        this.f4293i = str2;
    }

    /* renamed from: a */
    public final String mo12411a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("identifier", this.f4291g);
        jSONObject.put("continueUri", this.f4292h);
        String str = this.f4293i;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
