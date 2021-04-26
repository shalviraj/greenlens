package p005b.p096l.p097a.p113c.p131e.p138g;

import android.os.IInterface;

/* renamed from: b.l.a.c.e.g.x */
public final class C2694x {

    /* renamed from: a */
    public final /* synthetic */ C2693w f4589a;

    public C2694x(C2693w wVar) {
        this.f4589a = wVar;
    }

    /* renamed from: a */
    public final void mo13190a() {
        if (!this.f4589a.mo12198a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* renamed from: b */
    public final IInterface mo13191b() {
        return (C2679i) this.f4589a.mo12190B();
    }
}
