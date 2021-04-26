package p005b.p096l.p180d.p191q.p192f.p197i;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.p192f.p197i.C4129v;

/* renamed from: b.l.d.q.f.i.d */
public final class C4089d extends C4129v.C4132c {

    /* renamed from: a */
    public final C4155w<C4129v.C4132c.C4133a> f7600a;

    /* renamed from: b */
    public final String f7601b;

    public C4089d(C4155w wVar, String str, C4090a aVar) {
        this.f7600a = wVar;
        this.f7601b = str;
    }

    @NonNull
    /* renamed from: a */
    public C4155w<C4129v.C4132c.C4133a> mo15600a() {
        return this.f7600a;
    }

    @Nullable
    /* renamed from: b */
    public String mo15601b() {
        return this.f7601b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4129v.C4132c)) {
            return false;
        }
        C4129v.C4132c cVar = (C4129v.C4132c) obj;
        if (this.f7600a.equals(cVar.mo15600a())) {
            String str = this.f7601b;
            String b = cVar.mo15601b();
            if (str == null) {
                if (b == null) {
                    return true;
                }
            } else if (str.equals(b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f7600a.hashCode() ^ 1000003) * 1000003;
        String str = this.f7601b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("FilesPayload{files=");
        u.append(this.f7600a);
        u.append(", orgId=");
        return C0843a.m455p(u, this.f7601b, "}");
    }
}
