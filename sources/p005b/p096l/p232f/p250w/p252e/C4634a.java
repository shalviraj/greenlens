package p005b.p096l.p232f.p250w.p252e;

import p005b.p096l.p097a.p113c.p119b.p126p.C1960d;
import p005b.p096l.p232f.C4619m;
import p005b.p096l.p232f.C4625s;
import p005b.p096l.p232f.p250w.C4629a;
import p005b.p096l.p232f.p258y.C4658b;
import p005b.p096l.p232f.p258y.C4662f;
import p005b.p096l.p232f.p258y.C4665i;
import p005b.p096l.p232f.p258y.p259k.C4667a;
import p005b.p096l.p232f.p258y.p260l.C4668a;
import p005b.p096l.p232f.p258y.p260l.C4670c;
import p005b.p096l.p232f.p258y.p260l.C4672e;

/* renamed from: b.l.f.w.e.a */
public final class C4634a {

    /* renamed from: g */
    public static final int[] f8726g = {3808, 476, 2107, 1799};

    /* renamed from: a */
    public final C4658b f8727a;

    /* renamed from: b */
    public boolean f8728b;

    /* renamed from: c */
    public int f8729c;

    /* renamed from: d */
    public int f8730d;

    /* renamed from: e */
    public int f8731e;

    /* renamed from: f */
    public int f8732f;

    /* renamed from: b.l.f.w.e.a$a */
    public static final class C4635a {

        /* renamed from: a */
        public final int f8733a;

        /* renamed from: b */
        public final int f8734b;

        public C4635a(int i, int i2) {
            this.f8733a = i;
            this.f8734b = i2;
        }

        public String toString() {
            return "<" + this.f8733a + ' ' + this.f8734b + '>';
        }
    }

    public C4634a(C4658b bVar) {
        this.f8727a = bVar;
    }

    /* renamed from: b */
    public static C4625s[] m8539b(C4625s[] sVarArr, int i, int i2) {
        float f = ((float) i2) / (((float) i) * 2.0f);
        float f2 = sVarArr[0].f8708a - sVarArr[2].f8708a;
        float f3 = sVarArr[0].f8709b - sVarArr[2].f8709b;
        float f4 = (sVarArr[0].f8708a + sVarArr[2].f8708a) / 2.0f;
        float f5 = (sVarArr[0].f8709b + sVarArr[2].f8709b) / 2.0f;
        float f6 = f2 * f;
        float f7 = f3 * f;
        C4625s sVar = new C4625s(f4 + f6, f5 + f7);
        C4625s sVar2 = new C4625s(f4 - f6, f5 - f7);
        float f8 = sVarArr[1].f8708a - sVarArr[3].f8708a;
        float f9 = sVarArr[1].f8709b - sVarArr[3].f8709b;
        float f10 = (sVarArr[1].f8708a + sVarArr[3].f8708a) / 2.0f;
        float f11 = (sVarArr[1].f8709b + sVarArr[3].f8709b) / 2.0f;
        float f12 = f8 * f;
        float f13 = f * f9;
        return new C4625s[]{sVar, new C4625s(f10 + f12, f11 + f13), sVar2, new C4625s(f10 - f12, f11 - f13)};
    }

    /* renamed from: a */
    public C4629a mo16290a(boolean z) {
        C4625s sVar;
        C4625s sVar2;
        C4625s sVar3;
        C4625s sVar4;
        C4625s sVar5;
        C4625s sVar6;
        C4625s sVar7;
        C4625s sVar8;
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        C4635a aVar;
        int i5 = 2;
        int i6 = -1;
        int i7 = 1;
        try {
            C4658b bVar = this.f8727a;
            C4625s[] b = new C4667a(bVar, 10, bVar.f8787g / 2, bVar.f8788h / 2).mo16348b();
            sVar3 = b[0];
            sVar2 = b[1];
            sVar = b[2];
            sVar4 = b[3];
        } catch (C4619m unused) {
            C4658b bVar2 = this.f8727a;
            int i8 = bVar2.f8787g / 2;
            int i9 = bVar2.f8788h / 2;
            int i10 = i9 - 7;
            int i11 = i8 + 7 + 1;
            int i12 = i11;
            int i13 = i10;
            while (true) {
                i13--;
                if (!mo16294f(i12, i13) || this.f8727a.mo16333b(i12, i13)) {
                    int i14 = i12 - 1;
                    int i15 = i13 + 1;
                } else {
                    i12++;
                }
            }
            int i142 = i12 - 1;
            int i152 = i13 + 1;
            while (mo16294f(i142, i152) && !this.f8727a.mo16333b(i142, i152)) {
                i142++;
            }
            int i16 = i142 - 1;
            while (mo16294f(i16, i152) && !this.f8727a.mo16333b(i16, i152)) {
                i152--;
            }
            C4625s sVar9 = new C4625s((float) i16, (float) (i152 + 1));
            int i17 = i9 + 7;
            int i18 = i17;
            while (true) {
                i18++;
                if (!mo16294f(i11, i18) || this.f8727a.mo16333b(i11, i18)) {
                    int i19 = i11 - 1;
                    int i20 = i18 - 1;
                } else {
                    i11++;
                }
            }
            int i192 = i11 - 1;
            int i202 = i18 - 1;
            while (mo16294f(i192, i202) && !this.f8727a.mo16333b(i192, i202)) {
                i192++;
            }
            int i21 = i192 - 1;
            while (mo16294f(i21, i202) && !this.f8727a.mo16333b(i21, i202)) {
                i202++;
            }
            C4625s sVar10 = new C4625s((float) i21, (float) (i202 - 1));
            int i22 = i8 - 7;
            int i23 = i22 - 1;
            while (true) {
                i17++;
                if (!mo16294f(i23, i17) || this.f8727a.mo16333b(i23, i17)) {
                    int i24 = i23 + 1;
                    int i25 = i17 - 1;
                } else {
                    i23--;
                }
            }
            int i242 = i23 + 1;
            int i252 = i17 - 1;
            while (mo16294f(i242, i252) && !this.f8727a.mo16333b(i242, i252)) {
                i242--;
            }
            int i26 = i242 + 1;
            while (mo16294f(i26, i252) && !this.f8727a.mo16333b(i26, i252)) {
                i252++;
            }
            C4625s sVar11 = new C4625s((float) i26, (float) (i252 - 1));
            do {
                i22--;
                i10--;
                if (!mo16294f(i22, i10) || this.f8727a.mo16333b(i22, i10)) {
                    int i27 = i22 + 1;
                    int i28 = i10 + 1;
                }
                i22--;
                i10--;
                break;
            } while (this.f8727a.mo16333b(i22, i10));
            int i272 = i22 + 1;
            int i282 = i10 + 1;
            while (mo16294f(i272, i282) && !this.f8727a.mo16333b(i272, i282)) {
                i272--;
            }
            int i29 = i272 + 1;
            while (mo16294f(i29, i282) && !this.f8727a.mo16333b(i29, i282)) {
                i282--;
            }
            sVar4 = new C4625s((float) i29, (float) (i282 + 1));
            sVar = sVar11;
            sVar2 = sVar10;
            sVar3 = sVar9;
        }
        int F0 = C1960d.m2711F0((((sVar3.f8708a + sVar4.f8708a) + sVar2.f8708a) + sVar.f8708a) / 4.0f);
        int F02 = C1960d.m2711F0((((sVar3.f8709b + sVar4.f8709b) + sVar2.f8709b) + sVar.f8709b) / 4.0f);
        try {
            C4625s[] b2 = new C4667a(this.f8727a, 15, F0, F02).mo16348b();
            sVar7 = b2[0];
            sVar6 = b2[1];
            sVar5 = b2[2];
            sVar8 = b2[3];
        } catch (C4619m unused2) {
            int i30 = F02 - 7;
            int i31 = F0 + 7 + 1;
            int i32 = i31;
            int i33 = i30;
            while (true) {
                i33--;
                if (!mo16294f(i32, i33) || this.f8727a.mo16333b(i32, i33)) {
                    int i34 = i32 - 1;
                    int i35 = i33 + 1;
                } else {
                    i32++;
                }
            }
            int i342 = i32 - 1;
            int i352 = i33 + 1;
            while (mo16294f(i342, i352) && !this.f8727a.mo16333b(i342, i352)) {
                i342++;
            }
            int i36 = i342 - 1;
            while (mo16294f(i36, i352) && !this.f8727a.mo16333b(i36, i352)) {
                i352--;
            }
            C4625s sVar12 = new C4625s((float) i36, (float) (i352 + 1));
            int i37 = F02 + 7;
            int i38 = i37;
            while (true) {
                i38++;
                if (!mo16294f(i31, i38) || this.f8727a.mo16333b(i31, i38)) {
                    int i39 = i31 - 1;
                    int i40 = i38 - 1;
                } else {
                    i31++;
                }
            }
            int i392 = i31 - 1;
            int i402 = i38 - 1;
            while (mo16294f(i392, i402) && !this.f8727a.mo16333b(i392, i402)) {
                i392++;
            }
            int i41 = i392 - 1;
            while (mo16294f(i41, i402) && !this.f8727a.mo16333b(i41, i402)) {
                i402++;
            }
            C4625s sVar13 = new C4625s((float) i41, (float) (i402 - 1));
            int i42 = F0 - 7;
            int i43 = i42 - 1;
            while (true) {
                i37++;
                if (!mo16294f(i43, i37) || this.f8727a.mo16333b(i43, i37)) {
                    int i44 = i43 + 1;
                    int i45 = i37 - 1;
                } else {
                    i43--;
                }
            }
            int i442 = i43 + 1;
            int i452 = i37 - 1;
            while (mo16294f(i442, i452) && !this.f8727a.mo16333b(i442, i452)) {
                i442--;
            }
            int i46 = i442 + 1;
            while (mo16294f(i46, i452) && !this.f8727a.mo16333b(i46, i452)) {
                i452++;
            }
            C4625s sVar14 = new C4625s((float) i46, (float) (i452 - 1));
            do {
                i42--;
                i30--;
                if (!mo16294f(i42, i30) || this.f8727a.mo16333b(i42, i30)) {
                    int i47 = i42 + 1;
                    int i48 = i30 + 1;
                }
                i42--;
                i30--;
                break;
            } while (this.f8727a.mo16333b(i42, i30));
            int i472 = i42 + 1;
            int i482 = i30 + 1;
            while (mo16294f(i472, i482) && !this.f8727a.mo16333b(i472, i482)) {
                i472--;
            }
            int i49 = i472 + 1;
            while (mo16294f(i49, i482) && !this.f8727a.mo16333b(i49, i482)) {
                i482--;
            }
            sVar8 = new C4625s((float) i49, (float) (i482 + 1));
            sVar7 = sVar12;
            C4625s sVar15 = sVar13;
            sVar5 = sVar14;
            sVar6 = sVar15;
        }
        C4635a aVar2 = new C4635a(C1960d.m2711F0((((sVar7.f8708a + sVar8.f8708a) + sVar6.f8708a) + sVar5.f8708a) / 4.0f), C1960d.m2711F0((((sVar7.f8709b + sVar8.f8709b) + sVar6.f8709b) + sVar5.f8709b) / 4.0f));
        this.f8731e = 1;
        boolean z2 = true;
        C4635a aVar3 = aVar2;
        C4635a aVar4 = aVar3;
        C4635a aVar5 = aVar4;
        while (this.f8731e < 9) {
            C4635a e = mo16293e(aVar2, z2, i7, i6);
            C4635a e2 = mo16293e(aVar3, z2, i7, i7);
            C4635a e3 = mo16293e(aVar4, z2, i6, i7);
            C4635a e4 = mo16293e(aVar5, z2, i6, i6);
            if (this.f8731e > i5) {
                double I = (double) ((C1960d.m2719I(e4.f8733a, e4.f8734b, e.f8733a, e.f8734b) * ((float) this.f8731e)) / (C1960d.m2719I(aVar5.f8733a, aVar5.f8734b, aVar2.f8733a, aVar2.f8734b) * ((float) (this.f8731e + i5))));
                if (I < 0.75d || I > 1.25d) {
                    break;
                }
                C4635a aVar6 = new C4635a(e.f8733a - 3, e.f8734b + 3);
                C4635a aVar7 = new C4635a(e2.f8733a - 3, e2.f8734b - 3);
                C4635a aVar8 = new C4635a(e3.f8733a + 3, e3.f8734b - 3);
                aVar = e;
                C4635a aVar9 = new C4635a(e4.f8733a + 3, e4.f8734b + 3);
                int c = mo16291c(aVar9, aVar6);
                if (!(c != 0 && mo16291c(aVar6, aVar7) == c && mo16291c(aVar7, aVar8) == c && mo16291c(aVar8, aVar9) == c)) {
                    break;
                }
            } else {
                aVar = e;
            }
            z2 = !z2;
            this.f8731e++;
            aVar5 = e4;
            aVar3 = e2;
            aVar4 = e3;
            aVar2 = aVar;
            i5 = 2;
            i6 = -1;
            i7 = 1;
        }
        int i50 = this.f8731e;
        if (i50 == 5 || i50 == 7) {
            this.f8728b = i50 == 5;
            int i51 = i50 * 2;
            C4625s[] b3 = m8539b(new C4625s[]{new C4625s(((float) aVar2.f8733a) + 0.5f, ((float) aVar2.f8734b) - 0.5f), new C4625s(((float) aVar3.f8733a) + 0.5f, ((float) aVar3.f8734b) + 0.5f), new C4625s(((float) aVar4.f8733a) - 0.5f, ((float) aVar4.f8734b) + 0.5f), new C4625s(((float) aVar5.f8733a) - 0.5f, ((float) aVar5.f8734b) - 0.5f)}, i51 - 3, i51);
            if (z) {
                C4625s sVar16 = b3[0];
                b3[0] = b3[2];
                b3[2] = sVar16;
            }
            if (!mo16295g(b3[0]) || !mo16295g(b3[1]) || !mo16295g(b3[2]) || !mo16295g(b3[3])) {
                throw C4619m.f8685i;
            }
            int i52 = this.f8731e * 2;
            int[] iArr = {mo16296h(b3[0], b3[1], i52), mo16296h(b3[1], b3[2], i52), mo16296h(b3[2], b3[3], i52), mo16296h(b3[3], b3[0], i52)};
            int i53 = 0;
            for (int i54 = 0; i54 < 4; i54++) {
                int i55 = iArr[i54];
                i53 = (i53 << 3) + ((i55 >> (i52 - 2)) << 1) + (i55 & 1);
            }
            int i56 = ((i53 & 1) << 11) + (i53 >> 1);
            for (int i57 = 0; i57 < 4; i57++) {
                if (Integer.bitCount(f8726g[i57] ^ i56) <= 2) {
                    this.f8732f = i57;
                    long j2 = 0;
                    for (int i58 = 0; i58 < 4; i58++) {
                        int i59 = iArr[(this.f8732f + i58) % 4];
                        if (this.f8728b) {
                            j = j2 << 7;
                            i4 = (i59 >> 1) & 127;
                        } else {
                            j = j2 << 10;
                            i4 = ((i59 >> 1) & 31) + ((i59 >> 2) & 992);
                        }
                        j2 = j + ((long) i4);
                    }
                    int i60 = 7;
                    if (this.f8728b) {
                        i = 2;
                    } else {
                        i = 4;
                        i60 = 10;
                    }
                    int i61 = i60 - i;
                    int[] iArr2 = new int[i60];
                    while (true) {
                        i60--;
                        if (i60 >= 0) {
                            iArr2[i60] = ((int) j2) & 15;
                            j2 >>= 4;
                        } else {
                            try {
                                break;
                            } catch (C4672e unused3) {
                                throw C4619m.f8685i;
                            }
                        }
                    }
                    new C4670c(C4668a.f8862k).mo16363a(iArr2, i61);
                    int i62 = 0;
                    for (int i63 = 0; i63 < i; i63++) {
                        i62 = (i62 << 4) + iArr2[i63];
                    }
                    if (this.f8728b) {
                        i2 = 1;
                        this.f8729c = (i62 >> 6) + 1;
                        i3 = i62 & 63;
                    } else {
                        i2 = 1;
                        this.f8729c = (i62 >> 11) + 1;
                        i3 = i62 & 2047;
                    }
                    this.f8730d = i3 + i2;
                    C4658b bVar3 = this.f8727a;
                    int i64 = this.f8732f;
                    C4625s sVar17 = b3[i64 % 4];
                    C4625s sVar18 = b3[(i64 + 1) % 4];
                    C4625s sVar19 = b3[(i64 + 2) % 4];
                    C4625s sVar20 = b3[(i64 + 3) % 4];
                    C4662f fVar = C4662f.f8834a;
                    int d = mo16292d();
                    float f = ((float) d) / 2.0f;
                    float f2 = (float) this.f8731e;
                    float f3 = f - f2;
                    float f4 = f + f2;
                    return new C4629a(fVar.mo16345a(bVar3, d, d, C4665i.m8589a(f3, f3, f4, f3, f4, f4, f3, f4, sVar17.f8708a, sVar17.f8709b, sVar18.f8708a, sVar18.f8709b, sVar19.f8708a, sVar19.f8709b, sVar20.f8708a, sVar20.f8709b)), m8539b(b3, this.f8731e * 2, mo16292d()), this.f8728b, this.f8730d, this.f8729c);
                }
            }
            throw C4619m.f8685i;
        }
        throw C4619m.f8685i;
    }

    /* renamed from: c */
    public final int mo16291c(C4635a aVar, C4635a aVar2) {
        float I = C1960d.m2719I(aVar.f8733a, aVar.f8734b, aVar2.f8733a, aVar2.f8734b);
        int i = aVar2.f8733a;
        int i2 = aVar.f8733a;
        float f = ((float) (i - i2)) / I;
        int i3 = aVar2.f8734b;
        int i4 = aVar.f8734b;
        float f2 = ((float) (i3 - i4)) / I;
        float f3 = (float) i2;
        float f4 = (float) i4;
        boolean b = this.f8727a.mo16333b(i2, i4);
        int ceil = (int) Math.ceil((double) I);
        boolean z = false;
        int i5 = 0;
        for (int i6 = 0; i6 < ceil; i6++) {
            f3 += f;
            f4 += f2;
            if (this.f8727a.mo16333b(C1960d.m2711F0(f3), C1960d.m2711F0(f4)) != b) {
                i5++;
            }
        }
        float f5 = ((float) i5) / I;
        if (f5 > 0.1f && f5 < 0.9f) {
            return 0;
        }
        if (f5 <= 0.1f) {
            z = true;
        }
        return z == b ? 1 : -1;
    }

    /* renamed from: d */
    public final int mo16292d() {
        if (this.f8728b) {
            return (this.f8729c * 4) + 11;
        }
        int i = this.f8729c;
        if (i <= 4) {
            return (i * 4) + 15;
        }
        return ((((i - 4) / 8) + 1) * 2) + (i * 4) + 15;
    }

    /* renamed from: e */
    public final C4635a mo16293e(C4635a aVar, boolean z, int i, int i2) {
        int i3 = aVar.f8733a + i;
        int i4 = aVar.f8734b;
        while (true) {
            i4 += i2;
            if (!mo16294f(i3, i4) || this.f8727a.mo16333b(i3, i4) != z) {
                int i5 = i3 - i;
                int i6 = i4 - i2;
            } else {
                i3 += i;
            }
        }
        int i52 = i3 - i;
        int i62 = i4 - i2;
        while (mo16294f(i52, i62) && this.f8727a.mo16333b(i52, i62) == z) {
            i52 += i;
        }
        int i7 = i52 - i;
        while (mo16294f(i7, i62) && this.f8727a.mo16333b(i7, i62) == z) {
            i62 += i2;
        }
        return new C4635a(i7, i62 - i2);
    }

    /* renamed from: f */
    public final boolean mo16294f(int i, int i2) {
        if (i < 0) {
            return false;
        }
        C4658b bVar = this.f8727a;
        return i < bVar.f8787g && i2 > 0 && i2 < bVar.f8788h;
    }

    /* renamed from: g */
    public final boolean mo16295g(C4625s sVar) {
        return mo16294f(C1960d.m2711F0(sVar.f8708a), C1960d.m2711F0(sVar.f8709b));
    }

    /* renamed from: h */
    public final int mo16296h(C4625s sVar, C4625s sVar2, int i) {
        float H = C1960d.m2716H(sVar.f8708a, sVar.f8709b, sVar2.f8708a, sVar2.f8709b);
        float f = H / ((float) i);
        float f2 = sVar.f8708a;
        float f3 = sVar.f8709b;
        float f4 = ((sVar2.f8708a - f2) * f) / H;
        float f5 = ((sVar2.f8709b - f3) * f) / H;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f6 = (float) i3;
            if (this.f8727a.mo16333b(C1960d.m2711F0((f6 * f4) + f2), C1960d.m2711F0((f6 * f5) + f3))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }
}
