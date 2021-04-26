package p298d.p299a.p300a.p301a.p303y0.p314d.p315a;

import java.util.Map;
import java.util.Objects;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6023b;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6232q0;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6275e0;
import p298d.p299a.p300a.p301a.p303y0.p314d.p324b.C6561p;
import p298d.p299a.p300a.p301a.p303y0.p331f.C6717d;
import p298d.p344x.p345b.C6862l;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.d.a.f */
public final class C6281f extends C6890k implements C6862l<C6023b, Boolean> {

    /* renamed from: g */
    public final /* synthetic */ C6232q0 f12366g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6281f(C6232q0 q0Var) {
        super(1);
        this.f12366g = q0Var;
    }

    public Object invoke(Object obj) {
        C6888i.m12438e((C6023b) obj, "it");
        C6275e0.C6276a aVar = C6275e0.f12342a;
        Map<String, C6717d> map = C6275e0.f12351j;
        String c = C6561p.m11654c(this.f12366g);
        Objects.requireNonNull(map, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        return Boolean.valueOf(map.containsKey(c));
    }
}
