package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.Objects;
import p005b.p096l.p097a.p113c.p129c.C1984d;

/* renamed from: b.l.a.c.e.i.v */
public final class C2984v extends C2997w {

    /* renamed from: k */
    public final /* synthetic */ String f5078k;

    /* renamed from: l */
    public final /* synthetic */ String f5079l;

    /* renamed from: m */
    public final /* synthetic */ Object f5080m;

    /* renamed from: n */
    public final /* synthetic */ boolean f5081n;

    /* renamed from: o */
    public final /* synthetic */ C2790g0 f5082o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2984v(C2790g0 g0Var, String str, String str2, Object obj, boolean z) {
        super(g0Var, true);
        this.f5082o = g0Var;
        this.f5078k = str;
        this.f5079l = str2;
        this.f5080m = obj;
        this.f5081n = z;
    }

    /* renamed from: a */
    public final void mo13214a() {
        C2996vb vbVar = this.f5082o.f4745h;
        Objects.requireNonNull(vbVar, "null reference");
        vbVar.setUserProperty(this.f5078k, this.f5079l, new C1984d(this.f5080m), this.f5081n, this.f5094g);
    }
}
