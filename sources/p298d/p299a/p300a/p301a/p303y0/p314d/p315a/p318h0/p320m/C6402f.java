package p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p320m;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7570v;
import p298d.p344x.p345b.C6851a;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6890k;

/* renamed from: d.a.a.a.y0.d.a.h0.m.f */
public final class C6402f extends C6890k implements C6851a<C7489j0> {

    /* renamed from: g */
    public final /* synthetic */ C6248w0 f12621g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6402f(C6248w0 w0Var) {
        super(0);
        this.f12621g = w0Var;
    }

    public Object invoke() {
        StringBuilder u = C0843a.m460u("Can't compute erased upper bound of type parameter `");
        u.append(this.f12621g);
        u.append('`');
        C7489j0 d = C7570v.m13783d(u.toString());
        C6888i.m12437d(d, "createErrorType(\"Can't compute erased upper bound of type parameter `$this`\")");
        return d;
    }
}
