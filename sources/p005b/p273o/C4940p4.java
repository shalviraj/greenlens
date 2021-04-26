package p005b.p273o;

import org.json.JSONObject;
import p005b.p273o.C4857i2;

/* renamed from: b.o.p4 */
public class C4940p4 extends C4920n3 {

    /* renamed from: a */
    public final /* synthetic */ JSONObject f9527a;

    /* renamed from: b */
    public final /* synthetic */ JSONObject f9528b;

    /* renamed from: c */
    public final /* synthetic */ C4921n4 f9529c;

    public C4940p4(C4921n4 n4Var, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f9529c = n4Var;
        this.f9527a = jSONObject;
        this.f9528b = jSONObject2;
    }

    /* renamed from: a */
    public void mo16563a(int i, String str, Throwable th) {
        C4857i2.C4868k kVar = C4857i2.C4868k.ERROR;
        C4857i2.m8933a(kVar, "Failed PUT sync request with status code: " + i + " and response: " + str, (Throwable) null);
        synchronized (this.f9529c.f9493a) {
            if (C4921n4.m9033a(this.f9529c, i, str, "No user with this id found")) {
                C4921n4.m9035c(this.f9529c);
            } else {
                C4921n4.m9036d(this.f9529c, i);
            }
        }
        if (this.f9527a.has("tags")) {
            C4921n4 n4Var = this.f9529c;
            C4857i2.C4877t tVar = new C4857i2.C4877t(i, str);
            while (true) {
                C4857i2.C4865h poll = n4Var.f9497e.poll();
                if (poll == null) {
                    break;
                }
                poll.mo16614a(tVar);
            }
        }
        if (this.f9527a.has("external_user_id")) {
            C4857i2.m8933a(kVar, "Error setting external user id for push with status code: " + i + " and message: " + str, (Throwable) null);
            this.f9529c.mo16656f();
        }
    }

    /* renamed from: b */
    public void mo16564b(String str) {
        synchronized (this.f9529c.f9493a) {
            this.f9529c.f9502j.mo16603l(this.f9528b, this.f9527a);
            this.f9529c.mo16630s(this.f9527a);
        }
        if (this.f9527a.has("tags")) {
            this.f9529c.mo16667w();
        }
        if (this.f9527a.has("external_user_id")) {
            this.f9529c.mo16657g();
        }
    }
}
