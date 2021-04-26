package p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p323k0;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.C6514t;
import p298d.p299a.p300a.p301a.p303y0.p405l.C7452c0;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.d.a.k0.s */
public final class C6497s {

    /* renamed from: a */
    public final C7452c0 f12735a;

    /* renamed from: b */
    public final C6514t f12736b;

    /* renamed from: c */
    public final C6248w0 f12737c;

    /* renamed from: d */
    public final boolean f12738d;

    public C6497s(C7452c0 c0Var, C6514t tVar, C6248w0 w0Var, boolean z) {
        C6888i.m12438e(c0Var, "type");
        this.f12735a = c0Var;
        this.f12736b = tVar;
        this.f12737c = w0Var;
        this.f12738d = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6497s)) {
            return false;
        }
        C6497s sVar = (C6497s) obj;
        return C6888i.m12434a(this.f12735a, sVar.f12735a) && C6888i.m12434a(this.f12736b, sVar.f12736b) && C6888i.m12434a(this.f12737c, sVar.f12737c) && this.f12738d == sVar.f12738d;
    }

    public int hashCode() {
        int hashCode = this.f12735a.hashCode() * 31;
        C6514t tVar = this.f12736b;
        int i = 0;
        int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        C6248w0 w0Var = this.f12737c;
        if (w0Var != null) {
            i = w0Var.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.f12738d;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("TypeAndDefaultQualifiers(type=");
        u.append(this.f12735a);
        u.append(", defaultQualifiers=");
        u.append(this.f12736b);
        u.append(", typeParameterForArgument=");
        u.append(this.f12737c);
        u.append(", isFromStarProjection=");
        u.append(this.f12738d);
        u.append(')');
        return u.toString();
    }
}
