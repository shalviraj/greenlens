package p005b.p273o;

import org.json.JSONObject;

/* renamed from: b.o.y0 */
public class C5040y0 extends JSONObject {

    /* renamed from: a */
    public final /* synthetic */ String f9741a;

    /* renamed from: b */
    public final /* synthetic */ String f9742b;

    /* renamed from: c */
    public final /* synthetic */ C4979t0 f9743c;

    public C5040y0(C4990u0 u0Var, String str, String str2, C4979t0 t0Var) {
        boolean z;
        int i;
        this.f9741a = str;
        this.f9742b = str2;
        this.f9743c = t0Var;
        put("app_id", C4857i2.m8949q());
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
        put("player_id", C4857i2.m8950r());
        put("click_id", str);
        put("variant_id", str2);
        if (t0Var.f9628g) {
            put("first_click", true);
        }
    }
}
