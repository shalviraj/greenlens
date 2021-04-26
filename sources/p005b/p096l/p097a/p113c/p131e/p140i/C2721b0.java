package p005b.p096l.p097a.p113c.p131e.p140i;

import android.app.Activity;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p129c.C1984d;

/* renamed from: b.l.a.c.e.i.b0 */
public final class C2721b0 extends C2997w {

    /* renamed from: k */
    public final /* synthetic */ Activity f4636k;

    /* renamed from: l */
    public final /* synthetic */ C2777f0 f4637l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2721b0(C2777f0 f0Var, Activity activity) {
        super(f0Var.f4718g, true);
        this.f4637l = f0Var;
        this.f4636k = activity;
    }

    /* renamed from: a */
    public final void mo13214a() {
        C2996vb vbVar = this.f4637l.f4718g.f4745h;
        Objects.requireNonNull(vbVar, "null reference");
        vbVar.onActivityPaused(new C1984d(this.f4636k), this.f5095h);
    }
}
