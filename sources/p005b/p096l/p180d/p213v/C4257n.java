package p005b.p096l.p180d.p213v;

import android.os.Bundle;

/* renamed from: b.l.d.v.n */
public final class C4257n extends C4255m<Void> {
    public C4257n(int i, Bundle bundle) {
        super(i, 2, bundle);
    }

    /* renamed from: c */
    public final boolean mo15849c() {
        return true;
    }

    /* renamed from: d */
    public final void mo15850d(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            mo15847a(null);
        } else {
            mo15848b(new C4262p(4, "Invalid response to one way request"));
        }
    }
}
