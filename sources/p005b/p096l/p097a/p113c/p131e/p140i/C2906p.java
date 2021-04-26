package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.Objects;
import p005b.p096l.p097a.p113c.p129c.C1984d;

/* renamed from: b.l.a.c.e.i.p */
public final class C2906p extends C2997w {

    /* renamed from: k */
    public final /* synthetic */ String f4926k;

    /* renamed from: l */
    public final /* synthetic */ Object f4927l;

    /* renamed from: m */
    public final /* synthetic */ C2790g0 f4928m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2906p(C2790g0 g0Var, String str, Object obj) {
        super(g0Var, false);
        this.f4928m = g0Var;
        this.f4926k = str;
        this.f4927l = obj;
    }

    /* renamed from: a */
    public final void mo13214a() {
        C2996vb vbVar = this.f4928m.f4745h;
        Objects.requireNonNull(vbVar, "null reference");
        vbVar.logHealthData(5, this.f4926k, new C1984d(this.f4927l), new C1984d(null), new C1984d(null));
    }
}
