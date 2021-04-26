package p298d.p333a0;

import p298d.p344x.p346c.C6888i;

/* renamed from: d.a0.e */
public class C6759e {
    /* renamed from: a */
    public static final int m12305a(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* renamed from: b */
    public static final C6756b m12306b(int i, int i2) {
        return new C6756b(i, i2, -1);
    }

    /* renamed from: c */
    public static final C6756b m12307c(C6756b bVar, int i) {
        C6888i.m12438e(bVar, "$this$step");
        boolean z = i > 0;
        Integer valueOf = Integer.valueOf(i);
        C6888i.m12438e(valueOf, "step");
        if (z) {
            int i2 = bVar.f13658g;
            int i3 = bVar.f13659h;
            if (bVar.f13660i <= 0) {
                i = -i;
            }
            return new C6756b(i2, i3, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    /* renamed from: d */
    public static final C6758d m12308d(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new C6758d(i, i2 - 1);
        }
        C6758d dVar = C6758d.f13666k;
        return C6758d.f13665j;
    }
}
