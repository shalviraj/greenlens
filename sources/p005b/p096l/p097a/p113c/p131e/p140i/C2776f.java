package p005b.p096l.p097a.p113c.p131e.p140i;

import android.app.Activity;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p129c.C1984d;

/* renamed from: b.l.a.c.e.i.f */
public final class C2776f extends C2997w {

    /* renamed from: k */
    public final /* synthetic */ Activity f4714k;

    /* renamed from: l */
    public final /* synthetic */ String f4715l;

    /* renamed from: m */
    public final /* synthetic */ String f4716m;

    /* renamed from: n */
    public final /* synthetic */ C2790g0 f4717n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2776f(C2790g0 g0Var, Activity activity, String str, String str2) {
        super(g0Var, true);
        this.f4717n = g0Var;
        this.f4714k = activity;
        this.f4715l = str;
        this.f4716m = str2;
    }

    /* renamed from: a */
    public final void mo13214a() {
        C2996vb vbVar = this.f4717n.f4745h;
        Objects.requireNonNull(vbVar, "null reference");
        vbVar.setCurrentScreen(new C1984d(this.f4714k), this.f4715l, this.f4716m, this.f5094g);
    }
}
