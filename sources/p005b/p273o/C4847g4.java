package p005b.p273o;

import java.util.ArrayList;

/* renamed from: b.o.g4 */
public class C4847g4 extends C4920n3 {

    /* renamed from: a */
    public final /* synthetic */ ArrayList f9309a;

    /* renamed from: b */
    public final /* synthetic */ C4830e4 f9310b;

    public C4847g4(C4830e4 e4Var, ArrayList arrayList) {
        this.f9310b = e4Var;
        this.f9309a = arrayList;
    }

    /* renamed from: b */
    public void mo16564b(String str) {
        this.f9310b.f9280f.addAll(this.f9309a);
        C4815d3.m8833h("GTPlayerPurchases", "purchaseTokens", this.f9310b.f9280f.toString());
        C4815d3.m8834i("GTPlayerPurchases", "ExistingPurchases", true);
        C4830e4 e4Var = this.f9310b;
        e4Var.f9281g = false;
        e4Var.f9282h = false;
    }
}
