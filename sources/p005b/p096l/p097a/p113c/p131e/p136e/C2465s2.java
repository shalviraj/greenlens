package p005b.p096l.p097a.p113c.p131e.p136e;

import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: b.l.a.c.e.e.s2 */
public final class C2465s2 implements C2513u2 {

    /* renamed from: a */
    public final /* synthetic */ C2417q2 f4275a;

    /* renamed from: b */
    public final /* synthetic */ C2099d2 f4276b;

    public C2465s2(C2417q2 q2Var, C2099d2 d2Var) {
        this.f4275a = q2Var;
        this.f4276b = d2Var;
    }

    /* renamed from: b */
    public final C2608y1<?> mo12962b() {
        C2417q2 q2Var = this.f4275a;
        return new C2393p2(q2Var, this.f4276b, q2Var.f3706c);
    }

    /* renamed from: c */
    public final Class<?> mo12963c() {
        return this.f4275a.getClass();
    }

    /* renamed from: d */
    public final Set<Class<?>> mo12964d() {
        return this.f4275a.mo12512f();
    }

    /* renamed from: e */
    public final Class<?> mo12965e() {
        return this.f4276b.getClass();
    }

    /* renamed from: f */
    public final <Q> C2608y1<Q> mo12966f(Class<Q> cls) {
        try {
            return new C2393p2(this.f4275a, this.f4276b, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }
}
