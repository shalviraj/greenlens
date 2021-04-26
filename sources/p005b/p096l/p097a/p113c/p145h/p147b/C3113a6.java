package p005b.p096l.p097a.p113c.p145h.p147b;

import android.os.Bundle;
import java.util.Objects;
import p005b.p006a.p007a.p024o.C0823f;

/* renamed from: b.l.a.c.h.b.a6 */
public final class C3113a6 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ Bundle f5289g;

    /* renamed from: h */
    public final /* synthetic */ C3294q6 f5290h;

    public C3113a6(C3294q6 q6Var, Bundle bundle) {
        this.f5290h = q6Var;
        this.f5289g = bundle;
    }

    public final void run() {
        C3294q6 q6Var = this.f5290h;
        Bundle bundle = this.f5289g;
        q6Var.mo14126h();
        q6Var.mo14065i();
        Objects.requireNonNull(bundle, "null reference");
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        C0823f.m376j(string);
        C0823f.m376j(string2);
        Objects.requireNonNull(bundle.get("value"), "null reference");
        if (!q6Var.f5638a.mo14460j()) {
            q6Var.f5638a.mo14329d().f5807n.mo14414a("Conditional property not set since app measurement is disabled");
            return;
        }
        C3253m9 m9Var = new C3253m9(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            C3309s J = q6Var.f5638a.mo14467t().mo14519J(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0, true, false);
            C3309s J2 = q6Var.f5638a.mo14467t().mo14519J(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0, true, false);
            q6Var.f5638a.mo14473z().mo14229y(new C3118b(bundle.getString("app_id"), string2, m9Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), J2, bundle.getLong("trigger_timeout"), J, bundle.getLong("time_to_live"), q6Var.f5638a.mo14467t().mo14519J(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0, true, false)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
