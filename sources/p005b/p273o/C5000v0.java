package p005b.p273o;

import org.json.JSONObject;

/* renamed from: b.o.v0 */
public class C5000v0 extends JSONObject {

    /* renamed from: a */
    public final /* synthetic */ String f9671a;

    public C5000v0(C4990u0 u0Var, String str) {
        boolean z;
        int i;
        this.f9671a = str;
        put("app_id", C4857i2.f9356a);
        put("player_id", C4857i2.m8950r());
        put("variant_id", str);
        boolean z2 = false;
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        if (z) {
            i = 2;
        } else {
            if (!C4835f2.m8864n()) {
                if (C4835f2.m8860j()) {
                    if (C4835f2.m8859i() && C4835f2.m8862l()) {
                        z2 = C4835f2.m8865o();
                    }
                }
                if (z2 || (!C4835f2.m8864n() && C4835f2.m8869s("com.huawei.hwid"))) {
                    i = 13;
                }
            }
            i = 1;
        }
        put("device_type", i);
        put("first_impression", true);
    }
}
