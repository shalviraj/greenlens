package p005b.p096l.p097a.p113c.p119b.p120l.p121k;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.Objects;

/* renamed from: b.l.a.c.b.l.k.f2 */
public final class C1816f2 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ LifecycleCallback f3175g;

    /* renamed from: h */
    public final /* synthetic */ String f3176h;

    /* renamed from: i */
    public final /* synthetic */ C1823g2 f3177i;

    public C1816f2(C1823g2 g2Var, LifecycleCallback lifecycleCallback, String str) {
        this.f3177i = g2Var;
        this.f3175g = lifecycleCallback;
        this.f3176h = str;
    }

    public final void run() {
        C1823g2 g2Var = this.f3177i;
        if (g2Var.f3216h > 0) {
            LifecycleCallback lifecycleCallback = this.f3175g;
            Bundle bundle = g2Var.f3217i;
            lifecycleCallback.mo18873d(bundle != null ? bundle.getBundle(this.f3176h) : null);
        }
        if (this.f3177i.f3216h >= 2) {
            this.f3175g.mo18875f();
        }
        if (this.f3177i.f3216h >= 3) {
            Objects.requireNonNull(this.f3175g);
        }
        if (this.f3177i.f3216h >= 4) {
            this.f3175g.mo14698g();
        }
        if (this.f3177i.f3216h >= 5) {
            Objects.requireNonNull(this.f3175g);
        }
    }
}
