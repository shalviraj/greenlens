package p005b.p006a.p007a.p017h;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.h.b0 */
public final class C0694b0 {

    /* renamed from: a */
    public final String f401a;

    /* renamed from: b */
    public final String f402b;

    public C0694b0(String str, String str2) {
        C6888i.m12438e(str, "url");
        this.f401a = str;
        this.f402b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0694b0)) {
            return false;
        }
        C0694b0 b0Var = (C0694b0) obj;
        return C6888i.m12434a(this.f401a, b0Var.f401a) && C6888i.m12434a(this.f402b, b0Var.f402b);
    }

    public int hashCode() {
        String str = this.f401a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f402b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("OpenUrlEvent(url=");
        u.append(this.f401a);
        u.append(", href=");
        return C0843a.m455p(u, this.f402b, ")");
    }
}
