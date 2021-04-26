package p005b.p096l.p097a.p113c.p131e.p136e;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.mk */
public final class C2339mk implements C2577wi<C2339mk> {

    /* renamed from: h */
    public static final String f4085h = "mk";

    /* renamed from: g */
    public List<String> f4086g;

    /* renamed from: a */
    public final C2339mk mo12819a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f4086g = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("authorizedDomains");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.f4086g.add(optJSONArray.getString(i));
                }
            }
            return this;
        } catch (JSONException e) {
            throw C1960d.m2701C1(e, f4085h, str);
        }
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C2577wi mo12435d(String str) {
        mo12819a(str);
        return this;
    }
}
