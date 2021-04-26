package p298d;

import java.io.Serializable;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.j */
public final class C6768j<A, B> implements Serializable {

    /* renamed from: g */
    public final A f13681g;

    /* renamed from: h */
    public final B f13682h;

    public C6768j(A a, B b) {
        this.f13681g = a;
        this.f13682h = b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6768j)) {
            return false;
        }
        C6768j jVar = (C6768j) obj;
        return C6888i.m12434a(this.f13681g, jVar.f13681g) && C6888i.m12434a(this.f13682h, jVar.f13682h);
    }

    public int hashCode() {
        A a = this.f13681g;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f13682h;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder t = C0843a.m459t('(');
        t.append(this.f13681g);
        t.append(", ");
        t.append(this.f13682h);
        t.append(')');
        return t.toString();
    }
}
