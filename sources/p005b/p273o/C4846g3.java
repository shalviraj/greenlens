package p005b.p273o;

import org.json.JSONObject;

/* renamed from: b.o.g3 */
public final class C4846g3 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ String f9306g;

    /* renamed from: h */
    public final /* synthetic */ JSONObject f9307h;

    /* renamed from: i */
    public final /* synthetic */ C4920n3 f9308i;

    public C4846g3(String str, JSONObject jSONObject, C4920n3 n3Var) {
        this.f9306g = str;
        this.f9307h = jSONObject;
        this.f9308i = n3Var;
    }

    public void run() {
        C4805c3.m8813l(this.f9306g, "PUT", this.f9307h, this.f9308i, 120000, (String) null);
    }
}
