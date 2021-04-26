package p005b.p273o;

import java.util.Objects;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.o.l4 */
public class C4898l4 extends C4920n3 {

    /* renamed from: a */
    public final /* synthetic */ C4907m4 f9450a;

    public C4898l4(C4907m4 m4Var) {
        this.f9450a = m4Var;
    }

    /* renamed from: b */
    public void mo16564b(String str) {
        JSONObject R;
        C4907m4.f9472l = true;
        if (str == null || str.isEmpty()) {
            str = "{}";
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("tags")) {
                synchronized (this.f9450a.f9493a) {
                    C4907m4 m4Var = this.f9450a;
                    JSONObject optJSONObject = m4Var.f9502j.mo16598g().f9670a.optJSONObject("tags");
                    JSONObject optJSONObject2 = this.f9450a.mo16661n().mo16598g().f9670a.optJSONObject("tags");
                    synchronized (m4Var.f9493a) {
                        R = C1960d.m2746R(optJSONObject, optJSONObject2, (JSONObject) null, (Set<String>) null);
                    }
                    C4853h4 h4Var = this.f9450a.f9502j;
                    JSONObject optJSONObject3 = jSONObject.optJSONObject("tags");
                    Objects.requireNonNull(h4Var);
                    synchronized (C4853h4.f9323d) {
                        h4Var.f9328c.put("tags", optJSONObject3);
                    }
                    this.f9450a.f9502j.mo16602k();
                    this.f9450a.mo16661n().mo16600i(jSONObject, R);
                    this.f9450a.mo16661n().mo16602k();
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
