package p005b.p006a.p007a.p019j;

import com.appfoundry.previewer.model.Page;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.j.j */
public final class C0779j {

    /* renamed from: a */
    public final Page f549a;

    /* renamed from: b */
    public final boolean f550b;

    public C0779j(Page page, boolean z, int i) {
        z = (i & 2) != 0 ? false : z;
        this.f549a = page;
        this.f550b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0779j)) {
            return false;
        }
        C0779j jVar = (C0779j) obj;
        return C6888i.m12434a(this.f549a, jVar.f549a) && this.f550b == jVar.f550b;
    }

    public int hashCode() {
        Page page = this.f549a;
        int hashCode = (page != null ? page.hashCode() : 0) * 31;
        boolean z = this.f550b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("RemoteResponse(page=");
        u.append(this.f549a);
        u.append(", tokenExpired=");
        u.append(this.f550b);
        u.append(")");
        return u.toString();
    }
}
