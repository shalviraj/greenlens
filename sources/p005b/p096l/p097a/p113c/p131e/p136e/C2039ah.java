package p005b.p096l.p097a.p113c.p131e.p136e;

import com.google.android.gms.common.api.Status;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p119b.p120l.p121k.C1851p;
import p005b.p096l.p180d.p185o.C3938x;
import p005b.p096l.p180d.p185o.p189e0.C3873e0;
import p005b.p096l.p180d.p185o.p189e0.C3883j0;
import p005b.p096l.p180d.p185o.p189e0.C3900y;

/* renamed from: b.l.a.c.e.e.ah */
public final class C2039ah extends C2091cj<Object, C3900y> {

    /* renamed from: p */
    public final C3938x f3598p;

    public C2039ah(C3938x xVar) {
        super(2);
        C0823f.m380l(xVar, "credential cannot be null");
        this.f3598p = xVar;
    }

    /* renamed from: a */
    public final String mo12391a() {
        return "linkPhoneAuthCredential";
    }

    /* renamed from: b */
    public final C1851p<C2040ai, Object> mo12392b() {
        C1851p.C1852a a = C1851p.m2499a();
        a.f3274a = new C2647zg(this);
        return a.mo12158a();
    }

    /* renamed from: c */
    public final void mo12393c() {
        C3883j0 d = C2600xh.m4401d(this.f3677c, this.f3683i);
        ((C3900y) this.f3679e).mo15422b(this.f3682h, d);
        C3873e0 e0Var = new C3873e0(d);
        this.f3688n = true;
        this.f3689o.mo12434a(e0Var, (Status) null);
    }
}
