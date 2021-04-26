package p005b.p273o;

import org.json.JSONObject;

/* renamed from: b.o.u1 */
public class C4995u1 {

    /* renamed from: a */
    public C4981t1 f9662a;

    /* renamed from: b */
    public C4981t1 f9663b;

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f9663b.mo16715b());
            jSONObject.put("to", this.f9662a.mo16715b());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }
}
