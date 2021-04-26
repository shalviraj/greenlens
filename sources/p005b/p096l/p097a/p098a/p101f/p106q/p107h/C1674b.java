package p005b.p096l.p097a.p098a.p101f.p106q.p107h;

import java.util.Map;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p097a.p098a.C1584b;
import p005b.p096l.p097a.p098a.p101f.p106q.p107h.C1680f;
import p005b.p096l.p097a.p098a.p101f.p110s.C1735a;

/* renamed from: b.l.a.a.f.q.h.b */
public final class C1674b extends C1680f {

    /* renamed from: a */
    public final C1735a f2950a;

    /* renamed from: b */
    public final Map<C1584b, C1680f.C1681a> f2951b;

    public C1674b(C1735a aVar, Map<C1584b, C1680f.C1681a> map) {
        Objects.requireNonNull(aVar, "Null clock");
        this.f2950a = aVar;
        Objects.requireNonNull(map, "Null values");
        this.f2951b = map;
    }

    /* renamed from: a */
    public C1735a mo11860a() {
        return this.f2950a;
    }

    /* renamed from: c */
    public Map<C1584b, C1680f.C1681a> mo11861c() {
        return this.f2951b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1680f)) {
            return false;
        }
        C1680f fVar = (C1680f) obj;
        return this.f2950a.equals(fVar.mo11860a()) && this.f2951b.equals(fVar.mo11861c());
    }

    public int hashCode() {
        return ((this.f2950a.hashCode() ^ 1000003) * 1000003) ^ this.f2951b.hashCode();
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("SchedulerConfig{clock=");
        u.append(this.f2950a);
        u.append(", values=");
        u.append(this.f2951b);
        u.append("}");
        return u.toString();
    }
}
