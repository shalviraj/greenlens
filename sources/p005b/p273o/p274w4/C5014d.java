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

/* renamed from: b.o.w4.d */
public class C5014d extends C5011a {

    /* renamed from: f */
    public static final String f9689f = "b.o.w4.d";

    public C5014d(@NonNull C5013c cVar, C4882j1 j1Var) {
        super(cVar, j1Var);
    }

    /* renamed from: a */
    public void mo16749a(@NonNull JSONObject jSONObject, C5016a aVar) {
        if (aVar.f9693b.mo16776e()) {
            try {
                jSONObject.put("direct", aVar.f9693b.mo16777i());
                jSONObject.put("notification_ids", aVar.f9694c);
            } catch (JSONException e) {
                Objects.requireNonNull((C4856i1) this.f9682a);
                C4857i2.m8933a(C4857i2.C4868k.ERROR, "Generating notification tracker addSessionData JSONObject ", e);
            }
        }
    }

    /* renamed from: b */
    public void mo16750b() {
        C5013c cVar = this.f9683b;
        C5019c cVar2 = this.f9684c;
        if (cVar2 == null) {
            cVar2 = C5019c.UNATTRIBUTED;
        }
        Objects.requireNonNull(cVar.f9688a);
        String str = C4815d3.f9230a;
        C4815d3.m8833h(str, "PREFS_OS_OUTCOMES_CURRENT_SESSION", cVar2.toString());
        C5013c cVar3 = this.f9683b;
        String str2 = this.f9686e;
        Objects.requireNonNull(cVar3.f9688a);
        C4815d3.m8833h(str, "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN", str2);
    }

    /* renamed from: c */
    public int mo16751c() {
        Objects.requireNonNull(this.f9683b.f9688a);
        return C4815d3.m8828c(C4815d3.f9230a, "PREFS_OS_NOTIFICATION_LIMIT", 10);
    }

    /* renamed from: d */
    public C5018b mo16752d() {
        return C5018b.NOTIFICATION;
    }

    /* renamed from: f */
    public String mo16755f() {
        return "notification_id";
    }

    /* renamed from: g */
    public int mo16756g() {
        Objects.requireNonNull(this.f9683b.f9688a);
        return C4815d3.m8828c(C4815d3.f9230a, "PREFS_OS_INDIRECT_ATTRIBUTION_WINDOW", 1440);
    }

    /* renamed from: h */
    public JSONArray mo16757h() {
        JSONArray jSONArray;
        Objects.requireNonNull(this.f9683b.f9688a);
        String f = C4815d3.m8831f(C4815d3.f9230a, "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED", "[]");
        if (f == null) {
            jSONArray = new JSONArray();
        }
        return jSONArray;
    }

    /* renamed from: i */
    public JSONArray mo16759i(String str) {
        try {
            return mo16757h();
        } catch (JSONException e) {
            Objects.requireNonNull((C4856i1) this.f9682a);
            C4857i2.m8933a(C4857i2.C4868k.ERROR, "Generating Notification tracker getLastChannelObjects JSONObject ", e);
            return new JSONArray();
        }
    }

    /* renamed from: k */
    public void mo16761k() {
        Objects.requireNonNull(this.f9683b.f9688a);
        String str = C4815d3.f9230a;
        C5019c d = C5019c.m9220d(C4815d3.m8831f(str, "PREFS_OS_OUTCOMES_CURRENT_SESSION", C5019c.UNATTRIBUTED.toString()));
        this.f9684c = d;
        if (d.mo16778k()) {
            this.f9685d = mo16760j();
        } else if (d.mo16777i()) {
            Objects.requireNonNull(this.f9683b.f9688a);
            this.f9686e = C4815d3.m8831f(str, "PREFS_OS_LAST_ATTRIBUTED_NOTIFICATION_OPEN", (String) null);
        }
        C4882j1 j1Var = this.f9682a;
        StringBuilder u = C0843a.m460u("OneSignal NotificationTracker initInfluencedTypeFromCache: ");
        u.append(toString());
        ((C4856i1) j1Var).mo16609a(u.toString());
    }

    /* renamed from: m */
    public void mo16763m(JSONArray jSONArray) {
        Objects.requireNonNull(this.f9683b.f9688a);
        C4815d3.m8833h(C4815d3.f9230a, "PREFS_OS_LAST_NOTIFICATIONS_RECEIVED", jSONArray.toString());
    }
}
