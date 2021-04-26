package p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0;

import java.util.Objects;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.d.a.k0.i */
public final class C6452i {

    /* renamed from: a */
    public final C6451h f12664a;

    /* renamed from: b */
    public final boolean f12665b;

    public C6452i(C6451h hVar, boolean z) {
        C6888i.m12438e(hVar, "qualifier");
        this.f12664a = hVar;
        this.f12665b = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6452i(C6451h hVar, boolean z, int i) {
        this(hVar, (i & 2) != 0 ? false : z);
    }

    /* renamed from: a */
    public static C6452i m11509a(C6452i iVar, C6451h hVar, boolean z, int i) {
        C6451h hVar2 = (i & 1) != 0 ? iVar.f12664a : null;
        if ((i & 2) != 0) {
            z = iVar.f12665b;
        }
        Objects.requireNonNull(iVar);
        C6888i.m12438e(hVar2, "qualifier");
        return new C6452i(hVar2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6452i)) {
            return false;
        }
        C6452i iVar = (C6452i) obj;
        return this.f12664a == iVar.f12664a && this.f12665b == iVar.f12665b;
    }

    public int hashCode() {
        int hashCode = this.f12664a.hashCode() * 31;
        boolean z = this.f12665b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("NullabilityQualifierWithMigrationStatus(qualifier=");
        u.append(this.f12664a);
        u.append(", isForWarningOnly=");
        u.append(this.f12665b);
        u.append(')');
        return u.toString();
    }
}
