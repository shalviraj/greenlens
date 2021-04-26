package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.i.w3 */
public final class C3001w3<T> implements C2975u3<T> {

    /* renamed from: g */
    public volatile C2975u3<T> f5100g;

    /* renamed from: h */
    public volatile boolean f5101h;

    /* renamed from: i */
    public T f5102i;

    public C3001w3(C2975u3<T> u3Var) {
        Objects.requireNonNull(u3Var);
        this.f5100g = u3Var;
    }

    /* renamed from: a */
    public final T mo13235a() {
        if (!this.f5101h) {
            synchronized (this) {
                if (!this.f5101h) {
                    T a = this.f5100g.mo13235a();
                    this.f5102i = a;
                    this.f5101h = true;
                    this.f5100g = null;
                    return a;
                }
            }
        }
        return this.f5102i;
    }

    public final String toString() {
        Object obj = this.f5100g;
        if (obj == null) {
            String valueOf = String.valueOf(this.f5102i);
            obj = C0843a.m456q(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        }
        String valueOf2 = String.valueOf(obj);
        return C0843a.m456q(new StringBuilder(valueOf2.length() + 19), "Suppliers.memoize(", valueOf2, ")");
    }
}
