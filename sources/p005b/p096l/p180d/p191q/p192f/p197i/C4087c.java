package p005b.p096l.p180d.p191q.p192f.p197i;

import androidx.annotation.NonNull;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.p192f.p197i.C4129v;

/* renamed from: b.l.d.q.f.i.c */
public final class C4087c extends C4129v.C4131b {

    /* renamed from: a */
    public final String f7598a;

    /* renamed from: b */
    public final String f7599b;

    public C4087c(String str, String str2, C4088a aVar) {
        this.f7598a = str;
        this.f7599b = str2;
    }

    @NonNull
    /* renamed from: a */
    public String mo15595a() {
        return this.f7598a;
    }

    @NonNull
    /* renamed from: b */
    public String mo15596b() {
        return this.f7599b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4129v.C4131b)) {
            return false;
        }
        C4129v.C4131b bVar = (C4129v.C4131b) obj;
        return this.f7598a.equals(bVar.mo15595a()) && this.f7599b.equals(bVar.mo15596b());
    }

    public int hashCode() {
        return ((this.f7598a.hashCode() ^ 1000003) * 1000003) ^ this.f7599b.hashCode();
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("CustomAttribute{key=");
        u.append(this.f7598a);
        u.append(", value=");
        return C0843a.m455p(u, this.f7599b, "}");
    }
}
