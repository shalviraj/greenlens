package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.Objects;

/* renamed from: b.l.a.c.b.l.k.e2 */
public final class C1812e2 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ LifecycleCallback f3170g;

    /* renamed from: h */
    public final /* synthetic */ String f3171h;

    /* renamed from: i */
    public final /* synthetic */ C1808d2 f3172i;

    public C1812e2(C1808d2 d2Var, LifecycleCallback lifecycleCallback, String str) {
        this.f3172i = d2Var;
        this.f3170g = lifecycleCallback;
        this.f3171h = str;
    }

    public final void run() {
        C1808d2 d2Var = this.f3172i;
        if (d2Var.f3164h > 0) {
            LifecycleCallback lifecycleCallback = this.f3170g;
            Bundle bundle = d2Var.f3165i;
            lifecycleCallback.mo18873d(bundle != null ? bundle.getBundle(this.f3171h) : null);
        }
        if (this.f3172i.f3164h >= 2) {
            this.f3170g.mo18875f();
        }
        if (this.f3172i.f3164h >= 3) {
            Objects.requireNonNull(this.f3170g);
        }
        if (this.f3172i.f3164h >= 4) {
            this.f3170g.mo14698g();
        }
        if (this.f3172i.f3164h >= 5) {
            Objects.requireNonNull(this.f3170g);
        }
    }
}
