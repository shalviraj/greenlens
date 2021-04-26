package p005b.p096l.p097a.p098a.p101f.p106q.p108i;

import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.a.f.q.i.a */
public final class C1696a extends C1701d {

    /* renamed from: b */
    public final long f3006b;

    /* renamed from: c */
    public final int f3007c;

    /* renamed from: d */
    public final int f3008d;

    /* renamed from: e */
    public final long f3009e;

    /* renamed from: f */
    public final int f3010f;

    public C1696a(long j, int i, int i2, long j2, int i3, C1697a aVar) {
        this.f3006b = j;
        this.f3007c = i;
        this.f3008d = i2;
        this.f3009e = j2;
        this.f3010f = i3;
    }

    /* renamed from: a */
    public int mo11883a() {
        return this.f3008d;
    }

    /* renamed from: b */
    public long mo11884b() {
        return this.f3009e;
    }

    /* renamed from: c */
    public int mo11885c() {
        return this.f3007c;
    }

    /* renamed from: d */
    public int mo11886d() {
        return this.f3010f;
    }

    /* renamed from: e */
    public long mo11887e() {
        return this.f3006b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1701d)) {
            return false;
        }
        C1701d dVar = (C1701d) obj;
        return this.f3006b == dVar.mo11887e() && this.f3007c == dVar.mo11885c() && this.f3008d == dVar.mo11883a() && this.f3009e == dVar.mo11884b() && this.f3010f == dVar.mo11886d();
    }

    public int hashCode() {
        long j = this.f3006b;
        long j2 = this.f3009e;
        return ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f3007c) * 1000003) ^ this.f3008d) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f3010f;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("EventStoreConfig{maxStorageSizeInBytes=");
        u.append(this.f3006b);
        u.append(", loadBatchSize=");
        u.append(this.f3007c);
        u.append(", criticalSectionEnterTimeoutMs=");
        u.append(this.f3008d);
        u.append(", eventCleanUpAge=");
        u.append(this.f3009e);
        u.append(", maxBlobByteSizePerRow=");
        return C0843a.m453n(u, this.f3010f, "}");
    }
}
