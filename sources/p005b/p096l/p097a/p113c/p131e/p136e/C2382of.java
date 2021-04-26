package p005b.p096l.p097a.p113c.p131e.p136e;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p180d.p185o.C3919n0;

/* renamed from: b.l.a.c.e.e.of */
public final class C2382of implements C2116dj<C2652zl> {

    /* renamed from: a */
    public final /* synthetic */ C2406pf f4174a;

    public C2382of(C2406pf pfVar) {
        this.f4174a = pfVar;
    }

    /* renamed from: a */
    public final void mo12389a(Object obj) {
        C2652zl zlVar = (C2652zl) obj;
        if (TextUtils.isEmpty(zlVar.f4541g) || TextUtils.isEmpty(zlVar.f4542h)) {
            this.f4174a.f4201b.mo12771f(C1960d.m2768Y0("INTERNAL_SUCCESS_SIGN_OUT"));
            return;
        }
        C2363nk nkVar = new C2363nk(zlVar.f4542h, zlVar.f4541g, Long.valueOf(C1960d.m2765X0(zlVar.f4541g)), "Bearer");
        C2406pf pfVar = this.f4174a;
        pfVar.f4202c.mo12748f(nkVar, (String) null, (String) null, Boolean.FALSE, (C3919n0) null, pfVar.f4201b, this);
    }

    /* renamed from: d */
    public final void mo12390d(@Nullable String str) {
        this.f4174a.f4201b.mo12771f(C1960d.m2768Y0(str));
    }
}
