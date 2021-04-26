package p005b.p006a.p007a.p017h;

import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.a.a.h.u0 */
public final class C0732u0 {

    /* renamed from: a */
    public boolean f441a;

    public C0732u0() {
        this.f441a = false;
    }

    public C0732u0(boolean z) {
        this.f441a = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C0732u0) && this.f441a == ((C0732u0) obj).f441a;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.f441a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("UpdateEvent(fromPush=");
        u.append(this.f441a);
        u.append(")");
        return u.toString();
    }

    public C0732u0(boolean z, int i) {
        this.f441a = (i & 1) != 0 ? false : z;
    }
}
