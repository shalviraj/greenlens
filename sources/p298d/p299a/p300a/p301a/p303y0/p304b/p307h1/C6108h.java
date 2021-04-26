package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6103g;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7264b;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7277h;
import p298d.p299a.p300a.p301a.p303y0.p391i.p398z.C7287m;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p412n.C7639l;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.b.h1.h */
public class C6108h implements C6851a<C7277h> {

    /* renamed from: g */
    public final /* synthetic */ C6103g.C6105b f12070g;

    public C6108h(C6103g.C6105b bVar) {
        this.f12070g = bVar;
    }

    public Object invoke() {
        StringBuilder u = C0843a.m460u("Scope for type parameter ");
        u.append(this.f12070g.f12064g.mo23886e());
        String sb = u.toString();
        List<C7452c0> upperBounds = C6103g.this.getUpperBounds();
        int i = C7287m.f14531c;
        C6888i.m12438e(sb, "message");
        C6888i.m12438e(upperBounds, "types");
        ArrayList arrayList = new ArrayList(C5266a.m9892V(upperBounds, 10));
        for (C7452c0 memberScope : upperBounds) {
            arrayList.add(memberScope.getMemberScope());
        }
        C7639l<C7277h> Z2 = C5266a.m9915Z2(arrayList);
        C7277h b = C7264b.m13146b(sb, Z2);
        return Z2.f15137g <= 1 ? b : new C7287m(sb, b, (DefaultConstructorMarker) null);
    }
}
