package p005b.p280p.p285b;

import p005b.p035e.p036a.p037a.C0843a;
import p005b.p280p.p285b.p286a0.C5134i;

/* renamed from: b.p.b.g */
public final class C5231g {

    /* renamed from: a */
    public final String f10290a;

    /* renamed from: b */
    public final String f10291b;

    public C5231g(String str, String str2) {
        this.f10290a = str;
        this.f10291b = str2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5231g) {
            C5231g gVar = (C5231g) obj;
            return C5134i.m9461f(this.f10290a, gVar.f10290a) && C5134i.m9461f(this.f10291b, gVar.f10291b);
        }
    }

    public int hashCode() {
        String str = this.f10291b;
        int i = 0;
        int hashCode = (899 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f10290a;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10290a);
        sb.append(" realm=\"");
        return C0843a.m455p(sb, this.f10291b, "\"");
    }
}
