package p298d.p299a.p300a.p301a.p303y0.p314d.p324b;

import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p320m.C6406i;
import p298d.p299a.p300a.p301a.p303y0.p326e.C6667q;
import p298d.p299a.p300a.p301a.p303y0.p326e.p327a0.C6582a;
import p298d.p299a.p300a.p301a.p303y0.p400j.p401b.C7393q;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7455d0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7489j0;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7570v;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.d.b.f */
public final class C6540f implements C7393q {

    /* renamed from: a */
    public static final C6540f f12833a = new C6540f();

    /* renamed from: a */
    public C7452c0 mo23642a(C6667q qVar, String str, C7489j0 j0Var, C7489j0 j0Var2) {
        C6888i.m12438e(qVar, "proto");
        C6888i.m12438e(str, "flexibleId");
        C6888i.m12438e(j0Var, "lowerBound");
        C6888i.m12438e(j0Var2, "upperBound");
        if (!C6888i.m12434a(str, "kotlin.jvm.PlatformType")) {
            C7489j0 d = C7570v.m13783d("Error java flexible type with id: " + str + ". (" + j0Var + ".." + j0Var2 + ')');
            C6888i.m12437d(d, "createErrorType(\"Error java flexible type with id: $flexibleId. ($lowerBound..$upperBound)\")");
            return d;
        } else if (qVar.mo24682m(C6582a.f12912g)) {
            return new C6406i(j0Var, j0Var2);
        } else {
            C7455d0 d0Var = C7455d0.f14869a;
            return C7455d0.m13428c(j0Var, j0Var2);
        }
    }
}
