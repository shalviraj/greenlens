package p005b.p273o.p274w4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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

/* renamed from: b.o.w4.a */
public abstract class C5011a {

    /* renamed from: a */
    public C4882j1 f9682a;
    @NonNull

    /* renamed from: b */
    public C5013c f9683b;
    @Nullable

    /* renamed from: c */
    public C5019c f9684c;
    @Nullable

    /* renamed from: d */
    public JSONArray f9685d;
    @Nullable

    /* renamed from: e */
    public String f9686e;

    public C5011a(@NonNull C5013c cVar, C4882j1 j1Var) {
        this.f9683b = cVar;
        this.f9682a = j1Var;
    }

    /* renamed from: a */
    public abstract void mo16749a(@NonNull JSONObject jSONObject, C5016a aVar);

    /* renamed from: b */
    public abstract void mo16750b();

    /* renamed from: c */
    public abstract int mo16751c();

    /* renamed from: d */
    public abstract C5018b mo16752d();

    @NonNull
    /* renamed from: e */
    public C5016a mo16753e() {
        C5019c cVar;
        C5016a.C5017a aVar = new C5016a.C5017a();
        aVar.f9696b = C5019c.DISABLED;
        if (this.f9684c == null) {
            mo16761k();
        }
        if (this.f9684c.mo16777i()) {
            Objects.requireNonNull(this.f9683b.f9688a);
            if (C4815d3.m8827b(C4815d3.f9230a, "PREFS_OS_DIRECT_ENABLED", false)) {
                JSONArray put = new JSONArray().put(this.f9686e);
                C5016a.C5017a aVar2 = new C5016a.C5017a();
                aVar2.f9695a = put;
                aVar2.f9696b = C5019c.DIRECT;
                aVar = aVar2;
            }
        } else {
            if (this.f9684c.mo16778k()) {
                Objects.requireNonNull(this.f9683b.f9688a);
                if (C4815d3.m8827b(C4815d3.f9230a, "PREFS_OS_INDIRECT_ENABLED", false)) {
                    aVar = new C5016a.C5017a();
                    aVar.f9695a = this.f9685d;
                    cVar = C5019c.INDIRECT;
                }
            } else {
                Objects.requireNonNull(this.f9683b.f9688a);
                if (C4815d3.m8827b(C4815d3.f9230a, "PREFS_OS_UNATTRIBUTED_ENABLED", false)) {
                    aVar = new C5016a.C5017a();
                    cVar = C5019c.UNATTRIBUTED;
                }
            }
            aVar.f9696b = cVar;
        }
        aVar.f9697c = mo16752d();
        return new C5016a(aVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5011a aVar = (C5011a) obj;
        return this.f9684c == aVar.f9684c && aVar.mo16755f().equals(mo16755f());
    }

    /* renamed from: f */
    public abstract String mo16755f();

    /* renamed from: g */
    public abstract int mo16756g();

    /* renamed from: h */
    public abstract JSONArray mo16757h();

    public int hashCode() {
        return mo16755f().hashCode() + (this.f9684c.hashCode() * 31);
    }

    /* renamed from: i */
    public abstract JSONArray mo16759i(String str);

    /* renamed from: j */
    public JSONArray mo16760j() {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray h = mo16757h();
            C4882j1 j1Var = this.f9682a;
            ((C4856i1) j1Var).mo16609a("OneSignal ChannelTracker getLastReceivedIds lastChannelObjectReceived: " + h);
            long g = ((long) (mo16756g() * 60)) * 1000;
            long currentTimeMillis = System.currentTimeMillis();
            for (int i = 0; i < h.length(); i++) {
                JSONObject jSONObject = h.getJSONObject(i);
                if (currentTimeMillis - jSONObject.getLong("time") <= g) {
                    jSONArray.put(jSONObject.getString(mo16755f()));
                }
            }
        } catch (JSONException e) {
            Objects.requireNonNull((C4856i1) this.f9682a);
            C4857i2.m8933a(C4857i2.C4868k.ERROR, "Generating tracker getLastReceivedIds JSONObject ", e);
        }
        return jSONArray;
    }

    /* renamed from: k */
    public abstract void mo16761k();

    /* renamed from: l */
    public void mo16762l() {
        this.f9686e = null;
        JSONArray j = mo16760j();
        this.f9685d = j;
        this.f9684c = j.length() > 0 ? C5019c.INDIRECT : C5019c.UNATTRIBUTED;
        mo16750b();
        C4882j1 j1Var = this.f9682a;
        StringBuilder u = C0843a.m460u("OneSignal OSChannelTracker resetAndInitInfluence: ");
        u.append(mo16755f());
        u.append(" finish with influenceType: ");
        u.append(this.f9684c);
        ((C4856i1) j1Var).mo16609a(u.toString());
    }

    /* renamed from: m */
    public abstract void mo16763m(JSONArray jSONArray);

    /* renamed from: n */
    public void mo16764n(String str) {
        C4857i2.C4868k kVar = C4857i2.C4868k.ERROR;
        C4882j1 j1Var = this.f9682a;
        StringBuilder u = C0843a.m460u("OneSignal OSChannelTracker for: ");
        u.append(mo16755f());
        u.append(" saveLastId: ");
        u.append(str);
        ((C4856i1) j1Var).mo16609a(u.toString());
        if (str != null && !str.isEmpty()) {
            JSONArray i = mo16759i(str);
            C4882j1 j1Var2 = this.f9682a;
            StringBuilder u2 = C0843a.m460u("OneSignal OSChannelTracker for: ");
            u2.append(mo16755f());
            u2.append(" saveLastId with lastChannelObjectsReceived: ");
            u2.append(i);
            ((C4856i1) j1Var2).mo16609a(u2.toString());
            try {
                i.put(new JSONObject().put(mo16755f(), str).put("time", System.currentTimeMillis()));
                int c = mo16751c();
                if (i.length() > c) {
                    JSONArray jSONArray = new JSONArray();
                    for (int length = i.length() - c; length < i.length(); length++) {
                        try {
                            jSONArray.put(i.get(length));
                        } catch (JSONException e) {
                            Objects.requireNonNull((C4856i1) this.f9682a);
                            C4857i2.m8933a(kVar, "Before KITKAT API, Generating tracker lastChannelObjectsReceived get JSONObject ", e);
                        }
                    }
                    i = jSONArray;
                }
                C4882j1 j1Var3 = this.f9682a;
                StringBuilder u3 = C0843a.m460u("OneSignal OSChannelTracker for: ");
                u3.append(mo16755f());
                u3.append(" with channelObjectToSave: ");
                u3.append(i);
                ((C4856i1) j1Var3).mo16609a(u3.toString());
                mo16763m(i);
            } catch (JSONException e2) {
                Objects.requireNonNull((C4856i1) this.f9682a);
                C4857i2.m8933a(kVar, "Generating tracker newInfluenceId JSONObject ", e2);
            }
        }
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("OSChannelTracker{tag=");
        u.append(mo16755f());
        u.append(", influenceType=");
        u.append(this.f9684c);
        u.append(", indirectIds=");
        u.append(this.f9685d);
        u.append(", directId='");
        u.append(this.f9686e);
        u.append('\'');
        u.append('}');
        return u.toString();
    }
}
