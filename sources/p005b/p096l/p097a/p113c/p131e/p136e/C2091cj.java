package p005b.p096l.p097a.p113c.p131e.p136e;

import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p180d.C3825d;
import p005b.p096l.p180d.p185o.C3859c;
import p005b.p096l.p180d.p185o.C3922p;
import p005b.p096l.p180d.p185o.p189e0.C3886l;

/* renamed from: b.l.a.c.e.e.cj */
public abstract class C2091cj<ResultT, CallbackT> implements C2383og<C2040ai, ResultT> {

    /* renamed from: a */
    public final int f3675a;

    /* renamed from: b */
    public final C2041aj f3676b = new C2041aj(this);

    /* renamed from: c */
    public C3825d f3677c;

    /* renamed from: d */
    public C3922p f3678d;

    /* renamed from: e */
    public CallbackT f3679e;

    /* renamed from: f */
    public C3886l f3680f;

    /* renamed from: g */
    public final List<Object> f3681g = new ArrayList();

    /* renamed from: h */
    public C2363nk f3682h;

    /* renamed from: i */
    public C2192gk f3683i;

    /* renamed from: j */
    public C3859c f3684j;

    /* renamed from: k */
    public String f3685k;

    /* renamed from: l */
    public String f3686l;

    /* renamed from: m */
    public C2429qe f3687m;

    /* renamed from: n */
    public boolean f3688n;

    /* renamed from: o */
    public C2066bj f3689o;

    public C2091cj(int i) {
        this.f3675a = i;
    }

    /* renamed from: i */
    public static /* synthetic */ void m3154i(C2091cj cjVar) {
        cjVar.mo12393c();
        C0823f.m386o(cjVar.f3688n, "no success or failure set on method implementation");
    }

    /* renamed from: c */
    public abstract void mo12393c();

    /* renamed from: d */
    public final C2091cj<ResultT, CallbackT> mo12468d(C3825d dVar) {
        C0823f.m380l(dVar, "firebaseApp cannot be null");
        this.f3677c = dVar;
        return this;
    }

    /* renamed from: e */
    public final C2091cj<ResultT, CallbackT> mo12469e(C3922p pVar) {
        C0823f.m380l(pVar, "firebaseUser cannot be null");
        this.f3678d = pVar;
        return this;
    }

    /* renamed from: f */
    public final C2091cj<ResultT, CallbackT> mo12470f(CallbackT callbackt) {
        C0823f.m380l(callbackt, "external callback cannot be null");
        this.f3679e = callbackt;
        return this;
    }

    /* renamed from: g */
    public final C2091cj<ResultT, CallbackT> mo12471g(C3886l lVar) {
        C0823f.m380l(lVar, "external failure callback cannot be null");
        this.f3680f = lVar;
        return this;
    }

    /* renamed from: h */
    public final void mo12472h(ResultT resultt) {
        this.f3688n = true;
        this.f3689o.mo12434a(null, (Status) null);
    }
}
