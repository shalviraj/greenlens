package p005b.p006a.p007a.p017h;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.h.g */
public final class C0703g {

    /* renamed from: a */
    public final String f409a;

    public C0703g(String str) {
        C6888i.m12438e(str, "url");
        this.f409a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C0703g) && C6888i.m12434a(this.f409a, ((C0703g) obj).f409a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f409a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return C0843a.m455p(C0843a.m460u("DownloadEvent(url="), this.f409a, ")");
    }
}
