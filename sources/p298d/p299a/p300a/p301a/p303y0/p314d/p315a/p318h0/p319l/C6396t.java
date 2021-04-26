package p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p319l;

import com.segment.analytics.integrations.BasePayload;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import p005b.p291q.p292a.C5266a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6206k;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6234r0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p305f1.C6060h;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6092c;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6264a;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p316f0.C6302k;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.C6324e;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.C6328g;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p320m.C6403g;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6423j;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p322j0.C6437x;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6483l;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6493q;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6499u;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7455d0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7484h1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p334t.C6798p;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.d.a.h0.l.t */
public final class C6396t extends C6092c {

    /* renamed from: m */
    public final C6328g f12604m;

    /* renamed from: n */
    public final C6437x f12605n;

    /* renamed from: o */
    public final C6324e f12606o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6396t(C6328g gVar, C6437x xVar, int i, C6206k kVar) {
        super(gVar.f12460a.f12428a, kVar, xVar.getName(), C7484h1.INVARIANT, false, i, C6234r0.f12257a, gVar.f12460a.f12440m);
        C6888i.m12438e(gVar, "c");
        C6888i.m12438e(xVar, "javaTypeParameter");
        C6888i.m12438e(kVar, "containingDeclaration");
        this.f12604m = gVar;
        this.f12605n = xVar;
        this.f12606o = new C6324e(gVar, xVar, false);
    }

    /* renamed from: D */
    public List<C7452c0> mo23233D() {
        Collection<C6423j> upperBounds = this.f12605n.getUpperBounds();
        if (upperBounds.isEmpty()) {
            C7455d0 d0Var = C7455d0.f14869a;
            C7489j0 anyType = this.f12604m.f12460a.f12442o.getBuiltIns().getAnyType();
            C6888i.m12437d(anyType, "c.module.builtIns.anyType");
            C7489j0 nullableAnyType = this.f12604m.f12460a.f12442o.getBuiltIns().getNullableAnyType();
            C6888i.m12437d(nullableAnyType, "c.module.builtIns.nullableAnyType");
            return C5266a.m9910Y2(C7455d0.m13428c(anyType, nullableAnyType));
        }
        ArrayList arrayList = new ArrayList(C5266a.m9892V(upperBounds, 10));
        for (C6423j e : upperBounds) {
            arrayList.add(this.f12604m.f12464e.mo23538e(e, C6403g.m11424c(C6302k.COMMON, false, this, 1)));
        }
        return arrayList;
    }

    public C6060h getAnnotations() {
        return this.f12606o;
    }

    /* renamed from: x */
    public List<C7452c0> mo23234x(List<? extends C7452c0> list) {
        C6888i.m12438e(list, "bounds");
        C6328g gVar = this.f12604m;
        C6483l lVar = gVar.f12460a.f12445r;
        Objects.requireNonNull(lVar);
        C6888i.m12438e(this, "typeParameter");
        C6888i.m12438e(list, "bounds");
        C6888i.m12438e(gVar, BasePayload.CONTEXT_KEY);
        ArrayList arrayList = new ArrayList(C5266a.m9892V(list, 10));
        for (C7452c0 c0Var : list) {
            if (!C5266a.m9942e0(c0Var, C6493q.f12727g)) {
                c0Var = new C6483l.C6485b(lVar, this, c0Var, C6798p.f13713g, false, gVar, C6264a.TYPE_PARAMETER_BOUNDS, true).mo23583b((C6499u) null).f12708a;
            }
            arrayList.add(c0Var);
        }
        return arrayList;
    }

    /* renamed from: z */
    public void mo23235z(C7452c0 c0Var) {
        C6888i.m12438e(c0Var, "type");
    }
}
