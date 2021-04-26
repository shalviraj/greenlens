package p005b.p096l.p232f;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Array;
import p005b.p096l.p232f.p258y.C4657a;
import p005b.p096l.p232f.p258y.C4658b;
import p005b.p096l.p232f.p258y.C4664h;

/* renamed from: b.l.f.c */
public final class C4492c {

    /* renamed from: a */
    public final C4487b f8360a;

    /* renamed from: b */
    public C4658b f8361b;

    public C4492c(C4487b bVar) {
        this.f8360a = bVar;
    }

    /* renamed from: a */
    public C4658b mo16156a() {
        C4658b bVar;
        int i;
        int i2;
        C4492c cVar = this;
        if (cVar.f8361b == null) {
            C4664h hVar = (C4664h) cVar.f8360a;
            C4658b bVar2 = hVar.f8840d;
            if (bVar2 == null) {
                C4616j jVar = hVar.f8354a;
                int i3 = jVar.f8680a;
                int i4 = jVar.f8681b;
                if (i3 < 40 || i4 < 40) {
                    bVar = new C4658b(i3, i4);
                    hVar.mo16346b(i3);
                    int[] iArr = hVar.f8839c;
                    for (int i5 = 1; i5 < 5; i5++) {
                        byte[] b = jVar.mo16274b((i4 * i5) / 5, hVar.f8838b);
                        int i6 = (i3 << 2) / 5;
                        for (int i7 = i3 / 5; i7 < i6; i7++) {
                            int i8 = (b[i7] & ExifInterface.MARKER) >> 3;
                            iArr[i8] = iArr[i8] + 1;
                        }
                    }
                    int a = C4664h.m8587a(iArr);
                    byte[] a2 = jVar.mo16273a();
                    for (int i9 = 0; i9 < i4; i9++) {
                        int i10 = i9 * i3;
                        for (int i11 = 0; i11 < i3; i11++) {
                            if ((a2[i10 + i11] & ExifInterface.MARKER) < a) {
                                bVar.mo16339g(i11, i9);
                            }
                        }
                    }
                } else {
                    byte[] a3 = jVar.mo16273a();
                    int i12 = i3 >> 3;
                    if ((i3 & 7) != 0) {
                        i12++;
                    }
                    int i13 = i4 >> 3;
                    if ((i4 & 7) != 0) {
                        i13++;
                    }
                    int i14 = i4 - 8;
                    int i15 = i3 - 8;
                    int[] iArr2 = new int[2];
                    iArr2[1] = i12;
                    iArr2[0] = i13;
                    int[][] iArr3 = (int[][]) Array.newInstance(int.class, iArr2);
                    int i16 = 0;
                    while (true) {
                        int i17 = 8;
                        if (i16 >= i13) {
                            break;
                        }
                        int i18 = i16 << 3;
                        if (i18 > i14) {
                            i18 = i14;
                        }
                        int i19 = 0;
                        while (i19 < i12) {
                            int i20 = i19 << 3;
                            if (i20 > i15) {
                                i20 = i15;
                            }
                            int i21 = (i18 * i3) + i20;
                            int i22 = 0;
                            int i23 = 0;
                            byte b2 = ExifInterface.MARKER;
                            byte b3 = 0;
                            while (true) {
                                i = i18;
                                if (i22 >= i17) {
                                    break;
                                }
                                int i24 = i22;
                                byte b4 = b2;
                                byte b5 = b3;
                                int i25 = 0;
                                while (i25 < i17) {
                                    byte b6 = a3[i21 + i25] & ExifInterface.MARKER;
                                    i23 += b6;
                                    if (b6 < b4) {
                                        b4 = b6;
                                    }
                                    if (b6 > b5) {
                                        b5 = b6;
                                    }
                                    i25++;
                                    i17 = 8;
                                }
                                if (b5 - b4 > 24) {
                                    i2 = i24;
                                    while (true) {
                                        i2++;
                                        i21 += i3;
                                        if (i2 >= 8) {
                                            break;
                                        }
                                        int i26 = 0;
                                        for (int i27 = 8; i26 < i27; i27 = 8) {
                                            i23 += a3[i21 + i26] & ExifInterface.MARKER;
                                            i26++;
                                            b4 = b4;
                                        }
                                    }
                                    b2 = b4;
                                } else {
                                    b2 = b4;
                                    i2 = i24;
                                }
                                i22 = i2 + 1;
                                i21 += i3;
                                i17 = 8;
                                b3 = b5;
                                i18 = i;
                            }
                            int i28 = i23 >> 6;
                            byte b7 = b2;
                            if (b3 - b7 <= 24) {
                                i28 = b7 / 2;
                                if (i16 > 0 && i19 > 0) {
                                    int i29 = i16 - 1;
                                    int i30 = i19 - 1;
                                    int i31 = (((iArr3[i16][i30] * 2) + iArr3[i29][i19]) + iArr3[i29][i30]) / 4;
                                    if (b7 < i31) {
                                        i28 = i31;
                                    }
                                }
                            }
                            iArr3[i16][i19] = i28;
                            i19++;
                            i18 = i;
                            i17 = 8;
                        }
                        i16++;
                    }
                    bVar = new C4658b(i3, i4);
                    for (int i32 = 0; i32 < i13; i32++) {
                        int i33 = i32 << 3;
                        if (i33 > i14) {
                            i33 = i14;
                        }
                        int i34 = i13 - 3;
                        if (i32 < 2) {
                            i34 = 2;
                        } else if (i32 <= i34) {
                            i34 = i32;
                        }
                        int i35 = 0;
                        while (i35 < i12) {
                            int i36 = i35 << 3;
                            if (i36 > i15) {
                                i36 = i15;
                            }
                            int i37 = i12 - 3;
                            int i38 = 2;
                            if (i35 < 2) {
                                i37 = 2;
                            } else if (i35 <= i37) {
                                i37 = i35;
                            }
                            int i39 = i12;
                            int i40 = -2;
                            int i41 = 0;
                            while (i40 <= i38) {
                                int[] iArr4 = iArr3[i34 + i40];
                                i41 = iArr4[i37 - 2] + iArr4[i37 - 1] + iArr4[i37] + iArr4[i37 + 1] + iArr4[i37 + 2] + i41;
                                i40++;
                                i38 = 2;
                            }
                            int i42 = i38;
                            int i43 = i41 / 25;
                            int i44 = (i33 * i3) + i36;
                            int i45 = i34;
                            int i46 = 8;
                            int i47 = 0;
                            while (i47 < i46) {
                                int i48 = i13;
                                int i49 = 0;
                                while (i49 < i46) {
                                    byte[] bArr = a3;
                                    if ((a3[i44 + i49] & ExifInterface.MARKER) <= i43) {
                                        bVar.mo16339g(i36 + i49, i33 + i47);
                                    }
                                    i49++;
                                    a3 = bArr;
                                    i46 = 8;
                                }
                                byte[] bArr2 = a3;
                                i47++;
                                i44 += i3;
                                i13 = i48;
                                i46 = 8;
                            }
                            byte[] bArr3 = a3;
                            int i50 = i13;
                            i35++;
                            i34 = i45;
                            i12 = i39;
                        }
                        byte[] bArr4 = a3;
                        int i51 = i12;
                        int i52 = i13;
                    }
                }
                hVar.f8840d = bVar;
                bVar2 = hVar.f8840d;
            }
            cVar = this;
            cVar.f8361b = bVar2;
        }
        return cVar.f8361b;
    }

    /* renamed from: b */
    public C4657a mo16157b(int i, C4657a aVar) {
        int i2;
        C4664h hVar = (C4664h) this.f8360a;
        C4616j jVar = hVar.f8354a;
        int i3 = jVar.f8680a;
        if (aVar.f8786h < i3) {
            aVar = new C4657a(i3);
        } else {
            int length = aVar.f8785g.length;
            for (int i4 = 0; i4 < length; i4++) {
                aVar.f8785g[i4] = 0;
            }
        }
        hVar.mo16346b(i3);
        byte[] b = jVar.mo16274b(i, hVar.f8838b);
        int[] iArr = hVar.f8839c;
        int i5 = 0;
        while (true) {
            i2 = 1;
            if (i5 >= i3) {
                break;
            }
            int i6 = (b[i5] & ExifInterface.MARKER) >> 3;
            iArr[i6] = iArr[i6] + 1;
            i5++;
        }
        int a = C4664h.m8587a(iArr);
        if (i3 < 3) {
            for (int i7 = 0; i7 < i3; i7++) {
                if ((b[i7] & ExifInterface.MARKER) < a) {
                    aVar.mo16330l(i7);
                }
            }
        } else {
            byte b2 = b[0] & ExifInterface.MARKER;
            byte b3 = b[1] & ExifInterface.MARKER;
            while (i2 < i3 - 1) {
                int i8 = i2 + 1;
                byte b4 = b[i8] & ExifInterface.MARKER;
                if ((((b3 << 2) - b2) - b4) / 2 < a) {
                    aVar.mo16330l(i2);
                }
                b2 = b3;
                i2 = i8;
                b3 = b4;
            }
        }
        return aVar;
    }

    public String toString() {
        try {
            return mo16156a().toString();
        } catch (C4619m unused) {
            return "";
        }
    }
}
