package p005b.p096l.p097a.p151d.p152a.p154b;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p005b.p096l.p097a.p151d.p152a.p156c.C3567c;
import p005b.p096l.p097a.p151d.p152a.p159e.C3579c0;
import p005b.p096l.p097a.p151d.p152a.p159e.C3584f;
import p005b.p096l.p097a.p151d.p152a.p162h.C3633a;

/* renamed from: b.l.a.d.a.b.b2 */
public final class C3477b2 {

    /* renamed from: e */
    public static final C3584f f6305e = new C3584f("AssetPackManager");

    /* renamed from: a */
    public final C3544t f6306a;

    /* renamed from: b */
    public final C3579c0<C3525n2> f6307b;

    /* renamed from: c */
    public final C3534q f6308c;

    /* renamed from: d */
    public final C3579c0<Executor> f6309d;

    public C3477b2(C3544t tVar, C3579c0<C3525n2> c0Var, C3534q qVar, C3633a aVar, C3551v0 v0Var, C3511k0 k0Var, C3475b0 b0Var, C3579c0<Executor> c0Var2, C3567c cVar) {
        new Handler(Looper.getMainLooper());
        this.f6306a = tVar;
        this.f6307b = c0Var;
        this.f6308c = qVar;
        this.f6309d = c0Var2;
    }

    /* renamed from: a */
    public final void mo14757a(boolean z) {
        boolean z2;
        C3534q qVar = this.f6308c;
        synchronized (qVar) {
            z2 = qVar.f6687e != null;
        }
        C3534q qVar2 = this.f6308c;
        synchronized (qVar2) {
            qVar2.f6688f = z;
            qVar2.mo14915b();
        }
        if (z && !z2) {
            this.f6309d.mo14881a().execute(new C3561y1(this));
        }
    }
}
