package p005b.p096l.p097a.p113c.p131e.p136e;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: b.l.a.c.e.e.wl */
public final class C2580wl implements C2553vi {

    /* renamed from: g */
    public String f4412g;

    /* renamed from: h */
    public String f4413h;

    /* renamed from: i */
    public String f4414i;

    /* renamed from: j */
    public String f4415j;

    /* renamed from: k */
    public String f4416k;

    /* renamed from: l */
    public boolean f4417l;

    /* renamed from: a */
    public final String mo12411a() {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.f4415j)) {
            jSONObject.put("phoneNumber", this.f4412g);
            str2 = this.f4415j;
            str = "temporaryProof";
        } else {
            jSONObject.put("sessionInfo", this.f4413h);
            str2 = this.f4414i;
            str = "code";
        }
        jSONObject.put(str, str2);
        String str3 = this.f4416k;
        if (str3 != null) {
            jSONObject.put("idToken", str3);
        }
        if (!this.f4417l) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }
}
