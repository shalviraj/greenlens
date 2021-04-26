package p005b.p096l.p097a.p113c.p145h.p147b;

import java.util.concurrent.Callable;

/* renamed from: b.l.a.c.h.b.d5 */
public final class C3148d5 implements Callable<byte[]> {

    /* renamed from: a */
    public final /* synthetic */ C3309s f5463a;

    /* renamed from: b */
    public final /* synthetic */ String f5464b;

    /* renamed from: c */
    public final /* synthetic */ C3205i5 f5465c;

    public C3148d5(C3205i5 i5Var, C3309s sVar, String str) {
        this.f5465c = i5Var;
        this.f5463a = sVar;
        this.f5464b = str;
    }

    public final Object call() {
        this.f5465c.f5605a.mo14360k();
        C3349v6 v6Var = this.f5465c.f5605a.f5655h;
        C3220j9.m6111F(v6Var);
        v6Var.mo14126h();
        throw new IllegalStateException("Unexpected call on client side");
    }
}
