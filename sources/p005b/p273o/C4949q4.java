package p005b.p273o;

import com.segment.analytics.AnalyticsContext;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p273o.C4857i2;

/* renamed from: b.o.q4 */
public class C4949q4 extends C4920n3 {

    /* renamed from: a */
    public final /* synthetic */ JSONObject f9544a;

    /* renamed from: b */
    public final /* synthetic */ JSONObject f9545b;

    /* renamed from: c */
    public final /* synthetic */ String f9546c;

    /* renamed from: d */
    public final /* synthetic */ C4921n4 f9547d;

    public C4949q4(C4921n4 n4Var, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        this.f9547d = n4Var;
        this.f9544a = jSONObject;
        this.f9545b = jSONObject2;
        this.f9546c = str;
    }

    /* renamed from: a */
    public void mo16563a(int i, String str, Throwable th) {
        synchronized (this.f9547d.f9493a) {
            this.f9547d.f9501i = false;
            C4857i2.C4868k kVar = C4857i2.C4868k.WARN;
            C4857i2.m8933a(kVar, "Failed last request. statusCode: " + i + "\nresponse: " + str, (Throwable) null);
            if (C4921n4.m9033a(this.f9547d, i, str, "not a valid device_type")) {
                C4921n4.m9035c(this.f9547d);
            } else {
                C4921n4.m9036d(this.f9547d, i);
            }
        }
    }

    /* renamed from: b */
    public void mo16564b(String str) {
        String str2;
        C4857i2.C4868k kVar = C4857i2.C4868k.INFO;
        synchronized (this.f9547d.f9493a) {
            C4921n4 n4Var = this.f9547d;
            n4Var.f9501i = false;
            n4Var.f9502j.mo16603l(this.f9544a, this.f9545b);
            try {
                C4857i2.m8933a(C4857i2.C4868k.DEBUG, "doCreateOrNewSession:response: " + str, (Throwable) null);
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has(AnalyticsContext.Device.DEVICE_ID_KEY)) {
                    String optString = jSONObject.optString(AnalyticsContext.Device.DEVICE_ID_KEY);
                    this.f9547d.mo16632z(optString);
                    str2 = "Device registered, UserId = " + optString;
                } else {
                    str2 = "session sent, UserId = " + this.f9546c;
                }
                C4857i2.m8933a(kVar, str2, (Throwable) null);
                this.f9547d.mo16662o().mo16604m("session", Boolean.FALSE);
                this.f9547d.mo16662o().mo16602k();
                if (jSONObject.has("in_app_messages")) {
                    C4857i2.m8948p().mo16739v(jSONObject.getJSONArray("in_app_messages"));
                }
                this.f9547d.mo16630s(this.f9545b);
            } catch (JSONException e) {
                C4857i2.m8933a(C4857i2.C4868k.ERROR, "ERROR parsing on_session or create JSON Response.", e);
            }
        }
    }
}
