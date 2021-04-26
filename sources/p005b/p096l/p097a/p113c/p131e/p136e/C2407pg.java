package p005b.p096l.p097a.p113c.p131e.p136e;

import androidx.annotation.GuardedBy;
import java.util.concurrent.Future;
import p005b.p096l.p097a.p113c.p119b.p120l.C1770a;
import p005b.p096l.p097a.p113c.p131e.p136e.C2335mg;
import p005b.p096l.p097a.p113c.p150j.C3428h;

/* renamed from: b.l.a.c.e.e.pg */
public abstract class C2407pg<T extends C2335mg> {
    @GuardedBy("this")

    /* renamed from: a */
    public C2287kg<T> f4203a;

    /* renamed from: a */
    public abstract Future<C2287kg<T>> mo12919a();

    /* renamed from: b */
    public final <ResultT, A extends C1770a.C1772b> C3428h<ResultT> mo12920b(C2383og<A, ResultT> ogVar) {
        return mo12921c().f4018a.mo12036e(1, ogVar.mo12392b());
    }

    /* renamed from: c */
    public final C2287kg<T> mo12921c() {
        C2287kg<T> kgVar;
        synchronized (this) {
            if (this.f4203a == null) {
                try {
                    this.f4203a = (C2287kg) mo12919a().get();
                } catch (Exception e) {
                    String valueOf = String.valueOf(e.getMessage());
                    throw new RuntimeException(valueOf.length() != 0 ? "There was an error while initializing the connection to the GoogleApi: ".concat(valueOf) : new String("There was an error while initializing the connection to the GoogleApi: "));
                }
            }
            kgVar = this.f4203a;
        }
        return kgVar;
    }
}
