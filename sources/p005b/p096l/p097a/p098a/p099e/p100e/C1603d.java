package p005b.p096l.p097a.p098a.p099e.p100e;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.a.a.e.e.d */
public final class C1603d extends C1614j {

    /* renamed from: a */
    public final List<C1619m> f2763a;

    public C1603d(List<C1619m> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.f2763a = list;
    }

    @NonNull
    /* renamed from: a */
    public List<C1619m> mo11755a() {
        return this.f2763a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1614j) {
            return this.f2763a.equals(((C1614j) obj).mo11755a());
        }
        return false;
    }

    public int hashCode() {
        return this.f2763a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("BatchedLogRequest{logRequests=");
        u.append(this.f2763a);
        u.append("}");
        return u.toString();
    }
}
