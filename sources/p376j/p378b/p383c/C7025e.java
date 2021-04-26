package p376j.p378b.p383c;

import p376j.p378b.p379a.C7014a;
import p376j.p378b.p383c.C7037n;

@Deprecated
/* renamed from: j.b.c.e */
public final class C7025e extends C7037n {

    /* renamed from: a */
    public final C7037n.C7038a f14086a;

    /* renamed from: b */
    public final long f14087b;

    /* renamed from: c */
    public final long f14088c;

    /* renamed from: d */
    public final long f14089d;

    public C7025e(C7014a aVar, C7037n.C7038a aVar2, long j, long j2, long j3, C7026a aVar3) {
        this.f14086a = aVar2;
        this.f14087b = j;
        this.f14088c = j2;
        this.f14089d = j3;
    }

    /* renamed from: a */
    public long mo24418a() {
        return this.f14089d;
    }

    /* renamed from: b */
    public void mo24419b() {
    }

    /* renamed from: c */
    public long mo24420c() {
        return this.f14087b;
    }

    /* renamed from: d */
    public C7037n.C7038a mo24421d() {
        return this.f14086a;
    }

    /* renamed from: e */
    public long mo24422e() {
        return this.f14088c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7037n)) {
            return false;
        }
        C7037n nVar = (C7037n) obj;
        nVar.mo24419b();
        return this.f14086a.equals(nVar.mo24421d()) && this.f14087b == nVar.mo24420c() && this.f14088c == nVar.mo24422e() && this.f14089d == nVar.mo24418a();
    }

    public int hashCode() {
        long j = this.f14087b;
        long j2 = this.f14088c;
        long j3 = this.f14089d;
        return (int) (((long) (((int) (((long) (((int) (((long) ((-721379959 ^ this.f14086a.hashCode()) * 1000003)) ^ (j ^ (j >>> 32)))) * 1000003)) ^ (j2 ^ (j2 >>> 32)))) * 1000003)) ^ (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        return "NetworkEvent{kernelTimestamp=" + null + ", type=" + this.f14086a + ", messageId=" + this.f14087b + ", uncompressedMessageSize=" + this.f14088c + ", compressedMessageSize=" + this.f14089d + "}";
    }
}
