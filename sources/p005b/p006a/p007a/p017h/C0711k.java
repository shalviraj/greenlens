package p005b.p006a.p007a.p017h;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.h.k */
public final class C0711k {

    /* renamed from: a */
    public final String f416a;

    /* renamed from: b */
    public final String f417b;

    public C0711k(String str, String str2) {
        C6888i.m12438e(str, "query");
        C6888i.m12438e(str2, "pageId");
        this.f416a = str;
        this.f417b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0711k)) {
            return false;
        }
        C0711k kVar = (C0711k) obj;
        return C6888i.m12434a(this.f416a, kVar.f416a) && C6888i.m12434a(this.f417b, kVar.f417b);
    }

    public int hashCode() {
        String str = this.f416a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f417b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("FilterEvent(query=");
        u.append(this.f416a);
        u.append(", pageId=");
        return C0843a.m455p(u, this.f417b, ")");
    }
}
