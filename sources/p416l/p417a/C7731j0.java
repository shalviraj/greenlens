package p416l.p417a;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.C6777r;

/* renamed from: l.a.j0 */
public final class C7731j0 extends C7712d {

    /* renamed from: g */
    public final C7728i0 f15277g;

    public C7731j0(C7728i0 i0Var) {
        this.f15277g = i0Var;
    }

    /* renamed from: a */
    public void mo25366a(Throwable th) {
        this.f15277g.dispose();
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        this.f15277g.dispose();
        return C6777r.f13694a;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("DisposeOnCancel[");
        u.append(this.f15277g);
        u.append(']');
        return u.toString();
    }
}
