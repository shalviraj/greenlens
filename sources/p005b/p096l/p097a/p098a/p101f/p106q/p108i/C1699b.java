package p005b.p096l.p097a.p098a.p101f.p106q.p108i;

import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p098a.p101f.C1634e;
import p005b.p096l.p097a.p098a.p101f.C1640h;

/* renamed from: b.l.a.a.f.q.i.b */
public final class C1699b extends C1708h {

    /* renamed from: a */
    public final long f3014a;

    /* renamed from: b */
    public final C1640h f3015b;

    /* renamed from: c */
    public final C1634e f3016c;

    public C1699b(long j, C1640h hVar, C1634e eVar) {
        this.f3014a = j;
        Objects.requireNonNull(hVar, "Null transportContext");
        this.f3015b = hVar;
        Objects.requireNonNull(eVar, "Null event");
        this.f3016c = eVar;
    }

    /* renamed from: a */
    public C1634e mo11892a() {
        return this.f3016c;
    }

    /* renamed from: b */
    public long mo11893b() {
        return this.f3014a;
    }

    /* renamed from: c */
    public C1640h mo11894c() {
        return this.f3015b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1708h)) {
            return false;
        }
        C1708h hVar = (C1708h) obj;
        return this.f3014a == hVar.mo11893b() && this.f3015b.equals(hVar.mo11894c()) && this.f3016c.equals(hVar.mo11892a());
    }

    public int hashCode() {
        long j = this.f3014a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f3015b.hashCode()) * 1000003) ^ this.f3016c.hashCode();
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("PersistedEvent{id=");
        u.append(this.f3014a);
        u.append(", transportContext=");
        u.append(this.f3015b);
        u.append(", event=");
        u.append(this.f3016c);
        u.append("}");
        return u.toString();
    }
}
