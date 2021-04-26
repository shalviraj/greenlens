package p005b.p006a.p007a.p017h;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.h.n0 */
public final class C0718n0 {

    /* renamed from: a */
    public final String f421a;

    /* renamed from: b */
    public final String f422b;

    public C0718n0(String str, String str2) {
        this.f421a = str;
        this.f422b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0718n0)) {
            return false;
        }
        C0718n0 n0Var = (C0718n0) obj;
        return C6888i.m12434a(this.f421a, n0Var.f421a) && C6888i.m12434a(this.f422b, n0Var.f422b);
    }

    public int hashCode() {
        String str = this.f421a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f422b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("ShowQrEvent(appUrl=");
        u.append(this.f421a);
        u.append(", appName=");
        return C0843a.m455p(u, this.f422b, ")");
    }
}
