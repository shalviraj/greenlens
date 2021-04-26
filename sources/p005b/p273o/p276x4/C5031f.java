package p005b.p273o.p276x4;

import java.util.Objects;
import org.json.JSONObject;
import p005b.p273o.C4805c3;
import p005b.p273o.C4930o3;
import p005b.p273o.C4939p3;
import p005b.p273o.C4956r2;
import p005b.p273o.C4982t2;

/* renamed from: b.o.x4.f */
public class C5031f extends C5027b {
    public C5031f(C4956r2 r2Var) {
        super(r2Var);
    }

    /* renamed from: a */
    public void mo16784a(JSONObject jSONObject, C4982t2 t2Var) {
        C4939p3 p3Var = (C4939p3) this.f9722a;
        Objects.requireNonNull(p3Var);
        C4805c3.m8817p("outcomes/measure", jSONObject, new C4930o3(p3Var, t2Var));
    }
}
