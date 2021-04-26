package p005b.p096l.p097a.p113c.p131e.p140i;

import java.io.Serializable;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.i.v3 */
public final class C2988v3<T> implements Serializable, C2975u3 {

    /* renamed from: g */
    public final C2975u3<T> f5085g;

    /* renamed from: h */
    public volatile transient boolean f5086h;

    /* renamed from: i */
    public transient T f5087i;

    public C2988v3(C2975u3<T> u3Var) {
        Objects.requireNonNull(u3Var);
        this.f5085g = u3Var;
    }

    /* renamed from: a */
    public final T mo13235a() {
        if (!this.f5086h) {
            synchronized (this) {
                if (!this.f5086h) {
                    T a = this.f5085g.mo13235a();
                    this.f5087i = a;
                    this.f5086h = true;
                    return a;
                }
            }
        }
        return this.f5087i;
    }

    public final String toString() {
        Object obj;
        if (this.f5086h) {
            String valueOf = String.valueOf(this.f5087i);
            obj = C0843a.m456q(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        } else {
            obj = this.f5085g;
        }
        String valueOf2 = String.valueOf(obj);
        return C0843a.m456q(new StringBuilder(valueOf2.length() + 19), "Suppliers.memoize(", valueOf2, ")");
    }
}
