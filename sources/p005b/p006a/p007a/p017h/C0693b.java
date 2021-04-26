package p005b.p006a.p007a.p017h;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.h.b */
public final class C0693b {

    /* renamed from: a */
    public final String f398a;

    /* renamed from: b */
    public final String f399b;

    /* renamed from: c */
    public final String f400c;

    public C0693b(String str, String str2, String str3) {
        C6888i.m12438e(str2, "startDate");
        this.f398a = str;
        this.f399b = str2;
        this.f400c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0693b)) {
            return false;
        }
        C0693b bVar = (C0693b) obj;
        return C6888i.m12434a(this.f398a, bVar.f398a) && C6888i.m12434a(this.f399b, bVar.f399b) && C6888i.m12434a(this.f400c, bVar.f400c);
    }

    public int hashCode() {
        String str = this.f398a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f399b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f400c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("AddToCalendarEvent(eventName=");
        u.append(this.f398a);
        u.append(", startDate=");
        u.append(this.f399b);
        u.append(", endDate=");
        return C0843a.m455p(u, this.f400c, ")");
    }
}
