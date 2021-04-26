package p005b.p006a.p007a.p020k;

import android.webkit.URLUtil;
import org.json.JSONObject;
import p005b.p006a.p007a.p017h.C0694b0;
import p005b.p006a.p007a.p017h.C0733v;
import p005b.p273o.C4857i2;
import p005b.p273o.C4894l1;
import p005b.p273o.C4903m1;
import p298d.p344x.p346c.C6888i;
import p437o.p438a.p439a.C8068c;

/* renamed from: b.a.a.k.a */
public final class C0781a implements C4857i2.C4869l {
    /* renamed from: a */
    public void mo10614a(C4903m1 m1Var) {
        C6888i.m12438e(m1Var, "result");
        C4894l1.C4895a aVar = m1Var.f9468b.f9442a;
        JSONObject jSONObject = m1Var.f9467a.f9434a.f9490e;
        if (jSONObject != null) {
            String optString = jSONObject.optString("action", "");
            if (aVar == C4894l1.C4895a.Opened) {
                String str = null;
                if (C6888i.m12434a(optString, "openurl")) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("params");
                    String optString2 = optJSONObject != null ? optJSONObject.optString("url") : null;
                    if (optString2 != null && URLUtil.isValidUrl(optString2)) {
                        C8068c.m14948b().mo26008g(new C0694b0(optString2, (String) null));
                    }
                } else if (C6888i.m12434a(optString, "goto")) {
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("params");
                    if (optJSONObject2 != null) {
                        str = optJSONObject2.optString("href");
                    }
                    String str2 = str;
                    if (str2 != null) {
                        C8068c.m14948b().mo26008g(new C0733v(str2, (String) null, (Boolean) null, (String) null, 14));
                    }
                }
            }
        }
    }
}
