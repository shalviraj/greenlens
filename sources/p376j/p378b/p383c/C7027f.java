package p376j.p378b.p383c;

import java.util.List;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: j.b.c.f */
public final class C7027f extends C7053w {

    /* renamed from: a */
    public final List<Object> f14090a;

    public C7027f(List<Object> list) {
        Objects.requireNonNull(list, "Null entries");
        this.f14090a = list;
    }

    /* renamed from: b */
    public List<Object> mo24426b() {
        return this.f14090a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7053w) {
            return this.f14090a.equals(((C7053w) obj).mo24426b());
        }
        return false;
    }

    public int hashCode() {
        return this.f14090a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("Tracestate{entries=");
        u.append(this.f14090a);
        u.append("}");
        return u.toString();
    }
}
