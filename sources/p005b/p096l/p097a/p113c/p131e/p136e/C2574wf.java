package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.annotation.Nullable;
import java.util.List;

/* renamed from: b.l.a.c.e.e.wf */
public final class C2574wf implements C2116dj<C2142ek> {

    /* renamed from: a */
    public final /* synthetic */ C2116dj f4404a;

    /* renamed from: b */
    public final /* synthetic */ C2363nk f4405b;

    /* renamed from: c */
    public final /* synthetic */ C2598xf f4406c;

    public C2574wf(C2598xf xfVar, C2116dj djVar, C2363nk nkVar) {
        this.f4406c = xfVar;
        this.f4404a = djVar;
        this.f4405b = nkVar;
    }

    /* renamed from: a */
    public final void mo12389a(Object obj) {
        List<C2192gk> list = ((C2142ek) obj).f3830g.f3947g;
        if (list == null || list.isEmpty()) {
            this.f4404a.mo12390d("No users");
        } else {
            this.f4406c.f4445a.mo13137a(this.f4405b, list.get(0));
        }
    }

    /* renamed from: d */
    public final void mo12390d(@Nullable String str) {
        this.f4404a.mo12390d(str);
    }
}
