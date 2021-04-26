package p005b.p096l.p097a.p113c.p131e.p136e;

import java.util.Map;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.e.t0 */
public final class C2487t0 implements Map.Entry, Comparable<C2487t0> {

    /* renamed from: g */
    public final Comparable f4300g;

    /* renamed from: h */
    public Object f4301h;

    /* renamed from: i */
    public final /* synthetic */ C2559w0 f4302i;

    public C2487t0(C2559w0 w0Var, Comparable comparable, Object obj) {
        this.f4302i = w0Var;
        this.f4300g = comparable;
        this.f4301h = obj;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f4300g.compareTo(((C2487t0) obj).f4300g);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Comparable comparable = this.f4300g;
        Object key = entry.getKey();
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f4301h;
            Object value = entry.getValue();
            if (obj2 == null) {
                z = value == null;
            } else {
                z = obj2.equals(value);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.f4300g;
    }

    public final Object getValue() {
        return this.f4301h;
    }

    public final int hashCode() {
        Comparable comparable = this.f4300g;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f4301h;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        C2559w0 w0Var = this.f4302i;
        int i = C2559w0.f4385m;
        w0Var.mo13089h();
        Object obj2 = this.f4301h;
        this.f4301h = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4300g);
        String valueOf2 = String.valueOf(this.f4301h);
        return C0843a.m456q(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }
}
