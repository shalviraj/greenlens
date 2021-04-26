package p005b.p006a.p007a.p017h;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.h.c0 */
public final class C0696c0 {

    /* renamed from: a */
    public final String f403a;

    public C0696c0(String str) {
        this.f403a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C0696c0) && C6888i.m12434a(this.f403a, ((C0696c0) obj).f403a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f403a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return C0843a.m455p(C0843a.m460u("PauseEvent(containerId="), this.f403a, ")");
    }
}
