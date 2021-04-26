package p005b.p006a.p007a.p017h;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.h.v */
public final class C0733v {

    /* renamed from: a */
    public final String f442a;

    /* renamed from: b */
    public final String f443b;

    /* renamed from: c */
    public final Boolean f444c;

    /* renamed from: d */
    public final String f445d;

    public C0733v(String str, String str2, Boolean bool, String str3, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        bool = (i & 4) != 0 ? Boolean.FALSE : bool;
        str3 = (i & 8) != 0 ? null : str3;
        C6888i.m12438e(str, "pageId");
        this.f442a = str;
        this.f443b = str2;
        this.f444c = bool;
        this.f445d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0733v)) {
            return false;
        }
        C0733v vVar = (C0733v) obj;
        return C6888i.m12434a(this.f442a, vVar.f442a) && C6888i.m12434a(this.f443b, vVar.f443b) && C6888i.m12434a(this.f444c, vVar.f444c) && C6888i.m12434a(this.f445d, vVar.f445d);
    }

    public int hashCode() {
        String str = this.f442a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f443b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.f444c;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str3 = this.f445d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("NavigationEvent(pageId=");
        u.append(this.f442a);
        u.append(", hrefRemote=");
        u.append(this.f443b);
        u.append(", fromBackendResponseGoToAction=");
        u.append(this.f444c);
        u.append(", originPageId=");
        return C0843a.m455p(u, this.f445d, ")");
    }
}
