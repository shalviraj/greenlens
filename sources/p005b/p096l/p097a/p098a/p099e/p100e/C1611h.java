package p005b.p096l.p097a.p098a.p099e.p100e;

import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.a.e.e.h */
public final class C1611h extends C1620n {

    /* renamed from: a */
    public final long f2787a;

    public C1611h(long j) {
        this.f2787a = j;
    }

    /* renamed from: b */
    public long mo11784b() {
        return this.f2787a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1620n) {
            return this.f2787a == ((C1620n) obj).mo11784b();
        }
        return false;
    }

    public int hashCode() {
        long j = this.f2787a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("LogResponse{nextRequestWaitMillis=");
        u.append(this.f2787a);
        u.append("}");
        return u.toString();
    }
}
