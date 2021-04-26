package p005b.p096l.p097a.p151d.p152a.p154b;

import android.os.Bundle;
import java.util.Objects;
import p005b.p096l.p097a.p151d.p152a.p159e.C3584f;

/* renamed from: b.l.a.d.a.b.p */
public final /* synthetic */ class C3530p implements Runnable {

    /* renamed from: g */
    public final C3534q f6509g;

    /* renamed from: h */
    public final Bundle f6510h;

    public C3530p(C3534q qVar, Bundle bundle) {
        this.f6509g = qVar;
        this.f6510h = bundle;
    }

    public final void run() {
        C3557x0 x0Var;
        C3534q qVar = this.f6509g;
        Bundle bundle = this.f6510h;
        C3551v0 v0Var = qVar.f6524g;
        if (((Boolean) v0Var.mo14843b(new C3519m0(v0Var, bundle, (byte[]) null))).booleanValue()) {
            C3499h0 h0Var = qVar.f6525h;
            Objects.requireNonNull(h0Var);
            C3584f fVar = C3499h0.f6415j;
            fVar.mo14884b(3, "Run extractor loop", new Object[0]);
            if (h0Var.f6424i.compareAndSet(false, true)) {
                while (true) {
                    try {
                        x0Var = h0Var.f6423h.mo14865a();
                    } catch (C3495g0 e) {
                        C3499h0.f6415j.mo14884b(6, "Error while getting next extraction task: %s", new Object[]{e.getMessage()});
                        if (e.f6407g >= 0) {
                            h0Var.f6422g.mo14881a().mo14761d(e.f6407g);
                            h0Var.mo14783a(e.f6407g, e);
                        }
                        x0Var = null;
                    }
                    if (x0Var != null) {
                        try {
                            if (x0Var instanceof C3487e0) {
                                h0Var.f6417b.mo14773a((C3487e0) x0Var);
                            } else if (x0Var instanceof C3552v1) {
                                h0Var.f6418c.mo14848a((C3552v1) x0Var);
                            } else if (x0Var instanceof C3496g1) {
                                h0Var.f6419d.mo14784a((C3496g1) x0Var);
                            } else if (x0Var instanceof C3508j1) {
                                h0Var.f6420e.mo14794a((C3508j1) x0Var);
                            } else if (x0Var instanceof C3532p1) {
                                h0Var.f6421f.mo14799a((C3532p1) x0Var);
                            } else {
                                C3499h0.f6415j.mo14884b(6, "Unknown task type: %s", new Object[]{x0Var.getClass().getName()});
                            }
                        } catch (Exception e2) {
                            C3499h0.f6415j.mo14884b(6, "Error during extraction task: %s", new Object[]{e2.getMessage()});
                            h0Var.f6422g.mo14881a().mo14761d(x0Var.f6609a);
                            h0Var.mo14783a(x0Var.f6609a, e2);
                        }
                    } else {
                        h0Var.f6424i.set(false);
                        return;
                    }
                }
            } else {
                fVar.mo14884b(5, "runLoop already looping; return", new Object[0]);
            }
        }
    }
}
