package p005b.p096l.p097a.p151d.p152a.p154b;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;
import p005b.p096l.p097a.p151d.p152a.p156c.C3567c;
import p005b.p096l.p097a.p151d.p152a.p159e.C3583e0;
import p005b.p096l.p097a.p151d.p152a.p159e.C3585f0;

/* renamed from: b.l.a.d.a.b.n1 */
public final class C3524n1 implements C3585f0<C3520m1> {

    /* renamed from: a */
    public final C3585f0 f6490a;

    /* renamed from: b */
    public final C3585f0 f6491b;

    /* renamed from: c */
    public final C3585f0 f6492c;

    /* renamed from: d */
    public final C3585f0 f6493d;

    /* renamed from: e */
    public final C3585f0 f6494e;

    /* renamed from: f */
    public final C3585f0 f6495f;

    /* renamed from: g */
    public final /* synthetic */ int f6496g = 0;

    public C3524n1(C3585f0<C3544t> f0Var, C3585f0<C3525n2> f0Var2, C3585f0<C3551v0> f0Var3, C3585f0<Executor> f0Var4, C3585f0<C3511k0> f0Var5, C3585f0<C3567c> f0Var6) {
        this.f6490a = f0Var;
        this.f6491b = f0Var2;
        this.f6492c = f0Var3;
        this.f6493d = f0Var4;
        this.f6494e = f0Var5;
        this.f6495f = f0Var6;
    }

    public C3524n1(C3585f0<String> f0Var, C3585f0<C3534q> f0Var2, C3585f0<C3511k0> f0Var3, C3585f0<Context> f0Var4, C3585f0<C3528o1> f0Var5, C3585f0<Executor> f0Var6, byte[] bArr) {
        this.f6495f = f0Var;
        this.f6491b = f0Var2;
        this.f6494e = f0Var3;
        this.f6493d = f0Var4;
        this.f6492c = f0Var5;
        this.f6490a = f0Var6;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14735a() {
        if (this.f6496g != 0) {
            String str = (String) this.f6495f.mo14735a();
            Object a = this.f6491b.mo14735a();
            Object a2 = this.f6494e.mo14735a();
            Context b = ((C3509j2) this.f6493d).mo14735a();
            Object a3 = this.f6492c.mo14735a();
            return new C3480c1(str != null ? new File(b.getExternalFilesDir((String) null), str) : b.getExternalFilesDir((String) null), (C3534q) a, (C3511k0) a2, b, (C3528o1) a3, C3583e0.m6802b(this.f6490a));
        }
        Object a4 = this.f6490a.mo14735a();
        return new C3520m1((C3544t) a4, C3583e0.m6802b(this.f6491b), (C3551v0) this.f6492c.mo14735a(), C3583e0.m6802b(this.f6493d), (C3511k0) this.f6494e.mo14735a(), (C3567c) this.f6495f.mo14735a());
    }
}
