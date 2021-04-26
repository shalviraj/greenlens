package p005b.p273o.p276x4;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p273o.C4856i1;
import p005b.p273o.C4857i2;
import p005b.p273o.C4882j1;
import p005b.p273o.C4967s3;
import p005b.p273o.C4982t2;
import p005b.p273o.p276x4.p277j.C5036b;

/* renamed from: b.o.x4.e */
public class C5030e extends C5029d {
    public C5030e(C4882j1 j1Var, C5026a aVar, C5027b bVar) {
        super(j1Var, aVar, bVar);
    }

    /* renamed from: a */
    public void mo16787a(String str, int i, C5036b bVar, C4982t2 t2Var) {
        C4857i2.C4868k kVar = C4857i2.C4868k.ERROR;
        C4967s3 a = C4967s3.m9122a(bVar);
        int ordinal = a.f9591a.ordinal();
        if (ordinal == 0) {
            try {
                JSONObject b = a.mo16697b();
                b.put("app_id", str);
                b.put("device_type", i);
                b.put("direct", true);
                this.f9729c.mo16784a(b, t2Var);
            } catch (JSONException e) {
                Objects.requireNonNull((C4856i1) this.f9727a);
                C4857i2.m8933a(kVar, "Generating direct outcome:JSON Failed.", e);
            }
        } else if (ordinal == 1) {
            try {
                JSONObject b2 = a.mo16697b();
                b2.put("app_id", str);
                b2.put("device_type", i);
                b2.put("direct", false);
                this.f9729c.mo16784a(b2, t2Var);
            } catch (JSONException e2) {
                Objects.requireNonNull((C4856i1) this.f9727a);
                C4857i2.m8933a(kVar, "Generating indirect outcome:JSON Failed.", e2);
            }
        } else if (ordinal == 2) {
            try {
                JSONObject b3 = a.mo16697b();
                b3.put("app_id", str);
                b3.put("device_type", i);
                this.f9729c.mo16784a(b3, t2Var);
            } catch (JSONException e3) {
                Objects.requireNonNull((C4856i1) this.f9727a);
                C4857i2.m8933a(kVar, "Generating unattributed outcome:JSON Failed.", e3);
            }
        }
    }
}
