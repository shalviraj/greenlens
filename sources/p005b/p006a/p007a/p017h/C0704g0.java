package p005b.p006a.p007a.p017h;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.h.g0 */
public final class C0704g0 {

    /* renamed from: a */
    public final String f410a;

    public C0704g0(String str) {
        this.f410a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C0704g0) && C6888i.m12434a(this.f410a, ((C0704g0) obj).f410a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f410a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return C0843a.m455p(C0843a.m460u("PreviewAppEvent(appId="), this.f410a, ")");
    }
}
