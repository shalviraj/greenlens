package p005b.p006a.p007a.p017h;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.h.d0 */
public final class C0698d0 {

    /* renamed from: a */
    public final String f404a;

    public C0698d0(String str) {
        C6888i.m12438e(str, "url");
        this.f404a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C0698d0) && C6888i.m12434a(this.f404a, ((C0698d0) obj).f404a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f404a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return C0843a.m455p(C0843a.m460u("PdfEvent(url="), this.f404a, ")");
    }
}
