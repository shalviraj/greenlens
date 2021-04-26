package p005b.p096l.p097a.p113c.p131e.p136e;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p180d.p185o.C3919n0;

/* renamed from: b.l.a.c.e.e.ve */
public final class C2549ve implements C2116dj<C2602xj> {

    /* renamed from: a */
    public final /* synthetic */ C2648zh f4367a;

    /* renamed from: b */
    public final /* synthetic */ C2263jg f4368b;

    public C2549ve(C2263jg jgVar, C2648zh zhVar) {
        this.f4368b = jgVar;
        this.f4367a = zhVar;
    }

    /* renamed from: a */
    public final void mo12389a(Object obj) {
        C2602xj xjVar = (C2602xj) obj;
        if (!TextUtils.isEmpty(xjVar.f4458l)) {
            this.f4367a.mo13142h(new C2429qe(xjVar.f4458l, xjVar.f4457k, (C3919n0) null));
            return;
        }
        this.f4368b.mo12748f(new C2363nk(xjVar.f4454h, xjVar.f4453g, Long.valueOf(xjVar.f4456j), "Bearer"), (String) null, (String) null, Boolean.valueOf(xjVar.f4455i), (C3919n0) null, this.f4367a, this);
    }

    /* renamed from: d */
    public final void mo12390d(@Nullable String str) {
        this.f4367a.mo12771f(C1960d.m2768Y0(str));
    }
}
