package p005b.p006a.p007a.p017h;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.h.u */
public final class C0731u {

    /* renamed from: a */
    public final String f437a;

    /* renamed from: b */
    public final Float f438b;

    /* renamed from: c */
    public final Float f439c;

    /* renamed from: d */
    public final Float f440d;

    public C0731u(String str, Float f, Float f2, Float f3) {
        this.f437a = str;
        this.f438b = f;
        this.f439c = f2;
        this.f440d = f3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0731u)) {
            return false;
        }
        C0731u uVar = (C0731u) obj;
        return C6888i.m12434a(this.f437a, uVar.f437a) && C6888i.m12434a(this.f438b, uVar.f438b) && C6888i.m12434a(this.f439c, uVar.f439c) && C6888i.m12434a(this.f440d, uVar.f440d);
    }

    public int hashCode() {
        String str = this.f437a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Float f = this.f438b;
        int hashCode2 = (hashCode + (f != null ? f.hashCode() : 0)) * 31;
        Float f2 = this.f439c;
        int hashCode3 = (hashCode2 + (f2 != null ? f2.hashCode() : 0)) * 31;
        Float f3 = this.f440d;
        if (f3 != null) {
            i = f3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("MapsEvent(place=");
        u.append(this.f437a);
        u.append(", latitude=");
        u.append(this.f438b);
        u.append(", longitude=");
        u.append(this.f439c);
        u.append(", zoom=");
        u.append(this.f440d);
        u.append(")");
        return u.toString();
    }
}
