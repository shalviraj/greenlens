package p005b.p096l.p232f.p237c0;

import p005b.p096l.p232f.C4484a;
import p005b.p096l.p232f.p258y.C4657a;

/* renamed from: b.l.f.c0.k */
public final class C4534k extends C4548y {

    /* renamed from: i */
    public final int[] f8457i = new int[4];

    /* renamed from: m */
    public int mo16164m(C4657a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f8457i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i = aVar.f8786h;
        int i2 = iArr[1];
        for (int i3 = 0; i3 < 4 && i2 < i; i3++) {
            sb.append((char) (C4548y.m8373k(aVar, iArr2, i2, C4548y.f8486g) + 48));
            for (int i4 : iArr2) {
                i2 += i4;
            }
        }
        int[] iArr3 = C4548y.f8484e;
        int i5 = C4548y.m8374o(aVar, i2, true, iArr3, new int[iArr3.length])[1];
        for (int i6 = 0; i6 < 4 && i5 < i; i6++) {
            sb.append((char) (C4548y.m8373k(aVar, iArr2, i5, C4548y.f8486g) + 48));
            for (int i7 : iArr2) {
                i5 += i7;
            }
        }
        return i5;
    }

    /* renamed from: q */
    public C4484a mo16165q() {
        return C4484a.EAN_8;
    }
}
