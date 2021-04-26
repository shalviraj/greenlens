package p005b.p273o.p276x4;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p005b.p273o.C4856i1;
import p005b.p273o.C4857i2;
import p005b.p273o.C4882j1;
import p005b.p273o.C4982t2;
import p005b.p273o.p276x4.p277j.C5036b;

/* renamed from: b.o.x4.g */
public class C5032g extends C5029d {
    public C5032g(C4882j1 j1Var, C5026a aVar, C5027b bVar) {
        super(j1Var, aVar, bVar);
    }

    /* renamed from: a */
    public void mo16787a(String str, int i, C5036b bVar, C4982t2 t2Var) {
        try {
            JSONObject a = bVar.mo16788a();
            a.put("app_id", str);
            a.put("device_type", i);
            this.f9729c.mo16784a(a, t2Var);
        } catch (JSONException e) {
            Objects.requireNonNull((C4856i1) this.f9727a);
            C4857i2.m8933a(C4857i2.C4868k.ERROR, "Generating indirect outcome:JSON Failed.", e);
        }
    }
}
