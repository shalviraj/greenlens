package p005b.p273o;

import android.content.Context;
import org.json.JSONObject;

/* renamed from: b.o.t1 */
public class C4981t1 implements Cloneable {

    /* renamed from: g */
    public C4927o1<Object, C4981t1> f9634g = new C4927o1<>("changed", false);

    /* renamed from: h */
    public boolean f9635h;

    public C4981t1(boolean z) {
        if (z) {
            this.f9635h = C4815d3.m8827b(C4815d3.f9230a, "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST", false);
        } else {
            mo16714a();
        }
    }

    /* renamed from: a */
    public void mo16714a() {
        Context context = C4857i2.f9358c;
        boolean a = C4835f2.m8853a();
        boolean z = this.f9635h != a;
        this.f9635h = a;
        if (z) {
            this.f9634g.mo16673a(this);
        }
    }

    /* renamed from: b */
    public JSONObject mo16715b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enabled", this.f9635h);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String toString() {
        return mo16715b().toString();
    }
}
