package p005b.p006a.p007a.p020k;

import org.json.JSONObject;
import p005b.p006a.p007a.p017h.C0732u0;
import p005b.p273o.C4857i2;
import p005b.p273o.C4888k1;
import p298d.p344x.p346c.C6888i;
import p437o.p438a.p439a.C8068c;

/* renamed from: b.a.a.k.b */
public final class C0782b implements C4857i2.C4870m {
    /* renamed from: a */
    public void mo10615a(C4888k1 k1Var) {
        C6888i.m12438e(k1Var, "notification");
        JSONObject jSONObject = k1Var.f9434a.f9490e;
        String string = jSONObject != null ? jSONObject.getString("event") : null;
        if (string != null && C6888i.m12434a(string, "app.updated")) {
            C8068c.m14948b().mo26008g(new C0732u0(true));
        }
    }
}
