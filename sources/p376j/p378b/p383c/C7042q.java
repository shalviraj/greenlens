package p376j.p378b.p383c;

import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: j.b.c.q */
public final class C7042q implements Comparable<C7042q> {

    /* renamed from: h */
    public static final C7042q f14114h = new C7042q(0);

    /* renamed from: g */
    public final long f14115g;

    public C7042q(long j) {
        this.f14115g = j;
    }

    public int compareTo(Object obj) {
        int i = (this.f14115g > ((C7042q) obj).f14115g ? 1 : (this.f14115g == ((C7042q) obj).f14115g ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7042q)) {
            return false;
        }
        return this.f14115g == ((C7042q) obj).f14115g;
    }

    public int hashCode() {
        long j = this.f14115g;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("SpanId{spanId=");
        char[] cArr = new char[16];
        C7029h.m12634b(this.f14115g, cArr, 0);
        u.append(new String(cArr));
        u.append("}");
        return u.toString();
    }
}
