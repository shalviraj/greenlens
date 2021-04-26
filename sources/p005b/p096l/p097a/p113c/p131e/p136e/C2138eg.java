package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.annotation.Nullable;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p180d.p185o.C3860c0;

/* renamed from: b.l.a.c.e.e.eg */
public final class C2138eg implements C2116dj<C2363nk> {

    /* renamed from: a */
    public final /* synthetic */ C3860c0 f3823a;

    /* renamed from: b */
    public final /* synthetic */ C2648zh f3824b;

    /* renamed from: c */
    public final /* synthetic */ C2263jg f3825c;

    public C2138eg(C2263jg jgVar, C3860c0 c0Var, C2648zh zhVar) {
        this.f3825c = jgVar;
        this.f3823a = c0Var;
        this.f3824b = zhVar;
    }

    /* renamed from: a */
    public final void mo12389a(Object obj) {
        C2363nk nkVar = (C2363nk) obj;
        C2118dl dlVar = new C2118dl();
        String str = nkVar.f4104h;
        C0823f.m376j(str);
        dlVar.f3733g = str;
        C3860c0 c0Var = this.f3823a;
        if (c0Var.f7104i || c0Var.f7102g != null) {
            String str2 = c0Var.f7102g;
            if (str2 == null) {
                dlVar.f3739m.f4050h.add("DISPLAY_NAME");
            } else {
                dlVar.f3734h = str2;
            }
        }
        C3860c0 c0Var2 = this.f3823a;
        if (c0Var2.f7105j || c0Var2.f7106k != null) {
            String str3 = c0Var2.f7103h;
            if (str3 == null) {
                dlVar.f3739m.f4050h.add("PHOTO_URL");
            } else {
                dlVar.f3738l = str3;
            }
        }
        C2263jg.m3589c(this.f3825c, this.f3824b, nkVar, dlVar, this);
    }

    /* renamed from: d */
    public final void mo12390d(@Nullable String str) {
        this.f3824b.mo12771f(C1960d.m2768Y0(str));
    }
}
