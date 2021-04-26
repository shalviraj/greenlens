package p005b.p006a.p007a.p019j;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.j.d */
public final class C0773d {

    /* renamed from: a */
    public final String f525a;

    /* renamed from: b */
    public final String f526b;

    public C0773d(String str, String str2) {
        C6888i.m12438e(str, "appName");
        C6888i.m12438e(str2, "appUrl");
        this.f525a = str;
        this.f526b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0773d)) {
            return false;
        }
        C0773d dVar = (C0773d) obj;
        return C6888i.m12434a(this.f525a, dVar.f525a) && C6888i.m12434a(this.f526b, dVar.f526b);
    }

    public int hashCode() {
        String str = this.f525a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f526b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("DebugApp(appName=");
        u.append(this.f525a);
        u.append(", appUrl=");
        return C0843a.m455p(u, this.f526b, ")");
    }
}
