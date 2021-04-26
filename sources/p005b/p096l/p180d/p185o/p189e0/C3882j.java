package p005b.p096l.p180d.p185o.p189e0;

import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;
import p005b.p096l.p097a.p113c.p150j.C3423e0;
import p005b.p096l.p097a.p113c.p150j.C3428h;
import p005b.p096l.p097a.p113c.p150j.C3430j;
import p005b.p096l.p180d.C3825d;
import p005b.p096l.p180d.p185o.C3922p;
import p005b.p096l.p180d.p185o.C3924q;

/* renamed from: b.l.d.o.e0.j */
public final class C3882j implements Runnable {

    /* renamed from: g */
    public final String f7143g;

    /* renamed from: h */
    public final /* synthetic */ C3884k f7144h;

    public C3882j(C3884k kVar, String str) {
        this.f7144h = kVar;
        C0823f.m376j(str);
        this.f7143g = str;
    }

    public final void run() {
        FirebaseAuth instance = FirebaseAuth.getInstance(C3825d.m7209d(this.f7143g));
        C3922p pVar = instance.f11420f;
        if (pVar != null) {
            C3428h<C3924q> g = instance.mo22158g(pVar, true);
            C3884k.f7157h.mo12285d("Token refreshing started", new Object[0]);
            C3880i iVar = new C3880i(this);
            C3423e0 e0Var = (C3423e0) g;
            Objects.requireNonNull(e0Var);
            e0Var.mo14682d(C3430j.f6198a, iVar);
        }
    }
}
