package p005b.p006a.p007a.p017h;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.h.e0 */
public final class C0700e0 {

    /* renamed from: a */
    public final String f405a;

    public C0700e0(String str) {
        C6888i.m12438e(str, "phoneNumber");
        this.f405a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C0700e0) && C6888i.m12434a(this.f405a, ((C0700e0) obj).f405a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f405a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return C0843a.m455p(C0843a.m460u("PhoneEvent(phoneNumber="), this.f405a, ")");
    }
}
