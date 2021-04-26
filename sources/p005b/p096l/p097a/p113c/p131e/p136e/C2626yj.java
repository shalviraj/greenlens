package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import org.json.JSONObject;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.e.e.yj */
public final class C2626yj implements C2553vi {

    /* renamed from: g */
    public final String f4506g = "phone";

    /* renamed from: h */
    public String f4507h;
    @Nullable

    /* renamed from: i */
    public final String f4508i;
    @Nullable

    /* renamed from: j */
    public final String f4509j;
    @Nullable

    /* renamed from: k */
    public final String f4510k;

    @VisibleForTesting
    public C2626yj(String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        C0823f.m376j("phone");
        C0823f.m376j(str);
        this.f4507h = str;
        this.f4508i = str2;
        this.f4510k = str3;
        this.f4509j = str4;
    }

    /* renamed from: a */
    public final String mo12411a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f4507h);
        this.f4506g.hashCode();
        jSONObject.put("mfaProvider", 1);
        String str = this.f4509j;
        if (str != null) {
            jSONObject.put("displayName", str);
        }
        JSONObject jSONObject2 = new JSONObject();
        String str2 = this.f4508i;
        if (str2 != null) {
            jSONObject2.put("sessionInfo", str2);
        }
        String str3 = this.f4510k;
        if (str3 != null) {
            jSONObject2.put("code", str3);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        return jSONObject.toString();
    }
}
