package p005b.p096l.p232f.p261z.p262c;

import p005b.p096l.p232f.C4614h;
import p005b.p096l.p232f.p258y.C4658b;

/* renamed from: b.l.f.z.c.a */
public final class C4675a {

    /* renamed from: a */
    public final C4658b f8881a;

    /* renamed from: b */
    public final C4658b f8882b;

    /* renamed from: c */
    public final C4680e f8883c;

    public C4675a(C4658b bVar) {
        int i;
        C4658b bVar2 = bVar;
        int i2 = bVar2.f8788h;
        if (i2 < 8 || i2 > 144 || (i2 & 1) != 0) {
            throw C4614h.m8506a();
        }
        int i3 = bVar2.f8787g;
        C4680e[] eVarArr = C4680e.f8900h;
        if ((i2 & 1) == 0 && (i3 & 1) == 0) {
            for (C4680e eVar : C4680e.f8900h) {
                int i4 = eVar.f8902b;
                if (i4 == i2 && (i = eVar.f8903c) == i3) {
                    this.f8883c = eVar;
                    if (bVar2.f8788h == i4) {
                        int i5 = eVar.f8904d;
                        int i6 = eVar.f8905e;
                        int i7 = i4 / i5;
                        int i8 = i / i6;
                        C4658b bVar3 = new C4658b(i8 * i6, i7 * i5);
                        for (int i9 = 0; i9 < i7; i9++) {
                            int i10 = i9 * i5;
                            for (int i11 = 0; i11 < i8; i11++) {
                                int i12 = i11 * i6;
                                for (int i13 = 0; i13 < i5; i13++) {
                                    int i14 = ((i5 + 2) * i9) + 1 + i13;
                                    int i15 = i10 + i13;
                                    for (int i16 = 0; i16 < i6; i16++) {
                                        if (bVar2.mo16333b(((i6 + 2) * i11) + 1 + i16, i14)) {
                                            bVar3.mo16339g(i12 + i16, i15);
                                        }
                                    }
                                }
                            }
                        }
                        this.f8881a = bVar3;
                        this.f8882b = new C4658b(bVar3.f8787g, bVar3.f8788h);
                        return;
                    }
                    throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
                }
            }
            throw C4614h.m8506a();
        }
        throw C4614h.m8506a();
    }

    /* renamed from: a */
    public final boolean mo16365a(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        this.f8882b.mo16339g(i2, i);
        return this.f8881a.mo16333b(i2, i);
    }

    /* renamed from: b */
    public final int mo16366b(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (mo16365a(i5, i6, i3, i4) ? 1 : 0) << true;
        int i8 = i2 - 1;
        if (mo16365a(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (mo16365a(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (mo16365a(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (mo16365a(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (mo16365a(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (mo16365a(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        return mo16365a(i, i2, i3, i4) ? i15 | 1 : i15;
    }
}
