package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1851p;
import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p180d.p185o.C3859c;
import p005b.p096l.p180d.p185o.p189e0.C3873e0;
import p005b.p096l.p180d.p185o.p189e0.C3883j0;
import p005b.p096l.p180d.p185o.p189e0.C3900y;

/* renamed from: b.l.a.c.e.e.eh */
public final class C2139eh extends C2091cj<Object, C3900y> {

    /* renamed from: p */
    public final C2428qd f3826p;

    public C2139eh(C3859c cVar, @Nullable String str) {
        super(2);
        C0823f.m380l(cVar, "credential cannot be null");
        C2364nl Z0 = C1960d.m2771Z0(cVar, str);
        Z0.f4117p = false;
        this.f3826p = new C2428qd(Z0);
    }

    /* renamed from: a */
    public final String mo12391a() {
        return "reauthenticateWithCredentialWithData";
    }

    /* renamed from: b */
    public final C1851p<C2040ai, Object> mo12392b() {
        C1851p.C1852a a = C1851p.m2499a();
        a.f3274a = new C2114dh(this);
        return a.mo12158a();
    }

    /* renamed from: c */
    public final void mo12393c() {
        C3883j0 d = C2600xh.m4401d(this.f3677c, this.f3683i);
        if (this.f3678d.mo15398Z().equalsIgnoreCase(d.f7146h.f7134g)) {
            ((C3900y) this.f3679e).mo15422b(this.f3682h, d);
            C3873e0 e0Var = new C3873e0(d);
            this.f3688n = true;
            this.f3689o.mo12434a(e0Var, (Status) null);
            return;
        }
        Status status = new Status(17024);
        this.f3688n = true;
        this.f3689o.mo12434a(null, status);
    }
}
