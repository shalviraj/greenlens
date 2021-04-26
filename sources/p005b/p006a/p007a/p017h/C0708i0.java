package p005b.p006a.p007a.p017h;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.h.i0 */
public final class C0708i0 {

    /* renamed from: a */
    public final String f412a;

    /* renamed from: b */
    public final String f413b;

    /* renamed from: c */
    public final String f414c;

    public C0708i0(String str, String str2, String str3) {
        this.f412a = str;
        this.f413b = str2;
        this.f414c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0708i0)) {
            return false;
        }
        C0708i0 i0Var = (C0708i0) obj;
        return C6888i.m12434a(this.f412a, i0Var.f412a) && C6888i.m12434a(this.f413b, i0Var.f413b) && C6888i.m12434a(this.f414c, i0Var.f414c);
    }

    public int hashCode() {
        String str = this.f412a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f413b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f414c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("RemoteActionEvent(pageId=");
        u.append(this.f412a);
        u.append(", triggerUrl=");
        u.append(this.f413b);
        u.append(", confirmPrompt=");
        return C0843a.m455p(u, this.f414c, ")");
    }
}
