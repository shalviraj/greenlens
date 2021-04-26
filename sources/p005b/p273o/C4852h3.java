package p005b.p273o;

import org.json.JSONObject;

/* renamed from: b.o.h3 */
public final class C4852h3 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ String f9320g;

    /* renamed from: h */
    public final /* synthetic */ JSONObject f9321h;

    /* renamed from: i */
    public final /* synthetic */ C4920n3 f9322i;

    public C4852h3(String str, JSONObject jSONObject, C4920n3 n3Var) {
        this.f9320g = str;
        this.f9321h = jSONObject;
        this.f9322i = n3Var;
    }

    public void run() {
        C4805c3.m8813l(this.f9320g, "POST", this.f9321h, this.f9322i, 120000, (String) null);
    }
}
