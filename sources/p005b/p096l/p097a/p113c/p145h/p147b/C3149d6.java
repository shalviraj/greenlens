package p005b.p096l.p097a.p113c.p145h.p147b;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: b.l.a.c.h.b.d6 */
public final class C3149d6 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ AtomicReference f5466g;

    /* renamed from: h */
    public final /* synthetic */ String f5467h;

    /* renamed from: i */
    public final /* synthetic */ String f5468i;

    /* renamed from: j */
    public final /* synthetic */ C3294q6 f5469j;

    public C3149d6(C3294q6 q6Var, AtomicReference atomicReference, String str, String str2) {
        this.f5469j = q6Var;
        this.f5466g = atomicReference;
        this.f5467h = str;
        this.f5468i = str2;
    }

    public final void run() {
        C3175f8 z = this.f5469j.f5638a.mo14473z();
        AtomicReference atomicReference = this.f5466g;
        String str = this.f5467h;
        String str2 = this.f5468i;
        z.mo14126h();
        z.mo14065i();
        z.mo14224t(new C3350v7(z, atomicReference, str, str2, z.mo14226v(false)));
    }
}
