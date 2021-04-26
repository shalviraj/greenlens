package p005b.p006a.p007a.p017h;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.h.l0 */
public final class C0714l0 {

    /* renamed from: a */
    public final String f419a;

    public C0714l0(String str) {
        C6888i.m12438e(str, "url");
        this.f419a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C0714l0) && C6888i.m12434a(this.f419a, ((C0714l0) obj).f419a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f419a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return C0843a.m455p(C0843a.m460u("ShareEvent(url="), this.f419a, ")");
    }
}
