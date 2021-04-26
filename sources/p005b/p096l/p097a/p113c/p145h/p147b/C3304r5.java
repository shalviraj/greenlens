package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Bundle;
import java.util.Iterator;
import java.util.TreeSet;

/* renamed from: b.l.a.c.h.b.r5 */
public final /* synthetic */ class C3304r5 implements Runnable {

    /* renamed from: g */
    public final C3294q6 f5928g;

    /* renamed from: h */
    public final Bundle f5929h;

    public C3304r5(C3294q6 q6Var, Bundle bundle) {
        this.f5928g = q6Var;
        this.f5929h = bundle;
    }

    public final void run() {
        C3294q6 q6Var = this.f5928g;
        Bundle bundle = this.f5929h;
        if (bundle == null) {
            q6Var.f5638a.mo14464q().f5443w.mo14621b(new Bundle());
            return;
        }
        Bundle a = q6Var.f5638a.mo14464q().f5443w.mo14620a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (q6Var.f5638a.mo14467t().mo14547p0(obj)) {
                    q6Var.f5638a.mo14467t().mo14515A(q6Var.f5906p, (String) null, 27, (String) null, (String) null, 0, q6Var.f5638a.f5848g.mo14197r((String) null, C3134c3.f5421z0));
                }
                q6Var.f5638a.mo14329d().f5804k.mo14416c("Invalid default event parameter type. Name, value", str, obj);
            } else if (C3297q9.m6338F(str)) {
                q6Var.f5638a.mo14329d().f5804k.mo14415b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                a.remove(str);
            } else {
                C3297q9 t = q6Var.f5638a.mo14467t();
                C3166f fVar = q6Var.f5638a.f5848g;
                if (t.mo14549q0("param", str, 100, obj)) {
                    q6Var.f5638a.mo14467t().mo14559z(a, str, obj);
                }
            }
        }
        q6Var.f5638a.mo14467t();
        int k = q6Var.f5638a.f5848g.mo14190k();
        if (a.size() > k) {
            Iterator it = new TreeSet(a.keySet()).iterator();
            int i = 0;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                i++;
                if (i > k) {
                    a.remove(str2);
                }
            }
            q6Var.f5638a.mo14467t().mo14515A(q6Var.f5906p, (String) null, 26, (String) null, (String) null, 0, q6Var.f5638a.f5848g.mo14197r((String) null, C3134c3.f5421z0));
            q6Var.f5638a.mo14329d().f5804k.mo14414a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        q6Var.f5638a.mo14464q().f5443w.mo14621b(a);
        C3175f8 z = q6Var.f5638a.mo14473z();
        z.mo14126h();
        z.mo14065i();
        z.mo14224t(new C3262n7(z, z.mo14226v(false), a));
    }
}
