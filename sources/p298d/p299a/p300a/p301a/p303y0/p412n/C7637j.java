package p298d.p299a.p300a.p301a.p303y0.p412n;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.n.j */
public final class C7637j {

    /* renamed from: a */
    public final String f15130a;

    /* renamed from: b */
    public final int f15131b;

    public C7637j(String str, int i) {
        C6888i.m12438e(str, "number");
        this.f15130a = str;
        this.f15131b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7637j)) {
            return false;
        }
        C7637j jVar = (C7637j) obj;
        return C6888i.m12434a(this.f15130a, jVar.f15130a) && this.f15131b == jVar.f15131b;
    }

    public int hashCode() {
        return (this.f15130a.hashCode() * 31) + this.f15131b;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("NumberWithRadix(number=");
        u.append(this.f15130a);
        u.append(", radix=");
        u.append(this.f15131b);
        u.append(')');
        return u.toString();
    }
}
