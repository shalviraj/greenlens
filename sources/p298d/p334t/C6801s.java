package p298d.p334t;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.t.s */
public final class C6801s<T> {

    /* renamed from: a */
    public final int f13716a;

    /* renamed from: b */
    public final T f13717b;

    public C6801s(int i, T t) {
        this.f13716a = i;
        this.f13717b = t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6801s)) {
            return false;
        }
        C6801s sVar = (C6801s) obj;
        return this.f13716a == sVar.f13716a && C6888i.m12434a(this.f13717b, sVar.f13717b);
    }

    public int hashCode() {
        int i = this.f13716a * 31;
        T t = this.f13717b;
        return i + (t != null ? t.hashCode() : 0);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("IndexedValue(index=");
        u.append(this.f13716a);
        u.append(", value=");
        u.append(this.f13717b);
        u.append(")");
        return u.toString();
    }
}
