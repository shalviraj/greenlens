package p005b.p096l.p180d.p191q.p192f.p197i;

import androidx.annotation.NonNull;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.p192f.p197i.C4129v;

/* renamed from: b.l.d.q.f.i.o */
public final class C4113o extends C4129v.C4134d.C4140d.C4141a.C4143b.C4146c {

    /* renamed from: a */
    public final String f7677a;

    /* renamed from: b */
    public final String f7678b;

    /* renamed from: c */
    public final long f7679c;

    public C4113o(String str, String str2, long j, C4114a aVar) {
        this.f7677a = str;
        this.f7678b = str2;
        this.f7679c = j;
    }

    @NonNull
    /* renamed from: a */
    public long mo15693a() {
        return this.f7679c;
    }

    @NonNull
    /* renamed from: b */
    public String mo15694b() {
        return this.f7678b;
    }

    @NonNull
    /* renamed from: c */
    public String mo15695c() {
        return this.f7677a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4129v.C4134d.C4140d.C4141a.C4143b.C4146c)) {
            return false;
        }
        C4129v.C4134d.C4140d.C4141a.C4143b.C4146c cVar = (C4129v.C4134d.C4140d.C4141a.C4143b.C4146c) obj;
        return this.f7677a.equals(cVar.mo15695c()) && this.f7678b.equals(cVar.mo15694b()) && this.f7679c == cVar.mo15693a();
    }

    public int hashCode() {
        long j = this.f7679c;
        return ((((this.f7677a.hashCode() ^ 1000003) * 1000003) ^ this.f7678b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Signal{name=");
        u.append(this.f7677a);
        u.append(", code=");
        u.append(this.f7678b);
        u.append(", address=");
        u.append(this.f7679c);
        u.append("}");
        return u.toString();
    }
}
