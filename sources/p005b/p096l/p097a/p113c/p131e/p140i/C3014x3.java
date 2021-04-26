package p005b.p096l.p097a.p113c.p131e.p140i;

import java.io.Serializable;
import java.util.Arrays;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.i.x3 */
public final class C3014x3<T> implements Serializable, C2975u3 {

    /* renamed from: g */
    public final T f5135g;

    public C3014x3(T t) {
        this.f5135g = t;
    }

    /* renamed from: a */
    public final T mo13235a() {
        return this.f5135g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3014x3)) {
            return false;
        }
        T t = this.f5135g;
        T t2 = ((C3014x3) obj).f5135g;
        return t == t2 || t.equals(t2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5135g});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5135g);
        return C0843a.m456q(new StringBuilder(valueOf.length() + 22), "Suppliers.ofInstance(", valueOf, ")");
    }
}
