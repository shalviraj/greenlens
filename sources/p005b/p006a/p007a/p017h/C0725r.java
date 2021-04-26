package p005b.p006a.p007a.p017h;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.h.r */
public final class C0725r {

    /* renamed from: a */
    public final String f434a;

    /* renamed from: b */
    public final String f435b;

    public C0725r(String str, String str2) {
        C6888i.m12438e(str2, "provider");
        this.f434a = str;
        this.f435b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0725r)) {
            return false;
        }
        C0725r rVar = (C0725r) obj;
        return C6888i.m12434a(this.f434a, rVar.f434a) && C6888i.m12434a(this.f435b, rVar.f435b);
    }

    public int hashCode() {
        String str = this.f434a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f435b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("LoginWithProviderEvent(pageId=");
        u.append(this.f434a);
        u.append(", provider=");
        return C0843a.m455p(u, this.f435b, ")");
    }
}
