package p005b.p096l.p097a.p113c.p131e.p136e;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import org.json.JSONObject;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.e.e.jl */
public final class C2268jl implements C2553vi {

    /* renamed from: g */
    public final String f3966g = "phone";

    /* renamed from: h */
    public final String f3967h;

    /* renamed from: i */
    public final String f3968i;
    @Nullable

    /* renamed from: j */
    public final String f3969j;
    @Nullable

    /* renamed from: k */
    public final String f3970k;
    @Nullable

    /* renamed from: l */
    public final String f3971l;
    @Nullable

    /* renamed from: m */
    public final String f3972m;
    @Nullable

    /* renamed from: n */
    public C2434qj f3973n;

    public C2268jl(String str, String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        C0823f.m376j("phone");
        C0823f.m376j(str);
        this.f3967h = str;
        C0823f.m376j(str2);
        this.f3968i = str2;
        this.f3970k = str3;
        this.f3969j = str4;
        this.f3971l = str5;
        this.f3972m = str6;
    }

    /* renamed from: a */
    public final String mo12411a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mfaPendingCredential", this.f3967h);
        jSONObject.put("mfaEnrollmentId", this.f3968i);
        this.f3966g.hashCode();
        jSONObject.put("mfaProvider", 1);
        if (this.f3970k != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("phoneNumber", this.f3970k);
            if (!TextUtils.isEmpty(this.f3971l)) {
                jSONObject2.put("recaptchaToken", this.f3971l);
            }
            if (!TextUtils.isEmpty(this.f3972m)) {
                jSONObject2.put("safetyNetToken", this.f3972m);
            }
            C2434qj qjVar = this.f3973n;
            if (qjVar != null) {
                jSONObject2.put("autoRetrievalInfo", qjVar.mo12930a());
            }
            jSONObject.put("phoneSignInInfo", jSONObject2);
        }
        return jSONObject.toString();
    }
}
