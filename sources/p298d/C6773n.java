package p298d;

import java.io.Serializable;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.n */
public final class C6773n<A, B, C> implements Serializable {

    /* renamed from: g */
    public final A f13690g;

    /* renamed from: h */
    public final B f13691h;

    /* renamed from: i */
    public final C f13692i;

    public C6773n(A a, B b, C c) {
        this.f13690g = a;
        this.f13691h = b;
        this.f13692i = c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6773n)) {
            return false;
        }
        C6773n nVar = (C6773n) obj;
        return C6888i.m12434a(this.f13690g, nVar.f13690g) && C6888i.m12434a(this.f13691h, nVar.f13691h) && C6888i.m12434a(this.f13692i, nVar.f13692i);
    }

    public int hashCode() {
        A a = this.f13690g;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f13691h;
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C c = this.f13692i;
        if (c != null) {
            i = c.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder t = C0843a.m459t('(');
        t.append(this.f13690g);
        t.append(", ");
        t.append(this.f13691h);
        t.append(", ");
        t.append(this.f13692i);
        t.append(')');
        return t.toString();
    }
}
