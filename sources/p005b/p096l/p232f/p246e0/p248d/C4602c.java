package p005b.p096l.p232f.p246e0.p248d;

import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p232f.C4619m;
import p005b.p096l.p232f.C4625s;
import p005b.p096l.p232f.C4626t;
import p005b.p096l.p232f.p258y.C4658b;

/* renamed from: b.l.f.e0.d.c */
public class C4602c {

    /* renamed from: a */
    public final C4658b f8642a;

    /* renamed from: b */
    public C4626t f8643b;

    public C4602c(C4658b bVar) {
        this.f8642a = bVar;
    }

    /* renamed from: a */
    public final float mo16256a(C4625s sVar, C4625s sVar2) {
        float d = mo16259d((int) sVar.f8708a, (int) sVar.f8709b, (int) sVar2.f8708a, (int) sVar2.f8709b);
        float d2 = mo16259d((int) sVar2.f8708a, (int) sVar2.f8709b, (int) sVar.f8708a, (int) sVar.f8709b);
        if (Float.isNaN(d)) {
            return d2 / 7.0f;
        }
        return Float.isNaN(d2) ? d / 7.0f : (d + d2) / 14.0f;
    }

    /* renamed from: b */
    public final C4600a mo16257b(float f, int i, int i2, float f2) {
        C4600a c;
        C4600a c2;
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        int min = Math.min(this.f8642a.f8787g - 1, i + i3) - max;
        float f3 = 3.0f * f;
        if (((float) min) >= f3) {
            int max2 = Math.max(0, i2 - i3);
            int min2 = Math.min(this.f8642a.f8788h - 1, i2 + i3) - max2;
            if (((float) min2) >= f3) {
                C4601b bVar = new C4601b(this.f8642a, max, max2, min, min2, f, this.f8643b);
                int i4 = bVar.f8635c;
                int i5 = bVar.f8638f;
                int i6 = bVar.f8637e + i4;
                int i7 = (i5 / 2) + bVar.f8636d;
                int[] iArr = new int[3];
                for (int i8 = 0; i8 < i5; i8++) {
                    int i9 = ((i8 & 1) == 0 ? (i8 + 1) / 2 : -((i8 + 1) / 2)) + i7;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    iArr[2] = 0;
                    int i10 = i4;
                    while (i10 < i6 && !bVar.f8633a.mo16333b(i10, i9)) {
                        i10++;
                    }
                    int i11 = 0;
                    while (i10 < i6) {
                        if (!bVar.f8633a.mo16333b(i10, i9)) {
                            if (i11 == 1) {
                                i11++;
                            }
                            iArr[i11] = iArr[i11] + 1;
                        } else if (i11 == 1) {
                            iArr[1] = iArr[1] + 1;
                        } else if (i11 != 2) {
                            i11++;
                            iArr[i11] = iArr[i11] + 1;
                        } else if (bVar.mo16254b(iArr) && (c2 = bVar.mo16255c(iArr, i9, i10)) != null) {
                            return c2;
                        } else {
                            iArr[0] = iArr[2];
                            iArr[1] = 1;
                            iArr[2] = 0;
                            i11 = 1;
                        }
                        i10++;
                    }
                    if (bVar.mo16254b(iArr) && (c = bVar.mo16255c(iArr, i9, i6)) != null) {
                        return c;
                    }
                }
                if (!bVar.f8634b.isEmpty()) {
                    return bVar.f8634b.get(0);
                }
                throw C4619m.f8685i;
            }
            throw C4619m.f8685i;
        }
        throw C4619m.f8685i;
    }

    /* renamed from: c */
    public final float mo16258c(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        C4602c cVar;
        boolean z2;
        boolean z3 = true;
        boolean z4 = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z4) {
            i7 = i;
            i8 = i2;
            i5 = i3;
            i6 = i4;
        } else {
            i8 = i;
            i7 = i2;
            i6 = i3;
            i5 = i4;
        }
        int abs = Math.abs(i6 - i8);
        int abs2 = Math.abs(i5 - i7);
        int i11 = 2;
        int i12 = (-abs) / 2;
        int i13 = -1;
        int i14 = i8 < i6 ? 1 : -1;
        if (i7 < i5) {
            i13 = 1;
        }
        int i15 = i6 + i14;
        int i16 = i8;
        int i17 = i7;
        int i18 = 0;
        while (true) {
            if (i16 == i15) {
                i9 = i15;
                i10 = i11;
                break;
            }
            int i19 = z4 ? i17 : i16;
            int i20 = z4 ? i16 : i17;
            if (i18 == z3) {
                z = z4;
                z2 = z3;
                i9 = i15;
                cVar = this;
            } else {
                cVar = this;
                z = z4;
                i9 = i15;
                z2 = false;
            }
            if (z2 == cVar.f8642a.mo16333b(i19, i20)) {
                if (i18 == 2) {
                    return C1960d.m2719I(i16, i17, i8, i7);
                }
                i18++;
            }
            i12 += abs2;
            if (i12 > 0) {
                if (i17 == i5) {
                    i10 = 2;
                    break;
                }
                i17 += i13;
                i12 -= abs;
            }
            i16 += i14;
            i15 = i9;
            z4 = z;
            z3 = true;
            i11 = 2;
        }
        if (i18 == i10) {
            return C1960d.m2719I(i9, i5, i8, i7);
        }
        return Float.NaN;
    }

    /* renamed from: d */
    public final float mo16259d(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float c = mo16258c(i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = ((float) i) / ((float) (i - i5));
            i5 = 0;
        } else {
            int i7 = this.f8642a.f8787g;
            if (i5 >= i7) {
                int i8 = i7 - 1;
                f = ((float) ((i7 - 1) - i)) / ((float) (i5 - i));
                i5 = i8;
            } else {
                f = 1.0f;
            }
        }
        float f3 = (float) i2;
        int i9 = (int) (f3 - (((float) (i4 - i2)) * f));
        if (i9 < 0) {
            f2 = f3 / ((float) (i2 - i9));
        } else {
            int i10 = this.f8642a.f8788h;
            if (i9 >= i10) {
                f2 = ((float) ((i10 - 1) - i2)) / ((float) (i9 - i2));
                i6 = i10 - 1;
            } else {
                i6 = i9;
                f2 = 1.0f;
            }
        }
        return (mo16258c(i, i2, (int) ((((float) (i5 - i)) * f2) + ((float) i)), i6) + c) - 1.0f;
    }
}
