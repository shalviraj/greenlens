package p005b.p096l.p180d.p185o;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;
import p005b.p096l.p097a.p113c.p131e.p136e.C2363nk;
import p005b.p096l.p180d.p185o.p189e0.C3886l;
import p005b.p096l.p180d.p185o.p189e0.C3900y;

/* renamed from: b.l.d.o.t0 */
public final class C3931t0 implements C3900y, C3886l {

    /* renamed from: a */
    public final /* synthetic */ FirebaseAuth f7205a;

    public C3931t0(FirebaseAuth firebaseAuth) {
        this.f7205a = firebaseAuth;
    }

    /* renamed from: a */
    public final void mo15412a(Status status) {
        int i = status.f11283h;
        if (i == 17011 || i == 17021 || i == 17005) {
            this.f7205a.mo22155a();
        }
    }

    /* renamed from: b */
    public final void mo15422b(C2363nk nkVar, C3922p pVar) {
        FirebaseAuth.m10515d(this.f7205a, pVar, nkVar, true, true);
    }
}
