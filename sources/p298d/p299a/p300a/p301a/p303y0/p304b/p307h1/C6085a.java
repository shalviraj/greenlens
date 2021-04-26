package p298d.p299a.p300a.p301a.p303y0.p304b.p307h1;

import p298d.p299a.p300a.p301a.p303y0.p304b.C6083h;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6246v0;
import p298d.p299a.p300a.p301a.p303y0.p304b.p307h1.C6087b;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7455d0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7460d1;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7495e;
import p298d.p344x.p345b.C6862l;

/* renamed from: d.a.a.a.y0.b.h1.a */
public class C6085a implements C6862l<C7495e, C7489j0> {

    /* renamed from: g */
    public final /* synthetic */ C6087b.C6088a f11988g;

    public C6085a(C6087b.C6088a aVar) {
        this.f11988g = aVar;
    }

    public Object invoke(Object obj) {
        C7495e eVar = (C7495e) obj;
        C6083h e = eVar.mo25133e(C6087b.this);
        if (e == null) {
            return (C7489j0) C6087b.this.defaultType.invoke();
        }
        if (e instanceof C6246v0) {
            return C7455d0.m13427b((C6246v0) e, C7460d1.m13440f(e.getTypeConstructor().getParameters()));
        }
        return e instanceof C6146v ? C7460d1.m13449o(e.getTypeConstructor().refine(eVar), ((C6146v) e).getUnsubstitutedMemberScope(eVar), this) : e.getDefaultType();
    }
}
