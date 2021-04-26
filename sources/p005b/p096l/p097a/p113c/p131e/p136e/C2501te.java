package p005b.p096l.p097a.p113c.p131e.p136e;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p180d.p185o.C3919n0;

/* renamed from: b.l.a.c.e.e.te */
public final class C2501te implements C2116dj<C2556vl> {

    /* renamed from: a */
    public final /* synthetic */ C2648zh f4305a;

    /* renamed from: b */
    public final /* synthetic */ C2263jg f4306b;

    public C2501te(C2263jg jgVar, C2648zh zhVar) {
        this.f4306b = jgVar;
        this.f4305a = zhVar;
    }

    /* renamed from: a */
    public final void mo12389a(Object obj) {
        C2556vl vlVar = (C2556vl) obj;
        if (!TextUtils.isEmpty(vlVar.f4379k)) {
            this.f4305a.mo13142h(new C2429qe(vlVar.f4379k, vlVar.f4378j, (C3919n0) null));
            return;
        }
        this.f4306b.mo12748f(new C2363nk(vlVar.f4376h, vlVar.f4375g, Long.valueOf(vlVar.f4377i), "Bearer"), (String) null, (String) null, Boolean.FALSE, (C3919n0) null, this.f4305a, this);
    }

    /* renamed from: d */
    public final void mo12390d(@Nullable String str) {
        this.f4305a.mo12771f(C1960d.m2768Y0(str));
    }
}
