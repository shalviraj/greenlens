package p376j.p378b.p383c;

import p005b.p035e.p036a.p037a.C0843a;

/* renamed from: j.b.c.c */
public final class C7020c extends C7033l {

    /* renamed from: b */
    public final boolean f14076b;

    /* renamed from: c */
    public final C7043r f14077c;

    public C7020c(boolean z, C7043r rVar, C7021a aVar) {
        this.f14076b = z;
        this.f14077c = rVar;
    }

    /* renamed from: a */
    public boolean mo24404a() {
        return this.f14076b;
    }

    /* renamed from: b */
    public C7043r mo24405b() {
        return this.f14077c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7033l)) {
            return false;
        }
        C7033l lVar = (C7033l) obj;
        if (this.f14076b == lVar.mo24404a()) {
            C7043r rVar = this.f14077c;
            C7043r b = lVar.mo24405b();
            if (rVar == null) {
                if (b == null) {
                    return true;
                }
            } else if (rVar.equals(b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = ((this.f14076b ? 1231 : 1237) ^ 1000003) * 1000003;
        C7043r rVar = this.f14077c;
        return i ^ (rVar == null ? 0 : rVar.hashCode());
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("EndSpanOptions{sampleToLocalSpanStore=");
        u.append(this.f14076b);
        u.append(", status=");
        u.append(this.f14077c);
        u.append("}");
        return u.toString();
    }
}
