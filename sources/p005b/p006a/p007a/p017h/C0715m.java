package p005b.p006a.p007a.p017h;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.h.m */
public final class C0715m {

    /* renamed from: a */
    public final String f420a;

    public C0715m(String str) {
        this.f420a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C0715m) && C6888i.m12434a(this.f420a, ((C0715m) obj).f420a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f420a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return C0843a.m455p(C0843a.m460u("FirebaseRegisterEvent(pageId="), this.f420a, ")");
    }
}
