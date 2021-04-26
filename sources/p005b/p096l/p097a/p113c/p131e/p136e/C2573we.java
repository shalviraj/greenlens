package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.annotation.Nullable;
import java.util.List;

/* renamed from: b.l.a.c.e.e.we */
public final class C2573we implements C2116dj<C2142ek> {

    /* renamed from: a */
    public final /* synthetic */ C2116dj f4399a;

    /* renamed from: b */
    public final /* synthetic */ C2648zh f4400b;

    /* renamed from: c */
    public final /* synthetic */ C2363nk f4401c;

    /* renamed from: d */
    public final /* synthetic */ C2118dl f4402d;

    /* renamed from: e */
    public final /* synthetic */ C2263jg f4403e;

    public C2573we(C2263jg jgVar, C2116dj djVar, C2648zh zhVar, C2363nk nkVar, C2118dl dlVar) {
        this.f4403e = jgVar;
        this.f4399a = djVar;
        this.f4400b = zhVar;
        this.f4401c = nkVar;
        this.f4402d = dlVar;
    }

    /* renamed from: a */
    public final void mo12389a(Object obj) {
        List<C2192gk> list = ((C2142ek) obj).f3830g.f3947g;
        if (list == null || list.isEmpty()) {
            this.f4399a.mo12390d("No users");
        } else {
            C2263jg.m3590d(this.f4403e, this.f4400b, this.f4401c, list.get(0), this.f4402d, this.f4399a);
        }
    }

    /* renamed from: d */
    public final void mo12390d(@Nullable String str) {
        this.f4399a.mo12390d(str);
    }
}
