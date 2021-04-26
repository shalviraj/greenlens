package p005b.p096l.p097a.p113c.p131e.p136e;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1851p;
import p005b.p096l.p180d.p185o.C3924q;
import p005b.p096l.p180d.p185o.p189e0.C3889n;
import p005b.p096l.p180d.p185o.p189e0.C3900y;

/* renamed from: b.l.a.c.e.e.ug */
public final class C2527ug extends C2091cj<C3924q, C3900y> {

    /* renamed from: p */
    public final C2523uc f4353p;

    public C2527ug(String str) {
        super(1);
        C0823f.m374i(str, "refresh token cannot be null");
        this.f4353p = new C2523uc(str);
    }

    /* renamed from: a */
    public final String mo12391a() {
        return "getAccessToken";
    }

    /* renamed from: b */
    public final C1851p<C2040ai, C3924q> mo12392b() {
        C1851p.C1852a a = C1851p.m2499a();
        a.f3274a = new C2503tg(this);
        return a.mo12158a();
    }

    /* renamed from: c */
    public final void mo12393c() {
        if (TextUtils.isEmpty(this.f3682h.f4103g)) {
            C2363nk nkVar = this.f3682h;
            String str = this.f4353p.f4344g;
            Objects.requireNonNull(nkVar);
            C0823f.m376j(str);
            nkVar.f4103g = str;
        }
        ((C3900y) this.f3679e).mo15422b(this.f3682h, this.f3678d);
        C3924q a = C3889n.m7278a(this.f3682h.f4104h);
        this.f3688n = true;
        this.f3689o.mo12434a(a, (Status) null);
    }
}
