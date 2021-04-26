package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.annotation.Nullable;
import java.util.List;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.a.c.e.e.mf */
public final class C2334mf implements C2116dj<C2142ek> {

    /* renamed from: a */
    public final /* synthetic */ C2116dj f4072a;

    /* renamed from: b */
    public final /* synthetic */ C2363nk f4073b;

    /* renamed from: c */
    public final /* synthetic */ C2358nf f4074c;

    public C2334mf(C2358nf nfVar, C2116dj djVar, C2363nk nkVar) {
        this.f4074c = nfVar;
        this.f4072a = djVar;
        this.f4073b = nkVar;
    }

    /* renamed from: a */
    public final void mo12389a(Object obj) {
        List<C2192gk> list = ((C2142ek) obj).f3830g.f3947g;
        if (list == null || list.isEmpty()) {
            this.f4072a.mo12390d("No users.");
            return;
        }
        C2118dl dlVar = new C2118dl();
        String str = this.f4073b.f4104h;
        C0823f.m376j(str);
        dlVar.f3733g = str;
        String str2 = this.f4074c.f4093a;
        C0823f.m376j(str2);
        dlVar.f3740n.f4050h.add(str2);
        C2358nf nfVar = this.f4074c;
        C2263jg.m3590d(nfVar.f4095c, nfVar.f4094b, this.f4073b, list.get(0), dlVar, this.f4072a);
    }

    /* renamed from: d */
    public final void mo12390d(@Nullable String str) {
        this.f4074c.f4094b.mo12771f(C1960d.m2768Y0(str));
    }
}
