package p005b.p096l.p097a.p113c.p131e.p136e;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import org.json.JSONObject;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.e.e.hl */
public final class C2218hl implements C2553vi {

    /* renamed from: g */
    public final String f3923g;

    /* renamed from: h */
    public final String f3924h = "phone";
    @Nullable

    /* renamed from: i */
    public final String f3925i;
    @Nullable

    /* renamed from: j */
    public final String f3926j;
    @Nullable

    /* renamed from: k */
    public final String f3927k;
    @Nullable

    /* renamed from: l */
    public final String f3928l;
    @Nullable

    /* renamed from: m */
    public C2434qj f3929m;

    public C2218hl(String str, String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        C0823f.m376j(str);
        this.f3923g = str;
        C0823f.m376j("phone");
        this.f3925i = str2;
        this.f3926j = str3;
        this.f3927k = str4;
        this.f3928l = str5;
    }

    /* renamed from: a */
    public final String mo12411a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.f3923g);
        this.f3924h.hashCode();
        jSONObject.put("mfaProvider", 1);
        if (this.f3925i != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.f3925i);
            if (!TextUtils.isEmpty(this.f3927k)) {
                jSONObject2.put("recaptchaToken", this.f3927k);
            }
            if (!TextUtils.isEmpty(this.f3928l)) {
                jSONObject2.put("safetyNetToken", this.f3928l);
            }
            C2434qj qjVar = this.f3929m;
            if (qjVar != null) {
                jSONObject2.put("autoRetrievalInfo", qjVar.mo12930a());
            }
            jSONObject.put("phoneEnrollmentInfo", jSONObject2);
        }
        return jSONObject.toString();
    }
}
