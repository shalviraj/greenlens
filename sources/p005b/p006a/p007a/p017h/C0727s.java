package p005b.p006a.p007a.p017h;

import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.a.a.h.s */
public final class C0727s {

    /* renamed from: a */
    public final boolean f436a;

    public C0727s() {
        this(false, 1);
    }

    public C0727s(boolean z) {
        this.f436a = z;
    }

    public C0727s(boolean z, int i) {
        this.f436a = (i & 1) != 0 ? false : z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C0727s) && this.f436a == ((C0727s) obj).f436a;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.f436a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("LogoutEvent(hard=");
        u.append(this.f436a);
        u.append(")");
        return u.toString();
    }
}
