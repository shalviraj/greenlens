package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.Objects;

/* renamed from: b.l.a.c.e.i.t */
public final class C2958t extends C2997w {

    /* renamed from: k */
    public final /* synthetic */ C3010x f5006k;

    /* renamed from: l */
    public final /* synthetic */ C2790g0 f5007l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2958t(C2790g0 g0Var, C3010x xVar) {
        super(g0Var, true);
        this.f5007l = g0Var;
        this.f5006k = xVar;
    }

    /* renamed from: a */
    public final void mo13214a() {
        C2996vb vbVar = this.f5007l.f4745h;
        Objects.requireNonNull(vbVar, "null reference");
        vbVar.registerOnMeasurementEventListener(this.f5006k);
    }
}
