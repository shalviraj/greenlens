package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: b.l.a.c.e.e.r2 */
public final class C2441r2 implements C2513u2 {

    /* renamed from: a */
    public final /* synthetic */ C2099d2 f4251a;

    public C2441r2(C2099d2 d2Var) {
        this.f4251a = d2Var;
    }

    /* renamed from: b */
    public final C2608y1<?> mo12962b() {
        C2099d2 d2Var = this.f4251a;
        return new C2632z1(d2Var, d2Var.f3706c);
    }

    /* renamed from: c */
    public final Class<?> mo12963c() {
        return this.f4251a.getClass();
    }

    /* renamed from: d */
    public final Set<Class<?>> mo12964d() {
        return this.f4251a.mo12512f();
    }

    /* renamed from: e */
    public final Class<?> mo12965e() {
        return null;
    }

    /* renamed from: f */
    public final <Q> C2608y1<Q> mo12966f(Class<Q> cls) {
        try {
            return new C2632z1(this.f4251a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }
}
