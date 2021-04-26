package p005b.p096l.p097a.p113c.p145h.p147b;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: b.l.a.c.h.b.e6 */
public final class C3161e6 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ AtomicReference f5489g;

    /* renamed from: h */
    public final /* synthetic */ String f5490h;

    /* renamed from: i */
    public final /* synthetic */ String f5491i;

    /* renamed from: j */
    public final /* synthetic */ boolean f5492j;

    /* renamed from: k */
    public final /* synthetic */ C3294q6 f5493k;

    public C3161e6(C3294q6 q6Var, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.f5493k = q6Var;
        this.f5489g = atomicReference;
        this.f5490h = str;
        this.f5491i = str2;
        this.f5492j = z;
    }

    public final void run() {
        C3175f8 z = this.f5493k.f5638a.mo14473z();
        AtomicReference atomicReference = this.f5489g;
        String str = this.f5490h;
        String str2 = this.f5491i;
        boolean z2 = this.f5492j;
        z.mo14126h();
        z.mo14065i();
        z.mo14224t(new C3372x7(z, atomicReference, str, str2, z.mo14226v(false), z2));
    }
}
