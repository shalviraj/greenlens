package p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p318h0.p320m;

import p005b.p035e.p036a.p037a.C0843a;
import p298d.p299a.p300a.p301a.p303y0.p304b.C6248w0;
import p298d.p299a.p300a.p301a.p303y0.p314d.p315a.p316f0.C6302k;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.d.a.h0.m.a */
public final class C6397a {

    /* renamed from: a */
    public final C6302k f12607a;

    /* renamed from: b */
    public final C6398b f12608b;

    /* renamed from: c */
    public final boolean f12609c;

    /* renamed from: d */
    public final C6248w0 f12610d;

    public C6397a(C6302k kVar, C6398b bVar, boolean z, C6248w0 w0Var) {
        C6888i.m12438e(kVar, "howThisTypeIsUsed");
        C6888i.m12438e(bVar, "flexibility");
        this.f12607a = kVar;
        this.f12608b = bVar;
        this.f12609c = z;
        this.f12610d = w0Var;
    }

    public C6397a(C6302k kVar, C6398b bVar, boolean z, C6248w0 w0Var, int i) {
        C6398b bVar2 = (i & 2) != 0 ? C6398b.INFLEXIBLE : null;
        z = (i & 4) != 0 ? false : z;
        w0Var = (i & 8) != 0 ? null : w0Var;
        C6888i.m12438e(kVar, "howThisTypeIsUsed");
        C6888i.m12438e(bVar2, "flexibility");
        this.f12607a = kVar;
        this.f12608b = bVar2;
        this.f12609c = z;
        this.f12610d = w0Var;
    }

    /* renamed from: a */
    public final C6397a mo23531a(C6398b bVar) {
        C6888i.m12438e(bVar, "flexibility");
        C6302k kVar = this.f12607a;
        boolean z = this.f12609c;
        C6248w0 w0Var = this.f12610d;
        C6888i.m12438e(kVar, "howThisTypeIsUsed");
        C6888i.m12438e(bVar, "flexibility");
        return new C6397a(kVar, bVar, z, w0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6397a)) {
            return false;
        }
        C6397a aVar = (C6397a) obj;
        return this.f12607a == aVar.f12607a && this.f12608b == aVar.f12608b && this.f12609c == aVar.f12609c && C6888i.m12434a(this.f12610d, aVar.f12610d);
    }

    public int hashCode() {
        int hashCode = (this.f12608b.hashCode() + (this.f12607a.hashCode() * 31)) * 31;
        boolean z = this.f12609c;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        C6248w0 w0Var = this.f12610d;
        return i + (w0Var == null ? 0 : w0Var.hashCode());
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("JavaTypeAttributes(howThisTypeIsUsed=");
        u.append(this.f12607a);
        u.append(", flexibility=");
        u.append(this.f12608b);
        u.append(", isForAnnotationParameter=");
        u.append(this.f12609c);
        u.append(", upperBoundOfTypeParameter=");
        u.append(this.f12610d);
        u.append(')');
        return u.toString();
    }
}
