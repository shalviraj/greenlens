package p005b.p096l.p097a.p098a.p101f.p106q.p107h;

import java.util.Set;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p098a.p101f.p106q.p107h.C1680f;

/* renamed from: b.l.a.a.f.q.h.c */
public final class C1675c extends C1680f.C1681a {

    /* renamed from: a */
    public final long f2952a;

    /* renamed from: b */
    public final long f2953b;

    /* renamed from: c */
    public final Set<C1680f.C1683b> f2954c;

    /* renamed from: b.l.a.a.f.q.h.c$b */
    public static final class C1677b extends C1680f.C1681a.C1682a {

        /* renamed from: a */
        public Long f2955a;

        /* renamed from: b */
        public Long f2956b;

        /* renamed from: c */
        public Set<C1680f.C1683b> f2957c;

        /* renamed from: a */
        public C1680f.C1681a mo11871a() {
            String str = this.f2955a == null ? " delta" : "";
            if (this.f2956b == null) {
                str = C0843a.m451l(str, " maxAllowedDelay");
            }
            if (this.f2957c == null) {
                str = C0843a.m451l(str, " flags");
            }
            if (str.isEmpty()) {
                return new C1675c(this.f2955a.longValue(), this.f2956b.longValue(), this.f2957c, (C1676a) null);
            }
            throw new IllegalStateException(C0843a.m451l("Missing required properties:", str));
        }

        /* renamed from: b */
        public C1680f.C1681a.C1682a mo11872b(long j) {
            this.f2955a = Long.valueOf(j);
            return this;
        }

        /* renamed from: c */
        public C1680f.C1681a.C1682a mo11873c(long j) {
            this.f2956b = Long.valueOf(j);
            return this;
        }
    }

    public C1675c(long j, long j2, Set set, C1676a aVar) {
        this.f2952a = j;
        this.f2953b = j2;
        this.f2954c = set;
    }

    /* renamed from: b */
    public long mo11865b() {
        return this.f2952a;
    }

    /* renamed from: c */
    public Set<C1680f.C1683b> mo11866c() {
        return this.f2954c;
    }

    /* renamed from: d */
    public long mo11867d() {
        return this.f2953b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1680f.C1681a)) {
            return false;
        }
        C1680f.C1681a aVar = (C1680f.C1681a) obj;
        return this.f2952a == aVar.mo11865b() && this.f2953b == aVar.mo11867d() && this.f2954c.equals(aVar.mo11866c());
    }

    public int hashCode() {
        long j = this.f2952a;
        long j2 = this.f2953b;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f2954c.hashCode();
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("ConfigValue{delta=");
        u.append(this.f2952a);
        u.append(", maxAllowedDelay=");
        u.append(this.f2953b);
        u.append(", flags=");
        u.append(this.f2954c);
        u.append("}");
        return u.toString();
    }
}
