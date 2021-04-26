package p005b.p096l.p232f.p250w.p253f;

import p005b.p096l.p232f.p258y.C4657a;
import p005b.p096l.p232f.p258y.C4658b;
import p005b.p096l.p232f.p258y.p260l.C4668a;
import p005b.p096l.p232f.p258y.p260l.C4671d;

/* renamed from: b.l.f.w.f.b */
public final class C4637b {

    /* renamed from: a */
    public static final int[] f8737a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* renamed from: a */
    public static void m8548a(C4658b bVar, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 > i6) {
                    break;
                }
                bVar.mo16339g(i5, i4);
                bVar.mo16339g(i5, i6);
                bVar.mo16339g(i4, i5);
                bVar.mo16339g(i6, i5);
                i5++;
            }
        }
        int i7 = i - i2;
        bVar.mo16339g(i7, i7);
        int i8 = i7 + 1;
        bVar.mo16339g(i8, i7);
        bVar.mo16339g(i7, i8);
        int i9 = i + i2;
        bVar.mo16339g(i9, i7);
        bVar.mo16339g(i9, i8);
        bVar.mo16339g(i9, i9 - 1);
    }

    /* renamed from: b */
    public static C4657a m8549b(C4657a aVar, int i, int i2) {
        C4668a aVar2;
        int i3 = aVar.f8786h / i2;
        if (i2 == 4) {
            aVar2 = C4668a.f8862k;
        } else if (i2 == 6) {
            aVar2 = C4668a.f8861j;
        } else if (i2 == 8) {
            aVar2 = C4668a.f8865n;
        } else if (i2 == 10) {
            aVar2 = C4668a.f8860i;
        } else if (i2 == 12) {
            aVar2 = C4668a.f8859h;
        } else {
            throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i2)));
        }
        C4671d dVar = new C4671d(aVar2);
        int i4 = i / i2;
        int[] iArr = new int[i4];
        int i5 = aVar.f8786h / i2;
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                i7 |= aVar.mo16323f((i6 * i2) + i8) ? 1 << ((i2 - i8) - 1) : 0;
            }
            iArr[i6] = i7;
        }
        dVar.mo16364a(iArr, i4 - i3);
        C4657a aVar3 = new C4657a();
        aVar3.mo16319c(0, i % i2);
        for (int i9 = 0; i9 < i4; i9++) {
            aVar3.mo16319c(iArr[i9], i2);
        }
        return aVar3;
    }

    /* renamed from: c */
    public static C4657a m8550c(C4657a aVar, int i) {
        C4657a aVar2 = new C4657a();
        int i2 = aVar.f8786h;
        int i3 = (1 << i) - 2;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = i4 + i6;
                if (i7 >= i2 || aVar.mo16323f(i7)) {
                    i5 |= 1 << ((i - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 != i3) {
                if (i8 == 0) {
                    i8 = i5 | 1;
                } else {
                    aVar2.mo16319c(i5, i);
                    i4 += i;
                }
            }
            aVar2.mo16319c(i8, i);
            i4--;
            i4 += i;
        }
        return aVar2;
    }
}
