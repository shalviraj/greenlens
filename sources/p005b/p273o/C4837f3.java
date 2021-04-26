package p005b.p273o;

import org.json.JSONObject;
import p005b.p273o.C4823e3;

/* renamed from: b.o.f3 */
public final class C4837f3 extends C4823e3.C4829e {

    /* renamed from: j */
    public final /* synthetic */ JSONObject f9296j;

    public C4837f3(JSONObject jSONObject) {
        this.f9296j = jSONObject;
        this.f9265b = jSONObject.optBoolean("enterp", false);
        jSONObject.optBoolean("require_email_auth", false);
        jSONObject.optBoolean("require_user_id_auth", false);
        this.f9266c = jSONObject.optJSONArray("chnl_lst");
        this.f9267d = jSONObject.optBoolean("fba", false);
        this.f9268e = jSONObject.optBoolean("restore_ttl_filter", true);
        this.f9264a = jSONObject.optString("android_sender_id", (String) null);
        this.f9269f = jSONObject.optBoolean("clear_group_on_summary_click", true);
        this.f9270g = jSONObject.optBoolean("receive_receipts_enable", false);
        this.f9271h = new C4823e3.C4828d();
        if (jSONObject.has("outcomes")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("outcomes");
            C4823e3.C4828d dVar = this.f9271h;
            if (optJSONObject.has("v2_enabled")) {
                dVar.f9263h = optJSONObject.optBoolean("v2_enabled");
            }
            if (optJSONObject.has("direct")) {
                dVar.f9260e = optJSONObject.optJSONObject("direct").optBoolean("enabled");
            }
            if (optJSONObject.has("indirect")) {
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("indirect");
                dVar.f9261f = optJSONObject2.optBoolean("enabled");
                if (optJSONObject2.has("notification_attribution")) {
                    JSONObject optJSONObject3 = optJSONObject2.optJSONObject("notification_attribution");
                    dVar.f9256a = optJSONObject3.optInt("minutes_since_displayed", 1440);
                    dVar.f9257b = optJSONObject3.optInt("limit", 10);
                }
                if (optJSONObject2.has("in_app_message_attribution")) {
                    JSONObject optJSONObject4 = optJSONObject2.optJSONObject("in_app_message_attribution");
                    dVar.f9258c = optJSONObject4.optInt("minutes_since_displayed", 1440);
                    dVar.f9259d = optJSONObject4.optInt("limit", 10);
                }
            }
            if (optJSONObject.has("unattributed")) {
                dVar.f9262g = optJSONObject.optJSONObject("unattributed").optBoolean("enabled");
            }
        }
        this.f9272i = new C4823e3.C4827c();
        if (jSONObject.has("fcm")) {
            JSONObject optJSONObject5 = jSONObject.optJSONObject("fcm");
            this.f9272i.f9255c = optJSONObject5.optString("api_key", (String) null);
            this.f9272i.f9254b = optJSONObject5.optString("app_id", (String) null);
            this.f9272i.f9253a = optJSONObject5.optString("project_id", (String) null);
        }
    }
}
