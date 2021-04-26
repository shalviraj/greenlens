package p376j.p378b.p383c;

import p005b.p035e.p036a.p037a.C0843a;
import p376j.p378b.p383c.C7034m;

/* renamed from: j.b.c.d */
public final class C7022d extends C7034m {

    /* renamed from: a */
    public final C7034m.C7036b f14078a;

    /* renamed from: b */
    public final long f14079b;

    /* renamed from: c */
    public final long f14080c;

    /* renamed from: d */
    public final long f14081d;

    /* renamed from: j.b.c.d$b */
    public static final class C7024b extends C7034m.C7035a {

        /* renamed from: a */
        public C7034m.C7036b f14082a;

        /* renamed from: b */
        public Long f14083b;

        /* renamed from: c */
        public Long f14084c;

        /* renamed from: d */
        public Long f14085d;

        /* renamed from: a */
        public C7034m mo24416a() {
            String str = this.f14082a == null ? " type" : "";
            if (this.f14083b == null) {
                str = C0843a.m451l(str, " messageId");
            }
            if (this.f14084c == null) {
                str = C0843a.m451l(str, " uncompressedMessageSize");
            }
            if (this.f14085d == null) {
                str = C0843a.m451l(str, " compressedMessageSize");
            }
            if (str.isEmpty()) {
                return new C7022d(this.f14082a, this.f14083b.longValue(), this.f14084c.longValue(), this.f14085d.longValue(), (C7023a) null);
            }
            throw new IllegalStateException(C0843a.m451l("Missing required properties:", str));
        }

        /* renamed from: b */
        public C7034m.C7035a mo24417b(long j) {
            this.f14084c = Long.valueOf(j);
            return this;
        }
    }

    public C7022d(C7034m.C7036b bVar, long j, long j2, long j3, C7023a aVar) {
        this.f14078a = bVar;
        this.f14079b = j;
        this.f14080c = j2;
        this.f14081d = j3;
    }

    /* renamed from: b */
    public long mo24409b() {
        return this.f14081d;
    }

    /* renamed from: c */
    public long mo24410c() {
        return this.f14079b;
    }

    /* renamed from: d */
    public C7034m.C7036b mo24411d() {
        return this.f14078a;
    }

    /* renamed from: e */
    public long mo24412e() {
        return this.f14080c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7034m)) {
            return false;
        }
        C7034m mVar = (C7034m) obj;
        return this.f14078a.equals(mVar.mo24411d()) && this.f14079b == mVar.mo24410c() && this.f14080c == mVar.mo24412e() && this.f14081d == mVar.mo24409b();
    }

    public int hashCode() {
        long j = this.f14079b;
        long j2 = this.f14080c;
        long j3 = this.f14081d;
        return (int) (((long) (((int) (((long) (((int) (((long) ((this.f14078a.hashCode() ^ 1000003) * 1000003)) ^ (j ^ (j >>> 32)))) * 1000003)) ^ (j2 ^ (j2 >>> 32)))) * 1000003)) ^ (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("MessageEvent{type=");
        u.append(this.f14078a);
        u.append(", messageId=");
        u.append(this.f14079b);
        u.append(", uncompressedMessageSize=");
        u.append(this.f14080c);
        u.append(", compressedMessageSize=");
        u.append(this.f14081d);
        u.append("}");
        return u.toString();
    }
}
