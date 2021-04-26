package p005b.p273o.p276x4;

import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import p005b.p273o.C4815d3;
import p005b.p273o.C4882j1;
import p005b.p273o.C5052z1;
import p005b.p273o.C5053z2;
import p005b.p273o.p274w4.p275f.C5018b;
import p005b.p273o.p276x4.p277j.C5035a;

/* renamed from: b.o.x4.a */
public class C5026a {

    /* renamed from: a */
    public C4882j1 f9719a;

    /* renamed from: b */
    public C5053z2 f9720b;

    /* renamed from: c */
    public C5052z1 f9721c;

    public C5026a(C4882j1 j1Var, C5053z2 z2Var, C5052z1 z1Var) {
        this.f9719a = j1Var;
        this.f9720b = z2Var;
        this.f9721c = z1Var;
    }

    /* renamed from: a */
    public final void mo16782a(List<C5035a> list, JSONArray jSONArray, C5018b bVar) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    list.add(new C5035a(jSONArray.getString(i), bVar));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo16783b() {
        C5052z1 z1Var = this.f9721c;
        Objects.requireNonNull(z1Var);
        String str = C4815d3.f9230a;
        Objects.requireNonNull(this.f9721c);
        Objects.requireNonNull(z1Var);
        return C4815d3.m8827b(str, "PREFS_OS_OUTCOMES_V2", false);
    }
}
