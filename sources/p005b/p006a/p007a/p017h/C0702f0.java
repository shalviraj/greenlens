package p005b.p006a.p007a.p017h;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.h.f0 */
public final class C0702f0 {

    /* renamed from: a */
    public final String f406a;

    /* renamed from: b */
    public final String f407b;

    /* renamed from: c */
    public final boolean f408c;

    public C0702f0(String str, String str2, boolean z) {
        this.f406a = str;
        this.f407b = str2;
        this.f408c = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0702f0)) {
            return false;
        }
        C0702f0 f0Var = (C0702f0) obj;
        return C6888i.m12434a(this.f406a, f0Var.f406a) && C6888i.m12434a(this.f407b, f0Var.f407b) && this.f408c == f0Var.f408c;
    }

    public int hashCode() {
        String str = this.f406a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f407b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f408c;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("PlayEvent(containerId=");
        u.append(this.f406a);
        u.append(", url=");
        u.append(this.f407b);
        u.append(", runInBackground=");
        u.append(this.f408c);
        u.append(")");
        return u.toString();
    }
}
