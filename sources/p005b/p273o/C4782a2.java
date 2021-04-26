package p005b.p273o;

import com.onesignal.OSSubscriptionState;
import org.json.JSONObject;

/* renamed from: b.o.a2 */
public class C4782a2 {

    /* renamed from: a */
    public OSSubscriptionState f9153a;

    /* renamed from: b */
    public OSSubscriptionState f9154b;

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f9154b.mo22367b());
            jSONObject.put("to", this.f9153a.mo22367b());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }
}
