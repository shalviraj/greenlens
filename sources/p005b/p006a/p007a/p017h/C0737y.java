package p005b.p006a.p007a.p017h;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.h.y */
public final class C0737y {

    /* renamed from: a */
    public final String f447a;

    public C0737y(String str) {
        this.f447a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C0737y) && C6888i.m12434a(this.f447a, ((C0737y) obj).f447a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f447a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return C0843a.m455p(C0843a.m460u("OpenAudioEvent(url="), this.f447a, ")");
    }
}
