package p005b.p096l.p180d.p191q.p192f.p195g;

import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p005b.p096l.p180d.p191q.p192f.p197i.C4129v;

/* renamed from: b.l.d.q.f.g.b */
public final class C3997b extends C3996a0 {

    /* renamed from: a */
    public final C4129v f7303a;

    /* renamed from: b */
    public final String f7304b;

    public C3997b(C4129v vVar, String str) {
        Objects.requireNonNull(vVar, "Null report");
        this.f7303a = vVar;
        Objects.requireNonNull(str, "Null sessionId");
        this.f7304b = str;
    }

    /* renamed from: a */
    public C4129v mo15505a() {
        return this.f7303a;
    }

    /* renamed from: b */
    public String mo15506b() {
        return this.f7304b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3996a0)) {
            return false;
        }
        C3996a0 a0Var = (C3996a0) obj;
        return this.f7303a.equals(a0Var.mo15505a()) && this.f7304b.equals(a0Var.mo15506b());
    }

    public int hashCode() {
        return ((this.f7303a.hashCode() ^ 1000003) * 1000003) ^ this.f7304b.hashCode();
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("CrashlyticsReportWithSessionId{report=");
        u.append(this.f7303a);
        u.append(", sessionId=");
        return C0843a.m455p(u, this.f7304b, "}");
    }
}
