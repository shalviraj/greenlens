package p005b.p096l.p232f;

import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;

/* renamed from: b.l.f.s */
public class C4625s {

    /* renamed from: a */
    public final float f8708a;

    /* renamed from: b */
    public final float f8709b;

    public C4625s(float f, float f2) {
        this.f8708a = f;
        this.f8709b = f2;
    }

    /* renamed from: a */
    public static float m8530a(C4625s sVar, C4625s sVar2) {
        return C1960d.m2716H(sVar.f8708a, sVar.f8709b, sVar2.f8708a, sVar2.f8709b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4625s) {
            C4625s sVar = (C4625s) obj;
            return this.f8708a == sVar.f8708a && this.f8709b == sVar.f8709b;
        }
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f8709b) + (Float.floatToIntBits(this.f8708a) * 31);
    }

    public final String toString() {
        return "(" + this.f8708a + ',' + this.f8709b + ')';
    }
}
