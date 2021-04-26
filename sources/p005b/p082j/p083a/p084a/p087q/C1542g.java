package p005b.p082j.p083a.p084a.p087q;

import com.airbnb.lottie.utils.Utils;

/* renamed from: b.j.a.a.q.g */
public final class C1542g {

    /* renamed from: a */
    public static final String f2468a = String.valueOf(Integer.MIN_VALUE);

    /* renamed from: b */
    public static final String f2469b = String.valueOf(Long.MIN_VALUE);

    /* renamed from: c */
    public static final int[] f2470c = new int[1000];

    static {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                int i4 = 0;
                while (i4 < 10) {
                    f2470c[i] = ((i2 + 48) << 16) | ((i3 + 48) << 8) | (i4 + 48);
                    i4++;
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public static int m1860a(int i, byte[] bArr, int i2) {
        int i3 = f2470c[i];
        int i4 = i2 + 1;
        bArr[i2] = (byte) (i3 >> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i3 >> 8);
        int i6 = i5 + 1;
        bArr[i5] = (byte) i3;
        return i6;
    }

    /* renamed from: b */
    public static int m1861b(int i, byte[] bArr, int i2) {
        int i3 = f2470c[i];
        if (i > 9) {
            if (i > 99) {
                bArr[i2] = (byte) (i3 >> 16);
                i2++;
            }
            bArr[i2] = (byte) (i3 >> 8);
            i2++;
        }
        int i4 = i2 + 1;
        bArr[i2] = (byte) i3;
        return i4;
    }

    /* renamed from: c */
    public static int m1862c(int i, byte[] bArr, int i2) {
        int i3 = i / 1000;
        int i4 = i - (i3 * 1000);
        int i5 = i3 / 1000;
        int i6 = i3 - (i5 * 1000);
        int[] iArr = f2470c;
        int i7 = iArr[i5];
        int i8 = i2 + 1;
        bArr[i2] = (byte) (i7 >> 16);
        int i9 = i8 + 1;
        bArr[i8] = (byte) (i7 >> 8);
        int i10 = i9 + 1;
        bArr[i9] = (byte) i7;
        int i11 = iArr[i6];
        int i12 = i10 + 1;
        bArr[i10] = (byte) (i11 >> 16);
        int i13 = i12 + 1;
        bArr[i12] = (byte) (i11 >> 8);
        int i14 = i13 + 1;
        bArr[i13] = (byte) i11;
        int i15 = iArr[i4];
        int i16 = i14 + 1;
        bArr[i14] = (byte) (i15 >> 16);
        int i17 = i16 + 1;
        bArr[i16] = (byte) (i15 >> 8);
        int i18 = i17 + 1;
        bArr[i17] = (byte) i15;
        return i18;
    }

    /* renamed from: d */
    public static boolean m1863d(double d) {
        return Double.isNaN(d) || Double.isInfinite(d);
    }

    /* renamed from: e */
    public static boolean m1864e(float f) {
        return Float.isNaN(f) || Float.isInfinite(f);
    }

    /* renamed from: f */
    public static int m1865f(int i, byte[] bArr, int i2) {
        int i3;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                int length = f2468a.length();
                int i4 = 0;
                while (i4 < length) {
                    bArr[i2] = (byte) f2468a.charAt(i4);
                    i4++;
                    i2++;
                }
                return i2;
            }
            bArr[i2] = 45;
            i = -i;
            i2++;
        }
        if (i < 1000000) {
            if (i >= 1000) {
                int i5 = i / 1000;
                return m1860a(i - (i5 * 1000), bArr, m1861b(i5, bArr, i2));
            } else if (i >= 10) {
                return m1861b(i, bArr, i2);
            } else {
                int i6 = i2 + 1;
                bArr[i2] = (byte) (i + 48);
                return i6;
            }
        } else if (i >= 1000000000) {
            int i7 = i - Utils.SECOND_IN_NANOS;
            if (i7 >= 1000000000) {
                i7 -= Utils.SECOND_IN_NANOS;
                i3 = i2 + 1;
                bArr[i2] = 50;
            } else {
                i3 = i2 + 1;
                bArr[i2] = 49;
            }
            return m1862c(i7, bArr, i3);
        } else {
            int i8 = i / 1000;
            int i9 = i8 / 1000;
            return m1860a(i - (i8 * 1000), bArr, m1860a(i8 - (i9 * 1000), bArr, m1861b(i9, bArr, i2)));
        }
    }

    /* renamed from: g */
    public static int m1866g(long j, byte[] bArr, int i) {
        int i2;
        int i3;
        if (j < 0) {
            if (j > -2147483648L) {
                return m1865f((int) j, bArr, i);
            }
            if (j == Long.MIN_VALUE) {
                int length = f2469b.length();
                int i4 = 0;
                while (i4 < length) {
                    bArr[i] = (byte) f2469b.charAt(i4);
                    i4++;
                    i++;
                }
                return i;
            }
            bArr[i] = 45;
            j = -j;
            i++;
        } else if (j <= 2147483647L) {
            return m1865f((int) j, bArr, i);
        }
        long j2 = j / 1000000000;
        long j3 = j - (j2 * 1000000000);
        if (j2 < 1000000000) {
            int i5 = (int) j2;
            if (i5 >= 1000000) {
                int i6 = i5 / 1000;
                int i7 = i5 - (i6 * 1000);
                int i8 = i6 / 1000;
                int b = m1861b(i8, bArr, i);
                int[] iArr = f2470c;
                int i9 = iArr[i6 - (i8 * 1000)];
                int i10 = b + 1;
                bArr[b] = (byte) (i9 >> 16);
                int i11 = i10 + 1;
                bArr[i10] = (byte) (i9 >> 8);
                int i12 = i11 + 1;
                bArr[i11] = (byte) i9;
                int i13 = iArr[i7];
                int i14 = i12 + 1;
                bArr[i12] = (byte) (i13 >> 16);
                int i15 = i14 + 1;
                bArr[i14] = (byte) (i13 >> 8);
                i3 = i15 + 1;
                bArr[i15] = (byte) i13;
            } else if (i5 < 1000) {
                i2 = m1861b(i5, bArr, i);
            } else {
                int i16 = i5 / 1000;
                int i17 = i5 - (i16 * 1000);
                int[] iArr2 = f2470c;
                int i18 = iArr2[i16];
                if (i16 > 9) {
                    if (i16 > 99) {
                        bArr[i] = (byte) (i18 >> 16);
                        i++;
                    }
                    bArr[i] = (byte) (i18 >> 8);
                    i++;
                }
                int i19 = i + 1;
                bArr[i] = (byte) i18;
                int i20 = iArr2[i17];
                int i21 = i19 + 1;
                bArr[i19] = (byte) (i20 >> 16);
                int i22 = i21 + 1;
                bArr[i21] = (byte) (i20 >> 8);
                i3 = i22 + 1;
                bArr[i22] = (byte) i20;
            }
            i2 = i3;
        } else {
            long j4 = j2 / 1000000000;
            int b2 = m1861b((int) j4, bArr, i);
            i2 = m1862c((int) (j2 - (1000000000 * j4)), bArr, b2);
        }
        return m1862c((int) j3, bArr, i2);
    }
}
