package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import org.json.JSONObject;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.e.e.ak */
public final class C2042ak implements C2553vi {

    /* renamed from: g */
    public final String f3600g = "phone";

    /* renamed from: h */
    public final String f3601h;
    @Nullable

    /* renamed from: i */
    public final String f3602i;
    @Nullable

    /* renamed from: j */
    public final String f3603j;

    @VisibleForTesting
    public C2042ak(String str, @Nullable String str2, @Nullable String str3) {
        C0823f.m376j("phone");
        C0823f.m376j(str);
        this.f3601h = str;
        this.f3602i = str2;
        this.f3603j = str3;
    }

    /* renamed from: a */
    public final String mo12411a() {
        JSONObject jSONObject = new JSONObject();
        this.f3600g.hashCode();
        jSONObject.put("mfaProvider", 1);
        jSONObject.put("mfaPendingCredential", this.f3601h);
        JSONObject jSONObject2 = new JSONObject();
        String str = this.f3602i;
        if (str != null) {
            jSONObject2.put("sessionInfo", str);
        }
        String str2 = this.f3603j;
        if (str2 != null) {
            jSONObject2.put("code", str2);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        return jSONObject.toString();
    }
}
