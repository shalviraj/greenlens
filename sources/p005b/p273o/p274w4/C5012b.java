package p005b.p273o.p274w4;

import androidx.annotation.NonNull;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p273o.C4815d3;
import p005b.p273o.C4856i1;
import p005b.p273o.C4857i2;
import p005b.p273o.C4882j1;
import p005b.p273o.p274w4.p275f.C5016a;
import p005b.p273o.p274w4.p275f.C5018b;
import p005b.p273o.p274w4.p275f.C5019c;

/* renamed from: b.o.w4.b */
public class C5012b extends C5011a {

    /* renamed from: f */
    public static final String f9687f = "b.o.w4.b";

    public C5012b(@NonNull C5013c cVar, C4882j1 j1Var) {
        super(cVar, j1Var);
    }

    /* renamed from: a */
    public void mo16749a(@NonNull JSONObject jSONObject, C5016a aVar) {
    }

    /* renamed from: b */
    public void mo16750b() {
        C5019c cVar = this.f9684c;
        if (cVar == null) {
            cVar = C5019c.UNATTRIBUTED;
        }
        C5013c cVar2 = this.f9683b;
        if (cVar == C5019c.DIRECT) {
            cVar = C5019c.INDIRECT;
        }
        Objects.requireNonNull(cVar2.f9688a);
        C4815d3.m8833h(C4815d3.f9230a, "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE", cVar.toString());
    }

    /* renamed from: c */
    public int mo16751c() {
        Objects.requireNonNull(this.f9683b.f9688a);
        return C4815d3.m8828c(C4815d3.f9230a, "PREFS_OS_IAM_LIMIT", 10);
    }

    /* renamed from: d */
    public C5018b mo16752d() {
        return C5018b.IAM;
    }

    /* renamed from: f */
    public String mo16755f() {
        return "iam_id";
    }

    /* renamed from: g */
    public int mo16756g() {
        Objects.requireNonNull(this.f9683b.f9688a);
        return C4815d3.m8828c(C4815d3.f9230a, "PREFS_OS_IAM_INDIRECT_ATTRIBUTION_WINDOW", 1440);
    }

    /* renamed from: h */
    public JSONArray mo16757h() {
        JSONArray jSONArray;
        Objects.requireNonNull(this.f9683b.f9688a);
        String f = C4815d3.m8831f(C4815d3.f9230a, "PREFS_OS_LAST_IAMS_RECEIVED", "[]");
        if (f == null) {
            jSONArray = new JSONArray();
        }
        return jSONArray;
    }

    /* renamed from: i */
    public JSONArray mo16759i(String str) {
        C4857i2.C4868k kVar = C4857i2.C4868k.ERROR;
        try {
            JSONArray h = mo16757h();
            try {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < h.length(); i++) {
                    if (!str.equals(h.getJSONObject(i).getString("iam_id"))) {
                        jSONArray.put(h.getJSONObject(i));
                    }
                }
                return jSONArray;
            } catch (JSONException e) {
                Objects.requireNonNull((C4856i1) this.f9682a);
                C4857i2.m8933a(kVar, "Before KITKAT API, Generating tracker lastChannelObjectReceived get JSONObject ", e);
                return h;
            }
        } catch (JSONException e2) {
            Objects.requireNonNull((C4856i1) this.f9682a);
            C4857i2.m8933a(kVar, "Generating IAM tracker getLastChannelObjects JSONObject ", e2);
            return new JSONArray();
        }
    }

    /* renamed from: k */
    public void mo16761k() {
        Objects.requireNonNull(this.f9683b.f9688a);
        C5019c d = C5019c.m9220d(C4815d3.m8831f(C4815d3.f9230a, "PREFS_OS_OUTCOMES_CURRENT_IAM_INFLUENCE", C5019c.UNATTRIBUTED.toString()));
        this.f9684c = d;
        if (d != null && d.mo16778k()) {
            this.f9685d = mo16760j();
        }
        C4882j1 j1Var = this.f9682a;
        StringBuilder u = C0843a.m460u("OneSignal InAppMessageTracker initInfluencedTypeFromCache: ");
        u.append(toString());
        ((C4856i1) j1Var).mo16609a(u.toString());
    }

    /* renamed from: m */
    public void mo16763m(JSONArray jSONArray) {
        Objects.requireNonNull(this.f9683b.f9688a);
        C4815d3.m8833h(C4815d3.f9230a, "PREFS_OS_LAST_IAMS_RECEIVED", jSONArray.toString());
    }
}
