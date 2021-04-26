package p005b.p096l.p097a.p113c.p131e.p140i;

import java.util.Map;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.i.g7 */
public final class C2797g7 implements Map.Entry, Comparable<C2797g7> {

    /* renamed from: g */
    public final Comparable f4751g;

    /* renamed from: h */
    public Object f4752h;

    /* renamed from: i */
    public final /* synthetic */ C2836j7 f4753i;

    public C2797g7(C2836j7 j7Var, Comparable comparable, Object obj) {
        this.f4753i = j7Var;
        this.f4751g = comparable;
        this.f4752h = obj;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f4751g.compareTo(((C2797g7) obj).f4751g);
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
        Comparable comparable = this.f4751g;
        Object key = entry.getKey();
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f4752h;
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
        return this.f4751g;
    }

    public final Object getValue() {
        return this.f4752h;
    }

    public final int hashCode() {
        Comparable comparable = this.f4751g;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f4752h;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        C2836j7 j7Var = this.f4753i;
        int i = C2836j7.f4854m;
        j7Var.mo13430h();
        Object obj2 = this.f4752h;
        this.f4752h = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4751g);
        String valueOf2 = String.valueOf(this.f4752h);
        return C0843a.m456q(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }
}
