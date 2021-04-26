package p005b.p096l.p097a.p151d.p152a.p159e;

import java.io.InputStream;

/* renamed from: b.l.a.d.a.e.u */
public final class C3614u extends C3612t {

    /* renamed from: g */
    public final C3612t f6675g;

    /* renamed from: h */
    public final long f6676h;

    /* renamed from: i */
    public final long f6677i;

    public C3614u(C3612t tVar, long j, long j2) {
        this.f6675g = tVar;
        long q = mo14908q(j);
        this.f6676h = q;
        this.f6677i = mo14908q(q + j2);
    }

    public final void close() {
    }

    /* renamed from: d */
    public final long mo14839d() {
        return this.f6677i - this.f6676h;
    }

    /* renamed from: e */
    public final InputStream mo14840e(long j, long j2) {
        long q = mo14908q(this.f6676h);
        return this.f6675g.mo14840e(q, mo14908q(j2 + q) - q);
    }

    /* renamed from: q */
    public final long mo14908q(long j) {
        if (j < 0) {
            return 0;
        }
        return j > this.f6675g.mo14839d() ? this.f6675g.mo14839d() : j;
    }
}
