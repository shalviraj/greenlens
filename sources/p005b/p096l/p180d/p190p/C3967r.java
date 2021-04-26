package p005b.p096l.p180d.p190p;

import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.d.p.r */
public final class C3967r {

    /* renamed from: a */
    public final Class<?> f7268a;

    /* renamed from: b */
    public final int f7269b;

    /* renamed from: c */
    public final int f7270c;

    public C3967r(Class<?> cls, int i, int i2) {
        Objects.requireNonNull(cls, "Null dependency anInterface.");
        this.f7268a = cls;
        this.f7269b = i;
        this.f7270c = i2;
    }

    /* renamed from: a */
    public boolean mo15477a() {
        return this.f7269b == 2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3967r)) {
            return false;
        }
        C3967r rVar = (C3967r) obj;
        return this.f7268a == rVar.f7268a && this.f7269b == rVar.f7269b && this.f7270c == rVar.f7270c;
    }

    public int hashCode() {
        return ((((this.f7268a.hashCode() ^ 1000003) * 1000003) ^ this.f7269b) * 1000003) ^ this.f7270c;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f7268a);
        sb.append(", type=");
        int i = this.f7269b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.f7270c;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else if (i2 == 2) {
            str = "deferred";
        } else {
            throw new AssertionError(C0843a.m444e("Unsupported injection: ", i2));
        }
        return C0843a.m455p(sb, str, "}");
    }
}
