package p005b.p096l.p097a.p098a.p101f.p102n;

import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p098a.p101f.p102n.C1654g;

/* renamed from: b.l.a.a.f.n.b */
public final class C1649b extends C1654g {

    /* renamed from: a */
    public final C1654g.C1655a f2899a;

    /* renamed from: b */
    public final long f2900b;

    public C1649b(C1654g.C1655a aVar, long j) {
        Objects.requireNonNull(aVar, "Null status");
        this.f2899a = aVar;
        this.f2900b = j;
    }

    /* renamed from: b */
    public long mo11834b() {
        return this.f2900b;
    }

    /* renamed from: c */
    public C1654g.C1655a mo11835c() {
        return this.f2899a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1654g)) {
            return false;
        }
        C1654g gVar = (C1654g) obj;
        return this.f2899a.equals(gVar.mo11835c()) && this.f2900b == gVar.mo11834b();
    }

    public int hashCode() {
        long j = this.f2900b;
        return ((this.f2899a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("BackendResponse{status=");
        u.append(this.f2899a);
        u.append(", nextRequestWaitMillis=");
        u.append(this.f2900b);
        u.append("}");
        return u.toString();
    }
}
