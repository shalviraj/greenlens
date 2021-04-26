package p298d.p299a.p300a.p301a.p303y0.p405l.p410n1;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.l.n1.a */
public final class C7549a<T> {

    /* renamed from: a */
    public final T f14986a;

    /* renamed from: b */
    public final T f14987b;

    public C7549a(T t, T t2) {
        this.f14986a = t;
        this.f14987b = t2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7549a)) {
            return false;
        }
        C7549a aVar = (C7549a) obj;
        return C6888i.m12434a(this.f14986a, aVar.f14986a) && C6888i.m12434a(this.f14987b, aVar.f14987b);
    }

    public int hashCode() {
        T t = this.f14986a;
        int i = 0;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.f14987b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("ApproximationBounds(lower=");
        u.append(this.f14986a);
        u.append(", upper=");
        u.append(this.f14987b);
        u.append(')');
        return u.toString();
    }
}
