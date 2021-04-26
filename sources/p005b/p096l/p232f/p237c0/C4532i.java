package p005b.p096l.p232f.p237c0;

import p005b.p096l.p232f.C4484a;
import p005b.p096l.p232f.C4619m;
import p005b.p096l.p232f.p258y.C4657a;

/* renamed from: b.l.f.c0.i */
public final class C4532i extends C4548y {

    /* renamed from: j */
    public static final int[] f8455j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: i */
    public final int[] f8456i = new int[4];

    /* renamed from: m */
    public int mo16164m(C4657a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f8456i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i = aVar.f8786h;
        int i2 = iArr[1];
        int i3 = 0;
        for (int i4 = 0; i4 < 6 && i2 < i; i4++) {
            int k = C4548y.m8373k(aVar, iArr2, i2, C4548y.f8487h);
            sb.append((char) ((k % 10) + 48));
            for (int i5 : iArr2) {
                i2 += i5;
            }
            if (k >= 10) {
                i3 |= 1 << (5 - i4);
            }
        }
        for (int i6 = 0; i6 < 10; i6++) {
            if (i3 == f8455j[i6]) {
                sb.insert(0, (char) (i6 + 48));
                int[] iArr3 = C4548y.f8484e;
                int i7 = C4548y.m8374o(aVar, i2, true, iArr3, new int[iArr3.length])[1];
                for (int i8 = 0; i8 < 6 && i7 < i; i8++) {
                    sb.append((char) (C4548y.m8373k(aVar, iArr2, i7, C4548y.f8486g) + 48));
                    for (int i9 : iArr2) {
                        i7 += i9;
                    }
                }
                return i7;
            }
        }
        throw C4619m.f8685i;
    }

    /* renamed from: q */
    public C4484a mo16165q() {
        return C4484a.EAN_13;
    }
}
