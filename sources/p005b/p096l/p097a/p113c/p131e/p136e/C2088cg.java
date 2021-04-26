package p005b.p096l.p097a.p113c.p131e.p136e;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.cg */
public final class C2088cg implements C2116dj<C2412pl> {

    /* renamed from: a */
    public final /* synthetic */ C2648zh f3671a;

    /* renamed from: b */
    public final /* synthetic */ C2263jg f3672b;

    public C2088cg(C2263jg jgVar, C2648zh zhVar) {
        this.f3672b = jgVar;
        this.f3671a = zhVar;
    }

    /* renamed from: a */
    public final void mo12389a(Object obj) {
        C2412pl plVar = (C2412pl) obj;
        if (!(!TextUtils.isEmpty(plVar.f4225v))) {
            C2263jg.m3588b(this.f3672b, plVar, this.f3671a, this);
        } else {
            this.f3671a.mo13142h(new C2429qe(plVar.f4225v, plVar.f4224u, plVar.mo12922a()));
        }
    }

    /* renamed from: d */
    public final void mo12390d(@Nullable String str) {
        this.f3671a.mo12771f(C1960d.m2768Y0(str));
    }
}
