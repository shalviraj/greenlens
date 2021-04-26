package p005b.p006a.p007a.p017h;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.h.v0 */
public final class C0734v0 {

    /* renamed from: a */
    public final String f446a;

    public C0734v0(String str) {
        C6888i.m12438e(str, "url");
        this.f446a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C0734v0) && C6888i.m12434a(this.f446a, ((C0734v0) obj).f446a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f446a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return C0843a.m455p(C0843a.m460u("VideoEvent(url="), this.f446a, ")");
    }
}
