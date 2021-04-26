package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.annotation.Nullable;
import com.segment.analytics.AnalyticsContext;
import org.json.JSONObject;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.e.e.ql */
public final class C2436ql implements C2553vi {

    /* renamed from: g */
    public final String f4242g;
    @Nullable

    /* renamed from: h */
    public final String f4243h;

    public C2436ql(String str, @Nullable String str2) {
        C0823f.m376j(str);
        this.f4242g = str;
        this.f4243h = str2;
    }

    /* renamed from: a */
    public final String mo12411a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AnalyticsContext.Device.DEVICE_TOKEN_KEY, this.f4242g);
        jSONObject.put("returnSecureToken", true);
        String str = this.f4243h;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
