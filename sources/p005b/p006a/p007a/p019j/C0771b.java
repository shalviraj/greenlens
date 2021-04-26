package p005b.p006a.p007a.p019j;

import com.appfoundry.previewer.model.Dimensions;
import p005b.p035e.p036a.p037a.C0843a;
import p298d.p344x.p346c.C6888i;

/* renamed from: b.a.a.j.b */
public final class C0771b {

    /* renamed from: a */
    public final int f514a;

    /* renamed from: b */
    public final int f515b;

    /* renamed from: c */
    public final Dimensions f516c;

    /* renamed from: d */
    public final Float f517d;

    public C0771b(int i, int i2, Dimensions dimensions, Float f) {
        C6888i.m12438e(dimensions, "margins");
        this.f514a = i;
        this.f515b = i2;
        this.f516c = dimensions;
        this.f517d = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0771b)) {
            return false;
        }
        C0771b bVar = (C0771b) obj;
        return this.f514a == bVar.f514a && this.f515b == bVar.f515b && C6888i.m12434a(this.f516c, bVar.f516c) && C6888i.m12434a(this.f517d, bVar.f517d);
    }

    public int hashCode() {
        int hashCode = (Integer.hashCode(this.f515b) + (Integer.hashCode(this.f514a) * 31)) * 31;
        Dimensions dimensions = this.f516c;
        int i = 0;
        int hashCode2 = (hashCode + (dimensions != null ? dimensions.hashCode() : 0)) * 31;
        Float f = this.f517d;
        if (f != null) {
            i = f.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder u = C0843a.m460u("CalculatedDimensions(width=");
        u.append(this.f514a);
        u.append(", height=");
        u.append(this.f515b);
        u.append(", margins=");
        u.append(this.f516c);
        u.append(", flexoMargins=");
        u.append(this.f517d);
        u.append(")");
        return u.toString();
    }
}
