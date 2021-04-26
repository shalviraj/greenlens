package p005b.p096l.p224e;

import java.util.Map;
import java.util.Set;
import p005b.p096l.p224e.p226e0.C4372s;

/* renamed from: b.l.e.t */
public final class C4475t extends C4472q {

    /* renamed from: a */
    public final C4372s<String, C4472q> f8319a = new C4372s<>();

    public Set<Map.Entry<String, C4472q>> entrySet() {
        return this.f8319a.entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C4475t) && ((C4475t) obj).f8319a.equals(this.f8319a));
    }

    public int hashCode() {
        return this.f8319a.hashCode();
    }

    /* renamed from: r */
    public C4472q mo16144r(String str) {
        C4372s.C4379e<String, C4472q> c = this.f8319a.mo16002c(str);
        return (C4472q) (c != null ? c.f8108m : null);
    }

    /* renamed from: u */
    public boolean mo16145u(String str) {
        return this.f8319a.mo16002c(str) != null;
    }
}
