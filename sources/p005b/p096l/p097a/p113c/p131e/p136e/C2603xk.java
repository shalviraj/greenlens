package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.annotation.Nullable;
import org.json.JSONObject;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.e.e.xk */
public final class C2603xk implements C2553vi {

    /* renamed from: g */
    public final String f4459g;
    @Nullable

    /* renamed from: h */
    public final String f4460h;
    @Nullable

    /* renamed from: i */
    public final String f4461i;

    public C2603xk(String str, @Nullable String str2, @Nullable String str3) {
        C0823f.m376j(str);
        this.f4459g = str;
        this.f4460h = str2;
        this.f4461i = str3;
    }

    /* renamed from: a */
    public final String mo12411a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("oobCode", this.f4459g);
        String str = this.f4460h;
        if (str != null) {
            jSONObject.put("newPassword", str);
        }
        String str2 = this.f4461i;
        if (str2 != null) {
            jSONObject.put("tenantId", str2);
        }
        return jSONObject.toString();
    }
}
