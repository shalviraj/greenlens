package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import java.util.ArrayList;
import java.util.List;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6035d0;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.b.h1.y */
public final class C6150y extends C6890k implements C6851a<C6116l> {

    /* renamed from: g */
    public final /* synthetic */ C6086a0 f12165g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6150y(C6086a0 a0Var) {
        super(0);
        this.f12165g = a0Var;
    }

    public Object invoke() {
        C6086a0 a0Var = this.f12165g;
        C6148w wVar = a0Var.f11992j;
        if (wVar != null) {
            List<C6086a0> b = wVar.mo23316b();
            b.contains(this.f12165g);
            for (C6086a0 a0Var2 : b) {
                C6035d0 d0Var = a0Var2.f11993k;
            }
            ArrayList arrayList = new ArrayList(C5266a.m9892V(b, 10));
            for (C6086a0 a0Var3 : b) {
                C6035d0 d0Var2 = a0Var3.f11993k;
                C6888i.m12436c(d0Var2);
                arrayList.add(d0Var2);
            }
            return new C6116l(arrayList);
        }
        StringBuilder u = C0843a.m460u("Dependencies of module ");
        u.append(a0Var.mo23194z());
        u.append(" were not set before querying module content");
        throw new AssertionError(u.toString());
    }
}
