package p005b.p096l.p097a.p113c.p131e.p140i;

import android.app.Activity;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p129c.C1984d;

/* renamed from: b.l.a.c.e.i.d0 */
public final class C2749d0 extends C2997w {

    /* renamed from: k */
    public final /* synthetic */ Activity f4680k;

    /* renamed from: l */
    public final /* synthetic */ C2930qa f4681l;

    /* renamed from: m */
    public final /* synthetic */ C2777f0 f4682m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2749d0(C2777f0 f0Var, Activity activity, C2930qa qaVar) {
        super(f0Var.f4718g, true);
        this.f4682m = f0Var;
        this.f4680k = activity;
        this.f4681l = qaVar;
    }

    /* renamed from: a */
    public final void mo13214a() {
        C2996vb vbVar = this.f4682m.f4718g.f4745h;
        Objects.requireNonNull(vbVar, "null reference");
        vbVar.onActivitySaveInstanceState(new C1984d(this.f4680k), this.f4681l, this.f5095h);
    }
}
