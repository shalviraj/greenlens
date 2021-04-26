package p005b.p096l.p180d.p191q.p192f.p197i;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.p192f.p197i.C4129v;

/* renamed from: b.l.d.q.f.i.m */
public final class C4109m extends C4129v.C4134d.C4140d.C4141a.C4143b.C4144a {

    /* renamed from: a */
    public final long f7668a;

    /* renamed from: b */
    public final long f7669b;

    /* renamed from: c */
    public final String f7670c;

    /* renamed from: d */
    public final String f7671d;

    public C4109m(long j, long j2, String str, String str2, C4110a aVar) {
        this.f7668a = j;
        this.f7669b = j2;
        this.f7670c = str;
        this.f7671d = str2;
    }

    @NonNull
    /* renamed from: a */
    public long mo15678a() {
        return this.f7668a;
    }

    @NonNull
    /* renamed from: b */
    public String mo15679b() {
        return this.f7670c;
    }

    /* renamed from: c */
    public long mo15680c() {
        return this.f7669b;
    }

    @Nullable
    /* renamed from: d */
    public String mo15681d() {
        return this.f7671d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4129v.C4134d.C4140d.C4141a.C4143b.C4144a)) {
            return false;
        }
        C4129v.C4134d.C4140d.C4141a.C4143b.C4144a aVar = (C4129v.C4134d.C4140d.C4141a.C4143b.C4144a) obj;
        if (this.f7668a == aVar.mo15678a() && this.f7669b == aVar.mo15680c() && this.f7670c.equals(aVar.mo15679b())) {
            String str = this.f7671d;
            String d = aVar.mo15681d();
            if (str == null) {
                if (d == null) {
                    return true;
                }
            } else if (str.equals(d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f7668a;
        long j2 = this.f7669b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f7670c.hashCode()) * 1000003;
        String str = this.f7671d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("BinaryImage{baseAddress=");
        u.append(this.f7668a);
        u.append(", size=");
        u.append(this.f7669b);
        u.append(", name=");
        u.append(this.f7670c);
        u.append(", uuid=");
        return C0843a.m455p(u, this.f7671d, "}");
    }
}
