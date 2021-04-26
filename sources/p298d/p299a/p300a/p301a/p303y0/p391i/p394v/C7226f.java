package p298d.p299a.p300a.p301a.p303y0.p391i.p394v;

import p298d.p299a.p300a.p301a.p303y0.p331f.C6713a;
import p298d.p344x.p346c.C6888i;

/* renamed from: d.a.a.a.y0.i.v.f */
public final class C7226f {

    /* renamed from: a */
    public final C6713a f14457a;

    /* renamed from: b */
    public final int f14458b;

    public C7226f(C6713a aVar, int i) {
        C6888i.m12438e(aVar, "classId");
        this.f14457a = aVar;
        this.f14458b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7226f)) {
            return false;
        }
        C7226f fVar = (C7226f) obj;
        return C6888i.m12434a(this.f14457a, fVar.f14457a) && this.f14458b == fVar.f14458b;
    }

    public int hashCode() {
        return (this.f14457a.hashCode() * 31) + this.f14458b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f14458b;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.f14457a);
        int i3 = this.f14458b;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(">");
        }
        String sb2 = sb.toString();
        C6888i.m12437d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
