package p005b.p096l.p180d.p213v;

import android.os.Bundle;
import java.io.IOException;
import java.util.Objects;
import p005b.p096l.p097a.p113c.p150j.C3429i;

/* renamed from: b.l.d.v.s0 */
public final /* synthetic */ class C4269s0 implements Runnable {

    /* renamed from: g */
    public final C4271t0 f7901g;

    /* renamed from: h */
    public final Bundle f7902h;

    /* renamed from: i */
    public final C3429i f7903i;

    public C4269s0(C4271t0 t0Var, Bundle bundle, C3429i iVar) {
        this.f7901g = t0Var;
        this.f7902h = bundle;
        this.f7903i = iVar;
    }

    public final void run() {
        C4271t0 t0Var = this.f7901g;
        Bundle bundle = this.f7902h;
        C3429i iVar = this.f7903i;
        Objects.requireNonNull(t0Var);
        try {
            iVar.f6197a.mo14695q(t0Var.f7908c.mo15871b(bundle));
        } catch (IOException e) {
            iVar.f6197a.mo14694p(e);
        }
    }
}
