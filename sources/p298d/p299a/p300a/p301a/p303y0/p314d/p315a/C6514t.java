package p298d.p299a.p300a.p301a.p303y0.p314d.p315a;

import java.util.Collection;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6451h;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0.C6452i;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.d.a.t */
public final class C6514t {

    /* renamed from: a */
    public final C6452i f12759a;

    /* renamed from: b */
    public final Collection<C6264a> f12760b;

    /* renamed from: c */
    public final boolean f12761c;

    public C6514t(C6452i iVar, Collection<? extends C6264a> collection, boolean z) {
        C6888i.m12438e(iVar, "nullabilityQualifier");
        C6888i.m12438e(collection, "qualifierApplicabilityTypes");
        this.f12759a = iVar;
        this.f12760b = collection;
        this.f12761c = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C6514t(C6452i iVar, Collection collection, boolean z, int i) {
        this(iVar, collection, (i & 4) != 0 ? iVar.f12664a == C6451h.NOT_NULL : z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6514t)) {
            return false;
        }
        C6514t tVar = (C6514t) obj;
        return C6888i.m12434a(this.f12759a, tVar.f12759a) && C6888i.m12434a(this.f12760b, tVar.f12760b) && this.f12761c == tVar.f12761c;
    }

    public int hashCode() {
        int hashCode = (this.f12760b.hashCode() + (this.f12759a.hashCode() * 31)) * 31;
        boolean z = this.f12761c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("JavaDefaultQualifiers(nullabilityQualifier=");
        u.append(this.f12759a);
        u.append(", qualifierApplicabilityTypes=");
        u.append(this.f12760b);
        u.append(", affectsTypeParameterBasedTypes=");
        u.append(this.f12761c);
        u.append(')');
        return u.toString();
    }
}
