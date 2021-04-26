package p005b.p273o;

import androidx.core.app.NotificationCompat;
import com.onesignal.OSSubscriptionState;
import org.json.JSONObject;
import p005b.p273o.C4857i2;
import p005b.p273o.C4947q3;

/* renamed from: b.o.m4 */
public class C4907m4 extends C4921n4 {

    /* renamed from: l */
    public static boolean f9472l;

    public C4907m4() {
        super(C4947q3.C4948a.PUSH);
    }

    /* renamed from: e */
    public void mo16625e(JSONObject jSONObject) {
    }

    /* renamed from: h */
    public void mo16626h(JSONObject jSONObject) {
        if (jSONObject.has(NotificationCompat.CATEGORY_EMAIL)) {
            String str = C4857i2.f9356a;
        }
    }

    /* renamed from: j */
    public String mo16627j() {
        return C4857i2.m8950r();
    }

    /* renamed from: k */
    public C4857i2.C4868k mo16628k() {
        return C4857i2.C4868k.ERROR;
    }

    /* renamed from: r */
    public C4853h4 mo16629r(String str, boolean z) {
        return new C4891k4(str, z);
    }

    /* renamed from: s */
    public void mo16630s(JSONObject jSONObject) {
        if (jSONObject.has(NotificationCompat.CATEGORY_EMAIL)) {
            String str = C4857i2.f9356a;
        }
        if (jSONObject.has("identifier")) {
            String str2 = C4857i2.f9356a;
        }
    }

    /* renamed from: v */
    public void mo16631v() {
        mo16659l(0).mo16670a();
    }

    /* renamed from: z */
    public void mo16632z(String str) {
        C4857i2.f9359d = str;
        if (C4857i2.f9358c != null) {
            C4815d3.m8833h(C4815d3.f9230a, "GT_PLAYER_ID", C4857i2.f9359d);
        }
        synchronized (C4857i2.f9341K) {
            if (C4857i2.f9341K.size() != 0) {
                new Thread(new C4883j2(), "OS_GETTAGS_CALLBACK").start();
            }
        }
        OSSubscriptionState m = C4857i2.m8945m(C4857i2.f9358c);
        boolean z = true;
        String str2 = m.f11501j;
        if (str != null ? str.equals(str2) : str2 == null) {
            z = false;
        }
        m.f11501j = str;
        if (z) {
            m.f11498g.mo16673a(m);
        }
        C4857i2.C4867j jVar = C4857i2.f9354X;
        if (jVar != null) {
            C4857i2.m8925B(jVar.f9396a, jVar.f9397b, jVar.f9398c);
            C4857i2.f9354X = null;
        }
        C4947q3.m9081a().mo16631v();
        C4893l0.m8990a(C4857i2.f9356a, str, C4809d.f9203a);
    }
}
