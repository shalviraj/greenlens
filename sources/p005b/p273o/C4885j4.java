package p005b.p273o;

import org.json.JSONException;
import org.json.JSONObject;
import p005b.p273o.C4857i2;
import p005b.p273o.C4947q3;

/* renamed from: b.o.j4 */
public class C4885j4 extends C4921n4 {
    public C4885j4() {
        super(C4947q3.C4948a.EMAIL);
    }

    /* renamed from: e */
    public void mo16625e(JSONObject jSONObject) {
        try {
            jSONObject.put("device_type", 11);
            jSONObject.putOpt("device_player_id", C4857i2.m8950r());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: h */
    public void mo16626h(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            String str = C4857i2.f9356a;
        }
    }

    /* renamed from: j */
    public String mo16627j() {
        return C4857i2.m8946n();
    }

    /* renamed from: k */
    public C4857i2.C4868k mo16628k() {
        return C4857i2.C4868k.INFO;
    }

    /* renamed from: r */
    public C4853h4 mo16629r(String str, boolean z) {
        return new C4879i4(str, z);
    }

    /* renamed from: s */
    public void mo16630s(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            String str = C4857i2.f9356a;
        }
    }

    /* renamed from: v */
    public void mo16631v() {
        if (!(C4857i2.m8946n() == null && mo16660m() == null) && C4857i2.m8950r() != null) {
            mo16659l(0).mo16670a();
        }
    }

    /* renamed from: z */
    public void mo16632z(String str) {
        C4952r0 r0Var;
        C4857i2.m8924A(str);
        boolean z = false;
        if (C4857i2.f9358c == null) {
            r0Var = null;
        } else {
            if (C4857i2.f9353W == null) {
                C4952r0 r0Var2 = new C4952r0(false);
                C4857i2.f9353W = r0Var2;
                r0Var2.f9555g.f9513b.add(new C4944q0());
            }
            r0Var = C4857i2.f9353W;
        }
        String str2 = r0Var.f9556h;
        if (str != null ? !str.equals(str2) : str2 != null) {
            z = true;
        }
        r0Var.f9556h = str;
        if (z) {
            r0Var.f9555g.mo16673a(r0Var);
        }
        try {
            C4947q3.m9086f(new JSONObject().put("parent_player_id", str));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
