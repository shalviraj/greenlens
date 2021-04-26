package p005b.p006a.p007a.p017h;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.h.k0 */
public final class C0712k0 {

    /* renamed from: a */
    public final String f418a;

    public C0712k0(String str) {
        this.f418a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C0712k0) && C6888i.m12434a(this.f418a, ((C0712k0) obj).f418a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f418a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return C0843a.m455p(C0843a.m460u("ScannedAppClickedEvent(appUrl="), this.f418a, ")");
    }
}
