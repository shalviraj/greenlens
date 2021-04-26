package p005b.p273o;

import org.json.JSONObject;

/* renamed from: b.o.r0 */
public class C4952r0 implements Cloneable {

    /* renamed from: g */
    public C4927o1<Object, C4952r0> f9555g = new C4927o1<>("changed", false);

    /* renamed from: h */
    public String f9556h;

    /* renamed from: i */
    public String f9557i;

    public C4952r0(boolean z) {
        String str;
        if (z) {
            String str2 = C4815d3.f9230a;
            this.f9556h = C4815d3.m8831f(str2, "PREFS_ONESIGNAL_EMAIL_ID_LAST", (String) null);
            str = C4815d3.m8831f(str2, "PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST", (String) null);
        } else {
            this.f9556h = C4857i2.m8946n();
            str = C4947q3.m9081a().mo16660m();
        }
        this.f9557i = str;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            Object obj = this.f9556h;
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put("emailUserId", obj);
            Object obj2 = this.f9557i;
            if (obj2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject.put("emailAddress", obj2);
            jSONObject.put("subscribed", (this.f9556h == null || this.f9557i == null) ? false : true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }
}
