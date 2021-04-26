package p298d.p299a.p300a.p301a.p303y0.p405l.p406j1;

import java.util.Objects;
import p298d.p299a.C6728g;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p299a.p300a.p301a.p303y0.p405l.p406j1.C7504k;
import p298d.p344x.p345b.C6866p;
import p298d.p344x.p346c.C6886g;
import p298d.p344x.p346c.C6888i;
import p298d.p344x.p346c.C6902w;

/* renamed from: d.a.a.a.y0.l.j1.t */
public final /* synthetic */ class C7519t extends C6886g implements C6866p<C7452c0, C7452c0, Boolean> {
    public C7519t(C7512r rVar) {
        super(2, rVar);
    }

    public final String getName() {
        return "isStrictSupertype";
    }

    public Object invoke(Object obj, Object obj2) {
        C7452c0 c0Var = (C7452c0) obj;
        C7452c0 c0Var2 = (C7452c0) obj2;
        C6888i.m12438e(c0Var, "p0");
        C6888i.m12438e(c0Var2, "p1");
        Objects.requireNonNull((C7512r) this.f13782h);
        Objects.requireNonNull(C7504k.f14945b);
        C7506l lVar = C7504k.C7505a.f14947b;
        return Boolean.valueOf(lVar.mo25128d(c0Var, c0Var2) && !lVar.mo25128d(c0Var2, c0Var));
    }

    /* renamed from: w */
    public final C6728g mo22957w() {
        return C6902w.m12460a(C7512r.class);
    }

    /* renamed from: y */
    public final String mo22958y() {
        return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }
}
