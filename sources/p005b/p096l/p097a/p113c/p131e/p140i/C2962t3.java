package p005b.p096l.p097a.p113c.p131e.p140i;

import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.c.e.i.t3 */
public final class C2962t3<T> extends C2949s3<T> {

    /* renamed from: g */
    public final T f5008g;

    public C2962t3(T t) {
        this.f5008g = t;
    }

    /* renamed from: a */
    public final boolean mo13607a() {
        return true;
    }

    /* renamed from: b */
    public final T mo13608b() {
        return this.f5008g;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2962t3) {
            return this.f5008g.equals(((C2962t3) obj).f5008g);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5008g.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5008g);
        return C0843a.m456q(new StringBuilder(valueOf.length() + 13), "Optional.of(", valueOf, ")");
    }
}
