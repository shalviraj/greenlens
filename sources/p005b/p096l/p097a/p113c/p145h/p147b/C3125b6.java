package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Bundle;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.h.b.b6 */
public final class C3125b6 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ Bundle f5324g;

    /* renamed from: h */
    public final /* synthetic */ C3294q6 f5325h;

    public C3125b6(C3294q6 q6Var, Bundle bundle) {
        this.f5325h = q6Var;
        this.f5324g = bundle;
    }

    public final void run() {
        C3294q6 q6Var = this.f5325h;
        Bundle bundle = this.f5324g;
        q6Var.mo14126h();
        q6Var.mo14065i();
        Objects.requireNonNull(bundle, "null reference");
        C0823f.m376j(bundle.getString("name"));
        if (q6Var.f5638a.mo14460j()) {
            try {
                q6Var.f5638a.mo14473z().mo14229y(new C3118b(bundle.getString("app_id"), bundle.getString("origin"), q6Var.f5638a.f5848g.mo14197r((String) null, C3134c3.f5341A0) ? new C3253m9(bundle.getString("name"), 0, (Object) null, "") : new C3253m9(bundle.getString("name"), 0, (Object) null, (String) null), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), (C3309s) null, bundle.getLong("trigger_timeout"), (C3309s) null, bundle.getLong("time_to_live"), q6Var.f5638a.mo14467t().mo14519J(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), bundle.getLong("creation_timestamp"), true, false)));
            } catch (IllegalArgumentException unused) {
            }
        } else {
            q6Var.f5638a.mo14329d().f5807n.mo14414a("Conditional property not cleared since app measurement is disabled");
        }
    }
}
