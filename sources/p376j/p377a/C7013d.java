package p376j.p377a;

import java.util.logging.Level;
import java.util.logging.Logger;
import p376j.p377a.C7001b;

/* renamed from: j.a.d */
public final class C7013d extends C7001b.C7007f {

    /* renamed from: a */
    public static final Logger f14071a = Logger.getLogger(C7013d.class.getName());

    /* renamed from: b */
    public static final ThreadLocal<C7001b> f14072b = new ThreadLocal<>();

    /* renamed from: a */
    public C7001b mo24390a() {
        C7001b bVar = f14072b.get();
        return bVar == null ? C7001b.f14053m : bVar;
    }

    /* renamed from: b */
    public void mo24391b(C7001b bVar, C7001b bVar2) {
        ThreadLocal<C7001b> threadLocal;
        if (mo24390a() != bVar) {
            f14071a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (bVar2 != C7001b.f14053m) {
            threadLocal = f14072b;
        } else {
            threadLocal = f14072b;
            bVar2 = null;
        }
        threadLocal.set(bVar2);
    }

    /* renamed from: c */
    public C7001b mo24392c(C7001b bVar) {
        C7001b a = mo24390a();
        f14072b.set(bVar);
        return a;
    }
}
