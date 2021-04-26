package p005b.p096l.p097a.p113c.p131e.p140i;

import android.os.Bundle;
import java.util.Objects;

/* renamed from: b.l.a.c.e.i.u */
public final class C2971u extends C2997w {

    /* renamed from: k */
    public final /* synthetic */ Long f5047k;

    /* renamed from: l */
    public final /* synthetic */ String f5048l;

    /* renamed from: m */
    public final /* synthetic */ String f5049m;

    /* renamed from: n */
    public final /* synthetic */ Bundle f5050n;

    /* renamed from: o */
    public final /* synthetic */ boolean f5051o;

    /* renamed from: p */
    public final /* synthetic */ boolean f5052p;

    /* renamed from: q */
    public final /* synthetic */ C2790g0 f5053q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2971u(C2790g0 g0Var, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(g0Var, true);
        this.f5053q = g0Var;
        this.f5047k = l;
        this.f5048l = str;
        this.f5049m = str2;
        this.f5050n = bundle;
        this.f5051o = z;
        this.f5052p = z2;
    }

    /* renamed from: a */
    public final void mo13214a() {
        Long l = this.f5047k;
        long longValue = l == null ? this.f5094g : l.longValue();
        C2996vb vbVar = this.f5053q.f4745h;
        Objects.requireNonNull(vbVar, "null reference");
        vbVar.logEvent(this.f5048l, this.f5049m, this.f5050n, this.f5051o, this.f5052p, longValue);
    }
}
