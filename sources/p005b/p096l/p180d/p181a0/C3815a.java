package p005b.p096l.p180d.p181a0;

import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: b.l.d.a0.a */
public final class C3815a extends C3819e {

    /* renamed from: a */
    public final String f7028a;

    /* renamed from: b */
    public final String f7029b;

    public C3815a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f7028a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f7029b = str2;
    }

    /* renamed from: a */
    public String mo15335a() {
        return this.f7028a;
    }

    /* renamed from: b */
    public String mo15336b() {
        return this.f7029b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3819e)) {
            return false;
        }
        C3819e eVar = (C3819e) obj;
        return this.f7028a.equals(eVar.mo15335a()) && this.f7029b.equals(eVar.mo15336b());
    }

    public int hashCode() {
        return ((this.f7028a.hashCode() ^ 1000003) * 1000003) ^ this.f7029b.hashCode();
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("LibraryVersion{libraryName=");
        u.append(this.f7028a);
        u.append(", version=");
        return C0843a.m455p(u, this.f7029b, "}");
    }
}
