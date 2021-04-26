package p005b.p096l.p180d.p191q.p192f.p202m;

import org.json.JSONObject;
import p005b.p096l.p180d.p191q.p192f.p195g.C4026n0;
import p005b.p096l.p180d.p191q.p192f.p202m.p203j.C4192e;

/* renamed from: b.l.d.q.f.m.g */
public class C4185g {

    /* renamed from: a */
    public final C4026n0 f7767a;

    public C4185g(C4026n0 n0Var) {
        this.f7767a = n0Var;
    }

    /* renamed from: a */
    public C4192e mo15786a(JSONObject jSONObject) {
        return (jSONObject.getInt("settings_version") != 3 ? new C4180b() : new C4187i()).mo15782a(this.f7767a, jSONObject);
    }
}
